import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131557 - Resend Action Items - Enable in Development Step
class C131557_ResendActionItems_EnableinDevelopmentStep
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
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Development/.toString(),"Development Team":/System Admin/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Multiple Choice Question,Development Long Answer Question,Development Attachment Question/.toString(),"Development Field Included or Required":/Included,Included,Included/.toString(),"Resend action items when submissions return to Step":true,"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick add for Development resend/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for Development resend/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Development/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add for Development resend/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Multiple Choice Question":/Answer 1/.toString(),"Development Long Answer Question":/Long answer development question - Round one/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development Child Checkbox Question":[],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for Development resend/.toString(),"Step Name idea belongs to":/Development/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Completed/.toString(),"Action":/Change Step/.toString())
        //Drag and Drop Ideas in Pipeline Steps
        new actions.PipelineStepsView.DragandDropIdeasinPipelineSteps().run("Idea Title":/Quick add for Development resend/.toString(),"Step":/Development/.toString())
        //Set Resend Action Items Modal
        new actions.PipelineStepsConfigure.SetResendActionItemsModal().run("Action":/Continue/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/Development/.toString(),"Idea Name":/Quick add for Development resend/.toString(),"Completion":false,"Number of Matches":/1/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add for Development resend/.toString())
        //Verify Completed Action Item Message
        new actions.ActionItems.VerifyCompletedActionItemMessage().run("Message":/Showing previous action item answers.    Click here to clear./.toString(),"Should the Message be Displayed":true,"Click on Link":true)
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Multiple Choice Question":/Answer 3/.toString(),"Development Long Answer Question":/Long Answer for Development - Round Two/.toString(),"Development Child Checkbox Question":[],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Completed Tab Value":/2/.toString(),"Title":/Quick add for Development resend/.toString(),"Number of Matches":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/Development/.toString(),"Idea Name":/Quick add for Development resend/.toString(),"Completion":true,"Number of Matches":/1/.toString())
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