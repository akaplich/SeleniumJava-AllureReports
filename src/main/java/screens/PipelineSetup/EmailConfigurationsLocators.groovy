package screens.PipelineSetup;

import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

class EmailConfigurationsLocators{
    
    public static By contactName = By.xpath("//*[@id='contact-name']")
    public static By contactEmail = By.xpath("//*[@id='contact-email']")
    public static By toggleEmailsON = By.xpath("//*[@id='communications-settings']//*[contains(@class,'toggle btn btn-primary')]")
    public static By toggleEmailsOFF = By.xpath("//*[@id='communications-settings']//*[contains(@class,'toggle btn btn-default off')]")
    public static By choosePattern = By.xpath("//*[contains(@class,'f-custom-email-design-section')]//*[contains(@class,'f-background-option-section')]//INPUT[@id='f-background-option-pattern']")
    public static By background = By.xpath("//*[contains(@class,'f-custom-email-design-section')]//*[contains(@class,'f-background-option-section')]//INPUT[@id='f-background-hex-color']")
    public static By colorPickerTrigger = By.xpath("//*[contains(@class,'f-colorpicker-trigger')]")
    public static By saveButton = By.xpath("//*[@id='save-contact-btn']")
    public static By uploadZone = By.xpath("//*[@class='f-upload-modal-dropzone']")
    public static By sendTestEmailButton = By.xpath("//BUTTON[contains(@class,'f-send-test-email')]")
    
}