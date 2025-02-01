package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    private static WebDriver getDriver() {
        return MyDriver.getDriver();
    }
    protected AbstractPage () {
        PageFactory.initElements(getDriver(),this);
    }
}
