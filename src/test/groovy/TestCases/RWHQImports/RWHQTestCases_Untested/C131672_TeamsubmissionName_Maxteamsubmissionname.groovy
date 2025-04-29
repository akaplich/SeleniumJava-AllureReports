import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131672 - Team submission Name - Max team submission name
class C131672_TeamsubmissionName_Maxteamsubmissionname
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout Process Test/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout Process Test/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Scout App Post Idea
        new actions.PostIdea.SetScoutAppPostIdea().run("Company Name":/Idea Title/.toString(),"Company Logo or Image":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/End User/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Team Submission Name":/this is to test character count123/.toString(),"Company Description":/Idea Description/.toString(),"Pitch Deck and Supporting Materials":/Image4.jpg/.toString(),"Pitch Deck and Supporting Materials Add or Remove":/Add/.toString(),"Tag Name":/testtag1/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/Blockchain/.toString(),"Company Website":/https:\/\/www.brightidea.com/.toString(),"Company Size":/11 to 50/.toString(),"Company Headquarters Address":/San Francisco/.toString(),"Company Crunch Base Profile":/testing purpose/.toString(),"Primary Contact Name":/testing purpose2/.toString(),"Primary Contact Title and Department":/testing purpose3/.toString(),"Primary Contact Email Address":/testing purpose4/.toString(),"Primary Contact Phone Number":/878-837-3873/.toString(),"Funding Round":/Seed/.toString(),"Total Funding":/$5-10 million/.toString(),"Investors":/testing purpose6/.toString(),"Known Competitors":/testing purpose7/.toString(),"How did you hear about this company?":/Social network connection/.toString(),"How would we acquire the technology from this company?":/Joint Venture/.toString(),"Who are the team members responsible for owning this opportunity?":/testing purpose8/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/Idea Title/.toString(),"Does it have team submission name":true,"Submitter Name":/this is to test character coun/.toString())
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("Submission Team Name":/edit is to test character count123/.toString(),"Action":/Update/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/Idea Title/.toString(),"Does it have team submission name":true,"Submitter Name":/edit is to test character coun/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea Title/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/Idea Title/.toString(),"Does it have team submission name":true,"Submitter Name":/edit is to test character coun/.toString())
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