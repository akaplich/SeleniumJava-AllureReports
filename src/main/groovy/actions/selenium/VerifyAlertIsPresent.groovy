package actions.selenium;

import org.openqa.selenium.Alert
import org.openqa.selenium.WebDriver
import actions.selenium.Browser
import org.openqa.selenium.NoAlertPresentException;

class VerifyAlertIsPresent{
    public void run(def params){
        if(params."Present"==true){
            assert isAlertPresent(Browser.Driver) == true, "Error - Alert was expected but not found" 
        }else if(params."Present"==false){
            assert isAlertPresent(Browser.Driver) == false, "Error - Alert was not expected but found" 
        }
    }
    // Helper function to determine if alert is present
    public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }        
}