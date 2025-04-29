import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131881 - Pipeline List View, Top Ideas - Actions Dropdown - Add Tags Dropdown Does Not Get Cut Off
class C131881_PipelineListView_TopIdeas_ActionsDropdown_AddTagsDropdownDoesNotGetCutOff
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
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Idea Box BIW/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/test idea1/.toString(),"Description":/desc1/.toString(),"Tag Name":/testtag1/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/test idea2/.toString(),"Description":/desc1/.toString(),"Tag Name":/testtag2/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/test idea2/.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run([:])
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[contains(@id,'react-tags')]\/\/*[@class='react-tags__combobox-input']/.toString(),"Text":/tag/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[@class='f-modal-design-titleHeaderSubmitFooter-v1']/.toString(),"Expected Image File":/C131881_1_expected.png/.toString(),"Actual Image Name":/C131881_1_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ESCAPE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea1/.toString())
        //Set Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.SetRightClickMenuInTopIdeas().run("Select Option":/Add tags.../.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run([:])
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[contains(@id,'react-tags')]\/\/*[@class='react-tags__combobox-input']/.toString(),"Text":/tag/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[@class='f-modal-design-titleHeaderSubmitFooter-v1']/.toString(),"Expected Image File":/C131881_2_expected.png/.toString(),"Actual Image Name":/C131881_2_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131881_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131881_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}