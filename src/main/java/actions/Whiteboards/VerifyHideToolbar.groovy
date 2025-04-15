package actions.Whiteboards;

import actions.selenium.Exists
import actions.selenium.*
import screens.Userhome.Whiteboards.WhiteboardLocators

class VerifyHideToolbar{
    public void run(def params){
        
        if(params."Is Right Toolbar displayed" != null){
            if(params."Is Right Toolbar displayed"==true){
                assert Exists.run("ID Type":"By", By:WhiteboardLocators.rightToolBar)==1,"Right Tool not displayed"
            } else {
          		assert Exists.run("ID Type":"By", By:WhiteboardLocators.rightToolBar)==0,"Right Tool is displayed"
            }
        }
        if(params."Is Left Toolbar displayed"!= null){
            if(params."Is Left Toolbar displayed"==true){
                assert Exists.run("ID Type":"By", By:WhiteboardLocators.leftToolBar)==1,"Left Tool not displayed"
                assert Exists.run("ID Type":"By", By:WhiteboardLocators.toolKit)==1,"Left Toolkit not displayed"
            } else {
          		assert Exists.run("ID Type":"By", By:WhiteboardLocators.leftToolBar)==0,"Left Tool not displayed"
                assert Exists.run("ID Type":"By", By:WhiteboardLocators.toolKit)==0,"Left Toolkit not displayed"
            }
        }
        if(params."Top Bar Minimized"){
            if(params."Top Bar Minimized"==true){
                assert Exists.run("ID Type":"By", By:WhiteboardLocators.minimizedtopBar)==1,"Top bar not minimized"
            } else {
          		assert Exists.run("ID Type":"By", By:WhiteboardLocators.minimizedtopBar)==0,"Top bar is minimized"
            }
        }  
    }
}