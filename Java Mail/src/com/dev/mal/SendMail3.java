package com.dev.mal;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail3 {

	public static void main(String[] args) {
		
		Properties prop =  new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");    
        prop.put("mail.smtp.socketFactory.port", "465");    
        prop.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        prop.put("mail.smtp.auth", "true");    
        prop.put("mail.smtp.port", "465");
		String from = "shashikumarbasavarajappa@gmail.com";
		String password = "Shashi2466#";
		String to ="shashi2466@gmail.com";
		String sub  = "Hello";
		String msg = "Hello sir Howw r you";
		
		Session session  = Session.getDefaultInstance(prop,  new javax.mail.Authenticator() {  
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		
		try {
			MimeMessage message =  new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setSubject(sub);
			message.setText(msg);
			 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			 Transport.send(message);
			 System.out.println("========");
		}catch(MessagingException e) {
			e.printStackTrace();
		}
		//https://www.google.com/settings/security/lesssecureapps
	}
}
