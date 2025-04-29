package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10786 - Update Development
class C10786_UpdateDevelopment
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
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Development/.toString(),"Development Team":/System Admin/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Multiple Choice Question,Development Long Answer Question,Development Attachment Question,Development User Select Question,Development Parent Dropdown Question,Development Child Checkbox Question/.toString(),"Development Field Included or Required":/Included,Included,Included,Included,Included,Included/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/development idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/development idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Development/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/development idea/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Multiple Choice Question":/Answer 1/.toString(),"Development Long Answer Question":/This is a really long answer for this development question/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development Parent Dropdown Question":/Parent Dropdown Answer 1/.toString(),"Development Child Checkbox Question":["Child Checkbox Answer 1"],"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/development idea/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/development idea/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Title":/development idea/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Parent Dropdown Question":/Parent Dropdown Answer 2/.toString(),"Development Child Checkbox Question":[],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Verify and Access Revision History Development for Idea in Action Items page
        new actions.ActionItems.VerifyRevisionHistoryDevelopmentforIdeainActionItemspage().run("Revision History":/Current Version/.toString(),"Development Multiple Choice Question":/Answer 1/.toString(),"Development Long Answer Question":/This is a really long answer for this development question/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development Parent Dropdown Question":/Parent Dropdown Answer 2/.toString(),"Development Child Checkbox Question":/Child Checkbox Answer 1/.toString())
        //Verify and Access Revision History Development for Idea in Action Items page
        new actions.ActionItems.VerifyRevisionHistoryDevelopmentforIdeainActionItemspage().run("Revision History":/System Admin/.toString(),"Development Multiple Choice Question":/Answer 1/.toString(),"Development Long Answer Question":/This is a really long answer for this development question/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development Parent Dropdown Question":/Parent Dropdown Answer 1/.toString(),"Development Child Checkbox Question":/Child Checkbox Answer 1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/development idea/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/My Action Items/.toString(),"Title":/development idea/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Long Answer Question":/Updated Answer/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development User Select Question":/Moderator/.toString(),"Development User Select Question Add or Remove":/Add/.toString(),"Development Parent Dropdown Question":/Parent Dropdown Answer 3/.toString(),"Development Child Checkbox Question":["Child Checkbox Answer 2"],"Action":/Mark Complete/.toString())
        //Verify and Access Revision History Development for Idea in Action Items page
        new actions.ActionItems.VerifyRevisionHistoryDevelopmentforIdeainActionItemspage().run("Revision History":/Current Version/.toString(),"Development Multiple Choice Question":/Answer 1/.toString(),"Development Long Answer Question":/Updated Answer/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development User Select Question":/Moderator/.toString(),"Development Parent Dropdown Question":/Parent Dropdown Answer 3/.toString(),"Development Child Checkbox Question":/Child Checkbox Answer 1, Child Checkbox Answer 2/.toString())
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