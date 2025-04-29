import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131859 - Evaluator able to add attachment in Action Item View Idea 3
class C131859_EvaluatorabletoaddattachmentinActionItemViewIdea3
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
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("View Idea 3 in Action Items and Manage Pages":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
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
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/scorecard idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/scorecard idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea2/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Load From":/Link/.toString(),"Attachment File":/Image3.jpg/.toString(),"Attachment Add or Remove":/Add/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/1/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/scorecard idea/.toString(),"Click on Action Item":true)
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run([:])
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/scorecard idea/.toString(),"Number of Matches":/1/.toString())
        try{
            //Set Attachment in View Idea 3 page
            new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Load From":/Link/.toString(),"Attachment File":/Image3.jpg/.toString(),"Attachment Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/0/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea2/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Load From":/Link/.toString(),"Attachment File":/SamplePDF.pdf/.toString(),"Attachment Add or Remove":/Add/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/2/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/2/.toString(),"Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Attachment File":/Image3.jpg/.toString(),"Attachment Add or Remove":/Remove/.toString())
        //Set Remove Attachment in View Idea 3 Page
        new actions.ViewIdea30.SetRemoveAttachmentinViewIdea3Page().run("Action":/Remove/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/1/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/1/.toString(),"Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/1/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/1/.toString(),"Attachment File":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
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