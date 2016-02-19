package com.mk.abgabe;

import java.util.Date;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.ejb.Stateless;
import javax.inject.Named;


/**
 * Bean, die die Fahrauftragsdaten aus der Deltaplan-Datenbank liest.
 * Die Aufrufe werden gemockt, da eine Verbindung zur Produktiv-Datenbank nicht erlaubt ist.
 * @author Marco Küpers
 *
 */
@Named("loadDataBean")
@Stateless
public class LoadDataEJB implements JavaDelegate {

	private static final Logger LOG = Logger.getLogger(LoadDataEJB.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) { 
		LOG.info("Lade Auftragsdaten aus Datenbank");
		//DB-Aufruf nicht implementiert. (Dummy-Klasse)
		//Prozessvariablen setzen
		execution.setVariable("auftragsNr", 1);
		execution.setVariable("fahrerVorname", "Heinrich");
		execution.setVariable("fahrerNachname", "Test");
		execution.setVariable("fahrerEmail", "kuepers.m@gmail.com");
		execution.setVariable("kundenName", "Kunde123");
		execution.setVariable("zielOrt", "Hamburg");
		execution.setVariable("startOrt", "Münster");
		execution.setVariable("startdatum", new Date());
		execution.setVariable("enddatum", new Date());
		execution.setVariable("mitRueckfahrt", true);
		execution.setVariable("personenZahl", 50);
		
		LOG.info("Auftragsdaten für Fahrer Heinrich aus der Datenbank geladen. EJB erfolgreich eingebunden.");
	}
}
