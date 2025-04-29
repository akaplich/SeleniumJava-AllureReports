import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129389 - Move Ideas - Source Pipeline - Additional Info Intact, Saved When Moved Back
class C129389_MoveIdeas_SourcePipeline_AdditionalInfoIntact_SavedWhenMovedBack
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup BI Deprecated
        new actions.SetupBI.SetWebstormSetupBIDeprecated().run("Enable Additional Info Fields":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer1/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/short test1/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test1/.toString())
        //Set View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Set View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer2/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/short test2/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test2/.toString())
        //Set View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Set View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer3/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/short test3/.toString())
        //Set View Idea Additional Info Text Field
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test3/.toString())
        //Set View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.SetViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/TRUE/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/test idea1,test idea2/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Pipeline A/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Action":/Move Idea/.toString())
        //Set Missing Development Fields Modal
        new actions.PipelineStepsView.SetMissingDevelopmentFieldsModal().run("Action":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        try{
            //Verify View Idea Additional Info Dropdown
            new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer1/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Additional Info fields have not been configured for this Initiative/.toString(),"Should Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        try{
            //Verify View Idea Additional Info Dropdown
            new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer2/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Additional Info fields have not been configured for this Initiative/.toString(),"Should Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Verify View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer3/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/short test3/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test3/.toString())
        //Verify View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/test idea1,test idea2/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Custom App/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Action":/Move Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer1/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/short test1/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test1/.toString())
        //Verify View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Verify View Idea Additional Info Dropdown
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoDropdown().run("Field Name":/Single Choice Additional Question (Dropdown)/.toString(),"Field Value":/Dropdown Answer2/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Short Answer Additional Question/.toString(),"Field Value":/short test2/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test2/.toString())
        //Verify View Idea Additional Info Checkbox
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoCheckbox().run("Field Name":/Single Checkbox Additional Question/.toString(),"Check":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Verify View Idea Additional Info Text Field
        new actions.ViewIdeaFields.VerifyViewIdeaAdditionalInfoTextField().run("Field Name":/Long Answer Additional Question/.toString(),"Field Value":/long test3/.toString())
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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