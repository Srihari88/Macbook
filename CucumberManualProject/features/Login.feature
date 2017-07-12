Feature: PitchVision Login

  @Login
  Scenario: To check the valid login details.
    Given Start the Chrome browser
    When Click on the login button
    Then Enter the correct username and password
    Then Click on the submit button
