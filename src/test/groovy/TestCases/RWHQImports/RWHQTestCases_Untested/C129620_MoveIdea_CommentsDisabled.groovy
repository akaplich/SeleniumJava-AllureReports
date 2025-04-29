package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129620 - Move Idea - Comments Disabled
class C129620_MoveIdea_CommentsDisabled
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Delete this action after Unified Commenting toggle is On
        Action5e5ee308c0c2515013b0c7b1([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Voting Checkbox":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description":/description of test idea3/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/Pinned Comment/.toString(),"Comment Type":/Pinned/.toString(),"Attachment File":/Sample PDF.pdf/.toString(),"Attachment Add or Remove":/Add/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/General Comment/.toString(),"Comment Type":/General Access/.toString(),"Attachment File":/Image3.jpg/.toString(),"Attachment Add or Remove":/Add/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/Private Comment/.toString(),"Comment Type":/Private/.toString(),"Attachment File":/Sample Text.txt/.toString(),"Attachment Add or Remove":/Add/.toString(),"Post Comment":true)
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment":/Submitter Q&A Comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Attachment File":/SampleDoc.docx/.toString(),"Attachment Add or Remove":/Add/.toString(),"Post Comment":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/General Comment/.toString(),"Comment Reply":/Reply to General Comment/.toString(),"Attachment File":/Sample Movie.avi/.toString(),"Attachment Add or Remove":/Add/.toString(),"Post Reply":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/test idea3/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Pipeline A/.toString(),"Category":/New Product/.toString(),"Status":/Pending/.toString(),"Action":/Move Idea/.toString())
        //Set Missing Development Fields Modal
        new actions.PipelineStepsView.SetMissingDevelopmentFieldsModal().run("Action":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString(),"Status":/Pending/.toString(),"Username":/System Admin/.toString(),"Description":/description of test idea3/.toString(),"Comments":/5/.toString())
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/5/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/General Comment/.toString(),"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/General Comment/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Parent Comment/.toString(),"Comment Type":/Private/.toString(),"Parent Comment":/Private Comment/.toString(),"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/Private Comment/.toString(),"Attachment File":/Sample Text.txt/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Parent Comment/.toString(),"Comment Type":/Submitter Q&A/.toString(),"Parent Comment":/Submitter Q&A Comment/.toString(),"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/Submitter Q&A Comment/.toString(),"Attachment File":/SampleDoc.docx/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/General Comment/.toString(),"Reply Comment":/Reply to General Comment/.toString(),"User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/Reply to General Comment/.toString(),"Attachment File":/Sample Movie.avi/.toString(),"Number of Matches":/1/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("View Idea or NGA":/View Idea/.toString(),"Comment section":/Parent Comment/.toString(),"Comment Type":/Pinned/.toString(),"Parent Comment":/Pinned Comment/.toString(),"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/Pinned Comment/.toString(),"Attachment File":/Sample PDF.pdf/.toString(),"Number of Matches":/1/.toString())
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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