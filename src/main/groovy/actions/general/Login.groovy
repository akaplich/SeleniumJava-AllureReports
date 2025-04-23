package actions.general;

import actions.selenium.SetText
import actions.selenium.SendKeys
import actions.selenium.Click
import actions.selenium.Exists
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Login{
    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    public static void run(String email, String password, Boolean loggedInOnEnterprise = false ){
        def params = [:]
        params.Email = email
        params.Password = password
        params."Verify if Logged In On Enterprise homepage" = loggedInOnEnterprise

        run(params)
    }
    public static void run(def params){
        logger.debug("Starting Login with params: ${params}")
        if(!params.Email){
            params.Email="bi.adminuser1@brightidea.com"
        }else if (params.Email == null){
            params.Email="bi.adminuser1@brightidea.com"
        }else if (params.Email == "null"){
            params.Email="bi.adminuser1@brightidea.com"
        }
        if(!params.Password){params.Password = "brightidea1"}
        println(params.Email)
        sleep(5000)
        if(params."Webstorm Login"==true){
            SetText.run(Text:params.Email,ID:"//*[@id='Text3']")
            SetText.run(Text:params.Password,ID:"//*[@id='Password1']")
            Click.run(ID:"//A[@class='input_button' and text()='Login']")
        }
        else{
            SetText.run(Text:params.Email,ID:"//*[@id='emailAddress']")
            SetText.run(Text:params.Password,ID:"//*[@id='password']")
           	Click.run(ID:"//*[@id='login-button']")
            sleep(2000)
            
			//A workaround to a bug for login
            if(params."Verify if Logged In On Enterprise homepage"==null || params."Verify if Logged In On Enterprise homepage"==true){
                if(!Exists.run(ID:"//*[@id='navbar']",Timeout:10)){
                    println("LOGGING IN AGAIN")
                    SetText.run(Text:params.Email,ID:"//*[@id='emailAddress']")
                    SetText.run(Text:params.Password,ID:"//*[@id='password']")
                    Click.run(ID:"//*[@id='login-button']")
                }
            } else {
                sleep(4000)
            }
        }
    }
}