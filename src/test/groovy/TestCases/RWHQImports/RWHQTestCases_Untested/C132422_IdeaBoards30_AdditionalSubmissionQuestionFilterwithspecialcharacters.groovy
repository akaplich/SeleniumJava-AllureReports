import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132422 - Idea Boards 30 - Additional Submission Question Filter with special characters
class C132422_IdeaBoards30_AdditionalSubmissionQuestionFilterwithspecialcharacters
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question Name":/Answer 2/.toString(),"Checkbox Check":/TRUE/.toString(),"Dropdown Question":/Answer 3/.toString(),"Required Short Question":/desc/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea2/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Multiple Choice Question":/Answer 3/.toString(),"Checkbox Question Name":/Answer 2/.toString(),"Checkbox Check":/TRUE/.toString(),"Dropdown Question":/Answer 2/.toString(),"Required Short Question":/desc/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Multiple Choice Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"New Question Title":/Multiple Choice | Question/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Checkbox Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"New Question Title":/Checkbox & Question/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dropdown Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"New Question Title":/Dropdown # Question/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Idea Board
        new actions.SetupIdeas.SetWebstormSetuptoIdeaBoard().run("Additional Submission Questions":/Checkbox & Question,Dropdown # Question,Multiple Choice | Question/.toString(),"Additional Submission Questions Check":/TRUE,TRUE,TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Filter Idea in Idea Board page
        new actions.IdeaBoard.FilterIdeainIdeaBoardpage30().run("Status":[],"Stage":[],"Categories":[],"Tags":[],"Admin Tags":[],"Desired Expertise":[])
        //Set Submission Form Question Filter on Idea Boards
        new actions.IdeaBoard.SetSubmissionFormQuestionFilteronIdeaBoards().run("Question":/Multiple Choice | Question/.toString(),"Answers":/Answer 1/.toString(),"Answers Check":/TRUE/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Set Submission Form Question Filter on Idea Boards
        new actions.IdeaBoard.SetSubmissionFormQuestionFilteronIdeaBoards().run("Question":/Checkbox & Question/.toString(),"Answers":/Answer 2/.toString(),"Answers Check":/TRUE/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea2/.toString(),"Number of Matches":/0/.toString())
        //Set Submission Form Question Filter on Idea Boards
        new actions.IdeaBoard.SetSubmissionFormQuestionFilteronIdeaBoards().run("Question":/Checkbox & Question/.toString(),"Answers":/Answer 2/.toString(),"Answers Check":/TRUE/.toString())
        //Set Submission Form Question Filter on Idea Boards
        new actions.IdeaBoard.SetSubmissionFormQuestionFilteronIdeaBoards().run("Question":/Multiple Choice | Question/.toString(),"Answers":/Answer 1,Answer 3/.toString(),"Answers Check":/FALSE,TRUE/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString(),"Number of Matches":/0/.toString())
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