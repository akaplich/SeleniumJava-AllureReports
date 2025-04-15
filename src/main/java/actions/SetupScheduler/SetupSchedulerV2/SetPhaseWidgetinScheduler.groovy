package actions.SetupScheduler.SetupSchedulerV2;

import screens.ReactFormDifferentFieldLocators
import screens.common.ModalButtonLocators
import actions.selenium.*
import org.openqa.selenium.By

class SetPhaseWidgetinScheduler{
   public void run(def params){
        
        if(params."Enable scheduler to control phase widget"){
            def fieldParams = [
                    'Field Value': "Enable scheduler to control phase widget"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
            if(params."Enable scheduler to control phase widget"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
        }
        if(params."Disabling Scheduler + Phase Widget Action"){
             ModalButtonLocators.run(params)
             if(params."Disabling Scheduler + Phase Widget Action"=="Cancel"){
               Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)  
             } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.saveButton) 
             }            
        }         
    }
}