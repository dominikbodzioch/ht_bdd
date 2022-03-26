package org.epam.poland.aqa.course.factory;

import org.epam.poland.aqa.course.properties.converters.SupportedBrowserConverter;
import org.epam.poland.aqa.course.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    public WebDriver getWebDriver() {
        return SupportedBrowserConverter
                .valueOfWebBrowser(new PropertyHolder().readProperty("browser"))
                .getWebDriver();
    }

}
