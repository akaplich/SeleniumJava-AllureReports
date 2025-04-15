package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkFromCommentMadeonIdeaEmail{
    public static run(def params){
        def links = []
        def email = GetMailinatorEmail.run(params)
        if(params."Email Subject"!=null){
            assert email.subject.equals(params."Email Subject"), "Error in Email Subject"
        }
        links = GetURLFromEmail.run(email:email)
        println("Link to idea: ${links[0]}")
        return links[0]
    }
}