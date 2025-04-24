package BaseClasses

import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.junit.AfterClass
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.nio.file.Files
import java.nio.file.Paths

public class TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeAll
    public static void tb_beforeAll(){
        logger.debug("TestBase BeforeAll");

    }
    @BeforeEach
    public void tb_beforeEach(){
        logger.debug("TestBase BeforeEach");

    }

    @AfterEach
    public void tb_afterEach() {
        logger.debug("TestBase AfterEach");
        new CloseWindow().run([:])
    }
    @AfterAll
    public static void tb_afterAll(){
        logger.debug("TestBase AfterAll");

    }

    public static void captureScreenshot(String testcaseName){
        try {
            logger.info("Saving screenshot using the testcase name: ${testcaseName}")
            // Capture screenshot
            File screenshot = ((TakesScreenshot) Browser.Driver).getScreenshotAs(OutputType.FILE)
            String screenshotPath = "target/surefire-reports/screenshots/${testcaseName}-end-screenshot.png"
            Files.createDirectories(Paths.get("target/surefire-reports/screenshots"))
            Files.copy(screenshot.toPath(), Paths.get(screenshotPath))
            logger.info("Screenshot saved at: " + screenshotPath)
        } catch (Exception e) {
            logger.error("Failed to capture screenshot: ", e)
        }
    }
}