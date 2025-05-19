package BaseClasses

import actions.API.Utils.DeleteAffiliate
import actions.selenium.CloseWindow
import actions.selenium.utils.OnFailureExtension
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@ExtendWith(OnFailureExtension.class)
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