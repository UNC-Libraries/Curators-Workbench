/**
 * Copyright 2008 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cdr.forms;

import crosswalk.Form;

public class PermissionDeniedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2942249514946141228L;
	
	//private UserSecurityProfile userSecurityProfile = null;
	private Form form = null;
	private String formId = null;

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public PermissionDeniedException(String message, Form form, String formId) {
		super(message);
		//this.userSecurityProfile = userSecurityProfile;
		this.form = form;
		this.formId = formId;
	}
}
