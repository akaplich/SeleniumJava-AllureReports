package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C17690 - Send Message
class C17690_SendMessage
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Enable Messages in new Global Nav":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Messages in Messages Global Navigation
        new actions.Messages.AccessMessagesinMessagesGlobalNavigation().run("Send a New Message":true)
        //Set Message in Message Pop up
        new actions.general.SetMessageinMessagePopup().run("Recipient":/End User/.toString(),"Subject":/First Personal Message/.toString(),"Message Body":/This is the First Personal Message to End User from System Admin/.toString(),"Action":/Send/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Private message sent successfully!/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Messages in Messages Global Navigation
        new actions.Messages.AccessMessagesinMessagesGlobalNavigation().run("Sender":/System Admin/.toString(),"Message":/This is the First Personal Message to End User from System Admin/.toString())
        //Verify Private Messages on View Private Message
        new actions.Messages.VerifyPrivateMessagesonViewPrivateMessage().run("Title":/First Personal Message/.toString(),"Sender":/System Admin/.toString(),"Message":/This is the First Personal Message to End User from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Set Actions on View Private Message
        new actions.Messages.SetActionsonViewPrivateMessage().run("Reply Message":/Reply from End User to System Admin/.toString())
        //Verify Private Messages on View Private Message
        new actions.Messages.VerifyPrivateMessagesonViewPrivateMessage().run("Title":/First Personal Message/.toString(),"Sender":/Me/.toString(),"Message":/Reply from End User to System Admin/.toString(),"Image":true,"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Messages in Messages Global Navigation
        new actions.Messages.AccessMessagesinMessagesGlobalNavigation().run("Sender":/End User/.toString(),"Message":/Reply from End User to System Admin/.toString())
        //Verify Private Messages on View Private Message
        new actions.Messages.VerifyPrivateMessagesonViewPrivateMessage().run("Title":/First Personal Message/.toString(),"Sender":/Me/.toString(),"Message":/This is the First Personal Message to End User from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Private Messages on View Private Message
        new actions.Messages.VerifyPrivateMessagesonViewPrivateMessage().run("Title":/First Personal Message/.toString(),"Sender":/End User/.toString(),"Message":/Reply from End User to System Admin/.toString(),"Image":true,"Number of Matches":/1/.toString())
        //Access Messages in Messages Global Navigation
        new actions.Messages.AccessMessagesinMessagesGlobalNavigation().run("Sender":/End User/.toString(),"Message":/Reply from End User to System Admin/.toString())
        //Verify Private Messages on View Private Message
        new actions.Messages.VerifyPrivateMessagesonViewPrivateMessage().run("Title":/First Personal Message/.toString(),"Sender":/Me/.toString(),"Message":/This is the First Personal Message to End User from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Private Messages on View Private Message
        new actions.Messages.VerifyPrivateMessagesonViewPrivateMessage().run("Title":/First Personal Message/.toString(),"Sender":/End User/.toString(),"Message":/Reply from End User to System Admin/.toString(),"Image":true,"Number of Matches":/1/.toString())
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