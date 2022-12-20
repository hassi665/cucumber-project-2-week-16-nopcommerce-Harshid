package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerPageTestSteps{
    ProductPage productPage = new ProductPage();
    HomePage homePage = new HomePage();
    TopMenuPage topMenuPage =new TopMenuPage();
    @Given("^I am at homepage$")
    public void iAmAtHomepage() {

    }
    @When("^I Click on Computers Menu$")
    public void iClickOnComputersMenu() {
        topMenuPage.selectMenu("Computers");
    }

    @And("^I click on Desktops$")
    public void iClickOnDesktops() {
        homePage.selectCategory("Desktops");
    }

    @And("^I Select option Sort By position \"([^\"]*)\"$")
    public void iSelectOptionSortByPosition(String arg0) {

        productPage.selectSortByType("Name: Z to A");
    }

    @And("^I Verify the Product will arrange in Descending order\\.$")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {

        Assert.assertEquals(productPage.beforeSortTheProducts(), productPage.afterSortingTheProducts());
    }
}
