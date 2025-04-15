package actions.SetIdeaFields;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.GetText
import actions.selenium.Exists


class SetPostIdeaTextField{
    public static void run(def params){
        if(params."Field Value"){
            if(params."Field Name".contains("Description") || params."Field Name"=="Please add any information as to why your name would be best."){
                if(params."Field Value"){
                    SetText.run(ID:"//*[@id='idea-form-description']//DIV[starts-with(@class,'redactor-styles redactor-in redactor-in')]", Text:params."Field Value", "Type of Clear":"Cut")
                }
            }
            else if(params."Field Name"=="Title" || params."Field Name"=="Name" || params."Field Name"=="Company Name" || params."Field Name"== "Project Title" || params."Field Name"== "Job Title"){
            	SetText.run(Text:params."Field Value", ID:"//*[@id='idea-form-title-input']//input[1]")
            }
            else if(Exists.run(ID:"//LEGEND[contains(text(),'${params."Field Name"}')]/parent::DIV//DIV[starts-with(@class,'redactor-styles redactor-in redactor-in')]",Timeout:1)){    
                SetText.run(Text:params."Field Value",ID:"//LEGEND[contains(text(),'${params."Field Name"}')]/parent::DIV//DIV[starts-with(@class,'redactor-styles redactor-in redactor-in')]")
            }
            //Else its just another text field
            else{
                SetText.run(Text:params."Field Value",ID:"//LEGEND[contains(text(),'${params."Field Name"}')]/parent::DIV//INPUT[1]")
            }
            if(Exists.run(ID:"//LEGEND[contains(text(),'${params."Field Name"}')]")==1){
                Click.run(ID:"//LEGEND[contains(text(),'${params."Field Name"}')]","Type of Click":"Move to Element")}
        }
    }
}