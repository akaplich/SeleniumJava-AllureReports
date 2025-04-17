package actions.AppsPillarNew;
import screens.Apps.AppsPillarLocators
import org.openqa.selenium.By
import actions.selenium.*
    
class SetTakeQuizinAppsPillarPage{
    public void run(def params){
        
        Click.run("ID Type":"By", By:AppsPillarLocators.takeQuiz)
        
    }
}