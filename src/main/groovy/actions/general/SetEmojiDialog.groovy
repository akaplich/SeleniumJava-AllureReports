package actions.general;

import actions.selenium.Browser
import org.openqa.selenium.JavascriptExecutor
import actions.selenium.utils.Elements
import org.openqa.selenium.WebElement
import actions.selenium.Click
import actions.selenium.SendKeys
import actions.selenium.*
import org.openqa.selenium.By
import actions.selenium.Exists

class SetEmojiDialog{
    public static void run(def params){
        if(params."New Comment"==true){            
            Click.run(ID:"//button[contains(@class,'f-comment-emoji-button')]")   
            sleep(1000)
            if(Exists.run(ID:"//em-emoji-picker")==0){
                Click.run(ID:"//button[contains(@class,'f-comment-emoji-button')]")
                sleep(1000)
            }               
            ExplicitWait.run(ID:"//em-emoji-picker")
        }else{
        	Click.run(ID:"//*[@data-test='f-test-comment-wrapper']//*[text()='${params."Comment"}']/..//button[contains(@class,'f-emoji-add-reaction-button')]")
            sleep(1000)
            if(Exists.run(ID:"//em-emoji-picker")==0){
                Click.run(ID:"//*[@data-test='f-test-comment-wrapper']//*[text()='${params."Comment"}']/..//button[contains(@class,'f-emoji-add-reaction-button')]") 
                sleep(1000)
            } 
            ExplicitWait.run(ID:"//em-emoji-picker")
        }
               

        String shadow = '''return arguments[0].shadowRoot'''
        def parentElement = Browser.Driver.findElement(By.xpath("//em-emoji-picker"))
        // Execute JavaScript to get the Shadow Root
        JavascriptExecutor executor = (JavascriptExecutor) Browser.Driver
        def shadowRoot = executor.executeScript(shadow, parentElement)
        def inputElement = executor.executeScript('return arguments[0].shadowRoot.querySelector("input:nth-child(1)")',parentElement)
        inputElement.sendKeys(params."Emoji Name")
		def firstEmoji = executor.executeScript('return arguments[0].shadowRoot.querySelector("section:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1) > span:nth-child(2) > span:nth-child(1)")',parentElement)
        firstEmoji.click() 
        
    }
}