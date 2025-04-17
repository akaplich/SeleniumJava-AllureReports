package BaseClasses

import actions.selenium.Browser
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll

public class TestBase {
    @BeforeAll
    public static void beforeState(){

    }
    @AfterAll
    public static void afterState(){
        //Browser.quit();
    }
}