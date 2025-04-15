package actions.Rules;

import actions.selenium.*

class VerifyRulesLastRunToolTip{
    public void run(def params){
        
        SetFocus.run(ID:"//TD[4]/A[text()='${params."Rule Name"}']/../..//*[contains(@class,'last_run')]/span")
        assert Exists.run(ID:"//*[contains(@class,'tooltip') and @role='tooltip' and .='${params."Tooltip"}']")==1, "Error - 'Incorrect tooltip"
    }
}