Feature: Users should be able to see company structure

  Background:
    Given the user is on the login page
    And the user enters the valid credentials
    And Employee tab


  Scenario: Adding a department
    When The user clicks company structure
    When User should click ADD DEPARTMENT
    And Enter a department name
    And Click ADD
    Then User should display new department