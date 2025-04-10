package BaseClasses;

import actions.selenium.Browser;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;

public class TestBaseJava {
    @BeforeSuite
    public void beforeState(){

    }
    @AfterMethod
    public void afterState(){
        Browser.quit();
    }
}
