package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130184 - List View - Pinned Comment With User tags
class C130184_ListView_PinnedCommentWithUsertags
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image9.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString(),"First Name":/John/.toString(),"Last Name":/Doe/.toString())
        //Delete this action after Unified Commenting toggle is On
        Action5e5ee308c0c2515013b0c7b1([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Idea Board
        new actions.SetupIdeas.SetWebstormSetuptoIdeaBoard().run("List View":true,"Inline Pinned Comments":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test pinned comment/.toString(),"Comment Type":/Pinned/.toString(),"Post Comment":true)
        //Set Comment Edit Menu
        new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/test pinned comment/.toString(),"Menu Option":/Edit/.toString())
        //Edit Comment in View and NGA View Idea page
        new actions.ViewIdeaComment.EditCommentinViewandNGAViewIdeapage().run("Comment to Edit":/test pinned comment/.toString(),"New Comment":/test pinned comment /.toString())
        //Set Tag or Untag user in Edit Comment in View and NGA View Idea
        new actions.ViewIdeaComment.SetTagorUntagUserinEditCommentinViewandNGAViewIdea().run("Comment":/test pinned comment/.toString(),"SearchText":/End/.toString(),"Email":/bi.enduser1@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        //Edit Comment in View and NGA View Idea page
        new actions.ViewIdeaComment.EditCommentinViewandNGAViewIdeapage().run("Action":/Update Comment/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/List/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Tab":/Recent/.toString(),"View Type":/List/.toString(),"Idea Name":/test idea2/.toString(),"Status":/Submitted/.toString(),"Username":/Sri/.toString(),"Date":/10\/12\/2016/.toString(),"Description":/test idea2 desc/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Verify Pinned Comment in IdeaBoards List View
        new actions.IdeaBoard.VerifyPinnedCommentinIdeaBoardsListView().run("Idea":/test idea2/.toString(),"Comment":/test pinned comment /.toString(),"Comment Submitter":/John Doe/.toString(),"Comment Submitter Image":true,"Comment Date Displayed":true,"Edited Indicator":true,"User Tags":/End User/.toString(),"Number of Matches":/1/.toString(),"Click on User Tag":true)
        //Set Tab on User Profile page
        new actions.UserProfile.SetTabonUserProfilepage().run("Tab":/Submissions/.toString())
        //Verify and Access Submissions in My Activity page
        new actions.MyActivity.VerifySubmissionsinMyActivitypage().run("Value Type to Verify":/COMMENT ON IDEAS/.toString(),"Idea Name":/test idea1/.toString(),"Value":/test comment/.toString(),"Number of Matches":/1/.toString())
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