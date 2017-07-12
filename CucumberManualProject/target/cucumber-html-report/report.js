$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("manual.feature");
formatter.feature({
  "line": 1,
  "name": "PitchVision Registration",
  "description": "",
  "id": "pitchvision-registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Filling the data fourm",
  "description": "",
  "id": "pitchvision-registration;filling-the-data-fourm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Start the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Fill the all required fields",
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 9
    },
    {
      "cells": [
        "FirstName",
        "Love9"
      ],
      "line": 10
    },
    {
      "cells": [
        "LastName",
        "OneP"
      ],
      "line": 11
    },
    {
      "cells": [
        "NickName",
        "Really"
      ],
      "line": 12
    },
    {
      "cells": [
        "Email",
        "srihari.naidu@misport.com"
      ],
      "line": 13
    },
    {
      "cells": [
        "password",
        "password"
      ],
      "line": 14
    },
    {
      "cells": [
        "retypepassword",
        "password"
      ],
      "line": 15
    },
    {
      "cells": [
        "Gender",
        "Male"
      ],
      "line": 16
    },
    {
      "cells": [
        "Date",
        "2001/01/02"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DataStepDefinition.Start_the_Chrome_browser()"
});
formatter.result({
  "duration": 23148666584,
  "status": "passed"
});
formatter.match({
  "location": "DataStepDefinition.Click_on_the_login_button()"
});
formatter.result({
  "duration": 412991995,
  "status": "passed"
});
formatter.match({
  "location": "DataStepDefinition.click_on_the_register_button()"
});
formatter.result({
  "duration": 2173409461,
  "status": "passed"
});
formatter.match({
  "location": "DataStepDefinition.Fill_the_all_required_fields(DataTable)"
});
formatter.result({
  "duration": 3917728517,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression  because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.29.461585 (0be2cd95f834e9ee7c46bcc7cf405b483f5ae83b),platform\u003dMac OS X 10.12.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 36 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027Reenus-MacBook-Pro.local\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461585 (0be2cd95f834e9ee7c46bcc7cf405b483f5ae83b), userDataDir\u003d/var/folders/1f/64bh46510zb0_lwr2b4b0nhr0000gn/T/.org.chromium.Chromium.7mMZ4O}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 53d96b09890a30fdfab5d7c231c4830c\n*** Element info: {Using\u003dxpath, value\u003d}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat DataFourm.DataStepDefinition.Fill_the_all_required_fields(DataStepDefinition.java:62)\n\tat ✽.Then Fill the all required fields(manual.feature:8)\n",
  "status": "failed"
});
});