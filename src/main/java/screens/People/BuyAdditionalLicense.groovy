package screens.People;

import org.openqa.selenium.By

class BuyAdditionalLicense{
   
    public static By annual = By.xpath("//*[@id='toggle' and @value='false']/..//*[@class='f-toggle-inner']")
    public static By monthly = By.xpath("//*[@id='toggle' and @value='true']/..//*[@class='f-toggle-inner']")
    public static By plus = By.xpath("//*[contains(@class,'f-subscription-page-plans-prices-inner-container')]//*[contains(@class,'fa fa-plus')]/..")
    public static By minus = By.xpath("//*[contains(@class,'f-subscription-page-plans-prices-inner-container')]//*[contains(@class,'fa fa-minus')]/..")
}