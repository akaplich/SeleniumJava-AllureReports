Instructions:
* Install Intellij Community
* run "mvn clean install" to clear dependencies and download them based on the POM
* Install GitHub Copilot plugin into Intellij

Running Locally (If docker isn't working for you)
* set settings.properties.environment.target = local
* Browser should now assign Driver using Chromedriver instead of RemoteWebDriver

Running From Commandline
* "mvn clean test -Dgroups="Demo" site" will run a couple cases that are short and do not copy affiliate, and generate a site report
* "mvn clean test -Dgroups="Smoke" site" will run the 5 smoke test cases, and generate a site report
* "mvn test -Dtest=TestCases.DockerTesting.FirstGroovyScriptTest site will execute a single standalone demo test and generate a site report"

Steps to import RWHQ Testcase
1. Create a new groovy file/class using the RWHQ name. Spaces and dashes need to be removed. I've been using names like this TC_C10805_PostUpdate
2. Copy groovy code into the class. Replace the "class RedwoodHQTestCase{" with the one generated during the file creation
5. (Optional) Add 'private static final Logger logger = LoggerFactory.getLogger([classname].class);'
6. (Optional) Replace qualified names with imports

Testing GitHub Actions locally using Docker
- Reference: https://youtu.be/YORvmxQBPeM?si=HI-QKO9pZWw7x1lF
- Install Act: https://github.com/nektos/act
- Dry Run: act -j [workflow name] -n
- Full run: act -j [workflow name]

Local Selenium Grid on Docker
* References:
  * https://github.com/SeleniumHQ/docker-selenium?tab=readme-ov-file


* MAC Instructions for a Single container for debugging
  * docker pull --platform=linux/amd64 selenium/standalone-chrome
  * docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" -v /dev/shm:/dev/shm --platform=linux/amd64 selenium/standalone-chrome
  * Open http://localhost:4444/ in browser for Selenium Grid UI
  * Open http://localhost:7900/ in browser for VNC to container (Watch case running)
    * Note: Any VNC client can be used to connect to the container 
* MAC Instructions for 5 containers for parallel runs
  * 


Selenoid Installation - Chome is not being updated - Disregard
* Follow these instructions: https://aerokube.com/selenoid/latest/
* Following article is simplified and can be helpful: https://truuts.medium.com/how-to-install-selenoid-on-macos-751ee2955c70
* Be sure to use "chmod +x ./cm_darwin_arm64" so the executable can run on mac
* Go to http://localhost:8080/#/ once the UI is running
* Important Commands
  * Startup
    * ./cm_darwin_arm64 selenoid start --vnc
    * ./cm_darwin_arm64 selenoid-ui start
  * Shutdown
    * ./cm_darwin_arm64 selenoid-ui stop
    * ./cm_darwin_arm64 selenoid stop


Technologies currently included:
* slf4j.Logger with a loggerback backend to provide logging capabilities
* TestNG  for annotations/reporting/etc...
  * https://toolsqa.com/testng/what-is-testng/
  * testng.xml can be used to define test suites or executions using the group tag
  * Use "mvn test -Dsurefire.suiteXmlFiles=path/to/your/testng.xml" to run suite based on TestNG
  * Use "mvn test -Dsurefire.suiteXmlFiles=/src/main/resources/SmokeTestSet.xml" to run smoke suite
  * Use "mvn test -Dtest=TC_C44_SubmitNewValidIdeaWithAllRequiredFields" to run a single case
  * Can generate an emailable report
* ChromeDriverManager (Requires newer Selenium)
  * No longer need to deal with chrome driver versions
* Maven for dependency management

Required to get up and running:
* Cucumber
  * Additional layer intended to align product and technical employees.
  * Additional layer makes maintenance and writing new cases slower
  * May help let technical people write testcases
* Can required parameters be made visible when calling an action/class
* Running on Linux Agent
  * Updated Browser.groovy to Apply properties to chromedriver
* Launcher
  * Github actions and workflows to setup AWS agents and launch testcases
    * https://docs.github.com/en/actions/about-github-actions/understanding-github-actions
    * https://www.blazemeter.com/blog/selenium-github
  * Jenkins to setup AWS agents and launch testcases
  * RedwoodHQ Server
* Reporting Solution
  * Send reports to testrail?
  * Use RedwoodHQ to control runs and manage reports?
    * Maybe keep RWHQ for regression runs and develop locally in intellij
  * testng emailable report :(
* Image Storage
  * Images aren't supposed to be stored in Git, they should be stored in AWS instead

Other potential items that can be integrated:
* Parallel Execution?
  * Selenium Grid
* Visual Comparison Tools
  * Sikuli - Image comparison tool (Free, Old pre AI)
    * https://www.guru99.com/sikuli-tutorial.html
    * http://sikulix.com/quickstart/
  * Applitools Eyes - Visual AI tool for image comparison (Paid?)
    * https://applitools.com/platform/eyes/
  * BrowserStack Percy - AI Visual Testing
    * https://www.browserstack.com/pricing?product=percy&utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=692894559287&utm_campaign=Search-Competitor-Applitools-Global-High-Intent&utm_campaigncode=Applitools-Product-Percy+9032294&utm_term=p+applitools+eyes&cycle=annual
* Other AI Tools
  * testRigor: This tool offers a Selenium integration that can self-heal locators in your Selenium, Java, TestNG/JUnit code. It can store locators and corresponding page information, infer user intent for each locator, and use this information to find new locators for intended elements. This helps in reducing the time spent on test maintenance oai_citation:1,Selenium AI - testRigor AI-Based Automated Testing Tool.

Interesting Article:
* https://www.geeksforgeeks.org/top-ai-testing-tools-for-test-automation/
* https://testguild.com/7-innovative-ai-test-automation-tools-future-third-wave/