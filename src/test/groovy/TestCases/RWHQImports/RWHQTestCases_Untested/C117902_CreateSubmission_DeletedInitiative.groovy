package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117902 - Create Submission - Deleted Initiative
class C117902_CreateSubmission_DeletedInitiative
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
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/Brightidea is a next big thing/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Access My Idea on View My Idea
        new actions.Enterprise.UserHomepage.AccessMyIdeaonViewMyIdea().run("Access View My Idea modal":/Brightidea is a next big thing/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Set Submissions from My Idea
        new actions.Enterprise.UserHomepage.SetSubmissionsfromMyIdea().run("Select Initiative":/Custom App/.toString(),"Action":/Create Submission/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Category":/New Product/.toString(),"Required Short Question":/test/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Delete Pipeline or Folder in Pipeline Sidebar
        new actions.PipelineSidebar.DeletePipelineorFolderinPipelineSidebar().run("Pipeline or Folder Name":/Custom App/.toString())
        //Set Delete Idea or Pipeline in all places
        new actions.PipelineStepsView.SetDeleteIdea().run("I understand that deleting these Ideas will also delete all related comments, votes, and action items.":true,"Action":/Delete Pipeline/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Access My Idea on View My Idea
        new actions.Enterprise.UserHomepage.AccessMyIdeaonViewMyIdea().run("Access View My Idea modal":/Brightidea is a next big thing/.toString())
        //Verify Linked Submissions on View My Idea
        new actions.Enterprise.UserHomepage.VerifyLinkedSubmissionsonViewMyIdea().run("Linked Submissions":/Brightidea is a next big thing/.toString(),"Should Exist":/FALSE/.toString())
        try{
            //Set Submissions from My Idea
            new actions.Enterprise.UserHomepage.SetSubmissionsfromMyIdea().run("Select Initiative":/Custom App/.toString(),"Action":/Create Submission/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Custom and Other App Post Idea
            new actions.PostIdea.SetCustomAppPostIdea().run("Title":/New Title/.toString(),"Category":/New Product/.toString(),"Required Short Question":/test/.toString(),"Action":/Submit Idea/.toString())
        }
       catch(all){}catch(Error err){}
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Access My Idea on View My Idea
        new actions.Enterprise.UserHomepage.AccessMyIdeaonViewMyIdea().run("Access View My Idea modal":/Brightidea is a next big thing/.toString())
        //Verify Linked Submissions on View My Idea
        new actions.Enterprise.UserHomepage.VerifyLinkedSubmissionsonViewMyIdea().run("Linked Submissions":/New Title/.toString(),"Should Exist":/FALSE/.toString())
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