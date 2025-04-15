package actions.NGAViewIdea;
import actions.selenium.Exists

class VerifyIdeaVoteOrChipCountInNGAView{
    public void run(def params){
        
        if(params."Visible Vote Count"==true){
            assert Exists.run(ID:"//div[@class='f-vote-count']")>0, "Error - Vote Count was not found"
        }else if(params."Visible Vote Count"==false){
        	assert Exists.run(ID:"//div[@class='f-vote-count']")==0, "Error - Vote Count found but supposed to be hidden"
        }
        if(params."Visible Chips Count"==true){
            assert Exists.run(ID:"//span[@class='f-chips-count']")>0, "Error - Chips Count was not found"
        }else if(params."Visible Chips Count"==false){
        	assert Exists.run(ID:"//span[@class='f-chips-count']")==0, "Error - Chips Count found but supposed to be hidden"
        }
        
    }
}