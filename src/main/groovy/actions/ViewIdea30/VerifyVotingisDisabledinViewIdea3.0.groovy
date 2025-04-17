package actions.ViewIdea30;

import actions.common.*
import actions.selenium.utils.VerifyNumberOfMatches
import actions.selenium.*
import actions.selenium.Exists
import actions.selenium.SetFocus

class VerifyVoteOnOffinViewIdea{
    public void run(def params){
        
            def elements = SetFocus.run(ID:"//*[@class='f-idea-page-main']//*[contains(text(),'Promote')]")
            if(params."Vote Field Disabled"==true){
                assert elements>0, "Error - Voting is Enabled"
                if(params."Number of Matches"){
                    assert elements == params."Number of Matches".toInteger(), "Error - Number of matches ${elements} is not expected ${params."Number of Matches".toInteger()}"
                }
            }else if(params."Vote Field Disabled"==false){
                	assert elements==0, "Error - Voting is Disabled"
            }       
    }
}