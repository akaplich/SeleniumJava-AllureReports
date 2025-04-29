import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131190 - Tag to invite - Tag new user in private, pinned and submitter qa comment
class C131190_Tagtoinvite_Tagnewuserinprivate_pinnedandsubmitterqacomment
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
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("SearchText":/brightideauserC131190private@mailinator.com/.toString(),"Username":/brightideauserC131190private@mailinator.com/.toString(),"Email":/Create new user/.toString(),"Add or Remove":/Add/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/for private comment testing/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/for testing/.toString(),"Tagged User":/brightideauserC131190private@mailinator.com/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/brightideauserC131190private@mailinator.com for private comment testing/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("SearchText":/brightideauserC131190submitter@mailinator.com/.toString(),"Username":/brightideauserC131190submitter@mailinator.com/.toString(),"Email":/Create new user/.toString(),"Add or Remove":/Add/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/for submitter comment testing/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Post Comment":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/for testing/.toString(),"Tagged User":/brightideauserC131190submitter@mailinator.com/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/brightideauserC131190submitter@mailinator.com for submitter comment testing/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString())
        //Set Tag or Untag user in Comment in View and NGA View Idea
        new actions.ViewIdeaComment.TagorUntagUserInCommentInViewAndNGAViewIdea().run("SearchText":/brightideauserC131190pinned@mailinator.com/.toString(),"Username":/brightideauserC131190pinned@mailinator.com/.toString(),"Email":/Create new user/.toString(),"Add or Remove":/Add/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/for pinned comment testing/.toString(),"Comment Type":/Pinned/.toString(),"Post Comment":true)
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/for testing/.toString(),"Tagged User":/brightideauserC131190pinned@mailinator.com/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Pinned/.toString(),"Parent Comment":/brightideauserC131190pinned@mailinator.com for pinned comment testing/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        try{
            //Get The Registration Link From Comment Email
            variables."link" = new actions.Mailinator.GetTheRegistrationLinkFromCommentEmail().run("Email Address":/brightideauserC131190private@mailinator.com/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Navigate to URL
            new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Complete User Registration
            new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/First/.toString(),"Last Name":/Last/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/for testing/.toString(),"Tagged User":/First Last/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/brightideauserC131190private@mailinator.com for private comment testing/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        try{
            //Get The Registration Link From Comment Email
            variables."link" = new actions.Mailinator.GetTheRegistrationLinkFromCommentEmail().run("Email Address":/brightideauserC131190submitter@mailinator.com/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Navigate to URL
            new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Complete User Registration
            new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/First/.toString(),"Last Name":/Last/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/for testing/.toString(),"Tagged User":/First Last/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/brightideauserC131190submitter@mailinator.com for submitter comment testing/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
        try{
            //Get The Registration Link From Comment Email
            variables."link" = new actions.Mailinator.GetTheRegistrationLinkFromCommentEmail().run("Email Address":/brightideauserC131190pinned@mailinator.com/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Navigate to URL
            new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Complete User Registration
            new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/First/.toString(),"Last Name":/Last/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/for testing/.toString(),"Tagged User":/First Last/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Pinned/.toString(),"Parent Comment":/brightideauserC131190pinned@mailinator.com for pinned comment testing/.toString(),"User":/System Admin/.toString(),"Number of Matches":/0/.toString())
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