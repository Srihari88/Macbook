Feature: To check the match score

  Scenario Outline: To login the player account with valid details
    Given Start the chrome browser
    When Enter the valid "<username>" and "<password>"
    Then Logged in successfully

    Examples: 
      | username  | password  |
      | David.davidson | likewelt |

  Scenario: To redirect to match stats page
    Given Click on the "<portal>" link
    When Click on the "<matchstats>" fourm
    Then Enter the match scroe on match fourm
