package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ShoppingCartSteps extends Utility {

    TopMenuPage topMenuPage =new TopMenuPage();
    ProductPage productPage = new ProductPage();
    MyOrderPage myOrderPage = new MyOrderPage();
    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @And("^I Click on Computer Menu\\.$")
    public void iClickOnComputerMenu() {

        //2.1 Click on Computer Menu.
        topMenuPage.selectMenu("Computers");

    }

    @And("^I Click on Desktop$")
    public void iClickOnDesktop() {

        //2.2 Click on Desktop
        homePage.selectCategory("Desktops");

    }

    @And("^I Select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String arg0) throws InterruptedException {

        //2.3 Select Sort By position "Name: A to Z"
        productPage.selectSortByType("Name: A to Z");
        Assert.assertEquals(productPage.beforeSortTheProducts(), productPage.afterSortingTheProducts());
        Thread.sleep(1500);

    }


    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0)  {

        //2.4 Click on "Add To Cart"
        productPage.selectAddToCartProduct("Build your own computer");


    }

    @And("^I Verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) throws InterruptedException {

        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(myOrderPage.getProductName(), "Build your own computer");
        Thread.sleep(1000);


    }

    @And("^I Select \"([^\"]*)\" using Select class$")
    public void iSelectUsingSelectClass(String arg0) throws InterruptedException {

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        myOrderPage.selectYourOwnProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(500);


    }

    @And("^I Select (\\d+)GB HDD using Select class\\.$")
    public void iSelectGBHDDUsingSelectClass(int arg0)throws InterruptedException {

        //2.7.Select RAM "8GB [+$60.00]" using Select class.
        myOrderPage.SelectAppropriateRam("8GB [+$60.00]");
        Thread.sleep(500);
    }

    @And("^I Select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String arg0)throws InterruptedException  {

        //2.8 Select HDD radio "400 GB [+$100.00]"
        myOrderPage.clickAndSelectHDD();
        Thread.sleep(500);
    }

    @And("^I Select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String arg0)throws InterruptedException  {

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        myOrderPage.clickAndSelectOsPremium();
        Thread.sleep(500);
    }

    @And("^I Check Two Check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckTwoCheckBoxesAnd(String arg0, String arg1) throws InterruptedException {

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        myOrderPage.clickAndSelectTotalCmndr();
        Thread.sleep(500);
    }

    @And("^I Verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String arg0)  throws InterruptedException{

        //2.11 Verify the price "$1,475.00"
        Assert.assertEquals(myOrderPage.getPrice(), "$1,475.00");
        Thread.sleep(500);

    }

    @And("^I Click on \"([^\"]*)\" Button\\.$")
    public void iClickOnButton(String arg0)  throws InterruptedException{

        //2.12 Click on "ADD TO CARD" Button.
        myOrderPage.clickOnAddToCartBtn();
        Thread.sleep(500);

    }

    @And("^I Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void iVerifyTheMessageOnTopGreenBar(String arg0)  throws InterruptedException{

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(myOrderPage.getMessageAfterAddingToCart(), "The product has been added to your shopping cart");
        Thread.sleep(500);

    }

    @And("^I After that close the bar clicking on the cross button\\.$")
    public void iAfterThatCloseTheBarClickingOnTheCrossButton() throws InterruptedException{

        //After that close the bar clicking on the cross button.
        myOrderPage.clickOnCloseButtonOnMessage();
        Thread.sleep(500);
    }

    @And("^I  Then MouseHover on \"([^\"]*)\" and Click on \"([^\"]*)\" button\\.$")
    public void iThenMouseHoverOnAndClickOnButton(String arg0, String arg1) throws InterruptedException {

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        homePage.MouseHooverOnShoppingCartLink();
        homePage.clickOnGoToCartElement();
        Thread.sleep(500);


    }

    @And("^I Verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String arg0) throws InterruptedException {

        //2.15 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), "Shopping cart");
        Thread.sleep(500);


    }

    @And("^I Change the Qty to \"([^\"]*)\" and Click on \"([^\"]*)\"$")
    public void iChangeTheQtyToAndClickOn(String arg0, String arg1) throws InterruptedException {

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.sendTextToQuantityField("2");
        shoppingCartPage.clickOnUpdateCartButton();
        Thread.sleep(500);


    }

    @And("^I  Verify the Total\"([^\"]*)\"$")
    public void iVerifyTheTotal(String arg0) throws InterruptedException {

        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.getTotalPrice(), "$2,950.00");
        Thread.sleep(1000);


    }

    @And("^I click on checkbox “I agree with the terms of service”$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() throws InterruptedException{

        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.checkOnTermAndConditions();
        Thread.sleep(500);

    }

    @And("^I Click on “CHECKOUT”$")
    public void iClickOnCHECKOUT() {

        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

    }

    @And("^I Verify the Text “Welcome, Please Sign In!”$")
    public void iVerifyTheTextWelcomePleaseSignIn() throws InterruptedException{

        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome, Please Sign In!");
    }

    @And("^I Click on “CHECKOUT AS GUEST” Tab$")
    public void iClickOnCHECKOUTASGUESTTab() {

        //2.21Click on “CHECKOUT AS GUEST” Tab
        loginPage.clickOnCheckoutGuestButton();

    }

    @And("^I Fill the all mandatory field$")
    public void iFillTheAllMandatoryField() throws InterruptedException{

        //2.22 Fill the all mandatory field
        checkOutPage.fillTheForm();
    }

    @And("^I Click on “CONTINUE”$")
    public void iClickOnCONTINUE() throws InterruptedException{

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonCheckout();

    }

    @And("^I Click on Radio Button “Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iClickOnRadioButtonNextDayAir$(int arg0, int arg1) throws InterruptedException{

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnNextDayAirDelivery();

    }

    @And("^I Click on “CONTINUE” bttn$")
    public void iClickOnCONTINUEBttn() {

        //2.25 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonDelivery();

    }

    @And("^I Select Radio Button “Credit Card”$")
    public void iSelectRadioButtonCreditCard() {

        //2.26 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCardPaymentMethod();
        checkOutPage.clickOnContinueButtonPayment();

    }

    @And("^I Select “Master card” From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {

        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectCreditCard(1);
    }

    @And("^I  Fill all the details$")
    public void iFillAllTheDetails() {

        //2.28 Fill all the details
        checkOutPage.fillThePaymentCardDetails();
    }

    @And("^I Click on button “CONTINUE”$")
    public void iClickOnButtonCONTINUE() {

        //2.29 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonCreditCard();
    }

    @And("^I Verify “Payment Method” is “Credit Card”$")
    public void iVerifyPaymentMethodIsCreditCard() {

        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkOutPage.getPaymentMethodText(), "Payment Method: Credit Card");


    }

    @And("^I Verify “Shipping Method” is “Next Day Air”$")
    public void iVerifyShippingMethodIsNextDayAir() {

        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkOutPage.getDeliveryMethodText(), "Shipping Method: Next Day Air");

    }

    @And("^I Verify Total is “\\$(\\d+),(\\d+)\\.(\\d+)”$")
    public void iVerifyTotalIs$(int arg0, int arg1, int arg2) {

        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(checkOutPage.getTotalPriceText(), "$2,950.00");

    }

    @And("^I Click on “CONFIRM”$")
    public void iClickOnCONFIRM() {

        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();
    }

    @And("^I Verify the Text “Thank You”$")
    public void iVerifyTheTextThankYou() {

        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(checkOutPage.getThankYouTextAfterOrderConfirmation(), "Thank you");

    }

    @And("^I Verify the message “Your order has been successfully processed!”$")
    public void iVerifyTheMessageYourOrderHasBeenSuccessfullyProcessed() {

        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkOutPage.getOrderProcessedSuccessfullyTextAfterOrderConfirmation(), "Your order has been successfully processed!");

    }

    @And("^I Click on btn “CONTINUE”$")
    public void iClickOnBtnCONTINUE() {

        //2.37 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonOnThankYouNote();

    }

    @Then("^I Verify the text “Welcome to our store”$")
    public void iVerifyTheTextWelcomeToOurStore() {

        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(homePage.getWelcomeText(), "Welcome to our store");

    }




    //////////// ----------  Electronic page ---------- //////////////

    @When("^I Mouse Hover as on “Electronics” Tab$")
    public void iMouseHoverAsOnElectronicsTab() {

        //2.1 Mouse Hover on “Electronics” Tab
        topMenuPage.hoverOverMenu("Electronics");

    }

    @And("^I Mouse Hover as on “Cell phones” and click$")
    public void iMouseHoverAsOnCellPhonesAndClick() {

        //2.2 Mouse Hover on “Cell phones” and click
        topMenuPage.selectMenu("Cell phones");

    }

    @And("^I Verify the text “Cell phones”$")
    public void iVerifyTheTextCellPhones() throws InterruptedException{

        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(topMenuPage.textOnEachPage(), "Cell phones");

    }


    @And("^I Click on List View Tab$")
    public void iClickOnListViewTab() throws InterruptedException {

        //2.4 Click on List View Tab
        productPage.clickOnListViewIcon();
        Thread.sleep(1500);


    }

    @And("^I Click on product name “Nokia Lumia    (\\d+)” link$")
    public void iClickOnProductNameNokiaLumiaLink(int arg0) throws InterruptedException{

        //2.5 Click on product name “Nokia Lumia 1020” link
        productPage.clickOnNokiaLumia();
        //productSelectionPage.clickOnTheProduct("Nokia Lumia 1020");
        Thread.sleep(500);

    }

    @And("^I Verify the text “Nokia Lumia    (\\d+)”$")
    public void iVerifyTheTextNokiaLumia(int arg0) throws InterruptedException{

        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(productPage.getProductName(), "Nokia Lumia 1020");
        Thread.sleep(500);
    }

    @And("^I Verify the price “\\$(\\d+)\\.(\\d+)”$")
    public void iVerifyThePrice$(int arg0, int arg1) throws InterruptedException{

        //2.7 Verify the price “$349.00”
        Assert.assertEquals(myOrderPage.getPrice(), "$349.00");
        Thread.sleep(500);

    }

    @And("^I Change quantity to$")
    public void iChangeQuantityTo() throws InterruptedException{

        //2.8 Change quantity to 2
        myOrderPage.sentTextToQuantityField("2");
        Thread.sleep(500);

    }

    @And("^I  Click on “ADD TO CART” tab$")
    public void iClickOnADDTOCARTTab() throws InterruptedException{

        //2.9 Click on “ADD TO CART” tab
        myOrderPage.clickOnAddToCartBtn();
        Thread.sleep(500);

    }

    @And("^I Verify the Message \"([^\"]*)\" on Top green Bar After that close the bar clicking on the cross button$")
    public void iVerifyTheMessageOnTopGreenBarAfterThatCloseTheBarClickingOnTheCrossButton(String arg0)throws InterruptedException{

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(myOrderPage.getMessageAfterAddingToCart(), "The product has been added to your shopping cart");
        //After that close the bar clicking on the cross button.
        myOrderPage.clickOnCloseButtonOnMessage();
        Thread.sleep(500);
    }

    @And("^I MouseHover on \"([^\"]*)\" and Click on \"([^\"]*)\" button$")
    public void iMouseHoverOnAndClickOnButton(String arg0, String arg1)throws InterruptedException{


        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        homePage.MouseHooverOnShoppingCartLink();
        homePage.clickOnGoToCartElement();
        Thread.sleep(500);


    }

    @And("^I Verify the message as \"([^\"]*)\"$")
    public void iVerifyTheMessageAs(String arg0)throws InterruptedException{

        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), "Shopping cart");
        Thread.sleep(500);


    }

    @And("^I Verify the quantity is$")
    public void iVerifyTheQuantityIs() throws InterruptedException{

        //2.13 Verify the quantity is 2
        Assert.assertEquals(shoppingCartPage.getQuantityInQtyField(), "2");
        Thread.sleep(500);

    }

    @And("^I Verify the Total \\$(\\d+)\\.(\\d+)$")
    public void iVerifyTheTotal$(int arg0, int arg1) throws InterruptedException{

        //2.14 Verify the Total $698.00
        Assert.assertEquals(shoppingCartPage.getTotalPrice(), "$698.00");
        Thread.sleep(500);

    }

    @And("^I click on checkbox as “I agree with the terms of service”$")
    public void iClickOnCheckboxAsIAgreeWithTheTermsOfService() throws InterruptedException{

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.checkOnTermAndConditions();
        Thread.sleep(500);
    }

    @And("^I Click on  CHECKOUT link$")
    public void iClickOnCHECKOUTLink() {

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

    }

    @And("^I Verify the Text of \"([^\"]*)\"$")
    public void iVerifyTheTextOf(String arg0)throws InterruptedException{

        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome, Please Sign In!");
        Thread.sleep(500);

    }
    @And("^I Click on “REGISTER” tab$")
    public void iClickOnREGISTERTab() {

        //2.18 Click on “REGISTER” tab
        loginPage.clickOnRegisterLink();

    }

    @And("^I Verify the text “Register”$")
    public void iVerifyTheTextRegister() throws InterruptedException{

        //2.19 Verify the text “Register”
        Assert.assertEquals(registrationPage.getRegisterPageText(), "Register");
        Thread.sleep(500);
    }

    @And("^I Fill the mandatory fields$")
    public void iFillTheMandatoryFields() throws InterruptedException{

        //2.20 Fill the mandatory fields
        registrationPage.registrationFormFillUp();
        Thread.sleep(2000);
    }

    @And("^I Click on “REGISTER” Button$")
    public void iClickOnREGISTERButton() {

        //2.21 Click on “REGISTER” Button
        registrationPage.clickOnRegisterButton();


    }

    @And("^I Verify the message “Your registration completed”$")
    public void iVerifyTheMessageYourRegistrationCompleted() throws InterruptedException{

        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals(registrationPage.getRegistrationSuccessfullyMessage(), "Your registration completed");
        Thread.sleep(500);
    }

    @And("^I Click on “CONTINUE” tab$")
    public void iClickOnCONTINUETab() {

        //2.23 Click on “CONTINUE” tab
        registrationPage.clickOnContinueButtonAfterRegistrationComplete();

    }

    @And("^I Verify the text “Shopping cart”$")
    public void iVerifyTheTextShoppingCart()  throws InterruptedException{

        //2.24 Verify the text “Shopping card”
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.getShoppingCartTextAgain(), "Shopping cart");
        Thread.sleep(1000);
        }

    @And("^I click on  checkbox link \"([^\"]*)\"$")
    public void iClickOnCheckboxLink(String arg0){

        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermAndConditions2();


    }

    @And("^I Click on  “CHECKOUT” link for product$")
    public void iClickOnCHECKOUTLinkForProduct() throws InterruptedException{

        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton2();
        Thread.sleep(500);
    }

    @And("^I Fill the Mandatory fields for reg$")
    public void iFillTheMandatoryFieldsForReg() {

        //2.27 Fill the Mandatory fields
        checkOutPage.fillUpForm();

    }

    @And("^I Click on  “CONTINUE” for further$")
    public void iClickOnCONTINUEForFurther() {

        //2.28 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonCheckout();

    }

    @And("^I Click on Radio Button “(\\d+)nd Day Air \\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iClickOnRadioButtonNdDayAir$(int arg0, int arg1, int arg2)throws InterruptedException {

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.clickOnSecondDayAirDelivery();
        Thread.sleep(500);
    }

    @And("^I Click on “CONTINUE” btn$")
    public void iClickOnCONTINUEBtn() {

        //2.30 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonDelivery();

    }
    @And("^I Select Radio Button for “Credit Card”$")
    public void iSelectRadioButtonForCreditCard() throws InterruptedException{

        //2.31 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCardPaymentMethod();
        checkOutPage.clickOnContinueButtonPayment();
        Thread.sleep(500);
    }
    @And("^I Select “Visa” From Select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() throws InterruptedException{

        //2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.selectCreditCard(0);
        Thread.sleep(500);
    }

    @And("^I Fill all the details for further$")
    public void iFillAllTheDetailsForFurther() throws InterruptedException{

        //2.33 Fill all the details
        checkOutPage.fillThePaymentCardDetails();
        Thread.sleep(500);

    }

    @And("^I Click on  “CONTINUE” bton$")
    public void iClickOnCONTINUEBton() {

        //2.34 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonCreditCard();

    }
    @And("^I Verify  of “Payment Method” is “Credit Card”$")
    public void iVerifyOfPaymentMethodIsCreditCard()throws InterruptedException {

        //2.35 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkOutPage.getPaymentMethodText(), "Payment Method: Credit Card");
        Thread.sleep(500);
    }

    @And("^I Verify “Shipping Method” is “(\\d+)nd Day Air”$")
    public void iVerifyShippingMethodIsNdDayAir(int arg0)throws InterruptedException {

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(checkOutPage.getDeliveryMethodText(), "Shipping Method: 2nd Day Air");
        Thread.sleep(500);
    }

    @And("^I Verify Total is “\\$(\\d+)\\.(\\d+)”$")
    public void iVerifyTotalIs$(int arg0, int arg1)throws InterruptedException {

        //2.37 Verify Total is “$698.00”
        Assert.assertEquals(checkOutPage.getTotalPriceText(), "$698.00");
        Thread.sleep(500);
    }

    @And("^I Click on  “CONFIRM” btn$")
    public void iClickOnCONFIRMBtn() {

        //2.38 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();

    }
    @And("^I Verify the Text appear“Thank You”$")
    public void iVerifyTheTextAppearThankYou() throws InterruptedException{

        //2.39 Verify the Text “Thank You”
        Assert.assertEquals(checkOutPage.getThankYouTextAfterOrderConfirmation(), "Thank you");
        Thread.sleep(500);
    }

    @And("^I Verify the  message as “Your order has been successfully processed!”$")
    public void iVerifyTheMessageAsYourOrderHasBeenSuccessfullyProcessed()throws InterruptedException {

        //2.40 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkOutPage.getOrderProcessedSuccessfullyTextAfterOrderConfirmation(), "Your order has been successfully processed!");
        Thread.sleep(500);
    }

    @And("^I Click on  “CONTINUE” for next step$")
    public void iClickOnCONTINUEForNextStep() throws InterruptedException {

        //2.41 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonOnThankYouNote();
        Thread.sleep(500);
    }

    @And("^I Verify text “Welcome to our store”$")
    public void iVerifyTextWelcomeToOurStore() throws InterruptedException{

        //2.42 Verify the text “Welcome to our store”
        Assert.assertEquals(homePage.getWelcomeText(), "Welcome to our store");
        Thread.sleep(500);
    }

    @And("^I Click on “Logout” link$")
    public void iClickOnLogoutLink() throws InterruptedException{

        //2.43 Click on “Logout” link
        homePage.clickOnLogOutLink();
        Thread.sleep(500);

    }

    @Then("^I verify the URL is “https://demo\\.nopcommerce\\.com/$")
    public void iVerifyTheURLIsHttpsDemoNopcommerceCom() {

        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        Assert.assertEquals(homePage.currentUrl(), "https://demo.nopcommerce.com/");
    }


}
