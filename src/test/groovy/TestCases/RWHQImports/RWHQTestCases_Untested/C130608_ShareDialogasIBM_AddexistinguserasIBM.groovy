import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130608 - Share Dialog as IBM - Add existing user as IBM 
class C130608_ShareDialogasIBM_AddexistinguserasIBM
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/2/.toString(),"Idea Box Manager License Type Purchased Count":/3/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
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
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Ideabox/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/SubPipeline1/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Ideabox/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Admin in Community Setup
        new actions.SetupUsers.SetCommunityAdmininCommunitySetup().run("Field Name":/Idea Box Managers/.toString(),"Community Admin or Idea Box Manager":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC130608_test6/.toString(),"Finally Login as What User":/communityadmin@test.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Tab":/Managers/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to any Manager role for this Idea Box requires granting the user one of the following licenses:Idea Box Manager license (1 Available)Brightidea Administrator license (2 Available)Get more licenses/.toString(),"Info Message Exists":true,"Share Dialog":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Idea Box Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Field Name":/Invite Manager/.toString(),"User":/brightC130608_test6@mailinator.com/.toString(),"Users Add or Remove from Input Field":/Add/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Newly added users will receive an Invite Email to complete registration./.toString(),"Should Exist":false)
        //Verify License Type of Users in Share Dialog Fields
        new actions.ShareDialog.VerifyLicenseTypeofUsersinShareDialogFields().run("User":/Autofirst Autolast/.toString(),"Type of License":/Idea Box Manager/.toString(),"Number of Matches":/1/.toString())
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Send Invite":/Add Manager/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true,"Tab":/Managers/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to any Manager role for this Idea Box requires granting the user one of the following licenses:Idea Box Manager license (0 Available)Brightidea Administrator license (2 Available)Get more licenses/.toString(),"Info Message Exists":true,"Share Dialog":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Idea Box Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Autofirst Autolast/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Idea Box Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Autofirst Autolast/.toString(),"Participant Image":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Autofirst Autolast/.toString(),"Roles":/Idea Box Manager,Pipeline Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Member Name":/Autofirst Autolast/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Idea Box Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Autofirst Autolast/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Autofirst Autolast/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/SubPipeline1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC130608_test6@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Get Link from Invite Participant Email
        variables."link" = new actions.Mailinator.GetLinkfromInviteParticipantEmail().run("Inbox Email Count":/1/.toString(),"Email Address":/brightC130608_test6/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Ideabox/.toString(),"Is it Idea Box?":true)
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true)
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