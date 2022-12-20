$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProductPageNavigation.feature");
formatter.feature({
  "line": 1,
  "name": "Products Page Functionality",
  "description": "As user I can navigate to page as per requirement",
  "id": "products-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3835373801,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User can see product in Electronics page in arrange alphabetically",
  "description": "",
  "id": "products-page-functionality;user-can-see-product-in-electronics-page-in-arrange-alphabetically",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    },
    {
      "line": 13,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am at homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I Mouse Hover on “Electronics” Tab",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I Mouse Hover on “Cell phones” and click",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Verify the text “Cell phones",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerPageTestSteps.iAmAtHomepage()"
});
formatter.result({
  "duration": 103701199,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicPageTestSteps.iMouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 515709100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicPageTestSteps.iMouseHoverOnCellPhonesAndClick()"
});
formatter.result({
  "duration": 561862700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicPageTestSteps.iVerifyTheTextCellPhones()"
});
formatter.result({
  "duration": 24450600,
  "status": "passed"
});
formatter.after({
  "duration": 628460301,
  "status": "passed"
});
formatter.uri("computer.feature");
formatter.feature({
  "line": 1,
  "name": "Product sucessfully added in shopping cart",
  "description": "As user I can add product in shopping cart successfully",
  "id": "product-sucessfully-added-in-shopping-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3040970100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can add a product from Computer page in shopping cart successfully",
  "description": "",
  "id": "product-sucessfully-added-in-shopping-cart;user-can-add-a-product-from-computer-page-in-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Click on Computer Menu.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Click on Desktop",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Select Sort By position \"Name: A to Z\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Add To Cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Verify the Text \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Select \" GHz Intel Pentium Dual-Core E2200\" using Select class",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Select 8GB HDD using Select class.",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Select HDD radio \"400 GB [+$100.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Select OS radio \"Vista Premium [+$60.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Check Two Check boxes \"Microsoft Office [+$50.00]\" and \"Total Commander [+$5.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Verify the price \"$1,475.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Click on \"ADD TO CARD\" Button.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Verify the Message \"The product has been added to your shopping cart\" on Top green Bar",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I After that close the bar clicking on the cross button.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I  Then MouseHover on \"Shopping cart\" and Click on \"GO TO CART\" button.",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Verify the message \"Shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I Change the Qty to \"2\" and Click on \"Update shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I  Verify the Total\"$2,950.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on checkbox “I agree with the terms of service”",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Click on “CHECKOUT”",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I Verify the Text “Welcome, Please Sign In!”",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Click on “CHECKOUT AS GUEST” Tab",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Fill the all mandatory field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I Click on “CONTINUE”",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I Click on Radio Button “Next Day Air($0.00)”",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Click on “CONTINUE” bttn",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Select Radio Button “Credit Card”",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I Select “Master card” From Select credit card dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I  Fill all the details",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Click on button “CONTINUE”",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I Verify “Payment Method” is “Credit Card”",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I Verify “Shipping Method” is “Next Day Air”",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I Verify Total is “$2,950.00”",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I Click on “CONFIRM”",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I Verify the Text “Thank You”",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I Verify the message “Your order has been successfully processed!”",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I Click on btn “CONTINUE”",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I Verify the text “Welcome to our store”",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 1013200,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnComputerMenu()"
});
formatter.result({
  "duration": 932451900,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 362719500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: A to Z",
      "offset": 27
    }
  ],
  "location": "ShoppingCartSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 222065801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add To Cart",
      "offset": 12
    }
  ],
  "location": "ShoppingCartSteps.iClickOn(String)"
});
formatter.result({
  "duration": 102345000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 19
    }
  ],
  "location": "ShoppingCartSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 20046034400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027product-name\u0027]/h1\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [4ee215dd3ce0d3d26d384c036106c759, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027product-name\u0027]/h1}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\H\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:50252}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50252/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4ee215dd3ce0d3d26d384c036106c759\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.getText(Unknown Source)\r\n\tat com.nopcommerce.demo.utility.Utility.getTextFromElement(Utility.java:61)\r\n\tat com.nopcommerce.demo.pages.MyOrderPage.getProductName(MyOrderPage.java:59)\r\n\tat com.nopcommerce.demo.steps.ShoppingCartSteps.iVerifyTheText(ShoppingCartSteps.java:63)\r\n\tat ✽.And I Verify the Text \"Build your own computer\"(computer.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": " GHz Intel Pentium Dual-Core E2200",
      "offset": 10
    }
  ],
  "location": "ShoppingCartSteps.iSelectUsingSelectClass(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 9
    }
  ],
  "location": "ShoppingCartSteps.iSelectGBHDDUsingSelectClass(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400 GB [+$100.00]",
      "offset": 20
    }
  ],
  "location": "ShoppingCartSteps.iSelectHDDRadio(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Premium [+$60.00]",
      "offset": 19
    }
  ],
  "location": "ShoppingCartSteps.iSelectOSRadio(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft Office [+$50.00]",
      "offset": 25
    },
    {
      "val": "Total Commander [+$5.00]",
      "offset": 58
    }
  ],
  "location": "ShoppingCartSteps.iCheckTwoCheckBoxesAnd(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,475.00",
      "offset": 20
    }
  ],
  "location": "ShoppingCartSteps.iVerifyThePrice(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ADD TO CARD",
      "offset": 12
    }
  ],
  "location": "ShoppingCartSteps.iClickOnButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 22
    }
  ],
  "location": "ShoppingCartSteps.iVerifyTheMessageOnTopGreenBar(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iAfterThatCloseTheBarClickingOnTheCrossButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 23
    },
    {
      "val": "GO TO CART",
      "offset": 52
    }
  ],
  "location": "ShoppingCartSteps.iThenMouseHoverOnAndClickOnButton(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 22
    }
  ],
  "location": "ShoppingCartSteps.iVerifyTheMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    },
    {
      "val": "Update shopping cart",
      "offset": 38
    }
  ],
  "location": "ShoppingCartSteps.iChangeTheQtyToAndClickOn(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,950.00",
      "offset": 20
    }
  ],
  "location": "ShoppingCartSteps.iVerifyTheTotal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnCheckboxIAgreeWithTheTermsOfService()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnCHECKOUT()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iVerifyTheTextWelcomePleaseSignIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnCHECKOUTASGUESTTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iFillTheAllMandatoryField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnCONTINUE()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 39
    },
    {
      "val": "00",
      "offset": 41
    }
  ],
  "location": "ShoppingCartSteps.iClickOnRadioButtonNextDayAir$(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnCONTINUEBttn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iSelectRadioButtonCreditCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iSelectMasterCardFromSelectCreditCardDropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iFillAllTheDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnButtonCONTINUE()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iVerifyPaymentMethodIsCreditCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iVerifyShippingMethodIsNextDayAir()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    },
    {
      "val": "950",
      "offset": 22
    },
    {
      "val": "00",
      "offset": 26
    }
  ],
  "location": "ShoppingCartSteps.iVerifyTotalIs$(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnCONFIRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iVerifyTheTextThankYou()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iVerifyTheMessageYourOrderHasBeenSuccessfullyProcessed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnBtnCONTINUE()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCartSteps.iVerifyTheTextWelcomeToOurStore()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 830411800,
  "status": "passed"
});
});