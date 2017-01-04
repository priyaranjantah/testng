Feature: annotation
#This is how background can be used to eliminate duplicate steps

  Background:
  User navigates to Netwitness
    Given I am on Netwitness login page


#Scenario with LOGIN
  Scenario:
    When I enter user name as "MICKY"
    And I enter the password as "DONALD"
    Then I am able to login to the portal
    When I click on Agents tab in the portal
    Then I am able to view the Agent counts
    When I click on IOC tab in the portal
    Then I am able to view the IOC counts
    When I click on the agent link
    Then I am able to view the agent module
