Feature: Taxes


  Background:User login with valid credentials
    Given User navigate to login page
    When User enter "admin@local" as username
    And User enter "ramo@123!@#" as password

  @SmokeTest
  Scenario: User wants to see taxes list
    Given User click Master Data Menu
    When User click Taxes Menu
    Then Taxes list should be displayed


  Scenario: User create taxes with valid data
    Given User click Master Data Menu
    When User click Taxes Menu
    And User click add taxes
    And User choose type PPN, input "11" as rate, input "PPN 11%" as description
    And User click button save
    Then Taxes should be created