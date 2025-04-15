package actions.SetupSite;

import actions.common.SetupCommon
import actions.selenium.SendKeys
import java.nio.file.Paths

class SetWebstormSetupSiteLabelsPage{
    public void run(def params){
        
        SetupCommon.NavigateTab(Tab:"Site",Section:"Labels")
        def os = System.getProperty("os.name").toLowerCase()
        def fileName
        if(os.contains("nix") || os.contains("nux")||os.contains("aix")){	//linux
            fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"/TestCaseResourceFiles/${params."Import Labels"}"
        }else{																//windows
            fileName = Paths.get(".").toAbsolutePath().normalize().toString()+"\\TestCaseResourceFiles\\${params."Import Labels"}"
        }
        //Now send a file to the 'attachment-uploader' element
        SendKeys.run(ID:"//*[@id='form-file-import-labels-file']",Text:fileName)
        
    }
}