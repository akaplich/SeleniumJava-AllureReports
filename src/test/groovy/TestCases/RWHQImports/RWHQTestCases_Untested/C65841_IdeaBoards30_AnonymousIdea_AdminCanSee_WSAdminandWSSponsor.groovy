import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C65841 - Idea Boards 30 - Anonymous Idea - Admin Can See - WS Admin and WS Sponsor
class C65841_IdeaBoards30_AnonymousIdea_AdminCanSee_WSAdminandWSSponsor
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Users Administrators page
        new actions.SetupUsers.SetWebstormSetupUsersAdministratorspage().run("WebStorm Sponsor":/pipelinesponsor@mailinator.com/.toString(),"WebStorm Administrators":/pipelineadmin@test.com/.toString(),"WebStorm Administrators Add or Remove":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Anonymous Idea/.toString(),"Submitter":/Anonymous/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/required/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous: End User/.toString(),"Number of Matches":/1/.toString())
        //Set User Flyover in Idea Board page
        new actions.IdeaBoard.SetUserFlyoverinIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous: End User/.toString(),"Action":/Follow/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/My Activity/.toString())
        //Verify People I am Following in my Activity page
        new actions.MyActivity.VerifyPeopleIamFollowinginmyActivitypage().run("People":/End User/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set User Flyover in Idea Board page
        new actions.IdeaBoard.SetUserFlyoverinIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous: End User/.toString(),"Action":/Profile/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Profile/.toString())
        //Verify and Access Submissions in My Activity page
        new actions.MyActivity.VerifySubmissionsinMyActivitypage().run("Value Type to Verify":/POSTED IDEAS/.toString(),"Idea Name":/Anonymous Idea/.toString(),"Number of Matches":/0/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Submissions/.toString())
        //Set User Flyover in Idea Board page
        new actions.IdeaBoard.SetUserFlyoverinIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous: End User/.toString(),"Action":/Message/.toString())
        //Set Message in Message Pop Up On Idea Boards
        new actions.general.SetMessageInMessagePopUpOnIdeaBoards().run("Subject":/Test Email/.toString(),"Message Body":/This is a test email to check the functionality/.toString(),"Action":/Submit/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close Current Window
        new actions.selenium.CloseWindow().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/pipelinesponsor@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        try{
            //Verify Idea in Idea Board page
            new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set User Flyover in Idea Board page
            new actions.IdeaBoard.SetUserFlyoverinIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous/.toString(),"Action":/Profile/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Switch to Browser Window
            new actions.selenium.SwitchWindow().run("Window Name":/Profile/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Anonymous Idea/.toString(),"Username":/Anonymous/.toString(),"Number of Matches":/1/.toString())
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