

Feature: SauceDemo Login Features


#Then User enters "standard_user" and "secret_sauce"




Scenario Outline: Login Test Scenario
Given User is already on login page
When Title of login page is Swag Labs
Then User enters "<username>" and "<password>"
Then User clicks on Login button
Then user can see cart icon
Then click on add to cart on Sauce Lab Backpack.
Then click on Cart icon
Then click on Checkout
Then Enter  shipping details 
Then click on continue
Then click on Finnish
Then Verify Thank you for purchase message
Then close the browser

Examples:

	|username               |  password   |  
	|standard_user          |secret_sauce | 
	|problem_user           |secret_sauce |
	|performance_glitch_user|secret_sauce |
	|locked_out_user        |secret_sauce |
	
	
	



