import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131128 - Scorecard Step Export - Submissions - Submission Form Questions
class C131128_ScorecardStepExport_Submissions_SubmissionFormQuestions
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/export idea1/.toString(),"Description":/desc export/.toString(),"Category":/New Product/.toString(),"Multiple Choice Question":/Answer 2/.toString(),"Checkbox Question Name":/Answer 1/.toString(),"Checkbox Check":/TRUE/.toString(),"Short Answer Question":/short test/.toString(),"Long Answer Question":/long test/.toString(),"Dropdown Question":/Answer 3/.toString(),"Number Question":/12345/.toString(),"User Selection Question Name":/End User/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Required Short Question":/required short/.toString(),"Action":/Submit Idea/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/bright131128_2/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/bright131128_2@mailinator.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/export idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Export Step in Pipeline Steps page
        new actions.PipelineStepsView.ExportStepinPipelineStepsPage().run("Step to Export":/Scorecarding/.toString(),"Action Items":false,"Submissions":true,"Action":/Export/.toString())
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/bright131128_2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-Scorecarding_Idea*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Code","Title","Pipeline","Step Name","Tool Type","Date Entered Step","Mark","Decision","Decision Maker","Submitted Date","Submitter","Submitter Email","Category","Status","Tags","Admin Tags","Views","Vote Score","Comment Count"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-Scorecarding_Idea*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Multiple Choice Question","Checkbox Question","Short Answer Question","Long Answer Question","Dropdown Question","Date Question","Number Question","User Selection Question"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-Scorecarding_Idea*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["export idea1","Custom App","Scorecarding","Scorecard","System Admin","New Product","Submitted","Answer 2","Answer 1","short test","long test","Answer 3","12345","End User"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
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