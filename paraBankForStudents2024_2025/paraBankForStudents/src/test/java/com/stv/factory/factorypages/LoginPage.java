package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(), 'Forgot login info?')]")
    private WebElement forgotLoginInfoLink;

    @FindBy(xpath = "//input[@type='submit' and @value='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[@class='error']")
    private WebElement errorMessage;
    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='Services']")
    private WebElement services;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='Locations']")
    private WebElement location;


    public void clickForgotLoginInfoLink() {
        forgotLoginInfoLink.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
    public void clickServicesLink() {
        services.click();
    }
    public void clickLocationsLink() {
        location.click();
    }


    public boolean isErrorDisplayed() {
        return errorMessage.isDisplayed();
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
}
