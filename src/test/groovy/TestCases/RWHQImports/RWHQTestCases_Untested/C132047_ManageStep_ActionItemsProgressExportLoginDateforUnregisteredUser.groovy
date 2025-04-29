import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132047 - Manage Step - Action Items Progress Export Login Date for Unregistered User
class C132047_ManageStep_ActionItemsProgressExportLoginDateforUnregisteredUser
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/System Admin,End User,Pipeline Sponsor/.toString(),"Individual Assignment User Add or Remove":/Add,Add,Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick add Idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick add Idea2/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Scorecarding/.toString(),"Evaluator":/System Admin/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Action Items Progress Export
        new actions.PipelineManageSteps.SetActionItemsProgressExport().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Scorecarding*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Percent Complete","Assigned","Remaining","ACT","Last Login Date"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Set Action Items Progress Export
        new actions.PipelineManageSteps.SetActionItemsProgressExport().run([:])
        //Return Todays or Other Date in the Requested Format
        variables."date" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/M\/dd\/yyyy/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Scorecarding*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","${date}"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Set Action Items Progress Export
        new actions.PipelineManageSteps.SetActionItemsProgressExport().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Scorecarding*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline Sponsor","pipelinesponsor@mailinator.com","0%"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Set Action Items Progress Export
        new actions.PipelineManageSteps.SetActionItemsProgressExport().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Scorecarding*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["01/01/1970"],"Number of Matches":/0/.toString(),"Total Number of Rows":/4/.toString())
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