import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128793 - Comment Component - Deleting the Comment through NGA View Idea
class C128793_CommentComponent_DeletingtheCommentthroughNGAViewIdea
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
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/End User/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Delete this action after Unified Commenting toggle is On
        Action5e5ee308c0c2515013b0c7b1([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        try{
            //Set Review for Idea in Action Items page
            new actions.ActionItems.SetReviewforIdeainActionItemspage().run([:])
        }
       catch(all){}catch(Error err){}
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/test idea1/.toString(),"Row number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Comment Edit Menu
        new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/test comment/.toString(),"Menu Option":/Delete.../.toString(),"Delete Action":/Delete/.toString())
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"User":/End User/.toString(),"Number of Matches":/0/.toString())
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