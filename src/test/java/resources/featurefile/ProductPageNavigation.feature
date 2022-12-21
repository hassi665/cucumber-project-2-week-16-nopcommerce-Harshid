Feature: Products Page Functionality
  As user I can navigate to page as per requirement

  @smoke @regression
  Scenario: User can see product in Computer page in arrange alphabetically
    Given I am at homepage
    When  I Click on Computers Menu
    And   I click on Desktops
    And   I Select option Sort By position "Name: Z to A"
    And   I Verify the Product will arrange in Descending order.


  @sanity @regression
  Scenario: User can see product in Electronics page in arrange alphabetically
    Given I am at homepage
    When  I Mouse Hover on “Electronics” Tab
    And   I Mouse Hover on “Cell phones” and click
    And   I Verify the text “Cell phones
    







