Feature: User be able to view items and add items to cart

  Scenario: User has successfully view all items
    Given User login account
    When User input email and password
    And User click button login
    Then User verification items

  Scenario: User has successfully add items to cart
    Given User login accounts
    When User fill email and password
    And User clicks button login 
    And User tap buy
    Then User verification cart
