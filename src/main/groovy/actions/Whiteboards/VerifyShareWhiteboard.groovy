package actions.Whiteboards;

import actions.selenium.Exists

class VerifyShareWhiteboard{
    public void run(def params){
        
           if(params."Anyone with link enabled"==true){
                assert Exists.run(ID:"//INPUT[@id='f-member-share-toggle']/..//DIV[contains(@class,'fractal-dropdown')]/DIV[not(contains(@class,'f-dropdown-disabled'))]")==1, "Error - dropdown is not editable"
            } else if(params."Anyone with link enabled"==false){
                println("testing")
                assert Exists.run(ID:"//INPUT[@id='f-member-share-toggle']/..//DIV[contains(@class,'fractal-dropdown')]/DIV[contains(@class,'f-dropdown-disabled')]")==1, "Error - dropdown is editable"
            }        
    }
}