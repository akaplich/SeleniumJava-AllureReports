package actions.WebstormHomepage.HackathonOnboarding;

import actions.WebstormHomepage.HackathonOnboarding.SelectFirstFlowOptionForHackathonOnboarding
import actions.WebstormHomepage.HackathonOnboarding.SetActionInHackathonOnboardingMenu
import actions.WebstormHomepage.HackathonOnboarding.SetExpertiseforJoiningParticipantInOnboardingHackathonModal
import actions.selenium.SetReactTags
import actions.selenium.Click
import actions.selenium.SetText
import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class SetFlowBandCforHackathonOnboarding{
    public void run(def params){
     
        // Start Your Hackathon Screen
        SelectFirstFlowOptionForHackathonOnboarding.run("Flow Option Title":params."Flow Option Title")
        //SetActionInHackathonOnboardingMenu.run("Action":params."Action on Get Started Screen")
        
        //Register and add Expertise Screen
        SetExpertiseforJoiningParticipantInOnboardingHackathonModal.run("I am available to join teams":params."I am available to join teams","Expertise":params."Expertise","Add or Remove Expertise":params."Add or Remove Expertise")
        SetActionInHackathonOnboardingMenu.run("Action":params."Register and add expertise Action")
        sleep(4000)
        
       //Name Your Team Screen
       SetText.run(ID:"//*[@class='f-onboarding-typeahead-header' and text()='Team Name']/../..//*[contains(@class,'f-teamname-input')]",Text:params."Team Name")
       SetText.run(ID:"//*[@class='f-onboarding-typeahead-header' and text()='Project Name']/../..//*[contains(@class,'f-teamname-input')]",Text:params."Project Name")
       if(params."Activate Stealth Mode"){
        	if(params."Activate Stealth Mode"==true){
            	Click.run(ID:"//*[@class='f-stealthmode-check']//DIV[not(contains(@class,'f-checkbox-checked') and contains(@class,'f-checkbox-wrapper'))]/..//*[text()='Activate Stealth Mode']/..", "Type of Click":"Move to Element")
        	} else if(params."Activate Stealth Mode"==false){
            	Click.run(ID:"//*[@class='f-stealthmode-check']//DIV[contains(@class,'f-checkbox-checked') and contains(@class,'f-checkbox-wrapper')]/..//*[text()='Activate Stealth Mode']/..", "Type of Click":"Move to Element")
            }
       }
       SetActionInHackathonOnboardingMenu.run("Action":params."Name your team Screen Action")
       
       //Choose a Team Image
        if(params."Update Prompt Text"){
            Click.run(ID:"//BUTTON[normalize-space()='Update Prompt']")
            SetFocus.run(ID:"//TEXTAREA[@id='fractal-ai-topic']")
            SetText.run(ID:"//TEXTAREA[@id='fractal-ai-topic']", Text:params."Update Prompt Text")
            Click.run(ID:"//I[@class='fas fa-sparkles']")
        }
        if(params."Team Image Select"){
            if(params."Team Image Select"=="Image1"){
              ExplicitWait.run(ID:"//*[@class='f-team-image-list']/DIV[contains(@class,'f-image-loaded')][1]")
              Click.run(ID:"//*[@class='f-team-image-list']/DIV[contains(@class,'f-image-loaded')][1]")
            } else if(params."Team Image Select"=="Image2"){
              	ExplicitWait.run(ID:"//*[@class='f-team-image-list']/DIV[contains(@class,'f-image-loaded')][2]")
              	Click.run(ID:"//*[@class='f-team-image-list']/DIV[contains(@class,'f-image-loaded')][2]")
            } else {
                Click.run(ID:"//*[@class='f-team-image-list']//DIV[contains(@class,'fractal-fileupload-v2') and contains(@style,'background-image')]")
            }
        }
       SetActionInHackathonOnboardingMenu.run("Action":params."Choose a team image Action") 
        
        //Build your winning team
        if(params."Find Teammates"){
            params."Find Teammates".split(",").eachWithIndex{ user, x ->
                def action = params."Teammates Add or Remove".split(",")
                SetReactTags.setMemberTagsWithAddRemoveWithMultipleInputFieldsLabelsSidebySide("Field Name":"Find Teammates",User:user,"Add or Remove":action[x])
            }
        }
/*        if(params."Invite users that are not registered for event"){
        	if(params."Invite users that are not registered for event"==true){
            	Click.run(ID:"//*[@class='f-teammates-right']/../../../../DIV[not(contains(@class,'f-checkbox-checked') and contains(@class,'f-checkbox-wrapper'))]/..//*[text()='Invite users that are not registered for event']/..", "Type of Click":"Move to Element")
        	} else if(params."Invite users that are not registered for event"==false){
            	Click.run(ID:"//*[@class='f-teammates-right']/../../../../DIV[contains(@class,'f-checkbox-checked') and contains(@class,'f-checkbox-wrapper')]/..//*[text()='Invite users that are not registered for event']/..", "Type of Click":"Move to Element")
            }
        } */
       sleep(2000)
       SetActionInHackathonOnboardingMenu.run("Action":params."Build your winning team Screen Action") 
        
       //Get Started Screen
       SelectFirstFlowOptionForHackathonOnboarding.run("Flow Option Title":params."Get Started Screen Menu") 
       SetActionInHackathonOnboardingMenu.run("Action":params."Action on Get Started with Screen")
        
       //Loading Screen
       SetActionInHackathonOnboardingMenu.run("Action":params."Action on Time to submit your project...")         
        if(params."Wait for loading to disappear"==true){
            (new WebDriverWait(Browser.Driver,180)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='f-loading-bar']")))
        }
    }
}