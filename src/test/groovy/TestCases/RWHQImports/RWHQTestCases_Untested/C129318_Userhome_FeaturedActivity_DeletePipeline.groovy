import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129318 - Userhome - Featured Activity - Delete Pipeline
class C129318_Userhome_FeaturedActivity_DeletePipeline
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/My Activity - Test/.toString(),"Description":/My Activity Description/.toString(),"Pipeline Administrators":/pipelineadmin@test.com/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Featured Activity":true,"Featured Activity Title(s)":/Custom App,My Activity - Test/.toString(),"Featured Activity Title(s) Add or Remove":/Add,Add/.toString(),"Activities":true,"My Ideas":true,"Submissions":true,"Projects":true,"Helpful Links":true,"User Metrics My Ideas":true,"User Metrics Submissions":true,"User Metrics Activities":true,"User Metrics Submission Views":true,"User Metrics Collaborators":true,"User Metrics Projects":true,"User Metrics Business Impact":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Command Center/.toString())
        //Delete Pipeline or Folder in Pipeline Sidebar
        new actions.PipelineSidebar.DeletePipelineorFolderinPipelineSidebar().run("Pipeline or Folder Name":/Custom App/.toString())
        //Set Delete Idea or Pipeline in all places
        new actions.PipelineStepsView.SetDeleteIdea().run("I understand":true,"Action":/Delete Pipeline/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Featured Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyFeaturedActivityinUserHomepage().run("Total Number of Activities on the page":/1/.toString(),"Activity Name":/My Activity - Test/.toString(),"Description":/My Activity Description/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Command Center/.toString())
        //Delete Pipeline or Folder in Pipeline Sidebar
        new actions.PipelineSidebar.DeletePipelineorFolderinPipelineSidebar().run("Pipeline or Folder Name":/My Activity - Test/.toString())
        //Set Delete Idea or Pipeline in all places
        new actions.PipelineStepsView.SetDeleteIdea().run("I understand":true,"Action":/Delete Pipeline/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Featured Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyFeaturedActivityinUserHomepage().run("Total Number of Activities on the page":/0/.toString(),"Activity Name":/My Activity - Test/.toString(),"Description":/My Activity Description/.toString(),"Number of Matches":/0/.toString())
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