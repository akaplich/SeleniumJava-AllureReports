import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C119149 - Highlights - All Activity - Vote on a Hidden Comment
class C119149_Highlights_AllActivity_VoteonaHiddenComment
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Sponsor Name":/End User 2/.toString(),"Sponsor Add or Remove":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Activities":true,"My Ideas":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Add Comment in View Idea page
        new actions.ViewIdeaComment.AddCommentinViewIdeapage().run("Comment":/Vote on this comment3/.toString(),"Comment Type":/General Access/.toString())
        //Hide Comment in View Idea page
        new actions.ViewIdeaComment.HideCommentinViewIdeapage().run("Comment to Hide":/Vote on this comment3/.toString(),"Hide":true)
        //Add Comment in View Idea page
        new actions.ViewIdeaComment.AddCommentinViewIdeapage().run("Comment":/Vote on this comment4/.toString(),"Comment Type":/General Access/.toString())
        //Hide Comment in View Idea page
        new actions.ViewIdeaComment.HideCommentinViewIdeapage().run("Comment to Hide":/Vote on this comment4/.toString(),"Hide":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Promote/Demote Comment in View Idea page
        new actions.ViewIdeaComment.PromoteDemoteCommentinViewIdeapage().run("Comment":/Vote on this comment3/.toString(),"Promote or Demote":/Demote/.toString())
        //Promote/Demote Comment in View Idea page
        new actions.ViewIdeaComment.PromoteDemoteCommentinViewIdeapage().run("Comment":/Vote on this comment4/.toString(),"Promote or Demote":/Promote/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin promoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment4/.toString(),"Number of Matches":/0/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin demoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment3/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin promoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment4/.toString(),"Number of Matches":/0/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin demoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment3/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin promoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment4/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin demoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment3/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin promoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment4/.toString(),"Number of Matches":/0/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/NonBI System Admin demoted System Admin's comment on "test idea2"/.toString(),"Highlights Item Content":/Vote on this comment3/.toString(),"Number of Matches":/0/.toString())
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