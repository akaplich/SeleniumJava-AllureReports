import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131498 - Top Ideas for Memos > Sort as per Memo Reviews
class C131498_TopIdeasforMemos_SortasperMemoReviews
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
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Idea1/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo1/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo2/.toString(),"Category":/Organizational Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo3/.toString(),"Category":/Organizational Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo4/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo5/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Memo5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Implementation/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Collaboration/.toString(),"Action":/Change Step/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo1/.toString())
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/Memo1/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Complete Review/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How strong is the core idea for this Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/4/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How complete is the Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/5/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How well is the Memo presented?/.toString(),"Drag the scrollbar or input the answer":/Drag/.toString(),"Answer":/10/.toString(),"Add comment to this question":/full marks/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/Overall, should this Memo be considered for our next planning session?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/6/.toString(),"Do you have any additional notes for the Author/Team?":/for testing purpose/.toString(),"Submit Review":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo\/2/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Complete Review/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How strong is the core idea for this Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/5/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How complete is the Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/5/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How well is the Memo presented?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/5/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/Overall, should this Memo be considered for our next planning session?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/5/.toString(),"Do you have any additional notes for the Author/Team?":/for testing purpose/.toString(),"Submit Review":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Memo3/.toString())
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/Memo3/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Complete Review/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How strong is the core idea for this Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/2/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How complete is the Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/2/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How well is the Memo presented?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/2/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/Overall, should this Memo be considered for our next planning session?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/2/.toString(),"Do you have any additional notes for the Author/Team?":/for testing purpose/.toString(),"Submit Review":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo\/4/.toString())
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Request Review/.toString())
        //Set Request Review Modal
        new actions.Memo.SetRequestReviewModal().run("Select Reviewers":/System Admin/.toString(),"Select Reviewers Add or Remove":/Add/.toString(),"Click on Advanced Settings":true,"Round Name":/Round1/.toString(),"Action":/Assign Review/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Review Request Dropdown or Button
        new actions.Memo.SetReviewRequestDropdownorButton().run("Click on button":/Complete Review/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How strong is the core idea for this Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/4/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How complete is the Memo?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/5/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/How well is the Memo presented?/.toString(),"Drag the scrollbar or input the answer":/Drag/.toString(),"Answer":/10/.toString())
        //Set Request Review Questions
        new actions.Memo.SetRequestReviewQuestions().run("Question Container":/1/.toString(),"Question":/Overall, should this Memo be considered for our next planning session?/.toString(),"Drag the scrollbar or input the answer":/Input/.toString(),"Answer":/6/.toString(),"Do you have any additional notes for the Author/Team?":/for testing purpose/.toString(),"Submit Review":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu/.toString())
        //Set Sort in Top Ideas
        new actions.PipelineTopIdeas.SetSortInTopIdeas().run("Sort By":/Memo Review Results/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo2/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Memo/.toString(),"Score":/5.0/.toString(),"Score Container Color":/orange/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D113/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo3/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Memo/.toString(),"Score":/2.0/.toString(),"Score Container Color":/red/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D114/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo4/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Score":/6.2/.toString(),"Score Container Color":/orange/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D115/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Score":/6.2/.toString(),"Score Container Color":/orange/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D112/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo5/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Score":/-/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/2/.toString(),"Stage":/Tracking/.toString(),"Step":/Implementation/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D116/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Progress Bar":/1/.toString(),"Stage":/Active Development/.toString(),"Step":/Collaboration/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D111/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Score":/-/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Progress Bar":/1/.toString(),"Stage":/Active Development/.toString(),"Step":/Collaboration/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D111/.toString(),"Number of Matches":/0/.toString())
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