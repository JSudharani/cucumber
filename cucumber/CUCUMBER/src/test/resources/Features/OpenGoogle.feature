@SmokeScenario
Feature: Feature To check Google link is working

  @SmokeTeat
  Scenario: To check Google link is working
    When user open chrome browser
    And user enters link "https://google.com"
    Then user sees google home page
