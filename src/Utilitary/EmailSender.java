package Utilitary;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;

public class EmailSender {

    public static String sendVerificationEmail(String userEmail, int emailType) {
        String smtpHost = "smtp.gmail.com";
        int smtpPort = 465; // SSL
        String senderEmail = "carnenebuna@gmail.com";  
        String senderPassword = "pdan semn amui yogv"; // App password pentru Gmail
        String verificationCode = generateVerificationCode();
        String newgenpass = generatePassword();

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.enable", "true");  
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);

        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });
        
        if(emailType == 1){
            try {
                
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(senderEmail));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
                message.setSubject("Codul de verificare pentru contul tău");
                message.setText("Codul dvs. de verificare este: " + verificationCode);

                
                Transport.send(message);
                //System.out.println("Email trimis cu succes la: " + userEmail);

            } catch (MessagingException e) {
                e.printStackTrace();
                System.out.println("A aparut o eroare la trimiterea email-ului.");
            }
            
        }
        else if(emailType == 2){
            
            try {
                
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(senderEmail));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
                message.setSubject("Password Recovery");
                message.setText("Noua dvs. parola este " + newgenpass);

                
                Transport.send(message);
                

            } catch (MessagingException e) {
                e.printStackTrace();
                System.out.println("A aparut o eroare la trimiterea email-ului.");
            }
            
        }
        if(emailType == 1)
            return verificationCode;
        
        return newgenpass;
       
    }

    private static String generateVerificationCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000); 
        return String.valueOf(code);
    }
    private static String generatePassword(){
        
        String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        String DIGITS = "0123456789";
     
        String ALL_CHARACTERS = UPPERCASE + LOWERCASE + DIGITS;

   
        SecureRandom random = new SecureRandom(); // Folosim SecureRandom pentru a genera numere aleatoare
        StringBuilder password = new StringBuilder(10);

        for(int i =  0; i < 10; i++) {
            int randomIndex = random.nextInt(ALL_CHARACTERS.length()); 
            password.append(ALL_CHARACTERS.charAt(randomIndex));
        }

        return password.toString();
    }
}
