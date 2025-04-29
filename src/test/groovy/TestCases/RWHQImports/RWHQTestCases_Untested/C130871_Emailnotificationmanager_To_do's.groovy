package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130871 - Email notification manager - To-do's
class C130871_Emailnotificationmanager_To_do's
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC130871/.toString(),"Enterprise System Administrator":false,"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Team Workspace Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Tasks Tab":true,"Team Workspace Email Notifications":true,"Added Team Members":false,"To-Dos":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Workspace Team
        new actions.ViewIdea.TeamWorkspace.SetWorkspaceTeam().run("User":/Auto/.toString(),"Add or Remove or Set Leader":/Add/.toString(),"Action":/Update/.toString())
        //Set Todos In Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetTasksInTeamWorkspace().run("Add or Edit":/Add/.toString(),"Todo":/random/.toString(),"Assignee":/Autofirst Autolast/.toString(),"Row Number":/1/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130871/.toString(),"Subject":/You've been assigned a new To-do for test idea1/.toString(),"Email Should Be Received":false)
        //Set Todos In Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetTasksInTeamWorkspace().run("Add or Edit":/Edit/.toString(),"Mark Complete or Mark Incomplete":/Mark Complete/.toString(),"Row Number":/1/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130871/.toString(),"Subject":/You've been assigned a new To-do for test idea1/.toString(),"Email Should Be Received":false)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130871/.toString(),"Subject":/To-do random/.toString(),"Email Should Be Received":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC130871@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/You've been invited to collaborate on test idea1!/.toString(),"Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Access Notification from Global Navigation
        new actions.Notifications.AccessNotificationfromGlobalNavigation().run("Notification Message":/completed the To-do random/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Workspace/.toString(),"Should Exist":true)
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