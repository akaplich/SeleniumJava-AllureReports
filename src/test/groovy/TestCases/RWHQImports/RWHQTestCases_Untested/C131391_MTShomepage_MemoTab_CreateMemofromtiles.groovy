import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131391 - MTS homepage > Memo Tab > Create Memo from tiles
class C131391_MTShomepage_MemoTab_CreateMemofromtiles
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Blank private memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Enter some text...﻿/.toString(),"Should Text Exist":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Executive Summary/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Executive Summary private memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Executive Summary or Quick Take/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/16/.toString(),"Font Color":/rgb(237,125,49)/.toString(),"Should Text Exist":true)
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/What's been tried in the past?/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/12/.toString(),"Font Color":/rgb(0,0,0)/.toString(),"Should Text Exist":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/External & Internal FAQs/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/External & Internal FAQs private memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Generic External & Internal FAQs/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/16/.toString(),"Font Color":/rgb(237,125,49)/.toString(),"Should Text Exist":true)
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/External FAQs/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/12/.toString(),"Font Color":/inherit/.toString(),"Should Text Exist":true)
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/What is the initial investment to create this solution, and where\/how will it be funded? Does the investment continue to maintain the solution?/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/12/.toString(),"Font Color":/rgb(0,0,0)/.toString(),"Should Text Exist":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Press Release/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Press Release private memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/[Quote from Company representative] A quote from a spokesperson in your company describing the solution's value for the customer./.toString(),"Text Font":/calibri/.toString(),"Font Size":/inherit/.toString(),"Font Color":/inherit/.toString(),"Should Text Exist":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Press Release private memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/External & Internal FAQs private memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Executive Summary private memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Blank private memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
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