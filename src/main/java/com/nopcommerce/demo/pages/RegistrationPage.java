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

public class RegistrationPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[1]")
    WebElement maleGender;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[2]")
    WebElement femaleGender;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccessfulText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAfterRegistrationComplete;


    public String getRegisterPageText() {

        String text = getTextFromElement(registerText);
        log.info("The Register Page text " + registerText.toString());
        return text;
    }

    public void selectGenderOnRegistrationPage(String gender) {
        log.info("Select Gender ");
        if (gender.equalsIgnoreCase("Male")) {
            clickOnElement(maleGender);
        } else if (gender.equalsIgnoreCase("Female")) {
            clickOnElement(femaleGender);
        }

    }

    public void sendTextToFirstNameField(String fName) {

        sendTextToElement(firstNameField, fName);
        log.info("Enter user first name " + fName + " to firstname field " + firstNameField.toString());

    }

    public void sendTextToLastNameField(String lName) {

        sendTextToElement(lastNameField, lName);
        log.info("Enter user last name " + lName + " to lastname field " + lastNameField.toString());

    }

    public void selectDayOfBirth(String day) {

        selectByValueFromDropDown(dateOfBirthDay, day);
        log.info("Select Day of Birth " + dateOfBirthDay.toString());
    }

    public void selectDayOfMonth(String month) {

        selectByValueFromDropDown(dateOfBirthMonth, month);
        log.info("Select Month of Birth " + dateOfBirthMonth.toString());
    }

    public void selectDayOfYear(String year) {

        selectByValueFromDropDown(dateOfBirthYear, year);
        log.info("Select Month of Birth " + dateOfBirthYear.toString());
    }

    public void sendTextToEmailField(String email) {

        sendTextToElement(emailId, email + getAlphaNumericString(2) + "@gmail.com");
        log.info("Enter user email " + email + " to Email field " + emailId.toString());
    }


    public void sendTextToPasswordField(String rPassword) {

        sendTextToElement(password, rPassword);
        log.info("Enter Password " + rPassword + " to password field " + password.toString());
    }

    public void sendTextToConfirmPasswordField(String cPassword) {

       sendTextToElement(confirmPassword, cPassword);
        log.info("Enter Password again " + cPassword + " to Confirm Password field " + confirmPassword.toString());
    }


    public void clickOnRegisterButton() {

        clickOnElement(registerButton);
        log.info("Click On Register " + registerButton.toString());
    }

    public String getRegistrationSuccessfullyMessage() {

        String message = getTextFromElement(registrationSuccessfulText);
        log.info("The Registration successful text " + registrationSuccessfulText.toString());
        return message;
    }

    public void clickOnContinueButtonAfterRegistrationComplete() {

         clickOnElement(continueButtonAfterRegistrationComplete);
        log.info("Click on Continue Button After Registration is Completed " + continueButtonAfterRegistrationComplete.toString());
    }

    public void registrationFormFillUp( ){

            selectGenderOnRegistrationPage("Male");
            sendTextToFirstNameField("Axay");
            sendTextToLastNameField("Kumar");
            selectDayOfBirth("1");
            selectDayOfMonth("5");
            selectDayOfYear("1988");
            sendTextToEmailField("Axay.kumar");
            sendTextToPasswordField("Axay123");
            sendTextToConfirmPasswordField("Axay123");
    }

}
