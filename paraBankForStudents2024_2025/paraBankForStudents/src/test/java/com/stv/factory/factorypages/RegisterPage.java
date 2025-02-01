package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends AbstractPage {

    @FindBy(id = "customer.firstName")
    private WebElement firstNameField;
    @FindBy(id = "customer.lastName")
    private WebElement lastNameField;

    @FindBy(id = "customer.username")
    private WebElement usernameField;

    @FindBy(id = "customer.password")
    private WebElement passwordField;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@type='submit' and @value='Register']")
    private WebElement registerButton;

    @FindBy(id = "customer.address.street")
    private WebElement addressField;

    @FindBy(id = "customer.address.city")
    private WebElement cityField;

    @FindBy(id = "customer.address.state")
    private WebElement stateField;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCodeField;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumberField;

    @FindBy(id = "customer.ssn")
    private WebElement ssnField;
    @FindBy(xpath = "//span[@class='error']")
    private WebElement errorMessage;

    public RegisterPage enterFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegisterPage enterLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegisterPage enterAddress(String address) {
        addressField.clear();
        addressField.sendKeys(address);
        return this;
    }

    public RegisterPage enterCity(String city) {
        cityField.clear();
        cityField.sendKeys(city);
        return this;
    }

    public RegisterPage enterState(String state) {
        stateField.clear();
        stateField.sendKeys(state);
        return this;
    }

    public RegisterPage enterZipCode(String zipCode) {
        zipCodeField.clear();
        zipCodeField.sendKeys(zipCode);
        return this;
    }

    public RegisterPage enterPhoneNumber(String phoneNumber) {
        phoneNumberField.clear();
        phoneNumberField.sendKeys(phoneNumber);
        return this;
    }

    public RegisterPage enterSSN(String ssn) {
        ssnField.clear();
        ssnField.sendKeys(ssn);
        return this;
    }

    public RegisterPage enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        return this;
    }

    public RegisterPage enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public RegisterPage enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);
        return this;
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
    public boolean isErrorDisplayed() {
        return errorMessage.isDisplayed();
    }
    public void clearAllFields() {
        firstNameField.clear();
        lastNameField.clear();
        addressField.clear();
        cityField.clear();
        stateField.clear();
        zipCodeField.clear();
        phoneNumberField.clear();
        ssnField.clear();
        usernameField.clear();
        passwordField.clear();
        confirmPasswordField.clear();
    }
}
