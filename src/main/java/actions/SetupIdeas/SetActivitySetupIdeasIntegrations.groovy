package actions.SetupIdeas;

import actions.common.SetupCommon
import actions.selenium.Click
import actions.selenium.SetCheckBox

class SetActivitySetupIdeasIntegrations{
    public void run(def params){
        SetupCommon.NavigateTab(Tab:"Ideas",Section:"Integrations")
        
        SetCheckBox.run(ID:"//*[@id='CB_ENABLE_JIRA_WIDGET_VIEW_IDEA_2']",Check:params."Enable Jira Integration for This Activity")
        SetCheckBox.run(ID:"//*[@id='CB_ENABLE_JIRA_WIDGET_END_USERS']",Check:params." End-user Access to Jira Integration")
        SetCheckBox.run(ID:"//*[@id='CB_IMAGE_CREATION_WITH_AI']",Check:params."AI Image Generation")
        SetCheckBox.run(ID:"//*[@id='CB_AI_IDEA_SUBMISSION']",Check:params."AI Submission Form, AI Assist")
        
        Click.run(ID:"//*[@id='integration_save_button']")
    }
}