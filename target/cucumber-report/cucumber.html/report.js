$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "Topmenu functionality",
  "description": "As user I can check all topmenu\u0027s functionalities",
  "id": "topmenu-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4347173200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User Should navigate to selected page",
  "description": "",
  "id": "topmenu-functionality;user-should-navigate-to-selected-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select any top menu\u0027s option",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on submenu option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I can see redirected page name",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 86254200,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iSelectAnyTopMenuSOption()"
});
formatter.result({
  "duration": 1723145699,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iClickOnSubmenuOption()"
});
formatter.result({
  "duration": 1979457899,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iCanSeeRedirectedPageName()"
});
formatter.result({
  "duration": 23768501,
  "status": "passed"
});
formatter.after({
  "duration": 1384623400,
  "status": "passed"
});
});