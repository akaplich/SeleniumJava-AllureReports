package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10935 - NGA View Idea Description Tab
class C10935_NGAViewIdeaDescriptionTab
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
        new actions.SetupIdeas.SetEnterpriseSetupIdeasIdeaSettingsTab().run("Unified Commenting Experience":false)
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC10935_7/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea Title/.toString(),"Description":/test idea1 desc/.toString(),"Tag Name":/tag1/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/New Product/.toString(),"Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question Name":/Answer 1/.toString(),"Checkbox Check":/TRUE/.toString(),"Short Answer Question":/short1/.toString(),"Long Answer Question":/long1/.toString(),"Dropdown Question":/Answer 3/.toString(),"Date Question":/10\/19\/2016/.toString(),"Number Question":/12345/.toString(),"User Selection Question Name":/Auto/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Admin Only Dropdown Question":/Answer 1/.toString(),"Required Short Question":/required short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Add Comment in View Idea page
        new actions.ViewIdeaComment.AddCommentinViewIdeapage().run("Comment":/New Comment/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/Idea Title/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/Idea Title/.toString(),"Idea Image":true,"Points":/1/.toString(),"Creator username":/System Admin/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Step":/Review/.toString(),"Tag":/tag1/.toString(),"Tag Should Exist":/TRUE/.toString(),"Description":/test idea1 desc/.toString())
        //Verify Custom App Description tab fields in NGA View Idea page
        new actions.NGAViewIdea.VerifyCustomAppDescriptiontabfieldsinNGAViewIdeapage().run("Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question":/Answer 1/.toString(),"Short Answer Question":/short1/.toString(),"Long Answer Question":/long1/.toString(),"Dropdown Question":/Answer 3/.toString(),"Date Question":/10\/19\/2016/.toString(),"Number Question":/12345/.toString(),"User Selection Question":/Autofirst Autolast/.toString(),"Admin Only Dropdown Question":/Answer 1/.toString(),"Required Short Question":/required short/.toString())
        //Verify Comment In NGA View Idea Page
        new actions.NGAViewIdea.VerifyCommentInNGAViewIdeaPage().run("Comment Section":/Comments/.toString(),"Comment":/New Comment/.toString())
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