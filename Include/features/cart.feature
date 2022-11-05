Feature: Cart

  @View-Items-In-Cart
  Scenario: Show items in cart
    Given User in the homepage
    When User clicks cart
    Then User view items in cart

  @Add-Items-In-Cart
  Scenario Outline: Success to increase the number of items
    Given User on cart page
    Then User click add icon

  @Reduce-Items-In-Cart
  Scenario Outline: Success to reduce the number of items
    Given User navigate to cart page
    Then User click the less icon

  @Pay-Items-In-Cart
  Scenario: Successfully paid for the item
    Given User is in cart
    Then User click pay

  @Pay-Items-In-Cart-Without-Login
  Scenario: Navigates to login page
    Given User is in cart without login
    Then User click pay items
