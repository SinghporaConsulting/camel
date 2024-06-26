/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;

@Isolated("Short timeouts cause problems with parallel text execution")
public class MulticastParallelTimeoutTest extends ContextTestSupport {

    @Test
    public void testMulticastParallelTimeout() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        // A will timeout so we only get B and/or C
        mock.message(0).body().not(body().contains("A"));

        getMockEndpoint("mock:A").expectedMessageCount(0);
        getMockEndpoint("mock:B").expectedMessageCount(1);
        getMockEndpoint("mock:C").expectedMessageCount(1);

        template.sendBody("direct:start", "Hello");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // START SNIPPET: e1
                from("direct:start").multicast(new AggregationStrategy() {
                    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                        if (oldExchange == null) {
                            return newExchange;
                        }

                        String body = oldExchange.getIn().getBody(String.class);
                        oldExchange.getIn().setBody(body + newExchange.getIn().getBody(String.class));
                        return oldExchange;
                    }
                }).parallelProcessing().timeout(250).to("direct:a", "direct:b", "direct:c")
                        // use end to indicate end of multicast route
                        .end().to("mock:result");

                from("direct:a").delay(1000).to("mock:A").setBody(constant("A"));

                from("direct:b").to("mock:B").setBody(constant("B"));

                from("direct:c").to("mock:C").setBody(constant("C"));
                // END SNIPPET: e1
            }
        };
    }
}
