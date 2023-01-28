@smoke
Feature: Sauce Demo Login

  Scenario: Valid login test
    Given User on Sauce Demo Login page
    When User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should navigated to Sauce Demo home page

  Scenario: empty password
    When user enters valid username
    And user leaves password empty
    And click on login button
    Then I validate that "Epic sadface: Password is required..." message is displayed

  Scenario: invalid login
    When user enters invalid username as "random_username"
    And user enters invalid password as "random_password"
    And click on login button
    Then I validate that "Epic sadface: Username and password do not match any user in this service" message is displayed