package actions.Email;

import actions.Mailinator.GetMailinatorAllEmail
import java.lang.Math

class VerifyEmailbyIteratingthroughInboxMailinator{
     public void run(def params) {
        def emails = GetMailinatorAllEmail.run(params);
        
        if (params."Email Should Be Received" == false) {
            println("Email should NOT exist")
            if (emails instanceof List && emails.size() > 0) {
                println("Found some emails");
                for (def email : emails) {
                    if (email instanceof Map) {
                        if (params.Subject) {
                            assert !email.subject.contains(params.Subject), "Error - Email with Subject '${email.subject}' received"
                        }
                        if (params.From) {
                            assert !email.from.contains(params.From), "Error - Email From '${email.from}' received"
                        }
                        if (params."Full From") {
                            assert !email.origfrom.contains(params."Full From"), "Error - Email Origfrom '${email.origfrom}' received"
                        }
                        if (params."Body Contains Text") {
                            assert !email.body.contains(params."Body Contains Text"), "Error - Email Body '${email.body}' received"
                        }
                    }
                }
            } else {
                println("No Emails Found")
                return
            }
        } else {
            assert emails instanceof List && emails.size() > 0, "Error - Email was not received by ${params."Email Address"}@mailinator.com";
            println("Email Should Be Received")
            
            boolean matchFound = false
            for (def email : emails) {
                if (email instanceof Map) {
                    boolean subjectMatch = !params.Subject || email.subject.contains(params.Subject)
                    boolean fromMatch = !params.From || email.from.contains(params.From)
                    boolean fullFromMatch = !params."Full From" || email.origfrom.contains(params."Full From")
                    boolean bodyMatch = !params."Body Contains Text" || email.body.contains(params."Body Contains Text")
                    
                    if (subjectMatch && fromMatch && fullFromMatch && bodyMatch) {
                        matchFound = true
                        break
                    }
                }
            }
            assert matchFound, "Error - No matching email found in the inbox"
        }
    }
}