package actions.ActionItems;

import actions.selenium.Click
import screens.ActionItems.JudgingActionItem
import org.openqa.selenium.By
import actions.selenium.SetText

class SetClickonIdeaCodeorViewDetailsonJudgingActionItem{
    public void run(def params){
        
        if(params."Idea Code or View Details"){
            if(params."Idea Code or View Details"=="Idea Code"){
            	if(params."Idea Code"){
                	Click.run("ID Type":"By",By:JudgingActionItem.getideaCode(params."Idea Code"))
            	} else {
                	Click.run("ID Type":"By",By:JudgingActionItem.ideaCode)
            	}             
        	} else {
            	Click.run("ID Type":"By",By:JudgingActionItem.viewDetailsLink)
            }
        }
        
        SetText.run("ID Type":"By", By:JudgingActionItem.searchField,"Type of Clear":"Cut", Text:params."Search")
        if(params."Clear"==true){
            Click.run("ID Type":"By",By:JudgingActionItem.clear)
        }
    }
}