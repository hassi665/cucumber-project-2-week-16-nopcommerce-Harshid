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

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement quantityField;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary'][1]/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termAndConditions;

    @CacheLookup
    @FindBy(name = "checkout")
    WebElement checkoutButton;


    public String getShoppingCartText() throws InterruptedException {

        String text = getTextFromElement(shoppingCartText);
        Thread.sleep(2000);
        log.info("Shopping cart" + shoppingCartText.toString());
        return text;
    }


    public void sendTextToQuantityField(String qty) {

        clearTextFromField(quantityField);
        log.info("Clear quantity" + quantityField.toString());

        sendTextToElement(quantityField, qty);
        log.info("new quantity" + quantityField.toString());
    }

    public void clickOnUpdateCartButton() {

        clickOnElement(updateCartButton);
        log.info("Click on Update Cart Button " + updateCartButton.toString());

    }


    public String getTotalPrice() {

        String text = getTextFromElement(totalPrice);
        log.info("total price :" + totalPrice.toString());
        return text;
    }

    public void checkOnTermAndConditions() {

        clickOnElement(termAndConditions);
        log.info("Click and checked on erm and conditions box" + termAndConditions.toString());


    }

    public void clickOnCheckoutButton() {

        clickOnElement(checkoutButton);
        log.info("Click on checkout button " + checkoutButton.toString());

    }

    public String getQuantityInQtyField() {

        log.info("Quantity is " + quantityField.toString());
        WebElement actualQuantity = quantityField;
        String actual = actualQuantity.getAttribute("value");
        return actual;
    }

    public String getShoppingCartTextAgain() {

        String text = getTextFromElement(shoppingCartText);
        log.info("The shopping cart text " + shoppingCartText.toString());
        return text;
    }

    public void clickOnTermAndConditions2() {

        clickOnElement(termAndConditions);
        log.info("Click on erm and conditions box" + termAndConditions.toString());


    }

    public void clickOnCheckoutButton2() {

        clickOnElement(checkoutButton);
        log.info("Click on checkout button " + checkoutButton.toString());

    }

}
