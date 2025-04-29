import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128868 - Comment Component - Add and View Comment as Evaluator of another step
class C128868_CommentComponent_AddandViewCommentasEvaluatorofanotherstep
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
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test submitter QA comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Post Comment":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test submitter QA comment/.toString(),"Comment Reply":/test reply to submitter QA comment/.toString(),"Post Reply":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test private comment/.toString(),"Comment Reply":/test reply to private comment/.toString(),"Post Reply":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test general comment/.toString(),"Post Comment":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test general comment/.toString(),"Comment Reply":/test reply to general comment/.toString(),"Post Reply":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test general comment/.toString(),"User":/Evaluator/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test general comment/.toString(),"Reply Comment":/test reply to general comment/.toString(),"User":/Evaluator/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        try{
            //Add Comment in View and NGA View Idea
            new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test submitter QA comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Post Comment":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Reply to Comment in View and NGA View Idea
            new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test submitter QA comment/.toString(),"Comment Reply":/test reply to submitter QA comment/.toString(),"Post Reply":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Add Comment in View and NGA View Idea
            new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Reply to Comment in View and NGA View Idea
            new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test private comment/.toString(),"Comment Reply":/test reply to private comment/.toString(),"Post Reply":true)
        }
       catch(all){}catch(Error err){}
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment/.toString(),"Reply Comment":/test reply to private comment/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/test submitter QA comment/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/test submitter QA comment/.toString(),"Reply Comment":/test reply to submitter QA comment/.toString(),"Number of Matches":/0/.toString())
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