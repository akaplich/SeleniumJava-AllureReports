package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail
    
class GetLinkfromInviteParticipantEmail{
    public static def run(def params){
        
        def email = [:]
        def link = []
        def body,bodyofAnotherEmail
        email = GetMailinatorEmail.run(params)
        body = email.body
        if(params."Inbox Email Count"=="1" || params."Inbox Email Count"==null){
            link << GetURLFromEmail.run(email:email)[0]
        } else {
            if((email.subject).contains(params."Subject of New Administrator Added Email")){
                assert email.subject.toString().toLowerCase().contains(params."Subject of New Administrator Added Email".toLowerCase()) : "Error in the Email Subject"
                link << GetURLFromEmail.run(email:email)[0]		// will use already received above
                link << GetURLFromEmail.run(params)[0] 			//will get a new email
                
            } else {
                link << GetURLFromEmail.run(params)[0] 			//will get a new email
                link << GetURLFromEmail.run(email:email)[0] 	// will use already received above
                
            }
            println(link[1])
            println(link[0])
        }
        return link
    }
} 