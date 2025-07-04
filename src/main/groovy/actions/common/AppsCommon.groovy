package actions.common;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SetCheckBox
import actions.selenium.SetText
import actions.selenium.SetFocus
import actions.selenium.Exists
import java.nio.file.Paths
import actions.selenium.SendKeys
import org.openqa.selenium.interactions.Actions
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements
import org.openqa.selenium.StaleElementReferenceException;
import actions.selenium.SetReactTags

class AppsCommon{
    public static void UserPickerAddRemove(def params){
        //"Field Name" (string)
        //"User" (string)
        //"Add or Remove" (string) = Add, Remove

        if(params."User"){
            params."User".split(",").eachWithIndex{ name, x ->
                if(params."Add or Remove".split(",")[x]=="Add"){
                    //often throws StaleElement exception
                    try {
                        Click.run(ID:"//*[contains(text(),'${params."Field Name"}')]/..//*[@id='member_search_input']")
                    }catch (StaleElementReferenceException e){
                       System.out.println("Stale element encountered. Retrying...") 
                       sleep(1000)
                       Click.run(ID:"//*[contains(text(),'${params."Field Name"}')]/..//*[@id='member_search_input']")
                    }
                    SetText.run(ID:"//*[contains(text(),'${params."Field Name"}')]/..//*[@id='member_search_input']",Text:name)
                    sleep(1000)
                    Click.run(ID:"//DIV[contains(@style,'display:none') or starts-with(@style,'display: block')]/UL/LI[starts-with(@data-value,'${name}') or contains(@email,'${name}') and contains(@class,'cur')]/DIV/DIV","Type of Click":"Javascript") 
                }
                else{
                     Click.run(ID:"//*[contains(text(),'${params."Field Name"}')]/..//*[@id='member_search_input']//*[contains(text(),'${name}')]/../A")
                }
            }
        }
    }
    public static void ChooseDesignTemplate(def params){
        //"Choose Design Template" (string)
        //"Copy from an Existing Initiative" (string)
        //"Copy from Enterprise Checkbox Name" (string)
        //"Copy from Enterprise Checkbox Check" (string) = TRUE, FALSE

        if(params."Choose Design Template"){
            switch(params."Choose Design Template"){
                case "Use Default Design":
                Click.run(ID:"//*[@id='design-default']")
                break
                case "Copy from an Existing Initiative":
                Click.run(ID:"//*[@id='design-initiative']")
                SetText.run(ID:"//*[@id='design-initiative-typeahead']",Text:params."Copy from Existing Initiative Name", "Type of Clear":"Cut")
                sleep(2000)
                Click.run(ID:"//*[@class='component-typeahead-list-element']/*[text()='${params."Copy from Existing Initiative Name"}']")
                break
                case "Copy from Enterprise Site":
                params."Copy from Enterprise Checkbox Name".split(",").eachWithIndex{ name, x ->
                    def id
                    switch(name){
                        case "Copy Colors from Enterprise":
                        id = "//*[@id='design-enterprise-colors']"
                        break
                        case "Copy Banner from Enterprise":
                        id = "//*[@id='design-enterprise-banner']"
                        break
                        case "Copy Footer from Enterprise":
                        id = "//*[@id='design-enterprise-footer']"
                        break
                        case "Copy Custom CSS from Enterprise":
                        id = "//*[@id='design-enterprise-css']"
                        break
                    }
                    SetCheckBox.run(ID:id,Check:params."Copy from Enterprise Checkbox Check".split(",")[x].toBoolean())
                }
                break
            }
        }
        if(params."Project Room"){
            if(params."Project Room"=="General, Stage Gate Process (system default)"){
                Click.run(ID:"//*[@id='project_room_template_id']")
                Click.run(ID:"//*[@class='component-typeahead-list-element']/*[text()='General, Stage Gate Process (system default)']")
            } else {
                SetText.run(ID:"//*[@id='project_room_template_id']",Text:params."Project Room", "Type of Clear":"Cut")
        		sleep(2000)
                Click.run(ID:"//*[@class='component-typeahead-list-element']/*[text()='${params."Project Room"}']")
            }        	    
        }     
        sleep(2000)        
        if(params."Action on Design Tab"== null || params."Action on Design Tab"=="Continue"){
            Click.run(ID:"//*[@class='bi-button-success-md']")
        } else if(params."Action on Design Tab"=="Cancel"){
                Click.run(ID:"//*[@data-action='cancel']")
            } else if(params."Action on Design Tab"=="Back"){
                Click.run(ID:"//*[@data-action='back']")
                sleep(2000)
            }
        }

