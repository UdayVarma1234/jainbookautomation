$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/PlacingOder.feature");
formatter.feature({
  "name": "Placingorder",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "open browser",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with jain book agency",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.i_have_browser_with_jain_book_agency()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d(//span[text()\u003d\u0027×\u0027])[2]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6KQC12O\u0027, ip: \u002710.202.0.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cts.Launchwebdriver.LaunchWebdriver.setup(LaunchWebdriver.java:24)\r\n\tat com.cts.stepdefinitions.StepDef.i_have_browser_with_jain_book_agency(StepDef.java:27)\r\n\tat ✽.I have browser with jain book agency(file:///C:/Users/uday%20varma/git/jainbookautomation/src/main/resources/feature/PlacingOder.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Selecting payment method",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should select book and I should add to cart and I should select location \u0027Andhra Pradesh\u0027 and I should login \u0027karanammahesh321@gmail.com\u0027,\u0027Mahesh1234\u0027 and I should select payment method",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.i_should_select_book_and_I_should_add_to_cart_and_I_should_select_location_and_I_should_login_and_I_should_select_payment_method(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Assert on presence of element \u0027PayPal/ Credit / Debit / ATM Card\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.assert_on_presence_of_element(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "open browser",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with jain book agency",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.i_have_browser_with_jain_book_agency()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d80.0.3987.149)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6KQC12O\u0027, ip: \u002710.202.0.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\UDAYVA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55533}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1c5f14eaa0d2eac63fe5b01191605341\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.cts.Launchwebdriver.LaunchWebdriver.setup(LaunchWebdriver.java:23)\r\n\tat com.cts.stepdefinitions.StepDef.i_have_browser_with_jain_book_agency(StepDef.java:27)\r\n\tat ✽.I have browser with jain book agency(file:///C:/Users/uday%20varma/git/jainbookautomation/src/main/resources/feature/PlacingOder.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Select book in Hot bargin",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should click on hotbargin and I should click on search and enter the book title \u0027architectural graphics\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.i_should_click_on_hotbargin_and_I_should_click_on_search_and_enter_the_book_title(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Assert on presence of book \u00270\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.assert_on_presence_of_book(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "open browser",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with jain book agency",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDef.i_have_browser_with_jain_book_agency()"
});
