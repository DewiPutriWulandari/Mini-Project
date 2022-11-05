Feature: Transaction

  @View-History-Transaction
  Scenario: Show history transaction
    Given User is on the homepage
    When User clicks profil icon at navbar
    Then User clicks transaction

  @View-History-Transaction-Without-Login
  Scenario: User navigates to login page
    Given User is on homepage
    Then User clicks arrow icon in navbar

  @Filterring-List-Transaction-By-Product
  Scenario: User view no data variabel
    Given User on transaction page
    Then User organize products based on high and low

  @Filterring-List-Transaction-By-Price
  Scenario: User view no data variabel
    Given User on the transaction page
    Then User organize price based on high and low

  @Filterring-List-Transaction-By-Amount
  Scenario: User view no data variabel
    Given User is on transaction page
    Then User organize amount based on high and low

  @Filterring-List-Transaction-By-SubTotal
  Scenario: User view no data variabel
    Given User is on the transaction page
    Then User organize sub total based on high and low

  @Rows-Per-Page
  Scenario: User view no data variabel
    Given User in transaction page
    Then Choose rows
