package actions.IdeaBoard;

import screens.IdeaBoard30.Ideaboard30IdeaLocators
import actions.selenium.SetFocus
import actions.selenium.Exists

class VerifyUserFlyoverinIdeaBoardpage30{
    public void run(def params){
		SetFocus.run("ID Type":"By",By:Ideaboard30IdeaLocators.getSubmitterLocatorOnIdeaCard(params.'Idea Name', params.'Username'))
        
        if(params."Follow" == true){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverFollowButton)==1, "Error - Could not find the Follow flyover button"
        } else if (params."Follow" == false){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverFollowButton)==0, "Error - Found the Follow flyover button"
        }
                       
        if(params."Unfollow" == true){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverUnfollowButton)==1, "Error - Could not find the Unfollow flyover button"
        } else if (params."Unfollow" == false){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverUnfollowButton)==0, "Error - Found the Unfollow flyover button"
        }
                       
        if(params."Profile" == true){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverProfileButton)==1, "Error - Could not find the Profile flyover button"
        } else if (params."Profile" == false){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverProfileButton)==0, "Error - Found the Profile flyover button"
        }
        if(params."Message" == true){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverMessageButton)==1, "Error - Could not find the Message flyover button"
        } else if (params."Message" == false){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverMessageButton)==0, "Error - Found the Message flyover button"
        }  
        
        if(params."Custom Image" == true){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverProfileImageCustom)==1, "Error - Could not find the Custom profile image on the flyover"
        } else if (params."Custom Image" == false){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.flyoverProfileImageCustom)==0, "Error - Found the Custom profile image on the flyover"
        } 
        
        if(params."Default Image Letter" != null){
            assert Exists.run("ID Type":"By",By:Ideaboard30IdeaLocators.getFlyoverProfileDefaultImageLocator(params."Default Image Letter"))==1, "Error - Could not find the Default profile image that includes the letter ${params.'Default Image Letter'}"
        } 
        
    }
}