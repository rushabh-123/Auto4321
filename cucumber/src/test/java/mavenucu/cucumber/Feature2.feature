Feature: test login feature with multiple data

  Scenario Outline: test login scenario with multiple valid data
    Given Application is up and running
    When I enter <username> and <password> on login screen
    Then user should be logged in successfully

    Examples: 
      | username         | password    |
      | abc123@gmail.com | password123 |
      | xyz123@gmail.com | password345 |
