package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetResetPasswordLinkfromEmail{
    public static run(def params){
        def email = GetMailinatorEmail.run(params)
        def links = GetURLFromEmail.run(email:email)
        for (String link : links) {
        	println("Reset Password link: ${link}")
            if(link.contains("password") || link.contains("login") ){  //login is for freetrials and initiative level invites
            	return link
    		}
        	return null
    	}        
    }
} 
