import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129525 - Move Ideas - Notify Submitters ON - Idea Moved Email (Team Submitter)
class C129525_MoveIdeas_NotifySubmittersON_IdeaMovedEmail(TeamSubmitter)
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/annabrightidea1@yahoo.com/.toString(),"First Name":/Email/.toString(),"Last Name":/Test User/.toString(),"Screen Name":/Email Test User/.toString(),"Action":/Add User/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Ideas for Team Building tab
        new actions.SetupIdeas.SetSiteSetupIdeasforTeamBuildingtab().run("Multiple Submitters":true)
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC129525team_9/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC129525_9/.toString(),"Finally Login as What User":/brightC129525_9@mailinator.com/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC129525_9@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/First/.toString(),"Last Name":/Last/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/Autofirst,Email Test User/.toString(),"Submitter Team User Add or Remove":/Add,Add/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Set Submitter in View Idea Page
        new actions.ViewIdea.SetSubmitterinViewIdeaPage().run("User":/Email Test User/.toString(),"Add or Remove or Set Owner":/Remove/.toString(),"Action":/Save/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Custom App/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Notify submitter(s)":true,"Action":/Move Idea/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC129525_9/.toString(),"Subject":/Pipeline A: Idea Submission Confirmation/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC129525_9/.toString(),"Subject":/Pipeline A: Idea was moved/.toString(),"From":/Brightidea/.toString(),"Full From":/Brightidea <noreply@brightidea.com>/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC129525team_9/.toString(),"Subject":/Pipeline A: Idea Submission Confirmation/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC129525team_9/.toString(),"Subject":/Pipeline A: Idea was moved/.toString(),"From":/Brightidea/.toString(),"Full From":/Brightidea <noreply@brightidea.com>/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Verify Email Not Mailinator
        new actions.Email.VerifyEmailNotMailinator().run("Sender Host":/imap.mail.yahoo.com/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Password":/coothhthkgxqqztx/.toString(),"Email Subject to Look For":/Pipeline A: Idea was moved/.toString(),"Email Should Exist":false,"Folder":/INBOX/.toString())
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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