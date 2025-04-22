package TestCases.DockerTesting

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.RemoteWebDriver
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class TC_CDockerTestCase1 {
    private static final Logger logger = LoggerFactory.getLogger(FirstGroovyScriptTest.class);
    public static WebDriver Driver = null

    @Test
    @Tag("DockerSet")
    public void main() {
        //System.setProperty("webdriver.chrome.driver", "/Users/Brightidea/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriverManager.chromedriver().setup();
        // Create a unique temporary directory for user data
        //Path tempDir = Files.createTempDirectory("chrome-user-data");

        Map<String, Object> options = new HashMap<>()
        options.put("enableVNC", true)
        options.put("enableVideo", false)
        options.put("ignore-ssl-errors", true)
        options.put("ignore-certificate-errors", false)
        
        ChromeOptions chromeOptions = new ChromeOptions()
        chromeOptions.setCapability("se:options", options)

        Driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions)

        logger.debug("Navigate to URL");
        Driver.get("http://www.google.com");

        logger.debug("Url Title: " + Driver.getTitle());
        Thread.sleep(1000)
        assert 2 + 2 == 4 : "Math error: 2 + 2 should equal 4"

    }
    @AfterEach
    public void afterState(){
        logger.debug("Quitting");
        Driver.quit();
    }
}