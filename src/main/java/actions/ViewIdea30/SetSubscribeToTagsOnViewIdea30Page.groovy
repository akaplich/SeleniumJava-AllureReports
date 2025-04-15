package actions.ViewIdea30;

import actions.selenium.Click
import actions.selenium.SetText
import actions.selenium.SetFocus
import actions.selenium.Exists
import actions.selenium.VerifyText
import screens.ViewIdea3.TagLocatorsInViewIdea3

class SetSubscribeToTagsOnViewIdea30Page{
    public void run(def params){

        // Hover Over Tag
            SetFocus.run("ID Type":"By",By:TagLocatorsInViewIdea3.getTagLocatorByName(params."Tag Name"))
        	sleep(2)

        
        // Click Subscribe Button
            Click.run("ID Type":"By",By:TagLocatorsInViewIdea3.ideaTagsSubscriberTooltipButton)
                          
    }
}