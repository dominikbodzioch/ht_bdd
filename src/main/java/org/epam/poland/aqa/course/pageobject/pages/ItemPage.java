package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    public ItemPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddedToCartPage addItemToCart() {
        addToCartButton.click();
        return new AddedToCartPage(webDriver);
    }
}
