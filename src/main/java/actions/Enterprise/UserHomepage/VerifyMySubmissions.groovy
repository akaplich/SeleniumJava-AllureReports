package actions.Enterprise.UserHomepage;
import screens.Userhome.SubmissionPages.SubmissionLocators
import actions.selenium.Exists

class VerifyMySubmissions{
    public void run(def params){
        
        if(params."'You have no Submissions' is Visible" == true){
            assert Exists.run("ID Type":"By",By:SubmissionLocators.mySubmissionNoSubmissionsMessage)==1,"Failed to find message 'You have no Submissions'"

        }
        if(params."'You have no Drafts' is Visible" == true){
            assert Exists.run("ID Type":"By",By:SubmissionLocators.mySubmissionNoDraftsMessage)==1,"Failed to find message 'You have no Drafts'"
        }
        
    }
}