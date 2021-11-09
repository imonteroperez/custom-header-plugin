package org.jenkinsci.plugins.custom.header;

import hudson.Extension;
import jenkins.views.Header;

@Extension(optional = true, ordinal = Integer.MAX_VALUE)
public class CustomHeader extends Header{

    @Override
    public boolean isHeaderEnabled() {
        boolean isDisabled = "true".equalsIgnoreCase(System.getenv("CUSTOM_HEADER_DISABLE"));
        return !isDisabled;
    }

}
