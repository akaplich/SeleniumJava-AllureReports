package screens.ViewIdea3;
import org.openqa.selenium.By;

public class TagLocatorsInViewIdea3{
    
        //Tags
    public static By ideaTagsContainer = By.xpath("//*[@ID='f-tags-container']")
    public static By ideaTagsComboBox = By.xpath("//*[@ID='react-tags-idea-tags-combobox']")
    public static By ideaTagsInput = By.xpath("//*[@ID='react-tags-idea-tags-input']")
    public static By ideaTagsListBox = By.xpath("//*[@ID='react-tags-idea-tags-listbox']")
    public static By ideaTagsSubscriberTooltipButton = By.xpath("//*[@ID='f-tags-container']//*[@id='f-tag-subscribe-tooltip']//button")
    public static By ideaTagsSubscriberTooltopButton_Subscribed = By.xpath("//*[@ID='f-tags-container']//*[@id='f-tag-subscribe-tooltip']//button[contains(.,'Subscribed (')]")
	public static By ideaTagsSubscriberTooltopButton_Subscribe = By.xpath("//*[@ID='f-tags-container']//*[@id='f-tag-subscribe-tooltip']//button[contains(.,'Subscribe (')]")
    
    
    //********************************************************************************************************************************
    
    // Constructor to initialize the driver and instantiate elements using PageFactory
    public TagLocatorsInViewIdea3() {
    }
    
    // Dynamic locator for Idea Tags
    public static By getTagLocatorByName(String name) {
        return By.xpath("//*[@ID='f-tags-container']//*[@class='f-tag-name'][text()='" + name + "']");
    }
}