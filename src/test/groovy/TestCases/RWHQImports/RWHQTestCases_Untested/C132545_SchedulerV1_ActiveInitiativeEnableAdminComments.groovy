import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132545 - Scheduler V1 - Active Initiative Enable Admin Comments
class C132545_SchedulerV1_ActiveInitiativeEnableAdminComments
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
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."updateDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/22/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."lastDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/44/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/45/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Solve/.toString(),"Challenge Brief":/Solve Desc/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Date":/${variables."todaysDate"}/.toString(),"Launch Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/4:00 AM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Launch Message":/${variables."todaysDate"}/.toString(),"Challenge Update":/${variables."updateDate"}/.toString(),"Challenge Last Day":/${variables."lastDate"}/.toString(),"Challenge End":/${variables."endDate"}/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."lastDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/44/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/45/.toString(),"Format":/MMM d/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":true,"Status":/Active/.toString(),"Active Start End Dates":/Active ${variables."todaysDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Initiative Active Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Initiative Active Tooltip End":/End: ${variables."endDateInNewFormat"}, 04 AM/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea One/.toString(),"Action":/Submit/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Rate Potential Solutions/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Comments Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasCommentsTab().run("Allow admins and evaluators to always comment":true,"Action":/Save Changes/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/system admin comment/.toString(),"Post Comment":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/system admin comment/.toString(),"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/evaluator comment/.toString(),"Post Comment":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/evaluator comment/.toString(),"User":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/end user comment/.toString(),"Post Comment":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/end user comment/.toString(),"User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
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