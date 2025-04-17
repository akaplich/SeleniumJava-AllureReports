package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail
import actions.Mailinator.GetURLFromEmail
import actions.Email.EmailBodyExtractor

class GetRegistrationLinkfromEmail{
    public static def run(def params){
        def emailReceived = GetMailinatorEmail.run(params)
        def body = emailReceived.body
        if(emailReceived.subject.contains("no subject")){
            println("Will repeat get email")
            sleep(30000)
            emailReceived = GetMailinatorEmail.run(params)    
            body = emailReceived.body
        }
        def links = GetURLFromEmail.run(email:emailReceived)
        
        // need only registration link
        for (String link : links) {
        	println("Link in get registration link: ${link}")
            if(link.contains("register") || link.contains("login")){  //login is for freetrials and initiative level invites
            	return link
    		}
        	return null
    	}
    }
}