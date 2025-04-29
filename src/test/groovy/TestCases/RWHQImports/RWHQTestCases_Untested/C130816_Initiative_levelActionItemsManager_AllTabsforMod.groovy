import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130816 - Initiative-level Action Items Manager - All Tabs for Mod
class C130816_Initiative_levelActionItemsManager_AllTabsforMod
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom App 2/.toString(),"Description":/desc/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App 2/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Scorecard/.toString(),"Select Tool Type":/Scorecard/.toString(),"Action":/Create/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Individual Assignment User":/Moderator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/OpenIdea/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/CompletedIdea/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/CancelledIdea/.toString(),"Action":/Submit/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["OpenIdea","CompletedIdea","CancelledIdea"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecard/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App 2/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/CancelledIdea/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Initiative Action Items Manager/.toString(),"Title":/CompletedIdea/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/test idea2/.toString(),"Tool Type":/Review/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Initiative Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Step":/Review/.toString())
        //Set Review for Idea in Action Items page
        new actions.ActionItems.SetReviewforIdeainActionItemspage().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Open Tab Value":/1/.toString(),"Title":/test idea1/.toString(),"Assignee":/System Admin/.toString(),"Pipeline":/Custom App/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Open Tab Value":/1/.toString(),"Title":/OpenIdea/.toString(),"Number of Matches":/0/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Completed Tab Value":/1/.toString(),"Title":/quick add1/.toString(),"Assignee":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Completed Tab Value":/1/.toString(),"Title":/CompletedIdea/.toString(),"Number of Matches":/0/.toString())
        //Verify Canceled table for Action Items Manager
        new actions.ActionItemsManager.VerifyCanceledtableforActionItemsManager().run("Canceled Tab Value":/1/.toString(),"Title":/test idea2/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Canceled table for Action Items Manager
        new actions.ActionItemsManager.VerifyCanceledtableforActionItemsManager().run("Canceled Tab Value":/1/.toString(),"Title":/CancelledIdea/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/3/.toString(),"Title":/test idea1/.toString(),"Status":/Open/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/3/.toString(),"Title":/test idea2/.toString(),"Status":/Canceled/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/3/.toString(),"Title":/quick add1/.toString(),"Status":/Completed/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/3/.toString(),"Title":/CompletedIdea/.toString(),"Status":/Completed/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/3/.toString(),"Title":/OpenIdea/.toString(),"Status":/Open/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/3/.toString(),"Title":/CancelledIdea/.toString(),"Status":/Canceled/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
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