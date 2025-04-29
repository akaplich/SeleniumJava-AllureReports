import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131839 - Evaluation Reordering - Multiple Ideas Drag and Drop
class C131839_EvaluationReordering_MultipleIdeasDragandDrop
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea3/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea4/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea5/.toString(),"Action":/Submit/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Judging/.toString(),"Select Tool Type":/Judging/.toString(),"Select Stage":/Hackathon/.toString(),"Action":/Create/.toString())
        //Configure Judging Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureJudgingStepinNewModalinPipelineStepspage().run("Judges":/Evaluator/.toString(),"Judges Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea4/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Set Update Order from Pipeline Steps View
        new actions.PipelineStepsView.SetUpdateOrderfromPipelineStepsView().run("Step Name to Configure (optional)":/Judging/.toString(),"Tool Type":/Judging/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Ideas to Select":/Idea2,Idea3,Idea5/.toString(),"Check or Uncheck Ideas to Select":/CHECK,CHECK,CHECK/.toString())
        //Set Drag and Drop Ideas in Update Tooltype Order Modal
        new actions.PipelineStepsView.SetDragandDropIdeasinUpdateTooltypeOrderModal().run("Idea to drag":/Idea3/.toString(),"New Row Number":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/1/.toString(),"Project Name":/Idea2/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/2/.toString(),"Project Name":/Idea3/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/3/.toString(),"Project Name":/Idea5/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/4/.toString(),"Project Name":/Idea1/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/5/.toString(),"Project Name":/Idea4/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Action":/Save Changes/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/New evaluation order saved!/.toString(),"Should Exist":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Judging/.toString(),"Evaluator":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Set Share Evaluation Reordering in Manage Step Page 
        new actions.PipelineManageSteps.SetConfigureLinkinManageStepPage().run("Share Options":/Copy Evaluation Link/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Evaluation link copied!/.toString(),"Should Exist":true)
        //Get Clipboard Content
        variables."copiedString" = new actions.selenium.GetClipboardContent().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedString"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/7/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea2/.toString(),"Order":/1/.toString(),"Completed":false,"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea3/.toString(),"Order":/2/.toString(),"Completed":false,"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea5/.toString(),"Order":/3/.toString(),"Completed":false,"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea1/.toString(),"Order":/4/.toString(),"Completed":false,"Row Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea4/.toString(),"Order":/5/.toString(),"Completed":false,"Row Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Set Judging for Idea in Action Items page
        new actions.ActionItems.SetJudgingforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise benefit":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea2/.toString(),"Order":/1/.toString(),"Completed":true,"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea3/.toString(),"Order":/2/.toString(),"Completed":false,"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea5/.toString(),"Order":/3/.toString(),"Completed":false,"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea1/.toString(),"Order":/4/.toString(),"Completed":false,"Row Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Idea4/.toString(),"Order":/5/.toString(),"Completed":false,"Row Number":/5/.toString(),"Number of Matches":/1/.toString())
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