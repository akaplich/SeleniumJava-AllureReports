package screens.IdeaBoard30;
import org.openqa.selenium.By

class Ideaboard30IdeaLocators{
    //User Flyover 
    public static By flyoverFollowButton = By.xpath("//*[contains(@class, 'flyover-link-item')][.='Follow']")
    public static By flyoverUnfollowButton = By.xpath("//*[contains(@class, 'flyover-link-item')][.='Unfollow']")
    public static By flyoverProfileButton = By.xpath("//*[contains(@class, 'flyover-link-item')][.='Profile']")
    public static By flyoverMessageButton = By.xpath("//*[contains(@class, 'flyover-link-item')][.='Message']")
    public static By flyoverProfileImageCustom = By.xpath("//*[@ID='flyover-photo']//img[@class='flyover-user-photo']")


    // Constructor to initialize the driver and instantiate elements using PageFactory
    public Ideaboard30IdeaLocators() {
    }
    
    // Dynamic locator for potential tooltip suggestion matches
    public static By getSubmitterLocatorOnIdeaCard(String ideaname, String username ) {
        return By.xpath("//*[contains(@class,'f-card-title')][text()='${ideaname}']/../..//*[contains(@class,'f-card-screenname')][normalize-space()='${username}']")
    }
    
    // Dynamic locator for potential tooltip suggestion matches
    public static By getFlyoverProfileDefaultImageLocator(String letter) {
        return By.xpath("//*[@ID='flyover-photo']//div[.='${letter}']")
    }
}