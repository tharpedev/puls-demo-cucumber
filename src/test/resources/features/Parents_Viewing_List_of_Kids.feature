
Feature: Parents Viewing List of Kids
  Parents should be able to see a list of kids and modify that list

  Scenario:
    Given that I have a parent account
    When I log in
    Then I should be directed to a page to view kids
