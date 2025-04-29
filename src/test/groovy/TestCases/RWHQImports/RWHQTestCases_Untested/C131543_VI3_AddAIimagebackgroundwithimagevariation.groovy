import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131543 - VI3 - Add AI image background with image variation
class C131543_VI3_AddAIimagebackgroundwithimagevariation
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/test idea1/.toString())
        //Set Cover Image in View Idea 3 page
        new actions.ViewIdea30.SetCoverImageinViewIdea3page().run([:])
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Upload/.toString())
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Choose File":/Image5.jpg/.toString(),"Wait for Image to load":true,"Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/test idea1/.toString())
        //Set Cover Image in View Idea 3 page
        new actions.ViewIdea30.SetCoverImageinViewIdea3page().run([:])
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Generate Image/.toString())
        //Set Generate AI Image
        new actions.WebstormHomepage.SetGenerateAIImage().run("Text to Search":/yosemite/.toString(),"Action to Generate Images":/Click on Enter Key/.toString(),"AI Image Number to Open Dropdown Menu":/3/.toString(),"Image Dropdown Menu":/Generate variation/.toString())
        //Set Generate AI Image
        new actions.WebstormHomepage.SetGenerateAIImage().run("Action to Generate Images":/Click on Generate button/.toString())
        //Set Generate AI Image
        new actions.WebstormHomepage.SetGenerateAIImage().run("Action to Generate Images":/Click on Generate button/.toString(),"AI Image Number to Click":/9/.toString(),"Action":/Add Image/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Idea updated successfully!/.toString(),"Should Exist":true)
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/test idea1(D102)/.toString(),"Idea Image":true,"Category":/New Product/.toString(),"Status":/Under Review/.toString(),"Submitter Name":/Sri/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/2/.toString(),"Attachment File":/yosemite/.toString(),"Should it have cover image icon":false,"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/2/.toString(),"Attachment File":/Image5.jpg/.toString(),"Should it have cover image icon":true,"Number of Matches":/1/.toString())
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