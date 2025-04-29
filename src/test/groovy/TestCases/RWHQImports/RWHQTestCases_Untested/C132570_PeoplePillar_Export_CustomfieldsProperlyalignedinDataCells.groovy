import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132570 - People Pillar - Export - Custom fields Properly aligned in Data Cells
class C132570_PeoplePillar_Export_CustomfieldsProperlyalignedinDataCells
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
        new actions.SetupUsers.SetEnterpriseSetupProfileFieldspage().run("Select Profile Field Type":/Custom/.toString(),"Section or Field to Edit/Remove":/Custom/.toString(),"Edit or Remove":/Edit/.toString(),"New Field Title":/Email Address/.toString(),"Action":/Save/.toString(),"Click Save":true)
        //Set Enterprise Setup Profile Fields page
        new actions.SetupUsers.SetEnterpriseSetupProfileFieldspage().run("Select Profile Field Type":/Custom/.toString(),"Section or Field to Edit/Remove":/Custom/.toString(),"Edit or Remove":/Edit/.toString(),"New Field Title":/First Name/.toString(),"Action":/Save/.toString(),"Click Save":true)
        //Set Enterprise Setup Profile Fields page
        new actions.SetupUsers.SetEnterpriseSetupProfileFieldspage().run("Select Profile Field Type":/Custom/.toString(),"Section or Field to Edit/Remove":/Custom/.toString(),"Edit or Remove":/Edit/.toString(),"New Field Title":/Last Name/.toString(),"Action":/Save/.toString(),"Click Save":true)
        //Set Enterprise Setup Profile Fields page
        new actions.SetupUsers.SetEnterpriseSetupProfileFieldspage().run("Select Profile Field Type":/Custom/.toString(),"Section or Field to Edit/Remove":/Custom/.toString(),"Edit or Remove":/Edit/.toString(),"New Field Title":/Screen Name/.toString(),"Action":/Save/.toString(),"Click Save":true)
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/C132570/.toString(),"First Name":/origFirst/.toString(),"Last Name":/origLast/.toString(),"Screen Name":/C132570Screen/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/C132570@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Custom Field Name":/Email Address/.toString(),"Custom Field":/newemail@address.com/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Custom Field Name":/First Name/.toString(),"Custom Field":/newfirstname/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Custom Field Name":/Last Name/.toString(),"Custom Field":/newlastname/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Custom Field Name":/Screen Name/.toString(),"Custom Field":/newscreenname/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Export Ideas from Innovations List/Export from People
        new actions.NGAInnovationList.ExportIdeasfromInnovationsList().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/C132570@mailinator.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/People-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["origFirst origLast","C132570Screen","C132570@mailinator.com","Active","System Administrator","Registered","${todaysDate}","newemail@address.com","newfirstname","newlastname","newscreenname"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
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