    public static void ImportUserGroup(def params){
        //"Import User Group As" (string)
        //"Group Name" (string)
        //"Add or Remove User Group" (string) = Add, Remove
        //"Import Group File" (string)
        //"Import User Group Action" (string) = Import,Cancel
        //"Check Complete Modal Action" (string) = Finish Import,Cancel Import

        if(params."Import User Group As"){
            def os = System.getProperty("os.name").toLowerCase();
            def groupName = params."Group Name".split(",")
            def fileName
            params."Import User Group As".split(",").eachWithIndex{ name, x ->
                if(params."Add or Remove User Group".split(",")[x]=="Add"){
                    sleep(2000)
                    if(name=="Help Box"){
                        Click.run(ID:"//*[@class='help-container-cell']/..//*[contains(@class,'setup-import-users')]")
                    } else {
                        Click.run(ID:"//*[text()='${name}']/..//A")
                    }
                    def file = params."Import Group File".split(",")
                    if(os.contains("nix") || os.contains("nux")||os.contains("aix")){
                		fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"/TestCaseResourceFiles/${file[x]}"
            		}else{
                		fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"\\TestCaseResourceFiles\\${file[x]}"
            		}
                    SendKeys.run(ID:"//*[@id ='user-import-file']",Text:fileName)
                    SetText.run(ID:"//*[@id='user-import-group']",Text:groupName[x])
                    def groupAction = params."Import User Group Action".split(",")
                    if (groupAction[x] == "Import") { 
                        Click.run(ID:"//*[@class='bimodal-footer']//*[text()='Import']")
                        sleep(3000)
                        if(Exists.run(ID:"//*[@id='user-import-check-outer']")>0) { 
                            def checkModalAction = params."Check Complete Modal Action".split(",")
                            if (checkModalAction[x] == "Finish Import") {
                                Click.run(ID:"//*[@id='error-check-btns']/div[text()='Finish Import']")
                                sleep(2000)
                                Click.run(ID:"//*[@id='user-import-done-btn']")
                            } else {Click.run(ID:"//*[@id='error-check-btns']/div[text()='Cancel Import']")}
                        } else {Click.run(ID:"//*[@id='user-import-done-btn']")}
                    } else {Click.run(ID:"//*[@class='bimodal-footer']//*[text()='Cancel']")}
                } else {Click.run(ID:"//*[contains(text(),'${name}')]/..//*[contains(text(),'${groupName[x]}')]/..//*[@class='eval_right fa fa-times pre-add']")}
            }
        }
    }
    
    public static void DuplicateUserPickerAddRemove(def params){
        //"Field Name" (string)
        //"User" (string)
        //"Add or Remove" (string) = Add, Remove

        if(params."Duplicate User"){
            params."Duplicate User".split(",").eachWithIndex{ name, x ->
                if(params."Add or Remove".split(",")[x]=="Add"){
                    SetFocus.run(ID:"//*[contains(text(),'${params."Duplicate Field Name"}')]/../..//*[@id='member_search_input']")
                    SetText.run(ID:"//*[contains(text(),'${params."Duplicate Field Name"}')]/../..//*[@id='member_search_input']",Text:name,"Type of Clear":"None")
                    sleep(3000)
                    Click.run(ID:"//DIV[contains(@style,'display:none') or starts-with(@style,'display: block')]/UL/LI[starts-with(@data-value,'${name}') or contains(@email,'${name}') and contains(@class,'cur')]/DIV/DIV","Type of Click":"Javascript") 
                }
                else{
                     Click.run(ID:"//*[contains(text(),'${params."Duplicate Field Name"}')]/../..//*[@id='member_search_input']//*[contains(text(),'${name}')]/../A")
                }
            }
        }
    }
     public static void NewUserPickerAddRemove(def params){ //Anna Test this!
        //"Field Name" (string)
        //"User" (string)
        //"Add or Remove" (string) = Add, Remove
        // also used in System Setup - users - administrators, pipeline setup

        if(params."User"){
            SetReactTags.setMemberTagsWithAddRemoveWithMultipleInputFieldsLabelsAbove(params)
            
        }
    }
    
