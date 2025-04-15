package actions.PipelineSetup;

import actions.selenium.*
import actions.selenium.SetReactTags
import screens.PipelineSetup.NewsletterLocators
import actions.selenium.SetReactDropdown
import org.openqa.selenium.support.ui.WebDriverWait;
import actions.selenium.Browser
import actions.Utils.ScrollPagetoToporBottom

class CreateNewsletterinPipelineSetup{
    public void run(def params){
        if(params."Select Tab"){
            SetLeftSideTabInPipelineSetup.run(Tab:"Email Alerts")
        }
        sleep(10000) //needs time to load
        if (params."Create Email Alert"){
         	Click.run("ID Type":"By", By:NewsletterLocators.createNewsletterButton);
        }
        if(params."Recipients"){
            SetReactTags.setMemberTagsWithAddRemove("Field Name":"",User:params."Recipients","Add or Remove":params."Recipients Add Remove")
        }
        if(params."Add Quick List"){
            println("Addin quick list")
            Click.run("ID Type":"By", By:NewsletterLocators.addQuickList)
            //ScrollPagetoToporBottom.run("Top or Bottom":"Bottom")
            SetReactDropdown.run("Option":params."Add Quick List")
        }
        if(params."Enter Subject"){
            SetText.run("ID Type":"By", By:NewsletterLocators.newsletterSubject, "Text":params."Enter Subject")
        }
        sleep(1000)
        if(params."Email Body"){
            println("Email Body:${params."Email Body"}")
            Click.run("ID Type":"By", By:NewsletterLocators.newsletterBody)
            SetText.run("ID Type":"By", By:NewsletterLocators.newsletterBody, "Text":params."Email Body", "Type of Clear":"None")
        }
        sleep(500)
        if(params."Select Dynamic Field"){
            Click.run("ID Type":"By", By:NewsletterLocators.selectDynamicFieldArrow)
            //sleep(1000)
            Click.run(ID:"//*[@id='f-combobox-list' and contains(@style,'display: flex')]//*[starts-with(.,'${params."Select Dynamic Field"}')]")
            //SetCombobox.run(ID:"//INPUT[contains(@id,'f-template-dynamic-dropdown')]", "Option":params."Select Dynamic Field")
            Click.run("ID Type":"By", By:NewsletterLocators.addButtonForDynamicField)
        }
        sleep(2000)
        switch (params."Action"){
            case "Send Test Email":
            	Click.run("ID Type":"By", By:NewsletterLocators.sendTestEmail)
            	break;
            case "Save":
            	Click.run("ID Type":"By", By:NewsletterLocators.save)
            	break;
            case "Send Now":
            	SetFocus.run("ID Type":"By", By:NewsletterLocators.sendNow)
            	Click.run("ID Type":"By", By:NewsletterLocators.sendNow)
            	sleep(2000)
                //SetFocus.run("ID Type":"By", By:NewsletterLocators.sendNow)
    			Click.run("ID Type":"By", By:NewsletterLocators.confirmSendWarningModal)
            	break;
            case "Cancel":
            	Click.run("ID Type":"By", By:NewsletterLocators.cancel)
            	break;
        }
    }
}