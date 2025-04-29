import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117065 - Read Only Admin Role - Step Manage Visibility
class C117065_ReadOnlyAdminRole_StepManageVisibility
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
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        try{
            //Configure Review Step in Pipeline Steps page
            new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/bi.enduser1@brightidea.com/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        try{
            //Access Pipeline Manage Steps for a Step
            new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        }
       catch(all){}catch(Error err){}
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[id='scorecard-configure-label']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Configure Review Action Item/.toString(),"Should Exist":false)
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[@id='overview-grid-edit-due-date']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Dynamically Set Due Date/.toString(),"Should Exist":false)
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[@id='overview-grid-remind-all']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Do you want to send a reminder to all assignees/.toString(),"Should Exist":false)
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[contains(@class,'grid-action-button')]/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[@id='overview-grid-remind']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Do you want to send a reminder to all assignees/.toString(),"Should Exist":false)
        try{
            //Advance Idea to Next Step in Manage Step page
            new actions.PipelineManageSteps.AdvanceIdeatoNextStepinManageStep().run("Idea Name":/test idea1/.toString(),"Action":/Advance Ideas/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Currently in Step table for Manage Judging
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageJudging().run("Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[@id='scores_actions_btn']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Change Status/.toString(),"Should Exist":false)
        //Verify Step History for Manage Step
        new actions.PipelineManageSteps.VerifyStepHistoryinManageStep().run("Idea Name":/test idea1/.toString())
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[@id='scores_actions_btn']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Change Status/.toString(),"Should Exist":false)
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[id='scorecard-configure-label']/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Configure Review Action Item/.toString(),"Should Exist":false)
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