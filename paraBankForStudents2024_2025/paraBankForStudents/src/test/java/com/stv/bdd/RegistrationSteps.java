package com.stv.bdd;

import com.stv.factory.factorypages.RegisterPage;
import com.stv.factorytests.BasicTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.stv.framework.core.lib.ParaBankPageURLs.REGISTER_URL;

public class RegistrationSteps {

    private final RegisterPage registerPage = new RegisterPage();

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        String expectedUrl = REGISTER_URL;
        String actualUrl = BasicTest.getDriver().getCurrentUrl();
        if (!actualUrl.equals(expectedUrl)) {
            BasicTest.getDriver().get(expectedUrl);
            actualUrl = BasicTest.getDriver().getCurrentUrl();
        }
        Assert.assertEquals(actualUrl, expectedUrl, "User is not on the registration page.");
    }


    @When("I enter {string} as First Name")
    public void iEnterAsFirstName(String firstName) {
        if (!firstName.isEmpty()) {
            registerPage.enterFirstName(firstName);
        }
    }

    @When("I enter {string} as Last Name")
    public void iEnterAsLastName(String lastName) {
        if (!lastName.isEmpty()) {
            registerPage.enterLastName(lastName);
        }
    }

    @When("I enter {string} as Address")
    public void iEnterAsAddress(String address) {
        if (!address.isEmpty()) {
            registerPage.enterAddress(address);
        }
    }

    @When("I enter {string} as City")
    public void iEnterAsCity(String city) {
        if (!city.isEmpty()) {
            registerPage.enterCity(city);
        }
    }

    @When("I enter {string} as State")
    public void iEnterAsState(String state) {
        if (!state.isEmpty()) {
            registerPage.enterState(state);
        }
    }

    @When("I enter {string} as ZIP Code")
    public void iEnterAsZIPCode(String zipCode) {
        if (!zipCode.isEmpty()) {
            registerPage.enterZipCode(zipCode);
        }
    }

    @When("I enter {string} as Phone Number")
    public void iEnterAsPhoneNumber(String phoneNumber) {
        if (!phoneNumber.isEmpty()) {
            registerPage.enterPhoneNumber(phoneNumber);
        }
    }

    @When("I enter {string} as SSN")
    public void iEnterAsSSN(String ssn) {
        if (!ssn.isEmpty()) {
            registerPage.enterSSN(ssn);
        }
    }

    @When("I enter {string} as Username")
    public void iEnterAsUsername(String username) {
        if (!username.isEmpty()) {
            registerPage.enterUsername(username);
        }
    }

    @When("I enter {string} as Password")
    public void iEnterAsPassword(String password) {
        if (!password.isEmpty()) {
            registerPage.enterPassword(password);
        }
    }

    @When("I enter {string} as Confirm Password")
    public void iEnterAsConfirmPassword(String confirmPassword) {
        if (!confirmPassword.isEmpty()) {
            registerPage.enterConfirmPassword(confirmPassword);
        }
    }

    @When("I click the 'Register' button")
    public void iClickTheRegisterButton() {
        registerPage.clickRegisterButton();
        registerPage.clearAllFields();
    }

    @Then("I should see an error message if the field is required")
    public void iShouldSeeAnErrorMessageIfTheFieldIsRequired() {
        Assert.assertTrue(registerPage.isErrorDisplayed(), "No error message is displayed for a required field.");
        System.out.println("Error Message: " + registerPage.getErrorMessageText());
    }
}
