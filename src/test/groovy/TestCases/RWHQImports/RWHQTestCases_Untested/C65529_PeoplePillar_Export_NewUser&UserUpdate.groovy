import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C65529 - People Pillar - Export - New User & User Update
class C65529_PeoplePillar_Export_NewUserRedwoodHQTestCaseUserUpdate
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/bright65529_2/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/bright65529_2@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/QA,SA/.toString(),"Add or Remove Expertise":/Add,Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/ExportGroup/.toString(),"User":/Auto/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/peopleexport_1@mailinator.com/.toString(),"First Name":/FN/.toString(),"Last Name":/LN/.toString(),"Screen Name":/SN/.toString(),"Job Title":/IPM/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString(),"Action":/Add User/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/peopleexport_1@mailinator.com/.toString())
        //Add Certifications to a User
        new actions.People.AddCertificationstoaUser().run("Certifications":/Design Thinking/.toString(),"Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Set User Menu in People Pillar
        new actions.People.SetUserMenuInPeoplePillar().run("Menu Option":/Deactivate User/.toString(),"Enable Checkbox":true,"Action":/Deactivate User/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Export Ideas from Innovations List/Export from People
        new actions.NGAInnovationList.ExportIdeasfromInnovationsList().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/bright65529_2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/People-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Autofirst Autolast","Auto","bright65529_2@mailinator.com","Active","System Administrator","Registered","ExportGroup","QA,SA"],"Number of Matches":/1/.toString(),"Total Number of Rows":/15/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/People-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["FN LN","SN","peopleexport_1@mailinator.com","Active"],"Number of Matches":/0/.toString(),"Total Number of Rows":/15/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/People-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["FN LN","SN","peopleexport_1@mailinator.com","Not Registered","IPM","Innovation","United States","Design Thinking"],"Number of Matches":/1/.toString(),"Total Number of Rows":/15/.toString())
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