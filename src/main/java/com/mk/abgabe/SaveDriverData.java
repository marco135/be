package com.mk.abgabe;

import java.util.Date;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Saves the data, which are tipped by the driver into a DataBase (Dummy)
 * @author Marco Küpers
 *
 */
public class SaveDriverData implements JavaDelegate {
	
	private static final Logger LOG = Logger.getLogger(SaveDriverData.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String startDateString = execution.getVariable("abfahrtszeit").toString();
		String endDateString = execution.getVariable("ankunftszeit").toString();
		String startKM = execution.getVariable("startKM").toString();
		String endKM = execution.getVariable("endKM").toString();
		Date endDate = null;
		Date startDate = null;
		
		try{
			LOG.info("Daten erfolgreich ausgelesen");
			
			// TODO Aufruf der Mock-Methode zum Speichern der Variablen in der Datenbnak
			// Variablen: startKm, endKM, startDate und endDate zu speichern
		} catch (Exception e) {
			LOG.info("Daten konnten nicht ausgelesen werden, da das "
					+ "Datum im falschen Format eingegeben wurden.");
		}
	}
}