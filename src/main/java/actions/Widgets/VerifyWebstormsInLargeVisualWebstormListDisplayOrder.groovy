package actions.Widgets;

import actions.selenium.VerifyText
import actions.selenium.Exists


class VerifyWebstormsInLargeVisualWebstormListDisplayOrder{
    public void run(def params){
        
        
        assert Exists.run(ID:"//*[@id='visual-large-webstorms-list']//div[@class='vwl-webstorm '][${params."Order Number"}]//div[@class='vwl-webstorm-title'][.='${params."Name"}']")==1, "Error, ${params."Name"} was not in order # ${params."Order Number"}"
        
    }
}