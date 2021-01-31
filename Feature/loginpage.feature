@Login
Feature: login github

Scenario: login with valid credientials 

Given User launch Github home page
When user opens URL "https://github.com/login"
When user Enter username "Rsmhussain" and Password "Sheik@1006"
And user clicks on login
Then Page title should be "GitHub"
When user click on logout
Then close the browser

