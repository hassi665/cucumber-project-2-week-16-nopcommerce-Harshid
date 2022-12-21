package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement telephoneNoField;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonCheckout;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayDelivery;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement nextSecondDayDelivery;
    @CacheLookup
    @FindBy(xpath = "//button[@class ='button-1 shipping-method-next-step-button']")
    WebElement continueButtonDelivery;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPayment;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCardFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardholderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonthFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYearFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeFiled;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonCreditCard;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentMethodText;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]")
    WebElement totalFinalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderProcessedMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonOnThankYouNote;


    public void sendTextToFirstNameField(String fName) {

        sendTextToElement(firstNameField, fName);
        log.info("Enter user first name " + fName + " to firstname field " + firstNameField.toString());


    }

    public void sendTextToLastNameField(String lName) {

        sendTextToElement(lastNameField, lName);
        log.info("Enter user last name " + lName + " to lastname field " + lastNameField.toString());

    }

    public void sendTextTOEmailField(String gEmail) {

        sendTextToElement(emailIdField, gEmail + getAlphaNumericString(2) + "@gmail.com");
        log.info("Enter user email " + gEmail + " to Email field " + emailIdField.toString());

    }

    public void sendTextToCityField(String gCity) {

        sendTextToElement(cityField, gCity);
        log.info("Enter city name " + gCity + " to City field " + cityField.toString());

    }

    public void selectACountryInCountryField(String gCountry) {

        selectByVisibleTextFromDropDown(countryField, gCountry);
        log.info("Select a country" + countryField.toString());
    }

    public void sendTextToAddressField(String gAddress) {

        sendTextToElement(addressField, gAddress);
        log.info("Enter Address " + gAddress + " to Address field " + addressField.toString());

    }

    public void sendTextToPostCodeField(String gPostCode) {

        sendTextToElement(postCodeField, gPostCode);
        log.info("Enter postcode " + gPostCode + " to Postcode field " + postCodeField.toString());
    }


    public void sendTextToPhoneField(String gtele) {

        sendTextToElement(telephoneNoField, gtele);
        log.info("Enter telephone number " + gtele + " to Telephone Number field " + telephoneNoField.toString());

    }

    public void clickOnContinueButtonCheckout() {

        clickOnElement(continueButtonCheckout);
        log.info("Clicking on continue Button " + continueButtonCheckout.toString());

    }

    public void clickOnNextDayAirDelivery() {

        clickOnElement(nextDayDelivery);
        log.info("Click on Next Day Air Delivery Button " + nextDayDelivery.toString());
    }

    public void clickOnSecondDayAirDelivery() {

        clickOnElement(nextSecondDayDelivery);
        log.info("Click on Second Day Air Delivery Button " + nextSecondDayDelivery.toString());
    }

    public void clickOnContinueButtonDelivery() {

        clickOnElement(continueButtonDelivery);
        log.info("Click on continue Button on delivery section " + continueButtonDelivery.toString());

    }

    public void clickOnCreditCardPaymentMethod() {

        clickOnElement(creditCardPaymentMethod);
        log.info("Clicking on Credit Card Payment Button " + creditCardPaymentMethod.toString());
    }

    public void clickOnContinueButtonPayment() {

        clickOnElement(continueButtonPayment);
        log.info("Click on continue Button on payment method " + continueButtonPayment.toString());

    }


    public void selectCreditCard(int cCard) {

        selectByIndexFromDropDown(selectCreditCardFiled, cCard);
        log.info("Select Credit " + selectCreditCardFiled.toString());

    }

    public void sendTextToCardholderNameField(String cardholder) {

        sendTextToElement(cardholderNameField, cardholder);
        log.info("Enter cardholder name " + cardholder + " to Cardholder Name field " + cardholderNameField.toString());


    }

    public void sendTextToCardNumberField(String cardNumber) {

        sendTextToElement(cardNumberFiled, cardNumber);
        log.info("Enter card number " + cardNumber + " to Telephone Number field " + cardholderNameField.toString());

    }

    public void selectExpiryMonth(String month) {

        selectByValueFromDropDown(expiryMonthFiled, month);
        log.info("Enter expiry month " + month + " to Telephone Number field " + expiryMonthFiled.toString());

    }

    public void selectExpiryYear(String year) {

        selectByValueFromDropDown(expiryYearFiled, year);
        log.info("Enter expiry year " + year + " to Telephone Number field " + expiryYearFiled.toString());

    }

    public void sendTextToCardCodeField(String cardCode) {

        sendTextToElement(cardCodeFiled, cardCode);
        log.info("Enter card code number " + cardCode + " to Telephone Number field " + cardCodeFiled.toString());


    }

    public void clickOnContinueButtonCreditCard() {

        clickOnElement(continueButtonCreditCard);
        log.info("Click on continue Button on card section " + continueButtonCreditCard.toString());


    }

    public String getPaymentMethodText() {

        String text = getTextFromElement(paymentMethodText);
        log.info("The payment method text " + paymentMethodText.toString());
        return text;

    }

    public String getDeliveryMethodText() {

        String text = getTextFromElement(shippingMethod);
        log.info("The delivery method text " + shippingMethod.toString());
        return text;

    }

    public String getTotalPriceText() {

        String text = getTextFromElement(totalFinalPrice);
        log.info("The total price text " + totalFinalPrice.toString());
        return text;
    }

    public void clickOnConfirmButton() {

        clickOnElement(confirmButton);
        log.info("Click on confirm Button " + confirmButton.toString());


    }

    public String getThankYouTextAfterOrderConfirmation() {

        String message = getTextFromElement(thankYouText);
        log.info("The thank you text " + thankYouText.toString());
        return message;
    }

    public String getOrderProcessedSuccessfullyTextAfterOrderConfirmation() {

        String text = getTextFromElement(orderProcessedMessage);
        log.info("The order process Successful text " + orderProcessedMessage.toString());
        return text;
    }

    public void clickOnContinueButtonOnThankYouNote() {

        clickOnElement(continueButtonOnThankYouNote);
        log.info("Click on continue Button after thank you " + continueButtonOnThankYouNote.toString());
    }

    public void fillTheForm() {

        sendTextToFirstNameField("Harshid");
        sendTextToLastNameField("Patel");
        sendTextTOEmailField("harshid.prime");
        selectACountryInCountryField("United Kingdom");
        sendTextToCityField("London");
        sendTextToAddressField("1 London Street");
        sendTextToPostCodeField("EN17NJ");
        sendTextToPhoneField("07418529631");

    }

    public void fillThePaymentCardDetails() {

        sendTextToCardholderNameField("Harshid");
        sendTextToCardNumberField("5555555555554444");
        selectExpiryMonth("5");
        selectExpiryYear("2025");
        sendTextToCardCodeField("123");
    }

    public void fillUpForm() {

        selectACountryInCountryField("United Kingdom");
        sendTextToCityField("London");
        sendTextToAddressField("1 London Street");
        sendTextToPostCodeField("EN17NJ");
        sendTextToPhoneField("07418529631");

    }
}
