import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131695 - Linked Submission - Post Idea with Hidden Linked Submission Moderator
class C131695_LinkedSubmission_PostIdeawithHiddenLinkedSubmissionModerator
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Linked Ideas/.toString(),"Additional Question Type":/Linked Submissions/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Linked Ideas/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Linked Submission field is find similar ideas and link them in post idea page/.toString(),"Tooltip":/Look for Similar Ideas and Link/.toString(),"Save Form":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Linked Ideas/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Linked Submission field is find similar ideas and link them in post idea page/.toString(),"Should Exist":true)
        //Set Link Ideas in Post Idea2
        new actions.PostIdea.SetLinkIdeasinPostIdea2().run("Link Ideas":/quick add1/.toString(),"Add or Remove":/Add/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea with Linked Submission/.toString(),"Description":/Description of linked submission/.toString(),"Tag Name":/link ideas/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/New Product/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea with Linked Submission/.toString())
        //Verify Linked Submission on View Idea
        new actions.ViewIdea.VerifyLinkedSubmissiononViewIdea().run("Linked Submissions":/quick add1/.toString(),"Should Exist":/TRUE/.toString(),"Name of the Linked Submission to Navigate to":/quick add1/.toString())
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