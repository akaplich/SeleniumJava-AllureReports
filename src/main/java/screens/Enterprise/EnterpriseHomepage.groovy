package screens.Enterprise;

import org.openqa.selenium.By

class EnterpriseHomepage{
    public static By getNavOption(String option){
        return By.xpath("//*[@id='dynamic_navigation_bar']//A[contains(@id,'top_nav') and text()='${option}']")
    }
}