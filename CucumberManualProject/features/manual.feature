Feature: PitchVision Registration

  @Registration
  Scenario: Filling the data fourm
    Given Start the Chrome browser
    When Click on the login button
    And click on the register button
    Then Fill the all required fields
      | Fields         | Value                     |
      | FirstName      | Love9                     |
      | LastName       | OneP                      |
      | NickName       | Really                    |
      | Email          | srihari.naidu@misport.com |
      | password       | password                  |
      | retypepassword | password                  |
      | Gender         | Male                      |
      | Date           | 2001/01/02                |
