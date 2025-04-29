import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C118892 - Sorting of Pre-Launched and Launched Initiatives in Activities tab
class C118892_SortingofPre_LaunchedandLaunchedInitiativesinActivitiestab
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
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Solve challenge title/.toString(),"Challenge Brief":/Solve challenge description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User 2/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Date":/11\/28\/2025/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/12\/12\/2025/.toString(),"End Time":/9:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Launch Message":/11\/28\/2025/.toString(),"Challenge Update":/11\/28\/2025/.toString(),"Challenge Last Day":/12\/12\/2025/.toString(),"Challenge End":/12\/12\/2025/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Pitch/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Pitch event title/.toString(),"Challenge Brief":/Pitch event description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User 2/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Date":/11\/27\/2025/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/12\/12\/2025/.toString(),"End Time":/9:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Accelerate/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Accelerate title/.toString(),"Description":/Accelerate description/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack Event title/.toString(),"Description":/Hack Event description/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Activities":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch event title/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack Event title/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Activities/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Solve challenge title/.toString(),"Pre-Launch":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Custom App/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Pitch event title/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Hack Event title/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Accelerate title/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Filter or Sort Activities in User Homepage
        new actions.Enterprise.UserHomepage.FilterorSortActivitiesinUserHomepage().run("Sort by":/Launch Date/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Solve challenge title/.toString(),"Pre-Launch":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Pitch event title/.toString(),"Pre-Launch":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Hack Event title/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Custom App/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Accelerate title/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Filter or Sort Activities in User Homepage
        new actions.Enterprise.UserHomepage.FilterorSortActivitiesinUserHomepage().run("Sort by":/Title/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Solve challenge title/.toString(),"Pre-Launch":true,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Pitch event title/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Hack Event title/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Custom App/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyActivityinUserHomepage().run("Active or Closed":/Active/.toString(),"Total Number of Activities on the page":/5/.toString(),"Activity Name":/Accelerate title/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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