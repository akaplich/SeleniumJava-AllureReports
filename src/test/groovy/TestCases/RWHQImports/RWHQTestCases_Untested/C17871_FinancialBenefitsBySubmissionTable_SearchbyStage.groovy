import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C17871 - Financial Benefits By Submission Table - Search by Stage
class C17871_FinancialBenefitsBySubmissionTable_SearchbyStage
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/12\/12\/2019/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Cost Title":/Cost test idea1/.toString(),"Projected Cost":/84271/.toString(),"Actual Cost":/43244/.toString(),"Row Number":/1/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Cost Avoidance/.toString(),"Projected Benefit":/10000/.toString(),"Actual Benefit":/9500/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/12\/12\/2019/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Cost Title":/Cost test idea2/.toString(),"Projected Cost":/1076000/.toString(),"Actual Cost":/950000/.toString(),"Row Number":/1/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Cost Avoidance/.toString(),"Projected Benefit":/1076000/.toString(),"Actual Benefit":/950000/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/12\/12\/2019/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Cost Title":/Cost quick add1/.toString(),"Projected Cost":/1076040/.toString(),"Actual Cost":/950040/.toString(),"Row Number":/1/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Cost Avoidance/.toString(),"Projected Benefit":/1076800/.toString(),"Actual Benefit":/959800/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/quick add1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stack Rank/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Business Impact Tab/.toString())
        //Search Idea in Submission table on Business Impact tab
        new actions.PipelineDashBoard.SearchIdeainSubmissiontableonBusinessImpacttab().run("Search Value":/Collection/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/test idea2/.toString(),"Category":/Operations/.toString(),"Stage":/Collection/.toString(),"Total Projected Benefits":/$1.1MM/.toString(),"Total Actual Benefits":/$950K/.toString(),"Total Projected Costs":/$1.1MM/.toString(),"Total Actual Costs":/$950K/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/quick add1/.toString(),"Category":/Quick Add/.toString(),"Stage":/Selection/.toString(),"Total Projected Benefits":/$1.1MM/.toString(),"Total Actual Benefits":/$959.8K/.toString(),"Total Projected Costs":/$1.1MM/.toString(),"Total Actual Costs":/$950K/.toString(),"Number of Matches":/0/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/test idea1/.toString(),"Category":/New Product/.toString(),"Stage":/Collection/.toString(),"Total Projected Benefits":/$10,000/.toString(),"Total Actual Benefits":/$9,500/.toString(),"Total Projected Costs":/$84,271/.toString(),"Total Actual Costs":/$43,244/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Submission table on Business Impact tab
        new actions.PipelineDashBoard.SearchIdeainSubmissiontableonBusinessImpacttab().run("Clear Search":true)
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/test idea2/.toString(),"Category":/Operations/.toString(),"Stage":/Collection/.toString(),"Total Projected Benefits":/$1.1MM/.toString(),"Total Actual Benefits":/$950K/.toString(),"Total Projected Costs":/$1.1MM/.toString(),"Total Actual Costs":/$950K/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/quick add1/.toString(),"Category":/Quick Add/.toString(),"Stage":/Selection/.toString(),"Total Projected Benefits":/$1.1MM/.toString(),"Total Actual Benefits":/$959.8K/.toString(),"Total Projected Costs":/$1.1MM/.toString(),"Total Actual Costs":/$950K/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/test idea1/.toString(),"Category":/New Product/.toString(),"Stage":/Collection/.toString(),"Total Projected Benefits":/$10,000/.toString(),"Total Actual Benefits":/$9,500/.toString(),"Total Projected Costs":/$84,271/.toString(),"Total Actual Costs":/$43,244/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Submission table on Business Impact tab
        new actions.PipelineDashBoard.SearchIdeainSubmissiontableonBusinessImpacttab().run("Search Value":/COLLECT/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/test idea2/.toString(),"Category":/Operations/.toString(),"Stage":/Collection/.toString(),"Total Projected Benefits":/$1.1MM/.toString(),"Total Actual Benefits":/$950K/.toString(),"Total Projected Costs":/$1.1MM/.toString(),"Total Actual Costs":/$950K/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/quick add1/.toString(),"Category":/Quick Add/.toString(),"Stage":/Selection/.toString(),"Total Projected Benefits":/$1.1MM/.toString(),"Total Actual Benefits":/$959.8K/.toString(),"Total Projected Costs":/$1.1MM/.toString(),"Total Actual Costs":/$950K/.toString(),"Number of Matches":/0/.toString())
        //Verify Submission in the Submission Table on Business Impact tab
        new actions.PipelineDashBoard.VerifySubmissionintheSubmissionTableonBusinessImpacttab().run("Idea":/test idea1/.toString(),"Category":/New Product/.toString(),"Stage":/Collection/.toString(),"Total Projected Benefits":/$10,000/.toString(),"Total Actual Benefits":/$9,500/.toString(),"Total Projected Costs":/$84,271/.toString(),"Total Actual Costs":/$43,244/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
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