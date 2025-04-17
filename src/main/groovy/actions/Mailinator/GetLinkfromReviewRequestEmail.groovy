package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkfromReviewRequestEmail{
    public static def run(def params){
        def links = []
        def email = GetMailinatorEmail.run(params)
        links = GetURLFromEmail.run(email:email)
        return links[0]
        
        //Parse for the Registration link
        //def link
        //link = body.substring(body.indexOf("href=\'") + 6, body.indexOf("\' style"))
        //println(link)
        //return link
    }
}
