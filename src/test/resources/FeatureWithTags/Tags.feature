Feature: Feature to demo tags

  @smoke
  Scenario: Sample 1
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @regression
  Scenario: Sample 2
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @smoke @regression
  Scenario: Sample 3
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @important
  Scenario: Sample 4
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
