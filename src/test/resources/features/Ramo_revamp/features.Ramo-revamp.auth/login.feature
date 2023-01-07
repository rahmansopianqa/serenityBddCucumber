Feature: Login


  Scenario Outline: User login with valid credentials
    Given User navigate to login page
    When User enter "<username>" as username
    And User enter "<password>" as password
    Then User dashboard should be displayed
    Examples:
      | username    | password    |
      | admin@local | ramo@123!@# |


  Scenario Outline: User login with invalid username and valid password
    Given User navigate to login page
    When User enter "<username>" as username
    And User enter "<password>" as password
    Then User dashboard should not be displayed
    Examples:
      | username | password    |
      | a        | ramo@123!@# |


  Scenario Outline: User login with valid username and invalid password
    Given User navigate to login page
    When User enter "<username>" as username
    And User enter "<password>" as password
    Then User dashboard should not be displayed
    Examples:
      | username    | password |
      | admin@local | ramo     |

  Scenario Outline: User login with empty username and password
    Given User navigate to login page
    When User enter "<username>" as username
    And User enter "<password>" as password
    Then User dashboard should not be displayed
    Examples:
      | username | password |
      |          |          |