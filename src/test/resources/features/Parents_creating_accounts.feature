
Feature: Parents creating accounts
  Parents will create accounts for themselves so they can later associate kids to them

  Scenario: Parents see sign up option
    Given that I have never logged in
    When I open the App
    Then I should see the an option to sign up as a parent
  
  Scenario: Parent takes happy create account path and button enabled
    Given that I open the create account screen
    When I enter the required data
    Then the submit button should be enabled
    
    
