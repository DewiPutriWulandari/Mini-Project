Feature: Homepage

  @View-Products-Details
  Scenario: Successfully see the product details
    Given User on the home page
    Then User click detail products

  @Add-Items-To-Cart
  Scenario: Successfully added item to cart
    Given User is on the home page
    When User click buy products
    Then User click cart

  @Select-Category
  Scenario: Successfully Items found
    Given User navigates to homepage
    When User click select category
    And User choose category
    Then User find the selected items

  @Clearing-Category
  Scenario: View all items
    Given User has finished selected a category
    When User click the cross icon
    Then User see all product in homepage

  @Give-Rating-Product
  Scenario: Success to give a product rating
    Given User navigates to the homepage
    When User click detail
    And User give rating product
    Then User click altashop

  @Change-Rating-Product
  Scenario: Rating value is equal to initial rating
    Given User has finished rated the product
    When User change product rating
    Then User clicks altashop

  @Back-To-Homepage
  Scenario: Navigates on the homepage
    Given User finished product rating change
    Then User click icon alta shop
