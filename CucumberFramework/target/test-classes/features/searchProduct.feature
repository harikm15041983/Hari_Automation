Feature: Search and Place Order the Products
@HomeOfferPages
Scenario Outline: Product Search in HomePage and OffersPage

Given User in GrenKart Landing page
When User search for item <Name> and get the actual value
Then User search for item <Name> in Offerpage and validate the value
And Validate value in HomePage and Offerpage

Examples:
|	Name	|
|	Tom		|
| Bett	|
