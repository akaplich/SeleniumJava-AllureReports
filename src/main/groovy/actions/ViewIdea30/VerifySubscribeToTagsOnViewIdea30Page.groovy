package actions.ViewIdea30;

import actions.selenium.Click
import actions.selenium.SetText
import actions.selenium.SetFocus
import actions.selenium.Exists
import actions.selenium.VerifyText
import screens.ViewIdea3.TagLocatorsInViewIdea3

class VerifySubscribeToTagsOnViewIdea30Page{
    public void run(def params){
    	// Params
            // TagName
            // SubscribeTooltip   Subscribe/Subscribed/None
            // ExpectedSubscribersCount


        // Hover Over Tag
        if (params."TagName"){
            SetFocus.run("ID Type":"By",By:TagLocatorsInViewIdea3.getTagLocatorByName(params."TagName"))
            sleep(2)
        }     

        // Assert If Subscribe is available or not
        if (params."SubscribeTooltip" == "None"){
            assert Exists.run("ID Type":"By",By:TagLocatorsInViewIdea3.ideaTagsSubscriberTooltipButton)==0, "Error - 'Tag Subscriber Tooltip should not be visible"
        }else if(params."SubscribeTooltip" == "Subscribe"){
            assert Exists.run("ID Type":"By",By:TagLocatorsInViewIdea3.ideaTagsSubscriberTooltopButton_Subscribe)==1, "Error - 'Unable to find Tag Subscribe Tooltip"            
        }else if(params."SubscribeTooltip" == "Subscribed"){
            assert Exists.run("ID Type":"By",By:TagLocatorsInViewIdea3.ideaTagsSubscriberTooltopButton_Subscribed)==1, "Error - 'Unable to find Tag Subscribed Tooltip"            
        }    

        // Verify Subscribers Count
        if (params."ExpectedSubscribersCount"){
            VerifyText.run("ID Type":"By",By:TagLocatorsInViewIdea3.ideaTagsSubscriberTooltipButton, "Contains Text": "(" + params."ExpectedSubscribersCount" + ")")
        } 
    
    }
    

}