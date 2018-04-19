package com.dev;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

	public void send(String to, String subject, String msg) throws AddressException, MessagingException {
		Properties props = new Properties();  
		props.put("mail.smtp.host", "mail.localhost.com");
		props.put("mail.smtp.auth", "true"); 
		Session session = Session.getDefaultInstance(props,  
				 new javax.mail.Authenticator() {  
				  protected PasswordAuthentication getPasswordAuthentication() {  
				   return new PasswordAuthentication("shashi","passsowrd");  
				   }  
				}); 
		try {
			MimeMessage message = new MimeMessage(session);  
			 message.setFrom(new InternetAddress("shashi"));  
			 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			 message.setSubject(subject);  
			 message.setText(msg);
			 Transport.send(message);  
		}finally {
			
		}  
		      
	}
}
