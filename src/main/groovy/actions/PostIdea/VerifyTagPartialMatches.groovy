package actions.PostIdea;

import actions.selenium.SetText
import actions.selenium.WaitForElement
import actions.selenium.Exists
import actions.selenium.VerifyText
import org.openqa.selenium.WebElement
import screens.PostIdeaLocators


class VerifyTagPartialMatches{
    public void run(def params){
        
    	// Set text
        SetText.run("ID Type":"By",By:PostIdeaLocators.tagField, Text:params."Text")
        WaitForElement.run("ID Type":"By",By:PostIdeaLocators.toolTipSuggestionsCursorItem, "Timeout In Seconds":20)

        
        // Check if (Add Tag) is listed after the entered text as an option
		// VerifyExpertisePartialMatches for more details on an effort to implement this. For now this has been backlogged. 
        
        
        // Check Available options
        params."Partial Matches".split(",").eachWithIndex{ name, x ->
        	if(params."Partial Match Visible".split(",")[x]=="TRUE"){
                assert Exists.run("ID Type":"By",By:PostIdeaLocators.getToolTipSuggestionByName(name))==1, "Error - Could not find tag: ${name}"
            }else{
                assert Exists.run("ID Type":"By",By:PostIdeaLocators.getToolTipSuggestionByName(name))==0, "Error - Unexpectedly found tag: ${name}"
            }
    	}
        
    }
}