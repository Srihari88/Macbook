Feature: Login checking

  Scenario: Login checcking
    Given Start browser
    When enter valid username and password
    Then Login successfully
