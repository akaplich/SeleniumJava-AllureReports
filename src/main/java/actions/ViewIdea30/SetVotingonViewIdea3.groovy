package actions.ViewIdea30;

import actions.selenium.*

class SetVotingonViewIdea3{
    public void run(def params){
        
        if(params."Promote Only"){
            if(params."Promote Only" == true){
                Click.run(ID:"//*[@class='f-idea-page-main']//button[contains(@class,'f-promote-btn')]")
                sleep(5000)
                if(params."Verify Vote" == true){
                	assert Exists.run(ID:"//*[@class='f-idea-page-main']//button[contains(@class,'f-promote-btn')][contains(@class,'f-voted')]")==1, "Error - Failed to Click Promote Button"
                }
            }            
        }
        
        if(params."Promote or Demote"){
            if(params."Promote or Demote" == "Promote"){
                Click.run(ID:"//*[@class='f-idea-page-main']//*[contains(@class,'f-vote-animation-promote')]//button", "Type of Click": "Javascript")
                sleep(5000)
                if(params."Verify Vote" == true){
                	assert Exists.run(ID:"//*[@class='f-idea-page-main']//*[contains(@class,'f-vote-animation-promote')][contains(@class,'f-vote-clicked')]")==1, "Error - Failed to Click Promote Button"
                }

            } else {
                Click.run(ID:"//*[@class='f-idea-page-main']//*[contains(@class,'f-vote-animation-demote')]//button", "Type of Click": "Javascript")
                sleep(5000)
                if(params."Verify Vote" == true){
                	assert Exists.run(ID:"//*[@class='f-idea-page-main']//*[contains(@class,'f-vote-animation-demote')][contains(@class,'f-vote-clicked')]")==1, "Error - Failed to Click Demote Button"
                }
            }                          
        }      
        
        if(params."Add or Edit Chips"){
        	Click.run(ID:"//*[@id='f-chips-vote-btn']","Type of Click":"Javascript")
			Click.run(ID:"//*[@class='f-chip-editor']//input[@placeholder='Enter Amount']")
            SetText.run(Text:params."Add or Edit Chips", ID:"//*[@class='f-chip-editor']//input[@placeholder='Enter Amount']")
            Click.run(ID:"//*[@class='f-chip-editor']//button[.='Submit']")
        }
    }
}