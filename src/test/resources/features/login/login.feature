Feature: Login

  Scenario: Login with valid credentials
    Given user is on login page
    When user enter "admin@local" as username
    And user enter "ramo@123!@#" as password
    Then user dashboard should be displayed

  Scenario: Login with invalid username and valid password
    Given user is on login page
    When user enter "a" as username
    And user enter "ramo@123!@#" as password
    Then user dashboard should not be displayed

  Scenario: Login with valid username and invalid password
    Given user is on login page
    When user enter "admin@local" as username
    And user enter "ramo" as password
    Then user dashboard should not be displayed

  Scenario: Login with empty username and password
    Given user is on login page
    When user enter "" as username
    And user enter "" as password
    Then user dashboard should not be displayed