package actions.ViewIdea30;

import actions.selenium.utils.VerifyNumberOfMatches
import actions.selenium.Click

class VerifyVotesinViewIdea3{
    public void run(def params){
       
       if(params."View Voters" == true){
         Click.run(ID:"//*[contains(@class,'f-votes-btn-link') or contains(@class,'f-investors-btn-link')]")  
        }
        if(params."Tab with Tab Count" == true){
         Click.run(ID:"//*[@class='f-member-details-modal']//*[@class='f-tab-underline' and .='${params."Tab with Tab Count"}']")  
        }
       def verify = [:]
       verify.ID = "//*[@class='f-member-details-modal']//*[@class='f-member-name' and text()='${params."User"}']"
       verify.IDChildren = []
       if(params."User Image"!=null){
            def img
            if(params."User Image"){img = "/IMG[contains(@src,'/ct/getfile.php')]"}
            else{img = "/*[@class='member-initial']"}
            verify.IDChildren << "../${img}"
        }
       if(params."Promote or Demote Reason"){verify.IDChildren << "./../..//*[@class='f-vote-modal-reason' and text()='${params."Promote or Demote Reason"}']"} 
       if(params."Placement Number"){
            params."Number of Matches"=1
            verify.ID = "//*[@class='f-member-details-modal']//*[@class='f-member-modal-wrapper'][${params."Placement Number"}]//*[@class='f-member-name' and text()='${params."User"}']"
            VerifyNumberOfMatches.run(verify)
        }
        else{
            if(params."Number of Matches"){verify."Number of Matches" = params."Number of Matches".toInteger()}
            VerifyNumberOfMatches.run(verify)        
        }
    }
}

   