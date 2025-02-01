package com.stv.bdd;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factorytests.BasicTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static com.stv.framework.core.lib.ParaBankPageURLs.LOCATIONS_URL;

public class LocationSteps {
    private final LoginPage loginPage = new LoginPage();

    private final WebDriver driver = BasicTest.getDriver();

    @When("I click on \"Locations\"")
    public void iClickOnLocation() {
        loginPage.clickLocationsLink();
    }
    @Then("I should see the Locations page")
    public void iShouldSeeTheLocationsPage() {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, LOCATIONS_URL, "User is not on the Locations page.");
    }

    @When("I navigate back to the homepage")
    public void iNavigateBackToTheHomepage() {
        driver.navigate().back();
    }
}
