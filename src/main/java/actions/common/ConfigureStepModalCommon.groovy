package actions.common;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SetNewCheckBox
import actions.selenium.SetCheckBox
import actions.selenium.SelectItem
import actions.selenium.SetFocus
import actions.PipelineStepsView.SetStepDropdown
import actions.common.AppsCommon
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys
import actions.selenium.Browser
import actions.selenium.Exists
import actions.selenium.SetCombobox
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements

class ConfigureStepModalCommon{
   public static void ConfigureAssignmentMethodInStepModal(def params){
       if(params."Assignment Method"){
           Click.run(ID:"//*[contains(@class,'fractal-dropdown f-action-assignment')]")
           Click.run(ID:"//*[contains(@class,'fractal-dropdown f-action-assignment')]//*[contains(@class,'f-dropdown-options')]//*[text()='${params."Assignment Method"}']/..")
       }       
   }
    
     public static void ConfigureProjectRoomTemplateAndFolderMapping(def params){
         if(params."Project Room Template"){
             if(Exists.run(ID:"//*[contains(@class,'f-project-room-no-template-container')]/A")==1){
                 Click.run(ID:"//*[contains(@class,'f-project-room-no-template-container')]/A")
             } else {
                SetCombobox.run(ID:"//INPUT[@id='f-project-room-template']", Option:params."Project Room Template") 
             }
         }
         
        if(params."Click on Refresh"){
            if(params."Click on Refresh"==true){
                Click.run(ID:"//*[contains(@data-tooltip-id,'refresh-pr-tooltip')]/..")
                sleep(2000)
            }
        }
         
        if(params."Folder mapping"){
            Click.run(ID:"//*[@id='f-stage-process-folder']/*[contains(@data-test,'f-test-dropdown')]")
            if(params."Folder Mapping Placement Number"){
                Click.run(ID:"//*[contains(@id,'f-stage-process-folder')]//LI[${params."Folder Mapping Placement Number"}]//SPAN[contains(.,'${params."Folder mapping"}')]")
            } else {
                Click.run(ID:"//*[contains(@id,'f-stage-process-folder')]//LI//SPAN[contains(.,'${params."Folder mapping"}')]")
            }            
        }
         if(params."Scorecard Template"){
            Click.run(ID:"//*[@id='f-scorecardTemp-drop']")
            Click.run(ID:"//*[@id='f-scorecardTemp-drop']//*[text()='${params."Scorecard Template"}']/..")      
        }          
    }
    
    public static void ConfigureAdditionalActionItemItemsStepModal(def params){
        if(params."Each Idea will be assigned to evaluators"){
            if(Exists.run(ID:"//*[contains(@class,'f-load-balance-content')]/DIV[1]/DIV[not(contains(@class,'f-checkbox-checked'))]")==1){
                println("hellos")
              SetCheckBox.run(ID:"//*[@id='f-load-balance']/..", Check:Boolean.parseBoolean("true"))  
            }           
            Click.run(ID:"//*[contains(@id,'f-load-balance-number')]/DIV")
            Click.run(ID:"//*[@id='f-load-balance-number']//LI[.='${params."Each Idea will be assigned to evaluators"}']")
        }
        //SetCheckBox.run(ID:"//*[@id='f-idea-editing']/..",Check:params."AllowSetNewCheckBox Assignees to Edit Idea Attributes")
        SetNewCheckBox.run(ID:"//*[@id='f-idea-editing']",Check:params."Allow Assignees to Edit Idea Attributes")
        SetNewCheckBox.run(ID:"//*[@id='f-private-comments']", Check:params."Allow action item assignees to view Private Comments")
		if(params."Switch to static date"==true){
                Click.run(ID:"//*[@id='f-action-item-dd']//BUTTON")
                SetFocus.run(ID:"//*[@id='f-idea-editing']/..")
                SetText.run(ID:"//*[@id='f-action-item-dd']//input",Text:params."Due Date","Type of Clear":"Cut")
        } else {
            SetText.run(ID:"//*[@id='f-action-item-dd']//input",Text:params."Due Date")        
        }
        if(params."Due at Time"){
            Click.run(ID:"//*[contains(@id,'f-action-item-time')]/DIV")
            Click.run(ID:"//*[contains(@id,'f-action-item-time')]//UL[contains(@class,'f-dropdown-options')]/LI[starts-with(.,'${params."Due at Time"}')]")
        }
        if(params."Confirm Set Time"){
            WebElement setTime = Elements.find(ID:"//*[@id='f-action-item-time']/DIV[@data-test='f-test-dropdown']", Browser.Driver)
            assert setTime.getText().equals(params.get("Confirm Set Time")), "Error - Incorrect Default Due Time"
        }
        if(params."Confirm Time Zone"){
            assert Exists.run(ID:"//DIV[contains(@class,'f-action-item-time')]//*[contains(.,'${params."Confirm Time Zone"}')]")==1, "Error - Invalid Time Zone"
        }
    }
    
