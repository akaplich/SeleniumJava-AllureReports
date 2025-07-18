package actions.Widgets;

import actions.selenium.*
import actions.selenium.utils.VerifyNumberOfMatches

class VerifyPhasesinthePhaseWidget{
    public void run(def params){
        
        // Removed to get 'C132293 - Pipeline Creation - Create Duplicate App with Phases' working. Tested with other related cases and found no need for this snippet.
        //while(Exists.run(ID:"//*[@id='prev-phase' and contains(@style,'block')]")==1){
        //    Click.run(ID:"//*[@id='prev-phase']/div")
        //    sleep(2000)
        // }
        
        while(Exists.run(ID:"//*[@id='phase-list']//SPAN[@class='phase-name' and starts-with(text(),'${params."Phase"}')]")==0 && Exists.run(ID:"//*[@id='next-phase' and contains(@style,'block')]")==1){
            Click.run(ID:"//*[@id='next-phase']/div")
        }
        def verify = [:]
        verify.ID = "//*[contains(@id,'phase')]//SPAN[contains(@class,'phase-name') and starts-with(text(),'${params."Phase"}')]"
        if (params."Phase Status") {
            assert Exists.run(ID:"//*[contains(@id,'phase')]//SPAN[contains(@class,'phase-name') and starts-with(text(),'${params."Phase"}')]/..//SPAN[contains(@class,'phase-status') and starts-with(text(),'${params."Phase Status"}')]") == 1,"Error - Status ${params."Phase Status"} incorrect for ${params."Phase"}"}
        if(params."Phase Description" || params."Phase Start Date" || params."Phase End Date") {
            MouseOver.run(ID:"//*[@id='phase-list']//SPAN[@class='phase-name' and starts-with(text(),'${params."Phase"}')]/..")
            if(params."Phase Description") {
                assert Exists.run(ID:"//DIV[@class='qtip-content']//DIV[starts-with(text(),'${params."Phase"}')]/../..//DIV[@class='phase-tip-description' and contains(text(),'${params."Phase Description"}')]") == 1,"Error - Description ${params."Phase Description"} incorrect for ${params."Phase"}"}
            if(params."Phase Start Date") {
            	assert Exists.run(ID:"//*[contains(@class,'phase-content') or contains(@class,'f-phase-details')]/SPAN[starts-with(text(),'${params."Phase"}')]/following-sibling::*[1][contains(@class,'phase-start') and contains(text(),'${params."Phase Start Date"}')]") == 1,"Error - Start Date ${params."Phase Start Date"} incorrect for ${params."Phase"}"}
            if(params."Phase End Date") {
                assert Exists.run(ID:"//*[contains(@class,'phase-content') or contains(@class,'f-phase-details')]/SPAN[starts-with(text(),'${params."Phase"}')]/../..//*[contains(@class,'phase-end') and contains(text(),'${params."Phase End Date"}')]") == 1,"Error - End Date ${params."Phase End Date"} incorrect for ${params."Phase"}"}
        }
        if(params."Current Phase") {assert Exists.run(ID:"//*[contains(@id,'phase')]/DIV[contains(@class,'phase-wrapper current-phase')]//SPAN[starts-with(text(),'${params."Phase"}')]") == 1,"Error - ${params."Phase"} is not current phase"}
        if(params."Phase Position") {assert Exists.run(ID:"//*[@id='phase-list']/DIV[${params."Phase Position"}][contains(.,'${params."Phase"}')]") == 1,"Error - ${params."Phase Position"} is incorrect ${params."Phase"}"}
        if(params."Number of Matches"){verify."Number of Matches" = params."Number of Matches".toInteger()}
        VerifyNumberOfMatches.run(verify) 
    }
}