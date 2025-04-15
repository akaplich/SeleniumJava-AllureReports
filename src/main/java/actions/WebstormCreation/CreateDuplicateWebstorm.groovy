package actions.WebstormCreation;

import actions.selenium.SetText
import actions.common.AppsCommon
import actions.selenium.Click
import actions.selenium.Exists
import actions.selenium.SendKeys
import actions.selenium.SelectItem
import actions.selenium.ExplicitWait
import screens.common.ModalButtonLocators

class CreateDuplicateWebstorm{
    public void run(def params){
        
        if(Exists.run(ID:"//button[@id='f-modal-submit'][.='Duplicate'] | //*[@id='bi-modal-button'][.='Duplicate']")==0){
            Click.run(ID:"//SPAN[@class='app-card-name' and text()='Duplicate']")
        }  
        
         if(params."Type of Licensing Model" == "Standard Licensing Model"){
             SetText.run(ID:"//*[@id='name']",Text:params."Name","Type of Clear": "Cut" )
        	 SetText.run(ID:"//*[@id='description']",Text:params."Description")
             AppsCommon.SetDepartmentalIdeaboxSubpipelines("SubPipeline Name":params."SubPipeline Name","SubPipeline Field Name":params."SubPipeline Field Name")
             AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":params."Admin Field Name",User:params."Administrators","Add or Remove":params."Administrators Add or Remove")
             AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":"Pipeline Moderators",User:params."Moderators","Add or Remove":params."Moderators Add or Remove")
             AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":"General Access",User:params."General Access Users","Add or Remove":params."General Access Users Add or Remove")
			 if(params."Action"){
                 ModalButtonLocators.run(params)
            	if(params."Action"=="Cancel"){
                	Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
            	} else{
                	Click.run("ID Type":"By", By:ModalButtonLocators.saveButton) 
                	sleep(10000)
            	}
        	}
         } else {
             SelectItem.run(ID:"//*[@id='existing_pipeline']","Visible Text":params."Pipeline To Duplicate")
        	 SetText.run(ID:"//*[@id='custom-pipeline-name']",Text:params."Name")
        	 SetText.run(ID:"//*[@id='custom-pipeline-desc']",Text:params."Description")
             AppsCommon.SetDepartmentalIdeaboxSubpipelines("SubPipeline Name":params."SubPipeline Name","SubPipeline Field Name":params."SubPipeline Field Name")
             AppsCommon.DuplicateUserPickerAddRemove("Duplicate Field Name":"Administrators","Duplicate User":params."Administrators","Add or Remove":params."Administrators Add or Remove")
             AppsCommon.DuplicateUserPickerAddRemove("Duplicate Field Name":"Moderators","Duplicate User":params."Moderators","Add or Remove":params."Moderators Add or Remove")
             AppsCommon.UserPickerAddRemove("Field Name":"General Access:", User:params."General Access Users","Add or Remove":params."General Access Users Add or Remove")
             if(params."Action"){
            	if(params."Action"=="Cancel"){
                	Click.run(ID:"//*[@id='apps-modal']//*[text()='Cancel']")
            	} else{
                Click.run(ID:"//*[@id='apps-modal']//*[text()='Duplicate']")
                sleep(10000)
            	}
        	}
         }  
        if(params."Should Admin Wait for Pipeline to be Created" == true){
        ExplicitWait.run(ID:"//*[@id='sidebar-pipelines']//*[text()='${params."Name"}']")
        }
    }
}