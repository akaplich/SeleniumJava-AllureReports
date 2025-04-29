import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131570 - Scout AI - Change the search in middle of search
class C131570_ScoutAI_Changethesearchinmiddleofsearch
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
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Scout/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Scout Process Test/.toString(),"Description":/Description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout Process Test/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Dropdown for Non Memo
        new actions.PipelineStepsView.SetQuickAddDropdownforNonMemo().run("Option":/Generate with AI Assist ✨/.toString())
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Type":/Brightidea/.toString(),"Search Type":/Using Button/.toString())
        try{
            //Verify AI Toast Message
            new actions.PipelineStepsView.VerifyToastMessage().run("Toast Message":/Thanks for waiting, your AI content is on its way!/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Type":/Pixar/.toString(),"Search Type":/Using Button/.toString())
        //Return All Companies or Description from Scout App AI Modal
        variables."titleList" = new actions.PipelineStepsView.ReturnAllCompaniesfromScoutAppAIModal().run("Company or Description":/Company/.toString())
        //Return All Companies or Description from Scout App AI Modal
        variables."descriptionList" = new actions.PipelineStepsView.ReturnAllCompaniesfromScoutAppAIModal().run("Company or Description":/Description/.toString())
        //Verify Companies in Scout AI Modal
        new actions.PipelineStepsView.VerifyCompaniesinScoutAIModal().run("Company Name":/Brightidea/.toString(),"Number of Matches":/0/.toString())
        //Set Scout App AI Modal
        new actions.PipelineStepsView.SetScoutAppAIModal().run("Action":/Import/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout Process Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Return the element from Company and Description Array for Scout App
        variables."title0" = new actions.Utils.ReturntheelementfromanArray().run("List":/${variables."titleList"}/.toString(),"Element Location Number":/0/.toString())
        //Return the element from Company and Description Array for Scout App
        variables."description0" = new actions.Utils.ReturntheelementfromanArray().run("List":/${variables."descriptionList"}/.toString(),"Element Location Number":/0/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/${variables."title0"}/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/${variables."title0"}/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Description":/${variables."description0"} Generated via Brightidea AI Assist./.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout Process Test/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Return the element from Company and Description Array for Scout App
        variables."title1" = new actions.Utils.ReturntheelementfromanArray().run("List":/${variables."titleList"}/.toString(),"Element Location Number":/1/.toString())
        //Return the element from Company and Description Array for Scout App
        variables."description1" = new actions.Utils.ReturntheelementfromanArray().run("List":/${variables."descriptionList"}/.toString(),"Element Location Number":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/${variables."title1"}/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Description":/${variables."description1"} Generated via Brightidea AI Assist./.toString())
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