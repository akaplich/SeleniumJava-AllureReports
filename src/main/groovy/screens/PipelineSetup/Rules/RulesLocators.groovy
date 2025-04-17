package screens.PipelineSetup.Rules;

import org.openqa.selenium.By

class RulesLocators{
    
    static By sourceRule(String ruleTitle) {
        return By.xpath("//TD[4]/A[text()='" + ruleTitle + "']/../..//TD[1]/DIV")
    }
    static By targetLocator(String rowNumber) {
        return By.xpath("//*[contains(@class,'scroll_table')]//TR[" + rowNumber + "]/TD[1]/DIV")
    }
    
    static By ruleOrderInput
    public static void run(def params){
        
        String baseXPath = params['Base XPath'] ?: ""
        ruleOrderInput = By.xpath("//*[@id='f-rule-order-num']")
    }
}