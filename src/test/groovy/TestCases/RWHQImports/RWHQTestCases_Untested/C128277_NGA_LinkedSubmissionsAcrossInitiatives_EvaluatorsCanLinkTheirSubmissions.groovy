import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128277 - NGA - Linked Submissions Across Initiatives - Evaluators Can Link Their Submissions
class C128277_NGA_LinkedSubmissionsAcrossInitiatives_EvaluatorsCanLinkTheirSubmissions
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Submission Name - Singular":/Submission/.toString(),"Submission Name - Plural":/Submissions/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom App Test/.toString(),"Description":/about/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/linked idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App Test/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/linked idea2/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/linked idea1/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run([:])
        //Set Linked Submissions on NGA View Idea Page
        new actions.NGAViewIdea.SetLinkedSubmissionsNGAViewIdeaPage().run("Submission Title":/linked idea/.toString(),"Add or Remove":/Add/.toString(),"Action":/Link Submissions/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Linked Submission on NGA View Idea
        new actions.NGAViewIdea.VerifyLinkedSubmissionNGAViewIdea().run("Linked Submissions":/linked idea2/.toString(),"Should Exist":/TRUE/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/test idea1/.toString())
        //Set Linked Submissions on NGA View Idea Page
        new actions.NGAViewIdea.SetLinkedSubmissionsNGAViewIdeaPage().run("Submission Title":/linked idea2/.toString(),"Add or Remove":/Add/.toString(),"Action":/Link Submissions/.toString())
        //Verify Linked Submission on NGA View Idea
        new actions.NGAViewIdea.VerifyLinkedSubmissionNGAViewIdea().run("Linked Submissions":/linked idea2/.toString(),"Should Exist":/TRUE/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Linked Submission on NGA View Idea
        new actions.NGAViewIdea.VerifyLinkedSubmissionNGAViewIdea().run("Linked Submissions":/linked idea2/.toString(),"Should Exist":/TRUE/.toString())
        try{
            //Set Linked Submissions on NGA View Idea Page
            new actions.NGAViewIdea.SetLinkedSubmissionsNGAViewIdeaPage().run("Submission Title":/solve/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/No Submissions Found/.toString(),"Should Exist":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Linked Submission on NGA View Idea
        new actions.NGAViewIdea.VerifyLinkedSubmissionNGAViewIdea().run("Linked Submissions":/solve test idea1/.toString(),"Should Exist":/FALSE/.toString())
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