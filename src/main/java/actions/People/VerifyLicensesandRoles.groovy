package actions.People;

import org.openqa.selenium.By
import screens.People.UserDetails
import actions.selenium.*

class VerifyLicensesandRoles{
    public void run(def params){
        
			if(params."Role and Area Displayed"==true){
                assert Exists.run("ID Type":"By", By:UserDetails.getRoleAndLicense(params."Role",params."Area"))==1, "Error - Area and Role does not match or is not displayed"
            } else if(params."Role and Area Displayed"==false){
               println("test")
               assert Exists.run("ID Type":"By", By:UserDetails.getRoleAndLicense(params."Role",params."Area"))==0, "Error - User should not be displayed but is displayed" 
            }
        if(params."Click on Area"==true){
            Click.run("ID Type":"By",By:UserDetails.getRoleAndLicense(params."Role",params."Area"))
        }
    }
}