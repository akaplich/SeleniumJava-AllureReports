package actions.SetupScheduler;

import actions.selenium.Exists
import actions.selenium.*
import screens.SiteSetup.SchedulerV1.SchedulerV1Locators
import actions.common.SetupCommon
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements

class VerifySetupSchedulerV1{
    public void run(def params){
        WebElement phaseDates, tooltip
        int index = 1
        
        SetupCommon.NavigateTab(Tab:"Scheduling")
        sleep(2000)
        if(params."Status"){
            assert Exists.run("ID Type":"By", By:SchedulerV1Locators.status(params."Status"))==1,"Incorrect Status"
        }
        if(params."Pre-Launch End Date"){
            assert Exists.run(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}][contains(translate(text(), ' ', ''), '${params."Pre-Launch End Date".replace(" ","")}')]")==1, "Incorrect Pre-Launch Dates Displayed"
        	index++
        }
        if(params."Active Start End Dates"){
            phaseDates = Elements.find(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]", Browser.Driver)
            println("Active Phase dates: ${phaseDates.getText().replace(" ","")}")
            assert phaseDates.getText().replace(" ","").equals(params."Active Start End Dates".replace(" ","")), "Incorrect Active Start End Dates Displayed"
        }
        if(params."Initiative Active Tooltip Start" && params."Initiative Active Tooltip End"){
            SetFocus.run(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]")
            tooltip = Elements.find(ID:"//*[contains(@id,'tiptip_holder_white') and contains(@style,'display: block')]", Browser.Driver)
            println("Tooltip Text: ${tooltip.getText()}")
            assert tooltip.getText().replace(" ","").contains(params."Initiative Active Tooltip Start".replace(" ","")), "Incorrect Initiative Active Tooltip Start"
            assert tooltip.getText().replace(" ","").contains(params."Initiative Active Tooltip End".replace(" ","")), "Incorrect Initiative Active Tooltip End"
        }
        index++
        if(params."Submission Start End Dates"){
            phaseDates = Elements.find(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]", Browser.Driver)
            println("Submission Phase dates: ${phaseDates.getText()}")
            assert phaseDates.getText().replace(" ","").equals(params."Submission Start End Dates".replace(" ","")), "Incorrect Submission Start End Dates Displayed"
        }
        if(params."Submission Tooltip Start" && params."Submission Tooltip End"){
            SetFocus.run(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]")
            tooltip = Elements.find(ID:"//*[contains(@id,'tiptip_holder_white') and contains(@style,'display: block')]", Browser.Driver)
            println("Tooltip Text: ${tooltip.getText()}")
            assert tooltip.getText().replace(" ","").contains(params."Submission Tooltip Start".replace(" ","")), "Invalid Submission Tooltip Start"
            assert tooltip.getText().replace(" ","").contains(params."Submission Tooltip End".replace(" ","")), "Invalid Submission Tooltip End"
        }
        index++
        if(params."Voting Start End Dates"){
        	phaseDates = Elements.find(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]", Browser.Driver)
            println("Voting Phase dates: ${phaseDates.getText()}")
            assert phaseDates.getText().replace(" ","").equals(params."Voting Start End Dates".replace(" ","")), "Incorrect Voting Start End Dates Displayed"
        }
        if(params."Voting Tooltip Start" && params."Voting Tooltip End"){
        	SetFocus.run(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]")
            tooltip = Elements.find(ID:"//*[contains(@id,'tiptip_holder_white') and contains(@style,'display: block')]", Browser.Driver)
            println("Tooltip Text: ${tooltip.getText()}")
            assert tooltip.getText().replace(" ","").contains(params."Voting Tooltip Start".replace(" ","")), "Invalid Voting Tooltip Start"
            assert tooltip.getText().replace(" ","").contains(params."Voting Tooltip End".replace(" ","")), "Invalid Voting Tooltip End"
        }
        index++
        if(params."Commenting Start End Dates"){
        	phaseDates = Elements.find(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]", Browser.Driver)
			println("Voting Phase dates: ${phaseDates.getText()}")
            assert phaseDates.getText().replace(" ","").equals(params."Commenting Start End Dates".replace(" ","")), "Incorrect Commenting Start End Dates Displayed"
            
        }
        if(params."Commenting Tooltip Start" && params."Commenting Tooltip End"){
            SetFocus.run(ID:"(//*[@class='fc-content']//SPAN[@class='fc-event-title'])[${index.toString()}]")
        	tooltip = Elements.find(ID:"//*[contains(@id,'tiptip_holder_white') and contains(@style,'display: block')]", Browser.Driver)
            println("Tooltip Text: ${tooltip.getText()}")
            assert tooltip.getText().replace(" ","").contains(params."Commenting Tooltip Start".replace(" ","")), "Invalid Commenting Tooltip Start"
            assert tooltip.getText().replace(" ","").contains(params."Commenting Tooltip End".replace(" ","")), "Invalid Commenting Tooltip End"
            
        }
        if(params."Communication Type"){
            assert Exists.run(ID:"//TR[contains(@class, 'fc-communication')]//SPAN[contains(@class,'communication-id')]//SPAN[contains(@class,'communication-name') and text()='${params."Communication Type"}']")>0, "Error - Invalid Communication Type"
        }
        if(params."Communication Tooltip"){
            SetFocus.run(ID:"//TR[contains(@class, 'fc-communication')]//SPAN[contains(@class,'communication-id')]//SPAN[contains(@class,'communication-name') and text()='${params."Communication Type"}']")
			tooltip = Elements.find(ID:"//*[contains(@id,'tiptip_holder_white') and contains(@style,'display: block')]", Browser.Driver)
			println("Communication Tooltip Text: ${tooltip.getText()}")
            assert tooltip.getText().replace(" ","").contains(params."Communication Tooltip".replace(" ","")), "Invalid Communication Tooltip"
            //assert Exists.run(ID:"//*[contains(@id,'tiptip_holder_white')]//DIV[@id='tiptip_content']/DIV[contains(@style,'display: inline-block') and contains(normalize-space(.), '${params."Communication Tooltip"}')]")==1,"Incorrect Communication Tooltip"
        }
        
    }
}