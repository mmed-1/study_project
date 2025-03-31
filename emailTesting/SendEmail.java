package emailTesting;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class SendEmail {

    public static void sendEmail(String recipient, String articleTitle, String decision, String confTitle, boolean validate) {
        final String senderEmail = "your email";  // Change this
        final String senderPassword = "ur app passwd";      // Change this (Use App Password for Gmail)

        // SMTP Server Properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create Session with Authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create Email Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject("The decision of " + articleTitle);
            message.setText("Dear Author" + "\n\nWe appreciate your submission of " + articleTitle + " to " + confTitle + ". After a thorough review, we have reached a decision regarding your manuscript.\n"
            				+ "\nDecision: " + decision + "\n" + (validate ? "\nWe are pleased to inform you that your article has been accepted for publication. Congratulations! Further details on the next steps will be provided soon."
            													  : "\nUnfortunately, your article has not been accepted for publication. We appreciate your effort and encourage you to consider revising your work or submitting it to other venues."
            											)
            		);

            // Send Email
            Transport.send(message);
            System.out.println("✅ Email sent successfully to " + recipient);

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("❌ Failed to send email to " + recipient);
        }
    }

 
}