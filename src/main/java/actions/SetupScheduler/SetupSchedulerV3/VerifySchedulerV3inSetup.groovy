package actions.SetupScheduler.SetupSchedulerV3;

import actions.selenium.Exists
import actions.selenium.*
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import actions.common.SetupCommon

class VerifySchedulerV3inSetup{
    public void run(def params){
        
        if (params."Navigate"==true){
        SetupCommon.NavigateTab(Tab:"Scheduling")
        sleep(2000)
        }
        
        if(params."Status"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.status(params."Status"))==1,"Incorrect Status"
        }
        if(params."Date"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.dateInTopBar(params."Date"))==1,"Incorrect Date in TopBar"
        }
        if(params."Phase Name"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.phaseStartAndEndDate(params."Phase Name", params."Phase Start and End Date"))==1,"The start and end date for ${params."Phase Name"} is incorrect"
            SetFocus.run("ID Type":"By", By:SchedulerV2Locators.phaseStartAndEndDate(params."Phase Name", params."Phase Start and End Date"))
            if(params."Phase Start and End Date Tooltip"){
                assert Exists.run("ID Type":"By", By:SchedulerV2Locators.reactTooltip(params."Phase Start and End Date Tooltip"))==1,"Incorrect Tooltip"
            }
        }        
    }
}