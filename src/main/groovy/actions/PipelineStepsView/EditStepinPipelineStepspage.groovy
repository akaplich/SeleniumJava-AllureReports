package actions.PipelineStepsView;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SelectItem
import actions.PipelineStepsView.SetStepDropdown
import actions.PipelineStepsView.CreateStepinPipelineStepspage
//import screens.PipelineSteps.ActionMenuLocators
//import screens.ReactFormDifferentFieldLocators
//import screens.common.ModalButtonLocators

class EditStepinPipelineStepspage{
    public void run(def params){
        
        SetStepDropdown.setDropdownOption("Step Name":params."Step to Edit","Step Dropdown Option":"Edit Step")
        SetText.run(ID:"//*[@id='create_step_name']",Text:params."Step Name")
        SetText.run(ID:"//*[@id='step-description-textarea']",Text:params."Step Description")
        SelectItem.run(ID:"//*[@id='new_step_type']","Visible Text":params."Tool Type")
        if(params."Action"=="Cancel"){Click.run(ID:"//A[text()='Cancel']")}
        else{Click.run(ID:"//*[@id='bi-modal-button']/SPAN[text()='Save']")}
        sleep(5000)
        if(params."Tool Type"){CreateStepinPipelineStepspage.toggleModalIfNotOpen(params)}
        
        /*New code then this is converted to react
 SetStepDropdown.setDropdownOption("Step Name":params."Step to Edit","Step Dropdown Option":"Edit Step")
        
        SetText.run("ID Type":"By",By:ActionMenuLocators.setStepName,Text:params."Step Name")
        SetText.run("ID Type":"By",By:ActionMenuLocators.setStepDescription,Text:params."Step Description")
        if(params."Tool Type"){
            Click.run("ID Type":"By",By:ActionMenuLocators.setToolType)
            def fieldParams = ['Field Value': params."Tool Type"]
        	ReactFormDifferentFieldLocators.run(fieldParams)
        	Click.run("ID Type":"By",By:ReactFormDifferentFieldLocators.dropdownFieldValue)
        }
        
//        SelectItem.run(ID:"//*[@id='new_step_type']","Visible Text":params."Tool Type")
        ModalButtonLocators.run(params)     
        if(params.Action=="Cancel"){
           	Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
            
        }
        else{
            Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)
        }
        sleep(5000)
        if(params."Tool Type"){CreateStepinPipelineStepspage.toggleModalIfNotOpen(params)}
        
    }
}
*/
    }
}