import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132250 - Single Scale Category Assignment - Delete Category
class C132250_SingleScaleCategoryAssignment_DeleteCategory
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/SS Category/.toString(),"Select Tool Type":/Single Scale/.toString(),"Select Stage":/Collection/.toString(),"Action":/Create/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Category":/New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Category Assignment User":/System Admin,Evaluator,Moderator,End User,End User 2/.toString(),"Category Assignment User Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea New Product/.toString(),"Description":/Idea New Product Desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea Operations/.toString(),"Description":/Idea Operations Desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea Marketing Branding/.toString(),"Description":/Idea Marketing & Branding Desc/.toString(),"Category":/Marketing & Branding/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea Strategy/.toString(),"Description":/Idea Strategy Desc/.toString(),"Category":/Strategy/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea Quick Add/.toString(),"Action":/Submit/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["Idea New Product","Idea Operations","Idea Strategy"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/SS Category/.toString(),"Action":/Change Step/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["Idea Quick Add","Idea Marketing Branding"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/SS Category/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/test idea2/.toString(),"Category":/Operations/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/quick add1/.toString(),"Category":/Quick Add/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Quick Add/.toString(),"Category":/Quick Add/.toString(),"Assignee":/End User 2/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Strategy/.toString(),"Category":/Strategy/.toString(),"Assignee":/End User/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Marketing Branding/.toString(),"Category":/Marketing & Branding/.toString(),"Assignee":/Moderator/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Operations/.toString(),"Category":/Operations/.toString(),"Assignee":/Evaluator/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea New Product/.toString(),"Category":/New Product/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Category for Ideas Tab 
        new actions.SetupIdeas.SetWebstormSetupCategoryIdeasTab().run("Action":/Delete/.toString(),"Original Category Name":/Strategy/.toString(),"New Category Name":/Operations/.toString(),"Delete Category Option":/Move the ideas to the following category/.toString(),"Delete Category Action":/OK/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/SS Category/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/test idea2/.toString(),"Category":/Operations/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/quick add1/.toString(),"Category":/Quick Add/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Quick Add/.toString(),"Category":/Quick Add/.toString(),"Assignee":/End User 2/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Strategy/.toString(),"Category":/Operations/.toString(),"Assignee":/Evaluator/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Marketing Branding/.toString(),"Category":/Marketing & Branding/.toString(),"Assignee":/Moderator/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Operations/.toString(),"Category":/Operations/.toString(),"Assignee":/Evaluator/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea New Product/.toString(),"Category":/New Product/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/8/.toString(),"Title":/Idea Strategy/.toString(),"Category":/Strategy/.toString(),"Assignee":/End User/.toString(),"Status":/Open/.toString(),"Step":/SS Category/.toString(),"Number of Matches":/0/.toString())
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