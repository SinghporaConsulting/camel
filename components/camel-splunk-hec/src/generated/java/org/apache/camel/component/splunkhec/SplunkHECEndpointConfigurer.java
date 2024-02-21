/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.splunkhec;

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
public class SplunkHECEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SplunkHECEndpoint target = (SplunkHECEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bodyonly":
        case "bodyOnly": target.getConfiguration().setBodyOnly(property(camelContext, boolean.class, value)); return true;
        case "headersonly":
        case "headersOnly": target.getConfiguration().setHeadersOnly(property(camelContext, boolean.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "https": target.getConfiguration().setHttps(property(camelContext, boolean.class, value)); return true;
        case "index": target.getConfiguration().setIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "skiptlsverify":
        case "skipTlsVerify": target.getConfiguration().setSkipTlsVerify(property(camelContext, boolean.class, value)); return true;
        case "source": target.getConfiguration().setSource(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcetype":
        case "sourceType": target.getConfiguration().setSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "splunkendpoint":
        case "splunkEndpoint": target.getConfiguration().setSplunkEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "time": target.getConfiguration().setTime(property(camelContext, java.lang.Long.class, value)); return true;
        case "token": target.getConfiguration().setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bodyonly":
        case "bodyOnly": return boolean.class;
        case "headersonly":
        case "headersOnly": return boolean.class;
        case "host": return java.lang.String.class;
        case "https": return boolean.class;
        case "index": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "skiptlsverify":
        case "skipTlsVerify": return boolean.class;
        case "source": return java.lang.String.class;
        case "sourcetype":
        case "sourceType": return java.lang.String.class;
        case "splunkendpoint":
        case "splunkEndpoint": return java.lang.String.class;
        case "time": return java.lang.Long.class;
        case "token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SplunkHECEndpoint target = (SplunkHECEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bodyonly":
        case "bodyOnly": return target.getConfiguration().isBodyOnly();
        case "headersonly":
        case "headersOnly": return target.getConfiguration().isHeadersOnly();
        case "host": return target.getConfiguration().getHost();
        case "https": return target.getConfiguration().isHttps();
        case "index": return target.getConfiguration().getIndex();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "skiptlsverify":
        case "skipTlsVerify": return target.getConfiguration().isSkipTlsVerify();
        case "source": return target.getConfiguration().getSource();
        case "sourcetype":
        case "sourceType": return target.getConfiguration().getSourceType();
        case "splunkendpoint":
        case "splunkEndpoint": return target.getConfiguration().getSplunkEndpoint();
        case "time": return target.getConfiguration().getTime();
        case "token": return target.getConfiguration().getToken();
        default: return null;
        }
    }
}

