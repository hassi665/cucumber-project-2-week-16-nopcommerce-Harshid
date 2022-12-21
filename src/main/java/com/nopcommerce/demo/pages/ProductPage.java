package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-grid']//child::*")
    List<WebElement> listOfProductsOptions;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/div//h2")
    List<WebElement> productsList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-grid']//div[1]/div[2]//h2")
    WebElement productTitle;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement mobileNokia;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1")
    WebElement mobileNokiaName;


    public String getProductName() {

        String text = getTextFromElement(mobileNokiaName);
        log.info("The product " + mobileNokiaName.toString());
        return text;
    }

    public void selectSortByType(String sortByType) {

        selectByVisibleTextFromDropDown(sortBy, sortByType);
        log.info("Select Sort By" + sortBy.toString());

    }

    public void selectAddToCartProduct(String product) {

        List<WebElement> productsList = listOfProductsOptions;
        try {
            for (WebElement list : productsList) {
                if (list.getText().equalsIgnoreCase(product)) {
                    Actions actions = new Actions(driver);
                    WebElement addCart = addToCartButton;
                    actions.click(addCart).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            productsList = listOfProductsOptions;
        }
        log.info("List of Products" + listOfProductsOptions.toString());
    }

    public ArrayList beforeSortTheProducts() {

        log.info("Product List" + productsList.toString());

        List<WebElement> products = productsList;
        ArrayList<String> originalProductList = new ArrayList<>();
        for (WebElement list : products) {
            originalProductList.add(list.getText());
        }
        return originalProductList;
    }

    public ArrayList afterSortingTheProducts() {
        log.info("List of Products after sorting" + productsList.toString());

        System.out.println(beforeSortTheProducts());
        Collections.reverse(beforeSortTheProducts());
        System.out.println(beforeSortTheProducts());
        List<WebElement> products = productsList;
        ArrayList<String> afterSortList = new ArrayList<>();
        for (WebElement newList : products) {
            afterSortList.add(newList.getText());
        }

        return afterSortList;
    }

    public void clickOnListViewIcon() {

        clickOnElement(listView);
        log.info("Click on List view" + listView.toString());
    }


    public void clickOnTheProduct(String product) {

        List<WebElement> productList = listOfProductsOptions;
        try {
            for (WebElement list : productList) {
                if (list.getText().equalsIgnoreCase(product)) {
                    Actions actions = new Actions(driver);
                    WebElement products = productTitle;
                    actions.moveToElement(products).click().build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            productList = listOfProductsOptions;
        }
        log.info("Select a product" + listOfProductsOptions.toString());
    }

    public void clickOnNokiaLumia() {

        clickOnElement(mobileNokia);
        log.info("Click on Nokia Lumia" + mobileNokia.toString());

    }

}
