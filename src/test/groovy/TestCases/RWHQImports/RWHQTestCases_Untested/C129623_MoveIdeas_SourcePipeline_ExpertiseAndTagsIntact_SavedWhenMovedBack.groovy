import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129623 - Move Ideas - Source Pipeline - Expertise & Tags Intact, Saved When Moved Back
class C129623_MoveIdeas_SourcePipeline_ExpertiseAndTagsIntact_SavedWhenMovedBack
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set View Idea Description Tab Desired Expertise
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabDesiredExpertise().run("Expertise Name":/Expertise11,Expertise12/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Save/.toString())
        //Set Tag for View Idea page
        new actions.ViewIdea.SetTagforViewIdeapage().run("Tag Name":/tag11,tag12/.toString(),"Add or Remove":/Add,Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Set View Idea Description Tab Desired Expertise
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabDesiredExpertise().run("Expertise Name":/Expertise21,Expertise22/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Save/.toString())
        //Set Tag for View Idea page
        new actions.ViewIdea.SetTagforViewIdeapage().run("Tag Name":/tag21,tag22/.toString(),"Add or Remove":/Add,Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Set View Idea Description Tab Desired Expertise
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabDesiredExpertise().run("Expertise Name":/Expertise31,Expertise32/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Save/.toString())
        //Set Tag for View Idea page
        new actions.ViewIdea.SetTagforViewIdeapage().run("Tag Name":/tag31,tag32/.toString(),"Add or Remove":/Add,Add/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/test idea1,test idea2/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Pipeline A/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Action":/Move Idea/.toString())
        //Set Missing Development Fields Modal
        new actions.PipelineStepsView.SetMissingDevelopmentFieldsModal().run("Action":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Expertise Required/.toString(),"Field Value":/Expertise31, Expertise32/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Tag":/tag31,tag32/.toString(),"Tag Should Exist":/TRUE,TRUE/.toString(),"Linked Submissions":[])
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
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Tag":/tag11,tag12/.toString(),"Tag Should Exist":/TRUE,TRUE/.toString(),"Linked Submissions":[])
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Expertise Required/.toString(),"Field Value":/Expertise11, Expertise12/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Tag":/tag21,tag22/.toString(),"Tag Should Exist":/TRUE,TRUE/.toString(),"Linked Submissions":[])
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Expertise Required/.toString(),"Field Value":/Expertise21, Expertise22/.toString())
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