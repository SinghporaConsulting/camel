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
package org.apache.camel.component.xslt;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class XsltMessageTerminateTest extends ContextTestSupport {

    @Test
    public void testXsltTerminate() throws Exception {
        getMockEndpoint("mock:result").expectedMessageCount(0);
        getMockEndpoint("mock:dead").expectedMessageCount(1);

        assertMockEndpointsSatisfied();

        Exchange out = getMockEndpoint("mock:dead").getReceivedExchanges().get(0);
        assertNotNull(out);
        // this exception is just a generic xslt error
        Exception cause = out.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        assertNotNull(cause);

        // we have the xsl termination message as a warning property on the
        // exchange
        Exception warning = out.getProperty(Exchange.XSLT_WARNING, Exception.class);
        assertNotNull(warning);
        assertEquals("Error: DOB is an empty string!", warning.getMessage());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                errorHandler(deadLetterChannel("mock:dead"));

                from("file:src/test/data/?fileName=terminate.xml&noop=true&initialDelay=0&delay=10")
                        .to("xslt:org/apache/camel/component/xslt/terminate.xsl").to("log:foo")
                        .to("mock:result");
            }
        };
    }
}
