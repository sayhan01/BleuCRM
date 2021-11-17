Feature: Users should be able to login

  Scenario: Login as a HRuser

    Given the user is on the login page
    When the user enters the valid credentials
    Then User should see the homepage