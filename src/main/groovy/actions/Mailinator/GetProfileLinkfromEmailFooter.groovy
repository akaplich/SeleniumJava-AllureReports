package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail

class GetProfileLinkfromEmailFooter{
    public def run(def params){
        def email = GetMailinatorEmail.run(params)
        
        def links = GetURLFromEmail.run(email:email)
        if (params."Email Subject" != null) {
            assert email.subject.toLowerCase().contains(params."Email Subject".toLowerCase()) : "Error in the Email Subject"
        }
        
        for (String link : links) {
        	println("Links in the Email: ${link}")
            if (link.contains("c_ent_ct_profile_edit")){
                return link
            } 
   		}
        return null
    }
}