import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131727 - Team submission Name - Individual Submission with and without team name on NGA pages
class C131727_TeamsubmissionName_IndividualSubmissionwithandwithoutteamnameonNGApages
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Labs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Incubate/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Incubate Process title/.toString(),"Description":/Incubate Process description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Idea Board
        new actions.SetupIdeas.SetWebstormSetuptoIdeaBoard().run("List View":true,"Steps View for End Users":true,"Stages":true,"Steps":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup Ideas Team Configuration
        new actions.SetupIdeas.SetSiteSetupIdeasTeamConfiguration().run("Section":/Team Building/.toString(),"Multiple Submitters":true,"Team name capabilities":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/WITHOUT TEAM NAME/.toString(),"Description":/Idea Description/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/WITH TEAM NAME/.toString(),"Description":/Idea Description/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/WITH TEAM NAME/.toString())
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("Submission Team Name":/AVENGERS ASSEMBLE!/.toString(),"Action":/Update/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/WITH TEAM NAME/.toString(),"Submitter":/System Admin/.toString(),"Submission Team":"","Submission Team Name":/AVENGERS ASSEMBLE!/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/WITHOUT TEAM NAME/.toString(),"Submitter":/System Admin/.toString(),"Submission Team":"","Submission Team Name":"","Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Innovations/.toString())
        //Search Innovation List
        new actions.NGAInnovationList.SearchInnovationList().run("Search Field":/team name/.toString())
        //Verify Idea in Innovations Pillar
        new actions.NGAInnovationList.VerifyIdeainInnovationsPillar().run("Title":/WITHOUT TEAM NAME/.toString(),"Team Name":"","Submitter":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea Hover in Innovations List
        new actions.NGAInnovationList.VerifyIdeaHoverinInnovationsList().run("Idea":/WITHOUT TEAM NAME/.toString(),"Idea Name in the Hover":/WITHOUT TEAM NAME/.toString(),"Submitter Name":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Innovations Pillar
        new actions.NGAInnovationList.VerifyIdeainInnovationsPillar().run("Title":/WITH TEAM NAME/.toString(),"Team Name":/AVENGERS ASSEMBLE!/.toString(),"Submitter":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea Hover in Innovations List
        new actions.NGAInnovationList.VerifyIdeaHoverinInnovationsList().run("Idea":/WITH TEAM NAME/.toString(),"Idea Name in the Hover":/WITH TEAM NAME/.toString(),"Submitter Name":/AVENGERS ASSEMBLE!/.toString(),"Number of Matches":/1/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131725_1/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC131725_1@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Innovations/.toString())
        //Export Ideas from Innovations List/Export from People
        new actions.NGAInnovationList.ExportIdeasfromInnovationsList().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightC131725_1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITH TEAM NAME","AVENGERS ASSEMBLE!"],"Number of Matches":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITHOUT TEAM NAME","N/A","N/A"],"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate Process title/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Incubate*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITH TEAM NAME","AVENGERS ASSEMBLE!"],"Number of Matches":/1/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Incubate*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["WITHOUT TEAM NAME","N/A","N/A"],"Number of Matches":/1/.toString())
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