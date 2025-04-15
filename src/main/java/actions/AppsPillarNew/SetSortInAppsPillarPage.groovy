package actions.AppsPillarNew;
import org.openqa.selenium.By
import screens.Apps.AppsPillarLocators
import actions.selenium.Click

class SetSortInAppsPillarPage{
    public void run(def params){
        
        Click.run("ID Type":"By", By:AppsPillarLocators.sortDropdown)
        if(params."Options"){
          Click.run("ID Type":"By", By:AppsPillarLocators.sortOption(params."Options"))  
        }
    }
}