import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131124 - WB License - Upgrade WB license to BA license for Ideabox
class C131124_WBLicense_UpgradeWBlicensetoBAlicenseforIdeabox
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/4/.toString(),"Idea Box Manager License Type Purchased Count":/1/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable Whiteboard License":true,"Unlimited Board Creation":/3/.toString(),"Unlicensed Board limit count":/2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/3/.toString(),"Number of Matches":/1/.toString())
        //Set Whiteboard License User
        new actions.People.SetWhiteboardLicenseUser().run("Expand License Breakdown":true,"Click on Add License":true,"User":/analyst,pipelineadmin@test.com/.toString(),"Users Add or Remove from Input Field":/Add,Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Managers":/Community Admin/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/analyst/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/analyst ’s license will be upgraded from a Whiteboard license to a Brightidea Administrator license, with this change they will have access to create unlimited Whiteboards, as well as access to the additional permissions allocated by the license type.analyst ’s Whiteboard license will become available to be granted to another user./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Idea Box Manager, Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (0 Available)Brightidea Administrator license (3 Available)Get more licensesUsers will receive an email notification about their role assignment. /.toString(),"Info Message Exists":true)
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<EMPTY>/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/Available/.toString(),"Metric Value":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Whiteboard Licenses in Use
        new actions.People.VerifyWhiteboardLicensesinUse().run("Expand License Breakdown":true,"Licenses in Use":/analyst/.toString(),"Number of Whiteboards":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Whiteboard Licenses in Use
        new actions.People.VerifyWhiteboardLicensesinUse().run("Expand License Breakdown":false,"Licenses in Use":/Pipeline Admin/.toString(),"Number of Whiteboards":/0/.toString()," Last Login":/Not Registered/.toString(),"Number of Matches":/1/.toString())
        //Verify Users Under Admins with Unlimited 
        new actions.People.VerifyUsersUnderAdminswithUnlimited().run("Expand License Breakdown":false,"User Name":/analyst/.toString(),"Number of Matches":/1/.toString())
        //Verify Users Under Admins with Unlimited 
        new actions.People.VerifyUsersUnderAdminswithUnlimited().run("Expand License Breakdown":false,"User Name":/Community Admin/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Available/.toString(),"Metric Value":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/Available/.toString(),"Metric Value":/0/.toString(),"Number of Matches":/1/.toString())
        try{
            //Verify Licenses User in People Pillar Licenses tab
            new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true)
        }
       catch(all){}catch(Error err){}
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":true,"Member Name":/analyst/.toString(),"Member Image":false,"License Type":/Brightidea Administrator License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Ideabox/.toString())
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