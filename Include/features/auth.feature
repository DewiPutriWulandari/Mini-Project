Feature: Authorization

  @Register-With-Valid-Data
  Scenario: User has successfully registered
    Given User on the register page
    When User input fullname
    And User input email
    And User input password
    Then User click register button

  @Register-With-Email_Already-Use
  Scenario: User can not successfully registered
    Given User is on the register page
    When User input fullname already use
    And User input email already use
    And User input password already use
    Then User clicks the register button

  @Login-With-Valid-Data
  Scenario: User has successfully login
    Given User on the login page
    When User fill email
    And User fill password
    Then User click login button

  @Login-With-Invalid-Password
  Scenario: User failed to login and show error message
    Given User is on the login page
    When User fill valid email
    And User fill invalid password
    Then User clicks the login button

  @Logout
  Scenario Outline: User has successfully logout account
    Given User login account
    When User click profile icon at navbar
    Then User click logout
