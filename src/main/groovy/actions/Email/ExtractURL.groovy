package actions.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ExtractURL{
    /*public static String[] run(def params){
        println("Content in extractURL ${params.Content}")
        String urlPattern = "https?://\\S+"
        Pattern pattern = Pattern.compile(urlPattern)
        Matcher matcher = pattern.matcher(params.Content)
        
        def urls = []
        while (matcher.find()) {
            String url = matcher.group()
            println("Found URL: " + url)
            if (url.endsWith('"')) { // Check if the link exists and ends with a quote
        		println("Found URL with quotes: " + url)
                urls << url.substring(0, url.length() - 1) // Remove the last character
    		} else {
        		urls << url  // Return the original link if no quote is found
    		}
        }
		return urls as String[]  
    }
}*/

        public static String[] run(def params) {
            //println("Content in extractURL ${params.Content}");

            String urlPattern = "https?://[^\\s\"']+"; // new pattern
            Pattern pattern = Pattern.compile(urlPattern);
            Matcher matcher = pattern.matcher(params.Content);

            def urls = new ArrayList<String>();

            while (matcher.find()) {
                String url = matcher.group();
                println("Found URL: " + url);
                urls.add(url); 
            }

            return urls.toArray(new String[0]); 
        }
}

