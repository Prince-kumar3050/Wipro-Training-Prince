Feature: Login Functionality

Scenario: Valid Login

Given user opens login page
When user enters username "Admin"
And user enters password "admin123"
And clicks on login button
Then user should navigate to dashboard