package com.stv.bdd;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.ServicesPage;
import com.stv.factorytests.BasicTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class ServicesSteps {

    private final WebDriver driver = BasicTest.getDriver();

    private final LoginPage loginPage = new LoginPage();
    private final ServicesPage servicesPage = new ServicesPage();

    @When("I click on \"Services\"")
    public void iClickOnServices() {
        loginPage.clickServicesLink();
        Assert.assertTrue(servicesPage.isServicesTableVisible(), "User is not on the Services page.");
    }

    @Then("I should see the Services page")
    public void iShouldSeeTheServicesPage() {
        Assert.assertTrue(servicesPage.isServicesTableVisible(), "Services table is not visible on the Services page.");
    }

    @When("I scroll to the footer")
    public void iScrollToFooter() {
        WebDriver driver = com.stv.framework.core.drivers.MyDriver.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Then("I should see the bottom of the page")
    public void iShouldSeeTheBottomOfThePage() {
        Assert.assertTrue(servicesPage.isFooterServicesLinkVisible(), "Footer 'Services' link is not visible.");
    }

    @When("I click on the \"Services\" link in the footer")
    public void iClickOnTheServicesLinkInTheFooter() {
        servicesPage.clickFooterServicesLink();
        Assert.assertTrue(servicesPage.isServicesTableVisible(), "User is not on the Services page after clicking footer link.");
    }

    @Then("I should see the top of the Services page")
    public void iShouldSeeTheTopOfTheServicesPage() {
        Assert.assertTrue(servicesPage.isServicesTableVisible(), "The top of the Services page is not visible.");
    }

    @When("I click on the ParaBank logo")
    public void iClickOnTheParaBankLogo() {
        servicesPage.clickParabankLogo();
    }
}
