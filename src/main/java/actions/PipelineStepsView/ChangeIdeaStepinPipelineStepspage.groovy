package actions.PipelineStepsView;

import actions.selenium.Click
import actions.selenium.SetCheckBox
import actions.selenium.SelectItem
//import screens.PipelineSteps.ActionMenuLocators
//import screens.ReactFormDifferentFieldLocators
//import screens.common.ModalButtonLocators

class ChangeIdeaStepinPipelineStepspage{
    public void run(def params){
        Click.run(ID:"//*[@id='actions_dropdown']")
        Click.run(ID:"//*[@id='action-step']")
        SelectItem.run(ID:"//*[@id='update_idea_select']","Visible Text":params."Step")
        
        SetCheckBox.run(ID:"//*[@id='do-not-show-alert']",Check:params."Don't show me this warning again")
        sleep(5000)
        if(params.Action){
            if(params.Action=="Change Step"){
                println("Clicking the green button")
                Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Step']")}
            else{Click.run(ID:"//*[@id='change_status_popup']//*[text()='Cancel']")}
        }
        sleep(5000)
        
        /*New code when this is convered to react
		Click.run(ID:"//*[@id='actions_dropdown']")
        Click.run(ID:"//*[@id='action-step']")
        Click.run("ID Type":"By",By:ActionMenuLocators.changeCategoryDropdown)
        if(params."Step"){
            def fieldParams = ['Field Value': params."Step"]
        	ReactFormDifferentFieldLocators.run(fieldParams)
        	Click.run("ID Type":"By",By:ReactFormDifferentFieldLocators.dropdownFieldValue)
        }
        //SelectItem.run(ID:"//*[@id='update_idea_select']","Visible Text":params."Step")
        
        SetCheckBox.run(ID:"//*[@id='do-not-show-alert']",Check:params."Don't show me this warning again")
        sleep(5000)
        if(params.Action){
            ModalButtonLocators.run(params)   
        	if(params.Action=="Change Step"){
            	Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)}
        	else{
        		Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
            }
        }
        sleep(5000)
    }
}

*/
    }
}