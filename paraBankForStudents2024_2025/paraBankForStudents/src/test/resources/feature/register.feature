Feature: Registration Scenarios
  Scenario Outline: Register with various invalid inputs
    Given I am on the registration page
    When I enter "<firstName>" as First Name
    And I enter "<lastName>" as Last Name
    And I enter "<address>" as Address
    And I enter "<city>" as City
    And I enter "<state>" as State
    And I enter "<zipCode>" as ZIP Code
    And I enter "<phoneNumber>" as Phone Number
    And I enter "<ssn>" as SSN
    And I enter "<username>" as Username
    And I enter "<password>" as Password
    And I enter "<confirmPassword>" as Confirm Password
    And I click the 'Register' button
    Then I should see an error message if the field is required

    Examples:
      | firstName | lastName  | address       | city     | state    | zipCode | phoneNumber | ssn    | username | password | confirmPassword |
      |           | LastName | 123 Main St   | CityName | StateX   | 12345   | 1234567890  | 123456 | User2    | pass123 | pass123         |
      | FirstName |          | 123 Main St   | CityName | StateX   | 12345   | 1234567890  | 123456 | User2    | pass123 | pass123         |
      | FirstName | LastName |               | CityName | StateX   | 12345   | 1234567890  | 123456 | User2    | pass123 | pass123         |
      | FirstName | LastName | 123 Main St   | CityName | StateX   |         | 1234567890  | 123456 | User2    | pass123 | pass123         |
      | FirstName | LastName | 123 Main St   | CityName | StateX   | 12345   | 1234567890  |        | User2    | pass123 | pass123         |
      | FirstName | LastName | 123 Main St   | CityName | StateX   | 12345   | 1234567890  | 123456 | User2    | pass123 | wrongpass       |