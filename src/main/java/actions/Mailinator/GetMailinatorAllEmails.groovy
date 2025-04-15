package actions.Mailinator
import actions.API.HttpClient

class GetMailinatorAllEmail {
    public static def run(def params) {
        def response
        def token = "8b78dcda9cc34e0da48d7c28ede59eda"
        sleep(7000)
        
        // Fetch inbox emails
        response = HttpClient.MakeRequest(
            RequestContentType: "text/html",
            ContentType: "application/json",
            Type: "GET",
            URL: "https://api.mailinator.com/api/inbox?to=${params."Email Address"}&token=${token}"
        )
        println("Inbox Response: " + response.responseData)

        def emails = response.responseData.messages;
        if (!(emails instanceof List) || emails.isEmpty()) {
            println("No emails found in inbox.");
            return []
        }

        def matchedEmails = []

        // Iterate through emails to find matches
        for (def emailData : emails) {
            def emailID = emailData.id

            // Fetch full email details
            response = HttpClient.MakeRequest(
                RequestContentType: "text/html",
                ContentType: "application/json",
                Type: "GET",
                URL: "https://api.mailinator.com/api/email?id=${emailID}&token=${token}"
            )

            def email = [
                subject: response.responseData.data.subject,
                from: response.responseData.data.from,
                body: response.responseData.data.parts[0].body,
                origfrom: response.responseData.data.origfrom,
                id: emailID
            ]

            // Check if the email matches the criteria
            boolean isMatch = true;
            if (params.Subject && !email.subject.contains(params.Subject)) {
                isMatch = false
            }
            if (params.From && !email.from.contains(params.From)) {
                isMatch = false
            }
            if (params."Full From" && !email.origfrom.contains(params."Full From")) {
                isMatch = false
            }

            if (isMatch) {
                matchedEmails.add(email);
                println("Matched Email Found: Subject - ${email.subject}, From - ${email.from}")
            }
        }

        // Delete only matched emails
        for (def email in matchedEmails) {
            println("Deleting Matched Email: ${email.id}");
            HttpClient.MakeRequest(
                RequestContentType: "text/html",
                ContentType: "application/json",
                Type: "GET",
                URL: "https://api.mailinator.com/api/delete?id=${email.id}&token=${token}"
            )
        }

        return matchedEmails
    }
}