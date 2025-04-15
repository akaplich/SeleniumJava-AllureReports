package actions.WebstormCreation;

import actions.common.AppsCommon
import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SelectItem
import actions.selenium.Exists
import actions.selenium.SetFocus
import actions.selenium.SendKeys
import actions.selenium.SetReactTags
import actions.WebstormCreation.SetClickOnAppTileInAppsPillarPage
import screens.SetupWizard.WizardLocators
import actions.selenium.ExplicitWait
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait
import actions.selenium.Browser
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

class CreatePipelineWithSchedulerV3{
    public void run(def params){
        //if on Products page, select app
        if(Exists.run(ID:"//*[@data-action='cancel']")==0){ 
            assert params."App Name (optional)"!=null, "Error - Provide App Name"
            SetClickOnAppTileInAppsPillarPage clickOnAppTile = new SetClickOnAppTileInAppsPillarPage()
            clickOnAppTile.run("App Name":params."App Name (optional)")
        }
        //SPONSOR
        if(params."Sponsor Name"){AppsCommon.UserPickerAddRemove("Field Name":"Sponsor",User:params."Sponsor Name","Add or Remove":params."Sponsor Add or Remove")}
		//TOPIC
        if(params."Title"){ SetText.run("ID Type":"By", By:WizardLocators.title, Text:params."Title")}
        if(params."Description") {SetText.run("ID Type":"By", By:WizardLocators.description,Text:params."Description")}
        continueCancelBack(params."Action on Topic Page")
        //DESIGN PAGE
        AppsCommon.ChooseDesignTemplate(params)
        continueCancelBack(params."Action on Design Page")
        //PARTICIPANTS
        sleep(2000)
        if(params."Early Access" == null){
            AppsCommon.UserPickerAddRemove("Field Name":"Early Access",User:"ALL","Add or Remove":"Add")
            AppsCommon.UserPickerAddRemove("Field Name":"Early Access",User:"ALL","Add or Remove":"Remove")

        }else{
            AppsCommon.UserPickerAddRemove("Field Name":"Early Access",User:params."Early Access","Add or Remove":params."Early Access Add or Remove")
        }
        AppsCommon.UserPickerAddRemove("Field Name":"General Access",User:params."General Access","Add or Remove":params."General Access Add or Remove")
        //ROLES
        if(params."Administrator Field Title"){
        	SetReactTags.setMemberTagsWithAddRemoveNewSetupWizard("Field Name":params."Administrator Field Title",
                                                                  User:params."Administrator Field Value",
                                                                  "Add or Remove":params."Administrator Field Value Add or Remove")      
        }
        if(params."Moderator Field Title"){
        	SetReactTags.setMemberTagsWithAddRemoveNewSetupWizard("Field Name":params."Moderator Field Title",
                                                                  User:params."Moderator Field Value",
                                                                  "Add or Remove":params."Moderator Field Value Add or Remove")      
        }
        if(params."Manager Field Title"){
        	SetReactTags.setMemberTagsWithAddRemoveNewSetupWizard("Field Name":params."Manager Field Title",
                                                                  User:params."Manager Field Value",
                                                                  "Add or Remove":params."Manager Field Value Add or Remove")      
        }
		continueCancelBack(params."Action on Participants Page")        
        //SITE SCHEDULE PAGE
        if(params."Enable Site Scheduler for initiative" == "On"){
            Click.run("ID Type":"By", By:WizardLocators.toggleSchedulerOff)
        }else if(params."Enable Site Scheduler for initiative" == "Off"){
                        Click.run("ID Type":"By", By:WizardLocators.toggleSchedulerOn)
        }
        SetSchedulerV3FieldsinSetupWizard.run(params)
        continueCancelBack(params."Action on Site Schedule Page")
        sleep(30000)
    }
    
     //action buttons
    private void continueCancelBack(String action){
        By buttonLocator = null
        println("My action: ${action}")
        if(action == null || action == "Continue"){
        //if(action == "Continue"){
            buttonLocator = WizardLocators.continueButton
            println("Will continue")
        }else if(action == "Cancel"){
            buttonLocator = WizardLocators.cancelButton
            println("Will cancel")
        }else if(action == "Back"){
            buttonLocator = WizardLocators.backButton
            println("Will back")
        }else if(action.toLowerCase().contains("create")){
            buttonLocator = WizardLocators.createButton
            println("Will create")
        }
        // Wait for the button to be visible
        //locate it and click it
        if (buttonLocator != null) {
            println("button location is not null ... will click")
            WebDriverWait wait = new WebDriverWait(Browser.Driver,3)
            wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
            Click.run("ID Type":"By", By:buttonLocator)
        }
    }  
}