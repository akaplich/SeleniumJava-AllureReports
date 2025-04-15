package actions.Mailinator;


class GetURLfromViralEmails{
    public def run(def params){
    	def email = GetMailinatorEmail.run(params)
        if (params."Email Subject" != null) {
            assert email.subject.toLowerCase().contains(params."Email Subject".toLowerCase()), "Error in the Email Subject"
        }
        def links = GetURLFromEmail.run(email:email)
        
        for (String link : links) {
            if(params."URL for".equals("Explore Hackathon Resources") && link.contains("hackathon")){
                println("Will return ${link}")
                return link
            }else if(params."URL for".equals("Go to Submission") && !link.contains("profile")){
                println("Will return ${link}")
                return link
            }else if(params."URL for".equals("Submit Your Project Now!") && link.contains("draft")){
                println("Will return ${link}")
                return link
            }
   		}
        return null
    }
}