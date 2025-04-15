package actions.ViewIdea30;

import actions.selenium.Click
import actions.selenium.SetText
import actions.selenium.SetFocus
import actions.selenium.SetReactTags

class SetTagsinViewIdea30Page{
    public void run(def params){
        
        sleep(3000)
        SetFocus.run(ID:"//*[contains(@class,'f-edit-tags')]//*[@id='react-tags-idea-tags-combobox']/input[contains(@class,'react-tags__combobox-input')]/..") 
        //SetFocus.run(ID:"//*[contains(@class,'f-edit-tags')]//input[contains(@class,'react-tags__combobox-input')]/..") 
        sleep(1000)
        Click.run(ID:"//*[@id='f-tags-container']//I[contains(@class,'far fa-pencil')]","Type of Click":"Move to Element")
        sleep(500)
        if (params."Tag Name"){
            SetReactTags.setIdeaTagsOrExpertise("Tag Name":params."Tag Name", "Tag Add or Remove":params."Add or Remove", "Set Tab":params."Set Tab")
        }
        Click.run(ID:"//*[@class='f-component-title f-component-title-bold' and text()='Status']")
        sleep(2000)
    }
}