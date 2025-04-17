package actions.Whiteboards;

import screens.Whiteboard.BrightideaAILocators
import actions.selenium.Click
import actions.selenium.SetText
import actions.Whiteboards.SendKeysToWhiteboard
import actions.selenium.Exists

class VerifySetBrightideaAIChatbot{
    public void run(def params){
        if(params."Chatbot Input"){
            Click.run("ID Type":"By", By:BrightideaAILocators.chatbotInput)
            SetText.run("ID Type":"By", By:BrightideaAILocators.chatbotInput, Text:params."Chatbot Input")
        }
        if(params.Action=='Submit'){
        	Click.run("ID Type":"By", By:BrightideaAILocators.generateButton)
        }
        if(params."Chatbot Send to WB" != null){
        	Click.run("ID Type":"By", By:BrightideaAILocators.sendToWB)
            sleep(500)
            if("Chatbot Send to WB"=="Add as Text"){
                SendKeysToWhiteboard.run("Key(s) to send":"Tab")
            }
            SendKeysToWhiteboard.run("Key(s) to send":"Tab") //work around with keys, locating the element via xpath would not work
            SendKeysToWhiteboard.run("Key(s) to send":"Enter")
            
            //Click.run("ID Type":"By", By:BrightideaAILocators.getSendToWBAs(params."Chatbot Send to WB"), "Type of Click":"Move to Element")
        }
        if(params."Verify Chatbot Dialog Displayed"==true){
            assert Exists.run("ID Type":"By", By:BrightideaAILocators.chatbotDialog)>0, "Error - No Chatbot Dialog Present"
        }else{
            assert Exists.run("ID Type":"By", By:BrightideaAILocators.chatbotDialog)==0, "Error - Unexpected Chatbot Dialog Present"
        }
    }
}