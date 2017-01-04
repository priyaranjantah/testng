Feature: annotation
#This is how background can be used to eliminate duplicate steps
Background:
User navigates to microsoft
Given I am on suvp login page

#Scenario with LOGIN/DOWNLOAD WSUS CONTENT
Scenario:
    When I enter account name as "ANKIT"
    And I click on next button
    When I type the password as "MATHUR"
    And I click on the keep me signed in checkbox
    Then I am logged in to the portal
    When I click on the link containing "WSUS content and metadata" for the current month
    Then I am download the respective update and metadata files to my local computer


