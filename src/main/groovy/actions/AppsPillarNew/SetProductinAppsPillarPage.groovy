package actions.AppsPillarNew;
import screens.Apps.AppsPillarLocators
import org.openqa.selenium.By
import actions.selenium.*
    
class SetProductinAppsPillarPage{
    public void run(def params){
        
        Click.run("ID Type":"By", By:AppsPillarLocators.productName(params."Product Name"))
    }
}