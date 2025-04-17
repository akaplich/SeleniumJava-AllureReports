package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkforIdeasforSubscribedIdeaEmail{
    public static run(def params){
        def links = []
        def email = GetMailinatorEmail.run(params)
        links = GetURLFromEmail.run(email:email)
        if (links[0].endsWith(".")){
            println("There is a period in the end. Will clean up...")
            links[0] = links[0].replaceFirst("\\.\$", "")
        }
        /*
        for (String link : links) {
        	println("Links in Idea Email: ${link}")
            if (link.endsWith(".")){
                println("There is a period in the end. Will clean up...")
                link = link.replaceFirst("\\.$", "")
            }
    	}*/
        println("First link for idea from subscribed email: ${links[0]}")
        return links[0]
        
    }
}