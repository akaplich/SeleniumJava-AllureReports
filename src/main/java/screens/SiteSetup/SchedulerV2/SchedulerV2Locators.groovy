package screens.SiteSetup.SchedulerV2;

import org.openqa.selenium.By

public class SchedulerV2Locators{
    
    public static By setWinnersWidgetStatus = By.xpath("//input[@id='f-select-status-combobox']")
    public static By startDate = By.xpath("//*[@id='f-resource-start-date']")
    public static By startDateTimeDropdown = By.xpath("//*[contains(@class,'f-start-date-time-dropdown')]/DIV")
    public static By dropdownOption(String time) {
        return By.xpath("//*[contains(@class,'f-dropdown-options') and contains(@style,'block')]//*[text()='" + time + "']")
    }
    public static By endDate = By.xpath("//*[@id='f-resource-end-date']")
    public static By endDateTimeDropdown = By.xpath("//*[contains(@class,'f-end-date-time-dropdown')]/DIV")
    public static By timeZone(String timeZone) {
        return By.xpath("//*[contains(@class,'f-resource-input-container')]//*[text()='" + timeZone + "']")
    }
    public static By remindMeDropdown = By.xpath("//*[contains(@class,'f-resource-remind-dropdown')]/DIV[@data-test='f-test-dropdown']")
    public static By onCloseDirectUsers = By.xpath("//*[contains(@class,'f-resource-redirect-dropdown')]/DIV[@data-test='f-test-dropdown']")
    public static By remindMeDropdownOption(String remindMe) {
        return By.xpath("//*[contains(@class,'f-dropdown-options') and contains(@style,'block')]//*[.='" + remindMe + "']")
    }
    public static By remindIconForResource(String resource) {
        return By.xpath("//*[contains(@class,'f-resource-title') and text()='" + resource + "']/..//*[@data-tooltip-content='Reminder scheduled for 1 days before date(s)']")
    }
    public static By gridCellForResource(String resource) {
        return By.xpath("//*[contains(@class,'f-resource-title') and text()='" + resource + "']/..")
    }
    public static By eventTitle(String resource) {
        return By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'" + resource + "')]/../..")
    }
    public static By addCommunication = By.xpath("//*[contains(@class,'f-add-communication')]")
    public static By communicationTypeDropdown = By.xpath("//*[contains(@class,'f-communication-type-dropdown')]/DIV")
    public static By selectTemplateDropdown = By.xpath("//*[contains(@class,'f-newsletter-dropdown') or contains(@class,'f-blog-dropdown')]/DIV")
    public static By sendDate = By.xpath("//*[@id='f-resource-send-date']")
    public static By topBarView(String view) {
       return By.xpath("//BUTTON[contains(@title,'" + view + "')]")
    }
    public static By status(String status) {
        return By.xpath("//*[contains(@class,'f-scheduler-status-wrapper') and contains(.,'Status: " + status + "')]")
    }
    public static By dateInTopBar(String date) {
        return By.xpath("//*[contains(@id,'fc-dom-') and contains(text(),'" + date + "')]")
    }
    public static By prelaunchEndDate(String prelaunchEndDate) {
        return By.xpath("//*[contains(@class,'f-pre')]//*[text()='Pre-Launch Ends " + prelaunchEndDate + "']")
    }
    public static By hoverPrelaunch = By.xpath("//*[contains(@class,'f-pre')]/..")
	public static By reactTooltip(String tooltip) {
        return By.xpath("//*[contains(@id,'f-event-tooltip') and contains(@class,'module_show') and contains(.,'" + tooltip + "')]")
    }
    public static By activeStartAndEndDate(String activeStartAndEndDate) {
        return By.xpath("//*[contains(@class,'f-active')]//*[contains(text(),'Active " + activeStartAndEndDate + "')]")
    }
    public static By hoverActiveInitiative = By.xpath("//*[contains(@class,'f-active')]/../..")
    public static By submissionStartAndEndDate(String submissionStartAndEndDate) {
        return By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'Submission')]/../..//*[contains(text(),'Submission " + submissionStartAndEndDate + "')]")
    }
    public static By hoverSubmission = By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'Submission')]/../..")
    public static By hoverVoting = By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'Voting')]/../..")
    public static By hoverCommenting = By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'Commenting')]/../..")
    public static By votingStartAndEndDate(String votingStartAndEndDate) {
        return By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'Voting')]/../..//*[contains(text(),'Voting " + votingStartAndEndDate + "')]")
    }
    public static By commentingStartAndEndDate(String commentingStartAndEndDate) {
        return By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'Commenting')]/../..//*[contains(text(),'Commenting " + commentingStartAndEndDate + "')]")
    }
    public static By phaseStartAndEndDate(String phase, String activeStartAndEndDate) {
        return By.xpath("//*[contains(@class,'f-event-title') and contains(text(),'"+ phase + ": " + activeStartAndEndDate + "')]")
    }
    public static By phaseIndicatorCurrentPhase(String phase) {
        return By.xpath("//*[contains(@class,'-phase-active-val') and text()='" + phase + "']")
    }
    public static By phaseIndicatorCurrentPhaseTime(String time) {
        return By.xpath("//*[contains(@class,'f-phase-countdown-timeleft') and .='" + time + "']")
    }
}