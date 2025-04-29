package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C117729 - Gig Enhancements - Multiple Applicants
class C117729_GigEnhancements_MultipleApplicants
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Gig/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Gig Marketplace Test/.toString(),"Description":/Description/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup Ideas for Team Building tab
        new actions.SetupIdeas.SetSiteSetupIdeasforTeamBuildingtab().run("Find Teammates":true,"Users can apply to join teams":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Gig App Post Idea
        new actions.PostIdea.SetGigAppPostIdea().run("Job Title":/test idea1/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description of your Job":/Idea Description/.toString(),"Expertise Required":/Expertise1/.toString(),"Expertise Add or Remove":/Add/.toString(),"Attachments File":/Image4.jpg/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tag Name":/testtag1/.toString(),"Tags Add or Remove":/Add/.toString(),"Job Type":/Sales/.toString(),"Required Hours":/5-10 hours/.toString(),"When does this job start?":/On a specific date/.toString(),"Select a date for this project to start":/10\/10\/2019/.toString(),"Job Location":/Other/.toString(),"Specify the job location.":/San Francisco/.toString(),"Engagement":/Other/.toString(),"Specify the job engagement.":/testing/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/Expertise100,Expertise150,Expertise200,Expertise225/.toString(),"Add or Remove Expertise":/Add,Add,Add,Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/Test Message/.toString(),"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/Expertise275/.toString(),"Add or Remove Expertise":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/Test Message/.toString(),"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelinesponsor@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/Expertise100,Expertise150,Expertise275,Expertise300,Expertise310/.toString(),"Add or Remove Expertise":/Add,Add,Add,Add,Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/Test Message/.toString(),"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com /.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Apply on View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.ApplyinViewIdea().run("Message":/Test Message/.toString(),"Action":/Apply/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/4/.toString(),"Applicant's Username":/End User 2/.toString(),"Email":/bi.enduser2@brightidea.com/.toString(),"Message":/Test Message/.toString(),"Expertise":/Expertise275/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/4/.toString(),"Applicant's Username":/NonBI System Admin/.toString(),"Email":/nonbisysadmin@test.com/.toString(),"Message":/Test Message/.toString(),"Expertise":/N\/A/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/4/.toString(),"Applicant's Username":/Pipeline Sponsor/.toString(),"Email":/pipelinesponsor@mailinator.com/.toString(),"Message":/Test Message/.toString(),"Expertise":/Expertise310, Expertise300, Expertise275, Expertise150, Expertise100/.toString())
        //Verify Applicants Tab in View Idea
        new actions.ViewIdea.GigEnhancementsApplyApplicants.VerifyApplicantsTabinViewIdea().run("Number of Applicants":/4/.toString(),"Applicant's Username":/End User/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Message":/Test Message/.toString(),"Expertise":/Expertise225, Expertise200, Expertise150, Expertise100/.toString())
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