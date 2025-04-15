package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkFromCategorySubscriptionEmail{
    public static run(def params){
        def links = []
        def email = GetMailinatorEmail.run(params)
        links = GetURLFromEmail.run(email:email)
        return links[0]
        /*
        def body = GetMailinatorEmail.run(params).body
        def link
        link = body.substring(body.indexOf("href=\"") + 6, body.indexOf("\">https:"))
        println(link)
        return link
		*/
    }
} 