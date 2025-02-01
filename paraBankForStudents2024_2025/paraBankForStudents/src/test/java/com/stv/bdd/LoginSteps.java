package com.stv.bdd;

import com.stv.factory.factorypages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
public class LoginSteps {
    private final LoginPage loginPage = new LoginPage();
    @When("I enter data in only one of the Username or Password fields")
    public void iEnterDataInOnlyOneField() {
        loginPage.enterUsername("testuser");
    }

    @When("I click 'LOG IN'")
    public void iClickLogIn() {
        loginPage.clickLoginButton();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message is not displayed.");
        Assert.assertEquals(loginPage.getErrorMessageText(), "Please enter a username and password.");
    }
}
