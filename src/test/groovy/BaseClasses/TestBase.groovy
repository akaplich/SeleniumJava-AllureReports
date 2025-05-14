package BaseClasses

import actions.API.Utils.DeleteAffiliate
import actions.selenium.Browser
import actions.selenium.CloseWindow
import actions.selenium.ScreenshotOnFailureExtension
import org.junit.AfterClass
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInfo
import org.junit.jupiter.api.TestReporter
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.ExtensionContext
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.nio.file.Files
import java.nio.file.Paths

@ExtendWith(ScreenshotOnFailureExtension.class)
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
        new DeleteAffiliate().run([:])
    }
    @AfterAll
    public static void tb_afterAll(){
        logger.debug("TestBase AfterAll");

    }

}