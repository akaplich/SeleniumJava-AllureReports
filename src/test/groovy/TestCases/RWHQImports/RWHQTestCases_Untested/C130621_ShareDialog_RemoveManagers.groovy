package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130621 - Share Dialog - Remove Managers
class C130621_ShareDialog_RemoveManagers
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
        Action58123c20fa4ee77809f468f6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/this is Test App/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Legacy/.toString(),"Navigate to Tab":true,"Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup for Beta Beta tab
        new actions.SetupBeta.SetWebstormSetupforBetaBetatab().run("Share Dialog":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Tab":/Administrators/.toString())
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Field Name":/Invite Administrator/.toString(),"User":/Evaluator,Community Admin/.toString(),"Users Add or Remove from Input Field":/Add,Add/.toString(),"Send Invite":/Add Administrator/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Tab":/Administrators/.toString())
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Managers to Remove":/Evaluator,System Admin/.toString(),"Managers to Remove Role":/Community Administrator,Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Community Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Evaluator/.toString(),"Participant Image":false,"Number of Matches":/0/.toString(),"Type of User":/Community Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Evaluator/.toString(),"Participant Image":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Number of Matches":/0/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Tab":/Administrators/.toString())
        try{
            //Set Managers in Share Dialog
            new actions.ShareDialog.SetManagersinShareDialog().run("Managers to Remove":/Community Admin/.toString(),"Managers to Remove Role":/Community Administrator/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Managers to Remove":/Evaluator/.toString(),"Managers to Remove Role":/Pipeline Administrator/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":true,"Number of Matches":/0/.toString(),"Type of User":/Community Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Community Admin/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Evaluator/.toString(),"Participant Image":false,"Number of Matches":/0/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Administrator/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/User/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Number of Matches":/0/.toString(),"Type of User":/Pipeline Administrator/.toString())
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