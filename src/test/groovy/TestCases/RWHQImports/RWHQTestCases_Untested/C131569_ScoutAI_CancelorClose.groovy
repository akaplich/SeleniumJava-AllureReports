package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131569 - Scout AI - Cancel or Close
class C131569_ScoutAI_CancelorClose
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
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Scout/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Scout Process Test/.toString(),"Description":/Description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout Process Test/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Dropdown for Non Memo
        new actions.PipelineStepsView.SetQuickAddDropdownforNonMemo().run("Option":/Generate with AI Assist ✨/.toString())
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Type":/Solar Energy/.toString(),"Search Type":/Using Button/.toString())
        //Verify AI Toast Message
        new actions.PipelineStepsView.VerifyToastMessage().run("Toast Message":/Thanks for waiting, your AI content is on its way!/.toString())
        //Return All Companies or Description from Scout App AI Modal
        variables."titleList" = new actions.PipelineStepsView.ReturnAllCompaniesfromScoutAppAIModal().run("Company or Description":/Company/.toString())
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Action":/Cancel/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Companies imported successfully!/.toString(),"Should Exist":false)
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Screen Companies/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Set Quick Add Dropdown for Non Memo
        new actions.PipelineStepsView.SetQuickAddDropdownforNonMemo().run("Option":/Generate with AI Assist ✨/.toString())
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Type":/Brightidea/.toString(),"Search Type":/Using Button/.toString())
        //Verify AI Toast Message
        new actions.PipelineStepsView.VerifyToastMessage().run("Toast Message":/Thanks for waiting, your AI content is on its way!/.toString())
        //Return All Companies or Description from Scout App AI Modal
        variables."titleList" = new actions.PipelineStepsView.ReturnAllCompaniesfromScoutAppAIModal().run("Company or Description":/Company/.toString())
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Action":/Close/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Companies imported successfully!/.toString(),"Should Exist":false)
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Screen Companies/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
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