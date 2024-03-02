Feature: Application login

Background:
Given Clear Browser Cache
When Open the Chrome Browser

Scenario: Admin Page login
Given User lands on Login page
When User enter the UserName as "hari" and Password as "krishna"
Then Home Page is displayed
And Check Name is displayed

@Parameterisation
Scenario Outline: Admin Page login with Multiple Users

Given User lands on Login page
When User enter the UserName as "<UserName>" and Password as "<Password>"
Then Home Page is displayed
And Check Name is displayed

Examples:
|	UserName	| Password	|
|	usr1	|	pwd1	|
|	user2	|	pwd2	|

@GetListofValue
Scenario: Admin Page login to get all the details

Given User lands on Login page to get the details
When User enter the UserName as FirtName, LastName, EMail
	| Hari |
	|	Krishna |
	|	hari@gmail.com	|
Then Home Page is displayed
And Check Name is displayed