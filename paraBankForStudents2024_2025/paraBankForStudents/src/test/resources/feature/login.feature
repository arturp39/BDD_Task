Feature: Login Scenarios
  Scenario: Enter only one of the two fields
    Given I am on the login page
    When I enter data in only one of the Username or Password fields
    And I click 'LOG IN'
    Then I should see an error message