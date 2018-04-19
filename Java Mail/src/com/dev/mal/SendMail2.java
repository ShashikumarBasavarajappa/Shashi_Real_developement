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

public class SendMail2 {

	public static void main(String[] args) {
		String host = "aspmx.l.google.com"; 
		String username ="shashikumarbasavarajappa@gmail.com";
		String password = "Shashi2466#";
		
		String to = "shashi2466@gmail.com";
		
		Properties prop =  new Properties();
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.auth", "true");
		
		Session session  = Session.getDefaultInstance(prop,  new javax.mail.Authenticator() {  
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		try {
			MimeMessage message =  new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setSubject("SHashu send personnalli");
			message.setText("Kumar send perdddddd");
			 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			 Transport.send(message);
			 System.out.println("========");
		}catch(MessagingException e) {
			e.printStackTrace();
		}
	}
}
