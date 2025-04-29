import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131731 - Team submission Name - Team Submission with and without team name on NGA pages
class C131731_TeamsubmissionName_TeamSubmissionwithandwithoutteamnameonNGApages
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
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Labs/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Apply/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Apply title/.toString(),"Challenge Brief":/Apply challenge description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Date":/12\/12\/2018/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/11\/09\/2019/.toString(),"End Time":/9:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Single Scale Field":/RATE IDEAS/.toString(),"Single Scale Field Assignee":/Evaluator/.toString(),"Single Scale Assignee Add or Remove":/Add/.toString(),"Scorecard Field":/EVALUATE IDEAS/.toString(),"Scorecard Field Assignee":/Pipeline Sponsor/.toString(),"Scorecard Field Assignee Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Idea Board
        new actions.SetupIdeas.SetWebstormSetuptoIdeaBoard().run("List View":true,"Steps View for End Users":true,"Stages":true,"Steps":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/WITHOUT TEAM NAME/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst,End User/.toString(),"Submitter Team User Add or Remove":/Add,Add/.toString(),"Description":/Idea Description/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/WITH TEAM NAME/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Team Submission Name":/Team name1/.toString(),"Description":/Idea Description/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply title/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/WITH TEAM NAME/.toString(),"Submitter":/System Admin/.toString(),"Submission Team":/analyst/.toString(),"Submission Team Name":/Team name1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/WITHOUT TEAM NAME/.toString(),"Submitter":/System Admin/.toString(),"Submission Team Name":/Team - System Admin/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Innovations/.toString())
        //Search Innovation List
        new actions.NGAInnovationList.SearchInnovationList().run("Search Field":/team name/.toString())
        //Verify Idea in Innovations Pillar
        new actions.NGAInnovationList.VerifyIdeainInnovationsPillar().run("Title":/WITHOUT TEAM NAME/.toString(),"Submitter":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea Hover in Innovations List
        new actions.NGAInnovationList.VerifyIdeaHoverinInnovationsList().run("Idea":/WITHOUT TEAM NAME/.toString(),"Idea Name in the Hover":/WITHOUT TEAM NAME/.toString(),"Submitter Name":/Team - System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Innovations Pillar
        new actions.NGAInnovationList.VerifyIdeainInnovationsPillar().run("Title":/WITH TEAM NAME/.toString(),"Team Name":/Team name1/.toString(),"Submitter":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea Hover in Innovations List
        new actions.NGAInnovationList.VerifyIdeaHoverinInnovationsList().run("Idea":/WITH TEAM NAME/.toString(),"Idea Name in the Hover":/WITH TEAM NAME/.toString(),"Submitter Name":/Team name1/.toString(),"Number of Matches":/1/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131731/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC131731@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Innovations/.toString())
        //Export Ideas from Innovations List/Export from People
        new actions.NGAInnovationList.ExportIdeasfromInnovationsList().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightC131731/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITH TEAM NAME","Team name1"],"Number of Matches":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITHOUT TEAM NAME","Team - System Admin"],"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply title/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Apply*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITH TEAM NAME","Team name1"],"Number of Matches":/1/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Apply*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITHOUT TEAM NAME","Team - System Admin"],"Number of Matches":/1/.toString())
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