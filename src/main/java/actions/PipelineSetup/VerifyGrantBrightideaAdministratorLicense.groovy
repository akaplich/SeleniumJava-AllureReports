package actions.PipelineSetup;

import actions.selenium.Exists
import actions.selenium.Click

class VerifyGrantBrightideaAdministratorLicense{
    public void run(def params){
        
        sleep(2000)
        assert Exists.run(ID:"//*[contains(@class,'f-admin-') and .='${params."Info Message"}']")==1, "Error - 'Info Message not displayed"
        if(params."Action"){
            if(params."Action"=="Cancel"){
                Click.run(ID:"//*[@data-test='modal-footer-cancel']")
            }
            else{
                Click.run(ID:"//*[@data-test='modal-footer-submit' and .='${params."Action"}']")
                sleep(3000)
            }
        }
    }
}