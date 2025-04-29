import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130760 - Top Idea By Category - All Hidden Ideas - As Pipeline Admin, Moderator, Analyst
class C130760_TopIdeaByCategory_AllHiddenIdeas_AsPipelineAdmin_Moderator_Analyst
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/BIW Auto/.toString(),"Description":/this is idea box app Test App/.toString(),"Pipeline Administrators":/pipelineadmin@test.com/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Analysts":/analyst/.toString(),"Analysts Add or Remove":/Add/.toString(),"Click Save":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Ideas for Top Ideas
        new actions.SetupIdeas.SetSiteSetupIdeasforTopIdeas().run("Top Ideas by Category":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/BIW Auto/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/test idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/test idea2/.toString(),"Action":/Submit/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1","test idea2"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea2/.toString())
        //Set Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.SetRightClickMenuInTopIdeas().run("Select Option":/Change category.../.toString())
        //Change Category via Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.TopIdeaChangeCategoryViaRightClickMenu().run("Choose Category":/New Product/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/BIW Auto/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1","test idea2"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea2/.toString())
        //Set Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.SetRightClickMenuInTopIdeas().run("Select Option":/Change category.../.toString())
        //Change Category via Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.TopIdeaChangeCategoryViaRightClickMenu().run("Choose Category":/Strategy/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/BIW Auto/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1","test idea2"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea2/.toString())
        //Set Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.SetRightClickMenuInTopIdeas().run("Select Option":/Change category.../.toString())
        //Change Category via Right Click Menu in Top Ideas
        new actions.PipelineTopIdeas.TopIdeaChangeCategoryViaRightClickMenu().run("Choose Category":/New Product/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/BIW Auto/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1","test idea2"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea2/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Change category.../.toString(),"Should Exist":false)
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