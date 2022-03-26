package org.epam.poland.aqa.course.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.epam.poland.aqa.course.pageobject.pages.CartPage;
import org.testng.Assert;

import static org.epam.poland.aqa.course.steps.BaseSteps.PAGES_STORAGE;

public class CartPageSteps {

    @And("User opens {string} and deletes item from cart")
    public void userDeletesItemFromCartOn(String pageName) {
        CartPage cartPage = PAGES_STORAGE.get("Home Page").openCart();
        PAGES_STORAGE.put(pageName, cartPage);
        cartPage.deleteItemFromCart();
    }

    @Then("User info {string} on {string}")
    public void checkUserInfoAfterDeletionOn(String info, String pageName) {
        Assert.assertEquals(((CartPage) PAGES_STORAGE.get(pageName)).getHeadingInfo(), info,
                "Your Amazon Cart is not empty or not available");
    }

    @And("Subtotal is {string} on {string}")
    public void subtotalIsOn(String subtotal, String pageName) {
        Assert.assertEquals(((CartPage) PAGES_STORAGE.get(pageName)).getPrice(), subtotal,
                "Subtotal is not '0.00'");
    }

}
