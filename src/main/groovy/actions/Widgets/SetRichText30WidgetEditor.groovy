package actions.Widgets;

import screens.EnterpriseAndCommunityWidgets.RichTextWidget30
import actions.selenium.SwitchToFrame
import actions.selenium.SwitchToDefaultContent
import actions.selenium.SetText
import actions.selenium.MouseOver
import actions.selenium.Click

class SetRichText30WidgetEditor{
    public void run(def params){
        Click.run("ID Type":"By",By:RichTextWidget30.getWidgetEditButton(params."Widget Title"),"Type of Click":"Javascript")
        sleep(2000)
        
        if(params."New Title"){
            SetText.run("ID Type":"By",By:RichTextWidget30.titleTextbox, Text: params."New Title")
        }
        if(params."HTML"){
            Click.run("ID Type":"By",By:RichTextWidget30.menuTools)
            Click.run("ID Type":"By",By:RichTextWidget30.menuTools_SourceCode)
            sleep(2000)
            SetText.run("ID Type":"By",By:RichTextWidget30.sourceCode_Text,Text:params."HTML","Type of Clear":"None")
            Click.run("ID Type":"By",By:RichTextWidget30.sourceCode_SaveButton)
        }
        // Inserting text is not currently working, Use HTML for now.
        if(params."Text"){
            SwitchToFrame.run("ID Type":"By",By:RichTextWidget30.editorIFrame)
            SetText.run("ID Type":"By",By:RichTextWidget30.editorIFrame,Text:params."Text","Type of Clear":"None")
            sleep(3000)
            SwitchToDefaultContent.run()
        }

        if(params."Action"){
            Click.run("ID Type":"By",By:RichTextWidget30.getActionButton(params."Action"))
        }   
    }
    
}