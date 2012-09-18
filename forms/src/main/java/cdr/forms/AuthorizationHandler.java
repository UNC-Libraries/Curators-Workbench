package cdr.forms;

import javax.servlet.http.HttpServletRequest;

import crosswalk.Form;

public interface AuthorizationHandler {
	/**
	 * Checks if the user has permission to submit this form.
	 * @param formId form id
	 * @param form form model
	 * @param session HTTP session
	 * @throws PermissionDeniedException if user does not have permission
	 */
	public abstract void checkPermission(String formId, Form form, HttpServletRequest request) throws PermissionDeniedException;
}
