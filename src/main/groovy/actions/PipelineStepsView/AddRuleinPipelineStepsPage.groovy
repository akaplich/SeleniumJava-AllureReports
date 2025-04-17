package actions.PipelineStepsView;
import actions.selenium.Click

class AddRuleinPipelineStepsPage{
    public void run(def params){
        Click.run(ID:"//SPAN[@class='step_header_name' and text()='${params."Step"}']/../DIV[contains(@class,'img-dropdown')]")
        Click.run(ID:"//SPAN[@class='step_header_name' and text()='${params."Step"}']/../..//*[text()='Add Rule']")
        sleep(3000)
    }
}



