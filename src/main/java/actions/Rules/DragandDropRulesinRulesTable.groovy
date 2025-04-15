package actions.Rules;

import org.openqa.selenium.By
import actions.selenium.DragAndDrop
import screens.PipelineSetup.Rules.RulesLocators

class DragandDropRulesinRulesTable{
    public void run(def params){

        By sourceLocator = RulesLocators.sourceRule(params."Rule Title to Drag")
        By targetLocator = RulesLocators.targetLocator(params."New Row Number")
        DragAndDrop.run("From ID": sourceLocator, "From ID Type": "By", "To ID": targetLocator, "To ID Type": "By", "Type of Drag and Drop": "Dragging")
        
    }
}