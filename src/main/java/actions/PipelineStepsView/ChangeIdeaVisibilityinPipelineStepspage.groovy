package actions.PipelineStepsView;

import actions.selenium.Click
import actions.selenium.SelectItem
//import screens.PipelineSteps.ActionMenuLocators
//import screens.ReactFormDifferentFieldLocators
//import screens.common.ModalButtonLocators

class ChangeIdeaVisibilityinPipelineStepspage{
    public static void run(def params){
        println("We are in")
        println(params."Visibility")
     Click.run(ID:"//*[@id='actions_dropdown']")
        sleep(1000)
        Click.run(ID:"//*[@id='action-visibility']")
        sleep(1000)
        SelectItem.run(ID:"//*[@id='visibility_toggle']","Visible Text":params."Visibility")
        sleep(1000)
        if(params.Action=="Change Visibility"){Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Visibility']")
                                              sleep(1000)}
        else{Click.run(ID:"//*[@class='bimodal-secondary' and text()='Cancel']")}
        sleep(3000)
        
        /*New code when this is converted to react
		 println("We are in")
        println(params."Visibility")
     	Click.run(ID:"//*[@id='actions_dropdown']")
        sleep(1000)
        Click.run(ID:"//*[@id='action-visibility']")
        sleep(1000)
        Click.run("ID Type":"By",By:ActionMenuLocators.changeVisibilityDropdown)
        if(params."Visibility"){
            def fieldParams = ['Field Value': params."Visibility"]
        	ReactFormDifferentFieldLocators.run(fieldParams)
            Click.run("ID Type":"By",By:ReactFormDifferentFieldLocators.dropdownFieldValue)
        }

        Click.run(ID:"//*[@id='action-visibility']")
        sleep(1000)
        SelectItem.run(ID:"//*[@id='visibility_toggle']","Visible Text":params."Visibility")

        sleep(1000)
        ModalButtonLocators.run(params)     
        if(params.Action=="Change Visibility"){
            //Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Visibility']")
            //sleep(1000)
            Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)
        }
        else{//Click.run(ID:"//*[@class='bimodal-secondary' and text()='Cancel']")
            Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
            }
        sleep(3000)
    }
}*/
    }
}