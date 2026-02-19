# date:10/02/2026
# Author: J.Sudharani
# comment section
@smokeScenario @Login
Feature: feature to test Login functionality

  @SmokeTest
  Scenario: Check Login is successful with valid credentials
    Given user is in login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @smokeTest
  Scenario Outline: Check Login failure with invalid credential
    Given user is in login page
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then user should remain on login page

    Examples:
      | username | password |
      | uid1     |          |
      |          | pass1    |
      | uid2     | pass2    |
      | Admin    | pass3    |
      | Admin    |          |
      |          | Qedge!@# |
      | uid3     | Qedge!@# |
