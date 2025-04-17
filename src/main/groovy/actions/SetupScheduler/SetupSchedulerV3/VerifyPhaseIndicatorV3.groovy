package actions.SetupScheduler.SetupSchedulerV3;

import actions.selenium.Exists
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import org.openqa.selenium.By

class VerifyPhaseIndicatorV3{
    public void run(def params){
        
        if(params."Is Displayed"==null || params."Is Displayed"==true){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.phaseIndicatorCurrentPhase(params."Current Phase"))==1, "Error - Incorrect Phase Name"
            if(params."Time Left"){
             assert Exists.run("ID Type":"By", By:SchedulerV2Locators.phaseIndicatorCurrentPhaseTime(params."Time Left"))==1, "Error - Incorrect time left"   
            }
        } else if(params."Is Displayed"==false){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.phaseIndicatorCurrentPhase(params."Current Phase"))==0, "Error - Phase indicator should not be displayed"
            if(params."Time Left"){
             assert Exists.run("ID Type":"By", By:SchedulerV2Locators.phaseIndicatorCurrentPhaseTime(params."Time Left"))==0, "Error - Phase indicator should not be displayed"   
            }            
        }        
    }
}