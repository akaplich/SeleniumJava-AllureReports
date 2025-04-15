package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetTheRegistrationLinkFromCommentEmail{
    public static run(def params){
        def email = GetMailinatorEmail.run(params)
        def links = []
        links = GetURLFromEmail.run(email: email)
        return links[0]
    }
} 