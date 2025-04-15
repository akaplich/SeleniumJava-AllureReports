package actions.AppsPillarNew;
import org.openqa.selenium.By
import actions.selenium.SetText
import screens.Apps.AppsPillarLocators
import actions.selenium.Click

class SetSearchAppsinAppsPillarPage{
    public void run(def params){
        
        SetText.run(Text:params."Search Text","ID Type":"By", By:AppsPillarLocators.searchField,"Type of Clear":"Cut")
        if(params."Clear Search"){
            if(params."Clear Search"==true){
                Click.run("ID Type":"By", By:AppsPillarLocators.closeIconOnSearchField)
            }
            sleep(2000)
        }              
    }
}