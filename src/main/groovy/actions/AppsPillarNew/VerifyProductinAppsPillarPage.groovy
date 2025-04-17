package actions.AppsPillarNew;
import screens.Apps.AppsPillarLocators
import org.openqa.selenium.By
import actions.selenium.*
import actions.selenium.utils.VerifyNumberOfMatches

class VerifyProductinAppsPillarPage{
    public void run(def params){
        
        def verify = [:] 
        if(params."Product Disabled"==true){
          verify.ID = AppsPillarLocators.productNameDisabled(params."Product Name").toString().replace("By.xpath: ", "")   
        } else {
          verify.ID = AppsPillarLocators.productName(params."Product Name").toString().replace("By.xpath: ", "")   
        }
        verify.IDChildren = []
        if(params."Icon"){
            verify.IDChildren << AppsPillarLocators.productIcon(params."Icon").toString().replace("By.xpath: ", "") 
        }
        if(params."Description"){
            verify.IDChildren << AppsPillarLocators.productDescription(params."Description").toString().replace("By.xpath: ", "") 
        }
        if(params."Placement Number") {
            VerifyNumberOfMatches.run("ID Type":"By",By:AppsPillarLocators.productWithPlacementNumber(params."Product Name",params."Placement Number"))
        } 
        if (params."Number of Matches") {
            verify."Number of Matches" = params."Number of Matches".toInteger()
        }
        VerifyNumberOfMatches.run(verify)
    }
}