Feature: Location Tests
  Scenario: Navigate to Locations and back to Home
    Given I am on the login page
    When I click on "Locations"
    Then I should see the Locations page
    And I navigate back to the homepage
    Then I should see the homepage