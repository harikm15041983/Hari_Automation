Feature: This is to test Google search
Scenario: Google Search Scenario
	Given user is enter google.co.in
	When user is typing "hari"
	And enters the return key
	Then user should see the search result

