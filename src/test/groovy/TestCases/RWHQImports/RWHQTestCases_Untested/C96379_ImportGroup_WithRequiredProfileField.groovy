package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C96379 - Import Group - With Required Profile Field
class C96379_ImportGroup_WithRequiredProfileField
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
        //Set Enterprise Setup Profile Fields page
        new actions.SetupUsers.SetEnterpriseSetupProfileFieldspage().run("Section or Field to Edit/Remove":/Job Title/.toString(),"Edit or Remove":/Edit/.toString(),"Required":true,"Action":/Save/.toString(),"Click Save":true)
        try{
            //Log Out
            new actions.general.LogOut().run([:])
        }
       catch(all){}catch(Error err){}
        try{
            //Login
            new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Edit Your Profile
            new actions.UserProfile.EditYourProfile().run("Job Title":/Test/.toString())
        }
       catch(all){}catch(Error err){}
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/bi.adminuser1@brightidea.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/DiscussApp1/.toString(),"Description":/desc/.toString(),"Import Group as":/General Access,General Access/.toString(),"Import File":/user_importC96379_1.xls,user_importC96379_2.xls/.toString(),"Add or Remove Group":/Add,Add/.toString(),"Import Group Action":/Import,Import/.toString(),"Group Name":/ImportUserGroup1,ImportUserGroup2/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/DiscussApp1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/example2@test.com/.toString(),"Status":/Active/.toString(),"Group":/ImportUserGroup2/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/example1@test.com/.toString(),"Name":/Robert De Niro/.toString(),"Screen Name":/New User/.toString(),"Status":/Active/.toString(),"Job Title":/Engineer/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString(),"Group":/ImportUserGroup1/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/moderator@test.com/.toString(),"Screen Name":/Moderator/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Pipeline Moderator/.toString(),"Job Title":/<EMPTY>/.toString(),"Department":/<EMPTY>/.toString(),"Location":/<EMPTY>/.toString(),"Group":/ImportUserGroup1/.toString(),"Expertise":/<EMPTY>/.toString(),"Number of Matches":/1/.toString())
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