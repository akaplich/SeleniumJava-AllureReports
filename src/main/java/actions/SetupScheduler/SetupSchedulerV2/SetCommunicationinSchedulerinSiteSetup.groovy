package actions.SetupScheduler.SetupSchedulerV2;
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import actions.selenium.*
import screens.common.ModalButtonLocators
import org.openqa.selenium.By
import actions.common.SetupCommon


class SetCommunicationinSchedulerinSiteSetup{
   public void run(def params){
       
       	SetupCommon.NavigateTab(Tab:"Scheduling")
        
        Click.run("ID Type":"By", By:SchedulerV2Locators.addCommunication)
        if(params."Communication Type"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.communicationTypeDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.dropdownOption(params."Communication Type"))
        }
        if(params."Select Template"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.selectTemplateDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.dropdownOption(params."Select Template"))
        }
        SetText.run("ID Type":"By",By:SchedulerV2Locators.sendDate,Text:params."Send Date", "Type of Clear":"Cut")
        if(params."Send Time"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.startDateTimeDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.dropdownOption(params."Send Time"))
            sleep(2000)
        }
        if(params."Time Zone"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.timeZone(params."Time Zone"))==1,"Incorrect timezone displayed"
        }
        if(params."Remind Me"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.remindMeDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.remindMeOption(params."Remind Me"))
        }
        if(params.Action){
             ModalButtonLocators.run(params)
             if(params."Action"=="Save Schedule"){
                 SetFocus.run("ID Type":"By", By:ModalButtonLocators.saveButton)
               Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)  
             } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton) 
             }            
        } 
    }
}