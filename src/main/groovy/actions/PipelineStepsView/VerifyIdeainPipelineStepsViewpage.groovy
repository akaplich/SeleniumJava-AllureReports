package actions.PipelineStepsView;

import actions.selenium.utils.VerifyNumberOfMatches


class VerifyIdeainPipelineStepsViewpage{
    public void run(def params){
        //Map all values that will be used for verification for that instance
        def verify = [:]
        def baseXPath = params."Placement Number"
            ? "(//*[@id='content-inside'])[${params."Placement Number"}]/DIV//P[contains(.,'${params."Idea Name"}')]"
            : "//*[@id='content-inside']/DIV//P[contains(.,'${params."Idea Name"}')]"
        
        // Add Idea ID constraint if provided
        if (params."Idea ID") {
            baseXPath += "[.//A[normalize-space()='${params."Idea ID"}']]"
        }

        // Add Step Name constraint if provided
        if (params."Step Name idea belongs to") {
            baseXPath += "[./../../../../../../../../../../../..//SPAN[@class='step_header_name' and text()='${params."Step Name idea belongs to"}']]"
        }
        verify.ID = baseXPath
        if(params."Number of Matches"){verify."Number of Matches" = params."Number of Matches".toInteger()}
        verify.Timeout=15
        VerifyNumberOfMatches.run(verify) 
    }
}