Feature: Login Action
Description: 
		
		
		
Scenario: Successful login with valid credentials		
Given User is on home page
When  User navigate to login page
And  User enters "shyammore101" and "India@001#"
Then Message displayed login successfully

