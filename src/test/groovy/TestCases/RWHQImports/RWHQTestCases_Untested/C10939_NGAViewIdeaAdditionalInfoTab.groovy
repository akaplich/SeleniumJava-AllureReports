package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10939 - NGA View Idea Additional Info Tab
class C10939_NGAViewIdeaAdditionalInfoTab
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Custom App Additional Info in View Idea page
        Action582cda9fe8039c480df2a2f9("Single Choice Additional Question":/Dropdown Answer1/.toString(),"Short Answer Additional Question":/Short Ans/.toString(),"Long Answer Additional Question":/Long Ans/.toString(),"Single Checkbox Additional Question":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Verify Custom App Additional Info in NGA View Idea page
        Action5a271e3669691a540e8c114a("Single Choice Additional Question":/Dropdown Answer1/.toString(),"Short Answer Additional Question":/Short Ans/.toString(),"Long Answer Additional Question":/Long Ans/.toString(),"Single Checkbox Additional Question":true)
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
    //Set Custom App Additional Info in View Idea page
    public static def Action582cda9fe8039c480df2a2f9(def params){
        //Set View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/${params."Single Choice Additional Question"}/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/${params."Short Answer Additional Question"}/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/${params."Long Answer Additional Question"}/.toString())
        //Set View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/${params."Single Checkbox Additional Question"}/.toString())

    }
    //Verify Custom App Additional Info in NGA View Idea page
    public static def Action5a271e3669691a540e8c114a(def params){
        //Verify NGA View Idea Additional Info Text Field, Dropdown
        new actions.NGAViewIdea.VerifyNGAViewIdeaAdditionalInfoTextField().run("Field Name":/Single Choice Additional Question/.toString(),"Field Value":/${params."Single Choice Additional Question"}/.toString())
        //Verify NGA View Idea Additional Info Text Field, Dropdown
        new actions.NGAViewIdea.VerifyNGAViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/${params."Short Answer Additional Question"}/.toString())
        //Verify NGA View Idea Additional Info Text Field, Dropdown
        new actions.NGAViewIdea.VerifyNGAViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/${params."Long Answer Additional Question"}/.toString())
        //Verify NGA View Idea Additional Info Checkbox
        new actions.NGAViewIdea.VerifyNGAViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/${params."Single Checkbox Additional Question"}/.toString())

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