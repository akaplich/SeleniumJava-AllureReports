package actions.NGAAnalyticsDashboard;

import actions.selenium.SetCheckBox
import actions.selenium.Click

class SetExcludeResearchPipelines{
    public void run(def params){
        
        Click.run(ID:"//*[contains(@class,'analytic-tab import-tab')]/I[contains(@class,'fa fa-cog')]")
        SetCheckBox.run(ID:"//*[contains(@id,'setup-research-dropdown') and contains(@style,'display: block')]//*[@id='setup-research-checkbox']",Check:params."Exclude Research Pipelines")
        
    }
}