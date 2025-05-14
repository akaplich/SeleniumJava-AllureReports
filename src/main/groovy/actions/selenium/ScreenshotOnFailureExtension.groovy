package actions.selenium

import actions.selenium.Browser
import org.junit.jupiter.api.extension.AfterTestExecutionCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.nio.file.Files
import java.nio.file.Paths

class ScreenshotOnFailureExtension implements AfterTestExecutionCallback {
    private static final Logger logger = LoggerFactory.getLogger(ScreenshotOnFailureExtension.class)

    @Override
    void afterTestExecution(ExtensionContext context) {
        if (context.getExecutionException().isPresent()) {
            String testClassName = context.getRequiredTestClass().getSimpleName()
            captureScreenshot(testClassName)
        }
    }

    private void captureScreenshot(String testcaseName) {
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