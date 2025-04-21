package TestCases.DockerTesting

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class TC_CSelenoidDockerTestCase {
    private static final Logger logger = LoggerFactory.getLogger(FirstGroovyScriptTest.class);

    @Test
    public void main() {
        //System.setProperty("webdriver.chrome.driver", "/Users/Brightidea/Documents/chromedriver-mac-arm64/chromedriver");
        logger.debug("Downloading ChromeDriver");
        WebDriverManager.chromedriver().setup();
        // Create a unique temporary directory for user data
        //Path tempDir = Files.createTempDirectory("chrome-user-data");

        Map<String, Object> options = new HashMap<>()
        options.put("enableVNC", true)
        options.put("enableVideo", false)

        ChromeOptions chromeOptions = new ChromeOptions()
        chromeOptions.setCapability("se:options", options)

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions)

        logger.debug("Navigate to URL");
        driver.get("http://www.google.com");

        logger.debug("Url Title: " + driver.getTitle());
        Thread.sleep(1000)
        logger.debug("Quitting");
        driver.quit();
    }
}