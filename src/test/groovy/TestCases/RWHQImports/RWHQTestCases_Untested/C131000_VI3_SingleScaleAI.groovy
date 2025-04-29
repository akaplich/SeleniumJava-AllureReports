package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131000 - VI3 - Single Scale AI
class C131000_VI3_SingleScaleAI
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
        //Delete this Action when View Idea 30 is Enabled
        Action6018a1600aed291c14413fd2([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Action Item Tab Count on View Idea 3
        new actions.ViewIdea30.VerifyActionItemTabCountonViewIdea3().run("Tab":/Open/.toString(),"Tab Count":/1/.toString())
        //Verify Action Item Tab Count on View Idea 3
        new actions.ViewIdea30.VerifyActionItemTabCountonViewIdea3().run("Tab":/Completed/.toString(),"Tab Count":/0/.toString())
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Tab":/Completed/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/No Completed Action Items/.toString(),"Should Exist":true)
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Tab":/Open/.toString())
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Click on Action Item Type":/Single Scale/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Open Tab Value":/1/.toString(),"Title":/test idea1/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        //Set Single Scale for Idea in View Idea 3 page
        new actions.ViewIdea30.SetSingleScaleforIdeainViewIdea3page().run("Question":/What is your initial impression of this idea?/.toString(),"Rating":/6/.toString())
        //Verify Action Item Tab Count on View Idea 3
        new actions.ViewIdea30.VerifyActionItemTabCountonViewIdea3().run("Tab":/Open/.toString(),"Tab Count":/0/.toString(),"Completed Message":true,"Click on View Completed Link":true)
        //Verify Single Scale Score in View Idea 3 page
        new actions.ViewIdea30.VerifySingleScaleScoreinViewIdea3page().run("Completed Message":true,"Click on View Completed Link":true,"Question":/What is your initial impression of this idea?/.toString(),"Score":/6/.toString())
        //Verify Action Item Tab Count on View Idea 3
        new actions.ViewIdea30.VerifyActionItemTabCountonViewIdea3().run("Tab":/Completed/.toString(),"Tab Count":/1/.toString())
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Click on Action Item Type":/Single Scale/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/test idea1/.toString(),"Rating":/6/.toString(),"Number of Matches":/1/.toString())
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
    //Delete this Action when View Idea 30 is Enabled
    public static def Action6018a1600aed291c14413fd2(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)

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