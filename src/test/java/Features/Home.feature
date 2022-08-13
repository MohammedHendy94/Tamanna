Feature:
  Scenario: Adding Products
    Given user open home
    When open home category
    And choose the first product
    And add the first product to the cart
    And open men category
    And choose the second product
    And choose the size
    And add the second product to the cart
    Then user navigate to the shopping screen
    And Validate the quantity and total price
    And remove the products
    And back yo the home page
