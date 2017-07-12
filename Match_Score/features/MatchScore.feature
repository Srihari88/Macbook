Feature: To check the Match Score Functionality

  Scenario Outline: Login Functionality
    Given Start the browser
    When Enter the valid "<username>" and "<password>"
    Then logged in successfuly

    Examples: 
      | username  | password  |
      | sree.hari | 9010satysa |
