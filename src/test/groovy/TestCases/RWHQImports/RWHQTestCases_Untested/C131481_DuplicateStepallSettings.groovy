package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131481 - Duplicate Step all Settings
class C131481_DuplicateStepallSettings
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator,Moderator/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Each Idea will be assigned to evaluators":/1/.toString(),"Scorecard Template":/Consult - Project Evaluation/.toString(),"Due Date":/9/.toString(),"Idea Editing":true,"Cancel Open Action Item":true,"Subject":/Testing hello/.toString(),"Evaluation Results":true,"Results are visible to":/Administrators and select roles/.toString(),"Submitters":true,"Options":/Make evaluators anonymous/.toString(),"Make evaluators anonymous":true,"Action":/Update/.toString())
        try{
            //Set Duplicate Step in Pipeline Steps View
            new actions.PipelineStepsView.SetDuplicateStepinPipelineStepsView().run("Step to Edit":/Scorecarding/.toString(),"Step Name":/new step SC/.toString(),"Select Stage":/Selection/.toString(),"Action":/Duplicate Step/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Configure Scorecard Step in Pipeline Steps page
            new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/new step SC/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Moderator/.toString(),"Individual Assignment User Add or Remove":/Remove/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-modal-design-titleHeaderSubmitFooter-v1')]/.toString(),"Expected Image File":/C131481_ExpectedTest1.png/.toString(),"Actual Image Name":/C131481_actual_1.png/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        try{
            //Configure Scorecard Step in Pipeline Steps page
            new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Action":/Cancel/.toString())
        }
       catch(all){}catch(Error err){}
        //Refresh
        new actions.selenium.Refresh().run([:])
        try{
            //Configure Scorecard Step in Pipeline Steps page
            new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/new step SC/.toString(),"Individual Assignment User":/Pipeline Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-modal-design-titleHeaderSubmitFooter-v1')]/.toString(),"Expected Image File":/C131481_ExpectedTest2.png/.toString(),"Actual Image Name":/C131481_actual_2.png/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Refresh
        new actions.selenium.Refresh().run([:])
        try{
            //Configure Scorecard Step in Pipeline Steps page
            new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/new step SC/.toString(),"Individual Assignment User":/Moderator/.toString(),"Individual Assignment User Add or Remove":/Remove/.toString())
        }
       catch(all){}catch(Error err){}
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-modal-design-titleHeaderSubmitFooter-v1')]/.toString(),"Expected Image File":/C131481_ExpectedTest3.png/.toString(),"Actual Image Name":/C131481_actual_3.png/.toString())
        }
       catch(all){println all}catch(Error err){println err}
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131481_actual_1.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131481_actual_2.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131481_actual_3.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}