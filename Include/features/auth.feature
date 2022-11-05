Feature: User be able to register, login, and logout

  Scenario: User has successfully resgistered
    Given User on landing screen
    When User input fullname
    And User input email
    And User input password
    Then User tap register button

  Scenario: User has successfully login
    Given User on login screen
    When User input valid email
    And User input valid password
    Then User tap login button

  Scenario: User has successfully logout
    Given User on login accounts
    When User input valid email and password
    And User tap login
    Then User tap logout button
