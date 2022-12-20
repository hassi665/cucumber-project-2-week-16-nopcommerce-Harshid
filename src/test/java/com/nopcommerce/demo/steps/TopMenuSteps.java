package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps extends Utility {

    TopMenuPage topMenuPage;

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I passed parameter Electronics & verify page nevigated to the right place$")
    public void iPassedParameterElectronicsVerifyPageNevigatedToTheRightPlace() {

        topMenuPage.selectMenu("Electronics");
        topMenuPage.textOnEachPage();
        Assert.assertEquals(topMenuPage.textOnEachPage(), "Electronics");
    }

    @And("^I passed parameter Computers & verify page nevigated to the right place$")
    public void iPassedParameterComputersVerifyPageNevigatedToTheRightPlace() {

        topMenuPage.selectMenu("Computers");
        topMenuPage.textOnEachPage();
        Assert.assertEquals(topMenuPage.textOnEachPage(), "Computers");

    }

    @Then("^I can see the right pages$")
    public void iCanSeeTheRightPages() {
    }
}
