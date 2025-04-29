package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130735 - IBM Updates - Adding new IBM
class C130735_IBMUpdates_AddingnewIBM
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/10/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Managers":/Community Admin/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Idea Box Managers":/brightnewuserC130735_1@mailinator.com/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Click Save":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Edit Invite Email/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Newly added users will receive an Invite Email to complete registration./.toString(),"Should Exist":true)
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Click Save":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning Users to Licensed RolesAssigning a user to either the Idea Box Manager, Pipeline Manager or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Idea Box Manager license (7 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Invite Participant Email
        variables."link" = new actions.Mailinator.GetLinkfromInviteParticipantEmail().run("Inbox Email Count":/2/.toString(),"Email Address":/brightnewuserC130735_1/.toString(),"Subject of New Administrator Added Email":/assigned as a Idea Box Manager for Ideabox/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString(),"Link Number In Case Of Multiple URL":/1/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/FirstName/.toString(),"Last Name":/LastName/.toString(),"Screen Name":/Auto/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString(),"Link Number In Case Of Multiple URL":/0/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Ideabox/.toString(),"Is it Idea Box?":true)
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true,"Tab":/Managers/.toString(),"Done":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/SubPipeline1/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Click Save":false)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/FirstName LastName/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Community Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Idea Box Managers/.toString(),"Should Exist":false)
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