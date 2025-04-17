package actions.Enterprise.UserHomepage;
import screens.Userhome.SubmissionPages.SubmissionLocators
import actions.selenium.Click


class SelectSubmissioninUserHomepage{
    public void run(def params){
        Click.run("ID Type":"By",By:SubmissionLocators.getIdeaBoardCardBySubmissionName(params."Submission Name"))
    }
}