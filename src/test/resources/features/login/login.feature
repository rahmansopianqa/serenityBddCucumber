Feature: Login

  Scenario: Login with valid user
    Given user is on login page
    When user enter admin@local as username
    And user enter ramo@123!@# as password
    Then user should be able to login

