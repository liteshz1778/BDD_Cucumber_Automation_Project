Feature: Customers Module

Background: Below are the common steps for each customer scenario
	Given User Launch Chrome Browser
	When User opens "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	Then Page Title Should be "Your store. Login"
	And User sends Email as "admin@yourstore.com" & password as "admin"
	And Click on Login
	Then Page Title Should be "Dashboard / nopCommerce administration"
	And Click on Customers Menu
	And Click on Customers Sub-Menu 

@smoke @regression
Scenario: Create New Valid Customer
	Then Click on Add new button
	Then Page Title Should be "Add a new customer / nopCommerce administration"
	And Provide the Customer info
	Then Click on Save button
	Then User can view confirmation message "The new customer has been added successfully."
	Then close browser

@regression
Scenario: Search Customer using Email Id
	Then Enter the Email Address
	And Click on Search button
	Then Validate the Specific Email Id is getting reflected
	Then close browser
	
@regression
Scenario: Search Customer using Firstname & Lastname
	Then Enter the Firstname & Lastname
	And Click on Search button
	Then Validate the Specific Firstname & Lastname Id is getting reflected
	Then close browser