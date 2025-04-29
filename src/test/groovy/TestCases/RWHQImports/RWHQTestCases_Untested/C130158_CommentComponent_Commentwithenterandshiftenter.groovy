import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130158 - Comment Component - Comment with enter and shift enter
class C130158_CommentComponent_Commentwithenterandshiftenter
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/this is for testing/.toString(),"Comment Type":/General Access/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/SHIFT ENTER/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/after shift enter/.toString(),"Post Comment":true)
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/2/.toString())
        //Get Element Text
        variables."value" = new actions.selenium.GetText().run("ID":/\/\/*[@id='comments-component-render']\/DIV\/DIV[3]\/*[position()=1]\/\/*[@data-test='f-test-comment-wrapper']\/\/*[@data-class='f-comment-body']/.toString(),"ID Type":/XPath/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/${variables."value"}/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/this is for testingafter shift enter/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/this is for testing after shift enter/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test comment/.toString(),"Comment Reply":/replying to this comment/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ENTER/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Comment Reply":/after enter/.toString(),"Post Reply":true)
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/3/.toString())
        //Get Element Text
        variables."value" = new actions.selenium.GetText().run("ID":/\/\/*[@id='comments-component-render']\/DIV\/DIV[3]\/*[position()=3]\/\/*[@data-test='f-test-comment-wrapper']\/\/*[@data-class='f-comment-body']/.toString(),"ID Type":/XPath/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"Reply Comment":/${variables."value"}/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"Reply Comment":/replying to this commentafter enter/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"Reply Comment":/replying to this comment after enter/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
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