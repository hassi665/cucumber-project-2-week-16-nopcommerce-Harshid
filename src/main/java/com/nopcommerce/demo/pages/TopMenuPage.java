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

import java.util.List;

public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']//ul/child::*")
    List<WebElement> topMenuBar;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement pageTitle;

    public void selectMenu(String menu) {

        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(menu)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
        log.info("Menu option selected" + topMenuBar.toString());
    }

    public void hoverOverMenu(String mMenu) {

        Actions actions = new Actions(driver);
        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(mMenu)) {
                    actions.moveToElement(list).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
        log.info("Menu option selected" + topMenuBar.toString());

    }

    //This method will return title of each page for verification purpose
    public String textOnEachPage() {

        String text = getTextFromElement(pageTitle);
        log.info("The page title are " + pageTitle.toString());
        return text;
    }
}
