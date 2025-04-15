package actions.PipelineSetup;

import actions.selenium.*
import actions.selenium.utils.VerifyNumberOfMatches
import actions.common.GridCommon
import screens.PipelineSetup.NewsletterLocators
import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement

class VerifyEmailAlertinPipelineSetup{
    public void run(def params){
        println("Verifying email alert...")
        def verify = [:]
        verify.ID = ""
        verify.IDChildren = []
        //if(params."Subject"){verify.ID = "//*[@id='f-newsletter-table']/TBODY//TD[contains(@id,'cell-0') and //*[.='${params."Subject"}']]"}
	    if(params."Subject"){verify.ID = "//*[@id='f-newsletter-table']/tbody//td[contains(@id,'cell-0') and contains(., '${params.Subject}')]"}
        if(params."Created By"){verify.IDChildren << "./..//TD[contains(@id,'cell-1') and contains(.,'${params."Created By"}')]"}
        if(params."Last Updated"){
            /*WebElement tool = Elements.find(ID:"//*[@id='f-newsletter-table']/tbody//td[contains(@id,'cell-0') and contains(., '${params.Subject}')]/..//TD[contains(@id,'cell-2')]",
                                            Browser.Driver)
            println("Text from Last Updated: ${tool.getText()}")
            
            verify.IDChildren << "./..//TD[contains(@id,'cell-2') and contains(normalize-space(.),'${params."Last Updated".trim()}')]"}
*/
            verify.IDChildren << "./..//td[contains(@id,'cell-2') and translate(., ' ', '') = translate('${params."Last Updated"}', ' ', '')]"}
            
        if(params."Date Sent"){verify.IDChildren << "./..//TD[contains(@id,'cell-3') and contains(.,'${params."Date Sent"}')]"}
        
        if(params."Number of Matches"){verify."Number of Matches" = params."Number of Matches".toInteger()}
        VerifyNumberOfMatches.run(verify)
        if(params."Open this email alert?"){
            Click.run("ID Type":"By", "By":NewsletterLocators.getEmailAlertTitleByTitle(params."Subject"))
        }
        sleep(5000)
    }
}