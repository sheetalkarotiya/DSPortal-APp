@registration
Feature: Registration page functionality
  
  I want to test the functionality of the registration page

  Background: 
    Given user Launch the Browser

  @TC_reg_06
  Scenario: check if user can successfully register without filling fields
    Given user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    When user clicks registration button
    Then user should get an error message below username textbox

  @TC_reg_07
  Scenario: check if user can register successfully with only valid username
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "NinjaAlgo"
    When user clicks registration button
    Then user should get an error message below password textbox

  @TC_reg_08
  Scenario: check if user can register successfully when only confirmatory password field is blank
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "NinjaAlgo"
    And the user enters valid password  "@Algo123"
    When user clicks registration button
    Then user should get an error message below password confirmation box

  @TC_reg_09
  Scenario: check if user can register successfully with invalid username (only symbols)
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters symbols as username "@/!/%/$/#/@"
    And the user enters valid password "@Algo123"
    And also matching confirmatory password "@Algo123"
    When user clicks registration button
    Then user should get an error message

  @TC_reg_10
  Scenario: check is user can register successfully with different passwords
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "NinjaAlgo"
    And the user enters valid password  "@Algo123"
    And also matching confirmatory password "@Algo123%%%"
    When user clicks registration button
    Then user should get error message

  @TC_reg_11
  Scenario: check if user can register successfully with less than 8 characters
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "NinjaAlgo"
     And the user enters valid password "@Algo123"
    And also matching confirmatory password "@Algo123"
    When user clicks registration button
   Then user should get an error message

  @TC_reg_12
  Scenario: check if user can register successfully with numerical password
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "NinjaAlgo"
    And the user enters valid password "1234"
    And also matching confirmatory password "1234"
    When user clicks registration button
    Then user should get an error message

