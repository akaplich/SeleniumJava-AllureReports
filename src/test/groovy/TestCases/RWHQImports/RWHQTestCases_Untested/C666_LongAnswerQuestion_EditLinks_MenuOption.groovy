package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C666 - Long Answer Question - Edit Links, Menu Option
class C666_LongAnswerQuestion_EditLinks_MenuOption
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Test Idea Links Edit/.toString(),"Description":/Description/.toString(),"Category":/New Product/.toString(),"Long Answer Question":/test/.toString())
        //Set Post Idea Link for Text Field
        new actions.SetIdeaFields.SetPostIdeaLinkforTextField().run("Field Name":/Long Answer Question/.toString(),"Link, Unlink or Edit":/Link/.toString(),"Text":/Link to Edit/.toString(),"URL":/www.google.com/.toString(),"Open link in new tab":true,"Link Action":/Insert/.toString())
        //Set Post Idea Link for Text Field
        new actions.SetIdeaFields.SetPostIdeaLinkforTextField().run("Field Name":/Long Answer Question/.toString(),"Text of Link to Edit":/Link to Edit/.toString(),"Link, Unlink or Edit":/Edit/.toString(),"Text":/Edited Link to NY Times/.toString(),"URL":/www.nytimes.com/.toString(),"Open link in new tab":true,"Link Action":/Edit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Required Short Question":/Required Short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Test Idea Links Edit/.toString())
        //Verify Custom App Description tab fields in View Idea page
        Action5812921cfa4ee77809f46b4f("Long AnswerQuestion":/Edited Link to NY Timestest/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/A[contains(text(),'Edited Link to NY Times')]/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify Page Title
        new actions.selenium.VerifyPageTitle().run("Title":/The New York Times - Breaking News, US News, World News and Videos/.toString())
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
    //Verify Custom App Description tab fields in View Idea page
    public static def Action5812921cfa4ee77809f46b4f(def params){
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Expertise Required/.toString(),"Field Value":/${params."Expertise Required"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Multiple Choice Question/.toString(),"Field Value":/${params."Multiple Choice Question"}/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Checkbox Question/.toString(),"Field Value":/${params."Checkbox Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Short Answer Question/.toString(),"Field Value":/${params."Short Answer Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Long Answer Question/.toString(),"Field Value":/${params."Long AnswerQuestion"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dropdown Question/.toString(),"Field Value":/${params."Dropdown Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Date Question/.toString(),"Field Value":/${params."Date Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Number Question/.toString(),"Field Value":/${params."Number Question"}/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/User Selection Question/.toString(),"Field Value":/${params."User Selection Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Admin Only Dropdown Question/.toString(),"Field Value":/${params."Admin Only Dropdown Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Required Short Question/.toString(),"Field Value":/${params."Required Short Question"}/.toString())

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