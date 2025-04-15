package actions.SetupSite;

import actions.selenium.Exists
import actions.selenium.Click
import actions.selenium.SetText
import actions.selenium.SelectItem
import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import screens.SiteSetup.Newsletter.NewsletterLocators
import actions.selenium.*
import actions.common.SetupCommon
import actions.common.ViewIdeaCommon

class SetSiteSetupNewsletter{
    public static void run(def params){
        SetupCommon.NavigateTab(Tab:"Site",Section:"Newsletter")

        if(params."Create Newsletter"){Click.run("ID Type":"By", By:NewsletterLocators.createNewsletterButton)}
        if(params."Add Recipients"){
            Click.run("ID Type":"By", By:NewsletterLocators.addRecipients)
            ViewIdeaCommon.SetAddModal(params."Add Recipients", params."Add or Remove")
        }
        if(params."Verify Recipient Added Successfully"){
			assert Exists.run("ID Type":"By", By:NewsletterLocators.getAddedRecipientByName(params."Verify Recipient Added Successfully"))==1, "Error - Failed to find recipient: ${params.'Verify Recipient Added Successfully'}"
        }
        if(params."Newsletter Subject"){
            Click.run("ID Type":"By", By:NewsletterLocators.newsletterSubject, "Text":params."Newsletter Subject")
            SetText.run("ID Type":"By", By:NewsletterLocators.newsletterSubject, "Text":params."Newsletter Subject")}
        if(params."Newsletter Body"){
            SwitchToFrame.run("ID Type":"By", By:NewsletterLocators.newsletterBodyFrame)
            Click.run("ID Type":"By", By:NewsletterLocators.newsletterBody)
            SetText.run("ID Type":"By", By:NewsletterLocators.newsletterBodyP, "Text":params."Newsletter Body", "Type of Clear":"None")
        	SwitchToDefaultContent.run()
        }
        if (params."Add Field"){
            SelectItem.run("ID Type":"By", By:NewsletterLocators.newsletterAddFieldDropdown, "Visible Text":params."Add Field")
            Click.run("ID Type":"By", By:NewsletterLocators.newsletterAddFieldButton)
        }
        
        if(params."Action"=="Send Newsletter"){
            Click.run("ID Type":"By", By:NewsletterLocators.newsletterActionSend)
        	Click.run("ID Type":"By", By:NewsletterLocators.newsletterPopupActionConfirm)
        }
        else if(params."Action"=="Save"){Click.run("ID Type":"By", By:NewsletterLocators.newsletterActionSave)}
        else if(params."Action"=="Cancel"){Click.run("ID Type":"By", By:NewsletterLocators.newsletterActionCancel)}
    }
}