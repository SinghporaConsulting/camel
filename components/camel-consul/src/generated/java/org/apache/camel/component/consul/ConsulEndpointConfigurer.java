/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ConsulEndpoint target = (ConsulEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": target.getConfiguration().setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": target.getConfiguration().setBlockSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "consistencymode":
        case "consistencyMode": target.getConfiguration().setConsistencyMode(property(camelContext, org.kiwiproject.consul.option.ConsistencyMode.class, value)); return true;
        case "consulclient":
        case "consulClient": target.getConfiguration().setConsulClient(property(camelContext, org.kiwiproject.consul.Consul.class, value)); return true;
        case "datacenter": target.getConfiguration().setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "firstindex":
        case "firstIndex": target.getConfiguration().setFirstIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nearnode":
        case "nearNode": target.getConfiguration().setNearNode(property(camelContext, java.lang.String.class, value)); return true;
        case "nodemeta":
        case "nodeMeta": target.getConfiguration().setNodeMeta(property(camelContext, java.util.List.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pinginstance":
        case "pingInstance": target.getConfiguration().setPingInstance(property(camelContext, boolean.class, value)); return true;
        case "readtimeout":
        case "readTimeout": target.getConfiguration().setReadTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "tags": target.getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "url": target.getConfiguration().setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "valueasstring":
        case "valueAsString": target.getConfiguration().setValueAsString(property(camelContext, boolean.class, value)); return true;
        case "writetimeout":
        case "writeTimeout": target.getConfiguration().setWriteTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return java.lang.String.class;
        case "action": return java.lang.String.class;
        case "blockseconds":
        case "blockSeconds": return java.lang.Integer.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "connecttimeout":
        case "connectTimeout": return java.time.Duration.class;
        case "consistencymode":
        case "consistencyMode": return org.kiwiproject.consul.option.ConsistencyMode.class;
        case "consulclient":
        case "consulClient": return org.kiwiproject.consul.Consul.class;
        case "datacenter": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "firstindex":
        case "firstIndex": return java.math.BigInteger.class;
        case "key": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "nearnode":
        case "nearNode": return java.lang.String.class;
        case "nodemeta":
        case "nodeMeta": return java.util.List.class;
        case "password": return java.lang.String.class;
        case "pinginstance":
        case "pingInstance": return boolean.class;
        case "readtimeout":
        case "readTimeout": return java.time.Duration.class;
        case "recursive": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "tags": return java.lang.String.class;
        case "url": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "valueasstring":
        case "valueAsString": return boolean.class;
        case "writetimeout":
        case "writeTimeout": return java.time.Duration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ConsulEndpoint target = (ConsulEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return target.getConfiguration().getAclToken();
        case "action": return target.getConfiguration().getAction();
        case "blockseconds":
        case "blockSeconds": return target.getConfiguration().getBlockSeconds();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "consistencymode":
        case "consistencyMode": return target.getConfiguration().getConsistencyMode();
        case "consulclient":
        case "consulClient": return target.getConfiguration().getConsulClient();
        case "datacenter": return target.getConfiguration().getDatacenter();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "firstindex":
        case "firstIndex": return target.getConfiguration().getFirstIndex();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nearnode":
        case "nearNode": return target.getConfiguration().getNearNode();
        case "nodemeta":
        case "nodeMeta": return target.getConfiguration().getNodeMeta();
        case "password": return target.getConfiguration().getPassword();
        case "pinginstance":
        case "pingInstance": return target.getConfiguration().isPingInstance();
        case "readtimeout":
        case "readTimeout": return target.getConfiguration().getReadTimeout();
        case "recursive": return target.getConfiguration().isRecursive();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "tags": return target.getConfiguration().getTags();
        case "url": return target.getConfiguration().getUrl();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        case "valueasstring":
        case "valueAsString": return target.getConfiguration().isValueAsString();
        case "writetimeout":
        case "writeTimeout": return target.getConfiguration().getWriteTimeout();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "nodemeta":
        case "nodeMeta": return java.lang.String.class;
        default: return null;
        }
    }
}

