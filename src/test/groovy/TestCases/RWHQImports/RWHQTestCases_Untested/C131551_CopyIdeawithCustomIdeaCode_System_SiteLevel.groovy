import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131551 - Copy Idea with Custom Idea Code - System, Site Level
class C131551_CopyIdeawithCustomIdeaCode_System_SiteLevel
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetEnterpriseSetupIdeasIdeaSettingsTab().run("Custom Idea Code Prefix":/ABC/.toString(),"Customized idea code on the activity level":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Destination/.toString(),"Description":/test desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea3/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc for test idea3/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Short Answer - Title":/Required Short Question/.toString(),"Short Answer - Value":/short required/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea4/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc for test idea4/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Short Answer - Title":/Required Short Question/.toString(),"Short Answer - Value":/short required/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString(),"Idea ID":/ABC102/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/ABC113/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea4/.toString(),"Idea ID":/ABC114/.toString(),"Number of Matches":/1/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Set New Copy Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewCopyIdeasinPipelineStepspage().run("Pipeline":/Custom App/.toString(),"Action":/Copy Idea/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/ABC115/.toString(),"Number of Matches":/1/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/ABC115/.toString())
        //Set New Copy Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewCopyIdeasinPipelineStepspage().run("Pipeline":/Destination/.toString(),"Action":/Copy Idea/.toString())
        //Set Missing Development Fields Modal
        new actions.PipelineStepsView.SetMissingDevelopmentFieldsModal().run("Action":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Destination/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/ABC116/.toString(),"Number of Matches":/1/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run([:])
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='custom_idea_code' and @value='ABC']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Custom Idea Code Prefix":/XYZ/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/ABC115/.toString())
        //Set New Copy Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewCopyIdeasinPipelineStepspage().run("Pipeline":/Destination/.toString(),"Action":/Copy Idea/.toString())
        //Set Missing Development Fields Modal
        new actions.PipelineStepsView.SetMissingDevelopmentFieldsModal().run("Action":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Destination/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/XYZ116/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Idea ID":/XYZ117/.toString(),"Number of Matches":/1/.toString())
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