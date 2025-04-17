package actions.selenium;

import actions.selenium.utils.Elements
import actions.selenium.Browser
import actions.selenium.Click
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

class SetNewCheckBox{
    public static void run(def params){
        if(params.Check!=null){
            WebElement checkbox = Elements.find(params,Browser.Driver)
            String checkedAttribute = checkbox.getAttribute("checked");
			if(params.Check == true){
                if(checkedAttribute != null){
                    System.out.println("Checkbox is already checked.");
                }else{
                    System.out.println("Checkbox is not checked. Will check.");
                    Click.run(ID:params.ID+"/..")
                }
            }else if (params.Check == false){
                if(checkedAttribute != null){
                    System.out.println("Checkbox is checked. Will uncheck.");
                    Click.run(ID:params.ID+"/..")
                }else{
                    System.out.println("Checkbox is already unchecked.");
                }
            }
    	}
    }
}