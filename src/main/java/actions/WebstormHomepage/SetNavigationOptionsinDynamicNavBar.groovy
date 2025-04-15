package actions.WebstormHomepage;

import screens.WebstormHomepage.InitiativeHomepage
import actions.selenium.Click

class SetNavigationOptionsinDynamicNavBar{
    public void run(def params){
        
        if(params."Nav Parent Title"){
           Click.run("ID Type":"By",By:InitiativeHomepage.getParentNavigationTitle(params."Nav Parent Title"))
        }
        if(params."Nav Child Title"){
           Click.run("ID Type":"By",By:InitiativeHomepage.getChildNavigationTitle(params."Nav Child Title"))
        }
    }
}