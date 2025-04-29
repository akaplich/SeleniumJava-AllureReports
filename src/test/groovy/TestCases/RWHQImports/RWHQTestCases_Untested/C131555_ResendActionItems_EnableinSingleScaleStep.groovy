import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131555 - Resend Action Items - Enable in Single Scale Step
class C131555_ResendActionItems_EnableinSingleScaleStep
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
        //Delete this after  Resend Action Items Part 1 toggle is Enabled
        Action64fbb434c9d98c8414b3179d([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/System Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Resend action items when submissions return to Step":true,"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick add for single scale resend/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale resend/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add for single scale resend/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/4/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale resend/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Drag and Drop Ideas in Pipeline Steps
        new actions.PipelineStepsView.DragandDropIdeasinPipelineSteps().run("Idea Title":/Quick add for single scale resend/.toString(),"Step":/Single Scale/.toString())
        //Set Resend Action Items Modal
        new actions.PipelineStepsConfigure.SetResendActionItemsModal().run("Action":/Continue/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/Single Scale/.toString(),"Idea Name":/Quick add for single scale resend/.toString(),"Completion":false,"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/Quick add for single scale resend/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Action Items Manager/.toString(),"Title":/Quick add for single scale resend/.toString())
        //Verify Completed Action Item Message
        new actions.ActionItems.VerifyCompletedActionItemMessage().run("Message":/You are viewing a previously completed action item. Click here to view your open action item/.toString(),"Should the Message be Displayed":true,"Click on Link":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Default Window/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add for single scale resend/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/7/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/Quick add for single scale resend/.toString(),"Rating":/7/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/Single Scale/.toString(),"Idea Name":/Quick add for single scale resend/.toString(),"Score":/7.0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/Single Scale/.toString(),"Idea Name":/Quick add for single scale resend/.toString(),"Score":/4.0/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/Quick add for single scale resend/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Action Items Manager/.toString(),"Title":/Quick add for single scale resend/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/You are viewing a previously completed action item./.toString(),"Should Exist":true)
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
    //Delete this after  Resend Action Items Part 1 toggle is Enabled
    public static def Action64fbb434c9d98c8414b3179d(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Resend Action Items - Single Scale, Scorecard, and Development Steps":true)

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