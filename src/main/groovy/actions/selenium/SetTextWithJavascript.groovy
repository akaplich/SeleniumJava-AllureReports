package actions.selenium;
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements
import actions.selenium.Browser
import actions.selenium.ExecuteJavascript
import org.openqa.selenium.JavascriptExecutor
import actions.selenium.SetText
/*
Inputs
ID: Xpath to element
ID Type:
Text: Text to input
Attribute: innerHTML or value
*/
import actions.selenium.SendKeyboardAction

class SetTextWithJavascript{
    public static void run(def params){
        println("Running SetTextWithJavascript")
        
        //Javascript Code
        def code = ""
        if(params."Attribute"=="innerHTML"){
            code = '''
            var elm = arguments[0];
			elm.innerHTML = arguments[1];
            elm.dispatchEvent(new Event('change'));'''
        }else if(params."Attribute"=="value"){
            code = '''
            var elm = arguments[0];
			elm.value = arguments[1];
            elm.dispatchEvent(new Event('change'));'''
        }else if(params."Attribute"=="defaultValue"){
            code = '''
            var elm = arguments[0];
			elm.defaultValue = arguments[1];
            elm.dispatchEvent(new Event('change'));'''
        }


        // Find element
        WebElement element = Elements.find(params,Browser.Driver)
        
        // Execute Javascript
        def js = (JavascriptExecutor) Browser.Driver
        println("Executing SetTextWithJavascript()")
        println("Code: ${code}")
        println("Attribute: ${params."Attribute"}")
        println("Text: ${params."Text"}")
        js.executeScript(code, element, params."Text")
        //SendKeyboardAction.run("Button": "ENTER")
        SetText.run(Text:"JS-",ID:params."ID", "Type of Clear":"None" )
        println("Execution of SetTextWithJavascript() is complete")

    }
}