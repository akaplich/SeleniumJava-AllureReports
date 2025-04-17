package actions.PostIdea;

import actions.selenium.SetText
import actions.selenium.WaitForElement
import actions.selenium.Exists
import actions.selenium.VerifyText
import actions.selenium.ExecuteJavascript
import org.openqa.selenium.WebElement
import screens.PostIdeaLocators
import org.openqa.selenium.JavascriptExecutor
import actions.selenium.Browser


class VerifyExpertisePartialMatches{
    public void run(def params){
        
    	// Set text
        SetText.run("ID Type":"By",By:PostIdeaLocators.expertiseField, Text:params."Text")
        WaitForElement.run("ID Type":"By",By:PostIdeaLocators.toolTipSuggestionsCursorItem, "Timeout In Seconds":20)
        
        // Check if (Add Tag) is listed after the entered text as an option
        // The following doesn't currently work, the java script works in the dev console, and the title can be retrieved from the js executor but I the ::after content value isn't returning for the text value 
        /*
        if(params."After Text" ){
        	def js = (JavascriptExecutor) Browser.Driver
            String title = js.executeScript("return document.title")
            println("PageTitle: ${title}")
            def script = "return window.getComputedStyle(document.querySelector('.tt-suggestion.tt-selectable.tt-cursor'),':after').getPropertyValue('content')"
        	String text = js.executeScript(script)
            println("AfterText: ${text}")
            assert text.replaceAll("[^a-zA-Z0-9.@\\-]", "").equals(params."After Text".replaceAll("[^a-zA-Z0-9.@\\-]", "")), "Error expected text: ${params.Text} does not match text on the UI: ${text}" 
            //VerifyText.run("ID Type":"Css Selector",ID:".tt-suggestion.tt-selectable.tt-cursor::after", Text:params."After Text" )
        }
		*/

        
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