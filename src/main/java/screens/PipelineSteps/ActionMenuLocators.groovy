package screens.PipelineSteps;

import org.openqa.selenium.By

public class ActionMenuLocators {  
    
    public static By changeVisibilityDropdown = By.xpath("//*[@id='f-submitmodal-dropdown-visibility']//*[@data-test='f-test-dropdown']")
    public static By changeCategoryDropdown = By.xpath("//*[@id='f-submitmodal-dropdown-status']//*[@data-test='f-test-dropdown']")
    public static By addStatusChangeReason = By.xpath("//*[text()='Add status change reason:']/../..//*[contains(@class,'fractal-textarea')]/TEXTAREA")
    public static By setStepName = By.xpath("//*[contains(@class,'f-edit-step')]//INPUT")
    public static By setStepDescription = By.xpath("//*[contains(@class,'f-edit-step')]//*[contains(@class,'fractal-textarea')]/TEXTAREA")
    public static By setToolType = By.xpath("//*[@id='f-edit-step-dropdown']//*[@data-test='f-test-dropdown']")
    public static By setStage = By.xpath("//*[@id='f-edit-stage-dropdown']//*[@data-test='f-test-dropdown']")
    public static By createNewStage = By.xpath("//span[normalize-space()='Create a new stage']")
    public static By setStageName = By.xpath("//*[contains(@class,'f-stage-name')]")
    public static By setStageDescription = By.xpath("//*[contains(@class,'f-addStage-content')]//*[contains(@class,'fractal-textarea')]/TEXTAREA")
    public static By setInnovationState = By.xpath("//*[contains(@class,'f-addStage-content')]//*[@data-test='f-test-dropdown']")
    public static By setStageBackgroundColor = By.xpath("//*[contains(@class,'f-stage-color')]//INPUT")
    
}