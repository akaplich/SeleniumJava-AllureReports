package actions.Widgets;

import screens.EnterpriseAndCommunityWidgets.RichTextWidget30
import actions.selenium.*
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements
import actions.selenium.Browser
    
class VerifyRichTextWidget3{
    public void run(def params){
        
        if(params."Widget Title"){
            assert Exists.run("ID Type":"By",By:RichTextWidget30.getwidgetTitleTextNotEditable(params."Widget Title"))==1, "Error - Failed to find the Widget Title: ${params.'Widget Title'}"
        }
        if(params."OuterHTML" && params."Text" ){
            WebElement outerHTML_Element = Elements.find("ID Type":"By",By:RichTextWidget30.getwidgetBoxContentTextNotEditable(params."Text"),Browser.Driver)
            String outerHTMLText = outerHTML_Element.getAttribute("outerHTML")
            println("outerHTMLText:${outerHTMLText}")
            println("outerHTMLExpected:${params.'OuterHTML'}")
            assert outerHTMLText == params."OuterHTML", "Error expected text: ${params."OuterHTML"} does not match text on the UI: ${outerHTMLText}"
        }      
    }
}