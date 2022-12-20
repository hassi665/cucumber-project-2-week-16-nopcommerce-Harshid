Feature: Checkout from shopping cart in Electronic
  As user I can add product add to cart and checkout from shopping cart sucessfully


  @sanity
  Scenario: User can add a product from Electronics page in shopping cart successfully and order successfully
    Given  I am on homepage
    When   I Mouse Hover as on “Electronics” Tab
    And    I Mouse Hover as on “Cell phones” and click
    And    I Verify the text “Cell phones”
    And    I Click on List View Tab
    And    I Click on product name “Nokia Lumia    020” link
    And    I Verify the text “Nokia Lumia    020”
    And    I Verify the price “$349.00”
    And    I Change quantity to
    And    I  Click on “ADD TO CART” tab
    And    I Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button
    And    I MouseHover on "Shopping cart" and Click on "GO TO CART" button
    And    I Verify the message as "Shopping cart"
    And    I Verify the quantity is
    And    I Verify the Total $698.00
    And    I click on checkbox as “I agree with the terms of service”
    And    I Click on  CHECKOUT link
    And    I Verify the Text of "Welcome, Please Sign In!"
    And    I Click on “REGISTER” tab
    And    I Verify the text “Register”
    And    I Fill the mandatory fields
    And    I Click on “REGISTER” Button
    And    I Verify the message “Your registration completed”
    And    I Click on “CONTINUE” tab
    And    I Verify the text “Shopping card”
    And    I click on  checkbox link "I agree with the terms of service"
    And    I Click on  “CHECKOUT” link for product
    And    I Fill the Mandatory fields for reg
    And    I Click on  “CONTINUE” for further
    And    I Click on Radio Button “2nd Day Air ($0.00)”
    And    I Click on “CONTINUE” btn
    And    I Select Radio Button for “Credit Card”
    And    I Select “Visa” From Select credit card dropdown
    And    I Fill all the details for further
    And    I Click on  “CONTINUE” bton
    And    I Verify  of “Payment Method” is “Credit Card”
    And    I Verify “Shipping Method” is “2nd Day Air”
    And    I Verify Total is “$698.00”
    And    I Click on  “CONFIRM” btn
    And    I Verify the Text appear“Thank You”
    And    I Verify the  message as “Your order has been successfully processed!”
    And    I Click on  “CONTINUE” for next step
    And    I Verify text “Welcome to our store”
    And    I Click on “Logout” link
    Then   I verify the URL is “https://demo.nopcommerce.com/