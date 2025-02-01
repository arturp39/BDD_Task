package com.stv.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.stv.factorytests.BasicTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "com.stv.bdd",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner {
    @AfterClass
    public static void cleanUp() {
        BasicTest.quitDriver();
    }
}
