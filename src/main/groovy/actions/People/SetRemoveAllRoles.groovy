package actions.People;

import screens.common.ModalButtonLocators
import screens.People.UserDetails
import org.openqa.selenium.By
import actions.selenium.*
import actions.selenium.Click

class SetRemoveAllRoles{
    public void run(def params){
        
        Click.run("ID Type":"By",By:UserDetails.removeAllUsers)
       	Click.run("ID Type":"By",By:UserDetails.removeDropdownOption)
        SetCheckBox.run("ID Type":"By",By:UserDetails.confirmCheckbox,Check: true)
        if(params."Action"){
          ModalButtonLocators.run(params)
            if(params."Action"=="Remove"){
             Click.run("ID Type":"By", By:ModalButtonLocators.saveButton)    
            } else {
              Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)  
            } 
        }  
    }
}