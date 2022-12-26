#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


#
#Feature: Login using tables 
#Scenario: Loging with standard usernames/passwords

Given: useralready on login page
When: Title of login page is Swag Labs
Then: user enters username and password

| standard_user    | secret_sauce

Then User clicks on Login button
Then user can see cart icon
Then click on add to cart on Sauce Lab Backpack.
Then click on Cart icon
Then click on Checkout
Then Enter  shipping details 
Then click on continue
Then click on Finnish
#Then Verify Thank you for purchase message
#Then close the browser




