package BaseClasses

import io.qameta.allure.Allure
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.TestWatcher
import actions.selenium.Browser
import ru.yandex.qatools.ashot.AShot
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import javax.imageio.ImageIO
import java.awt.image.BufferedImage


class FailureCaptureExtension implements TestWatcher, TestExecutionExceptionHandler{
    static final String RERUN_FILE_PATH = "target/surefire-reports/rerunFailingTests.txt"
    static Set<String> recordedFailures = Collections.synchronizedSet(new HashSet<>()) //auto dedupe, thread safe

    @Override
    void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        // This method is called when a test throws an error or exception
        captureFailure(context, throwable)
    }
    @Override
    void testFailed(ExtensionContext context, Throwable cause){
        captureFailure(context, throwable)
    }
    private static void captureFailure(ExtensionContext context, Throwable cause) {
        try{
            def outputFile = new File(RERUN_FILE_PATH)
            def testClass = context.getRequiredTestClass().name
            def testMethod = context.getRequiredTestMethod().name
            def fullName = "$testClass#$testMethod"
            String testName = context.getDisplayName()

            // Save test name to rerun file
            System.out.println(">>> ❌ Test failed: $fullName")

            //prevent duplicates
            if (recordedFailures.add(fullName)) {
                // Only write if it wasn't already seen
                println(">>> Saving test name to rerun file: $fullName")
                outputFile.withWriterAppend { writer ->
                    writer.writeLine(fullName)
                }
            }
            // grab screenshot bytes
            System.out.println(">>> 📸ScreenshotOnFailureExtension caught a failure in: " + testName)
            BufferedImage fullScreenshot = new AShot()
                    .takeScreenshot(Browser.Driver)
                    .getImage();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(fullScreenshot, "PNG", baos);
            byte[] bytes = baos.toByteArray();
            Allure.getLifecycle().addAttachment(
                    "Failure screenshot of $testName",
                    "image/png",
                    "png",
                    new ByteArrayInputStream(bytes)
            )
        }
        catch (Exception e){
            // don’t let screenshot errors hide the original test failure
            e.printStackTrace()
        }
        finally{
            if (Browser.Driver != null) {
                System.out.println(">>> Quitting browser after failure screenshot.")
                Browser.quitDriver()
            }
        }
    }
    void testSuccessful(ExtensionContext context) {
        // Quit driver normally if it wasn't already
        if (Browser.Driver != null) {
            System.out.println(">>> Test passed. Quitting browser.")
            Browser.quitDriver()
        }
    }
}