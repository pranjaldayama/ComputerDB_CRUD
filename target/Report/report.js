$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Navigate_Verify_BranchPg.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to Branch Page and verify all the elements on Branch Page",
  "description": "  Verify if user is able to navigate to Branch Page and Verify all the elements present on Branch Page",
  "id": "navigate-to-branch-page-and-verify-all-the-elements-on-branch-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to Branch Page and Verify all the elements present on Branch Page",
  "description": "",
  "id": "navigate-to-branch-page-and-verify-all-the-elements-on-branch-page;navigate-to-branch-page-and-verify-all-the-elements-present-on-branch-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is logged in to the application with username \"admin\" and password \"admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Branch Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is able to navigate to Branch Page and verify all the elements are present on Branch Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 52
    },
    {
      "val": "admin",
      "offset": 73
    }
  ],
  "location": "NavigateVerifyBranchPgStepDef.user_is_logged_in_to_the_application_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 10460074260,
  "status": "passed"
});
formatter.match({
  "location": "NavigateVerifyBranchPgStepDef.user_clicks_on_Branch_Link()"
});
formatter.result({
  "duration": 1309671841,
  "status": "passed"
});
formatter.match({
  "location": "NavigateVerifyBranchPgStepDef.user_is_able_to_navigate_to_Branch_Page_and_verify_all_the_elements_are_present_on_Branch_Page()"
});
formatter.result({
  "duration": 3118717598,
  "status": "passed"
});
});