package actions.Mailinator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GetURLFromEmail {
    static String[] run(def params) {
        
        println("In Get URL...")
        def email
        //email extraction and verification needs to be put into the calling method later
        if(params.email == null){
			email = GetMailinatorEmail.run(params)        
        }else{
            email = params.email
        }
        def subject = email.subject.toString()
        if (params."Email Subject" != null) {
            assert subject.toLowerCase().contains(params."Email Subject".toLowerCase()) : "Error in the Email Subject"
        }
        def body = email.body.toString().replaceAll("\\s*:\\s*\n", ": ") 
		
        String urlPattern = "https?://[^\\s\"']+"
        Pattern pattern = Pattern.compile(urlPattern)
        Matcher matcher = pattern.matcher(body)
        def urls = []
        while (matcher.find()) {
            String url = matcher.group()
            println("Found URL: " + url)
            urls << url  
        }
        println("Found ${urls.size()} URLs")
		return urls as String[]  
    }
}

