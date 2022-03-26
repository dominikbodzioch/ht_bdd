package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='a-size-small a-color-base truncate-2line']")
    private WebElement anyCategory;

    private final By navMainBarLinks = By.xpath("//div[@id='nav-main']/descendant::a");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage open() {
        webDriver.get("https://www.amazon.com/");
        return this;
    }

    public CategoryPage chooseAnyCategory() {
        anyCategory.click();
        return new CategoryPage(webDriver);
    }

    public void getMainNavBarLinks() {
        List<WebElement> elements1 = webDriver.findElements(navMainBarLinks);
        List<WebElement> elements2 = webDriver.findElements(By.name("a"));
        WebElement ee = webDriver.findElement(By.name("a"));
        System.out.println("elements1.size() = " + elements1.size());
        System.out.println("elements2.size() = " + elements2.size());
        System.out.println("ee = " + ee);
//        elements1.stream()
//                .map(e->e.getText())
//                .forEach(System.out::println);
    }



}
