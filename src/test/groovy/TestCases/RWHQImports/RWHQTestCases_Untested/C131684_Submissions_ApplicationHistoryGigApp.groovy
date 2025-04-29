package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131684 - Submissions - Application History Gig App
class C131684_Submissions_ApplicationHistoryGigApp
{
    private static def variables = [:]

    @BeforeSuite
    public void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
    }
    @Test
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6([:])
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Gig/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Gig for Applications/.toString(),"Description":/Description/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig for Applications/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick add for applications/.toString(),"Action":/Submit/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig for Applications/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick add for applications/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/test one/.toString(),"Contact - Include my contact email":true,"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig for Applications/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick add for applications/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/test two/.toString(),"Contact - Include my contact email":true,"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig for Applications/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick add for applications/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/test three/.toString(),"Contact - Include my contact email":false,"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig for Applications/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick add for applications/.toString())
        //Accept/Decline Applicant on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.AcceptApplicantinViewIdea().run("Applicant's Username":/Pipeline Admin/.toString(),"Accept or Decline":/Accept/.toString(),"Action":/Accept/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/3/.toString(),"Applicant's Username":/Pipeline Admin/.toString(),"Email":/pipelineadmin@test.com/.toString(),"Message":/test one/.toString(),"Status":/Accepted/.toString())
        //Accept/Decline Applicant on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.AcceptApplicantinViewIdea().run("Applicant's Username":/Moderator/.toString(),"Accept or Decline":/Decline/.toString(),"Action":/Decline/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/3/.toString(),"Applicant's Username":/Moderator/.toString(),"Email":/moderator@test.com/.toString(),"Message":/test two/.toString(),"Status":/Declined/.toString())
        //Accept/Decline Applicant on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.AcceptApplicantinViewIdea().run("Applicant's Username":/NonBI System Admin/.toString(),"Accept or Decline":/Accept/.toString(),"Action":/Accept/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/3/.toString(),"Applicant's Username":/NonBI System Admin/.toString(),"Message":/test three/.toString(),"Status":/Accepted/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig for Applications/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Application History/.toString(),"Format":/xlsx/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/20/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Application_History/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Application_History-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Application Message","Application Date","Application Status","Applicant First Name","Applicant Last Name","Applicant Screen Name","Applicant Email"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new actions.API.Utils.CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new actions.Utils.SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        try{
            //Close Current Window
            new actions.selenium.CloseWindow().run([:])
        }
       catch(all){}catch(Error err){}
        //Delete Affiliate
        new actions.API.Utils.DeleteAffiliate().run([:])

    }
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}