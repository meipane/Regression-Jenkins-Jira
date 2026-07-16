Feature: Checkout Journey for Saucedemo
  As a registered customer
  I want to buy a product
  So that I can complete a purchase and receive an order confirmation

  @positive @regression
  Scenario: Successful checkout with valid credentials and product
    Given I am on the Saucedemo login page
    When I login with username "standard_user" and password "secret_sauce"
    And I add "Sauce Labs Backpack" to the cart
    And I proceed to checkout
    And I enter first name "John", last name "Doe", and postal code "12345"
    And I complete the checkout
    Then I should see the message "Thank you for your order!"

  @negative @regression
  Scenario: Login fails with invalid credentials
    Given I am on the Saucedemo login page
    When I login with username "standard_user" and password "wrong_password"
    Then I should see the error message "Epic sadface: Username and password do not match any user in this service"

  @regression
  Scenario Outline: Checkout with various data
    Given I am on the Saucedemo login page
    When I login with username "standard_user" and password "secret_sauce"
    And I add "Sauce Labs Backpack" to the cart
    And I proceed to checkout
    And I enter first name "<firstName>", last name "<lastName>", and postal code "<postalCode>"
    And I complete the checkout
    Then I should see "<expectedMessage>"

    Examples:
        | firstName | lastName | postalCode | expectedMessage                     |
        | Jane      | Smith    | 54321      | Thank you for your order!           |
        | Alice     | Johnson  | 67890      | Thank you for your order!           |
        | Bob       | Brown    | 00000      | Thank you for your order!           |