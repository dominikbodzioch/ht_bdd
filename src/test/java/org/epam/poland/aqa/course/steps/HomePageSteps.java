package org.epam.poland.aqa.course.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.poland.aqa.course.pageobject.pages.HomePage;
import org.testng.Assert;

import static org.epam.poland.aqa.course.steps.BaseSteps.PAGES_STORAGE;
import static org.epam.poland.aqa.course.steps.BaseSteps.webDriver;

public class HomePageSteps {

    @Given("User is on {string}")
    public void userIsOnHomePage(String pageName) {
        HomePage homePage = new HomePage(webDriver);
        PAGES_STORAGE.put(pageName, homePage);
        homePage.open();
    }

    @When("User chooses any category on {string}")
    public void userChoosesAnyCategoryOn(String pageName) {
        PAGES_STORAGE.put("Category Page", ((HomePage) PAGES_STORAGE.get(pageName)).chooseAnyCategory());
    }

    @When("User wants to use any main nav bar link")
    public void userWantsToUseAnyNavBarLink() {
    }

    @Then("Every of {string} is present")
    public void everyOfLinkIsPresent(String linkName) {
        Assert.assertTrue(PAGES_STORAGE.get("Home Page").getNavBarLinks().contains(linkName));
    }
}
