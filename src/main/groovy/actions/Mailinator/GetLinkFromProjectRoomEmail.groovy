package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkFromProjectRoomEmail{
    public static run(def params){
        def email = GetMailinatorEmail.run(params)
        def links = []
        links = GetURLFromEmail.run(email:email)
        return links[0]
        
        /*
        //Parse for the Reset password
        def link
        def startIndex = body.indexOf(">https:")
        println("startIndex defined")
        def endIndex = body.indexOf("</a>")
        println("Searching for substring at index ${startIndex} to ${endIndex}")
        link = body.substring(startIndex + 1, endIndex)
        println("Link From Project Room Email: ${link}")
        return link*/
    }
} 
