package com.mk.abgabe;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named("loadDataBean")
@Stateless
public class LoadDataEJB implements JavaDelegate {

	Logger log = null;
	
	public void execute(DelegateExecution execution) { 
		System.out.println("---------------------###-----------");
	}
	
}
