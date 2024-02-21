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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.knative.KnativeComponent;

/**
 * Send and receive events from Knative.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface KnativeComponentBuilderFactory {

    /**
     * Knative (camel-knative)
     * Send and receive events from Knative.
     * 
     * Category: cloud
     * Since: 3.15
     * Maven coordinates: org.apache.camel:camel-knative
     * 
     * @return the dsl builder
     */
    static KnativeComponentBuilder knative() {
        return new KnativeComponentBuilderImpl();
    }

    /**
     * Builder for the Knative component.
     */
    interface KnativeComponentBuilder
            extends
                ComponentBuilder<KnativeComponent> {
        /**
         * CloudEvent headers to override.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder ceOverride(
                java.util.Map<java.lang.String, java.lang.String> ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * Set the version of the cloudevents spec.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 1.0
         * Group: common
         * 
         * @param cloudEventsSpecVersion the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder cloudEventsSpecVersion(
                java.lang.String cloudEventsSpecVersion) {
            doSetProperty("cloudEventsSpecVersion", cloudEventsSpecVersion);
            return this;
        }
        /**
         * Set the event-type information of the produced events.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: org.apache.camel.event
         * Group: common
         * 
         * @param cloudEventsType the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder cloudEventsType(
                java.lang.String cloudEventsType) {
            doSetProperty("cloudEventsType", cloudEventsType);
            return this;
        }
        /**
         * Set the configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.KnativeConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder configuration(
                org.apache.camel.component.knative.KnativeConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The protocol consumer factory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeConsumerFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param consumerFactory the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder consumerFactory(
                org.apache.camel.component.knative.spi.KnativeConsumerFactory consumerFactory) {
            doSetProperty("consumerFactory", consumerFactory);
            return this;
        }
        /**
         * The environment.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder environment(
                org.apache.camel.component.knative.spi.KnativeEnvironment environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * The path ot the environment definition.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environmentPath the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder environmentPath(
                java.lang.String environmentPath) {
            doSetProperty("environmentPath", environmentPath);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder filters(
                java.util.Map<java.lang.String, java.lang.String> filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * The protocol producer factory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeProducerFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param producerFactory the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder producerFactory(
                org.apache.camel.component.knative.spi.KnativeProducerFactory producerFactory) {
            doSetProperty("producerFactory", producerFactory);
            return this;
        }
        /**
         * The SinkBinding configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeSinkBinding&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param sinkBinding the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder sinkBinding(
                org.apache.camel.component.knative.spi.KnativeSinkBinding sinkBinding) {
            doSetProperty("sinkBinding", sinkBinding);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder transportOptions(
                java.util.Map<java.lang.String, java.lang.Object> transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
        /**
         * The name of the service to lookup from the KnativeEnvironment.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param typeId the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder typeId(java.lang.String typeId) {
            doSetProperty("typeId", typeId);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Transforms the reply into a cloud event that will be processed by the
         * caller. When listening to events from a Knative Broker, if this flag
         * is enabled, replies will be published to the same Broker where the
         * request comes from (beware that if you don't change the type of the
         * received message, you may create a loop and receive your same reply).
         * When this flag is disabled, CloudEvent headers are removed from the
         * reply.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param replyWithCloudEvent the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder replyWithCloudEvent(
                boolean replyWithCloudEvent) {
            doSetProperty("replyWithCloudEvent", replyWithCloudEvent);
            return this;
        }
        /**
         * If the consumer should construct a full reply to knative request.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer (advanced)
         * 
         * @param reply the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder reply(java.lang.Boolean reply) {
            doSetProperty("reply", reply);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The version of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder apiVersion(java.lang.String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The type of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param kind the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder kind(java.lang.String kind) {
            doSetProperty("kind", kind);
            return this;
        }
        /**
         * The name of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param name the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder name(java.lang.String name) {
            doSetProperty("name", name);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default KnativeComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class KnativeComponentBuilderImpl
            extends
                AbstractComponentBuilder<KnativeComponent>
            implements
                KnativeComponentBuilder {
        @Override
        protected KnativeComponent buildConcreteComponent() {
            return new KnativeComponent();
        }
        private org.apache.camel.component.knative.KnativeConfiguration getOrCreateConfiguration(
                org.apache.camel.component.knative.KnativeComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.knative.KnativeConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "ceOverride": getOrCreateConfiguration((KnativeComponent) component).setCeOverride((java.util.Map) value); return true;
            case "cloudEventsSpecVersion": getOrCreateConfiguration((KnativeComponent) component).setCloudEventsSpecVersion((java.lang.String) value); return true;
            case "cloudEventsType": getOrCreateConfiguration((KnativeComponent) component).setCloudEventsType((java.lang.String) value); return true;
            case "configuration": ((KnativeComponent) component).setConfiguration((org.apache.camel.component.knative.KnativeConfiguration) value); return true;
            case "consumerFactory": ((KnativeComponent) component).setConsumerFactory((org.apache.camel.component.knative.spi.KnativeConsumerFactory) value); return true;
            case "environment": getOrCreateConfiguration((KnativeComponent) component).setEnvironment((org.apache.camel.component.knative.spi.KnativeEnvironment) value); return true;
            case "environmentPath": ((KnativeComponent) component).setEnvironmentPath((java.lang.String) value); return true;
            case "filters": getOrCreateConfiguration((KnativeComponent) component).setFilters((java.util.Map) value); return true;
            case "producerFactory": ((KnativeComponent) component).setProducerFactory((org.apache.camel.component.knative.spi.KnativeProducerFactory) value); return true;
            case "sinkBinding": getOrCreateConfiguration((KnativeComponent) component).setSinkBinding((org.apache.camel.component.knative.spi.KnativeSinkBinding) value); return true;
            case "transportOptions": getOrCreateConfiguration((KnativeComponent) component).setTransportOptions((java.util.Map) value); return true;
            case "typeId": getOrCreateConfiguration((KnativeComponent) component).setTypeId((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((KnativeComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "replyWithCloudEvent": getOrCreateConfiguration((KnativeComponent) component).setReplyWithCloudEvent((boolean) value); return true;
            case "reply": getOrCreateConfiguration((KnativeComponent) component).setReply((java.lang.Boolean) value); return true;
            case "lazyStartProducer": ((KnativeComponent) component).setLazyStartProducer((boolean) value); return true;
            case "apiVersion": getOrCreateConfiguration((KnativeComponent) component).setApiVersion((java.lang.String) value); return true;
            case "autowiredEnabled": ((KnativeComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "kind": getOrCreateConfiguration((KnativeComponent) component).setKind((java.lang.String) value); return true;
            case "name": getOrCreateConfiguration((KnativeComponent) component).setName((java.lang.String) value); return true;
            case "healthCheckConsumerEnabled": ((KnativeComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((KnativeComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}