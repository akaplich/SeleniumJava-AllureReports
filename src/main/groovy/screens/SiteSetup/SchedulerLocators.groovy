package screens.SiteSetup;

import org.openqa.selenium.By

class SchedulerLocators{
    
    static By disableScheduler
    static By searchField
    static By closeIconOnSearchField
        
    public static void run(def params) {
        //disableScheduler = By.xpath("//*[contains(@class,'f-disable-container')]/A")
        //disableScheduler = By.xpath("//A[@id='disable-scheduler-link']")
        disableScheduler = By.xpath("//*[contains(text(),'Disable Scheduler')]")
        searchField = By.xpath("//*[contains(@class,'f-group-manager-search')]//INPUT")
        closeIconOnSearchField = By.xpath("//*[contains(@class,'f-group-manager-search')]//I")
    }
}