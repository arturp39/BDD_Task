Feature: Services Tests
  Scenario: Navigate to Services and back to Home
    Given I am on the login page
    When I click on "Services"
    Then I should see the Services page
    And I scroll to the footer
    Then I should see the bottom of the page
    When I click on the "Services" link in the footer
    Then I should see the top of the Services page
    When I click on the ParaBank logo
    Then I should see the homepage