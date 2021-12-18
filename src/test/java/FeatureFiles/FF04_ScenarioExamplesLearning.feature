# Feature  is like user story
Feature: Registration Screen
  #
# Scenario is like a test case and "Scenario Outline" means we are getting test data and using it in the code
  Scenario Outline: Creating Multiple Accounts
    # we have codd for this below 2 lines
    Given open the Browser and enter url and press enter key
    Then click on account link
    Then click on create an account button
    #TestData picked-up from Examples
    Then Customer enters FirstName as "<FirstName>"
    Then Customer enters LastName as "<LastName>"

    Examples:
    #heading
    |FirstName|LastName|
    #Test Data
    |FirstName01|LastName01|
    |FirstName02|LastName02|



