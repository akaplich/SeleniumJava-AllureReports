package screens.PipelineSteps.ManageStep;
import org.openqa.selenium.By

class ActionItemInProgressTab{
    
    public static By gridRowByNameActionMenu(String name) {
        return By.xpath("//*[contains(@class,'_grid')]//TR/TD[1][text()='" + name + "']/../..//*[contains(@class,'remind-cell')]/DIV[1]")
    }

    public static By gridRowByNameEvaluatorActionMenu(String name) {
        return By.xpath("//*[contains(@class,'_grid')]//TD[1]//*[text()='" + name + "']/../..//*[contains(@class,'remind-cell')]/DIV[1]")
    }

    public static By gridActionDropdownVisible(String dropdownOption) {
        return By.xpath("//*[contains(@class,'grid-action-dropdown') and contains(@style,'block')]//*[contains(@id,'overview') and contains(text(),'" + dropdownOption + "')]")
    }
}