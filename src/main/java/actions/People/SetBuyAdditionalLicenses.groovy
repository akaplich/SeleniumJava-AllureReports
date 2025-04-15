package actions.People;

import screens.common.ModalButtonLocators
import screens.People.BuyAdditionalLicense
import org.openqa.selenium.By
import actions.selenium.*
import actions.selenium.Click

class SetBuyAdditionalLicenses{
    public void run(def params){
        
        if(params."Type of Subscription"){
             if(params."Type of Subscription"=="Monthly"){
            	Click.run("ID Type":"By",By:BuyAdditionalLicense.monthly)
             } else {
            	Click.run("ID Type":"By",By:BuyAdditionalLicense.annual)
             }
            sleep(2000)
        }
        if(params."Click on + or -"){
            if(params."Click on + or -"=="+"){
            	Click.run("ID Type":"By",By:BuyAdditionalLicense.plus,"Type of Click":"Move to Element")
        	} else {
            Click.run("ID Type":"By",By:BuyAdditionalLicense.minus,"Type of Click":"Move to Element")
        	}
        }
        if(params."Checkout"==true){
          ModalButtonLocators.run(params)
          Click.run("ID Type":"By", By:ModalButtonLocators.saveButton) 
          sleep(3000)  
        }        
    }
}

   
    