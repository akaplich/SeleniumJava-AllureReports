import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131696 - Linked Submission - Post Idea with Linked Submission Pipeline Admin
class C131696_LinkedSubmission_PostIdeawithLinkedSubmissionPipelineAdmin
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
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Link Ideas/.toString(),"Additional Question Type":/Linked Submissions/.toString(),"Save Form":true)
        //Delete this Action when View Idea 30 is Enabled
        Action6018a1600aed291c14413fd2([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Link Ideas in Post Idea2
        new actions.PostIdea.SetLinkIdeasinPostIdea2().run("Link Ideas":/solve test idea1/.toString(),"Add or Remove":/Add/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea with Linked Submission/.toString(),"Description":/Description of linked submission/.toString(),"Tag Name":/link ideas/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/Strategy/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea with Linked Submission/.toString())
        //Verify Linked Submissions on VI3
        new actions.ViewIdea30.VerifyLinkedSubmissionsVI3().run("Linked Idea(s)":/(D106) solve test idea1/.toString(),"Linked Idea(s) Status":/Pending/.toString(),"Should Exist":/TRUE/.toString(),"Linked Idea to Click On (optional)":/(D106) solve test idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/solve test idea1/.toString(),"Linked Submissions":[])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Add or Remove Columns in Pipeline List View
        new actions.PipelineList.AddorRemoveColumnsinPipelineListView().run("Columns":/Linked Submissions/.toString(),"Add or Remove":/Add/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Idea with Linked Submission/.toString(),"Linked Submissions":/solve test idea1 (D106)/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Title","Linked Submissions"],"Number of Matches":/1/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Idea with Linked Submission","solve test idea1 (D106)"])
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
    //Delete this Action when View Idea 30 is Enabled
    public static def Action6018a1600aed291c14413fd2(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)

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