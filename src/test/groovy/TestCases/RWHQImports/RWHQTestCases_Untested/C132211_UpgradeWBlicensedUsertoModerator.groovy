package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132211 - Upgrade WB licensed User to Moderator
class C132211_UpgradeWBlicensedUsertoModerator
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/2/.toString(),"Idea Box Manager License Type Purchased Count":/1/.toString(),"Run Browser in Incognito":/TRUE/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable IT System Admin role overlay":true,"Enable Whiteboard License":true,"Unlimited Board Creation":/5/.toString(),"Unlicensed Board limit count":/2/.toString(),"Enable Brightidea Moderator License Type":true,"Purchased Moderator Licenses":/2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/Available/.toString(),"Metric Value":/5/.toString(),"Number of Matches":/1/.toString())
        //Set Whiteboard License User
        new actions.People.SetWhiteboardLicenseUser().run("Expand License Breakdown":true,"Click on Add License":true,"User":/Moderator,analyst,Evaluator,Pipeline Admin/.toString(),"Users Add or Remove from Input Field":/Add,Add,Add,Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox Pipeline/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString())
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/Moderator ’s license will be upgraded from a Whiteboard license to a Moderator license, with this change they will have access to create unlimited Whiteboards, as well as access to the additional permissions allocated by the license type.Moderator ’s Whiteboard license will become available to be granted to another user./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Idea Box Manager, Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (1 Available)Brightidea Administrator license (2 Available)Brightidea Moderator license (1 Available)Get more licensesUsers will receive an email notification about their role assignment. /.toString(),"Info Message Exists":true)
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Moderators":/analyst/.toString(),"Moderators Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/analyst ’s license will be upgraded from a Whiteboard license to a Moderator license, with this change they will have access to create unlimited Whiteboards, as well as access to the additional permissions allocated by the license type.analyst ’s Whiteboard license will become available to be granted to another user./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Pipeline Administrator or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Brightidea Administrator license (2 Available)Brightidea Moderator license (0 Available)The Idea Box Manager license does not apply, because this is not a role within an Idea Box. If you select a user with an Idea Box Manager license, he\/she will be upgraded to a Brightidea Administrator license.Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/analyst/.toString(),"License Type":/No License/.toString(),"Number of Matches":/1/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Click Save":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox Pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Moderators":/Pipeline Admin/.toString(),"Moderators Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/Pipeline Admin ’s license will be upgraded from a Whiteboard license to a Idea Box Manager license, with this change they will have access to create unlimited Whiteboards, as well as access to the additional permissions allocated by the license type.Pipeline Admin ’s Whiteboard license will become available to be granted to another user./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Idea Box Manager, Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (0 Available)Brightidea Administrator license (2 Available)Brightidea Moderator license (0 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Moderator/.toString(),"License Type":/No License/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Pipeline Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
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