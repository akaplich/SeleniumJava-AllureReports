package actions.SetupUsers;

import actions.common.SetupCommon
import actions.selenium.Click
import screens.SystemSetup.GroupCreationLocators
import org.openqa.selenium.By
import screens.common.ModalButtonLocators

class SetCreateEditorDeleteGroup{
    public void run(def params){
        
        if(params."Navigate to Groups Tab"){
            if(params."Navigate to Groups Tab"==true){
                if(params."Enterprise or Site"=="Site"){
                    SetupCommon.NavigateTab(Tab:"Users",Section:"Groups")
                } else {
                    SetupCommon.NavigateTab(Tab:"Users",Section:"EnterpriseSetupGroups")
                }                
            }
        }
        GroupCreationLocators.run(params)
        ModalButtonLocators.run(params)
        if(params."Create Edit or Delete"=="Create"){
            sleep(2000)
            Click.run("ID Type":"By", By:GroupCreationLocators.createGroup)
            sleep(2000)
        } else if(params."Create Edit or Delete"=="Edit"){
            sleep(2000)
            Click.run("ID Type":"By", By:GroupCreationLocators.editGroup, "Type of Click":"Javascript")
            sleep(2000)
        } else {
            Click.run("ID Type":"By", By:GroupCreationLocators.deleteGroup, "Type of Click":"Javascript")
            if(params."Delete Action"){
                Click.run("ID Type":"By", By:GroupCreationLocators.deleteCheckbox)
                if(params."Delete Action"=="Delete"){
                    Click.run("ID Type":"By", By:ModalButtonLocators.confirmOKButton)
                } else {
                    Click.run("ID Type":"By", By:ModalButtonLocators.confirmCancelButton)
                }
            }
        }
    }
}