import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132358 - Upgrade modal displayed for moderator license
class C132358_Upgrademodaldisplayedformoderatorlicense
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/2/.toString(),"Idea Box Manager License Type Purchased Count":/1/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable Brightidea Moderator License Type":true,"Purchased Moderator Licenses":/2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/analyst/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true)
        }
       catch(all){}catch(Error err){}
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Moderator/.toString(),"License Type":/No License/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/analyst/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
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