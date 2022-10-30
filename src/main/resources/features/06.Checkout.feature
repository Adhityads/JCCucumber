Feature: Checkout

  Scenario: User Checkout
    When User go to checkout menu
    And User fill form name
    And User fill form location
    And User check button terms
    And User click placeorder
    Then User checkout success