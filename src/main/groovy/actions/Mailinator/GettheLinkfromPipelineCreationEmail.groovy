package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GettheLinkfromPipelineCreationEmail{
    public static run(def params){
        def email = GetMailinatorEmail.run(params) 
        def links = GetURLFromEmail.run(email: email)
        links.each{i->
            println("link : ${i}")
        }
        println("Params links: ${params."Links"}")
        if(params."Links".contains("Site Home Page")){
            println("Site Home Page")
            for (String link : links){
                if(!link.contains("pipeline") && !link.contains("profile") && !link.contains("Playbook") ){
                    println("Pipeline Steps View")
                	return link
                }
            }
            //return links[1]
        }else if (params."Links".contains("Pipeline Steps View")){
            for (String link : links){
                if(link.contains("pipeline")){
                    println("Pipeline Steps View")
                	return link
                }
            }
        }
        return null
    }
} 