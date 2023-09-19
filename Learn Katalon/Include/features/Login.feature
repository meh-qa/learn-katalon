#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login
  I want to Login to CURA Healthcare Service

  @login
  Scenario Outline: Login
    Given CURA Healthcare Service website is open
    When I Logging in using username <username> and password <password>
    Then I Logged In
    And I Logging Out
    Then I Logged Out

    Examples: 
      | name  | username 		| password  					|
      | name1 |	John Doe 		| ThisIsNotAPassword 	|