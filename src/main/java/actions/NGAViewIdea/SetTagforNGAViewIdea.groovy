package actions.NGAViewIdea;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SendKeys
import actions.selenium.MouseOver
import actions.selenium.Exists
import actions.selenium.WaitForElement

class SetTagforNGAViewIdea{
    public void run(def params){
        if(params."Tag Name"){
            params."Tag Name".split(",").eachWithIndex{ name, x ->
                if(params."Add or Remove".split(",")[x]=="Add"){
                    Click.run(ID:"//*[@id='add-tag-container']", "Handle Stale Element":true)
                    sleep(500)
                    Click.run(ID:"//*[@id='add-tag']")
                    sleep(500)
                    SetText.run(ID:"//*[@id='add-tag']", Text:name)
                    // The popup can take a while to become visible, sometimes it gets dismissed without any interaction 
                    // This update adds a little more sleep time to allow the popup to become visible
                    // Note that WaitForElement didn't work for this, cause the popup to go away for some reason
                    sleep(5000)
                    if(Exists.run(ID:"//div[@id='at-view-NaN'][contains(@style,'block')]//li[@class='atwho-item cur']") == 0){
                        sleep(7000)
                    }
					// This enter doesn't always trigger the tag to be added, now we retry
                    SendKeys.run(ID:"//*[@id='add-tag']", Key:"ENTER")
                    sleep(4000)
                    if(Exists.run(ID:"//*[@id='idea-tags-wrapper']//*[@id='idea-tags-container']//*[@class='tag_left']//*[text()='${name.toUpperCase()}']") == 0){
                        SendKeys.run(ID:"//*[@id='add-tag']", Key:"ENTER")
                        sleep(4000)
                    }
                    // If this case is still unreliable after these fixes the next step will be to retry typing into the tag. 
                }
                else if((params."Add or Remove".split(",")[x]=="Remove")){
                    def xpathId ="removebutton-bi-${name}"
                    Click.run(ID:"//*[@id='${xpathId}']","Type of Click":"Javascript", "Handle Stale Element":true)
                }
            }
		}
	}
}