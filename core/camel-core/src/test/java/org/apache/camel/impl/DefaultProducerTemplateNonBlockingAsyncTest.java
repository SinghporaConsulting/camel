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
package org.apache.camel.impl;

import java.util.concurrent.CompletableFuture;

import org.apache.camel.Exchange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@Timeout(20)
public class DefaultProducerTemplateNonBlockingAsyncTest extends DefaultProducerTemplateAsyncTest {
    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
        template.stop();
        template.setThreadedAsyncMode(false);
        template.start();
    }

    @Test
    @Override
    public void testSendAsyncProcessor() {
        // noop
    }

    @Test
    public void testRunningInSameThread() {
        Thread originalThread = Thread.currentThread();
        CompletableFuture<Exchange> future = template.asyncSend("direct:echo", e -> {
            assertSame(originalThread, Thread.currentThread());
            e.getIn().setBody("Hi");
        });
        assertEquals("HiHi", template.extractFutureBody(future, String.class));
    }
}
