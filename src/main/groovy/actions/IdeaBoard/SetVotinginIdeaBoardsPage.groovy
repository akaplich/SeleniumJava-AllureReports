package actions.IdeaBoard;

import actions.selenium.Click
import actions.selenium.*

class SetVotinginIdeaBoardsPage{
    public void run(def params){
        
        def path = "//*[@class='f-card-title' and text()='${params."Idea to be Voted"}']"
        sleep(2000)
        SetFocus.run(ID:path)
        SetFocus.run(ID:"${path}/../../..//DIV[contains(@class,'f-card-voting-wrapper')]")
        if(params."Promote or Demote" == "Demote"){
            SetFocus.run(ID:"${path}/../../..//*[contains(@class,'f-view-idea-down-vote')]")
            Click.run(ID:"${path}/../../..//DIV[contains(@class,'f-card-voting-wrapper')]//*[contains(@class,'f-view-idea-down-vote')]", "Type of Click": "Javascript")
        } else if(params."Promote or Demote" == "Promote"){
            SetFocus.run(ID:"${path}/../../..//*[contains(@class,'f-view-idea-up-vote')]")
             Click.run(ID:"${path}/../../..//DIV[contains(@class,'f-card-voting-wrapper')]//*[contains(@class,'f-view-idea-up-vote')]", "Type of Click": "Javascript")

        }
        if(params."Tooltip"){
            SetFocus.run(ID:"${path}/../../..//*[contains(@class,'f-view-idea-up-vote')]")
            assert Exists.run(ID:"//*[contains(@class,'react-tooltip__show') and contains(.,'${params."Tooltip"}')]")==1, "Error - Failed to find tooltip"
        }
    }
}