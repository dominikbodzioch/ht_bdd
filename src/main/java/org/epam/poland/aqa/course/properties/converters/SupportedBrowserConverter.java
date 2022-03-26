package org.epam.poland.aqa.course.properties.converters;

import org.epam.poland.aqa.course.enumeration.SupportedBrowsers;

public class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
        return switch (webBrowser){
            case "local_chrome"-> SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox"-> SupportedBrowsers.LOCAL_FIREFOX;
            default -> throw new IllegalArgumentException("No appropriate browser found");
        };
    }
}
