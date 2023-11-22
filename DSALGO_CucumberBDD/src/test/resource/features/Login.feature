@LoginIn
Feature: Sign In Page
  I want to use this template for my feature file

  Background: 
    Given user Launch the Browser

  Scenario Outline: Attempts login with specific credentials
    Given user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the user id as  "<User>"
    When user enter  password as  "<Password1>"
    And user click the login button
    Then user should get an alert message of Invalid Username and Password

    Examples: 
      | User     | Password1    |
      | NinjaAlgo  | @Algo123 |

  Scenario: Login Successfully with Valid Username and Valid Password
    Given user open the Homepage of dsportal and click get started button
     When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password 
    And user click the login button
    Then user should successfully login into Homepage
