package actions.ActionItems;

import actions.selenium.Click
import actions.selenium.Exists

class SetGeneralEvaluationScorecardforIdeainActionItemspage{
    public void run(def params){
        skipTourScorecard()
        if(params."What is the strategic impact"){Click.run(ID:"(//*[@class='radio_label' and text()='${params."What is the strategic impact"}']/../..//INPUT)[1]")}
        if(params."What is the likely timeframe to implement"){Click.run(ID:"(//*[@class='radio_label' and text()='${params."What is the likely timeframe to implement"}']/../..//INPUT)[1]")}
        if(params."What is the estimated level of enterprise"){Click.run(ID:"(//*[@class='radio_label' and text()='${params."What is the estimated level of enterprise"}']/../..//INPUT)[2]")}
        if(params."What resource level would need to be dedicated"){Click.run(ID:"(//*[@class='radio_label' and text()='${params."What resource level would need to be dedicated"}']/../..//INPUT)[1]")}
        if(params."What is the revenue potential of the idea"){Click.run(ID:"(//*[@class='radio_label' and text()='${params."What is the revenue potential of the idea"}']/../..//INPUT)[1]")}
        
        Click.run(ID:"//*[@id='commit_scorecard_button']")
        sleep(2000)
    }
    public static void skipTourScorecard(){
        if(Exists.run(ID:"//*[@class='tour-tip']//*[text()='Start Quick Tour']",Timeout:4)>0){
            Click.run(ID:"//*[@class='tour-tip']//*[text()='Start Quick Tour']")
            sleep(500)
            Click.run(ID:"//*[@class='tour-tip']//*[text()='Next']")
            sleep(500)
            if(Exists.run(ID:"//*[contains(text(),'Skip Tour')]",Timeout:2)>0){
                Click.run(ID:"//*[contains(text(),'Skip Tour')]")
            }
            else{
                Click.run(ID:"//*[@class='tour-tip']//*[text()='Next']")
                sleep(500)
                Click.run(ID:"//*[@class='tour-tip']//*[text()='Next']")
                sleep(500)
                Click.run(ID:"//*[@class='tour-tip']//*[text()='Finish']")
            }
        }
        
        
    }
}