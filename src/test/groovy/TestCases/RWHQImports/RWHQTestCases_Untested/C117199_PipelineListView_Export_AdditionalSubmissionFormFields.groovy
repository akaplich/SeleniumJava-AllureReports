import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C117199 - Pipeline List View - Export - Additional Submission Form Fields
class C117199_PipelineListView_Export_AdditionalSubmissionFormFields
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
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc test idea4/.toString(),"Tag Name":/Tag1/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/Operations/.toString(),"Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question Name":/Answer 2/.toString(),"Checkbox Check":/TRUE/.toString(),"Short Answer Question":/short/.toString(),"Long Answer Question":/long/.toString(),"Dropdown Question":/Answer 3/.toString(),"Date Question":/04\/01\/2018/.toString(),"Number Question":/12345/.toString(),"Admin Only Dropdown Question":/Answer 1/.toString(),"Required Short Question":/required/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Add or Remove Columns in Pipeline List View
        new actions.PipelineList.AddorRemoveColumnsinPipelineListView().run("Columns":/Title,Multiple Choice Question/.toString(),"Add or Remove":/Remove,Add/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Title"],"Number of Matches":/0/.toString(),"Total Number of Rows":/8/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Multiple Choice Question"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
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