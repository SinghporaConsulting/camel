/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ical;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ICalDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        ICalDataFormat dataformat = (ICalDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "validating": dataformat.setValidating(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

