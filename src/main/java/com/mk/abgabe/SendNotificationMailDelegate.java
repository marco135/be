package com.mk.abgabe;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Klasse, um einen Fahrer über einem ihm zugeordneten Fahrauftrag zu benachrichtigen
 * @author Marco Küpers
 *
 */
public class SendNotificationMailDelegate implements JavaDelegate {

	private static final Logger LOG = Logger.getLogger(SendNotificationMailDelegate.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String email = execution.getVariable("fahrerEmail").toString();
		String prename = execution.getVariable("fahrerVorname").toString();
		String lastname = execution.getVariable("fahrerNachname").toString();
		String subject = "Neuer Fahrauftrag.";
		String body = "Hallo " + prename + " " + lastname + ", \n \nEs ist ein neuer Fahrauftrag zu Ihnen zugeordnet worden. Bitte prüfen Sie diesen in dem Web-Portal. \n \nGute Fahrt;)";
		
		// Mail senden
		EmailSender es = new EmailSender();
		es.sendMail(email, subject, body);
		
		LOG.info("E-Mail an " + prename + " " + lastname + " zur Benachrichtigung eines neuen Fahrauftrags gesendet.");
		
	}
}
