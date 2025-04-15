package actions.Enterprise;

import actions.selenium.*
import org.openqa.selenium.By
import screens.Enterprise.EnterpriseHomepage

class SetNavigationOptioninNavBar{
    public void run(def params){
        
        Click.run("ID Type":"By",By:EnterpriseHomepage.getNavOption(params."Nav Option"))
    }
}