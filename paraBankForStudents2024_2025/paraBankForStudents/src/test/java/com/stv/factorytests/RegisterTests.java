package com.stv.factorytests;

import com.stv.factory.factorypages.RegisterPage;
import com.stv.factory.factorypages.RegisterSuccessPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends BasicTest {

    @Test(description = "Register with valid inputs")
    public void testValidRegistration() {
        RegisterPage registerPage = new RegisterPage();
        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
        registerPage.enterFirstName("Name")
                .enterLastName("lastname")
                .enterAddress("address")
                .enterCity("city")
                .enterState("state")
                .enterZipCode("12345")
                .enterPhoneNumber("293847576")
                .enterSSN("7355608")
                .enterUsername("user122")
                .enterPassword("pass")
                .enterConfirmPassword("pass")
                .clickRegisterButton();

        Assert.assertEquals(registerSuccessPage.readSuccessMessage(), "Your account was created successfully. You are now logged in.");
    }

    @Test(description = "Register with mismatched passwords")
    public void testMismatchedPasswords() {
        RegisterPage registerPage = new RegisterPage();
        registerPage.enterFirstName("name")
                .enterLastName("lastname")
                .enterUsername("user1212")
                .enterPassword("pass")
                .enterConfirmPassword("passssss")
                .clickRegisterButton();

        Assert.assertTrue(registerPage.isErrorDisplayed(), "Error message for mismatched passwords was not displayed.");
    }
}
