@Homepage
Feature: HomePage
  I want to use this template for my feature file

  Background: 
    Given user Launch the Browser

  @testcase01
  Scenario: Verfify the Titlepage of DSPortalapp
    When user open the Homepage of dsportal and click get started button
    When user navigate to the Homepage
    Then user should Verify the titlepage of Dsportal

  @testcase02
  Scenario: user get an Alert Message in DataStructure button
    When user open the Homepage of dsportal and click get started button
    When user clicks the Get Started button below the Datastructures-Introduction
    Then user should get an Alert Message you are not logged in

  @testcase003
  Scenario: user get Alert Message
    When user open the Homepage of dsportal and click get started button
    When user click the DropDwon button
    When user navigate to button from the DSportal homepage and select any options
    Then user should get an Alert Message you are not logged in

  @testcase004
  Scenario: Display of Login page
    When user open the Homepage of dsportal and click get started button
    When user click to signin button from DSportal homepage
    Then user should be directed to login page

  @testcase005
  Scenario: Display of Register page
    When user open the Homepage of dsportal and click get started button
    When user click to Register button from DSportal homepage
    Then user should be directed to Register form
