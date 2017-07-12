Feature: To check the Match Score Functionality

  Scenario Outline: Login Functionality
    Given Start the browser
    When Enter the valid "<username>" and "<password>"
    Then logged in successfuly

    Examples: 
      | username  | password  |
      | sree.hari | 9010satya |

  Scenario: Enter the match score
    Given Click on portal button
    When Click on matchscore button
    Then Entered successfully

  Scenario Outline: Entering the match details
    Given Click on the add match score
    When Select any Date
    Then Type "<Opposition>" of the match
    Then type "<league>"s on the field
    Then Enter the "<venue>" details
    Then Type the "<matchtype>"
    Then Select the "<MatchFormat>" from dropdown
    Then Choice the "<MatchGrade>"
    Then Enter the "<TeamName>" on the field
    Then Select the "<Result>" of the match
    Then Select "<Surface>" type of the match

    Examples: 
      | Opposition | league      | venue   | matchtype | MatchFormat | MatchGrade | TeamName  | Result | Surface |
      | SriOwn     | WorldLeague | Gurgaon | Live      | T20         | Club       | KingMatch | Lost   | Grass   |
