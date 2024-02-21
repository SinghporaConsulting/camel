/* Generated by camel build tools - do NOT edit this file! */
package io.fabric8.kubernetes.client;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import io.fabric8.kubernetes.client.ConfigBuilder;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConfigFluentImplConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        io.fabric8.kubernetes.client.ConfigBuilder target = (io.fabric8.kubernetes.client.ConfigBuilder) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": target.withApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "authprovider":
        case "AuthProvider": target.withAuthProvider(property(camelContext, io.fabric8.kubernetes.api.model.AuthProviderConfig.class, value)); return true;
        case "autoconfigure":
        case "AutoConfigure": target.withAutoConfigure(property(camelContext, boolean.class, value)); return true;
        case "autooauthtoken":
        case "AutoOAuthToken": target.withAutoOAuthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertdata":
        case "CaCertData": target.withCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile":
        case "CaCertFile": target.withCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata":
        case "ClientCertData": target.withClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile":
        case "ClientCertFile": target.withClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo":
        case "ClientKeyAlgo": target.withClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata":
        case "ClientKeyData": target.withClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile":
        case "ClientKeyFile": target.withClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase":
        case "ClientKeyPassphrase": target.withClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "ConnectionTimeout": target.withConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "contexts":
        case "Contexts": target.withContexts(property(camelContext, java.util.List.class, value)); return true;
        case "currentcontext":
        case "CurrentContext": target.withCurrentContext(property(camelContext, io.fabric8.kubernetes.api.model.NamedContext.class, value)); return true;
        case "customheaders":
        case "CustomHeaders": target.withCustomHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "defaultnamespace":
        case "DefaultNamespace": target.withDefaultNamespace(property(camelContext, boolean.class, value)); return true;
        case "disablehostnameverification":
        case "DisableHostnameVerification": target.withDisableHostnameVerification(property(camelContext, boolean.class, value)); return true;
        case "file":
        case "File": target.withFile(property(camelContext, java.io.File.class, value)); return true;
        case "http2disable":
        case "Http2Disable": target.withHttp2Disable(property(camelContext, boolean.class, value)); return true;
        case "httpproxy":
        case "HttpProxy": target.withHttpProxy(property(camelContext, java.lang.String.class, value)); return true;
        case "httpsproxy":
        case "HttpsProxy": target.withHttpsProxy(property(camelContext, java.lang.String.class, value)); return true;
        case "impersonateextras":
        case "ImpersonateExtras": target.withImpersonateExtras(property(camelContext, java.util.Map.class, value)); return true;
        case "impersonategroups":
        case "ImpersonateGroups": target.withImpersonateGroups(property(camelContext, java.lang.String[].class, value)); return true;
        case "impersonateusername":
        case "ImpersonateUsername": target.withImpersonateUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorefile":
        case "KeyStoreFile": target.withKeyStoreFile(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorepassphrase":
        case "KeyStorePassphrase": target.withKeyStorePassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "logginginterval":
        case "LoggingInterval": target.withLoggingInterval(property(camelContext, int.class, value)); return true;
        case "masterurl":
        case "MasterUrl": target.withMasterUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "maxconcurrentrequests":
        case "MaxConcurrentRequests": target.withMaxConcurrentRequests(property(camelContext, int.class, value)); return true;
        case "maxconcurrentrequestsperhost":
        case "MaxConcurrentRequestsPerHost": target.withMaxConcurrentRequestsPerHost(property(camelContext, int.class, value)); return true;
        case "namespace":
        case "Namespace": target.withNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "noproxy":
        case "NoProxy": target.withNoProxy(property(camelContext, java.lang.String[].class, value)); return true;
        case "oauthtoken":
        case "OauthToken": target.withOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtokenprovider":
        case "OauthTokenProvider": target.withOauthTokenProvider(property(camelContext, io.fabric8.kubernetes.client.OAuthTokenProvider.class, value)); return true;
        case "onlyhttpwatches":
        case "OnlyHttpWatches": target.withOnlyHttpWatches(property(camelContext, boolean.class, value)); return true;
        case "password":
        case "Password": target.withPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "ProxyPassword": target.withProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyusername":
        case "ProxyUsername": target.withProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "requestretrybackoffinterval":
        case "RequestRetryBackoffInterval": target.withRequestRetryBackoffInterval(property(camelContext, int.class, value)); return true;
        case "requestretrybackofflimit":
        case "RequestRetryBackoffLimit": target.withRequestRetryBackoffLimit(property(camelContext, int.class, value)); return true;
        case "requesttimeout":
        case "RequestTimeout": target.withRequestTimeout(property(camelContext, int.class, value)); return true;
        case "scaletimeout":
        case "ScaleTimeout": target.withScaleTimeout(property(camelContext, long.class, value)); return true;
        case "tlsversions":
        case "TlsVersions": target.withTlsVersions(property(camelContext, io.fabric8.kubernetes.client.http.TlsVersion[].class, value)); return true;
        case "trustcerts":
        case "TrustCerts": target.withTrustCerts(property(camelContext, boolean.class, value)); return true;
        case "truststorefile":
        case "TrustStoreFile": target.withTrustStoreFile(property(camelContext, java.lang.String.class, value)); return true;
        case "truststorepassphrase":
        case "TrustStorePassphrase": target.withTrustStorePassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "uploadrequesttimeout":
        case "UploadRequestTimeout": target.withUploadRequestTimeout(property(camelContext, int.class, value)); return true;
        case "useragent":
        case "UserAgent": target.withUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "Username": target.withUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "watchreconnectinterval":
        case "WatchReconnectInterval": target.withWatchReconnectInterval(property(camelContext, int.class, value)); return true;
        case "watchreconnectlimit":
        case "WatchReconnectLimit": target.withWatchReconnectLimit(property(camelContext, int.class, value)); return true;
        case "websocketpinginterval":
        case "WebsocketPingInterval": target.withWebsocketPingInterval(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": return java.lang.String.class;
        case "authprovider":
        case "AuthProvider": return io.fabric8.kubernetes.api.model.AuthProviderConfig.class;
        case "autoconfigure":
        case "AutoConfigure": return boolean.class;
        case "autooauthtoken":
        case "AutoOAuthToken": return java.lang.String.class;
        case "cacertdata":
        case "CaCertData": return java.lang.String.class;
        case "cacertfile":
        case "CaCertFile": return java.lang.String.class;
        case "clientcertdata":
        case "ClientCertData": return java.lang.String.class;
        case "clientcertfile":
        case "ClientCertFile": return java.lang.String.class;
        case "clientkeyalgo":
        case "ClientKeyAlgo": return java.lang.String.class;
        case "clientkeydata":
        case "ClientKeyData": return java.lang.String.class;
        case "clientkeyfile":
        case "ClientKeyFile": return java.lang.String.class;
        case "clientkeypassphrase":
        case "ClientKeyPassphrase": return java.lang.String.class;
        case "connectiontimeout":
        case "ConnectionTimeout": return int.class;
        case "contexts":
        case "Contexts": return java.util.List.class;
        case "currentcontext":
        case "CurrentContext": return io.fabric8.kubernetes.api.model.NamedContext.class;
        case "customheaders":
        case "CustomHeaders": return java.util.Map.class;
        case "defaultnamespace":
        case "DefaultNamespace": return boolean.class;
        case "disablehostnameverification":
        case "DisableHostnameVerification": return boolean.class;
        case "file":
        case "File": return java.io.File.class;
        case "http2disable":
        case "Http2Disable": return boolean.class;
        case "httpproxy":
        case "HttpProxy": return java.lang.String.class;
        case "httpsproxy":
        case "HttpsProxy": return java.lang.String.class;
        case "impersonateextras":
        case "ImpersonateExtras": return java.util.Map.class;
        case "impersonategroups":
        case "ImpersonateGroups": return java.lang.String[].class;
        case "impersonateusername":
        case "ImpersonateUsername": return java.lang.String.class;
        case "keystorefile":
        case "KeyStoreFile": return java.lang.String.class;
        case "keystorepassphrase":
        case "KeyStorePassphrase": return java.lang.String.class;
        case "logginginterval":
        case "LoggingInterval": return int.class;
        case "masterurl":
        case "MasterUrl": return java.lang.String.class;
        case "maxconcurrentrequests":
        case "MaxConcurrentRequests": return int.class;
        case "maxconcurrentrequestsperhost":
        case "MaxConcurrentRequestsPerHost": return int.class;
        case "namespace":
        case "Namespace": return java.lang.String.class;
        case "noproxy":
        case "NoProxy": return java.lang.String[].class;
        case "oauthtoken":
        case "OauthToken": return java.lang.String.class;
        case "oauthtokenprovider":
        case "OauthTokenProvider": return io.fabric8.kubernetes.client.OAuthTokenProvider.class;
        case "onlyhttpwatches":
        case "OnlyHttpWatches": return boolean.class;
        case "password":
        case "Password": return java.lang.String.class;
        case "proxypassword":
        case "ProxyPassword": return java.lang.String.class;
        case "proxyusername":
        case "ProxyUsername": return java.lang.String.class;
        case "requestretrybackoffinterval":
        case "RequestRetryBackoffInterval": return int.class;
        case "requestretrybackofflimit":
        case "RequestRetryBackoffLimit": return int.class;
        case "requesttimeout":
        case "RequestTimeout": return int.class;
        case "scaletimeout":
        case "ScaleTimeout": return long.class;
        case "tlsversions":
        case "TlsVersions": return io.fabric8.kubernetes.client.http.TlsVersion[].class;
        case "trustcerts":
        case "TrustCerts": return boolean.class;
        case "truststorefile":
        case "TrustStoreFile": return java.lang.String.class;
        case "truststorepassphrase":
        case "TrustStorePassphrase": return java.lang.String.class;
        case "uploadrequesttimeout":
        case "UploadRequestTimeout": return int.class;
        case "useragent":
        case "UserAgent": return java.lang.String.class;
        case "username":
        case "Username": return java.lang.String.class;
        case "watchreconnectinterval":
        case "WatchReconnectInterval": return int.class;
        case "watchreconnectlimit":
        case "WatchReconnectLimit": return int.class;
        case "websocketpinginterval":
        case "WebsocketPingInterval": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        io.fabric8.kubernetes.client.ConfigBuilder target = (io.fabric8.kubernetes.client.ConfigBuilder) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": return target.getApiVersion();
        case "authprovider":
        case "AuthProvider": return target.getAuthProvider();
        case "autoconfigure":
        case "AutoConfigure": return target.isAutoConfigure();
        case "autooauthtoken":
        case "AutoOAuthToken": return target.getAutoOAuthToken();
        case "cacertdata":
        case "CaCertData": return target.getCaCertData();
        case "cacertfile":
        case "CaCertFile": return target.getCaCertFile();
        case "clientcertdata":
        case "ClientCertData": return target.getClientCertData();
        case "clientcertfile":
        case "ClientCertFile": return target.getClientCertFile();
        case "clientkeyalgo":
        case "ClientKeyAlgo": return target.getClientKeyAlgo();
        case "clientkeydata":
        case "ClientKeyData": return target.getClientKeyData();
        case "clientkeyfile":
        case "ClientKeyFile": return target.getClientKeyFile();
        case "clientkeypassphrase":
        case "ClientKeyPassphrase": return target.getClientKeyPassphrase();
        case "connectiontimeout":
        case "ConnectionTimeout": return target.getConnectionTimeout();
        case "contexts":
        case "Contexts": return target.getContexts();
        case "currentcontext":
        case "CurrentContext": return target.getCurrentContext();
        case "customheaders":
        case "CustomHeaders": return target.getCustomHeaders();
        case "defaultnamespace":
        case "DefaultNamespace": return target.isDefaultNamespace();
        case "disablehostnameverification":
        case "DisableHostnameVerification": return target.isDisableHostnameVerification();
        case "file":
        case "File": return target.getFile();
        case "http2disable":
        case "Http2Disable": return target.isHttp2Disable();
        case "httpproxy":
        case "HttpProxy": return target.getHttpProxy();
        case "httpsproxy":
        case "HttpsProxy": return target.getHttpsProxy();
        case "impersonateextras":
        case "ImpersonateExtras": return target.getImpersonateExtras();
        case "impersonategroups":
        case "ImpersonateGroups": return target.getImpersonateGroups();
        case "impersonateusername":
        case "ImpersonateUsername": return target.getImpersonateUsername();
        case "keystorefile":
        case "KeyStoreFile": return target.getKeyStoreFile();
        case "keystorepassphrase":
        case "KeyStorePassphrase": return target.getKeyStorePassphrase();
        case "logginginterval":
        case "LoggingInterval": return target.getLoggingInterval();
        case "masterurl":
        case "MasterUrl": return target.getMasterUrl();
        case "maxconcurrentrequests":
        case "MaxConcurrentRequests": return target.getMaxConcurrentRequests();
        case "maxconcurrentrequestsperhost":
        case "MaxConcurrentRequestsPerHost": return target.getMaxConcurrentRequestsPerHost();
        case "namespace":
        case "Namespace": return target.getNamespace();
        case "noproxy":
        case "NoProxy": return target.getNoProxy();
        case "oauthtoken":
        case "OauthToken": return target.getOauthToken();
        case "oauthtokenprovider":
        case "OauthTokenProvider": return target.getOauthTokenProvider();
        case "onlyhttpwatches":
        case "OnlyHttpWatches": return target.isOnlyHttpWatches();
        case "password":
        case "Password": return target.getPassword();
        case "proxypassword":
        case "ProxyPassword": return target.getProxyPassword();
        case "proxyusername":
        case "ProxyUsername": return target.getProxyUsername();
        case "requestretrybackoffinterval":
        case "RequestRetryBackoffInterval": return target.getRequestRetryBackoffInterval();
        case "requestretrybackofflimit":
        case "RequestRetryBackoffLimit": return target.getRequestRetryBackoffLimit();
        case "requesttimeout":
        case "RequestTimeout": return target.getRequestTimeout();
        case "scaletimeout":
        case "ScaleTimeout": return target.getScaleTimeout();
        case "tlsversions":
        case "TlsVersions": return target.getTlsVersions();
        case "trustcerts":
        case "TrustCerts": return target.isTrustCerts();
        case "truststorefile":
        case "TrustStoreFile": return target.getTrustStoreFile();
        case "truststorepassphrase":
        case "TrustStorePassphrase": return target.getTrustStorePassphrase();
        case "uploadrequesttimeout":
        case "UploadRequestTimeout": return target.getUploadRequestTimeout();
        case "useragent":
        case "UserAgent": return target.getUserAgent();
        case "username":
        case "Username": return target.getUsername();
        case "watchreconnectinterval":
        case "WatchReconnectInterval": return target.getWatchReconnectInterval();
        case "watchreconnectlimit":
        case "WatchReconnectLimit": return target.getWatchReconnectLimit();
        case "websocketpinginterval":
        case "WebsocketPingInterval": return target.getWebsocketPingInterval();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "contexts":
        case "Contexts": return io.fabric8.kubernetes.api.model.NamedContext.class;
        default: return null;
        }
    }
}

