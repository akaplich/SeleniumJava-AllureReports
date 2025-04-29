import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129821 - Voting Updates - Voting on Closed Initiative
class C129821_VotingUpdates_VotingonClosedInitiative
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Delete this action after Voting UI Toggle is Enabled in Fall Release
        Action5f332530c0c25150132f3617([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/New Solve/.toString(),"Challenge Brief":/desc/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Date":/${variables."todaysDate"}/.toString(),"Launch Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/6:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MMM d/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Active/.toString(),"Active Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Initiative Active Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Submission Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Voting Start and End Date":/ ${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Voting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Commenting Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Navigate":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Demote Voting Checkbox":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Solve App Post Idea
        new actions.PostIdea.SetSolveAppPostIdea().run("Title":/test idea1 in solve challenge/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description":/Idea Description/.toString(),"Attachments File":/Image4.jpg/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tags":/testtag1/.toString(),"Tags Add or Remove":/Add/.toString(),"Please describe how this solution addresses the problem.":/this is for testing purpose/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1 in solve challenge/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Set Voting on VI3
        new actions.ViewIdea30.SetVotingonViewIdea3().run("Promote or Demote":/Promote/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Idea Name":/test idea1 in solve challenge/.toString(),"Vote Count":/2/.toString(),"Stats Votes":/2/.toString(),"Stats Rank":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Closed/.toString(),"Enable Voting":false,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1 in solve challenge/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Set Voting on VI3
        new actions.ViewIdea30.SetVotingonViewIdea3().run("Promote or Demote":/Demote/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Idea Name":/test idea1 in solve challenge/.toString(),"Vote Count":/2/.toString(),"Stats Votes":/2/.toString(),"Stats Rank":/1/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

    }
    //Delete this action after Voting UI Toggle is Enabled in Fall Release
    public static def Action5f332530c0c25150132f3617(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("New Voting Buttons":true)

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