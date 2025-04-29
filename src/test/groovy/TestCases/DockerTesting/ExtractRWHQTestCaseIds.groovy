package TestCases.DockerTesting

import actions.selenium.Browser
import actions.selenium.SendKeys
import actions.selenium.utils.Elements
import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.Test
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.openqa.selenium.By

class ExtractRWHQTestCaseIds {
    private static final Logger logger = LoggerFactory.getLogger(FirstGroovyScriptTest.class);

    @Test
    public void main() {
        //System.setProperty("webdriver.chrome.driver", "/Users/Brightidea/Documents/chromedriver-mac-arm64/chromedriver");
        logger.debug("Downloading ChromeDriver");
        WebDriverManager.chromedriver().setup();
        // Create a unique temporary directory for user data
        //Path tempDir = Files.createTempDirectory("chrome-user-data");

        // Set Chrome options
        logger.debug("Setting Options");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=" + tempDir.toAbsolutePath().toString());
        //options.addArguments("--no-first-run", "--no-default-browser-check");
        options.addArguments(
                "--no-sandbox",
                "--no-first-run",
                "--display=:10",
                "--window-size=2560,1440",
                "--enable-chrome-browser-cloud-management",
                "--remote-debugging-port=9222",
                "--start-maximized",
                "--enable-automation",
                "--xkb",
                "--noxrecord",
                "--noxfixes",
                "--noxdamage",
                "--use-gl=swiftshader",
                "--enable-logging",
                "--log-file=/var/log/rwhq/chromium-debug.log",
                "--skip-force-online-signin-for-testing",
                "--disable-popup-blocking",
        )

        logger.debug("Assigning Chrome Driver");
        WebDriver driver = new ChromeDriver();
        String csvFilePath = "test_case_ids.csv"
        File csvFile = new File(csvFilePath)
        csvFile.text = "" // Clear or create the file

        logger.debug("Navigate to URL");
        driver.get("https://rwhq2.brightidea.cloud/index.html");
        logger.debug("Login Manually");
        driver.get("https://rwhq2.brightidea.cloud/index.html?execution=680c9283a2feb0494d91fd1d&project=Brightidea");

        String containerXpath = "//*[@id='gridview-1390']"
        WebElement containerElement = driver.findElement(By.xpath(containerXpath));
        for (i in 1..50000){
            String xpath = "//*[@id='gridview-1390-body']//td[2]//a"
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            for (WebElement element : elements) {
                String href = element.getDomAttribute("href");
                String tcID = href.find(/openResultDetails\("([a-z0-9]+)"/) { match, id -> id }
                println(tcID);
                if (tcID) {
                    csvFile.append("${tcID}\n")
                }
            }
            containerElement.sendKeys(Keys.PAGE_DOWN)
        }


        //driver.quit();
    }
}
