package BaseClasses

import actions.API.Utils.DeleteAffiliate
import actions.selenium.CloseWindow
import actions.selenium.utils.OnFailureExtension
import actions.selenium.Browser
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

@ExtendWith(OnFailureExtension.class)
//@ExtendWith(FailureCaptureExtension.class)
@ExtendWith(AllureJunit5.class)
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
        System.out.println(">>> [TestBase] afterEach executing");
        logger.debug("TestBase AfterEach");
        new CloseWindow().run([:])
        new DeleteAffiliate().run([:])
    }
    @AfterAll
    public static void tb_afterAll(){
        logger.debug("TestBase AfterAll");
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

}