    public static void VerifyEvaluatorsCount(def params){
        if(params."Evaluators Count"){
             assert Exists.run(ID:"//*[contains(@class,'f-add-evals')]/*[contains(.,'You can still add: ${params."Evaluators Count"}')]")==1, "Error - 'Incorrect count"
        }            
    }
    
    public static void ConfigureNotificationItemsInStepModal(def params){
        SetCheckBox.run(ID:"//*[@id='f-email-alert']/..",Check:params."Email Alert")
        if(params."Send Alerts"){
            Click.run(ID:"//*[@id='f-sendalert-drop']/DIV")
            Click.run(ID:"//*[@id='f-sendalert-drop']//*[text()='${params."Send Alerts"}']/..")
        }
        SetText.run(ID:"//*[@id='f-email-subject']",Text:params."Subject")
        SetText.run(ID:"//*[@id='f-email-body']",Text:params."Email")
    }
    
    public static void ConfigureResultsAndRulesItemsInStepModal(def params){
        Actions action = new Actions(Browser.Driver)
        action.sendKeys(Keys.PAGE_DOWN).build().perform()
        SetCheckBox.run(ID:"//*[@id='f-cancel-ai']/..",Check:params."Cancel Open Action Item")
        if(params."Evaluation Results"){
            SetCheckBox.run(ID:"//*[@id='f-eval-results']/..", Check:params."Evaluation Results") //checks/unchecks Eval Results Checkbox
            if(params."Display on Submission's Evaluation tab when:"){
                Click.run(ID:"//*[@id='f-eval-options']/DIV")
            	Click.run(ID:"//*[@id='f-eval-options']//*[text()='${params."Display on Submissions Evaluation tab when:"}']/..") 
            }
            if(params."Results are visible to"){
                Click.run(ID:"//*[text()='${params."Results are visible to"}']/..//INPUT/..")
                if(params."Results are visible to"=="Administrators and select roles"){
                    SetCheckBox.run(ID:"//*[@id='f-results-evals']/..", Check:params."Evaluators")
                    SetCheckBox.run(ID:"//*[@id='f-results-submitters']/..", Check:params."Submitters")
                }
            }
        }
        SetCheckBox.run(ID:"//*[@id='f-resend-ai']/..",Check:params."Resend action items when submissions return to Step")
		SetCheckBox.run(ID:"//*[text()='Send submitters notifications when evaluator results are ready']/../..//INPUT/..",Check:params."Send submitters notifications when evaluator results are ready")
		SetCheckBox.run(ID:"//*[text()='Make evaluators anonymous']/../..//INPUT/..",Check:params."Make evaluators anonymous")
   }
    
    public static void ConfigureActionsInStepModal(def params){
        if(params."Action"){
            if(params."Action"=="Cancel"){Click.run(ID:"//*[@data-test='modal-footer-cancel']")}
            else if(params."Action"=="Update"){Click.run(ID:"//*[@data-test='modal-footer-submit']//*[text()='Update']")}
            else{Click.run(ID:"//*[@data-test='modal-footer-submit']//*[text()='Activate']")}
            sleep(2000)
        }        
   }
}