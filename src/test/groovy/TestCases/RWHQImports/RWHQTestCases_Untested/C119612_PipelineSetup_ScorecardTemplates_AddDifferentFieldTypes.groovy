import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C119612 - Pipeline Setup - Scorecard Templates - Add Different Field Types
class C119612_PipelineSetup_ScorecardTemplates_AddDifferentFieldTypes
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run([:])
        //Create Empty Template in Scorecards - Templates
        new actions.PipelineSetup.CreateEmptyTemplateScorecardsTemplates().run("Template Title":/Test Template1/.toString(),"Action":/Create/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/1/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Required to Answer":true,"Question":/Test Question One Answer/.toString(),"Short Name":/Short Name Test/.toString(),"Tooltip":/Test Tooltip One Answer/.toString(),"Answers":/One,Two,Three/.toString(),"Points":/1,2,3/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/2/.toString(),"Question Type":/Multiple Choice (more than one answer)/.toString(),"Required to Answer":true,"Question":/Test Question More Than One/.toString(),"Short Name":/Short Name Test1/.toString(),"Tooltip":/Test Tooltip More Than One/.toString(),"Answers":/One,Two,Three/.toString(),"Points":/1,2,3/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/3/.toString(),"Question Type":/Select Answer (drop down list)/.toString(),"Required to Answer":true,"Question":/Select Answer Question/.toString(),"Short Name":/Short Name Select/.toString(),"Tooltip":/Test Tooltip Select/.toString(),"Answers":/One,Two,Three/.toString(),"Points":/1,2,3/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/4/.toString(),"Question Type":/Short Answer/.toString(),"Required to Answer":true,"Question":/Short Answer Question/.toString(),"Short Name":/Short Name Short Answer/.toString(),"Tooltip":/Test Tooltip Short Answer/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/5/.toString(),"Question Type":/Long Answer/.toString(),"Required to Answer":true,"Question":/Long Answer Question/.toString(),"Short Name":/Long Name Short Answer/.toString(),"Tooltip":/Test Tooltip Long Answer/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Save Form":true)
        //Set Action for Selected Scorecard Template
        new actions.PipelineSetup.SetActionSelectedScorecardTemplate().run("Go Back":true)
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run("Template Title to Select":/Test Template1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Test Question One Answer/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Test Question More Than One/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Select Answer Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Short Answer Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Long Answer Question/.toString(),"Should Exist":true)
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