package org.epam.poland.aqa.course.pageobject;

import org.epam.poland.aqa.course.pageobject.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BasePage {
    protected WebDriver webDriver;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement cartButton;

    By navBarLinks = By.xpath("//div[@class='nav-fill']/descendant::a");

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public CartPage openCart() {
        cartButton.click();
        return new CartPage(webDriver);
    }

    public List<String> getNavBarLinks() {
        List<WebElement> elements = webDriver.findElements(navBarLinks);
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
