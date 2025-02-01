package com.stv.factorytests;

import com.stv.factory.factorypages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;

public class LoginTests extends BasicTest {

    @Test(description = "Verify 'Forgot login info' link functionality")
    public void testForgotLoginInfoLink() {
        WebDriver driver = getDriver();
        driver.get(START_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.clickForgotLoginInfoLink();
        Assert.assertTrue(driver.getCurrentUrl().contains("lookup.htm"), "Redirection to the password recovery page failed.");
    }

    @Test(description = "Verify error message when 'LOG IN' is clicked with empty fields")
    public void testLoginWithEmptyFields() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message is not displayed.");
        Assert.assertEquals(loginPage.getErrorMessageText(), "Please enter a username and password.");
    }
}
