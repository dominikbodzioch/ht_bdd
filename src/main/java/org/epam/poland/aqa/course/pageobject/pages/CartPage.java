package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CartPage extends BasePage {

    private final By heading = By.xpath("//div[@id='sc-active-cart']/descendant::h1");
    private final By deleteButton = By.xpath("//input[@data-action='delete']");

    @FindBy(xpath = "//span [@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")
    private WebElement currencyPrice;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CartPage deleteItemFromCart() {
        WebElement delButton = new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
        delButton.click();
        return new CartPage(webDriver);
    }

    public String getHeadingInfo() {
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(heading)).getText();
    }

    public String getPrice() {
        return currencyPrice.getText().trim()
                .replaceFirst("\\D+", "").replace(",", ".");
    }
}
