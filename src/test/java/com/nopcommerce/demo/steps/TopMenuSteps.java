package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps extends Utility {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I select any top menu's option$")
    public void iSelectAnyTopMenuSOption() throws InterruptedException {
        Thread.sleep(1000);
        topMenuPage.hoverOverMenu("Computers");

    }

    @And("^I click on submenu option$")
    public void iClickOnSubmenuOption() throws InterruptedException {

        Thread.sleep(1000);
        topMenuPage.selectMenu("Notebooks");
    }

    @Then("^I can see redirected page name$")
    public void iCanSeeRedirectedPageName() {
        Assert.assertEquals(topMenuPage.textOnEachPage(), "Notebooks");
    }
}
