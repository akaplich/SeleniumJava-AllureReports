package actions.PipelineManageSteps;
import actions.selenium.Click
import actions.selenium.utils.VerifyNumberOfMatches
import actions.selenium.Exists
import actions.selenium.SetFocus

class VerifyCurrentlyinSteptableforFindOwner{
    public void run(def params){
        
        if(params."Step Name to Manage (optional)"){
            Click.run(ID:"//SPAN[@class='step_header_name' and text()='${params."Step Name to Manage (optional)"}']/../DIV[contains(@class,'img-dropdown')]")
            Click.run(ID:"//SPAN[@class='step_header_name' and text()='${params."Step Name to Manage (optional)"}']/../..//*[text()='Manage ${params."Step Name to Manage (optional)"}']")
        }
           //sleep(5000)
		   Click.run(ID:"//*[@id='scores-tab']")
           sleep(2000)

            def verify = [:]
            verify.IDChildren = []
            verify.ID = "(//TABLE)//TD[.='${params."Title"}']"
            if(params."Code"){verify.IDChildren << "./../TD[contains(@class,'idea-code-cell') and text()='${params."Code"}']"}
        	if(params."Category"){verify.IDChildren << "./../TD[contains(@class,'category-cell') and text()='${params."Category"}']"}
            if(params."Category Assignee"){
                SetFocus.run(ID:verify.ID + "/../TD[contains(@class,'category-assignee-cell')]")
                assert Exists.run(ID:"//*[contains(@style,'block')]//*[contains(@class,'user-name')]/A[text()='${params."Category Assignee"}']")==1, "Error - 'Incorrect category assignee"}
        	if(params."Current Assignee"){
                SetFocus.run(ID:verify.ID + "/../TD[contains(@class,'current-assignee-cell')]")
                assert Exists.run(ID:"//*[contains(@style,'block')]//*[contains(@class,'user-name')]/A[text()='${params."Current Assignee"}']")==1, "Error - 'Incorrect Current assignee"}

            if(params."Number of Matches"){verify."Number of Matches" = params."Number of Matches".toInteger()}
            VerifyNumberOfMatches.run(verify)
        
    }
}
