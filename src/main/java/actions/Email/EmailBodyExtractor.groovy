package actions.Email;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;

public class EmailBodyExtractor {
    public static String run(Message message) throws MessagingException, IOException {
        Object content = message.getContent();

        if (content instanceof String) {
            return (String) content; // Plain text email
        } else if (content instanceof MimeMultipart) {
            println("extracted content still multipart")
            return extractStringFromMultipart((MimeMultipart) content); // Process multipart
        } else {
            println("Handle other content types or null content")
            return null;
        }
    }
    
    private static String extractStringFromMultipart(MimeMultipart multipart) throws MessagingException, IOException {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < multipart.getCount(); i++) {
            println("In the loop, count of parts is ${multipart.getCount()}")
            BodyPart bodyPart = multipart.getBodyPart(i);
            String contentType = bodyPart.getContentType();

            if (contentType != null) {
                if (contentType.contains("text/plain")) {
                    text.append(bodyPart.getContent());
                } else if (contentType.contains("text/html")) {
                    //handle HTML content
                    text.append(bodyPart.getContent());
                } else if (bodyPart.getContent() instanceof MimeMultipart) {
                    // Recursively process nested multipart
                    println("Content still multipart")
                    text.append(extractStringFromMultipart((MimeMultipart) bodyPart.getContent()));
                }
            }
        }
        println("Final extracted string: ${text.toString()}")
        return text.toString();
    }
}