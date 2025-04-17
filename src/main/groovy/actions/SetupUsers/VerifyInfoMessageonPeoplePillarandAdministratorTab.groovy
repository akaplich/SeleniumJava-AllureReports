package actions.SetupUsers;

import actions.selenium.Exists
import actions.common.SetupCommon
import actions.selenium.Click
import actions.selenium.VerifyText

class VerifyInfoMessageonPeoplePillarandAdministratorTab{
    public void run(def params){
        
        if(params."Area"=="System Setup"){
            SetupCommon.NavigateTab(Tab:"Users",Section:"Administrators")
        } else if(params."Area"=="Idea Box Community Setup"){
            SetupCommon.NavigateTab(Tab:"Users",Section:"Managers")
        }
        
        if(params."Share Dialog"==true){
            Click.run(ID:"//*[contains(@class,'f-admin-info-box')]//*[@class='f-collapsible-link']")
        }
        
       if(params."Info Message Exists"==true){
            assert Exists.run(ID:"//*[contains(@class,'f-info-body-wrapper') and contains(.,'${params."Info Message"}')]")==1, "Error - 'Info Message not displayed"
       } else{
            assert Exists.run(ID:"//*[contains(@class,'f-info-body-wrapper') and contains(.,'${params."Info Message"}')]")==0, "Error - 'Info message displayed when it shouldnt be"            
       }
 	   
        if(params."Duplicate Admin Info Box" != null){
        	
            VerifyText.run(ID:"//*[contains(@class,'f-info-body-wrapper')]//div[@id='f-admin-info-box-1']",Text:params."Admin Info Box")
        }
        if(params."Duplicate Initiative Info Box" != null){
        	
            VerifyText.run(ID:"//*[contains(@class,'f-info-body-wrapper')]//div[@class='f-duplicate-initiative-info']//p[2]",Text:params."Admin Info Box")
        }
        if(params."Duplicate Licenses Available" != null){
        	
            VerifyText.run(ID:"//*[contains(@class,'f-info-body-wrapper')]//div[@class='f-licenses-available']",Text:params."Admin Info Box")
        }
        
        if(params."Click on Buy More Licenses"==true){
            Click.run(ID:"//span[normalize-space()='Buy More Licenses']/..")
        }
	}
}