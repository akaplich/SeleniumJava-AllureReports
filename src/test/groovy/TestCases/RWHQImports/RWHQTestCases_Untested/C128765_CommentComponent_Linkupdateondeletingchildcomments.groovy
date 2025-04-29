import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128765 - Comment Component - Link update on deleting child comments
class C128765_CommentComponent_Linkupdateondeletingchildcomments
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
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test idea2 general comment1/.toString(),"Post Comment":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test idea2 general comment1/.toString(),"Comment Reply":/test idea2 general comment1 reply1/.toString(),"Post Reply":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test idea2 general comment1/.toString(),"Comment Reply":/test idea2 general comment1 reply2/.toString(),"Post Reply":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test idea2 general comment1/.toString(),"Comment Reply":/test idea2 general comment1 reply3/.toString(),"Post Reply":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test idea2 general comment1/.toString(),"Comment Reply":/test idea2 general comment1 reply4/.toString(),"Post Reply":true)
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/5/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        try{
            //Set Comment Edit Menu
            new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/test idea2 general comment1 reply4/.toString(),"Menu Option":/Delete.../.toString(),"Delete Action":/Delete/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/4/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply4/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/View 1 reply/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/View 3 replies/.toString(),"Should Exist":false)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply3/.toString(),"User":/System Admin/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply2/.toString(),"User":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test idea2 general comment1/.toString(),"Comment Reply":/test idea2 general comment1 reply5/.toString(),"Post Reply":true)
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test idea2 general comment1/.toString(),"Comment Reply":/test idea2 general comment1 reply6/.toString(),"Post Reply":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply3/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply5/.toString(),"User":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply6/.toString(),"User":/System Admin/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Set All Replies For The Comment
        new actions.ViewIdeaComment.SetAllRepliesForTheComment().run("Parent Comment":/test idea2 general comment1/.toString(),"Number of Replies":/2/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply2/.toString(),"User":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        try{
            //Set Comment Edit Menu
            new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/test idea2 general comment1 reply3/.toString(),"Menu Option":/Delete.../.toString(),"Delete Action":/Delete/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply3/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply2/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply5/.toString(),"User":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply6/.toString(),"User":/System Admin/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Set All Replies For The Comment
        new actions.ViewIdeaComment.SetAllRepliesForTheComment().run("Parent Comment":/test idea2 general comment1/.toString(),"Number of Replies":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply2/.toString(),"User":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply5/.toString(),"User":/System Admin/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test idea2 general comment1/.toString(),"Reply Comment":/test idea2 general comment1 reply6/.toString(),"User":/System Admin/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
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