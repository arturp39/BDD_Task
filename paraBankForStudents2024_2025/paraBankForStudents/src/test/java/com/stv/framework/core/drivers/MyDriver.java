package com.stv.framework.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            setChromeDriver();
//            setFireFox();
        }
        return driver;
    }

    private static void setChromeDriver() {
//        String exePath = "C:\\Chromedriver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", exePath);
//        ChromeOptions options = new ChromeOptions();
        // Disable infobars and autofill features
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-popup-blocking");

        // Use Chrome preferences to disable autofill and password manager
        options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
            put("profile.default_content_setting_values.notifications", 2); // Disable notifications
            put("credentials_enable_service", false); // Disable password manager
            put("profile.password_manager_enabled", false); // Disable save password prompt
            put("autofill.profile_enabled", false); // Disable autofill profiles
            put("autofill.credit_card_enabled", false); // Disable credit card autofill
        }});
        driver = new ChromeDriver(options);
    }

    /**
     * The method can be used to run tests in Fire fox
     */
    private static void setFireFox() {
//        String exePath =  "C:\\drivers\\geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", exePath);
        driver = new FirefoxDriver();
    }
}
