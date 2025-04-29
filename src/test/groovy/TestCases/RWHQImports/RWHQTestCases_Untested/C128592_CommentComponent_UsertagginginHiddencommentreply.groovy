import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128592 - Comment Component - User tagging in Hidden comment reply
class C128592_CommentComponent_UsertagginginHiddencommentreply
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
        //Delete this action after Unified Commenting toggle is On
        Action5e5ee308c0c2515013b0c7b1([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Pipeline Sponsor/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test hidden comment/.toString(),"Post Comment":true)
        //Set Comment Edit Menu
        new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/test hidden comment/.toString(),"Menu Option":/Hide/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test hidden comment/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/Pipeline/.toString(),"Username":/Pipeline Admin/.toString(),"Email":/pipelineadmin@test.com/.toString(),"Add or Remove":/Add/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/Moderator/.toString(),"Username":/Moderator/.toString(),"Email":/moderator@test.com/.toString(),"Add or Remove":/Add/.toString())
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/analyst/.toString(),"Username":/analyst/.toString(),"Email":/analyst@test.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/Evaluator/.toString(),"Username":/Evaluator/.toString(),"Email":/evaluator@test.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/enduser1/.toString(),"Username":/End User/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/test reply to hidden comment/.toString(),"Post Reply":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test reply to hidden comment/.toString(),"Tagged User":/Pipeline Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test reply to hidden comment/.toString(),"Tagged User":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test reply to hidden comment/.toString(),"Tagged User":/Evaluator/.toString(),"Number of Matches":/0/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test reply to hidden comment/.toString(),"Tagged User":/End User/.toString(),"Number of Matches":/0/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test reply to hidden comment/.toString(),"Tagged User":/analyst/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Reply/.toString(),"Comment Type":/Hidden/.toString(),"Parent Comment":/test hidden comment/.toString(),"Reply Comment":/Pipeline Admin Moderator @analyst @Evaluator @End User test reply to hidden comment/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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
    //Delete this action after Unified Commenting toggle is On
    public static def Action5e5ee308c0c2515013b0c7b1(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Comments Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasCommentsTab().run("Commenting Type":/Commenting 2.0/.toString(),"Action":/Save Changes/.toString())

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