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
package org.apache.camel.component.kafka.consumer.support;

/**
 * Holds the result of processing one or more consumer records
 */
public final class ProcessingResult {

    private static final ProcessingResult UNPROCESSED_RESULT
            = new ProcessingResult(false, false);

    private final boolean breakOnErrorHit;
    private final boolean failed;
    private final String topic;
    private final int partition;
    private final long offset;

    /**
     * Constructs a new processing result
     *
     * @param breakOnErrorHit break on error hit setting
     * @param failed          whether processing has failed
     */
    public ProcessingResult(boolean breakOnErrorHit, boolean failed) {
        this(breakOnErrorHit, failed, null, 0, 0);
    }

    /**
     * Constructs a new processing result
     *
     * @param breakOnErrorHit break on error hit setting
     * @param failed          whether processing has failed
     * @param topic           the topic
     * @param partition       the partition of the topic
     * @param offset          the consumer offset
     */
    public ProcessingResult(boolean breakOnErrorHit, boolean failed, String topic, int partition, long offset) {
        this.breakOnErrorHit = breakOnErrorHit;
        this.failed = failed;
        this.topic = topic;
        this.partition = partition;
        this.offset = offset;
    }

    public boolean isBreakOnErrorHit() {
        return breakOnErrorHit;
    }

    public boolean isFailed() {
        return failed;
    }

    public String getTopic() {
        return topic;
    }

    public int getPartition() {
        return partition;
    }

    public long getOffset() {
        return offset;
    }

    public static ProcessingResult newUnprocessed() {
        return UNPROCESSED_RESULT;
    }
}
