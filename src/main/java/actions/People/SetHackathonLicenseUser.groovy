package actions.People;

import screens.common.ModalButtonLocators
import actions.selenium.*
import org.openqa.selenium.By
import screens.People.HackathonLicense
import actions.common.PeopleCommon
import actions.common.AppsCommon

class SetHackathonLicenseUser{
    public void run(def params){
        
        if(params."Expand License Breakdown"== true || params."Expand License Breakdown"== null){
            PeopleCommon.ExpandLicenseBreakdown(License:"Hackathon Manager Licenses")
        } 
       
        if(params."Assign or Buy License"){
            if(params."Assign or Buy License"=="Assign License"){
                Click.run("ID Type":"By",By:HackathonLicense.getAssignLicense(params."Assign or Buy License"))
            } else {
                Click.run("ID Type":"By",By:HackathonLicense.getBuyLicense(params."Assign or Buy License"))
            }            
        }
        
        if(params."User"){
            AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":"Add License",User:params."User","Add or Remove":params."Users Add or Remove from Input Field")
        }
        
        if(params."Action on Add Hackathon Licenses Modal"){
            ModalButtonLocators.run(params)
            if(params."Action on Add Hackathon Licenses Modal"=="Add License"){
                Click.run("ID Type":"By", By:ModalButtonLocators.saveButton) 
            } else {
                Click.run("ID Type":"By", By:ModalButtonLocators.cancelButton)
            }
        }
    }
}