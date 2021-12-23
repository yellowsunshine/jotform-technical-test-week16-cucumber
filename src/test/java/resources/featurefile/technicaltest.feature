Feature: Technical Test Submission Form

  Background: User should be on the jotform website
    Given User is on the jotform webpage

    @Regression
  Scenario: User should be able to fill in all the pages of the test form successfully
    When User clicks on the next button from the home page
    And enters first name "George" in the first name field
    And enters last name "Smith" in the last name field
    And clicks on the next button on the Test Form Page
    And attaches a file
    And creates a signature
    And clicks on the next button on the signature page
    And selects the date
    And clicks on the next button on the date page
    And selects the security question "Name of the first pet" from the dropdown
    And answers the security question "Puppy"
    And clicks on the submit button
    Then verifies that the submission has been received "Your submission has been received!"



