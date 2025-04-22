package BaseClasses

import actions.selenium.Browser
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.nio.file.Files
import java.nio.file.Paths

public class TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeAll
    public static void beforeState(){

    }

    @AfterAll
    public static void afterState() {
        if (Browser.Driver != null) {
            logger.debug("Quitting Driver in TestBase");
            Browser.Driver.quit(); // Ensure the WebDriver quits
        }
    }

    public static void captureScreenshot(String testcaseName){
        try {
            // Capture screenshot
            File screenshot = ((TakesScreenshot) Browser.Driver).getScreenshotAs(OutputType.FILE)
            String screenshotPath = "screenshots/${testcaseName}-end-screenshot.png"
            Files.createDirectories(Paths.get("screenshots"))
            Files.copy(screenshot.toPath(), Paths.get(screenshotPath))
            logger.info("Screenshot saved at: " + screenshotPath)
        } catch (Exception e) {
            logger.error("Failed to capture screenshot: ", e)
        }
    }
}