package org.jenkinsci.plugins.custom.header;

import hudson.Extension;
import hudson.ExtensionComponent;
import jenkins.ExtensionFilter;
import jenkins.views.Header;

@Extension
public class CustomHeaderExtensionFilter extends ExtensionFilter {

    @Override
    public <T> boolean allows(Class<T> type, ExtensionComponent<T> component) {
        boolean isCustomHeader = component.getInstance().getClass().equals(CustomHeader.class);
        boolean isForbiddenHeader = type.equals(Header.class) && !isCustomHeader; 
        return !isForbiddenHeader;
    }
} 
