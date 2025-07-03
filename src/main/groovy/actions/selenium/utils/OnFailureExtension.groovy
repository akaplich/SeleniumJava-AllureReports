package actions.selenium.utils

import actions.selenium.Browser
import org.junit.jupiter.api.extension.AfterTestExecutionCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.logging.LogEntries
import org.openqa.selenium.logging.LogType
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import io.qameta.allure.Allure
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

class OnFailureExtension implements AfterTestExecutionCallback {
    private static final Logger logger = LoggerFactory.getLogger(OnFailureExtension.class)
    //private static final String RERUN_FILE_PATH = "target/surefire-reports/rerunFailingTests.txt"
    private static Set<String> recordedFailures = Collections.synchronizedSet(new HashSet<>())

    private static void recordFailure(ExtensionContext context) {
        try {
            def outputFile = new File(RERUN_FILE_PATH)
            def testClass = context.getRequiredTestClass().name
            def testMethod = context.getRequiredTestMethod().name
            def fullName = "$testClass#$testMethod"

            if (recordedFailures.add(fullName)) {
                println(">>> Saving test name to rerun file: $fullName")
                outputFile.withWriterAppend { writer ->
                    writer.writeLine(fullName)
                }
            }
        } catch (Exception e) {
            logger.error("Failed to record failure: ", e)
        }
    }

    @Override
    void afterTestExecution(ExtensionContext context) {

        if (context.getExecutionException().isPresent()) {
            String testClassName = context.getRequiredTestClass().getSimpleName()
            String testMethodName = context.getRequiredTestMethod().getName()
            String testIdentifier = "${testClassName}_${testMethodName}"
            recordFailure(context)
            captureScreenshot(testClassName)
            captureBrowserLogs(testIdentifier)
            captureDom(testIdentifier)
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
            //added to Allure report
            byte[] bytes = Files.readAllBytes(Paths.get(screenshotPath));
            logger.info("Attaching screenshot to Allure for test: ${testcaseName}")
            Allure.getLifecycle().addAttachment(
                    "Failure screenshot of ${testcaseName}",
                    "image/png",
                    "png",
                    new ByteArrayInputStream(bytes)
            )

        } catch (Exception e) {
            logger.error("Failed to capture screenshot: ", e)
        }
    }

    private void captureBrowserLogs(String testIdentifier) {
        try {
            logger.info("Capturing browser console logs for: ${testIdentifier}")
            LogEntries logs = Browser.Driver.manage().logs().get(LogType.BROWSER)

            if (logs != null && !logs.isEmpty()) {
                String logsPath = "target/surefire-reports/logs/${testIdentifier}-browser-logs.txt"
                Files.createDirectories(Paths.get("target/surefire-reports/logs"))

                StringBuilder logContent = new StringBuilder()
                logContent.append("Browser Console Logs for ${testIdentifier}\n")
                logContent.append("=".multiply(80)).append("\n")

                logs.forEach { log ->
                    logContent.append("${log.getLevel()}: ${log.getMessage()}\n")
                }

                Files.write(
                        Paths.get(logsPath),
                        logContent.toString().getBytes(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING
                )

                logger.info("Browser logs saved at: ${logsPath}")
            } else {
                logger.info("No browser console logs were found")
            }
        } catch (Exception e) {
            logger.error("Failed to capture browser logs: ", e)
        }
    }

    private void captureDom(String testIdentifier) {
        try {
            logger.info("Capturing DOM for: ${testIdentifier}")

            // Get the page source (DOM)
            String pageSource = Browser.Driver.getPageSource()

            if (pageSource != null && !pageSource.isEmpty()) {
                String domPath = "target/surefire-reports/dom/${testIdentifier}-dom.html"
                Files.createDirectories(Paths.get("target/surefire-reports/dom"))

                Files.write(
                    Paths.get(domPath),
                    pageSource.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
                )
                logger.info("DOM saved at: ${domPath}")
            } else {
                logger.info("Could not retrieve DOM")
            }
        } catch (Exception e) {
            logger.error("Failed to capture DOM: ", e)
        }
    }
}