$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/QA2022/Selenium_Workspace/SauceDemoCucumberBDD/src/main/java/feature/loginUsingExample.feature");
formatter.feature({
  "line": 3,
  "name": "SauceDemo Login Features",
  "description": "",
  "id": "saucedemo-login-features",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 6,
      "value": "#Then User enters \"standard_user\" and \"secret_sauce\""
    }
  ],
  "line": 11,
  "name": "Login Test Scenario",
  "description": "",
  "id": "saucedemo-login-features;login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Title of login page is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user can see cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on add to cart on Sauce Lab Backpack.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter  shipping details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on Finnish",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Thank you for purchase message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "saucedemo-login-features;login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "saucedemo-login-features;login-test-scenario;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 29,
      "id": "saucedemo-login-features;login-test-scenario;;2"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 30,
      "id": "saucedemo-login-features;login-test-scenario;;3"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce"
      ],
      "line": 31,
      "id": "saucedemo-login-features;login-test-scenario;;4"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce"
      ],
      "line": 32,
      "id": "saucedemo-login-features;login-test-scenario;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Login Test Scenario",
  "description": "",
  "id": "saucedemo-login-features;login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Title of login page is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user can see cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on add to cart on Sauce Lab Backpack.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter  shipping details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on Finnish",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Thank you for purchase message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.title_of_login_page_is()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 13
    },
    {
      "val": "secret_sauce",
      "offset": 33
    }
  ],
  "location": "LoginStepDefinitions.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.abc()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.xyz()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_add_to_cart_on_Sauce_Lab_Backpack()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Cart_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.enter_shipping_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Finnish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.verify_Thank_you_for_purchase_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.closebrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 30,
  "name": "Login Test Scenario",
  "description": "",
  "id": "saucedemo-login-features;login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Title of login page is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters \"problem_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user can see cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on add to cart on Sauce Lab Backpack.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter  shipping details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on Finnish",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Thank you for purchase message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.title_of_login_page_is()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 13
    },
    {
      "val": "secret_sauce",
      "offset": 32
    }
  ],
  "location": "LoginStepDefinitions.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.abc()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.xyz()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_add_to_cart_on_Sauce_Lab_Backpack()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Cart_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.enter_shipping_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Finnish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.verify_Thank_you_for_purchase_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.closebrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "Login Test Scenario",
  "description": "",
  "id": "saucedemo-login-features;login-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Title of login page is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters \"performance_glitch_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user can see cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on add to cart on Sauce Lab Backpack.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter  shipping details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on Finnish",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Thank you for purchase message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.title_of_login_page_is()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 13
    },
    {
      "val": "secret_sauce",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinitions.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.abc()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.xyz()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_add_to_cart_on_Sauce_Lab_Backpack()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Cart_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.enter_shipping_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Finnish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.verify_Thank_you_for_purchase_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.closebrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "Login Test Scenario",
  "description": "",
  "id": "saucedemo-login-features;login-test-scenario;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Title of login page is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters \"locked_out_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user can see cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on add to cart on Sauce Lab Backpack.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter  shipping details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on Finnish",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Thank you for purchase message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.title_of_login_page_is()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 13
    },
    {
      "val": "secret_sauce",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinitions.user_enters_username_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.abc()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.xyz()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_add_to_cart_on_Sauce_Lab_Backpack()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Cart_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.enter_shipping_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_Finnish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.verify_Thank_you_for_purchase_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.closebrowser()"
});
formatter.result({
  "status": "skipped"
});
});