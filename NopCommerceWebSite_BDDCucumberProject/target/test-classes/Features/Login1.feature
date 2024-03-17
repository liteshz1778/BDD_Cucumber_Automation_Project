Feature: Login Module

@smoke @regression
Scenario: Successful Login with valid credentials
	Given User Launch Chrome Browser
	When User opens "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	Then Page Title Should be "Your store. Login"
	And User sends Email as "admin@yourstore.com" & password as "admin"
	And Click on Login
	Then Page Title Should be "Dashboard / nopCommerce administration"
	When User click on Logout link
	Then Page Title Should be "Your store. Login"
	Then close browser

@regression
Scenario Outline: Login with Invalid credentials
	Given User Launch Chrome Browser
	When User opens "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	Then Page Title Should be "Your store. Login"
	And User sends Email as "<email>" & password as "<password>"
	And Click on Login
	Then Page Title Should be "Your store. Login"
	Then close browser
	
	Examples:
	| email | password |
	| admin1@yourstore.com | admin |
	| admin@yourstore.com | admin123 |