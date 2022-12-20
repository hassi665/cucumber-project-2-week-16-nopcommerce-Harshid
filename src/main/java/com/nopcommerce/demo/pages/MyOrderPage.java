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

public class MyOrderPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyOrderPage.class.getName());

    public MyOrderPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement selectModel;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement selectVistaPremium;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement selectTotalCommander;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement textAfterAddingToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButtonOnMessage;

    public String getProductName() {

        String text = getTextFromElement(productName);
        log.info("The product " + productName.toString());
        return text;
    }

    public void selectYourOwnProcessor(String process) {

        selectByVisibleTextFromDropDown(selectProcessor, process);
        log.info("Select the processor " + selectProcessor.toString());

    }


    public void SelectAppropriateRam(String ram) {

        selectByVisibleTextFromDropDown(selectRam, ram);
        log.info("Select RAM " + selectRam.toString());

    }

    public void clickAndSelectHDD() {

        clickOnElement(selectModel);
        log.info("Select HDD " + selectModel.toString());

    }

    public void clickAndSelectOsPremium() {

        clickOnElement(selectVistaPremium);
        log.info("Click on OS Premium " + selectVistaPremium.toString());

    }

    public void clickAndSelectTotalCmndr() {

        clickOnElement(selectTotalCommander);
        log.info("Click on Total Commander " + selectTotalCommander.toString());

    }

    public String getPrice() {

        String text = getTextFromElement(productPrice);
        log.info("The price is " + productPrice.toString());
        return text;
    }

    public void clickOnAddToCartBtn() {

        clickOnElement(addToCart);
        log.info("Click on add card button " + addToCart.toString());
    }

    public String getMessageAfterAddingToCart() {

        String text = getTextFromElement(textAfterAddingToCart);
        log.info("The Message after Adding to cart is " + textAfterAddingToCart.toString());
        return text;
    }


    public void clickOnCloseButtonOnMessage() {

        clickOnElement(closeButtonOnMessage);
        log.info("Click on close Button on Message " + closeButtonOnMessage.toString());

    }

    public void sentTextToQuantityField(String qty) {

        clearTextFromField(quantity);
        log.info("Clear quantity field " + quantity.toString());
        sendTextToElement(quantity, qty);

    }
}
