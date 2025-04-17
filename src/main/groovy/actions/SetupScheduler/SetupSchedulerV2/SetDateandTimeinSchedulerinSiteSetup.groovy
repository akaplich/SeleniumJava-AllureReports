package actions.SetupScheduler.SetupSchedulerV2;
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import actions.selenium.*
import screens.common.ModalButtonLocators
import org.openqa.selenium.By
import actions.selenium.ExecuteJavascript
import screens.ReactFormDifferentFieldLocators

class SetDateandTimeinSchedulerinSiteSetup{
    public void run(def params){
        
        SetText.run("ID Type":"By",By:SchedulerV2Locators.startDate,Text:params."Start Date", "Type of Clear":"Cut")
        if(params."Start Date Time"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.startDateTimeDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.dropdownOption(params."Start Date Time"))
        }
        SetText.run("ID Type":"By",By:SchedulerV2Locators.endDate,Text:params."End Date","Type of Clear":"Cut")
        if(params."End Date Time"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.endDateTimeDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.dropdownOption(params."End Date Time"))
        }
        if(params."Time Zone"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.timeZone(params."Time Zone"))==1,"Incorrect timezone displayed"
        }
        if(params."Remind Me"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.remindMeDropdown) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.remindMeDropdownOption(params."Remind Me"))
        }
        if(params."On Close Direct Users To"){
           Click.run("ID Type":"By", By:SchedulerV2Locators.onCloseDirectUsers) 
           Click.run("ID Type":"By", By:SchedulerV2Locators.remindMeDropdownOption(params."On Close Direct Users To"))
        }
        if(params."Phase Display"){
            def fieldParams = [
                    'Field Value': "Display phase in widgets and countdown"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
            if(params."Phase Display"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
        }
         if(params.Action){
             ModalButtonLocators.run(params)
             if(params."Action"=="Save Schedule"){
               Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)  
             } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton) 
             }            
        }
        ExecuteJavascript.run(Code:"window.scrollTo(0, 0);")
    }
}