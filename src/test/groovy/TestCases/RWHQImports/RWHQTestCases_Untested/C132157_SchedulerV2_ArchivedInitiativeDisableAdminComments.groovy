import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132157 - Scheduler V2 - Archived Initiative Disable Admin Comments
class C132157_SchedulerV2_ArchivedInitiativeDisableAdminComments
{
//    private static def variables = [:]
//
//    @BeforeSuite
//    public void beforeState(){
//        variables."URL" = /https:\/\/test.brightideatest.com/
//        variables."Browser" = /Chrome/
//        variables."TestRail_RunName" = null
//        variables."TestRail_ExecutionName" = null
//        variables."CodeEnvironment" = /Default/
//        variables."Database" = null
//    }
//    @Test
//    public void testcase(){
//        //Basestate
//        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
//        //Delete this when Scheduler feature is enabled for everyone
//        Action66ec7933e12425a91ee5d983([:])
//        //Navigate
//        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
//        //Apply Filter on Apps Pillar 2.0
//        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
//        //Create App Webstorm
//        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Optimize/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Optimize for Archived/.toString(),"Description":/Optimize description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize for Archived/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
//        //Quick Add an Idea in Pipeline Steps page
//        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea One in Archived/.toString(),"Action":/Submit/.toString())
//        //Configure Single Scale Step in Pipeline Steps page
//        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Rate Potential Improvements/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize for Archived/.toString(),"Area to Navigate to":/Setup/.toString())
//        //Return Date in Requested Format
//        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MM\/dd\/yyyy/.toString())
//        //Return Date in Requested Format
//        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/77/.toString(),"Format":/MM\/dd\/yyyy/.toString())
//        //Return Date in Requested Format
//        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MMM d/.toString())
//        //Return Date in Requested Format
//        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/77/.toString(),"Format":/MMM d/.toString())
//        //Verify Scheduler in Setup (V2 & V3)
//        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Prelaunch End Date":/${variables."startDate"}/.toString(),"Prelaunch Tooltip":/Start: Jan 1, 12 AMEnd: ${variables."startDateInNewFormat"}, 08 AM/.toString(),"Navigate":true)
//        //Set Disable Scheduler
//        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Archived/.toString(),"Action":/Disable Schedule/.toString())
//        //Refresh
//        new actions.selenium.Refresh().run([:])
//        //Verify Message
//        new actions.general.VerifyMessage().run("Message Text":/*Note - This is an archived WS./.toString(),"Should Exist":true)
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize for Archived/.toString(),"Area to Navigate to":/Idea Board/.toString())
//        //Verify Voting/Comments/Favorites Icon on Idea Card in Idea Boards 30
//        new actions.IdeaBoard.VerifyVotingCommentsIconIdeaCardIdeaBoards30().run("Simple Voting":false,"Comments":false)
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize for Archived/.toString(),"Area to Navigate to":/Idea Board/.toString())
//        //Verify Voting/Comments/Favorites Icon on Idea Card in Idea Boards 30
//        new actions.IdeaBoard.VerifyVotingCommentsIconIdeaCardIdeaBoards30().run("Simple Voting":false,"Comments":false)
//        //Access Idea in Idea Board page
//        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One in Archived/.toString())
//        //Access or Close Idea from View Idea 3 Modal
//        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
//        //Verify Comment On Off in View Idea
//        new actions.ViewIdeaComment.VerifyCommentOnOffinViewIdea().run("Should Comment Field Exist":false,"Number of Matches":/1/.toString())
//        //Log Out
//        new actions.general.LogOut().run([:])
//        //Login
//        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize for Archived/.toString(),"Area to Navigate to":/Idea Board/.toString())
//        //Verify Voting/Comments/Favorites Icon on Idea Card in Idea Boards 30
//        new actions.IdeaBoard.VerifyVotingCommentsIconIdeaCardIdeaBoards30().run("Simple Voting":false,"Comments":false)
//        //Access Idea in Idea Board page
//        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One in Archived/.toString())
//        //Access or Close Idea from View Idea 3 Modal
//        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
//        //Verify Comment On Off in View Idea
//        new actions.ViewIdeaComment.VerifyCommentOnOffinViewIdea().run("Should Comment Field Exist":false,"Number of Matches":/1/.toString())
//        //Log Out
//        new actions.general.LogOut().run([:])
//        //Login
//        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize for Archived/.toString(),"Area to Navigate to":/Idea Board/.toString())
//        //Verify Voting/Comments/Favorites Icon on Idea Card in Idea Boards 30
//        new actions.IdeaBoard.VerifyVotingCommentsIconIdeaCardIdeaBoards30().run("Simple Voting":false,"Comments":false)
//        //Access Idea in Idea Board page
//        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One in Archived/.toString())
//        //Access or Close Idea from View Idea 3 Modal
//        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
//        //Verify Comment On Off in View Idea
//        new actions.ViewIdeaComment.VerifyCommentOnOffinViewIdea().run("Should Comment Field Exist":false,"Number of Matches":/1/.toString())
//    }
//    //Basestate
//    public static def Action58123c20fa4ee77809f468f6(def params){
//        //Create Affiliate based on Master Affiliate
//        variables."affiliateURL" = new actions.API.Utils.CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
//        //Open Browser
//        new actions.selenium.Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
//        //Login
//        new actions.general.Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
//        //Set to Lab Environment
//        new actions.Utils.SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())
//
//    }
//    //Delete this when Scheduler feature is enabled for everyone
//    public static def Action66ec7933e12425a91ee5d983(def params){
//        //Navigate
//        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
//        //Set Enterprise Setup for BIOnly Beta tab
//        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)
//
//    }
//    //Afterstate
//    public static def Action581259c8fa4ee77809f46905(def params){
//        try{
//            //Close Current Window
//            new actions.selenium.CloseWindow().run([:])
//        }
//       catch(all){}catch(Error err){}
//        //Delete Affiliate
//        new actions.API.Utils.DeleteAffiliate().run([:])
//
//    }
//    @AfterMethod
//    public void afterState(){
//        //Afterstate
//        Action581259c8fa4ee77809f46905([:])
//    }
}