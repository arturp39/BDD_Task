package com.stv.factorytests;

import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static com.stv.framework.core.lib.ParaBankPageURLs.REGISTER_URL;


public class BasicTest {
    public static WebDriver getDriver() {
        return MyDriver.getDriver();
    }

    @BeforeClass(description = "Start browser")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(REGISTER_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() throws Exception {
        quitDriver();
    }

    public static void quitDriver() {
        getDriver().quit();
    }
}
