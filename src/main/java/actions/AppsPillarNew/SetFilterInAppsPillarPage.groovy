package actions.AppsPillarNew;
import org.openqa.selenium.By
import screens.Apps.AppsPillarLocators
import actions.selenium.Click

class SetFilterInAppsPillarPage{
    public void run(def params){
        
        if(params."Open Filter"==true){
            Click.run("ID Type":"By", By:AppsPillarLocators.filterDropdown)
        }            
        if(params."Options"){
          Click.run("ID Type":"By", By:AppsPillarLocators.sortOption(params."Options"))  
        }
        if(params."Clear Filter"==true){
            Click.run("ID Type":"By", By:AppsPillarLocators.clearFilter)
        } 
        sleep(2000)
    }
}