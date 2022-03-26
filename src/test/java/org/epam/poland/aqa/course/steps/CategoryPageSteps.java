package org.epam.poland.aqa.course.steps;

import io.cucumber.java.en.And;
import org.epam.poland.aqa.course.pageobject.pages.CategoryPage;
import org.epam.poland.aqa.course.pageobject.pages.ItemPage;

import static org.epam.poland.aqa.course.steps.BaseSteps.PAGES_STORAGE;

public class CategoryPageSteps {

    @And("User chooses any item on {string}")
    public void userChoosesAnyItemOn(String pageName) {
        ItemPage itemPage = ((CategoryPage) PAGES_STORAGE.get(pageName)).chooseAnyItem();
        PAGES_STORAGE.put("Item Page", itemPage);
    }
}
