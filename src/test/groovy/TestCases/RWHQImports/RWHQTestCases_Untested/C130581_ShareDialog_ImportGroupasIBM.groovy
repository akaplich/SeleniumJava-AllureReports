package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130581 - Share Dialog - Import Group as IBM
class C130581_ShareDialog_ImportGroupasIBM
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
        Action58123c20fa4ee77809f468f6("Username Email":/bi.adminuser1@brightidea.com/.toString(),"Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/2/.toString())
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
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Top/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Ideabox/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Admin in Community Setup
        new actions.SetupUsers.SetCommunityAdmininCommunitySetup().run("Field Name":/Idea Box Managers/.toString(),"Community Admin or Idea Box Manager":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Participants in Share Dialog
        new actions.ShareDialog.SetParticipantsinShareDialog().run("Import Group File":/ShareDialog.xls/.toString(),"Import Group Name":/shareddialogimportedgroup/.toString(),"Import Group Action":/Cancel/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/shareddialogimportedgroup (2 users)/.toString(),"Number of Matches":/0/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/All (12 users)/.toString(),"Number of Matches":/1/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true)
        //Set Participants in Share Dialog
        new actions.ShareDialog.SetParticipantsinShareDialog().run("Import Group File":/ShareDialog.xls/.toString(),"Import Group Name":/shareddialogimportedgroup/.toString(),"Import Group Action":/Import Group/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Group successfully imported./.toString(),"Should Exist":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/shareddialogimportedgroup (2 users)/.toString(),"Number of Matches":/1/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/All (12 users)/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/shareddialogimportedgroup (2 users)/.toString(),"Number of Matches":/1/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/All (13 users)/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/SubPipeline1/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup for Beta Beta tab
        new actions.SetupBeta.SetWebstormSetupforBetaBetatab().run("Share Dialog":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/SubPipeline1/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/shareddialogimportedgroup (2 users)/.toString(),"Number of Matches":/0/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Group/.toString(),"User or GroupName":/All (13 users)/.toString(),"Number of Matches":/1/.toString())
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