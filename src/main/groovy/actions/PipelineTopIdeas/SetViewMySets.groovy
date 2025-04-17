package actions.PipelineTopIdeas;

import actions.selenium.Click

class SetViewMySets{
    public void run(def params){
        if(params."Click View My Sets?"==true){
            Click.run(ID:"//*[contains(@class,'f-best-idea-top-right-bar')]//BUTTON[contains(@class,'f-view-sets-btn')]")
            sleep(5000)
        }
        if(params."Add Stack"){
            Click.run(ID:"//DIV[@class='f-add-stack']/SPAN")
            sleep(3000)
        }
    }
}