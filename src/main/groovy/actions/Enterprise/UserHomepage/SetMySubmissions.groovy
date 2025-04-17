package actions.Enterprise.UserHomepage;
import screens.Userhome.SubmissionPages.SubmissionLocators
import actions.selenium.Click
import actions.selenium.SendKeys
    
class SetMySubmissions{
    public void run(def params){
        
        
        if(params."Set Tab" == "My Submissions"){
            Click.run("ID Type":"By",By:SubmissionLocators.mySubmissionTabMySubmissions)
        }
        if(params."Set Tab" == "My Drafts"){
            Click.run("ID Type":"By",By:SubmissionLocators.mySubmissionTabMyDrafts)
        }
    }
}