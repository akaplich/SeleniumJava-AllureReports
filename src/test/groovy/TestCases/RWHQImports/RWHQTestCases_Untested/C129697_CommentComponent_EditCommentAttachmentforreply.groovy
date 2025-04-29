import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129697 - Comment Component - Edit Comment Attachment for reply
class C129697_CommentComponent_EditCommentAttachmentforreply
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Reply to Comment in View and NGA View Idea
        new actions.ViewIdeaComment.ReplytoCommentinViewandNGAViewIdea().run("Parent Comment":/test comment/.toString(),"Comment Reply":/reply to test comment/.toString(),"Attachment File":/Sample PDF.pdf,Image3.jpg,SamplePNG.png,plaintext.txt/.toString(),"Attachment Add or Remove":/Add,Add,Add,Add/.toString(),"Post Reply":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Comment Edit Menu
        new actions.ViewIdeaComment.SetCommentEditMenu().run("Comment to Edit":/reply to test comment/.toString(),"Menu Option":/Edit/.toString())
        //Edit Comment in View and NGA View Idea page
        new actions.ViewIdeaComment.EditCommentinViewandNGAViewIdeapage().run("Comment to Edit":/reply to test comment/.toString(),"Attachment File":/plaintext.txt,Image3.jpg,SampleExcel.xlsx/.toString(),"Attachment Add or Remove":/Remove,Remove,Add/.toString(),"Action":/Update Comment/.toString())
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/2/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"Reply Comment":/reply to test comment/.toString(),"User":/End User 2/.toString(),"Edited Indicator":true,"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/Sample PDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/SampleExcel.xlsx/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/SamplePNG.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/plaintext.txt/.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Comment Count in the Header
        new actions.ViewIdeaComment.VerifyCommentCountintheHeader().run("Comment Count":/2/.toString())
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Reply/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test comment/.toString(),"Reply Comment":/reply to test comment/.toString(),"User":/End User 2/.toString(),"Edited Indicator":true,"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/Sample PDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/SampleExcel.xlsx/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/SamplePNG.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/Image3.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment for Comment in View Idea and NGA View Idea
        new actions.ViewIdeaComment.VerifyAttachmentforCommentinViewIdeaandNGAViewIdea().run("Comment":/reply to test comment/.toString(),"Attachment File":/plaintext.txt/.toString(),"Number of Matches":/0/.toString())
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