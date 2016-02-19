package com.mk.abgabe;

import org.apache.commons.mail.*;

import java.util.logging.Logger;


/**
 * Klasse, um Emails zu senden
 * @author Marco Küpers
 *
 */
public class EmailSender {

	private static final String FROM = "be-abgabe@gmx.de";
	private static final String USER = "mk087371";
	private static final String HOST_NAME = "mail.fh-muenster.de";
	private static final String PASSWORD = "9o3LcF6M";
	private static final Logger LOG = Logger.getLogger(EmailSender.class.getName());
	
	public EmailSender() {
		
	}
	
	/**
	 * Send a email
	 * @param to
	 * @param subject
	 * @param body
	 * @return
	 */
	public boolean sendMail(String recipient, String subject, String body) {
		try {
			Email mail = new SimpleEmail();
			mail.setHostName(HOST_NAME);
			mail.setAuthentication(USER, PASSWORD);
			mail.setFrom(FROM);
			mail.setSubject(subject);
			mail.setMsg(body);
			mail.addTo(recipient);
			//mail.setDebug(true);
			mail.send();
			LOG.info("Email erfolgreich an " + recipient + " gesendet.");
			return true;
		} catch (Exception e) {
			LOG.info("Email konnte nicht gesendet werden." + e.toString());
			e.printStackTrace();
			return false;
		}
	}
}
