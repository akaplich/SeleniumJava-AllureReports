import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128159 - Pipeline List View - Export - Linked Submissions
class C128159_PipelineListView_Export_LinkedSubmissions
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Linked Submissions on View Idea Page
        new actions.ViewIdea.SetLinkedSubmissionsonViewIdeaPage().run("Submission Title":/test idea3/.toString(),"Add or Remove":/Add/.toString(),"Action":/Save Changes/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Add or Remove Columns in Pipeline List View
        new actions.PipelineList.AddorRemoveColumnsinPipelineListView().run("Columns":/Linked Submissions/.toString(),"Add or Remove":/Add/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/20/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/20/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Linked Submissions"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","test idea3"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
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