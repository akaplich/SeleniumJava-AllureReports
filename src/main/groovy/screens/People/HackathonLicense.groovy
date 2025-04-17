package screens.People;

import org.openqa.selenium.By

class HackathonLicense{
    
     //button
    public static By getAssignLicense(String buttonName){
        return By.xpath("//button[contains(@class,'f-btn-standard f-btn-sm') and .='${buttonName}']")
    }
     public static By getBuyLicense(String buttonName){
        return By.xpath("//button[contains(@class,'f-btn-primary') and .='${buttonName}']")
    }
}