import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C39870 - Solve Homepage Redesign - Visual Participant Widget
class C39870_SolveHomepageRedesign_VisualParticipantWidget
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
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Solve challenge title/.toString(),"Challenge Brief":/Solve challenge description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User,End User 2/.toString(),"General Access Add or Remove":/Add,Add/.toString(),"Early Access":/End User,End User 2/.toString(),"Early Access Add or Remove":/Add,Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify Visual Participant Widget on Homepage
        new actions.Webstorm.VerifyVisualParticipantWidgetonHomepage().run("Topic Views":/1/.toString(),"Submitted Solutions":/0/.toString(),"Users":/EMPTY/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/Expertise2/.toString(),"Add or Remove Expertise":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Visual Participant Widget on Homepage
        new actions.Webstorm.VerifyVisualParticipantWidgetonHomepage().run("Topic Views":/1/.toString(),"Submitted Solutions":/0/.toString(),"Users":/System Admin/.toString(),"Users engaged with the challenge":/System Admin/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/New Idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/New Idea1/.toString())
        //Set Vote in View Idea page
        new actions.ViewIdea.SetVoteinViewIdeapage().run("Vote":/Up/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Visual Participant Widget on Homepage
        new actions.Webstorm.VerifyVisualParticipantWidgetonHomepage().run("Topic Views":/1/.toString(),"Submitted Solutions":/0/.toString(),"Users":/System Admin,Pipeline Admin/.toString(),"Users engaged with the challenge":/System Admin,Pipeline Admin/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelinesponsor@test.com/.toString(),"Password":/password3/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/Expertise2/.toString(),"Add or Remove Expertise":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Visual Participant Widget on Homepage
        new actions.Webstorm.VerifyVisualParticipantWidgetonHomepage().run("Topic Views":/1/.toString(),"Submitted Solutions":/0/.toString(),"Users":/System Admin,Pipeline Admin,End User/.toString(),"Users engaged with the challenge":/System Admin,Pipeline Admin,1 more,End User/.toString(),"Additional Count of Users engaged with the Challenge":/1/.toString())
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