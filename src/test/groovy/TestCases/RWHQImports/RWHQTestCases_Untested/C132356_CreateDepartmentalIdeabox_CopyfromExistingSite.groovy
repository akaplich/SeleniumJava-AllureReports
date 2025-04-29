import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132356 - Create Departmental Ideabox - Copy from Existing Site
class C132356_CreateDepartmentalIdeabox_CopyfromExistingSite
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["departmental_idea_box"],"Availability":/true/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Departmental Ideabox/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Departmental Source Ideabox/.toString(),"Description":/desc/.toString(),"SubPipeline Name":/subpipeline1,subpipeline2,subpipeline3/.toString(),"SubPipeline Field Name":/Name of Quick Win Pipeline,Name of Backlog Pipeline,Name of Strategic Pipeline/.toString(),"Action on Multi Pipeline Configuration":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Departmental Source Ideabox/.toString(),"Is it Idea Box?":true)
        //Wait
        new actions.general.Wait().run("Seconds":/7/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline1/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Design Tab in Site Setup
        new actions.SetupSite.SetDesignTabinSiteSetup().run("Custom CSS":/.customfooter::after {   font-weight: bold;   color: navy;   content: ": CSS-Content"; }/.toString(),"User Homepage Footer HTML":/<p class="customfooter"><b>------------------------------------------------------------------Bold Text<\/b><\/p>/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline3/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Enterprise Setup Site Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteNavigationPage().run("Add Edit or Delete Navigation Item":/Add/.toString(),"Title":/Blog/.toString(),"Link":/Blog/.toString(),"Permission":/ALL/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Departmental Source Ideabox/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/subpipeline2/.toString(),"Checkbox Check":/FALSE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Departmental Ideabox/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Departmental Source Ideabox2/.toString(),"Description":/desc/.toString(),"Choose Design Template":/Copy from an Existing Initiative/.toString(),"Copy from Existing Initiative Name":/Departmental Source Ideabox/.toString(),"SubPipeline Name":/subpipeline1_1,subpipeline3_1/.toString(),"SubPipeline Field Name":/New name for subpipeline1,New name for subpipeline3/.toString(),"Action on Multi Pipeline Configuration":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Departmental Source Ideabox2/.toString(),"Is it Idea Box?":true)
        //Wait
        new actions.general.Wait().run("Seconds":/7/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/subpipeline1_1/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Selection/.toString(),"Background Color in RGB":/rgb(235, 222, 240)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline1_1/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Element Exists
        new actions.general.VerifyElement().run("ID":/\/\/table[@id="custom_footer"]\/\/p[contains(.,"Bold Text")]/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Departmental Source Ideabox2/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/subpipeline3_1/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Stage 2: Build Business Case/.toString(),"Background Color in RGB":/rgb(214, 234, 248)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline3_1/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/Blog/.toString())
        //Set Blog Post
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Add/.toString(),"Title":/New Blog/.toString(),"Content":/Desc/.toString(),"Action":/Post/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Departmental Source Ideabox2/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/subpipeline2/.toString(),"Should Exist":false)
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