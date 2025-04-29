package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C118749 - Post Idea in Venture App
class C118749_PostIdeainVentureApp
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
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Venture/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Venture title/.toString(),"Description":/Venture description/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/20/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Venture App Post Idea
        new actions.PostIdea.SetVentureAppPostIdea().run("Company Name":/Idea Title/.toString(),"Company Logo":/Image5.jpg/.toString(),"Company Logo Crop or Cancel":/Crop/.toString(),"Company Description":/Idea Description/.toString(),"Pitch Deck and Supporting Materials":/Image4.jpg/.toString(),"Pitch Deck and Supporting Materials Add or Remove":/Add/.toString(),"Tags":/testtag1/.toString(),"Tags Add or Remove":/Add/.toString(),"Focus Area":/Telecom/.toString(),"Company Website":/this is for testing purpose/.toString(),"Company Address":/this is for testing purpose2/.toString(),"Is this company actively looking for funding?":/Yes/.toString(),"Amount of capital company is seeking":/this is for testing purpose3/.toString(),"Estimated Pre-Funding Valuation":/this is for testing purpose4/.toString(),"Leadership Biographies":/this is for testing purpose5/.toString(),"Primary Contact Name":/this is for testing purpose6/.toString(),"Primary Contact Email Address":/this is for testing purpose7/.toString(),"Primary Contact Phone Number":/this is for testing purpose8/.toString(),"Primary Contact Social Media Sites":/this is for testing purpose9/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString(),"Image":true,"Username":/System Admin/.toString(),"Description":/Idea Description/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/Idea Title/.toString(),"Idea Image":true,"Creator username":/System Admin/.toString(),"Category":/Telecom/.toString(),"Tag":/testtag1/.toString(),"Tag Should Exist":/TRUE/.toString(),"Description":/Idea Description/.toString(),"Linked Submissions":[])
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Company Website/.toString(),"Field Value":/this is for testing purpose/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Company Address/.toString(),"Field Value":/this is for testing purpose2/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Is this company actively looking for funding?/.toString(),"Field Value":/Yes/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Amount of capital company is seeking/.toString(),"Field Value":/this is for testing purpose3/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Estimated Pre-Funding Valuation/.toString(),"Field Value":/this is for testing purpose4/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Leadership Biographies/.toString(),"Field Value":/this is for testing purpose5/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Primary Contact Name/.toString(),"Field Value":/this is for testing purpose6/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Primary Contact Email Address/.toString(),"Field Value":/this is for testing purpose7/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Primary Contact Phone Number/.toString(),"Field Value":/this is for testing purpose8/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Primary Contact Social Media Sites/.toString(),"Field Value":/this is for testing purpose9/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/Image4.jpg/.toString(),"Number of Matches":/1/.toString())
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