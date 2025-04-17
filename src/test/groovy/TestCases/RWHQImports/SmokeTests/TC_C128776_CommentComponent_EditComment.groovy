package TestCases.RWHQImports.SmokeTests

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.IdeaBoard.AccessIdeainIdeaBoardpage30
import actions.SetupIdeas.SetWebstormSetupIdeasCommentsTab
import actions.Utils.SettoLabEnvironment
import actions.ViewIdeaComment.EditCommentinViewandNGAViewIdeapage
import actions.ViewIdeaComment.SetCommentEditMenu
import actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea
import actions.general.LogOut
import actions.general.Login
import actions.general.NavigateWebStormAdminBar
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

//C128776 - Comment Component - Edit Comment
class TC_C128776_CommentComponent_EditComment extends TestBase {
    private static def variables = [:]

    @BeforeAll
    public static void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
        variables."Licensing Model" = null
        variables."Unlimited Brightidea Administrator License Type" = null
        variables."Brightidea Administrator License Type Purchased Count" = null
        variables."Unlimited Idea Box Manager License Type" = null
        variables."Idea Box Manager License Type Purchased Count" = null
    }
    @Test
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6(variables)
        //Delete this action after Unified Commenting toggle is On
        Action5e5ee308c0c2515013b0c7b1([:])
        //Log Out
        new LogOut().run([:])
        //Login
        new Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Comment Edit Menu
        new SetCommentEditMenu().run("Comment to Edit":/test comment/.toString(),"Menu Option":/Edit/.toString())
        //Edit Comment in View and NGA View Idea page
        new EditCommentinViewandNGAViewIdeapage().run("Comment to Edit":/test comment/.toString(),"New Comment":/test comment edited version/.toString(),"Action":/Update Comment/.toString())
        //Verify Comment in View and NGA View Idea
        new VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment edited version/.toString(),"User":/End User/.toString(),"Edited Indicator":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new CopyAffiliate().run(params)
        //Open Browser
        new Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Delete this action after Unified Commenting toggle is On
    public static def Action5e5ee308c0c2515013b0c7b1(def params){
        //Navigate WebStorm or MTS
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Comments Tab
        new SetWebstormSetupIdeasCommentsTab().run("Commenting Type":/Commenting 2.0/.toString(),"Action":/Save Changes/.toString())

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate
        new DeleteAffiliate().run([:])

    }
    @AfterEach
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}