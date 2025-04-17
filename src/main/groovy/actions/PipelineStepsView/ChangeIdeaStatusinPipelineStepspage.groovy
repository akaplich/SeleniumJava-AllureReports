package actions.PipelineStepsView;

import actions.selenium.Click
import actions.selenium.SelectItem
import actions.selenium.SetText
import actions.selenium.SetCheckBox
//import screens.PipelineSteps.ActionMenuLocators
//import screens.ReactFormDifferentFieldLocators
//import screens.common.ModalButtonLocators

class ChangeIdeaStatusinPipelineStepspage{
    public void run(def params){
        Click.run(ID:"//*[@id='actions_dropdown']")
        Click.run(ID:"//*[@id='action-status']")
        
        SelectItem.run(ID:"//*[@id='status-list-dropdown']","Visible Text":params."Status")
        SetCheckBox.run(ID:"//*[@id='add-change-reason-checkbox']",Check:params."Add Status Change Reason")
        sleep(1000)
        SetText.run(Text:params."Add Status Change Reason Text",ID:"//*[@id='status-reason-comment-textarea']")
        SetCheckBox.run(ID:"//*[@id='email-reason-text-checkbox']",Check:params."Include in Email Notification")
        SetCheckBox.run(ID:"//*[@id='idea-comment-checkbox']",Check:params."Include in Comment")
        SetCheckBox.run(ID:"//*[@id='admin-comment-checkbox']",Check:params."Add as an Admin Comment")
        
        if(params.Action=="Change Status"){Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Status']")}
        else{Click.run(ID:"//*[@id='change-status-popup']/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")}
        sleep(3000)
        
        /*new code when this is converted to react
        Click.run(ID:"//*[@id='actions_dropdown']")
        Click.run(ID:"//*[@id='action-status']")
        
        //SelectItem.run(ID:"//*[@id='status-list-dropdown']","Visible Text":params."Status")
        Click.run("ID Type":"By",By:ActionMenuLocators.changeCategoryDropdown)
        if(params."Status"){
            def fieldParams = ['Field Value': params."Status"]
        	ReactFormDifferentFieldLocators.run(fieldParams)
        	Click.run("ID Type":"By",By:ReactFormDifferentFieldLocators.dropdownFieldValue)
        }
        
         if(params."Add Status Change Reason"){
            def fieldParams = [
                    'Field Value': "Add Status Change Reason."
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
        	if(params."Add Status Change Reason"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
         }
        
        
        //SetCheckBox.run(ID:"//*[@id='add-change-reason-checkbox']",Check:params."Add Status Change Reason")
        sleep(1000)
        SetText.run("ID Type":"By",By:ActionMenuLocators.addStatusChangeReason,Text:params."Add Status Change Reason Text")

        if(params."Include in Email Notification"){
            def fieldParams = [
                    'Field Value': "Include in Email Notification"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
        	if(params."Include in Email Notification"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
         }
        if(params."Include in Comment"){
            def fieldParams = [
                    'Field Value': "Include in Comment"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
        	if(params."Include in Comment"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
         }
        if(params."Add as an Admin Comment"){
            def fieldParams = [
                    'Field Value': "Add as an Admin Comment"
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
        	if(params."Add as an Admin Comment"==true) {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
         }
//        SetCheckBox.run(ID:"//*[@id='email-reason-text-checkbox']",Check:params."Include in Email Notification")
//        SetCheckBox.run(ID:"//*[@id='idea-comment-checkbox']",Check:params."Include in Comment")
//        SetCheckBox.run(ID:"//*[@id='admin-comment-checkbox']",Check:params."Add as an Admin Comment")
        ModalButtonLocators.run(params)     
        if(params.Action=="Change Status"){
            //Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Category']")
            Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)}
        else{
            //Click.run(ID:"//BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")
        	Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
        }
/*        if(params.Action=="Change Status"){Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Status']")}
        else{Click.run(ID:"//*[@id='change-status-popup']/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")}*/
    }
}