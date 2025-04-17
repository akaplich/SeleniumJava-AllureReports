package actions.AppsPillarNew;
import org.openqa.selenium.By
import screens.Apps.AppsPillarLocators
import actions.selenium.Click

class SetAppsinAppsPillarPage{
    public void run(def params){
        
        if(params."Option to Click"=="Tile"){
            Click.run("ID Type":"By", By:AppsPillarLocators.appNameForTileClick(params."App Name"))
        } else {
            Click.run("ID Type":"By", By:AppsPillarLocators.clickOnTileButtons(params."App Name",params."Option to Click"))
        }        
    }
}