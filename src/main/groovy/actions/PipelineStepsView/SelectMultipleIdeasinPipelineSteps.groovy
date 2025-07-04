package actions.PipelineStepsView;

import java.lang.String
import actions.selenium.Browser
import actions.selenium.utils.Elements
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys
import actions.selenium.Click


class SelectMultipleIdeasinPipelineSteps{
    public void run(def params){
        Actions act = new Actions(Browser.Driver)
        
        if(params."Idea Names") {
            params."Idea Names".each{
                act.keyDown(Keys.SHIFT).perform()
                Click.run(ID:"//*[@id='content-inside']/DIV//P[contains(.,'${it}')]")
                sleep(2000)
                act.keyUp(Keys.SHIFT).perform()
            }
        }
    }
}