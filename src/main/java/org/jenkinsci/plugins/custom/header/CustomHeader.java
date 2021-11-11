package org.jenkinsci.plugins.custom.header;

import hudson.Extension;
import jenkins.views.Header;

@Extension(ordinal = Integer.MAX_VALUE)
public class CustomHeader implements Header{

    @Override
    public boolean isHeaderEnabled() {
        // Disable/enable the header based on an ENV var and/or system property
        boolean isDisabled = System.getProperty(CustomHeader.class.getName() + ".disable") != null ?
                "true".equalsIgnoreCase(System.getProperty(CustomHeader.class.getName() + ".disable")) :
                "true".equalsIgnoreCase(System.getenv("CUSTOM_HEADER_DISABLE"));
        return !isDisabled;
    }
    
    public static String getHeaderLabel(){
        return "Hello World!"; // This label content could be retrieved programatically
    }
}
