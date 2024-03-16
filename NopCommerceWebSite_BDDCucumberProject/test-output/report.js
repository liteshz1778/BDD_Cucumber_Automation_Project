$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Customers1.feature");
formatter.feature({
  "name": "Customers Module",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each customer scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sends Email as \"admin@yourstore.com\" \u0026 password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_Email_as_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers Menu",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers Sub-Menu",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Customers_Sub_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Valid Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Click on Add new button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Add a new customer / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the Customer info",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.provide_the_Customer_info_like()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each customer scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sends Email as \"admin@yourstore.com\" \u0026 password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_Email_as_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers Menu",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers Sub-Menu",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Customers_Sub_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer using Email Id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Enter the Email Address",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Email_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Specific Email Id is getting reflected",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.validate_the_Specific_Email_Id_is_getting_reflected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each customer scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sends Email as \"admin@yourstore.com\" \u0026 password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_Email_as_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers Menu",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers Sub-Menu",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Customers_Sub_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer using Firstname \u0026 Lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Enter the Firstname \u0026 Lastname",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Firstname_Lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Specific Firstname \u0026 Lastname Id is getting reflected",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.validate_the_Specific_Firstname_Lastname_Id_is_getting_reflected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Login1.feature");
formatter.feature({
  "name": "Login Module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sends Email as \"admin@yourstore.com\" \u0026 password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_Email_as_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Logout link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_cick_on_Logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with Invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User sends Email as \"\u003cemail\u003e\" \u0026 password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin1@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sends Email as \"admin1@yourstore.com\" \u0026 password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_Email_as_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sends Email as \"admin@yourstore.com\" \u0026 password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_sends_Email_as_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});