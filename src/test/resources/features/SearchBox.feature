Feature: Users should be able to see company structure

  Background:
    Given the user is on the login page
    And the user enters the valid credentials
    And Employee tab


  Scenario: Adding a department
    Given The user clicks Find Employee
    Then User should use searchbox