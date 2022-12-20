package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeTextMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/child::*")
    List<WebElement> categoriesList;

    public void clickOnLoginLink() {

        clickOnElement(loginLink);
        log.info("Click on login link " + loginLink.toString());

    }

    public void clickOnRegisterLink() {

        clickOnElement(registerLink);
        log.info("Click on Register link " + registerLink.toString());

    }


    public void MouseHooverOnShoppingCartLink() {

        mouseHoverToElement(shoppingCartLink);
        log.info("Click on Shopping cart link " + shoppingCartLink.toString());
    }

    public void clickOnGoToCartElement() {

        clickOnElement(goToCartLink);
        log.info("Click on Go to Cart " + goToCartLink.toString());

    }

    public String getWelcomeText() {

        String text = getTextFromElement(welcomeTextMessage);
        log.info("The welcome text " + welcomeTextMessage.toString());
        return text;
    }

    public void clickOnLogOutLink() {

        clickOnElement(logoutLink);
        log.info("Click on logout link " + logoutLink.toString());

    }

    public String currentUrl() {

        String url = driver.getCurrentUrl();
        log.info("The url is " );
        return url;
    }

    public void selectCategory(String cat) {

        List<WebElement> catList = categoriesList;
        try {
            for (WebElement list : catList) {
                if (list.getText().equalsIgnoreCase(cat)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            catList = categoriesList;
        }
        log.info("The Category List is " + categoriesList.toString());
    }

}
