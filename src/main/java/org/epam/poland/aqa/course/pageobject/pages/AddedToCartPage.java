package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddedToCartPage extends BasePage {

    private final By addedToCart = By.xpath("//span[contains(text(), 'Added to Cart')]");

    @FindBy(xpath = "//span[@id='nav-cart-count' and contains(text(), '1')]")
    private WebElement navCartCount;


    public AddedToCartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getAddedToCartInfo() {
        return new WebDriverWait(webDriver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(addedToCart)).getText();
    }

    public String getNavCartCount() {
        return navCartCount.getText();
    }
}
