 package screens.SiteSetup.Newsletter;

import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

class NewsletterLocators{
    
    public static By createNewsletterButton = By.xpath("//BUTTON[contains(@id, 'create_newsletter_btn')]")
    public static By addRecipients = By.xpath("//*[contains(@id, 'newsletter_recipients')]/../A")
    public static By newsletterSubject = By.xpath("//INPUT[contains(@id, 'new_newsletter_title')]")
    public static By newsletterBodyFrame = By.xpath("//IFRAME[contains(@id, 'newsletter_body_ifr')]")
    public static By newsletterBody = By.xpath("//BODY[@ID='tinymce']")
    //public static By newsletterBodyP = new ByChained(newsletterBody, By.xpath("/P"))
    public static By newsletterBodyP = By.xpath("//BODY[@ID='tinymce']/P")
        
    public static By newsletterActionCancel = By.xpath("//*[contains(@id,'newsletter_content')]//*[@id='cancel_newsletter_btn']") 
    public static By newsletterActionSend = By.xpath("//*[contains(@id,'newsletter_content')]//*[@id='newsletter_send_btn']//SPAN[@class='green_btn_center']")
    public static By newsletterActionSave = By.xpath("//*[contains(@id,'newsletter_content')]//*[@id='newsletter_sav_btn']//SPAN[@class='grey_btn_center2']") 
    public static By newsletterPopupActionConfirm = By.xpath("//*[@id='send_newsletter_popup']//*[@id='bi-modal-button']")
    public static By newsletterAddFieldDropdown = By.xpath("//*[contains(@id,'newsletter_content')]//SELECT[@id='add_field']") 
    public static By newsletterAddFieldButton = By.xpath("//*[contains(@id,'newsletter_content')]//BUTTON[@id='site_email_insert_field_button']")
    
    // Constructor
    public NewsletterLocators(){
        
    }
    public static By getAddedRecipientByName(String name) {
        return By.xpath("//span[@id='newsletter_recipients']//a[normalize-space()='${name}']")
    }
}