$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Demo Login",
  "description": "",
  "id": "testing-demo-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14565332000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User login to the page",
  "description": "",
  "id": "testing-demo-login;user-login-to-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User go to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userGoToLoginPage()"
});
formatter.result({
  "duration": 3952071625,
  "status": "passed"
});
formatter.after({
  "duration": 149085709,
  "status": "passed"
});
});