Feature: Users should be able to see company structure

  Background:
    Given the user is on the login page
    Given the user enters the valid credentials
    Given Employee tab

  Scenario: Seeing company structure

    When The user clicks company structure
    Then The user should be able to display company structure
