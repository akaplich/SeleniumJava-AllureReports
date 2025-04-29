import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132222 - Upgrade Moderator license to BA when no Moderator license available
class C132222_UpgradeModeratorlicensetoBAwhennoModeratorlicenseavailable
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/3/.toString(),"Run Browser in Incognito":/TRUE/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable Brightidea Moderator License Type":true,"Purchased Moderator Licenses":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Innovation Process/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Innovation Process/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/analyst/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator,Evaluator/.toString(),"Moderators Add or Remove":/Add,Add/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/Evaluator will be assigned a Brightidea Administrator license, as there are no available Moderator licenses.The Brightidea Administrator license will allow Evaluator to be assigned to licensed roles throughout the product./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Pipeline Administrator or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Brightidea Administrator license (1 Available)Brightidea Moderator license (0 Available)Get more licensesUsers will receive an email notification about their role assignment. /.toString(),"Info Message Exists":true)
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<EMPTY>/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Innovation Process/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Moderators":/Pipeline Sponsor/.toString(),"Moderators Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/Pipeline Sponsor will be assigned a Brightidea Administrator license, as there are no available Moderator licenses.The Brightidea Administrator license will allow Pipeline Sponsor to be assigned to licensed roles throughout the product./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Pipeline Administrator or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Brightidea Administrator license (0 Available)Brightidea Moderator license (0 Available)You can still assign users who have already been granted a Brightidea Administrator license. Unlicensed users will appear disabled in the search results.Get more licensesUsers will receive an email notification about their role assignment. /.toString(),"Info Message Exists":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Pipeline Sponsor/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Moderator/.toString(),"License Type":/No License/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Evaluator/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
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