Instructions:
* Install Intellij Community
* run "mvn clean install" to clear dependencies and download them based on the POM
* Install GitHub Copilot plugin into Intellij

Running Locally (If docker isn't working for you)
* set settings.properties.environment.target = local
* Browser should now assign Driver using Chromedriver instead of RemoteWebDriver

Running From Commandline
* Examples
  * Run a couple cases that are short and do not copy affiliate, and generate a site report
    * "mvn clean test -Dgroups="Demo" site"
  * Run the 5 smoke test cases, and generate a site report
    * "mvn clean test -Dgroups="Smoke" site"  
    * mvn clean test -Denvironment.url="brightideatest.com" -Dgroups="Smoke" -Dheadless=false -Dselenium.grid.url="http://localhost:4444" -Dwebdriver.timeouts.implicitlywait=30 -Dwebdriver.remote.quietExceptions=false -DforkCount=2 -DreuseForks=true -Dparallel=classes site 
  * Run a single standalone demo test and generate a site report
    * "mvn test -Dtest=FirstGroovyScriptTest site"  
  * Run a single smoke testcase on the sandbox environment
    * "mvn clean test -Denvironment.url=brightideasandbox.com -Dtest=C44_SubmitNewValidIdeaWithAllRequiredFields"
  * Run Parallel using multiple containers
    * mvn clean test -Denvironment.url="brightideatest.com" -Dgroups="Smoke" -Dheadless=false -Dselenium.grid.url="http://localhost:4444" -Dwebdriver.timeouts.implicitlywait=30 -Dwebdriver.remote.quietExceptions=false -DcontainerCount=2 -Dsurefire.shardIndex=2 -Dsurefire.totalShards=5 site


Steps to import RWHQ Testcase
1. Create a new groovy file/class using the RWHQ name. Spaces and dashes need to be removed. I've been using names like this TC_C10805_PostUpdate
2. Copy groovy code into the class. Replace the "class RedwoodHQTestCase{" with the one generated during the file creation
5. (Optional) Add 'private static final Logger logger = LoggerFactory.getLogger([classname].class);'
6. (Optional) Replace qualified names with imports

Steps to import RWHQ Testcase in bulk
1. Postman browser extension to sync cookies and captures network traffic
2. In postman perform find the executiontestcases query and execute, save the resulting json
   Example: https://rwhq2.brightidea.cloud/executiontestcases/6746eda3783ea7ed43eac041?_dc=1749057390067
3. Use RWHQGetTCGroovyById.sh to download testcases referenced in json
   4. Update json in script
   5. update cookie information including sessionid and AWSELBAuthSessionCookie
   6. Run script
7. Move all cases into a folder, correct any issues in the titles manually
8. Import into SeleniumJava
9. Replace in files for the following
   10. testng imports should be replaced with junit imports
   11. @BeforeAll replaces the testng before tag
   12. @AfterAll needs to be removed, we are covering that in testbase

Testing GitHub Actions locally using Docker
- Reference: https://youtu.be/YORvmxQBPeM?si=HI-QKO9pZWw7x1lF
- Install Act: https://github.com/nektos/act
- Dry Run: act -j [workflow name] -n
- Full run: act -j [workflow name]

Local Selenium Grid on Docker
* References:
  * https://github.com/SeleniumHQ/docker-selenium?tab=readme-ov-file
* Commands:
  * docker network create grid
  * docker run -d -p 4442-4444:4442-4444 --net grid --name selenium-hub --platform=linux/amd64 selenium/hub:latest
  * (Repeat for each runner you want)
    * docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub --shm-size="4g" -e SE_NODE_MAX_SESSIONS=1 -e SE_JAVA_OPTS="-Xmx1024m" -e SE_NODE_SESSION_TIMEOUT=180 --platform=linux/amd64 selenium/node-chrome:latest
* Open http://localhost:4444/ in browser for Selenium Grid UI
* Use the single container configuration to debug
* Cleanup
  * Print docker instances: docker ps
  * delete each instance: docker stop [instance id]
  * remove each instance: docker rm [instance id]
  * docker stop selenium-hub 
  * docker rm selenium-hub


* MAC Instructions for a Single container for debugging
  * Commands
    * docker pull --platform=linux/amd64 selenium/standalone-chrome
    * docker run -d -p 4444:4444 -p 7900:7900 --shm-size="4g" -v /dev/shm:/dev/shm --platform=linux/amd64 selenium/standalone-chrome
  * Open http://localhost:4444/ in browser for Selenium Grid UI
  * Open http://localhost:7900/ in browser for VNC to container (Watch case running)
    * Note: Any VNC client can be used to connect to the container 
  * Cleanup
    * Print docker instances: docker ps
    * delete each instance: docker stop [instance id]


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