package org.epam.poland.aqa.course.steps;

import io.cucumber.java.en.Then;
import org.epam.poland.aqa.course.pageobject.pages.AddedToCartPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.epam.poland.aqa.course.steps.BaseSteps.PAGES_STORAGE;

public class AddedToCartPageSteps {

    @Then("User info {string} and {string} item in the cart on {string}")
    public void checkUserInfoAndAmountOfItemsInTheCartOn(String info, String itemsCount, String pageName) {
        SoftAssert softAssert = new SoftAssert();
        AddedToCartPage addedToCartPage = (AddedToCartPage) PAGES_STORAGE.get(pageName);
        Assert.assertEquals(addedToCartPage.getAddedToCartInfo(), info, "Adding to Cart doesn't work properly");
        Assert.assertEquals(addedToCartPage.getNavCartCount(), itemsCount, "Wrong number of items in the Cart");
        softAssert.assertAll();
    }

}
