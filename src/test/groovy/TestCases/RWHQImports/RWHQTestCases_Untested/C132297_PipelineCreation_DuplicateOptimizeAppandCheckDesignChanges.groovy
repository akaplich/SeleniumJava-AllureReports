import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132297 - Pipeline Creation - Duplicate Optimize App and Check Design Changes
class C132297_PipelineCreation_DuplicateOptimizeAppandCheckDesignChanges
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Optimize/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Optimize Challenge title/.toString(),"Description":/Optimize Challenge description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize Challenge title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Design Tab in Site Setup
        new actions.SetupSite.SetDesignTabinSiteSetup().run("Custom CSS":/.customfooter::after {   font-weight: bold;   color: navy;   content: ": CSS-Content"; }/.toString(),"User Homepage Footer HTML":/<p class="customfooter"><b>------------------------------------------------------------------Bold Text<\/b><\/p>/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize Challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Optimize Challenge title/.toString(),"Initiative Description":/Optimize Challenge description/.toString())
        //Verify Element Exists
        new actions.general.VerifyElement().run("ID":/\/\/table[@id="custom_footer"]\/\/p[contains(.,"Bold Text")]/.toString(),"Number of Matches":/1/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/table[@id="custom_footer"]/.toString(),"Expected Image File":/C132297_CustomFooter.png/.toString(),"Actual Image Name":/C132297_CustomFooter_Actual1.png/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Duplicate Webstorm
        new actions.WebstormCreation.CreateDuplicateWebstorm().run("Pipeline To Duplicate":/Optimize Challenge title/.toString(),"Name":/Duplicate of Optimize Challenge title/.toString(),"Description":/Desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action":/Duplicate/.toString(),"Should Admin Wait for Pipeline to be Created":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate of Optimize Challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Element Exists
        new actions.general.VerifyElement().run("ID":/\/\/table[@id="custom_footer"]\/\/p[contains(.,"Bold Text")]/.toString(),"Number of Matches":/1/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/table[@id="custom_footer"]/.toString(),"Expected Image File":/C132297_CustomFooter.png/.toString(),"Actual Image Name":/C132297_CustomFooter_Actual2.png/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132297_CustomFooter_Actual1.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132297_CustomFooter_Actual2.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}