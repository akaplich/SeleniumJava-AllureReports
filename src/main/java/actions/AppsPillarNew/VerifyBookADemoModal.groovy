package actions.AppsPillarNew;

import actions.selenium.Exists
import actions.selenium.*
import org.openqa.selenium.By
import screens.Apps.AppsPillarLocators

class VerifyBookADemoModal{
    public void run(def params){
        
        if(params."Is Displayed"==true){
            assert Exists.run("ID Type":"By", By:AppsPillarLocators.bookADemoModal)==1,"Book a Demo Modal is not displayed" 
        } else {
            assert Exists.run("ID Type":"By", By:AppsPillarLocators.bookADemoModal)==1,"Book a Demo Modal is displayed" 
        }        
    }
}