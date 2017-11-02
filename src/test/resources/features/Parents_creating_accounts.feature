
Feature: Parents creating accounts
  Parents will create accounts for themselves so they can later associate kids to them

  Scenario:
    Given that I have never logged in HELLO WORLD
    When I open the App
    Then I should see the an option to sign up as a parent
    
    Given that I open the create account screen
    When I enter the required data
    Then the submit button should be enabled
    
    
