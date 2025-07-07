package BaseClasses

import actions.API.Utils.DeleteAffiliate
import actions.selenium.CloseWindow
import actions.selenium.utils.OnFailureExtension
import actions.selenium.Browser
import io.qameta.allure.Allure
import io.qameta.allure.Attachment
import io.qameta.allure.junit5.AllureJunit5
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import io.qameta.allure.Step

import java.nio.file.Files
import java.nio.file.Paths

@ExtendWith(OnFailureExtension.class)
//@ExtendWith(FailureCaptureExtension.class)
@ExtendWith(AllureJunit5.class)
public class TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    private static final String RERUN_FILE_PATH = "target/surefire-reports/rerunFailingTests.txt";

    @BeforeAll
    public static void tb_beforeAll(){
        logger.debug("TestBase BeforeAll");
        clearRerunFile();

    }
    @BeforeEach
    public void tb_beforeEach(){
        logger.debug("TestBase BeforeEach");

    }

    @AfterEach
    public void tb_afterEach() {
        System.out.println(">>> [TestBase] afterEach executing");
        logger.debug("TestBase AfterEach");
        new CloseWindow().run([:]) // this quits the browser
        new DeleteAffiliate().run([:])
    }
    @AfterAll
    public static void tb_afterAll(){
        logger.debug("TestBase AfterAll");
        attachRerunFileToAllure();
    }
    //wrap each action in a step
    //this will call the Allure wrapper that adds the Step annotation
    protected def runWithStep(Object action, Map args, String stepName) {
        stepWrapper(stepName) {
            action.run(args)
        }
    }
    //this is Allure wrapper that will call the action and add Step annotation to it
    @Step("{stepName}")
    protected def stepWrapper(String stepName, Closure closure) {
        return closure.call()
    }
    private static void clearRerunFile() {
        try {
            File rerunFile = new File(RERUN_FILE_PATH);
            if (rerunFile.exists()) {
                if (rerunFile.delete()) {
                    logger.info("Cleared previous rerun failing tests file: " + RERUN_FILE_PATH);
                } else {
                    logger.warn("Failed to delete rerun failing tests file: " + RERUN_FILE_PATH);
                }
            }
        } catch (Exception e) {
            logger.error("Error while clearing rerun failing tests file: ", e);
        }
    }
    @Attachment(value = "Rerun Failing Tests", type = "text/plain")
    private static byte[] attachRerunFileToAllure() {
        File rerunFile = new File(RERUN_FILE_PATH);
        byte[] bytes = Files.readAllBytes(Paths.get(rerunFile.toPath()));
        Allure.getLifecycle().addAttachment(
                "Rerun Failing Tests",
                "text/plain",
                "txt",
                new ByteArrayInputStream(bytes)
        )
        /*try {
            File rerunFile = new File(RERUN_FILE_PATH);
            if (rerunFile.exists()) {
                logger.info("Attaching rerun failing tests file to Allure report.");
                return Files.readAllBytes(rerunFile.toPath());
            } else {
                logger.info("No rerun failing tests file found to attach.");
                return "No rerun failing tests recorded.".getBytes();
            }
        } catch (Exception e) {
            logger.error("Failed to attach rerun failing tests file to Allure: ", e);
            return ("Failed to attach rerun failing tests file: " + e.getMessage()).getBytes();
        }*/
    }

}