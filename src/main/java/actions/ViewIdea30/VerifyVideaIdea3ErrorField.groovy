package actions.ViewIdea30;

import actions.selenium.Exists
import screens.ViewIdea30Locators

class VerifyVideaIdea3ErrorField{
    public static void run(def params){
        if(params."Should Error Exist"){
            assert Exists.run("ID Type":"By", "By":ViewIdea30Locators.getErrorFieldByTitle(params."Field Name"))>0, "Error - Expected error field was not found"

        }
        else {
            assert Exists.run("ID Type":"By", "By":ViewIdea30Locators.getErrorFieldByTitle(params."Field Name"))==0, "Error - Unexpected error field found"

        }
    }
}