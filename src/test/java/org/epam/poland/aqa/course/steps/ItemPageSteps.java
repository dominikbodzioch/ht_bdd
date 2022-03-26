package org.epam.poland.aqa.course.steps;

import io.cucumber.java.en.And;
import org.epam.poland.aqa.course.pageobject.pages.AddedToCartPage;
import org.epam.poland.aqa.course.pageobject.pages.ItemPage;

import static org.epam.poland.aqa.course.steps.BaseSteps.PAGES_STORAGE;

public class ItemPageSteps {

    @And("User adds item to cart on {string}")
    public void userAddsItemToCartOn(String pageName) {
        AddedToCartPage addedToCartPage = ((ItemPage) PAGES_STORAGE.get(pageName)).addItemToCart();
        PAGES_STORAGE.put("Added To Cart Page", addedToCartPage);
    }

}
