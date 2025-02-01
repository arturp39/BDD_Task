package com.stv.bdd;

import com.stv.factorytests.BasicTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;

public class SharedSteps {
    private final WebDriver driver = BasicTest.getDriver();
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        String expectedUrl = START_URL;
        BasicTest.getDriver().get(expectedUrl);
        String actualUrl = BasicTest.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "User is not on the login page.");
    }
    @Then("I should see the homepage")
    public void iShouldSeeTheHomepage() {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, START_URL, "User is not on the homepage.");
    }
}
