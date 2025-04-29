import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130123 - Standard Licensing - Add Pipeline Moderator Email
class C130123_StandardLicensing_AddPipelineModeratorEmail
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/2/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC130122ExistingMod_test3/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Pipeline/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Moderators":/brightC130122ExistingMod_test3@mailinator.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Click Save":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Edit Invite Email/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Newly added users will receive an Invite Email to complete registration./.toString(),"Should Exist":false)
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Click Save":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Invite Participant Email
        variables."link" = new actions.Mailinator.GetLinkfromInviteParticipantEmail().run("Email Address":/brightC130122ExistingMod_test3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/brightC130122ExistingMod_test3@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom Pipeline/.toString(),"Initiative Description":/desc/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Moderators":/brightC130122NewMod_test4@mailinator.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Click Save":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Newly added users will receive an Invite Email to complete registration./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Edit Invite Email/.toString(),"Should Exist":true)
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":false,"Click Save":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Invite Participant Email
        variables."link" = new actions.Mailinator.GetLinkfromInviteParticipantEmail().run("Inbox Email Count":/2/.toString(),"Email Address":/brightC130122NewMod_test4/.toString(),"Subject of New Administrator Added Email":/been assigned as a Pipeline Moderator/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString(),"Link Number In Case Of Multiple URL":/1/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/FirstName/.toString(),"Last Name":/LastName/.toString(),"Screen Name":/Auto/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Pipeline/.toString(),"Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString(),"Link Number In Case Of Multiple URL":/0/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/brightC130122NewMod_test4@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom Pipeline/.toString(),"Initiative Description":/desc/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/FirstName LastName/.toString(),"Roles":/Pipeline Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":false,"User":/Autofirst Autolast/.toString(),"Roles":/Pipeline Moderator/.toString(),"Number of Matches":/1/.toString())
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