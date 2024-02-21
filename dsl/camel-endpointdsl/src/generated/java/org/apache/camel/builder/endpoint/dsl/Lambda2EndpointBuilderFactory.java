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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage and invoke AWS Lambda functions.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Lambda2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Lambda component.
     */
    public interface Lambda2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLambda2EndpointBuilder advanced() {
            return (AdvancedLambda2EndpointBuilder) this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.lambda.Lambda2Operations&lt;/code&gt; type.
         * 
         * Default: invokeFunction
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder operation(
                org.apache.camel.component.aws2.lambda.Lambda2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.lambda.Lambda2Operations&lt;/code&gt; type.
         * 
         * Default: invokeFunction
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * The region in which the Lambda client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example, ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Lambda client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Lambda client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Lambda client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * If using a profile credentials provider, this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder profileCredentialsName(
                String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Amazon AWS Session Token used when the user needs to assume an IAM
         * role.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sessionToken the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder sessionToken(String sessionToken) {
            doSetProperty("sessionToken", sessionToken);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Lambda client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Lambda client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Lambda client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Lambda client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder useProfileCredentialsProvider(
                String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Lambda client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Lambda.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder useSessionCredentials(
                boolean useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
        /**
         * Set whether the Lambda client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Lambda.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder useSessionCredentials(
                String useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Lambda component.
     */
    public interface AdvancedLambda2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Lambda2EndpointBuilder basic() {
            return (Lambda2EndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedLambda2EndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedLambda2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use an existing configured AwsLambdaClient client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.lambda.LambdaClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsLambdaClient the value to set
         * @return the dsl builder
         */
        default AdvancedLambda2EndpointBuilder awsLambdaClient(
                software.amazon.awssdk.services.lambda.LambdaClient awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
            return this;
        }
        /**
         * To use an existing configured AwsLambdaClient client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.lambda.LambdaClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsLambdaClient the value to set
         * @return the dsl builder
         */
        default AdvancedLambda2EndpointBuilder awsLambdaClient(
                String awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
            return this;
        }
    }

    public interface Lambda2Builders {
        /**
         * AWS Lambda (camel-aws2-lambda)
         * Manage and invoke AWS Lambda functions.
         * 
         * Category: cloud,serverless
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-lambda
         * 
         * @return the dsl builder for the headers' name.
         */
        default Lambda2HeaderNameBuilder aws2Lambda() {
            return Lambda2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS Lambda (camel-aws2-lambda)
         * Manage and invoke AWS Lambda functions.
         * 
         * Category: cloud,serverless
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-lambda
         * 
         * Syntax: <code>aws2-lambda:function</code>
         * 
         * Path parameter: function (required)
         * Name of the Lambda function.
         * 
         * @param path function
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder aws2Lambda(String path) {
            return Lambda2EndpointBuilderFactory.endpointBuilder("aws2-lambda", path);
        }
        /**
         * AWS Lambda (camel-aws2-lambda)
         * Manage and invoke AWS Lambda functions.
         * 
         * Category: cloud,serverless
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-lambda
         * 
         * Syntax: <code>aws2-lambda:function</code>
         * 
         * Path parameter: function (required)
         * Name of the Lambda function.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path function
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder aws2Lambda(
                String componentName,
                String path) {
            return Lambda2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS Lambda component.
     */
    public static class Lambda2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final Lambda2HeaderNameBuilder INSTANCE = new Lambda2HeaderNameBuilder();

        /**
         * The operation we want to perform. Override operation passed as query
         * parameter.
         * 
         * The option is a: {@code String} type.
         * 
         * Required: true
         * Group: all
         * 
         * @return the name of the header {@code AwsLambdaOperation}.
         */
        public String awsLambdaOperation() {
            return "CamelAwsLambdaOperation";
        }

        /**
         * Amazon S3 bucket name where the .zip file containing your deployment
         * package is stored. This bucket must reside in the same AWS region
         * where you are creating the Lambda function.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaS3Bucket}.
         */
        public String awsLambdaS3Bucket() {
            return "CamelAwsLambdaS3Bucket";
        }

        /**
         * The Amazon S3 object (the deployment package) key name you want to
         * upload.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaS3Key}.
         */
        public String awsLambdaS3Key() {
            return "CamelAwsLambdaS3Key";
        }

        /**
         * The Amazon S3 object (the deployment package) version you want to
         * upload.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaS3ObjectVersion}.
         */
        public String awsLambdaS3ObjectVersion() {
            return "CamelAwsLambdaS3ObjectVersion";
        }

        /**
         * The local path of the zip file (the deployment package). Content of
         * zip file can also be put in Message body.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaZipFile}.
         */
        public String awsLambdaZipFile() {
            return "CamelAwsLambdaZipFile";
        }

        /**
         * The user-provided description.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaDescription}.
         */
        public String awsLambdaDescription() {
            return "CamelAwsLambdaDescription";
        }

        /**
         * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
         * when it executes your function to access any other Amazon Web
         * Services (AWS) resources.
         * 
         * The option is a: {@code String} type.
         * 
         * Required: true
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaRole}.
         */
        public String awsLambdaRole() {
            return "CamelAwsLambdaRole";
        }

        /**
         * The runtime environment for the Lambda function you are uploading.
         * (nodejs, nodejs4.3, nodejs6.10, java8, python2.7, python3.6,
         * dotnetcore1.0, odejs4.3-edge).
         * 
         * The option is a: {@code String} type.
         * 
         * Required: true
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaRuntime}.
         */
        public String awsLambdaRuntime() {
            return "CamelAwsLambdaRuntime";
        }

        /**
         * The function within your code that Lambda calls to begin execution.
         * For Node.js, it is the module-name.export value in your function. For
         * Java, it can be package.class-name::handler or package.class-name.
         * 
         * The option is a: {@code String} type.
         * 
         * Required: true
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaHandler}.
         */
        public String awsLambdaHandler() {
            return "CamelAwsLambdaHandler";
        }

        /**
         * The parent object that contains the target ARN (Amazon Resource Name)
         * of an Amazon SQS queue or Amazon SNS topic.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaTargetArn}.
         */
        public String awsLambdaTargetArn() {
            return "CamelAwsLambdaTargetArn";
        }

        /**
         * The memory size, in MB, you configured for the function. Must be a
         * multiple of 64 MB.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaMemorySize}.
         */
        public String awsLambdaMemorySize() {
            return "CamelAwsLambdaMemorySize";
        }

        /**
         * The Amazon Resource Name (ARN) of the KMS key used to encrypt your
         * function's environment variables. If not provided, AWS Lambda will
         * use a default service key.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaKMSKeyArn}.
         */
        public String awsLambdaKMSKeyArn() {
            return "CamelAwsLambdaKMSKeyArn";
        }

        /**
         * The key-value pairs that represent your environment's configuration
         * settings.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaEnvironmentVariables}.
         */
        public String awsLambdaEnvironmentVariables() {
            return "CamelAwsLambdaEnvironmentVariables";
        }

        /**
         * This boolean parameter can be used to request AWS Lambda to create
         * the Lambda function and publish a version as an atomic operation.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: createFunction updateFunction
         * 
         * @return the name of the header {@code AwsLambdaPublish}.
         */
        public String awsLambdaPublish() {
            return "CamelAwsLambdaPublish";
        }

        /**
         * The function execution time at which Lambda should terminate the
         * function. The default is 3 seconds.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaTimeout}.
         */
        public String awsLambdaTimeout() {
            return "CamelAwsLambdaTimeout";
        }

        /**
         * The list of tags (key-value pairs) assigned to the new function.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaTags}.
         */
        public String awsLambdaTags() {
            return "CamelAwsLambdaTags";
        }

        /**
         * Your function's tracing settings (Active or PassThrough).
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaTracingConfig}.
         */
        public String awsLambdaTracingConfig() {
            return "CamelAwsLambdaTracingConfig";
        }

        /**
         * If your Lambda function accesses resources in a VPC, a list of one or
         * more security groups IDs in your VPC.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaSecurityGroupIds}.
         */
        public String awsLambdaSecurityGroupIds() {
            return "CamelAwsLambdaSecurityGroupIds";
        }

        /**
         * If your Lambda function accesses resources in a VPC, a list of one or
         * more subnet IDs in your VPC.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: createFunction
         * 
         * @return the name of the header {@code AwsLambdaSubnetIds}.
         */
        public String awsLambdaSubnetIds() {
            return "CamelAwsLambdaSubnetIds";
        }

        /**
         * The Amazon Resource Name (ARN) of the event source.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createEventSourceMapping
         * 
         * @return the name of the header {@code AwsLambdaEventSourceArn}.
         */
        public String awsLambdaEventSourceArn() {
            return "CamelAwsLambdaEventSourceArn";
        }

        /**
         * The maximum number of records in each batch that Lambda pulls from
         * your stream or queue and sends to your function.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: createEventSourceMapping
         * 
         * @return the name of the header {@code AwsLambdaEventSourceBatchSize}.
         */
        public String awsLambdaEventSourceBatchSize() {
            return "CamelAwsLambdaEventSourceBatchSize";
        }

        /**
         * The identifier of the event source mapping.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: deleteEventSourceMapping
         * 
         * @return the name of the header {@code AwsLambdaEventSourceUuid}.
         */
        public String awsLambdaEventSourceUuid() {
            return "CamelAwsLambdaEventSourceUuid";
        }

        /**
         * The function's Amazon Resource Name (ARN).
         * 
         * The option is a: {@code String} type.
         * 
         * Group: listTags tagResource untagResource
         * 
         * @return the name of the header {@code AwsLambdaResourceArn}.
         */
        public String awsLambdaResourceArn() {
            return "CamelAwsLambdaResourceArn";
        }

        /**
         * A list of tags to apply to the function.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: tagResource
         * 
         * @return the name of the header {@code AwsLambdaResourceTags}.
         */
        public String awsLambdaResourceTags() {
            return "CamelAwsLambdaResourceTags";
        }

        /**
         * A list of tag keys to remove from the function.
         * 
         * The option is a: {@code List<String>} type.
         * 
         * Group: untagResource
         * 
         * @return the name of the header {@code AwsLambdaResourceTagKeys}.
         */
        public String awsLambdaResourceTagKeys() {
            return "CamelAwsLambdaResourceTagKeys";
        }

        /**
         * A description for the version to override the description in the
         * function configuration.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: publishVersion
         * 
         * @return the name of the header {@code AwsLambdaVersionDescription}.
         */
        public String awsLambdaVersionDescription() {
            return "CamelAwsLambdaVersionDescription";
        }

        /**
         * Only update the function if the revision ID matches the ID that's
         * specified.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: publishVersion
         * 
         * @return the name of the header {@code AwsLambdaVersionRevisionId}.
         */
        public String awsLambdaVersionRevisionId() {
            return "CamelAwsLambdaVersionRevisionId";
        }

        /**
         * The function version to set in the alias.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createAlias listAliases
         * 
         * @return the name of the header {@code AwsLambdaFunctionVersion}.
         */
        public String awsLambdaFunctionVersion() {
            return "CamelAwsLambdaFunctionVersion";
        }

        /**
         * The function name of the alias.
         * 
         * The option is a: {@code String} type.
         * 
         * Required: true
         * Group: createAlias deleteAlias getAlias
         * 
         * @return the name of the header {@code AwsLambdaAliasFunctionName}.
         */
        public String awsLambdaAliasFunctionName() {
            return "CamelAwsLambdaAliasFunctionName";
        }

        /**
         * The function description to set in the alias.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: createAlias
         * 
         * @return the name of the header {@code
         * AwsLambdaAliasFunctionDescription}.
         */
        public String awsLambdaAliasFunctionDescription() {
            return "CamelAwsLambdaAliasFunctionDescription";
        }
    }
    static Lambda2EndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class Lambda2EndpointBuilderImpl extends AbstractEndpointBuilder implements Lambda2EndpointBuilder, AdvancedLambda2EndpointBuilder {
            public Lambda2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Lambda2EndpointBuilderImpl(path);
    }
}