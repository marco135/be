package com.mk.abgabe;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

/**
 * Assignes a task to a special User
 * @author Marco K�pers
 *
 */
public class AssigneeTaskListener implements TaskListener {

	@Override
	public void notify(DelegateTask task) {
		// M�glich, da der Fahrer-Vorname auch gleichzeitig der Username ist
		String assignee = task.getVariable("fahrerVorname").toString().toLowerCase();
		task.setAssignee(assignee);
	}
}
