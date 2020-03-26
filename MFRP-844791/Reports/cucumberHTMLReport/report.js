$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/MercuryTours.Feature");
formatter.feature({
  "line": 2,
  "name": "Mercury Tours Website",
  "description": "",
  "id": "mercury-tours-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MercuryTours"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To Register",
  "description": "",
  "id": "mercury-tours-website;to-register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the application in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the MercuryTours Registration page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user fills all the Details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationTC_01.the_user_launch_the_application_in_the_browser()"
});
formatter.result({
  "duration": 12953746300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTC_01.the_user_open_the_MercuryTours_Registration_page()"
});
formatter.result({
  "duration": 3287232800,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTC_01.the_user_fills_all_the_Details()"
});
formatter.result({
  "duration": 1631828700,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTC_01.click_on_the_Register_button()"
});
formatter.result({
  "duration": 2132161500,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTC_01.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 1054866800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To Login",
  "description": "",
  "id": "mercury-tours-website;to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "the user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user Enters the valid username password",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on signin",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I validate the outcomes of valid login",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginTC_02.the_user_launch_the_application()"
});
formatter.result({
  "duration": 12715015200,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginTC_02.the_user_Enters_the_valid_username_password()"
});
formatter.result({
  "duration": 1551255200,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginTC_02.click_on_signin()"
});
formatter.result({
  "duration": 6013035400,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginTC_02.i_validate_the_outcomes_of_valid_login()"
});
formatter.result({
  "duration": 896106200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To Login",
  "description": "",
  "id": "mercury-tours-website;to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC_03"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user launch the application in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "the user Enters the Invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I validate the outcomes of invalid login",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLoginTC_03.the_user_launch_the_application_in_browser()"
});
formatter.result({
  "duration": 12777468100,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginTC_03.the_user_Enters_the_Invalid_username_and_password()"
});
formatter.result({
  "duration": 564409000,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginTC_03.click_on_signin_button()"
});
formatter.result({
  "duration": 7258988000,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginTC_03.i_validate_the_outcomes_of_invalid_login()"
});
formatter.result({
  "duration": 843514500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "To Retrive HomeTable",
  "description": "",
  "id": "mercury-tours-website;to-retrive-hometable",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user launches the application in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Read the Hometable",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "write the table in ExcelSheey",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I validate the outcomes of Retrived Table",
  "keyword": "Then "
});
formatter.match({
  "location": "HometableTC_04.user_launches_the_application_in_browser()"
});
formatter.result({
  "duration": 12063304400,
  "status": "passed"
});
formatter.match({
  "location": "HometableTC_04.read_the_Hometable()"
});
formatter.result({
  "duration": 449238200,
  "status": "passed"
});
formatter.match({
  "location": "HometableTC_04.write_the_table_in_ExcelSheey()"
});
formatter.result({
  "duration": 785788100,
  "status": "passed"
});
formatter.match({
  "location": "HometableTC_04.i_validate_the_outcomes_of_Retrived_Table()"
});
formatter.result({
  "duration": 754121400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "To Retrive any data from Cruises table",
  "description": "",
  "id": "mercury-tours-website;to-retrive-any-data-from-cruises-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@TC_05"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "the user launches the application in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "click cruises",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Retrive any data from the table",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I validate",
  "keyword": "Then "
});
formatter.match({
  "location": "CruisesTC_05.the_user_launches_the_application_in_browser()"
});
formatter.result({
  "duration": 11763527700,
  "status": "passed"
});
formatter.match({
  "location": "CruisesTC_05.click_cruises()"
});
formatter.result({
  "duration": 1345704100,
  "status": "passed"
});
formatter.match({
  "location": "CruisesTC_05.retrive_any_data_from_the_table()"
});
formatter.result({
  "duration": 491990400,
  "status": "passed"
});
formatter.match({
  "location": "CruisesTC_05.i_validate()"
});
formatter.result({
  "duration": 720680600,
  "status": "passed"
});
});