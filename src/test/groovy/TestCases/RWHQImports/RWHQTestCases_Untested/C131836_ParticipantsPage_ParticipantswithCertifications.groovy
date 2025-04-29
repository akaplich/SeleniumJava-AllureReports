import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131836 - Participants Page > Participants with Certifications
class C131836_ParticipantsPage_ParticipantswithCertifications
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/bi.enduser1@brightidea.com/.toString())
        //Add Certifications to a User
        new actions.People.AddCertificationstoaUser().run("Certifications":/Business Model Canvas,Lean Startup,Disruptive Innovation/.toString(),"Add or Remove":/Add,Add,Add/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/bi.enduser2@brightidea.com/.toString())
        //Add Certifications to a User
        new actions.People.AddCertificationstoaUser().run("Certifications":/Business Model Canvas/.toString(),"Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/bi.adminuser1@brightidea.com/.toString())
        //Add Certifications to a User
        new actions.People.AddCertificationstoaUser().run("Certifications":/Business Model Canvas,Lean Startup,Business Model Canvas/.toString(),"Add or Remove":/Add,Add,Remove/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/team submission/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst,End User,End User 2/.toString(),"Submitter Team User Add or Remove":/Add,Add,Add/.toString(),"Description":/test/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/analyst/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/No Expertise/.toString(),"Certifications Count":/0/.toString(),"Ceritifications":/EMPTY/.toString(),"Projects":/team submission/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/No Expertise/.toString(),"Certifications Count":/3/.toString(),"Ceritifications":/Business Model Canvas, Lean Startup, Disruptive Innovation/.toString(),"Projects":/team submission/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User 2/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/No Expertise/.toString(),"Certifications Count":/1/.toString(),"Ceritifications":/Business Model Canvas/.toString(),"Projects":/team submission/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/System Admin/.toString(),"Participant is the current user":true,"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/No Expertise/.toString(),"Certifications Count":/1/.toString(),"Ceritifications":/Lean Startup/.toString(),"Projects":/team submission/.toString(),"Number of Matches":/1/.toString())
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