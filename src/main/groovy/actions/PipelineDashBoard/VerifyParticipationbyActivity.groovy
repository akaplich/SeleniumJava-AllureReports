package actions.PipelineDashBoard;

import actions.selenium.Exists
import actions.selenium.Click
import actions.selenium.SelectItem
import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement

class VerifyParticipationbyActivity{
    public void run(def params){
        
        WebElement text
        
        if(params."Chart View"){
            println("Will select chart view: ${params."Chart View"}")
            SelectItem.run(ID:"//*[@id='chart-date-picker']","Visible Text":params."Chart View")
        	sleep(1000)
        	Click.run(ID:"//DIV[@id='top-region']//*[contains(@class,'sub-header')]")
        }
        if(params."Submitted"){
            //text = Elements.find(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-idea' and contains(.,'${params."Submitted"}')]", Browser.Driver)
            //println("Text: ${text.getText()}")
            assert Exists.run(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-idea' and contains(.,'${params."Submitted"}')]")==1, "Error - Incorrect Submitted"
        	assert Exists.run(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-idea' and contains(.,'${params."Submitted - Subtitle"}')]")==1, "Error - Incorrect Submitted - Subtitle"
        }
        if(params."Commented"){
        	assert Exists.run(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-comment' and contains(.,'${params."Commented"}')]")==1, "Error - Incorrect Commented"
        	assert Exists.run(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-comment' and contains(.,'${params."Commented - Subtitle"}')]")==1, "Error - Incorrect Commented - Subtitle"

        }
        if(params."Voted"){
        	assert Exists.run(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-vote' and contains(.,'${params."Voted"}')]")==1, "Error - Incorrect Voted"
        	assert Exists.run(ID:"//*[@id='speedometer-charts-container']//*[@id='speedometer-chart-vote' and contains(.,'${params."Voted - Subtitle"}')]")==1, "Error - Incorrect Voted - Subtitle"

        }
    }
}
        