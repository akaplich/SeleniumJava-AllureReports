package actions.Rules;

import actions.selenium.*
import screens.PipelineSetup.Rules.RulesLocators
import org.openqa.selenium.By

class SetRuleOrderinNewRulesModal{
    public void run(def params){
        
        RulesLocators.run(params)
        SetText.run("ID Type":"By",By:RulesLocators.ruleOrderInput,Text:params."Rule Order","Type of Clear":"Cut")
        
    }
}