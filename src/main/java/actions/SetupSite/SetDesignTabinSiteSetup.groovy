package actions.SetupSite;

import screens.SiteSetup.DesignTabLocators
import actions.common.SetupCommon
import java.nio.file.Paths
import actions.selenium.*


class SetDesignTabinSiteSetup{
    public void run(def params){
        
        SetupCommon.NavigateTab(Tab:"Site",Section:"Design")
        sleep(2000)
        
        if(params."Banner Filename" != null){
            Click.run("ID Type":"By",By:DesignTabLocators.siteBannerUploadImageInput)
            sleep(2000)
            def fileName
            def os = System.getProperty("os.name").toLowerCase();
            if(os.contains("nix") || os.contains("nux")||os.contains("aix")){
                fileName = Paths.get(".").toAbsolutePath().normalize().toString()+'/TestCaseResourceFiles/'+ params."Banner Filename"
                println("File path: ${fileName}")
            }else{
            	fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"\\TestCaseResourceFiles\\${params."Banner Filename"}"
            }
            SwitchToFrame.run("ID Type":"By",By:DesignTabLocators.siteBannerUploadImageIFrame)
            SendKeys.run("ID Type":"By",By:DesignTabLocators.siteBannerUploadImageUploadInput,Text:fileName)

            sleep(5000)
            Click.run("ID Type":"By",By:DesignTabLocators.siteBannerUploadImageInput)
            SwitchToDefaultContent.run()
        }
        if(params."User Homepage Banner HTML" != null){
            Click.run("ID Type":"By",By:DesignTabLocators.siteBannerHTMLInitiativeBanner)
            sleep(2000)
        	SetText.run("ID Type":"By",By:DesignTabLocators.siteBannerHTMLInitiativeBannerCode,Text:params."User Homepage Banner HTML")
        }
        
        if(params."User Homepage Footer HTML" != null){
            Click.run("ID Type":"By",By:DesignTabLocators.siteFooterHTMLText)
        	SetText.run("ID Type":"By",By:DesignTabLocators.siteFooterHTMLText,Text:params."User Homepage Footer HTML")
        }
      
        if(params."General Body Background" != null){
        	SetText.run("ID Type":"By",By:DesignTabLocators.siteCustomCSSColorBodyBackground,Text:params."General Body Background")
        }
        if(params."General Banner Background" != null){
        	SetText.run("ID Type":"By",By:DesignTabLocators.siteCustomCSSColorBannerBackground,Text:params."General Banner Background")
        }
        if(params."General Footer Background" != null){
        	SetText.run("ID Type":"By",By:DesignTabLocators.siteCustomCSSColorFooterBackground,Text:params."General Footer Background")
        }
        if(params."Custom CSS" != null){
        	SetText.run("ID Type":"By",By:DesignTabLocators.siteCustomCSSText,Text:params."Custom CSS","Type of Clear":"None")
        }
        
        if(params."Favicon Filename" != null){
            def fileName
            def os = System.getProperty("os.name").toLowerCase();
            if(os.contains("nix") || os.contains("nux")||os.contains("aix")){
                fileName = Paths.get(".").toAbsolutePath().normalize().toString()+'/TestCaseResourceFiles/'+params."Favicon Filename"
                println("File path: ${fileName}")
            }else{
            	fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"\\TestCaseResourceFiles\\${params."Favicon Filename"}"
            }
            SwitchToFrame.run(ID:"//iframe[@class='design_banner'][contains(@src,'favicon')]")
            SendKeys.run(ID:"//input[@name='favicon_file']",Text:fileName)
            sleep(5000)
            Click.run(ID:"//input[@id='save_fav_input']")
            SwitchToDefaultContent.run()
        }
        
        
        ExecuteJavascript.run(Code:"window.scrollTo(0, 0);")
        Click.run("ID Type":"By",By:DesignTabLocators.saveButton)
        sleep(2000)         
    }
}