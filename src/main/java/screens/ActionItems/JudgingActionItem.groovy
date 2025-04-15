package screens.ActionItems;

import org.openqa.selenium.By

public class JudgingActionItem{
    
    public static By ideaCode = By.xpath("//A[@id='idea_code']")
    public static By viewDetailsLink = By.xpath("//*[contains(@class,'idea_code_details_text')]")
    public static By searchField = By.xpath("//input[@class='main-search']")
    public static By clear = By.xpath("//*[@id='idea-list-clear-search']")
    
    public static By getideaCode(String idea) {
        return By.xpath("//A[@id='idea_code'][text()='" + idea + "']")
    }
}