package cdr.forms;

import java.util.List;

import crosswalk.Form;

public interface NotificationHandler {

	/**
	 * Send notifications for a successful deposit, including receipt if depositorEmail is specified and
	 * notices to those specified in the form itself.
	 * @param form the deposit form
	 * @param result the result object
	 * @param depositorEmail depositor email address or null
	 * @param formId the form id (file name without extension)
	 */
	public List<String> notifyDeposit(Form form, DepositResult result, String depositorEmail, String formId);

	/**
	 * Send unrecoverable error notification to the administrator.
	 * @param form the deposit form
	 * @param result the result object
	 * @param depositorEmail depositor email address or null
	 * @param formId the form id (file name without extension)
	 */
	public List<String> notifyError(Form form, DepositResult result, String depositorEmail,
			String formId);

}
