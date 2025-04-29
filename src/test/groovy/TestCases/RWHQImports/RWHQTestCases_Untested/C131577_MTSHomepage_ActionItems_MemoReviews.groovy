package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131577 - MTS Homepage > Action Items (Memo Reviews)
class C131577_MTSHomepage_ActionItems_MemoReviews
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Route users to Memo Team Site":true,"Highlights":true,"Activities":true,"My Action Items":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing2/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite2/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing2/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo - SA review from another pipeline/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo - SA review from another pipeline/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo - no review/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo - system admin review/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo - pipeline admin review/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo - end user review/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo - system admin review/.toString())
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/Memo - system admin review/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo - pipeline admin review/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/Pipeline Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo - end user review/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/End User/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing2/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo - SA review from another pipeline/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Action Items/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - no review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - SA review from another pipeline/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing2/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - end user review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - pipeline admin review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - system admin review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/1/.toString(),"Click on it?":true)
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/Overall, should this Memo be considered for our next planning session?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/6/.toString(),"Do you have any additional notes for the Author/Team?":/for testing purpose/.toString(),"Submit Review":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - system admin review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Action Items/.toString())
        try{
            //Teamsite - Verify Action Items
            new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - SA review from another pipeline/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing2/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Teamsite - Verify Action Items
            new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - system admin review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Action Items/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - system admin review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - pipeline admin review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - SA review from another pipeline/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing2/.toString(),"Number of Matches":/0/.toString())
        //Teamsite - Verify Action Items
        new actions.MTS.TeamsiteVerifyActionItems().run("Action Item Title":/Memo - end user review/.toString(),"Action Item Type":/Memo Review/.toString(),"Initiative Title":/Memo Program testing1/.toString(),"Number of Matches":/1/.toString(),"Click on it?":true)
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/Overall, should this Memo be considered for our next planning session?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/6/.toString(),"Do you have any additional notes for the Author/Team?":/for testing purpose/.toString(),"Submit Review":true)
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