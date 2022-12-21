Feature: Topmenu functionality
  As user I can check all topmenu's functionalities

  @regression
  Scenario: User Should navigate to selected page
    Given  I am on homepage
    When   I select any top menu's option
    And    I click on submenu option
    Then   I can see redirected page name

