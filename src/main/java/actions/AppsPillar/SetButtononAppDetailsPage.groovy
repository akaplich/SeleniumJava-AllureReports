package actions.AppsPillar;

import actions.selenium.Click

class SetButtononAppDetailsPage{
    public void run(def params){
        
        Click.run(ID:"//*[contains(@class,'phase-app-detail-actions new-app')]//BUTTON[contains(text(),'${params."Button Name"}')]")
        
    }
}