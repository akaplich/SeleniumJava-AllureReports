import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C7885 - Community Home Visual Initiative Widget Change Order
class C7885_CommunityHomeVisualInitiativeWidgetChangeOrder
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
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Newly Added Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Newly Added Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Solve App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Newly Added Community/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Visual Initiative List (Large)/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Newly Added Community/.toString())
        //Verify Widget Exists
        new actions.Widgets.VerifyWidgetExists().run("Widget Name":/Visual Initiative List (Large)/.toString(),"Number of Matches":/1/.toString())
        //Verify Webstorms In Large Visual Webstorm List Display Order
        new actions.Widgets.VerifyWebstormsInLargeVisualWebstormListDisplayOrder().run("Name":/Custom App/.toString(),"Order Number":/1/.toString())
        //Verify Webstorms In Large Visual Webstorm List Display Order
        new actions.Widgets.VerifyWebstormsInLargeVisualWebstormListDisplayOrder().run("Name":/Solve App/.toString(),"Order Number":/2/.toString())
        //Set Visual Webstorm List Large
        new actions.Widgets.SetVisualWebstormListLarge().run("Widget Name":/Visual Initiative List (Large)/.toString(),"Idea Name To Drag Down":/Custom App/.toString(),"New Row Number":/2/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Evaluators app/.toString(),"Should Exist":false)
        //Verify Webstorms In Large Visual Webstorm List Display Order
        new actions.Widgets.VerifyWebstormsInLargeVisualWebstormListDisplayOrder().run("Name":/Solve App/.toString(),"Order Number":/1/.toString())
        //Verify Webstorms In Large Visual Webstorm List Display Order
        new actions.Widgets.VerifyWebstormsInLargeVisualWebstormListDisplayOrder().run("Name":/Custom App/.toString(),"Order Number":/2/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Webstorms In Large Visual Webstorm List Display Order
        new actions.Widgets.VerifyWebstormsInLargeVisualWebstormListDisplayOrder().run("Name":/Solve App/.toString(),"Order Number":/1/.toString())
        //Verify Webstorms In Large Visual Webstorm List Display Order
        new actions.Widgets.VerifyWebstormsInLargeVisualWebstormListDisplayOrder().run("Name":/Custom App/.toString(),"Order Number":/2/.toString())
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