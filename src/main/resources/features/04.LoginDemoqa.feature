Feature: Login User

  Scenario: User Login
    When User go to web login demoqa
    And User enter username and password
    And User click button login demoqa
    Then User login success