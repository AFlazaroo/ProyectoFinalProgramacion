package co.edu.unbosque.model;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class MandarCorreo {
	private static String emailFrom = "ingearbolitosacos@gmail.com";
	private static String passwordFrom = "sllrznacrnvaycdk";
	private static String subject = "Codigo para iniciar sesión.";
	private String emailTo;
	private String content;

	private Properties mProperties;
	private Session mSession;
	private MimeMessage mCorreo;

	public MandarCorreo() {
		mProperties = new Properties();

	}

	public void crearCorreo(String contraseña, String email) {
		emailTo = email;
		content = "Tu codigo para poder inicar sesión seria el siguiente: " + "<h1>"+contraseña + "<h1>";
		
		 // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user",emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        try {
        	mCorreo = new MimeMessage(mSession);
			mCorreo.setFrom(new InternetAddress(emailFrom));
			System.out.println(emailTo);
			mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
			mCorreo.setSubject(subject);
			mCorreo.setText(content, "ISO-8859-1", "html");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

    public void enviarCorreo() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            JOptionPane.showMessageDialog(null, "Codigo enviado a tu correo :)");
            
        } catch (MessagingException ex) {
           System.out.println("Error por: " + ex.getMessage());
        }
    }
    
   public int codigoAleatoreo() {
	   int max = 99999;
	   int min = 10000;
	   int range = max - min + 1;
	   
	   int rand = (int)(Math.random() * range) + min;
	  return rand;
   }
}


