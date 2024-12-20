package car_sales;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;
import java.util.Random;

public class EmailSender {

    // Metodă pentru trimiterea unui email cu codul de verificare
    public static String sendVerificationEmail(String userEmail) {
        String smtpHost = "smtp.gmail.com";
        int smtpPort = 465; // SSL
        String senderEmail = "carnenebuna@gmail.com";  // Schimbă cu email-ul tău
        String senderPassword = "pdan semn amui yogv"; // App password pentru Gmail
        String verificationCode = generateVerificationCode();

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.enable", "true");  
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);

        // Crearea sesiunii
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Crearea mesajului
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
            message.setSubject("Codul de verificare pentru contul tău");
            message.setText("Codul dvs. de verificare este: " + verificationCode);

            // Trimiterea mesajului
            Transport.send(message);
            //System.out.println("Email trimis cu succes la: " + userEmail);
            
            
            
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("A aparut o eroare la trimiterea email-ului.");
        }
        return verificationCode;
    }

    private static String generateVerificationCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000); 
        return String.valueOf(code);
    }
}
