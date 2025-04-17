package screens.WebstormHomepage;

import org.openqa.selenium.By

public class InitiativeHomepage{
   
    public static By getParentNavigationTitle(String name) {
        return By.xpath("//*[contains(@class,'desktop-nav-core-items')]/LI/*[text()='${name}']");
    }
    public static By getChildNavigationTitle(String name) {
        return By.xpath("//*[contains(@class,'nav-children-visible')]/LI/*[text()='${name}']");
    }    
}
    