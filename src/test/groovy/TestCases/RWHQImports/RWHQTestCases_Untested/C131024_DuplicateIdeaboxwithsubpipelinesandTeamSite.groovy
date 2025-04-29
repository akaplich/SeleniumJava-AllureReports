import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131024 - Duplicate Ideabox with subpipelines and Team Site
class C131024_DuplicateIdeaboxwithsubpipelinesandTeamSite
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/7/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Idea Box Team Site":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Instance/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Managers":/Community Admin/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run("Enable Team Site View":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/SubPipeline1/.toString(),"Description":/Custom Initiative description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/SubPipeline1/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("This pipeline is an Idea Box Sub-pipeline":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Instance/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/SubPipeline1/.toString(),"Checkbox Check":/TRUE/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Instance\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/SA Idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Duplicate Webstorm for Standard Licensed Affiliates
        new actions.WebstormCreation.CreateDuplicateWebstormforStandardLicensedAffiliates().run("Initiative to Duplicate":/Instance (Idea Box Instance)/.toString(),"Name":/Duplicate Ideabox/.toString(),"Description":/desc/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Remove/.toString(),"General Access Users":/All,End User/.toString(),"General Access Users Add or Remove":/Remove,Add/.toString(),"Should Admin Wait for Pipeline to be Created":false)
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Users will receive an email notification about their role assignment./.toString(),"Info Message Exists":true,"Duplicate Admin Info Box":/If duplicating an older version, some functionality may be limited. It is recommended to copy the design within the setup wizard to access updated features. Learn More/.toString(),"Duplicate Initiative Info Box":/Assigning a user to either the Idea Box Manager, Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:/.toString(),"Duplicate Licenses Available":/Idea Box Manager license (4 Available)/.toString())
        //Create Duplicate Webstorm for Standard Licensed Affiliates
        new actions.WebstormCreation.CreateDuplicateWebstormforStandardLicensedAffiliates().run("Action":/Duplicate/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate Ideabox/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("General Access":/End User/.toString(),"General Access Add or Remove":/Remove/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate Ideabox/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Click Save":false)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Pipeline Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/0/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Moderator/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/0/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Idea Box Managers/.toString(),"User":/Community Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Community Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Sponsor/.toString(),"User":/System Admin/.toString(),"License Type":/No License/.toString(),"Number of Matches":/1/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Users will receive an email notification about their role assignment./.toString(),"Info Message Exists":true,"Duplicate Admin Info Box":/If duplicating an older version, some functionality may be limited. It is recommended to copy the design within the setup wizard to access updated features. Learn More/.toString(),"Duplicate Initiative Info Box":/Assigning a user to either the Idea Box Manager, Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:/.toString(),"Duplicate Licenses Available":/Idea Box Manager license (4 Available)/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Duplicate Ideabox/.toString())
        //Verify the sub pipelines and communities in Communities tab
        new actions.SetupEnterpriseCommunities.VerifythesubpipelinesandcommunitiesinCommunitiestab().run("Parent Community Name":/Duplicate Ideabox/.toString(),"Sub Pipeline or Community Name":/Duplicate Ideabox/.toString(),"Number of Matches":/1/.toString())
        //Verify the sub pipelines and communities in Communities tab
        new actions.SetupEnterpriseCommunities.VerifythesubpipelinesandcommunitiesinCommunitiestab().run("Parent Community Name":/Duplicate Ideabox/.toString(),"Sub Pipeline or Community Name":/SubPipeline1/.toString(),"Number of Matches":/0/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Instance/.toString())
        //Verify the sub pipelines and communities in Communities tab
        new actions.SetupEnterpriseCommunities.VerifythesubpipelinesandcommunitiesinCommunitiestab().run("Parent Community Name":/Instance/.toString(),"Sub Pipeline or Community Name":/Instance/.toString(),"Number of Matches":/1/.toString())
        //Verify the sub pipelines and communities in Communities tab
        new actions.SetupEnterpriseCommunities.VerifythesubpipelinesandcommunitiesinCommunitiestab().run("Parent Community Name":/Instance/.toString(),"Sub Pipeline or Community Name":/SubPipeline1/.toString(),"Number of Matches":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/DuplicateIdeabox\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/SA Duplicate Idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
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