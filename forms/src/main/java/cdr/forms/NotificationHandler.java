package cdr.forms;

import crosswalk.Form;

public interface NotificationHandler {

	public void notifyDeposit(Form form, DepositResult result, String email);

}
