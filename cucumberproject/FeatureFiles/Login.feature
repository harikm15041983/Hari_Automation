Feature: To Test Login Functionality
Scenario: Open Login Screen
	Given Login into the application
	When Enter UserName and Password
		| Input | Value |
	And Click on Submit button
	Then Check for the Home Page

