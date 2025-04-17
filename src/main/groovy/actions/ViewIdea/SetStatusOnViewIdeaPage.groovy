package actions.ViewIdea;

import actions.selenium.ExecuteJavascript
import actions.selenium.Click
import actions.selenium.SelectItem

class SetStatusOnViewIdeaPage{
    public void run(def params){
    	ExecuteJavascript.run(Code:"window.scrollTo(0, 0);")
        Click.run(ID:"//*[@id='inline-edit-icon-idea-status']","Type of Click":"Javascript")
        SelectItem.run(ID:"//*[@id='idea_status']","Visible Text":params."Field Value")
        if(params.Action=="Change Status") {
            Click.run(ID:"//*[@class='bimodal-footer']//*[text()='Change Status']")
        } else { Click.run(ID:"//*[@class='bimodal-container']//*[text()='${params.Action}']")}
        sleep(2000)
    }
}