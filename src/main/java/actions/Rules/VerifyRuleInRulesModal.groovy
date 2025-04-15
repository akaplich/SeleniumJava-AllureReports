package actions.Rules;

import actions.selenium.Exists
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements

class VerifyRuleInRulesModal{
    public void run(def params){
		assert Exists.run(ID:"//DIV[@class='f-combobox-input-wrapper']//*[@id='f-event-trigger-dropdown' and @value='${params."Event that triggers this rule"}']")==1,"Incorrect Trigger" 
        assert Exists.run(ID:"//INPUT[@id='f-rule-trigger-date' and @value='${params."Trigger Value(s)".split(",")[0]}']")==1,"Incorrect Trigger Value"
        if(params."Trigger Value(s)".split(",").length > 1){
        	//assert Exists.run(ID:"//DIV[@class='f-combobox-input-wrapper']//*[@id='f-rule-trigger-time' and //*[.='${params."Trigger Value(s)".split(",")[1]}']]")==1,"Incorrect Second Trigger Value"
        	WebElement setTime = Elements.find(ID:"//*[@id='f-rule-trigger-time']/DIV[@data-test='f-test-dropdown']", Browser.Driver)
            assert setTime.getText().equals(params."Trigger Value(s)".split(",")[1]), "Error - Incorrect Default Due Time"
        }
    }
}