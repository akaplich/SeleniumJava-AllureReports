import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130817 - Initiative-level Action Items Manager - Export
class C130817_Initiative_levelActionItemsManager_Export
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
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Single Scale/.toString(),"Select Tool Type":/Single Scale/.toString(),"Action":/Create/.toString())
        try{
            //Configure Single Scale Step in Pipeline Steps page
            new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Individual Assignment User":/Pipeline Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        }
       catch(all){}catch(Error err){}
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/OpenIdea/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/CompletedIdea/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/CancelledIdea/.toString(),"Action":/Submit/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["OpenIdea","CompletedIdea","CancelledIdea"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App 2/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/CancelledIdea/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Initiative Action Items Manager/.toString(),"Title":/CompletedIdea/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/6/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Pipeline Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["test idea1","test idea2","quick add1"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/test idea2/.toString(),"Tool Type":/Single Scale/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/Initiative Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Step":/Single Scale/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/7/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("All Tab Value":/6/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/2/.toString())
        //Set Action Items Export
        new actions.ActionItems.SetActionItemsExport().run("List":/Initiative Action Items Manager/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom App-Action-Items*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","System Admin","Custom App","Review"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Set Action Items Export
        new actions.ActionItems.SetActionItemsExport().run("List":/Initiative Action Items Manager/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom App-Action-Items*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["CompletedIdea"],"Number of Matches":/0/.toString(),"Total Number of Rows":/7/.toString())
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