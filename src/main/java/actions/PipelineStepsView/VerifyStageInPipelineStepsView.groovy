package actions.PipelineStepsView;

import actions.selenium.Exists
import actions.selenium.VerifyAttribute

class VerifyStageInPipelineStepsView{
    public void run(def params){
        
    	def style;// to verify background color
        if(params."Background Color in RGB" == "default" || params."Background Color in RGB" == null){
            style = "background: rgb(240, 240, 240);"
        }
        else{
            style = "background: ${params."Background Color in RGB"};"
        }
        
        if(params."Should Exist" == true){ 
        	assert (Exists.run(ID:"//*[@class = 'stage_holder' and @style = '${style}']/DIV[contains(@class,'stage_name')]/DIV[text()='${params."Stage Name"}']") == 1), "Error - Stage Not Found"
        }else if (params."Should Exist" == false){
            assert (Exists.run(ID:"//*[@class = 'stage_holder' and @style = '${style}']/DIV[contains(@class,'stage_name')]/DIV[text()='${params."Stage Name"}']") == 0), "Error - Unexpected Stage Found"
    	}
        if(params."Position"){ 
            assert (Exists.run(ID:"//DIV[@id='all_steps_inner']//DIV[starts-with(@class,'stage_holder')][${params."Position"}]//DIV[starts-with(@class,'stage_name')]//DIV[text()='${params."Stage Name"}']") == 1), "Error - ${params."Stage Name"} Stage not Found in position ${params.'Position'}"
        }
    }
}