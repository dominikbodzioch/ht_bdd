package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoryPage extends BasePage {

    private final By anyItem = By.xpath("//img[@class='s-image']");

    public CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ItemPage chooseAnyItem() {
        WebElement item = new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(anyItem));
        item.click();
        return new ItemPage(webDriver);
    }
}
