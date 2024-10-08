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
package org.apache.camel.component.as2.api;

import java.util.Optional;

interface Constants {
    String SHA_1_AS2_ALGORITHM_NAME = "sha1";
    String SHA_256_AS2_ALGORITHM_NAME = "sha256";
    String SHA_384_AS2_ALGORITHM_NAME = "sha384";
    String SHA_512_AS2_ALGORITHM_NAME = "sha512";
    String SHA_1_JDK_ALGORITHM_NAME = "SHA-1";
    String SHA_256_JDK_ALGORITHM_NAME = "SHA-256";
    String SHA_384_JDK_ALGORITHM_NAME = "SHA-384";
    String SHA_512_JDK_ALGORITHM_NAME = "SHA-512";

    String MD5_AS2_ALGORITHM_NAME = "md5";
    String MD5_JDK_ALGORITHM_NAME = "MD5";
}

public enum AS2MicAlgorithm {
    SHA_1(Constants.SHA_1_JDK_ALGORITHM_NAME, Constants.SHA_1_AS2_ALGORITHM_NAME),
    SHA_256(Constants.SHA_256_JDK_ALGORITHM_NAME, Constants.SHA_256_AS2_ALGORITHM_NAME),
    SHA_384(Constants.SHA_384_JDK_ALGORITHM_NAME, Constants.SHA_384_AS2_ALGORITHM_NAME),
    SHA_512(Constants.SHA_512_JDK_ALGORITHM_NAME, Constants.SHA_512_AS2_ALGORITHM_NAME),
    MD5(Constants.MD5_JDK_ALGORITHM_NAME, Constants.MD5_AS2_ALGORITHM_NAME);

    private final String jdkAlgorithmName;
    private final String as2AlgorithmName;

    private AS2MicAlgorithm(String jdkAlgorithmName, String as2AlgorithmName) {
        this.jdkAlgorithmName = jdkAlgorithmName;
        this.as2AlgorithmName = as2AlgorithmName;
    }

    public String getJdkAlgorithmName() {
        return jdkAlgorithmName;
    }

    public String getAs2AlgorithmName() {
        return as2AlgorithmName;
    }

    public static String getJdkAlgorithmName(String as2AlgorithmName) {
        return Optional.ofNullable(as2AlgorithmName)
                .map(alg -> alg.replaceAll("-", ""))
                .map(alg -> switch (alg) {
                    case Constants.MD5_AS2_ALGORITHM_NAME -> Constants.MD5_JDK_ALGORITHM_NAME;
                    case Constants.SHA_1_AS2_ALGORITHM_NAME -> Constants.SHA_1_JDK_ALGORITHM_NAME;
                    case Constants.SHA_256_AS2_ALGORITHM_NAME -> Constants.SHA_256_JDK_ALGORITHM_NAME;
                    case Constants.SHA_384_AS2_ALGORITHM_NAME -> Constants.SHA_384_JDK_ALGORITHM_NAME;
                    case Constants.SHA_512_AS2_ALGORITHM_NAME -> Constants.SHA_512_JDK_ALGORITHM_NAME;
                    default -> null;
                })
                .orElse(null);
    }

    public static String getAS2AlgorithmName(String jdkAlgorithmName) {
        return Optional.ofNullable(jdkAlgorithmName)
                .map(alg -> switch (alg) {
                    case Constants.MD5_JDK_ALGORITHM_NAME -> Constants.MD5_AS2_ALGORITHM_NAME;
                    case Constants.SHA_1_JDK_ALGORITHM_NAME -> Constants.SHA_1_AS2_ALGORITHM_NAME;
                    case Constants.SHA_256_JDK_ALGORITHM_NAME -> Constants.SHA_256_AS2_ALGORITHM_NAME;
                    case Constants.SHA_384_JDK_ALGORITHM_NAME -> Constants.SHA_384_AS2_ALGORITHM_NAME;
                    case Constants.SHA_512_JDK_ALGORITHM_NAME -> Constants.SHA_512_AS2_ALGORITHM_NAME;
                    default -> null;
                })
                .orElse(null);
    }

}
