$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login user",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user available on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_available_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_enter_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  are enter \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_are_enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user  navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on welcome button",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_click_on_welcome_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to logout from application",
  "keyword": "Then "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_able_to_logout_from_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Features.LoginsetpDefination.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Login user",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user available on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_available_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_enter_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  are enter \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.user_are_enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Features.LoginsetpDefination.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify PIN Module",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on PIN Module",
  "keyword": "When "
});
formatter.match({
  "location": "Features.PINStepDefination.user_click_on_PIN_Module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see sub module and user click on Reports module",
  "keyword": "Then "
});
formatter.match({
  "location": "Features.PINStepDefination.user_able_to_see_sub_module_and_user_click_on_Reports_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to report page and user enter report name into text box",
  "keyword": "Then "
});
formatter.match({
  "location": "Features.PINStepDefination.user_navigate_to_report_page_and_user_enter_report_name_into_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Features.PINStepDefination.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see report",
  "keyword": "Then "
});
formatter.match({
  "location": "Features.PINStepDefination._user_able_to_see_report()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "finaly close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Features.PINStepDefination.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});