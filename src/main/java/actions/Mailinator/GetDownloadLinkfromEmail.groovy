package actions.Mailinator;

import actions.Mailinator.GetMailinatorEmail
import java.util.regex.Pattern
import java.util.regex.Matcher

class GetDownloadLinkfromEmail{
    public static def run(def params){
        def email = GetMailinatorEmail.run(params) 
        def links = []
        links = GetURLFromEmail.run(email: email)
        
        if(params."Link Number"==null){
            for (String link : links) {
        		println("Link in get download link: ${link}")
        		if (link.contains("download")) {
            		return link 
        		}
                return null
    		}
        }else{
            return links[(params."Link Number".toInteger()-1)]
        }
        
        /*if(params."Link Number"==null ){
            params."Link Number" = 1
            return links[(params."Link Number".toInteger()-1)]
        }*/
       
        /*def body
        def link
        List<String> extractedUrls
        if(params."Link Number" == null) {params."Link Number"='1'}
        
        //get body of the email
        body = GetMailinatorEmail.run(params).body
        println("In GetDownloadLinkfromEmail... Body: ${body}")
        
        //extract all URLs
        extractedUrls = extractUrls(body)        
        link = extractedUrls[params."Link Number".toInteger()-1]
        println("Requested URL: ${link}")
        
        //for debugging
        for (String url : extractedUrls)
		{
    		println("Printing all URLs:")
            System.out.println(url);
		}
        
        return link;*/

        
    /*}
    public static List<String> extractUrls(String text){
        List<String> containedUrls = new ArrayList<String>();
        String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;\$()~_?\\+-=\\\\\\.&]*(?=<))";
        Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
        Matcher urlMatcher = pattern.matcher(text);
        while (urlMatcher.find())
        {
            containedUrls.add(text.substring(urlMatcher.start(0),
                    urlMatcher.end(0)));
        }
        return containedUrls;
   }*/
    }
}