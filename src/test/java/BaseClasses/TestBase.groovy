package BaseClasses

import actions.selenium.Browser
import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod

public class TestBase {
    public static Browser browser = Browser.getInstance()

    @BeforeSuite
    public void beforeState(){

    }
    @AfterMethod
    public void afterState(){
        Browser.quit();
    }

}