import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132204 - VI3 - Subscribe To Tags with Automatic Subscription Enabled
class C132204_VI3_SubscribeToTagswithAutomaticSubscriptionEnabled
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/SubscribeToTagsIdea/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/End User/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/Idea where user subscribes to tags/.toString(),"Category":/New Product/.toString(),"Required Short Question":/Required Short Answer/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/SubscribeToTagsIdea/.toString())
        try{
            //Set Tags in View Idea 3.0 Page
            new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Set Tab":/Admin Tags,Tags/.toString(),"Tag Name":/adminTag1234,tagbyadmin/.toString(),"Add or Remove":/Add,Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/System Admin/.toString(),"Idea Name":/SubscribeToTagsIdea(D113)/.toString(),"Idea Image":true,"Status":/Submitted/.toString(),"Submitter Name":/System Admin/.toString(),"Tag":/tagbyadmin/.toString(),"Tag Should Exist":/TRUE/.toString(),"Admin Tag":/adminTag1234/.toString(),"Admin Tag Should Exist":/TRUE/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/adminTag1234/.toString(),"SubscribeTooltip":/None/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/tagbyadmin/.toString(),"SubscribeTooltip":/Subscribed/.toString(),"ExpectedSubscribersCount":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/SubscribeToTagsIdea/.toString())
        //Set Tags in View Idea 3.0 Page
        new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Tag Name":/newtag1234,tag1/.toString(),"Add or Remove":/Add,Add/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/System Admin/.toString(),"Idea Name":/SubscribeToTagsIdea(D113)/.toString(),"Idea Image":true,"Submitter Name":/System Admin/.toString(),"Tag":/newtag1234,tag1,tagbyadmin/.toString(),"Tag Should Exist":/TRUE,TRUE,TRUE/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/tagbyadmin/.toString(),"SubscribeTooltip":/Subscribe/.toString(),"ExpectedSubscribersCount":/1/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/newtag1234/.toString(),"SubscribeTooltip":/Subscribed/.toString(),"ExpectedSubscribersCount":/1/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/tag1/.toString(),"SubscribeTooltip":/Subscribed/.toString(),"ExpectedSubscribersCount":/1/.toString())
        //Set Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.SetSubscribeToTagsOnViewIdea30Page().run("Tag Name":/newtag1234/.toString())
        //Set Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.SetSubscribeToTagsOnViewIdea30Page().run("Tag Name":/tag1/.toString())
        //Set Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.SetSubscribeToTagsOnViewIdea30Page().run("Tag Name":/tagbyadmin/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/newtag1234/.toString(),"SubscribeTooltip":/Subscribe/.toString(),"ExpectedSubscribersCount":/0/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/tag1/.toString(),"SubscribeTooltip":/Subscribe/.toString(),"ExpectedSubscribersCount":/0/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/tagbyadmin/.toString(),"SubscribeTooltip":/Subscribed/.toString(),"ExpectedSubscribersCount":/2/.toString())
        //Set Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.SetSubscribeToTagsOnViewIdea30Page().run("Tag Name":/tagbyadmin/.toString())
        //Verify Subscribe To Tags On ViewIdea 30 Page
        new actions.ViewIdea30.VerifySubscribeToTagsOnViewIdea30Page().run("TagName":/tagbyadmin/.toString(),"SubscribeTooltip":/Subscribe/.toString(),"ExpectedSubscribersCount":/1/.toString())
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