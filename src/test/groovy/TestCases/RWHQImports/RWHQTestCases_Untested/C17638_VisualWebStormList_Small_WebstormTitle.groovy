import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17638 - Visual WebStorm List (Small) - Webstorm Title
class C17638_VisualWebStormList_Small_WebstormTitle
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
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Visual Initiative List (Small)/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Disable/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Widget Visual Webstorm List Small Link
        new actions.Widgets.AccessWidgetVisualWebstormListSmallLink().run("Link Name":/Custom App/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom App/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Site Info Page
        new actions.SetupSite.SetWebstormSetupSiteInfoPage().run("Webstorm Title":/Edited title of Custom App/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Access Widget Visual Webstorm List Small Link
        new actions.Widgets.AccessWidgetVisualWebstormListSmallLink().run("Link Name":/Edited title of Custom App/.toString())
        //Verify Widget Community Stats
        new actions.Widgets.VerifyWidgetCommunityStats().run("submissions":/3/.toString(),"comment":/1/.toString(),"votes":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Edited title of Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Information in Pipeline Setup Page
        new actions.PipelineSetup.SetInformationinPipelineSetupPage().run("Name":/New title for Custom App/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Widget Visual Webstorm List Small Link
        new actions.Widgets.AccessWidgetVisualWebstormListSmallLink().run("Link Name":/New title for Custom App/.toString())
        //Verify Widget Community Stats
        new actions.Widgets.VerifyWidgetCommunityStats().run("submissions":/3/.toString(),"comment":/1/.toString(),"votes":/3/.toString())
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