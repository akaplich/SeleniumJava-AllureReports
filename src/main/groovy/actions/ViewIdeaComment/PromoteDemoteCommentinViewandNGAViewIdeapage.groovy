package actions.ViewIdeaComment;

import actions.common.*
import actions.selenium.Click
import actions.selenium.SetText
import actions.general.SetEmojiDialog

class PromoteDemoteCommentinViewandNGAViewIdeapage{
    public void run(def params){
        
        if(params."View Idea or NGA"=="NGA"){
            NGAViewIdeaCommon.NavigateTab(Tab:"Description")
        } else {
            ViewIdeaCommon.NavigateTab(Tab:"Description")
        }             
        
        if(params."Promote or Demote"=="Promote"){
            SetEmojiDialog.run(Comment: params.'Comment',"Emoji Name": "thumbs up" )          
        }else if(params."Promote or Demote"=="Demote"){
            SetEmojiDialog.run(Comment: params.'Comment',"Emoji Name": "thumbs down" )          
        }

    }
}
