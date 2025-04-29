import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130159 - Standard Licensing - Adding new System Admin with 0 available BA
class C130159_StandardLicensing_AddingnewSystemAdminwith0availableBA
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/0/.toString(),"Idea Box Manager License Type Purchased Count":/2/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        try{
            //Add User in People page
            new actions.People.AddUserinPeoplepage().run([:])
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Assign this user to the System Administrator role/.toString(),"Should Exist":true)
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Area":/People Pillar/.toString(),"Info Message":/There are no Brightidea Administrator Licenses available. Assigning a user to the System Administrator role requires granting the user a Brightidea Administrator License.Get more licenses/.toString(),"Info Message Exists":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        try{
            //Add User in People page
            new actions.People.AddUserinPeoplepage().run("Email Address":/brightC130159@mailinator.com/.toString(),"First Name":/Autouserfirst/.toString(),"Last Name":/Autouserlast/.toString(),"Screen Name":/Autouserscreen/.toString(),"Administrator":true,"Action":/Add User/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/brightC130159@mailinator.com/.toString(),"Name":/Autouserfirst Autouserlast/.toString(),"Screen Name":/Autouserscreen/.toString(),"Status":/Active/.toString(),"Administrative Roles":/<EMPTY>/.toString(),"Registration":/Not Registered/.toString(),"Job Title":/<EMPTY>/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString(),"Group":/<EMPTY>/.toString(),"Expertise":/<EMPTY>/.toString(),"Certification":/<EMPTY>/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"User":/Autouserfirst Autouserlast/.toString(),"Roles":/System Administrator/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightC130159/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString())
        try{
            //Navigate
            new actions.general.Navigate().run("Area to Navigate to":/Command Center/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Key Program Results/.toString(),"Should Exist":false)
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