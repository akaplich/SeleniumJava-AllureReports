package screens.PipelineSetup;

import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

class NewsletterLocators{
    
    public static By createNewsletterButton = By.xpath("//button[span[.='Create an Email Alert']]")
    public static By newsletterSubject = By.xpath("//INPUT[@placeholder='Enter Subject']")
    public static By newsletterBody = By.xpath("//*[contains(@class,'redactor-in')]")
    public static By addQuickList = By.xpath("//*[@data-test='f-test-dropdown']/DIV[.='Add Quick List']")
    public static By selectDynamicFieldArrow = By.xpath("//BUTTON[contains(@class,'f-combobox-dropdown-button')]")
    public static By selectDynamicFieldDropdown = By.xpath("//INPUT[contains(@id,'f-template-dynamic-dropdown')]")
    public static By addButtonForDynamicField = By.xpath("//BUTTON[contains(@class,'f-rules-dynamic-add')]")
    public static By sendTestEmail = By.xpath("//*[contains(@class,'footer')]//BUTTON[SPAN[.='Send Test Email']]")
    public static By sendNow = By.xpath("//*[contains(@class,'footer')]//BUTTON[SPAN[.='Send Now']]")
    public static By cancel = By.xpath("//*[contains(@class,'footer')]//BUTTON[SPAN[.='Cancel']]")
    public static By save = By.xpath("//*[contains(@class,'footer')]//BUTTON[SPAN[.='Save']]")
    public static By confirmSendWarningModal = By.xpath("//*[contains(@class,'confirmWarningModal')]//*[contains(@class,'f-footer')]//BUTTON[@id='f-modal-submit']")
    public static By confirmDeleteWarningModal = By.xpath("//*[contains(@class,'click-to-confirm-modal')]//*[contains(@class,'footer')]//BUTTON[@id='clickToConfirmOkButton']")
    //redactor modal
    public static By recipients = By.xpath("//*[@id='fractal-membertypeahead-input']//UL[contains(@class,'react-tags__list')]")
    public static By closeModal = By.xpath("//*[contains(@data-tooltip-id,'modal-close')]")

    //email alerts table
    public static By getEmailAlertTitleByTitle(String title){
       return By.xpath("//*[@id='f-newsletter-table']/TBODY//TD[contains(@id,'cell-0') and //*[.='${title}']]") 
    } 
    
    public static By getEmailAlertDeleteByTitle(String title){
       return By.xpath("//*[@id='f-newsletter-table']/TBODY//TD[contains(@id,'cell-0') and //*[.='${title}']]/..//TD[contains(@id,'cell-4')]//BUTTON") 
    }
}