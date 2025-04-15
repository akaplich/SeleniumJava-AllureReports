package actions.ViewIdeaComment;

import actions.common.*
import actions.selenium.utils.VerifyNumberOfMatches
import actions.selenium.*
import actions.selenium.Exists

class VerifyCommentOnOffinViewIdea{
    public void run(def params){
        
            def elements = Exists.run(ID:"//*[starts-with(@id,'fractal-commenting-input')]")
            if(params."Should Comment Field Exist"==true){
                assert elements>0, "Error - Comment does not exists"
                if(params."Number of Matches"){
                    assert elements == params."Number of Matches".toInteger(), "Error - Number of matches ${elements} is not expected ${params."Number of Matches".toInteger()}"
                }
            }else if(params."Should Comment Field Exist"==false){
                	assert elements==0, "Error - Comment exists"
            }
    }
}
