Feature: Register Functionality

  In order to use the page
  As a registered user
  I have to register successfully

  Scenario: Register
    Given I am in the register page of the site
    When I enter male register data
    And I click submit button
    Then I should be taken to the successful page

  Scenario Outline: Register several users
    Given I am in the register page of the site
    When I enter "<name>" and "<sex>" register data
    And I click submit button
    Then I should be taken to the successful page
    Examples:
      |name|sex|
      |Juan|Male|
      |Juana|Female|