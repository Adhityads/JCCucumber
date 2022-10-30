Feature: Search and Add to Cart

  Scenario: User search item satu
    When User Search item satu
    Then User has search item satu

  Scenario: User add to cart item satu
    When User pilih item satu
    And User pilih item satu color
    And User pilih item satu size
    And User add to cart item satu
    Then User has add to cart item satu

  Scenario: User search item dua
    When User Search item dua
    Then User has search item dua

  Scenario: User add to cart item dua
    When User pilih item dua
    And User pilih item dua color
    And User pilih item dua size
    And User add to cart item dua
    Then User has add to cart item dua