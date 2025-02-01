package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RegisterSuccessPage extends AbstractPage {
    @FindBy (xpath = "//p[contains(text(), 'Your account was created successfully.')]")
    private WebElement successMessage;
    public String readSuccessMessage() {
        return successMessage.getText();
    }
}
