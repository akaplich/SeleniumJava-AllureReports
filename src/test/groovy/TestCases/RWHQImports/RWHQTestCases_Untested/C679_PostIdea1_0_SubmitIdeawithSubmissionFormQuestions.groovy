package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C679 - Post Idea 1.0 - Submit Idea with Submission Form Questions
class C679_PostIdea1_0_SubmitIdeawithSubmissionFormQuestions
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup BI Deprecated
        new actions.SetupBI.SetWebstormSetupBIDeprecated().run("Post Idea 2.0":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id='rqdTITLE']/.toString(),"ID Type":/XPath/.toString(),"Text":/Idea Title/.toString(),"Type of Clear":/Cut/.toString())
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/*[@id='main_form']\/SPAN[2]\/LABEL[1]/.toString(),"ID Type":/XPath/.toString())
        }
       catch(all){}catch(Error err){}
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='Textarea1']/.toString(),"ID Type":/XPath/.toString())
        //Set Focus on Element
        new actions.selenium.SetFocus().run("ID":/\/\/*[@id='Textarea1']/.toString(),"ID Type":/XPath/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id='Textarea1']/.toString(),"ID Type":/XPath/.toString(),"Text":/Idea Description/.toString(),"Type of Clear":/Cut/.toString())
        //Select Item In Element
        new actions.selenium.SelectItem().run("ID":/\/\/*[@id='rqdCB_CATEGORY']/.toString(),"ID Type":/XPath/.toString(),"Visible Text":/New Product/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[text()='Multiple Choice Question']\/..\/INPUT[1]/.toString(),"ID Type":/XPath/.toString())
        //Set Checkbox
        new actions.selenium.SetCheckBox().run("ID":/\/\/SPAN[text()='Checkbox Question']\/\/..\/\/INPUT[1]/.toString(),"ID Type":/XPath/.toString(),"Check":true)
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[text()='Required Short Question*']\/..\/\/INPUT/.toString(),"ID Type":/XPath/.toString(),"Text":/Required short/.toString(),"Type of Clear":/Cut/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='Submit7']/.toString(),"ID Type":/XPath/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/Idea Title/.toString(),"Category":/New Product/.toString(),"Linked Submissions":[])
        //Verify Custom App Description tab fields in View Idea page
        Action5812921cfa4ee77809f46b4f("Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question":/Answer 1/.toString(),"Required Short Question":/Required short/.toString())
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