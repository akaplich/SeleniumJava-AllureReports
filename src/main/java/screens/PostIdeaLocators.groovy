package screens;
import org.openqa.selenium.By

class PostIdeaLocators{
    
    public static By tagField = By.xpath("//span[@class='twitter-typeahead']//input[@placeholder='Enter tags associated with your submission']")
    public static By expertiseField = By.xpath("//span[@class='twitter-typeahead']//input[@placeholder='Enter expertise associated with your submission']")
	public static By toolTipSuggestionsCursorItem = By.xpath("//div[@class='tt-suggestion tt-selectable tt-cursor']")

    // Constructor to initialize the driver and instantiate elements using PageFactory
    public PostIdeaLocators() {
    }
    
    // Dynamic locator for potential tooltip suggestion matches
    public static By getToolTipSuggestionByName(String name) {
        return By.xpath("//div[@class='tt-suggestion tt-selectable'][.='${name}']")
    }
}