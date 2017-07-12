$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MatchScore.feature");
formatter.feature({
  "line": 1,
  "name": "To check the Match Score Functionality",
  "description": "",
  "id": "to-check-the-match-score-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "to-check-the-match-score-functionality;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Start the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "logged in successfuly",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "to-check-the-match-score-functionality;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "to-check-the-match-score-functionality;login-functionality;;1"
    },
    {
      "cells": [
        "sree.hari",
        "9010satya"
      ],
      "line": 10,
      "id": "to-check-the-match-score-functionality;login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Login Functionality",
  "description": "",
  "id": "to-check-the-match-score-functionality;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Start the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the valid \"sree.hari\" and \"9010satya\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "logged in successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "PVMatchStepDef.start_the_browser()"
});
formatter.result({
  "duration": 16772349986,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sree.hari",
      "offset": 17
    },
    {
      "val": "9010satya",
      "offset": 33
    }
  ],
  "location": "PVMatchStepDef.enter_the_valid_and(String,String)"
});
formatter.result({
  "duration": 8779365730,
  "status": "passed"
});
formatter.match({
  "location": "PVMatchStepDef.logged_in_successfuly()"
});
formatter.result({
  "duration": 10700313002,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Enter the match score",
  "description": "",
  "id": "to-check-the-match-score-functionality;enter-the-match-score",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Click on portal button",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on matchscore button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Entered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "PVMatchStepDef.click_on_portal_button()"
});
formatter.result({
  "duration": 6093715965,
  "status": "passed"
});
formatter.match({
  "location": "PVMatchStepDef.click_on_matchscore_button()"
});
formatter.result({
  "duration": 11736788582,
  "status": "passed"
});
formatter.match({
  "location": "PVMatchStepDef.entered_successfully()"
});
formatter.result({
  "duration": 7004718803,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Entering the match details",
  "description": "",
  "id": "to-check-the-match-score-functionality;entering-the-match-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Click on the add match score",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Select any Date",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Type \"\u003cOpposition\u003e\" of the match",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "type \"\u003cleague\u003e\"s on the field",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the \"\u003cvenue\u003e\" details",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Type the \"\u003cmatchtype\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the \"\u003cMatchFormat\u003e\" from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Choice the \"\u003cMatchGrade\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the \"\u003cTeamName\u003e\" on the field",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Select the \"\u003cResult\u003e\" of the match",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Select \"\u003cSurface\u003e\" type of the match",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "to-check-the-match-score-functionality;entering-the-match-details;",
  "rows": [
    {
      "cells": [
        "Opposition",
        "league",
        "venue",
        "matchtype",
        "MatchFormat",
        "MatchGrade",
        "TeamName",
        "Result",
        "Surface"
      ],
      "line": 31,
      "id": "to-check-the-match-score-functionality;entering-the-match-details;;1"
    },
    {
      "cells": [
        "SriOwn",
        "WorldLeague",
        "Gurgaon",
        "Live",
        "T20",
        "Club",
        "KingMatch",
        "Lost",
        "Grass"
      ],
      "line": 32,
      "id": "to-check-the-match-score-functionality;entering-the-match-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "Entering the match details",
  "description": "",
  "id": "to-check-the-match-score-functionality;entering-the-match-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Click on the add match score",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Select any Date",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Type \"SriOwn\" of the match",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "type \"WorldLeague\"s on the field",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the \"Gurgaon\" details",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Type the \"Live\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the \"T20\" from dropdown",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Choice the \"Club\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the \"KingMatch\" on the field",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Select the \"Lost\" of the match",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Select \"Grass\" type of the match",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PVMatchStepDef.click_on_the_add_match_score()"
});
formatter.result({
  "duration": 699565760,
  "status": "passed"
});
formatter.match({
  "location": "PVMatchStepDef.select_any_Date()"
});
formatter.result({
  "duration": 1679957582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SriOwn",
      "offset": 6
    }
  ],
  "location": "PVMatchStepDef.type_of_the_match(String)"
});
formatter.result({
  "duration": 209388891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WorldLeague",
      "offset": 6
    }
  ],
  "location": "PVMatchStepDef.type_s_on_the_field(String)"
});
formatter.result({
  "duration": 683552442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gurgaon",
      "offset": 11
    }
  ],
  "location": "PVMatchStepDef.enter_the_details(String)"
});
formatter.result({
  "duration": 409584431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Live",
      "offset": 10
    }
  ],
  "location": "PVMatchStepDef.type_the(String)"
});
formatter.result({
  "duration": 412956715,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T20",
      "offset": 12
    }
  ],
  "location": "PVMatchStepDef.select_the_from_dropdown(String)"
});
formatter.result({
  "duration": 927258557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Club",
      "offset": 12
    }
  ],
  "location": "PVMatchStepDef.choice_the(String)"
});
formatter.result({
  "duration": 733673921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "KingMatch",
      "offset": 11
    }
  ],
  "location": "PVMatchStepDef.enter_the_on_the_field(String)"
});
formatter.result({
  "duration": 589454966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lost",
      "offset": 12
    }
  ],
  "location": "PVMatchStepDef.select_the_of_the_match(String)"
});
formatter.result({
  "duration": 494282216,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Grass",
      "offset": 8
    }
  ],
  "location": "PVMatchStepDef.select_type_of_the_match(String)"
});
formatter.result({
  "duration": 641047162,
  "status": "passed"
});
});