import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131572 - Step Config Modal - Error Fields - No Dev Fields, No Selected User
class C131572_StepConfigModal_ErrorFields_NoDevFields_NoSelectedUser
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
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Development/.toString(),"Select Tool Type":/Development/.toString(),"Select Stage":/Collection/.toString(),"Action":/Create/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Select a user/.toString(),"Action":/Activate/.toString())
        //Verify Error Field in Modal (New Modals)
        new actions.common.VerifyErrorFieldInModal().run("Number of Error Fields":/1/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Select a user/.toString(),"Selected user":/evaluator@test.com/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Top/.toString())
        //Verify Error Field in Modal (New Modals)
        new actions.common.VerifyErrorFieldInModal().run("Number of Error Fields":/1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'f-modal-body')]\/\/*[contains(@class,'f-include-error') and contains(text(),'You must select at least one question to include')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Development Field":/Development User Select Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/New Development/.toString(),"Action":/Update/.toString())
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