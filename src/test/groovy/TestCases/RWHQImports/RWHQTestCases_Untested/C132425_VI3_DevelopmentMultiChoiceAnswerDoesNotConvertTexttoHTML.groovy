import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132425 - VI3 - Development Multi Choice Answer Does Not Convert Text to HTML
class C132425_VI3_DevelopmentMultiChoiceAnswerDoesNotConvertTexttoHTML
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("View Idea 3 in Action Items and Manage Pages":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Enable Commenting":true,"Action":/Disable Schedule/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Dropdown Question/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/<b>Bold Text<\/b> <i>Italic<\/i> <u>Underline<\/u>, greater than &GT/.toString(),"Additional Question Answers Actions":/Add,Add/.toString(),"Development Field":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Dropdown Question 2/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/greater than &GT/.toString(),"Additional Question Answers Actions":/Add/.toString(),"Development Field":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Checkbox Question/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Answers":/&lt;div&gt;Hello&lt;\/div&gt;/.toString(),"Additional Question Answers Actions":/Add/.toString(),"Development Field":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Multichoice Question/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/"Double Quotes" & 'Single Quotes' & <Angle Brackets>/.toString(),"Additional Question Answers Actions":/Add/.toString(),"Development Field":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/<b>Dev<\/b> <i>Short<\/i> <u>Answer<\/u>/.toString(),"Additional Question Type":/Short Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/dev questions test/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Theme 2/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board 20 page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage().run("Idea Name":/dev questions test/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Dev Short Answer/.toString(),"Field Value":/&lt;div&gt;Hello&lt;\/div&gt;/.toString(),"Action":/Save/.toString())
        //Set View Idea 3 Dropdown Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Left/.toString(),"Field Name":/Development Dropdown Question/.toString(),"Field Value":/<b>Bold Text<\/b> <i>Italic<\/i> <u>Underline<\/u>/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Dev Short Answer/.toString(),"Field Value":/Hello/.toString(),"Should Exist":/TRUE/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Development Dropdown Question/.toString(),"Field Value":/<b>Bold Text<\/b> <i>Italic<\/i> <u>Underline<\/u>/.toString(),"Should Exist":/TRUE/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

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