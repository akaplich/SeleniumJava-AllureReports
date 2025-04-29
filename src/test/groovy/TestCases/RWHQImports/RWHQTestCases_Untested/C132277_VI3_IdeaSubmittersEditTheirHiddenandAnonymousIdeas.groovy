import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132277 - VI3 - Idea Submitters Edit Their Hidden and Anonymous Ideas
class C132277_VI3_IdeaSubmittersEditTheirHiddenandAnonymousIdeas
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
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Hide ideas after submission":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Submitter":/Anonymous/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/required/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Short Answer Question/.toString(),"Field Value":/update anonym/.toString(),"Action":/Save/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Title/.toString(),"Field Value":/edited test idea3/.toString(),"Action":/Save/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/updated desc for test idea3/.toString(),"Action":/Save/.toString())
        //Set Tags in View Idea 3.0 Page
        new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Tag Name":/tag1/.toString(),"Add or Remove":/Add/.toString())
        try{
            //Set View Idea 3 Dropdown Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Right/.toString(),"Field Name":/Category/.toString(),"Field Value":/Operations/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set View Idea 3 Dropdown Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Right/.toString(),"Field Name":/Status/.toString(),"Field Value":/Paused/.toString())
        }
       catch(all){}catch(Error err){}
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/edited test idea3/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Short Answer Question/.toString(),"Field Value":/update anonym/.toString(),"Should Exist":true)
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Idea Name":/edited test idea3/.toString(),"Description":/updated desc for test idea3/.toString(),"Category":/Operations/.toString(),"Submitter Name":/Anonymous/.toString(),"Tag":/tag1/.toString(),"Tag Should Exist":/TRUE/.toString())
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