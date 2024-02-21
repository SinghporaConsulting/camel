/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.mail.stream;

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
public class GoogleMailStreamComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration getOrCreateConfiguration(GoogleMailStreamComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleMailStreamComponent target = (GoogleMailStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.mail.GoogleMailClientFactory.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration.class, value)); return true;
        case "delegate": getOrCreateConfiguration(target).setDelegate(property(camelContext, java.lang.String.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "labels": getOrCreateConfiguration(target).setLabels(property(camelContext, java.lang.String.class, value)); return true;
        case "markasread":
        case "markAsRead": getOrCreateConfiguration(target).setMarkAsRead(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": getOrCreateConfiguration(target).setMaxResults(property(camelContext, long.class, value)); return true;
        case "query": getOrCreateConfiguration(target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "raw": getOrCreateConfiguration(target).setRaw(property(camelContext, boolean.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": getOrCreateConfiguration(target).setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": getOrCreateConfiguration(target).setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "applicationname":
        case "applicationName": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientfactory":
        case "clientFactory": return org.apache.camel.component.google.mail.GoogleMailClientFactory.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration.class;
        case "delegate": return java.lang.String.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "labels": return java.lang.String.class;
        case "markasread":
        case "markAsRead": return boolean.class;
        case "maxresults":
        case "maxResults": return long.class;
        case "query": return java.lang.String.class;
        case "raw": return boolean.class;
        case "refreshtoken":
        case "refreshToken": return java.lang.String.class;
        case "scopes": return java.util.List.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleMailStreamComponent target = (GoogleMailStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return getOrCreateConfiguration(target).getAccessToken();
        case "applicationname":
        case "applicationName": return getOrCreateConfiguration(target).getApplicationName();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientfactory":
        case "clientFactory": return target.getClientFactory();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "clientsecret":
        case "clientSecret": return getOrCreateConfiguration(target).getClientSecret();
        case "configuration": return target.getConfiguration();
        case "delegate": return getOrCreateConfiguration(target).getDelegate();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "labels": return getOrCreateConfiguration(target).getLabels();
        case "markasread":
        case "markAsRead": return getOrCreateConfiguration(target).isMarkAsRead();
        case "maxresults":
        case "maxResults": return getOrCreateConfiguration(target).getMaxResults();
        case "query": return getOrCreateConfiguration(target).getQuery();
        case "raw": return getOrCreateConfiguration(target).isRaw();
        case "refreshtoken":
        case "refreshToken": return getOrCreateConfiguration(target).getRefreshToken();
        case "scopes": return getOrCreateConfiguration(target).getScopes();
        case "serviceaccountkey":
        case "serviceAccountKey": return getOrCreateConfiguration(target).getServiceAccountKey();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "scopes": return java.lang.String.class;
        default: return null;
        }
    }
}

