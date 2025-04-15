package actions.ViewIdea3Fields;

import actions.selenium.Click
import actions.selenium.SetText
import actions.selenium.MouseOver
import actions.common.ViewIdea3Common
import actions.selenium.SendKeyboardAction
import screens.ViewIdea30Locators

class SetViewIdea3DescriptionTabTextField{
     public void run(def params){

        def id
        if(params."Field Name"=="Description"){
        	Click.run("ID Type":"By", By:ViewIdea30Locators.ideaDescription)
			SetText.run("ID Type":"By", By:ViewIdea30Locators.ideaDescriptionTextedit,"Type of Clear":"Cut", Text:params."Field Value")
        }
        else if(params."Field Name"=="Title") {
            MouseOver.run(ID:"//*[contains(@class,'f-title-container')]")
            Click.run(ID:"//*[contains(@class,'f-title-container')]//I","Type of Click":"Javascript")
            id="//*[@id='f-edit-textarea-title']"
            sleep(2000)
            SetText.run(Text:params."Field Value",ID:id,"Type of Clear":"Cut")
        }else if(params."Field Name"=="Team Member") {
            Click.run(ID:"//*[@class='f-question']//*[text()='${params."Field Name"}']/../..//*[contains(@class,'f-edit-users')]")         
            SetText.run(ID:"//*[@class='f-question']//*[text()='${params."Field Name"}']/../..//*[contains(@class,'f-edit-users')]//*[@class='react-tags__combobox-input']",Text:params."Field Value")
            sleep(500)
            if(params."Skip Selection" == true){
                println("Skipping Selection")
            }else{
            	Click.run(ID:"//*[contains(@class,'react-tags__listbox')]//*[text()='${params."Field Value"}'/../../..")               
            }
        }else {
            Click.run("ID Type":"By", By:ViewIdea30Locators.getSubFormQuestionAnswerByTitle(params."Field Name"))
            if(params."Field Value"){
            	SetText.run("ID Type":"By", By:ViewIdea30Locators.getSubFormQuestionTextareaByTitle(params."Field Name"),"Type of Clear":"Cut", Text:params."Field Value")
            }
        }
        sleep(2000)
        if(params.Action){ViewIdea3Common.DescriptionAction(params)}    
    }
}