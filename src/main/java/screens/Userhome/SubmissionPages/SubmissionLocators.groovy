package screens.Userhome.SubmissionPages;

import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

class SubmissionLocators{
    // MySubmission No Submissions Messages
    public static By mySubmissionNoSubmissionsMessage = By.xpath("//span[contains(@class,'f-no-submissions-message')][.='You have no Submissions']")
    public static By mySubmissionNoDraftsMessage = By.xpath("//span[contains(@class,'f-no-submissions-message')][.='You have no Drafts']")
    // AllSubmission No Submissions Messages
    public static By AllSubmissionNoSubmissionsMessage = By.xpath("//span[contains(@class,'f-no-submissions-message')][.='No Submissions Available']")
    public static By AllSubmissionNoSubmissionTitleFiltered = By.xpath("//span[contains(@class,'f-no-submissions-title')][.='No Submissions']")
    public static By AllSubmissionNoSubmissionBodyFiltered = By.xpath("//span[contains(@class,'f-no-submissions-body')][.='No submissions returned with the selected filter']")
    
    // MySubmission Tabs
    public static By mySubmissionTabMySubmissions = By.xpath("//div[@class='fractal-widget-submissions']//button[.='My Submissions']")
    public static By mySubmissionTabMyDrafts = By.xpath("//div[@class='fractal-widget-submissions']//button[.='My Drafts']")
    
    //Ideaboard
    public static By getIdeaBoardCardBySubmissionName(String submissionName){
        return By.xpath("//*[contains(@class,'fractal-secondary-ideas-view-grid')]/*[contains(@class,'ideaboard-card') and @data-title='${submissionName}']")
    }
    // Constructor to initialize the driver and instantiate elements
    public SubmissionLocators() {
    }
}