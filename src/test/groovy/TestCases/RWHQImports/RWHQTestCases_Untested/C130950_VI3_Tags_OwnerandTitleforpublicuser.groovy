package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130950 - VI3 - Tags, Owner and Title for public user
class C130950_VI3_Tags_OwnerandTitleforpublicuser
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
        //Delete this Action when View Idea 30 is Enabled
        Action6018a1600aed291c14413fd2([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Site for Security Tab
        new actions.SetupSite.SetWebstormSetupSiteSecurity().run("What type of site do you want?":/Public/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Tags in View Idea 3.0 Page
        new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Set Tab":/Admin Tags/.toString(),"Tags":/admintag1/.toString(),"Add or Remove":/Add/.toString())
        //Set Submitter or Owner in View Idea 3 Using Dropdown
        new actions.ViewIdea30.SetSubmitterinViewIdea3UsingDropdown().run("Field":/Owner/.toString(),"Search User Text":/Pipeline Sponsor/.toString(),"User":/Pipeline Sponsor/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Public Webstorm Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/End User/.toString(),"Idea Name":/test idea1(D102)/.toString(),"Idea Image":true,"Category":/New Product/.toString(),"Status":/Under Review/.toString(),"Submitter Name":/Sri/.toString(),"Submitter Image":true,"Tag":/tag1/.toString(),"Tag Should Exist":/TRUE/.toString(),"Admin Tag":/admintag1/.toString(),"Admin Tag Should Exist":/FALSE/.toString(),"Owner":/Pipeline Sponsor/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        try{
            //Set Tags in View Idea 3.0 Page
            new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Set Tab":/Tags/.toString(),"Tags":/tag2,tag1/.toString(),"Add or Remove":/Add,Remove/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Submitter or Owner in View Idea 3 Using Dropdown
            new actions.ViewIdea30.SetSubmitterinViewIdea3UsingDropdown().run("Field":/Owner/.toString(),"Clear owner":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Set View Idea 3 Description Tab Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Title/.toString(),"Field Value":/edited version of test idea1/.toString(),"Action":/Save/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/End User/.toString(),"Idea Name":/test idea1(D102)/.toString(),"Idea Image":true,"Category":/New Product/.toString(),"Status":/Under Review/.toString(),"Submitter Name":/Sri/.toString(),"Submitter Image":true,"Tag":/tag1,tag2/.toString(),"Tag Should Exist":/TRUE,FALSE/.toString(),"Admin Tag":/admintag1,tag2/.toString(),"Admin Tag Should Exist":/FALSE,FALSE/.toString(),"Owner":/Pipeline Sponsor/.toString())
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
    //Delete this Action when View Idea 30 is Enabled
    public static def Action6018a1600aed291c14413fd2(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)

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