package actions.PipelineStepsView;

import actions.selenium.SetText
import actions.selenium.ExplicitWait
import actions.selenium.Click
import actions.common.AppsCommon
import actions.selenium.SetCombobox
import org.openqa.selenium.WebElement
import actions.selenium.Browser
import actions.selenium.utils.Elements
import actions.selenium.SetTextByPasting
import actions.selenium.Refresh
import actions.selenium.SetCheckBox
import org.openqa.selenium.StaleElementReferenceException;
import screens.ReactFormDifferentFieldLocators
import actions.selenium.Exists

class SetQuickAddMemoorIdea{
    public void run(def params){

        sleep(3000)
        Click.run(ID:"//*[@class='f-quick-add-wrapper']//button", "Handle Stale Element":true)
        ExplicitWait.run(ID:"//*[contains(@class,'f-quick-add-dropdown')]")
        if(Exists.run(ID:"//*[contains(@class,'f-quick-add-dropdown')]")==0){
            Click.run(ID:"//*[@class='f-quick-add-wrapper']//button", "Handle Stale Element":true, "Type of Click":"Move to Element")
        }
        
        if(params."Memo or Idea"){
            Click.run(ID:"//*[@class='f-quick-add-options']//INPUT[@name='${params."Memo or Idea"}_radio']/..")
        }        
        SetText.run(Text:params."Title",ID:"//*[@id='f-quick-add-memoidea']")
        
        if(params."Author" || params."Category" || params."Status" || params."Click on Show more"==true ){
            Click.run(ID:"//*[contains(@class,'f-quickadd-more')]/button[text()='Show more fields']")
        }
       
        if(params."Author"){
            AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":"",User:params."Author","Add or Remove":params."Author Add or Remove")
        } 
        
        if(params."Category"){
            SetCombobox.run(ID:"//*[@id='fractal-combobox-input' and @placeholder='Choose Category']", Option:params."Category")
        } 
        
        if(params."Status"){
            SetCombobox.run(ID:"//*[@id='fractal-combobox-input' and @placeholder='Choose Status']", Option:params."Status", "Set Text by Pasting":true)
            //SetTextByPasting.run(Text:params."Status", ID:"//*[@id='fractal-combobox-input' and @placeholder='Choose Status']")
        } 
        
        if(params."Hide Submission"){
            def fieldParams = [
                    'Field Value': "Hide submission."
                ]
            ReactFormDifferentFieldLocators.run(fieldParams)
            if(params."Hide Submission"=="TRUE") {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxUnChecked)
        	} else if(params."Hide Submission"=="FALSE") {
            	Click.run("ID Type":"By", By:ReactFormDifferentFieldLocators.multiChoiceWithoutFieldNameCheckboxChecked)
        	}
        }
        
        if(params."Click on Show less fields"==true){
            Click.run(ID:"//*[contains(@class,'f-quickadd-more')]/button[text()='Show less fields']")
        }
        
        if(params."Action"){
            Click.run(ID:"//*[contains(@class,'f-quickadd-more')]//*[text()='${params."Action"}']") 
        } 
        sleep(4000)
    }
}