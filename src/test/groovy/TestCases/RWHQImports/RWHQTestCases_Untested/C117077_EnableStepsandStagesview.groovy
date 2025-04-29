package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117077 - Enable Steps and Stages view
class C117077_EnableStepsandStagesview
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Steps/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Review/.toString(),"Idea Count":/3/.toString(),"Stage in which this step is displayed":/Collection/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Single Scale/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Evaluation/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Scorecarding/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Evaluation/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Stack Rank/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Selection/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Project Prep/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Implementation/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Development/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Implementation/.toString(),"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Pairwise/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Completion/.toString(),"Placement Number":/7/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Completed/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Completion/.toString(),"Placement Number":/8/.toString(),"Number of Matches":/1/.toString())
        //Verify Steps in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyStepsinPipelineStepsViewforEndUsers().run("Step":/Judging/.toString(),"Idea Count":/0/.toString(),"Stage in which this step is displayed":/Completion/.toString(),"Placement Number":/9/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/test idea1/.toString(),"Step idea belongs to":/Review/.toString(),"Stage idea belongs to":/Collection/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/test idea2/.toString(),"Step idea belongs to":/Review/.toString(),"Stage idea belongs to":/Collection/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/quick add1/.toString(),"Step idea belongs to":/Review/.toString(),"Stage idea belongs to":/Collection/.toString(),"Number of Matches":/1/.toString())
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