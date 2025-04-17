package actions.PipelineStepsView;

import actions.selenium.SetReactModal
import actions.selenium.SetReactTags
import actions.POMHelperAndLocators.FormElements.SetReactDateField
import actions.common.AppsCommon
import actions.selenium.Click
import actions.PipelineStepsView.SetActionMenuinPipelineStepsView
import actions.selenium.Browser
import actions.selenium.Exists
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements

class SetUpdateAssigneeModal{
    public void run(def params){
        
        if(params."Open Modal"==true){
            SetActionMenuinPipelineStepsView.run("Menu Option":"Update Assignees...")
        }
        AppsCommon.NewUserPickerAddRemoveInDuplicateNewModal("Field Name":"",User:params."Additional Assignee","Add or Remove":params."Additional Assignee Add or Remove")
        SetReactDateField.run("Date":params."Due Date")
        if(params."Send email alerts to added users"==true){
            Click.run(ID:"//*[@aria-label='Send email alerts to added users']/div/div")
        }
        if(params."Remove Assignee from incomplete or complete action items"){
            params."Remove Assignee from incomplete or complete action items".split(',').each{user -> 
              Click.run(ID:"//*[text()='${user}']//I")
            }    
        }
        if(params."Due Time"){
            Click.run(ID:"//*[contains(@id,'f-assignee-time')]/DIV")
            Click.run(ID:"//*[contains(@id,'f-assignee-time')]//UL[contains(@class,'f-dropdown-options')]/LI[starts-with(.,'${params."Due Time"}')]")
        }
        if(params."Confirm Due Time"){
            WebElement setTime = Elements.find(ID:"//*[contains(@class,'f-assignee-time')]//*[@id='f-assignee-time']/DIV[@data-test='f-test-dropdown']", Browser.Driver)
            assert setTime.getText().equals(params."Confirm Due Time"), "Error - Invalid Due Time"
        }
        if(params."Confirm Time Zone"){
            assert Exists.run(ID: "//*[contains(@class,'f-assignee-time')]//SPAN[contains(.,'${params."Confirm Time Zone"}')]")==1, "Error - Invalid Time Zone"
        }
        SetReactModal.setModalActionButton("Modal xPath":"", Action:params.Action)        
    }
}