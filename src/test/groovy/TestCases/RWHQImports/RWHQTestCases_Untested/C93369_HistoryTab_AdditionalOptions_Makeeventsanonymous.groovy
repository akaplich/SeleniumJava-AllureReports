import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C93369 - History Tab - Additional Options - Make events anonymous
class C93369_HistoryTab_AdditionalOptions_Makeeventsanonymous
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("History Tab on View Submission":true,"Extended Data for History Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for History Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforHistoryTab().run("Roles":/All Users/.toString(),"Make events anonymous":true,"Action":/Save/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea anonymous/.toString(),"Description":/description for test idea anonymous/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea anonymous/.toString())
        //Set Category for View Idea page
        new actions.ViewIdea.SetCategoryForViewIdeaPage().run("Field Value":/New Product/.toString(),"Action":/Change Category/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Category changed from 'Operations' to 'New Product' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea anonymous/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea anonymous/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Step changed from 'Review' to 'Single Scale' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Category changed from 'Operations' to 'New Product' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/2/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Idea submitted by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/3/.toString(),"Total Number of Records":/3/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea anonymous/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Step changed from 'Review' to 'Single Scale'/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Category changed from 'Operations' to 'New Product'/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/2/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Idea submitted/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/3/.toString(),"Total Number of Records":/3/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea anonymous/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Step changed from 'Review' to 'Single Scale'/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Category changed from 'Operations' to 'New Product'/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/2/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Idea submitted/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/3/.toString(),"Total Number of Records":/3/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea anonymous/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Step changed from 'Review' to 'Single Scale' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Category changed from 'Operations' to 'New Product' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/2/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Event Record to Verify":/Idea submitted by System Admin/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/3/.toString(),"Total Number of Records":/3/.toString())
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