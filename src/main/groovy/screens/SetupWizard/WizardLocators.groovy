package screens.SetupWizard;

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import actions.selenium.Browser
import actions.selenium.utils.Elements
import java.util.ArrayList;
    import java.util.List;

class WizardLocators{
    //sponsor
    public static By title = By.xpath("//input[@id='name']")
    public static By description = By.xpath("//*[@id='description']")
    public static By continueButton = By.xpath("//*[@class='bi-button-success-md']")
    public static By cancelButton = By.xpath("//*[@data-action='cancel']")
    public static By backButton = By.xpath("//*[@data-action='back']")
    public static By createButton = By.xpath("//*[@data-action='create']")
    public static By toggleSchedulerOff = By.xpath("//DIV[@class='toggle btn btn-default off']")
    public static By toggleSchedulerOn = By.xpath("//DIV[@class='toggle btn btn-primary']")
    
    //scheduler fields
    public static List<By> getSchedulerPhaseGroup(String fieldTitle) {
        List<By> phaseGroup = new ArrayList<>();

        phaseGroup.add(By.xpath("//DIV[@class='form-group']//LABEL[contains(.,'${fieldTitle}')]//following-sibling::INPUT[contains(@id,'Start')]"));

        By firstElement = phaseGroup.get(0); 
        String fieldId = extractId(firstElement);
        String startTime = fieldId + "Start-timepicker";
        String endId = fieldId + "End";
        String endTime = fieldId + "End-timepicker";

        phaseGroup.add(By.xpath("//SELECT[@id='" + startTime + "']"));
        phaseGroup.add(By.xpath("//INPUT[@id='" + endId + "']"));
        phaseGroup.add(By.xpath("//SELECT[@id='" + endTime + "']"));

        return phaseGroup;
    }
    
    private static String extractId(By byLocator){
    	WebElement startDate = Elements.find("ID Type":"By", By:byLocator ,Browser.Driver)
        def phaseId = startDate.getAttribute("id").replace("Start","") //PlanSetupStart
        println("Extracted ID: ${phaseId}")
        return phaseId
    }


            
    

    
    
    
    
    
    public void run(def params){
        
    }
}