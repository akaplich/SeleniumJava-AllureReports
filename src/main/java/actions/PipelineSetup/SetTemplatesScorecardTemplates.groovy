package actions.PipelineSetup;

import actions.selenium.Click
import actions.selenium.ExplicitWait

class SetTemplatesScorecardTemplates{
    public void run(def params){
        SetLeftSideTabInPipelineSetup.run(Tab:"Scorecards")
        //wait for templates to load
        ExplicitWait.run(ID:"//*[@id='scorecard_template_grid_holder']")
        if(params."Template Title to Select"){Click.run(ID:"//*[@id='scorecard_template_grid_holder']//DIV[@class='scroll_table']/TABLE[@class='body_table']//TR/TD/A[contains(text(),'${params."Template Title to Select"}')]")}
    }
}