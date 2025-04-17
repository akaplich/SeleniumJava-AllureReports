package screens.SiteSetup;

import org.openqa.selenium.By

class SchedulerV3Locators{
    public static By planSetupStart = By.xpath("//input[@id='PlanSetupStart']")
    public static By planSetupStart_timepicker = By.xpath("//select[@id='PlanSetupStart-timepicker']")   
    public static By planSetupEnd = By.xpath("//input[@id='PlanSetupEnd']")
    public static By planSetupEnd_timepicker = By.xpath("//select[@id='PlanSetupEnd-timepicker']")
    
    public static By incubateStart = By.xpath("//input[@id='IncubateStart']")
    public static By incubateStart_timepicker = By.xpath("//select[@id='IncubateStart-timepicker']")   
    public static By incubateEnd = By.xpath("//input[@id='IncubateEnd']")
    public static By incubateEnd_timepicker = By.xpath("//select[@id='IncubateEnd-timepicker']")
    
    public static By buildHackStart = By.xpath("//input[@id='BuildHackStart']")
    public static By buildHackStart_timepicker = By.xpath("//select[@id='BuildHackStart-timepicker']")   
    public static By buildHackEnd = By.xpath("//input[@id='BuildHackEnd']")
    public static By buildHackEnd_timepicker = By.xpath("//select[@id='BuildHackEnd-timepicker']")

    public static By presentationAndJudgingHackStart = By.xpath("//input[@id='PresentationJudgingStart']")
    public static By presentationAndJudgingStartTimepicker = By.xpath("//select[@id='PresentationJudgingStart-timepicker']")   
    public static By presentationAndJudgingHackEnd = By.xpath("//input[@id='PresentationJudgingEnd']")
    public static By presentationAndJudgingEndTimepicker = By.xpath("//select[@id='PresentationJudgingEnd-timepicker']")
    
    public static By recognizeStart = By.xpath("//input[@id='RecognizeStart']")
    public static By recognizeStart_timepicker = By.xpath("//select[@id='RecognizeStart-timepicker']")   
    public static By recognizeEnd = By.xpath("//input[@id='RecognizeEnd']")
    public static By recognizeEnd_timepicker = By.xpath("//select[@id='RecognizeEnd-timepicker']")
    
    public static By closeOutReviewStart = By.xpath("//input[@id='CloseOutReviewStart']")
    public static By closeOutReviewStart_timepicker = By.xpath("//select[@id='CloseOutReviewStart-timepicker']")   
    public static By closeOutReviewEnd = By.xpath("//input[@id='CloseOutReviewEnd']")
    public static By closeOutReviewEnd_timepicker = By.xpath("//select[@id='CloseOutReviewEnd-timepicker']")
    
    
    
    
    public void run(def params){

        
    }
}