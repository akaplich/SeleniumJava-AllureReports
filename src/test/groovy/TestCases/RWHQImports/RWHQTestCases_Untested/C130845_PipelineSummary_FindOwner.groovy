package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130845 - Pipeline Summary - Find Owner
class C130845_PipelineSummary_FindOwner
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Transformation/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest App/.toString(),"Description":/Suggest process description/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Find Owner Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureFindOwnerinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Find Owner/.toString(),"Category":/Business Development,Engineering,Finance,HR,IT,Legal,Marketing,Operations,Product,R&D,Sales,Other,Quick Add\/New Categories/.toString(),"Owner":/System Admin,End User,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,Evaluator/.toString(),"Owner Add or Remove":/Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick add1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick add2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick add3/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick add4/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick add5/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick add6/.toString(),"Action":/Submit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Action Items Manager/.toString(),"Title":/quick add1/.toString())
        //Set Find Owner for an Idea in Action Items page
        new actions.ActionItems.SetFindOwnerforanIdeainActionItemspage().run("Do you own the decision to implement this idea":/Yes/.toString(),"Do you plan to implement this idea":/Yes - I am considering implementing this idea./.toString(),"Action":/Confirm/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Action Items Manager/.toString(),"Title":/quick add5/.toString())
        //Set Find Owner for an Idea in Action Items page
        new actions.ActionItems.SetFindOwnerforanIdeainActionItemspage().run("Do you own the decision to implement this idea":/No/.toString(),"Do you plan to implement this idea":/No - I will not pursue this idea./.toString(),"Action":/Confirm/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Action Items Manager/.toString(),"Title":/quick add6/.toString())
        //Set Find Owner for an Idea in Action Items page
        new actions.ActionItems.SetFindOwnerforanIdeainActionItemspage().run("Do you own the decision to implement this idea":/No/.toString(),"Can you help us find the appropriate owner for this idea":/Yes - I can forward this idea to my colleague./.toString(),"Reassign Find Owner Action Item to a Colleague":/Moderator/.toString(),"Reassign Find Owner Action Item to a Colleague Add or Remove":/Add/.toString(),"Action":/Confirm/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/quick add2/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/quick add3/.toString(),"Check":/TRUE/.toString(),"Action":/Delete/.toString(),"Sub Action":/Delete Action Item/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Pipeline Summary/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Current Step","Completed","Original Assignee","Owner"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["quick add1","Implementation","Yes","Evaluator","System Admin"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["quick add2","Find Owner","Canceled","Evaluator","No Owner"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["quick add3","Find Owner","N/A","No Owner"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["quick add4","Find Owner","No","Evaluator","No Owner"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["quick add6","Find Owner","No","Evaluator","No Owner"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Pipeline_Summary/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Pipeline_Summary-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Yes","Evaluator","System Admin","0"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
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