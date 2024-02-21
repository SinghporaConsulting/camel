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
package org.apache.camel.component.netty.http;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

public class NettyHttpProducerHttpPathTest extends BaseNettyTest {

    @Test
    public void testEmptyPathDoesNotEndsWithSlash() throws Exception {
        MockEndpoint input = getMockEndpoint("mock:input");
        input.expectedBodiesReceived("Hello World");
        input.expectedHeaderReceived(Exchange.HTTP_PATH, "");
        input.expectedHeaderReceived(Exchange.HTTP_URI, "/foo");

        template.request("netty-http:http://localhost:{{port}}/foo", exchange -> {
            Message in = exchange.getIn();
            in.setBody("Hello World");
            in.setHeader(Exchange.HTTP_PATH, "");
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Test
    public void testNonEmptyPathDoesNotEndsWithSlash() throws Exception {
        MockEndpoint input = getMockEndpoint("mock:input");
        input.expectedBodiesReceived("Hello World");
        input.expectedHeaderReceived(Exchange.HTTP_PATH, "/bar");
        input.expectedHeaderReceived(Exchange.HTTP_URI, "/foo/bar");

        template.request("netty-http:http://localhost:{{port}}/foo", exchange -> {
            Message in = exchange.getIn();
            in.setBody("Hello World");
            in.setHeader(Exchange.HTTP_PATH, "/bar");
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Test
    public void testNullPathDoesNotEndsWithSlash() throws Exception {
        MockEndpoint input = getMockEndpoint("mock:input");
        input.expectedBodiesReceived("Hello World");
        input.expectedHeaderReceived(Exchange.HTTP_PATH, "");
        input.expectedHeaderReceived(Exchange.HTTP_URI, "/foo");

        template.request("netty-http:http://localhost:{{port}}/foo", exchange -> {
            Message in = exchange.getIn();
            in.setBody("Hello World");
            in.setHeader(Exchange.HTTP_PATH, null);
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Test
    public void testPathMustPreserveSlash() throws Exception {
        MockEndpoint input = getMockEndpoint("mock:input");
        input.expectedBodiesReceived("Hello World");
        input.expectedHeaderReceived(Exchange.HTTP_PATH, "/bar/");
        input.expectedHeaderReceived(Exchange.HTTP_URI, "/foo/bar/");

        template.request("netty-http:http://localhost:{{port}}/foo", exchange -> {
            Message in = exchange.getIn();
            in.setBody("Hello World");
            in.setHeader(Exchange.HTTP_PATH, "/bar/");
        });

        MockEndpoint.assertIsSatisfied(context);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("netty-http:http://localhost:{{port}}/foo?matchOnUriPrefix=true")
                        .to("mock:input")
                        .transform().constant("Bye World");
            }
        };
    }

}
