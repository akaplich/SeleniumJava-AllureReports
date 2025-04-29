import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131728 - Team submission Name - Team Submission with and without team name on Initiative Pages
class C131728_TeamsubmissionName_TeamSubmissionwithandwithoutteamnameonInitiativePages
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack Event title/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Idea Board
        new actions.SetupIdeas.SetWebstormSetuptoIdeaBoard().run("List View":true,"Steps View for End Users":true,"Stages":true,"Steps":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/WITHOUT TEAM NAME/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst,End User/.toString(),"Submitter Team User Add or Remove":/Add,Add/.toString(),"Description":/Idea Description/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/WITH TEAM NAME/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Team Submission Name":/Team name1/.toString(),"Description":/Idea Description/.toString(),"Category":/Theme 2/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/WITH TEAM NAME/.toString())
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("Submission Team Name":/team name1 edited/.toString(),"Action":/Update/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Tab":/Recent/.toString(),"View Type":/Gallery/.toString(),"Idea Name":/WITH TEAM NAME/.toString(),"Username":/team name1 edited/.toString(),"Description":/Idea Description/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Tab":/Recent/.toString(),"View Type":/Gallery/.toString(),"Idea Name":/WITHOUT TEAM NAME/.toString(),"Username":/Team - System Admin/.toString(),"Description":/Idea Description/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/2/.toString())
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/List/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Tab":/Recent/.toString(),"View Type":/List/.toString(),"Idea Name":/WITH TEAM NAME/.toString(),"Username":/team name1 edited/.toString(),"Description":/Idea Description/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Tab":/Recent/.toString(),"View Type":/List/.toString(),"Idea Name":/WITHOUT TEAM NAME/.toString(),"Username":/Team - System Admin/.toString(),"Description":/Idea Description/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/2/.toString())
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Steps/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."date" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Verify Submission Rollover in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifythesubmissionhoveronPipelineStepsViewforEndUsers().run("Idea Title":/WITHOUT TEAM NAME/.toString(),"Does it contain team name":true,"Idea Submitter":/Team - System Admin/.toString(),"Submitter Image":false,"Submitted":/${variables."date"}/.toString(),"Idea Status":/Submitted/.toString(),"Idea Category":/Theme 1/.toString(),"Idea Description":/Idea Description/.toString(),"Favorite":false,"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Steps/.toString())
        //Verify Submission Rollover in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifythesubmissionhoveronPipelineStepsViewforEndUsers().run("Idea Title":/WITH TEAM NAME/.toString(),"Does it contain team name":true,"Idea Submitter":/team name1 edited/.toString(),"Submitted":/${variables."date"}/.toString(),"Idea Description":/Idea Description/.toString(),"Favorite":false,"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/WITH TEAM NAME/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/WITH TEAM NAME/.toString(),"Does it have team submission name":true,"Submitted":/${variables."date"}/.toString(),"Submitter Name":/team name1 edited/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/WITHOUT TEAM NAME/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/WITHOUT TEAM NAME/.toString(),"Does it have team submission name":true,"Submitted":/${variables."date"}/.toString(),"Submitter Name":/Team - System Admin/.toString(),"Submitter Image":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submissions/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Projects/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Projects-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITH TEAM NAME","team name1 edited"],"Number of Matches":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Projects/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Projects-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITHOUT TEAM NAME","Team - System Admin"],"Number of Matches":/1/.toString())
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