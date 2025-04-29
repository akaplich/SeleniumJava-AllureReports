package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130120 - Granting BA license to Ideabox pipelines
class C130120_GrantingBAlicensetoIdeaboxpipelines
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
        Action58123c20fa4ee77809f468f6("Username Email":/moderator@test.com/.toString(),"Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/2/.toString(),"Idea Box Manager License Type Purchased Count":/2/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/John/.toString(),"Last Name":/Doe/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox Pipeline/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox Pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true)
        }
       catch(all){}catch(Error err){}
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to either the Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (2 Available)Brightidea Administrator license (2 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Admin Field Name":/Pipeline Managers/.toString(),"Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Evaluator/.toString(),"Moderators Add or Remove":/Add/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to either the Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (0 Available)Brightidea Administrator license (2 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/John Doe will be granted a Brightidea Administrator license, because there are no Idea Box Manager licenses available.The Brightidea Administrator license will allow John Doe to be assigned to not only licensed roles for Idea Boxes and Idea Box pipelines, but also other licensed roles throughout the product./.toString(),"Action":/Cancel/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/John Doe/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/0/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to either the Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (0 Available)Brightidea Administrator license (2 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Admin Field Name":/Pipeline Managers/.toString(),"Administrators":/moderator@test.com/.toString(),"Administrators Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/John Doe will be granted a Brightidea Administrator license, because there are no Idea Box Manager licenses available.The Brightidea Administrator license will allow John Doe to be assigned to not only licensed roles for Idea Boxes and Idea Box pipelines, but also other licensed roles throughout the product./.toString(),"Action":/OK/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/John Doe/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false)
        }
       catch(all){}catch(Error err){}
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to either the Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (0 Available)Brightidea Administrator license (1 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Evaluator/.toString(),"Roles":/Pipeline Moderator/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":false,"User":/Pipeline Admin/.toString(),"Roles":/Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Back to Licenses on Licenses Tab
        new actions.People.SetBacktoLicensesonLicensesTab().run([:])
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/John Doe/.toString(),"Roles":/Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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