Feature: Validating the system reacts based on user inputs

  Scenario Outline: Get login using 
    Given navigate into saucelab webpage
    When user gives <username>
    And user gives <password>
    Then user should click login button

    Examples: 
      | username       | password      |
      | standard_user  | secret_sauce  |
      | standard_user1 | secret_sauce1 |
      |                |               |
