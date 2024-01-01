@SmokeScenario
Feature: feature to test login functionality
 

  #@SmokeTest
  #Scenario: Check login is successful with valid credentials
  #Given browser is open
  #And user is on login page
  #When user enter username and password
  #And user clicks on login
  #Then user is navigated to the home page
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username                   | password  |
      | admin@biofuelsjunction.com | admin@123 |