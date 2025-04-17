package actions.AppsPillarNew;
import screens.Apps.AppsPillarLocators
import org.openqa.selenium.By
import actions.selenium.*
import actions.selenium.utils.VerifyNumberOfMatches

class VerifyAppsInAppsPillarPage{
    public void run(def params){
        
    	def verify = [:] 
        if(params."Product Name"){
             verify.ID = AppsPillarLocators.appName(params."Product Name",params."App Name").toString().replace("By.xpath: ", "") 
        } else {
          verify.ID = AppsPillarLocators.appNameWithOutProductName(params."App Name").toString().replace("By.xpath: ", "")   
        }       
        verify.IDChildren = []
        if(params."App Icon"){
            verify.IDChildren << AppsPillarLocators.appIcon(params."App Icon").toString().replace("By.xpath: ", "") 
        }
        if(params."App Description"){
            verify.IDChildren << AppsPillarLocators.appDescription(params."App Description").toString().replace("By.xpath: ", "") 
        }
        if(params."Left Button On Tile"){
            verify.IDChildren << AppsPillarLocators.appLeftButton(params."Left Button On Tile").toString().replace("By.xpath: ", "") 
        }
        if(params."Right Button Tile"){
            verify.IDChildren << AppsPillarLocators.appRightButton(params."Right Button Tile").toString().replace("By.xpath: ", "") 
        }
        if(params."Placement Number") {
            if(params."Product Name"){
             	 VerifyNumberOfMatches.run("ID Type":"By",By:AppsPillarLocators.appWithPlacementNumber(params."Product Name",params."App Name",params."Placement Number")) 
        	} else {
          		VerifyNumberOfMatches.run("ID Type":"By",By:AppsPillarLocators.appWithPlacementNumberWithoutProduct(params."App Name",params."Placement Number")) 
        	} 
        } 
        if (params."Number of Matches") {
            verify."Number of Matches" = params."Number of Matches".toInteger()
        }
        VerifyNumberOfMatches.run(verify)
    }
}