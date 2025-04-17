package screens.EnterpriseAndCommunityWidgets;
import org.openqa.selenium.By

class VisualLargeWebstormsListLocators{
    
        public static By showPhaseCheckboxLocator = By.xpath("//*[@id='show-phase-checkbox']")

    // Constructor
    public VisualLargeWebstormsListLocators(){
        
    }
    
    // Dynamic locator to Edit a widget
    public static By getWidgetSetEditIconLocatorByName(String widgetName) {
        return By.xpath("//*[@class='widget_title']//*[text()='${widgetName}']/../..//A[@class='widget_edit_icon']")
    }
    public static By getWidgetCloseEditIconLocatorByName(String widgetName) {
        return By.xpath("//INPUT[contains(@id,'title_edit') and @value='${widgetName}']/../../..//A[@class='widget_edit_icon']")
    }
    
    public static By getInitiativeHandleLocatorByName(String initiativeName) {
        return By.xpath("//*[@id='visual-large-edit-webstorms']//div[@class='vwl-edit-view-ws-title'][.='${initiativeName}']/..//div[@class='handle']")
    }
    public static By getRowLocator(String rowNumber) {
        return By.xpath("//*[contains(@id,'visual-large-edit-webstorms-list')]/LI[${rowNumber}]")
    }
}