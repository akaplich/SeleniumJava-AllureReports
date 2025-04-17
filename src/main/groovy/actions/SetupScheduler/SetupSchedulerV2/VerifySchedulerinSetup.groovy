package actions.SetupScheduler.SetupSchedulerV2;

import actions.selenium.Exists
import actions.selenium.*
import screens.SiteSetup.SchedulerV2.SchedulerV2Locators
import actions.common.SetupCommon

class VerifySchedulerinSetup{
    public void run(def params){
        
        if (params."Navigate"==true){
        SetupCommon.NavigateTab(Tab:"Scheduling")
        sleep(2000)
        }
        if(params."Status"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.status(params."Status"))==1,"Incorrect Status"
        }
        if(params."Date"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.dateInTopBar(params."Date"))==1,"Incorrect Date in TopBar"
        }
        if(params."Prelaunch End Date"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.prelaunchEndDate(params."Prelaunch End Date"))==1,"Incorrect Prelaunch End date"
            SetFocus.run("ID Type":"By", By:SchedulerV2Locators.hoverPrelaunch)
            if(params."Prelaunch Tooltip"){
                assert Exists.run("ID Type":"By", By:SchedulerV2Locators.reactTooltip(params."Prelaunch Tooltip"))==1,"Incorrect Prelaunch Tooltip"
            }
        }
        if(params."Active Start and End Date"){
            println(SchedulerV2Locators.activeStartAndEndDate(params."Active Start and End Date"))
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.activeStartAndEndDate(params."Active Start and End Date"))==1,"Incorrect Active Start and End Date"
            SetFocus.run("ID Type":"By", By:SchedulerV2Locators.hoverActiveInitiative)
            if(params."Initiative Active Tooltip"){
                assert Exists.run("ID Type":"By", By:SchedulerV2Locators.reactTooltip(params."Initiative Active Tooltip"))==1,"Incorrect Initiative Active Tooltip"
            }
        }
        if(params."Submission Start and End Date"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.submissionStartAndEndDate(params."Submission Start and End Date"))==1,"Incorrect Submission Start and End Date"
           	SetFocus.run("ID Type":"By", By:SchedulerV2Locators.hoverSubmission)
            if(params."Submission Start and End Date Tooltip"){
                assert Exists.run("ID Type":"By", By:SchedulerV2Locators.reactTooltip(params."Submission Start and End Date Tooltip"))==1,"Incorrect Submission Start and End Date Tooltip"
            }
        }
        if(params."Voting Start and End Date"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.votingStartAndEndDate(params."Voting Start and End Date"))==1,"Incorrect Voting Start and End Date"
            SetFocus.run("ID Type":"By", By:SchedulerV2Locators.hoverVoting)
            if(params."Voting Start and End Date Tooltip"){
                assert Exists.run("ID Type":"By", By:SchedulerV2Locators.reactTooltip(params."Voting Start and End Date Tooltip"))==1,"Incorrect Voting Start and End Date Tooltip"
            }
        }
        if(params."Commenting Start and End Date"){
            assert Exists.run("ID Type":"By", By:SchedulerV2Locators.commentingStartAndEndDate(params."Commenting Start and End Date"))==1,"Incorrect Commenting Start and End Date"
            SetFocus.run("ID Type":"By", By:SchedulerV2Locators.hoverCommenting)
            if(params."Commenting Start and End Date Tooltip"){
                assert Exists.run("ID Type":"By", By:SchedulerV2Locators.reactTooltip(params."Commenting Start and End Date Tooltip"))==1,"Incorrect Commenting Start and End Date Tooltip"
            }
        }
    }
}