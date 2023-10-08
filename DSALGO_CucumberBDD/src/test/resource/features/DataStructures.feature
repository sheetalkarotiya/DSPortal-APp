@DataStructure
Feature: Data Structures-Introduction
  I want to use this as  my feature file

  Background: 
    Given user Launch the Browser
     When user open the Homepage of dsportal and click get started button
     When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password 
    And user click the login button
    Then user should successfully login into Homepage
    

  @tc0019
  Scenario: Open the DataStructures-Introduction page
    When user click to Get Started button below Data Structure
    Then User should land on DataStructures-Introducti-on-Introduction page


 