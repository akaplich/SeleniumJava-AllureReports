package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetLinkfromTeamWorkspaceEmail{
    public static def run(def params){
        sleep(10000)
        def links = []
        def email = GetMailinatorEmail.run(params)
        links = GetURLFromEmail.run(email:email)
        return links[0]
    }
}