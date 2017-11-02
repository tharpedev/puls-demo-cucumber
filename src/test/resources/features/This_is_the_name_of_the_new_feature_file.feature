
Feature: This is the name of the new feature file
  This is the description

  Scenario: Verify the feature file got created
    Given that I create a new feature file
    When I make a scenario and click save
    Then I will see changed in git
