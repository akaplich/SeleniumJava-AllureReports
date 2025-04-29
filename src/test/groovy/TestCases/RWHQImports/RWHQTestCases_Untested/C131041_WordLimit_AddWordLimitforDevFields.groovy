package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131041 - Word Limit - Add Word Limit for Dev Fields
class C131041_WordLimit_AddWordLimitforDevFields
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Long Answer Question/.toString(),"Additional Question Type":/Long Answer/.toString(),"Development Field":true,"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Development Long Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/20/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Initial Screen/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Development Field":/Development Long Answer Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick add Word Limit Test/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add Word Limit Test/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Initial Screen/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add Word Limit Test/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Long Answer - Title":/Development Long Answer Question/.toString(),"Long Answer - Answer":/Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et 123/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@class='word-limit-text']\/SPAN[@class='total-words' and .='20']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@class='word-limit-text']\/SPAN[@class='limit-words' and .='20']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Development Card Answers
        new actions.ActionItems.VerifyDevelopmentCardAnswers().run("Long Answer - Title":/Development Long Answer Question/.toString(),"Long Answer - Answer":/Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@class='word-limit-text']\/SPAN[@class='total-words' and .='20']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@class='word-limit-text']\/SPAN[@class='limit-words' and .='20']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
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