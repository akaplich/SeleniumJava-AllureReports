package TestCases

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.nio.file.Files
import java.nio.file.Path;

public class FirstGroovyScriptTest {
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
                "--disable-popup-blocking"
        )

        logger.debug("Assigning Chrome Driver");
        WebDriver driver = new ChromeDriver();

        logger.debug("Navigate to URL");
        driver.get("http://www.google.com");

        logger.debug("Url Title: " + driver.getTitle());
        logger.debug("Quitting");
        driver.quit();
    }
}