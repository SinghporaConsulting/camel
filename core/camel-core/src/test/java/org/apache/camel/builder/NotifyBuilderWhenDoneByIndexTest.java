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
package org.apache.camel.builder;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotifyBuilderWhenDoneByIndexTest extends ContextTestSupport {

    @Test
    public void testDoneByIndex() {
        final AtomicInteger counter = new AtomicInteger();
        getMockEndpoint("mock:split").whenAnyExchangeReceived(new Processor() {
            @Override
            public void process(Exchange exchange) {
                counter.incrementAndGet();
            }
        });

        // notify when the 1st exchange is done (by index)
        NotifyBuilder notify = new NotifyBuilder(context).whenDoneByIndex(0).create();

        assertFalse(notify.matches());

        template.sendBody("seda:foo", "A,B,C");

        assertTrue(notify.matchesWaitTime());

        assertEquals(3, counter.get());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("seda:foo").routeId("foo").delay(500).split(body().tokenize(",")).to("mock:split").end().to("mock:foo");
            }
        };
    }
}
