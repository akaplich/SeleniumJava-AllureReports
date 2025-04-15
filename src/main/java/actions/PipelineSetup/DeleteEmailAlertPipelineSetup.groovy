package actions.PipelineSetup;

import screens.PipelineSetup.NewsletterLocators
import actions.selenium.*


class DeleteEmailAlertPipelineSetup{
    public void run(def params){
        if(params."Subject"){
            Click.run("ID Type":"By", "By":NewsletterLocators.getEmailAlertDeleteByTitle)
            sleep(2000)
            SetFocus.run("ID Type":"By", By:NewsletterLocators.sendNow)
    		Click.run("ID Type":"By", By:NewsletterLocators.confirmDeleteWarningModal)
        }
    }
}