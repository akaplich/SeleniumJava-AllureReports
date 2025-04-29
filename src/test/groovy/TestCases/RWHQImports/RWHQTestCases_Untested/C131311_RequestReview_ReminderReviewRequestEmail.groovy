import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131311 - Request Review - Reminder Review Request Email
class C131311_RequestReview_ReminderReviewRequestEmail
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightuserC131311_test1/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/MemoProgramtesting/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo Review Request Idea1/.toString(),"Action":/Submit/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo Review Request Idea1/.toString())
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/Memo Review Request Idea1/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/brightuserC131311_test1@mailinator.com/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Get Link from Review Request Email
        variables."link" = new actions.Mailinator.GetLinkfromReviewRequestEmail().run("Email Address":/brightuserC131311_test1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Dropdown Options":/Review Results/.toString())
        //Verify Review Results
        new actions.Memo.VerifyReviewResults().run("Round Name":/Round1/.toString(),"Score":/-/.toString(),"Complete":/0 of 1 Complete/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"View Results":true)
        //Verify Round Information In Review Results modal
        new actions.Memo.VerifyRoundInformationInReviewResultsmodal().run("Template":/General Memo Review/.toString(),"Click on Remind":true)
        //Set Review Results Modal Header buttons
        new actions.Memo.SetReviewResultsModalHeaderbuttons().run("Action":/Close/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Review Request Email
        variables."emailLink" = new actions.Mailinator.GetLinkfromReviewRequestEmail().run("Email Address":/brightuserC131311_test1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."emailLink"}/.toString())
        //Login
        new actions.general.Login().run("Email":/brightuserC131311_test1@mailinator.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How strong is the core idea for this Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/4/.toString(),"Submit Review":true)
        //Navigate Tab in My Reviews
        new actions.Memo.NavigateTabinMyReviews().run("Tab":/Completed (1)/.toString())
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