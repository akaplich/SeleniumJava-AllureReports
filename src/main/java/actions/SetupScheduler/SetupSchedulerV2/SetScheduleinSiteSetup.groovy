package actions.SetupScheduler.SetupSchedulerV2;
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import actions.selenium.*
import org.openqa.selenium.By
import actions.common.SetupCommon

class SetScheduleinSiteSetup{
    public void run(def params){

        if (params."Navigate to Tab"==true){
        	SetupCommon.NavigateTab(Tab:"Scheduling")
        	sleep(2000)
        }
        if(params."Click from"=="Remind Icon"){
            Click.run("ID Type":"By", By:SchedulerV2Locators.remindIconForResource(params."Resource"))
        } else if(params."Click from"=="Grid Cell"){
            Click.run("ID Type":"By", By:SchedulerV2Locators.gridCellForResource(params."Resource"))
        } else {
            Click.run("ID Type":"By", By:SchedulerV2Locators.eventTitle(params."Resource"))
        }
    }
}