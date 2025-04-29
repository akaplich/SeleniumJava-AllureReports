package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130304 - People Pillar Updates - Deactivate User
class C130304_PeoplePillarUpdates_DeactivateUser
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
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/pipelineadmin@test.com/.toString())
        //Set User Menu in People Pillar
        new actions.People.SetUserMenuInPeoplePillar().run("Menu Option":/Deactivate User/.toString(),"Enable Checkbox":true,"Action":/Cancel/.toString())
        //Verify User Profile on People Pillar Page
        new actions.People.VerifyUserProfileonPeoplePillarPage().run("Member Image":false,"Screen Name":/Pipeline Admin/.toString(),"Email":/pipelineadmin@test.com/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/pipelineadmin@test.com/.toString(),"Screen Name":/Pipeline Admin/.toString(),"Status":/Active/.toString(),"Number of Matches":/1/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/pipelineadmin@test.com/.toString())
        //Set User Menu in People Pillar
        new actions.People.SetUserMenuInPeoplePillar().run("Menu Option":/Deactivate User/.toString(),"Enable Checkbox":true,"Action":/Close/.toString())
        //Verify User Profile on People Pillar Page
        new actions.People.VerifyUserProfileonPeoplePillarPage().run("Member Image":false,"Screen Name":/Pipeline Admin/.toString(),"Email":/pipelineadmin@test.com/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/pipelineadmin@test.com/.toString(),"Screen Name":/Pipeline Admin/.toString(),"Status":/Active/.toString(),"Number of Matches":/1/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/pipelineadmin@test.com/.toString())
        //Set User Menu in People Pillar
        new actions.People.SetUserMenuInPeoplePillar().run("Menu Option":/Deactivate User/.toString(),"Enable Checkbox":true)
        //Verify Message on People Pillar User Menu Modal
        new actions.People.VerifyMessageonPeoplePillarUserMenuModal().run("Message":/This will deactivate this user's account. Once deactivated, they will no longer be able to log in to this system. All associated data including submissions, comments, votes, and action item results will remain. I understand Pipeline Admin will be deactivated./.toString())
        //Set User Menu in People Pillar
        new actions.People.SetUserMenuInPeoplePillar().run("Action":/Deactivate User/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User was successfully deactivated./.toString(),"Should Exist":true)
        //Verify User Profile on People Pillar Page
        new actions.People.VerifyUserProfileonPeoplePillarPage().run("Member Image":false,"Screen Name":/Pipeline Admin/.toString(),"Email":/pipelineadmin@test.com/.toString(),"Deactivated By Admin":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/pipelineadmin@test.com/.toString(),"Screen Name":/Pipeline Admin/.toString(),"Status":/Deactivated/.toString(),"Number of Matches":/1/.toString())
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