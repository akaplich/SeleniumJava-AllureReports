package actions.PipelineManageSteps;
import screens.common.ModalButtonLocators
import screens.PipelineSteps.ManageStep.ActionItemInProgressTab
import org.openqa.selenium.By
import actions.selenium.Click

class SetGridActionDropdowninProgressinManageStepPage{
    public void run(def params){
        
        def baseXPath
        if(params."Idea or Evaluator"=="Idea"){
            baseXPath = ActionItemInProgressTab.gridRowByNameActionMenu(params."Name")
        } else {
            baseXPath = ActionItemInProgressTab.gridRowByNameEvaluatorActionMenu(params."Name")
        }
        Click.run("ID Type":"By", By:baseXPath)
         if (params."Dropdown Menu Option") {
            By dropdownLocator = ActionItemInProgressTab.gridActionDropdownVisible(params."Dropdown Menu Option")
            Click.run("ID Type":"By", By: dropdownLocator)
        }
        if(params."Cancel Action"){
            if(params."Cancel Action"=="Cancel"){
                Click.run("ID Type":"By", By:ModalButtonLocators.actionOnModal) 
            } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.cancelOnModal) 
            }
        }
        if(params."Remind Action"){
            if(params."Remind Action"=="Send"){
                Click.run("ID Type":"By", By:ModalButtonLocators.actionOnModal) 
            } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.cancelOnModal) 
            }
        }
    }
}