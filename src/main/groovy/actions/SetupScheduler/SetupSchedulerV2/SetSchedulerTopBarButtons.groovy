package actions.SetupScheduler.SetupSchedulerV2;
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import actions.selenium.*
import org.openqa.selenium.By

class SetSchedulerTopBarButtons{
    public void run(def params){
      
       Click.run("ID Type":"By", By:SchedulerV2Locators.topBarView(params."View"))
       
    }
}