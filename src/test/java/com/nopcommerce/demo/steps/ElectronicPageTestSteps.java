package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicPageTestSteps {

    TopMenuPage topMenuPage =new TopMenuPage();

    @When("^I Mouse Hover on “Electronics” Tab$")
    public void iMouseHoverOnElectronicsTab() {

        topMenuPage.hoverOverMenu("Electronics");
    }


    @And("^I Mouse Hover on “Cell phones” and click$")
    public void iMouseHoverOnCellPhonesAndClick() {

        topMenuPage.selectMenu("Cell phones");
    }

    @And("^I Verify the text “Cell phones$")
    public void iVerifyTheTextCellPhones() {

        Assert.assertEquals(topMenuPage.textOnEachPage(), "Cell phones");
    }
}
