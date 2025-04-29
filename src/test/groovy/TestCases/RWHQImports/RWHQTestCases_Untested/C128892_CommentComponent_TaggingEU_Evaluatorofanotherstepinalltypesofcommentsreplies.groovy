import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128892 - Comment Component - Tagging EU,Evaluator of another step in all types of comments replies
class C128892_CommentComponent_TaggingEU_Evaluatorofanotherstepinalltypesofcommentsreplies
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Delete this action after Unified Commenting toggle is On
        Action5e5ee308c0c2515013b0c7b1([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test general comment/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test submitter QA comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test pinned comment/.toString(),"Comment Type":/Pinned/.toString(),"Post Comment":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test general comment/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/enduser1/.toString(),"Username":/End User/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/Evaluator/.toString(),"Username":/Evaluator/.toString(),"Email":/evaluator@test.com/.toString(),"Add or Remove":/Add/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/test general comment reply/.toString(),"Post Reply":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test general comment reply/.toString(),"Tagged User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test general comment reply/.toString(),"Tagged User":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test general comment/.toString(),"Reply Comment":/End User Evaluator test general comment reply/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test private comment/.toString())
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/enduser1/.toString(),"Username":/End User/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/ /.toString())
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/Evaluator/.toString(),"Username":/Evaluator/.toString(),"Email":/evaluator@test.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/test private comment reply/.toString(),"Post Reply":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test private comment reply/.toString(),"Tagged User":/End User/.toString(),"Number of Matches":/0/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test private comment reply/.toString(),"Tagged User":/Evaluator/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment/.toString(),"Reply Comment":/@enduser1 @Evaluatortest private comment reply/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test submitter QA comment/.toString())
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/enduser1/.toString(),"Username":/End User/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/ /.toString())
        try{
            //Set Tag or Untag user in Comment in View and NGA View Idea
            new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/Evaluator/.toString(),"Username":/Evaluator/.toString(),"Email":/evaluator@test.com/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/test submitter QA comment reply/.toString(),"Post Reply":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test submitter QA comment reply/.toString(),"Tagged User":/End User/.toString(),"Number of Matches":/0/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test submitter QA comment reply/.toString(),"Tagged User":/Evaluator/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Reply/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/test submitter QA comment/.toString(),"Reply Comment":/@enduser1 @Evaluatortest submitter QA comment reply/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test pinned comment/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/brightidea/.toString(),"Username":/End User/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("Comment Section":/Reply/.toString(),"SearchText":/test/.toString(),"Username":/Evaluator/.toString(),"Email":/evaluator@test.com/.toString(),"Add or Remove":/Add/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/test pinned comment reply/.toString(),"Post Reply":true)
        //Set All Replies For The Comment
        new actions.ViewIdeaComment.SetAllRepliesForTheComment().run("Parent Comment":/test pinned comment/.toString(),"Number of Replies":/1/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test pinned comment reply/.toString(),"Tagged User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test pinned comment reply/.toString(),"Tagged User":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Pinned/.toString(),"Parent Comment":/test pinned comment/.toString(),"Reply Comment":/End User Evaluator test pinned comment reply/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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