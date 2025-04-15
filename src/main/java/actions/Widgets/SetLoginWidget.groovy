package actions.Widgets;

import actions.selenium.SetText
import actions.selenium.Click

class SetLoginWidget{
    public void run(def params){
        if(params."Email"){SetText.run(Text:params.Email,ID:"//INPUT[@name='email']")}
        if(params."Password"){SetText.run(Text:params.Password,ID:"//INPUT[@name='password']")}
        Click.run(ID:"//A[@class='input_button' and text()='Login']")   
    }
}