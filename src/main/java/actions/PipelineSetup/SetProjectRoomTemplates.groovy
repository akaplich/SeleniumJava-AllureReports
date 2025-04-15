package actions.PipelineSetup;

import actions.PipelineSetup.SetLeftSideTabInPipelineSetup
import actions.selenium.Click
import org.openqa.selenium.StaleElementReferenceException
import actions.selenium.ExplicitWait
import actions.selenium.SetReactModal

class SetProjectRoomTemplates{
    public void run(def params){
        
        if(params."Tab"){
            SetLeftSideTabInPipelineSetup.run(Tab:params."Tab")
        	ExplicitWait.run(ID:"//*[contains(@class,'f-btn-standard f-btn-sm')]")
        	try {
           		Click.run(ID:"//*[contains(@class,'f-btn-standard f-btn-sm')]")
        	} catch (StaleElementReferenceException e) {
            	System.out.println("Stale element encountered. Retrying...")
            	sleep(1000)
            	Click.run(ID:"//*[contains(@class,'f-btn-standard f-btn-sm')]")
        	}
        }
              
        sleep(3000)
        if(params."Template Name"){
            if(params."Template Name"=="General, Stage Gate Process (system default)"){
                Click.run(ID:"//*[@id='f-template-select']")
                Click.run(ID:"//*[@id='f-combobox-list' and contains(@style, 'flex')]/DIV[contains(@class,'f-combobox-list-item') and starts-with(.,'General, Stage Gate Process (system default)')]", "Type of Click":"Move to Element")
            } else {
                SetReactModal.setModalRadioButtonWithInput("Section xPath":"//*[@class='f-pipeline-pr-template']/../..", "Title":params."Template Name")
            }            
        }
        if(params."Action"){
            SetReactModal.setModalActionButton("Modal xPath":"//*[@class='f-pipeline-pr-template']/../..", "Action":params.Action)  
        }
        if(params."Reset to Default"==true){
            Click.run(ID:"//*[@class='f-pipeline-pr-template']/../..//*[contains(@class,'footer')]//BUTTON[contains(@class,'f-btn-subtle f-btn-sm') and .='Reset to Default']")  
            sleep(4000)
        }       
    }
}
