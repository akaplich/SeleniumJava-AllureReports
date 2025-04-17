package actions.PipelineStepsView;

import actions.selenium.Click
import actions.selenium.SetCheckBox
//import screens.ReactFormDifferentFieldLocators
//import screens.common.ModalButtonLocators

class ExportStepinPipelineStepsPage{
    public void run(def params){
        if(params."Step to Export"){
        	Click.run(ID:"//SPAN[@class='step_header_name' and text()='${params."Step to Export"}']/../DIV[contains(@class,'img-dropdown')]")
        	sleep(2000)
            Click.run(ID:"//*[@class='step_dropdown' and not(contains(@style,'none'))]/*[@id='dropdown-sub-export-step']")
        }  
        if(params."Action Items" != null){
        	SetCheckBox.run(ID:"//*[@id='action_item_export']",Check:params."Action Items")
        }
        if(params."Submissions" != null){
        	SetCheckBox.run(ID:"//*[@id='idea_export']",Check:params."Submissions")
        }
        if(params."User Score Detail" != null){
        	SetCheckBox.run(ID:"//*[@id='export-multi-score']",Check:params."User Score Detail")
        }
        if(params."Response Detail (Count)" != null){
        	SetCheckBox.run(ID:"//*[@id='export-multi-count']",Check:params."Response Detail (Count)")
        }
        if(params."Response Detail (Percentage)" != null){
        	SetCheckBox.run(ID:"//*[@id='export-multi-percentage']",Check:params."Response Detail (Percentage)")
        }
        if(params."Response Detail (Text)" != null){
        	SetCheckBox.run(ID:"//*[@id='export-multi-text']",Check:params."Response Detail (Text)")
        }
        if(params."Response Detail (Flag)" != null){
        	SetCheckBox.run(ID:"//*[@id='export-multi-flag']",Check:params."Response Detail (Flag)")
        }
        if(params."Action"){
            Click.run(ID:"//*[@class='bimodal-footer']//*[text()='${params."Action"}']")  
        }     
        
        /*new code when react modal is enabled
if(params."Step to Export"){
        	Click.run(ID:"//SPAN[@class='step_header_name' and text()='${params."Step to Export"}']/../DIV[contains(@class,'img-dropdown')]")
        	sleep(2000)
            Click.run(ID:"//*[@class='step_dropdown' and not(contains(@style,'none'))]/*[@id='dropdown-sub-export-step']")
        }  
        if(params."Action Items" != null){
            def fieldParams = [
                    'Field Value': "Action Items"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
        	if(params."Action Items"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
         }
//        	SetCheckBox.run(ID:"//*[@id='action_item_export']",Check:params."Action Items")
//        }
        if(params."Submissions" != null){
            def fieldParams = [
                    'Field Value': "Submissions"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
        	if(params."Submissions"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
         }
//        	SetCheckBox.run(ID:"//*[@id='idea_export']",Check:params."Submissions")
 //       }
        
        if(params."Action"){
            ModalButtonLocators.run(params)   
            if(params."Action"=="Export"){
              Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)  
            } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
            }
//            Click.run(ID:"//*[@class='bimodal-footer']//*[text()='${params."Action"}']")  
        }      

*/
    }
}