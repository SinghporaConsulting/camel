/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.workday;

import javax.annotation.processing.Generated;
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
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class WorkdayEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WorkdayEndpoint target = (WorkdayEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientid":
        case "clientId": target.getWorkdayConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.getWorkdayConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.getWorkdayConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpconnectionmanager":
        case "httpConnectionManager": target.getWorkdayConfiguration().setHttpConnectionManager(property(camelContext, org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reportformat":
        case "reportFormat": target.getWorkdayConfiguration().setReportFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "tenant": target.getWorkdayConfiguration().setTenant(property(camelContext, java.lang.String.class, value)); return true;
        case "tokenrefresh":
        case "tokenRefresh": target.getWorkdayConfiguration().setTokenRefresh(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "host": return java.lang.String.class;
        case "httpconnectionmanager":
        case "httpConnectionManager": return org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "reportformat":
        case "reportFormat": return java.lang.String.class;
        case "tenant": return java.lang.String.class;
        case "tokenrefresh":
        case "tokenRefresh": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WorkdayEndpoint target = (WorkdayEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientid":
        case "clientId": return target.getWorkdayConfiguration().getClientId();
        case "clientsecret":
        case "clientSecret": return target.getWorkdayConfiguration().getClientSecret();
        case "host": return target.getWorkdayConfiguration().getHost();
        case "httpconnectionmanager":
        case "httpConnectionManager": return target.getWorkdayConfiguration().getHttpConnectionManager();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "reportformat":
        case "reportFormat": return target.getWorkdayConfiguration().getReportFormat();
        case "tenant": return target.getWorkdayConfiguration().getTenant();
        case "tokenrefresh":
        case "tokenRefresh": return target.getWorkdayConfiguration().getTokenRefresh();
        default: return null;
        }
    }
}

