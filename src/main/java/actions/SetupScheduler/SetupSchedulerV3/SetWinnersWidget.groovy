package actions.SetupScheduler.SetupSchedulerV3;

import actions.selenium.SetCombobox

class SetWinnersWidget{
    public void run(def params){
        
         SetCombobox.run(ID:"//input[@id='f-select-status-combobox']", Option:params."Choose Status")
         sleep(1000)
        
    }
}