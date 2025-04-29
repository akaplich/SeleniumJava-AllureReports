package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130604 - Share Dialog as PM - Add a new User as PM
class C130604_ShareDialogasPM_AddanewUserasPM
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/4/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Ideabox?share=true/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Tab":/Managers/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/View license details/.toString(),"Should Exist":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Field Name":/Invite Manager/.toString(),"User":/brightuserc130604@mailinator.com/.toString(),"Users Add or Remove from Input Field":/Add/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Newly added users will receive an Invite Email to complete registration./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Edit Invite Email/.toString(),"Should Exist":false)
        //Verify License Type of Users in Share Dialog Fields
        new actions.ShareDialog.VerifyLicenseTypeofUsersinShareDialogFields().run("User":/brightuserc130604@mailinator.com/.toString(),"Type of License":/Idea Box Manager/.toString(),"Number of Matches":/1/.toString())
        //Set Managers in Share Dialog
        new actions.ShareDialog.SetManagersinShareDialog().run("Send Invite":/Add Manager/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/brightuserc130604@mailinator.com/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true,"Tab":/Managers/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/System Admin/.toString(),"Participant Image":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/Pipeline Admin/.toString(),"Participant Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Verify Participant or Group or Managers in the Share Dialog
        new actions.ShareDialog.VerifyParticipantorGroupinParticipantsTab().run("User or Group":/Participant/.toString(),"User or GroupName":/brightuserc130604@mailinator.com/.toString(),"Participant Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Type of User":/Pipeline Manager/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Done":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Invite Participant Email
        variables."link" = new actions.Mailinator.GetLinkfromInviteParticipantEmail().run("Inbox Email Count":/2/.toString(),"Email Address":/brightuserc130604/.toString(),"Subject of New Administrator Added Email":/assigned as a Pipeline Manager for Ideabox/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString(),"Link Number In Case Of Multiple URL":/1/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/FirstName/.toString(),"Last Name":/LastName/.toString(),"Screen Name":/Auto/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString(),"Link Number In Case Of Multiple URL":/0/.toString())
        //Set Share Dialog
        new actions.ShareDialog.SetShareDialog().run("Access Share Dialog":true,"Tab":/Managers/.toString())
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