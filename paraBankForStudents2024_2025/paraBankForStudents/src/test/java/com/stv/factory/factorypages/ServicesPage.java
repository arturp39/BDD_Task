package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ServicesPage extends AbstractPage {
    @FindBy(xpath = "//span[contains(text(), 'Bookstore (Version 2.0)')]")
    private WebElement tableElement;
    @FindBy(xpath = "//div[@id='footerPanel']//a[text()='Services']")
    private WebElement footerServicesLink;
    @FindBy(xpath = "//img[@title='ParaBank']")
    private WebElement parabankLogo;


    public boolean isServicesTableVisible() {
        return tableElement.isDisplayed();
    }
    public boolean isFooterServicesLinkVisible() {
        return footerServicesLink.isDisplayed();
    }
    public void clickFooterServicesLink() {
        footerServicesLink.click();
    }

    public void clickParabankLogo() {
        parabankLogo.click();
    }
}
