$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("app.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook application test",
  "description": "",
  "id": "facebook-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Facebook",
  "description": "",
  "id": "facebook-application-test;login-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Start the web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login with correct \"sriharinaidupudu@gmail.com\" and \"tejasrihari\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.Start_the_web_browser()"
});
formatter.result({
  "duration": 7637612372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sriharinaidupudu@gmail.com",
      "offset": 20
    },
    {
      "val": "tejasrihari",
      "offset": 53
    }
  ],
  "location": "StepDefinition.Login_with_correct_UserName_and_password(String,String)"
});
formatter.result({
  "duration": 458715731,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Logged_in_successfully()"
});
formatter.result({
  "duration": 14107573879,
  "status": "passed"
});
});