import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130167 - Standard Licensing - Copy Paste emails in Pipeline Admin and Moderator
class C130167_StandardLicensing_CopyPasteemailsinPipelineAdminandModerator
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/7/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom pipeline/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/NonBI System Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom pipeline/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/for copying content/.toString(),"Description":/pipelineadmin@test.com; brightC130167pa_1@mailinator.com; brightC130167pa_2@mailinator.com/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='idea-form-description']\/\/DIV[starts-with(@class,'redactor-styles redactor-in redactor-in')]/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + C/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Action":/Save Draft/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true)
        }
       catch(all){}catch(Error err){}
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[contains(text(),'Pipeline Administrators')]\/..\/following-sibling::*[contains(@class,'f-member-typeahead')][1]\/\/*[@class='react-tags__combobox-input']/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + Shift + V/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Newly added users will receive an Invite Email to complete registration./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Edit Invite Email/.toString(),"Should Exist":true)
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Click Save":true)
        }
       catch(all){}catch(Error err){}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom pipeline/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/for copying content/.toString(),"Description":/brightC130167mod_1@mailinator.com; moderator@test.com/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='idea-form-description']\/\/DIV[starts-with(@class,'redactor-styles redactor-in redactor-in')]/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + C/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Action":/Save Draft/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        try{
            //Set Roles in Pipeline Setup Page
            new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true)
        }
       catch(all){}catch(Error err){}
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[contains(text(),'Pipeline Moderators')]\/..\/following-sibling::*[contains(@class,'f-member-typeahead')][1]\/\/input/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + Shift + V/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/Assigning a user to either the Pipeline Administrator or Pipeline Moderator role for this pipeline requires granting the user one of the following licenses:Brightidea Administrator license (1 Available)Get more licensesUsers will receive an email notification about their role assignment. Edit Template/.toString(),"Info Message Exists":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Administrators/.toString(),"User":/Pipeline Admin/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Administrators/.toString(),"User":/NonBI System Admin/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Administrators/.toString(),"User":/brightC130167pa_1@mailinator.com/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Administrators/.toString(),"User":/brightC130167pa_2@mailinator.com/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/Moderator/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/brightC130167mod_1@mailinator.com/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
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