package actions.PipelineStepsView;

import actions.selenium.Click
import actions.selenium.SelectItem
//import screens.PipelineSteps.ActionMenuLocators
//import screens.ReactFormDifferentFieldLocators
//import screens.common.ModalButtonLocators

class ChangeIdeaCategoryinPipelineStepspage{
    public void run(def params){
        Click.run(ID:"//*[@id='actions_dropdown']")
        Click.run(ID:"//*[@id='action-category']")
        SelectItem.run(ID:"//*[@id='change_category_dropdown']","Visible Text":params."Category")
        if(params.Action=="Change Category"){Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Category']")}
        else{Click.run(ID:"//BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")}
        sleep(3000)
         
        /*New code when this modal is converted to react
        Click.run(ID:"//*[@id='actions_dropdown']")
        Click.run(ID:"//*[@id='action-category']")
        //SelectItem.run(ID:"//*[@id='change_category_dropdown']","Visible Text":params."Category")
        Click.run("ID Type":"By",By:ActionMenuLocators.changeCategoryDropdown)
        if(params."Category"){
            def fieldParams = ['Field Value': params."Category"]
        	ReactFormDifferentFieldLocators.run(fieldParams)
        	Click.run("ID Type":"By",By:ReactFormDifferentFieldLocators.dropdownFieldValue)
        }
        ModalButtonLocators.run(params)     
        if(params.Action=="Change Category"){
            //Click.run(ID:"//*[@class='green_btn_container']/*[text()='Change Category']")
            Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)}
        else{
            //Click.run(ID:"//BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")
        	Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
        }
        sleep(3000)*/
    }
}