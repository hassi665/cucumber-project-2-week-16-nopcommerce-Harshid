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

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuest;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerButton;

    public String getWelcomeText() {

        String text = getTextFromElement(welcomeText);
        log.info("The Welcome text " + welcomeText.toString());
        return text;
    }

    public void enterEmailId(String userEmail) {

        sendTextToElement(emailField, userEmail);
        log.info("Enter Email ID " + userEmail + " to Email field " + emailField.toString());

    }

    public void enterPassword(String userPassword) {

        sendTextToElement(passwordField, userPassword);
        log.info("Enter password  " + userPassword + " to password field " + passwordField.toString());
    }

    public void clickOnLogInButton() {

        clickOnElement(loginButton);
        log.info("Click on Login Button " + loginButton.toString());
    }

    public String getErrorMessage() {

        String message = getTextFromElement(errorMessage);
        log.info("The Error Message " + errorMessage.toString());
        return message;
    }

    public void clickOnCheckoutGuestButton() {

        clickOnElement(checkoutAsGuest);
        log.info("Click on checkout Button in guest section " + checkoutAsGuest.toString());
    }

    public void clickOnRegisterLink() {

        clickOnElement(registerButton);
        log.info("Click on Register Button " + registerButton.toString());
    }
}