    public static void MemoUserPickerAddWithPermissions(def params){
        // FOR MEMO: on collab editor, on userhome memo card; only add user with permission
        //"Field Name" (string)
        //"User" (string)
        //"Permission" (string) = can edit, can view, can comment
        //"Send Invite" (string) = TRUE, FALSE
		SetReactTags.setMemberTagsWithoutAddRemove(params)
    }
    
    public static void MemoUserPickerRemoveUpdatePermissions(def params){
        // FOR MEMO: on collab editor, on userhome memo card; only removes or updates users permission
        //"User" (string)
        //"Option" (string) = can edit, can view, can comment, remove user
        
        def xpath
        params.User.split(',').eachWithIndex{name, x->
            xpath = "//*[contains(@class,'f-share-participant-body')]//*[contains(@class,'f-member-list')]//*[contains(@class,'f-member')]//*[.='${name}']"
            SetFocus.run(ID:"${xpath}/../..//*[contains(@class,'f-share-dropdown-participant')]")
            Click.run(ID:"${xpath}/../..//*[contains(@class,'f-share-dropdown-participant')]")			
            Click.run(ID:"${xpath}/../..//UL[contains(@class,'f-dropdown-options')]/LI/*[contains(.,'${params."Option".split(",")[x]}')]","Type of Click":"Move to Element")
        }
    }
    
    public static void MemoUserPickerImportUserGroup(def params){
    	// FOR MEMO: on View Idea 3.0;
        //"FileName"
        //"Name your User Group"
        //"Action"
        
        def fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"\\TestCaseResourceFiles\\${params."FileName"}"
        SendKeys.run(ID:"//*[@id='f-file-upload']",Text:fileName)
        sleep(3000)
        if(params."Name your User Group"){SetText.run(ID:"//INPUT[@id='f-import-group-name']", Text:params."Name your User Group")}
        if(params."Action".contains("Import")){Click.run(ID:"//*[contains(@class,'f-import-btn-container')]//BUTTON/SPAN[.='Import Group']")}
        else if(params."Action".contains("Cancel")){Click.run(ID:"//*[contains(@class,'f-import-btn-container')]//BUTTON/SPAN[.='Cancel']")}
    }
    
    public static void NewUserPickerAddRemoveInSetupWizard(def params){
        //"Field Name" (string)
        //"User" (string)
        //"Add or Remove" (string) = Add, Remove
        SetReactTags.setMemberTagsWithAddRemove(params)
    }
    
     public static void NewUserPickerAddRemoveInDuplicateNewModal(def params){
        //"Field Name" (string)
        //"User" (string)
        //"Add or Remove" (string) = Add, Remove

        if(params."User"){
            SetReactTags.setMemberTagsWithAddRemoveWithMultipleInputFieldsLabelsSidebySide(params)
        }
    }
    public static void setEnableSiteSchedulerforInitiative(def params){
        Click.run(ID:"//*[contains(@class,'bi-toggle')]/..")      
    }
    
    public static void SetDepartmentalIdeaboxSubpipelines(def params) {
         if (params."SubPipeline Name" && params."SubPipeline Field Name") {
              params."SubPipeline Name".split(",").eachWithIndex { name, x ->
                  def fieldNames = params."SubPipeline Field Name".split(",")
            	  SetText.run(ID:"//*[contains(@class,'form-group') or contains (@class,'fractal-input')]/LABEL[text()='${fieldNames[x]}']/..//INPUT", Text: name, "Type of Clear": "None")
              }
        }
    } 
}