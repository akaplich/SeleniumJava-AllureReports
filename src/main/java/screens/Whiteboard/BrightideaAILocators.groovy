package screens.Whiteboard;

import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

class BrightideaAILocators{
    // Dynamic locator for Tabs
    public static By getTabLocatorByName(String name) {
        return By.xpath("//*[@class='f-ai-flyout']//DIV[contains(@class,'f-tabs-header-container')]//BUTTON[contains(@class,'f-tab')][contains(.,'${name}')]")
    }
    public static By promptInput = By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//textarea[@id='fractal-ai-topic' or @id='fractal-ai-image']")
    public static By chatbotInput = By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//textarea[@id='f-bichatbot-textarea']")
    public static By generateButton = By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//BUTTON[contains(@class,'f-ai-send')]")
    public static By sendToWB = By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//DIV[@class='f-chatbot-modal']//DIV[contains(@class,'f-chatbot-dialog-group')]//*[contains(@class,'f-send-to-wb-wrapper')]")

    
    public static By getSendToWBAs(String option){
        //return By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//DIV[@class='f-chatbot-modal']//DIV[contains(@class,'f-chatbot-dialog-group')]//*[contains(@class,'f-send-to-wb-wrapper')]//*[contains(.,'Add as Sticky')]")
        return By.xpath("//DIV[@class='f-send-to-wb-pop-up']/BUTTON")
        //return By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//DIV[@class='f-chatbot-modal']//DIV[contains(@class,'f-chatbot-dialog-group')]//*[contains(@class,'f-send-to-wb-wrapper')]//*[contains(.,'Add as Sticky')]")
        //return new ByChained(sendToWB, By.xpath("//*[contains(.,'${option}')]"))

    }
    public static By chatbotDialog = By.xpath("//*[@class='f-ai-flyout']//DIV[@class='f-tab-content-inner']//DIV[@class='f-chatbot-modal']//DIV[contains(@class,'f-chatbot-dialog-group')]")
}