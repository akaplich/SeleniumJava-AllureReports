import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131858 - Evaluator able to add attachment in Action Item View Idea 2
class C131858_EvaluatorabletoaddattachmentinActionItemViewIdea2
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Development/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Development Team":/Evaluator,analyst/.toString(),"Development Team Add or Remove":/Add,Add/.toString(),"Development Field":/Development Multiple Choice Question,Development Long Answer Question,Development Attachment Question,Development User Select Question,Development Parent Dropdown Question,Development Child Checkbox Question/.toString(),"Development Field Included or Required":/Included,Included,Included,Included,Included,Included/.toString(),"Allow Assignees to Edit Idea Attributes":true,"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Development/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Allow Assignees to Edit Idea Attributes":false,"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea2/.toString())
        //Set Add Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.SetAddAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/Image3.jpg/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Please try again./.toString(),"Should Exist":false)
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/Image3.jpg/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/test idea1/.toString(),"Click on Action Item":true)
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run([:])
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/1/.toString())
        try{
            //Set Add Attachment in Attachments tab for NGA View Idea page
            new actions.NGAViewIdea.SetAddAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/Image3.jpg/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea2/.toString())
        //Set Add Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.SetAddAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/SamplePDF.pdf/.toString())
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/Image3.jpg/.toString(),"Number of Matches":/1/.toString())
        //Delete Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.DeleteAttachmentinAttachmentstabforNGAViewIdea().run("Attachment File":/Image3.jpg/.toString(),"Instance":/1/.toString(),"Action":/Remove/.toString())
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in Attachments tab for NGA View Idea page
        new actions.NGAViewIdea.VerifyAttachmentinAttachmentstabforNGAViewIdeapage().run("Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
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