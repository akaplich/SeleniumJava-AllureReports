package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkfromActionItemEmail{
   public static run(def params){
        def email = GetMailinatorEmail.run(params)
       def links = [] 
       links = GetURLFromEmail.run(email:email) 
       	println("Link for Action Item: ${links[0]}")
        return links[0]
    }
} 
