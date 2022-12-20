Feature: Product sucessfully added in shopping cart
  As user I can add product in shopping cart successfully

  @smoke
  Scenario: User can add a product from Computer page in shopping cart successfully
    Given I am on homepage
    When  I Click on Computer Menu.
    And   I Click on Desktop
    And   I Select Sort By position "Name: A to Z"
    And   I click on "Add To Cart"
    And   I Verify the Text "Build your own computer"
    And   I Select " GHz Intel Pentium Dual-Core E2200" using Select class
    And   I Select 8GB HDD using Select class.
    And   I Select HDD radio "400 GB [+$100.00]"
    And   I Select OS radio "Vista Premium [+$60.00]"
    And   I Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    And   I Verify the price "$1,475.00"
    And   I Click on "ADD TO CARD" Button.
    And   I Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And   I After that close the bar clicking on the cross button.
    And   I  Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    And   I Verify the message "Shopping cart"
    And   I Change the Qty to "2" and Click on "Update shopping cart"
    And   I  Verify the Total"$2,950.00"
    And   I click on checkbox “I agree with the terms of service”
    And   I Click on “CHECKOUT”
    And   I Verify the Text “Welcome, Please Sign In!”
    And   I Click on “CHECKOUT AS GUEST” Tab
    And   I Fill the all mandatory field
    And   I Click on “CONTINUE”
    And   I Click on Radio Button “Next Day Air($0.00)”
    And   I Click on “CONTINUE” bttn
    And   I Select Radio Button “Credit Card”
    And   I Select “Master card” From Select credit card dropdown
    And   I  Fill all the details
    And   I Click on button “CONTINUE”
    And   I Verify “Payment Method” is “Credit Card”
    And   I Verify “Shipping Method” is “Next Day Air”
    And   I Verify Total is “$2,950.00”
    And   I Click on “CONFIRM”
    And   I Verify the Text “Thank You”
    And   I Verify the message “Your order has been successfully processed!”
    And   I Click on btn “CONTINUE”
    Then  I Verify the text “Welcome to our store”

    
