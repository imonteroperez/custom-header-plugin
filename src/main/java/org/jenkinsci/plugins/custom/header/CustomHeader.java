package org.jenkinsci.plugins.custom.header;

import hudson.Extension;
import jenkins.views.Header;

@Extension(ordinal = Integer.MAX_VALUE)
public class CustomHeader implements Header{

    @Override
    public boolean isHeaderEnabled() {
        boolean isDisabled = "true".equalsIgnoreCase(System.getenv("CUSTOM_HEADER_DISABLE"));
        return !isDisabled;
    }

}
