import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131125 - WB License - Upgrade WB license to IBM license
class C131125_WBLicense_UpgradeWBlicensetoIBMlicense
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/3/.toString())
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Tab":/Managers/.toString())
        try{
            //Set Managers in Share Dialog
            new actions.ShareDialog.SetManagersinShareDialog().run("Type of Manager":/Idea Box Manager/.toString(),"Field Name":/Invite Manager/.toString(),"User":/analyst@test.com/.toString(),"Users Add or Remove from Input Field":/Add/.toString(),"Send Invite":/Add Manager/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Grant Brightidea Administrator License Or Upgrade User License Modal
        new actions.PipelineSetup.VerifyGrantBrightideaAdministratorLicense().run("Info Message":/analyst ’s license will be upgraded from a Whiteboard license to a Idea Box Manager license, with this change they will have access to create unlimited Whiteboards, as well as access to the additional permissions allocated by the license type.analyst ’s Whiteboard license will become available to be granted to another user./.toString(),"Action":/OK/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to any Manager role for this Idea Box requires granting the user one of the following licenses:Idea Box Manager license (2 Available)Get more licenses/.toString(),"Info Message Exists":true,"Share Dialog":true)
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Send Invite":/Add Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/analyst/.toString(),"Participant Image":false,"Number of Matches":/1/.toString(),"Type of User":/Idea Box Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/analyst/.toString(),"Participant Image":false,"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
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
        new actions.People.VerifyWhiteboardLicensesinUse().run("Expand License Breakdown":false,"Licenses in Use":/Pipeline Admin/.toString(),"Number of Whiteboards":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Users Under Admins with Unlimited 
        new actions.People.VerifyUsersUnderAdminswithUnlimited().run("Expand License Breakdown":false,"User Name":/analyst/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/Available/.toString(),"Metric Value":/2/.toString(),"Number of Matches":/1/.toString())
        try{
            //Verify Licenses User in People Pillar Licenses tab
            new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true)
        }
       catch(all){}catch(Error err){}
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":true,"Member Name":/analyst/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Idea Box Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/analyst/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Ideabox/.toString())
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