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

import java.util.List;
import java.util.concurrent.ExecutorService;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.util.ReflectionHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipientListParallelTimeoutTest extends ContextTestSupport {

    @Test
    public void testRecipientListParallelTimeout() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        // A will timeout so we only get B and/or C
        mock.message(0).body().not(body().contains("A"));

        template.sendBodyAndHeader("direct:start", "Hello", "slip", "direct:a,direct:b,direct:c");

        assertMockEndpointsSatisfied();

        // make sure that the thread pool will be shutdown
        List<Processor> list = getProcessors("foo");
        RecipientList rl = (RecipientList) list.get(0);
        assertNotNull(rl);

        Object pc = ReflectionHelper.getField(rl.getClass().getDeclaredField("aggregateExecutorService"), rl);
        assertNotNull(pc);
        ExecutorService es = assertIsInstanceOf(ExecutorService.class, pc);

        assertFalse(es.isShutdown());

        // now stop camel and ensure the thread pool is stopped
        context.stop();
        assertTrue(es.isShutdown());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").recipientList(header("slip")).aggregationStrategy(new AggregationStrategy() {
                    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                        if (oldExchange == null) {
                            return newExchange;
                        }

                        String body = oldExchange.getIn().getBody(String.class);
                        oldExchange.getIn().setBody(body + newExchange.getIn().getBody(String.class));
                        return oldExchange;
                    }
                }).parallelProcessing().timeout(500).id("foo").to("mock:result");

                from("direct:a").delay(1000).setBody(constant("A"));

                from("direct:b").setBody(constant("B"));

                from("direct:c").delay(100).setBody(constant("C"));
            }
        };
    }
}
