package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131001 - WB - Single Scale AI on Idea Modal
class C131001_WB_SingleScaleAIonIdeaModal
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
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/SINGLE SCALE/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"User(s)":/Evaluator/.toString(),"User Add or Remove":/Add/.toString(),"Send Invite":true,"Action":/Close/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/-400/.toString(),"Y coordinate":/250/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/idea1/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/50/.toString(),"Y coordinate":/20/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Add to pipeline":/Custom App/.toString(),"Add to pipeline Action":/Add/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/Added to pipeline successfully. D113/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Question Text":/This is for testing single scale question rating/.toString(),"Rating Scale":/1-10/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Visible/.toString(),"Action":/Change Visibility/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Select Existing Whiteboard from Userhome Whiteboards
        new actions.Whiteboards.OpenExistingWhiteboardOnWhiteboardsPage().run("Tab":/Shared with Me/.toString(),"Name of Whiteboard":/SINGLE SCALE/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/430/.toString(),"Y coordinate":/400/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Right Click on Sticky Note":false,"View idea details":true)
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
        //Set Single Scale for Idea in View Idea 3 page
        new actions.ViewIdea30.SetSingleScaleforIdeainViewIdea3page().run("Question":/What is your initial impression of this idea?This is for testing single scale question rating/.toString(),"Rating":/10/.toString())
        //Verify Action Item Tab Count on View Idea 3
        new actions.ViewIdea30.VerifyActionItemTabCountonViewIdea3().run("Tab":/Open/.toString(),"Tab Count":/0/.toString())
        //Verify Single Scale Score in View Idea 3 page
        new actions.ViewIdea30.VerifySingleScaleScoreinViewIdea3page().run("Completed Message":true,"Click on View Completed Link":true,"Question":/What is your initial impression of this idea?This is for testing single scale question rating/.toString(),"Score":/10/.toString())
        //Verify Action Item Tab Count on View Idea 3
        new actions.ViewIdea30.VerifyActionItemTabCountonViewIdea3().run("Tab":/Completed/.toString(),"Tab Count":/1/.toString())
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Click on Action Item Type":/Single Scale/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/idea1/.toString(),"Rating":/10/.toString(),"Number of Matches":/1/.toString())
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