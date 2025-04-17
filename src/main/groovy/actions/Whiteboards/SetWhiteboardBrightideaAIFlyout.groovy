package actions.Whiteboards;

import screens.Whiteboard.BrightideaAILocators
import actions.selenium.Click
import actions.selenium.SetText

class SetWhiteboardBrightideaAIFlyout{
    public void run(def params){
        if(params."Tab"){
            Click.run("ID Type":"By", By:BrightideaAILocators.getTabLocatorByName(params."Tab"))
        }
        if(params."Prompt"){
        	Click.run("ID Type":"By", By:BrightideaAILocators.promptInput)
            SetText.run("ID Type":"By", By:BrightideaAILocators.promptInput, Text:params.Prompt)
        }
        if(params."Chatbot Input"){
            Click.run("ID Type":"By", By:BrightideaAILocators.chatbotInput)
            SetText.run("ID Type":"By", By:BrightideaAILocators.chatbotInput, Text:params."Chatbot Input")
        }
        if(params.Action=='Generate'| params.Action=='Submit'){
        	Click.run("ID Type":"By", By:BrightideaAILocators.generateButton)
        }
    }
}