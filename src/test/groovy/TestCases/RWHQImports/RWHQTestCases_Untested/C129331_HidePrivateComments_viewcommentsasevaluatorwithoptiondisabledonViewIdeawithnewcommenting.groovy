import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129331 - Hide Private Comments - view comments as evaluator with option disabled on View Idea with new commenting
class C129331_HidePrivateComments_viewcommentsasevaluatorwithoptiondisabledonViewIdeawithnewcommenting
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
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Development Step1/.toString(),"Select Tool Type":/Development/.toString(),"Action":/Create/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Development Lead Category":/New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Development Lead":/Select a user,Select a user,Select a user,Select a user,Select a user/.toString(),"Selected user":/Evaluator,Evaluator,Evaluator,Evaluator,Evaluator/.toString(),"Selected Users Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Development Field":/Development Multiple Choice Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/New Development Step1/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment1 by admin/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment2 by admin/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test submitter QA comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test pinned comment/.toString(),"Comment Type":/Pinned/.toString(),"Post Comment":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment by evaluator/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test private comment by evaluator/.toString(),"Comment Reply":/test reply1 test private comment by evaluator/.toString(),"Post Reply":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test private comment1 by admin/.toString(),"Comment Reply":/test reply to test private comment by admin/.toString(),"Post Reply":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test private comment by evaluator/.toString(),"Comment Reply":/test reply2 test private comment by admin/.toString(),"Post Reply":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/New Development Step1/.toString(),"Allow action item assignees to view Private Comments":false,"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/6/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Pinned/.toString(),"Parent Comment":/test pinned comment/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment by evaluator/.toString(),"User":/Evaluator/.toString(),"Placement Number":/2/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment by evaluator/.toString(),"Reply Comment":/test reply2 test private comment by admin/.toString(),"User":/System Admin/.toString(),"Placement Number":/2/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment by evaluator/.toString(),"Reply Comment":/test reply1 test private comment by evaluator/.toString(),"User":/Evaluator/.toString(),"Placement Number":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/test submitter QA comment/.toString(),"User":/System Admin/.toString(),"Placement Number":/5/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment1 by admin/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment1 by admin/.toString(),"Reply Comment":/test reply to test private comment by admin/.toString(),"User":/Evaluator/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"User":/End User/.toString(),"Placement Number":/6/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment2/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
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