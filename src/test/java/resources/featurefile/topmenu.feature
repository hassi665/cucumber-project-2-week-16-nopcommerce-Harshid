Feature: Topmenu functionality
  As user I can check all topmenu's functionalities

  @regression
  Scenario: User can navigate to other page by passing name in method
    Given I am on homepage
    When  I passed parameter Electronics & verify page nevigated to the right place
    And   I passed parameter Computers & verify page nevigated to the right place
    Then  I can see the right pages

