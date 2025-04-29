import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130647 - Comment Component - Smart Suggesting by clicking@
class C130647_CommentComponent_SmartSuggestingbyclicking_AtSymbol
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/C130647Group/.toString(),"User":/End User,End User 2,Pipeline Admin,Moderator,Evaluator,analyst,Pipeline Sponsor,Sri/.toString(),"Add or Remove":/Add,Add,Add,Add,Add,Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("General Access":/All,C130647Group/.toString(),"General Access Add or Remove":/Remove,Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/team submission/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/End User 2/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/desc/.toString(),"Category":/Marketing & Branding/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/team submission/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test private comment/.toString(),"Comment Type":/Private/.toString(),"Post Comment":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/team submission/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test general comment by evaluator/.toString(),"Post Comment":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/team submission/.toString())
        //Set Comment Edit Menu
        new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/test private comment/.toString(),"Menu Option":/Edit/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[contains(@class,'f-comment-tagging-button')]/.toString(),"ID Type":/XPath/.toString())
        //Verify Smart Suggesting In New Commenting
        new actions.ViewIdeaComment.VerifySmartSuggestingInNewCommenting().run("User":/End User 2 (bi.enduser2@brightidea.com)/.toString(),"User Image":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Smart Suggesting In New Commenting
        new actions.ViewIdeaComment.VerifySmartSuggestingInNewCommenting().run("User":/Moderator (moderator@test.com)/.toString(),"User Image":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Smart Suggesting In New Commenting
        new actions.ViewIdeaComment.VerifySmartSuggestingInNewCommenting().run("User":/NonBI System Admin (nonbisysadmin@test.com)/.toString(),"User Image":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Smart Suggesting In New Commenting
        new actions.ViewIdeaComment.VerifySmartSuggestingInNewCommenting().run("User":/Sri (pipelinesponsor@test.com)/.toString(),"User Image":true,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Smart Suggesting In New Commenting
        new actions.ViewIdeaComment.VerifySmartSuggestingInNewCommenting().run("User":/End User/.toString(),"User Image":true,"Number of Matches":/0/.toString())
        //Verify Smart Suggesting In New Commenting
        new actions.ViewIdeaComment.VerifySmartSuggestingInNewCommenting().run("User":/System Admin (bi.adminuser1@brightidea.com)/.toString(),"User Image":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString(),"Click on the User":true)
        //Edit Comment in View and NGA View Idea page
        new actions.ViewIdeaComment.EditCommentinViewandNGAViewIdeapage().run("Action":/Update Comment/.toString())
        //Verify Tagged Users In Comments in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyTaggedUsersInCommentsinViewandNGAViewIdea().run("Comment":/test private comment/.toString(),"Tagged User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/test private comment/.toString(),"User":/Pipeline Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
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