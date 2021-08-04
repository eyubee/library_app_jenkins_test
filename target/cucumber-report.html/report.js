$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "",
  "description": "  login feature for librarian and student",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user login as librarian",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user login as librarian",
  "keyword": "When "
});
formatter.match({
  "location": "cybertek.library.step_definitions.Login_StepDefinitions.user_login_as_librarian()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "librarian homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "cybertek.library.step_definitions.Login_StepDefinitions.librarian_homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as student",
  "keyword": "When "
});
formatter.match({
  "location": "cybertek.library.step_definitions.Login_StepDefinitions.user_login_as_student()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "student homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "cybertek.library.step_definitions.Login_StepDefinitions.student_homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});