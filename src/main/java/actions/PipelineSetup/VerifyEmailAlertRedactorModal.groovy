package actions.PipelineSetup;

import screens.PipelineSetup.NewsletterLocators
import actions.selenium.*


class VerifyEmailAlertRedactorModal{
    public void run(def params){
        if(params."Subject"){
            VerifyText.run("ID Type":"By", "By":NewsletterLocators.newsletterSubject, "Text":params."Subject")
        }
        if(params."Users"){params."Users".splt[','].each{ user -> 
                VerifyText.run("ID Type":"By", "By":NewsletterLocators.recipients, "Contains Text":user)
            }
        }
        if(params."Email Body"){
            VerifyText.run("ID Type":"By", "By":NewsletterLocators.newsletterBody, "Text":params."Email Body")
        }
        if(params."Close Modal"){
            Click.run("ID Type":"By", "By":NewsletterLocators.closeModal)
        }
    }
}