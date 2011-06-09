/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.preferences;

import irods.efs.plugin.IrodsConnectionDialog;

import java.net.URI;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Gregory Jansen
 * 
 */
public class LocationFieldEditor extends StringButtonFieldEditor {

	/**
	 * Creates a new directory field editor
	 */
	protected LocationFieldEditor() {
	}

	/**
	 * Creates a directory field editor.
	 * 
	 * @param name
	 *           the name of the preference this field editor works on
	 * @param labelText
	 *           the label text of the field editor
	 * @param parent
	 *           the parent of the field editor's control
	 */
	public LocationFieldEditor(String name, String labelText, Composite parent) {
		init(name, labelText);
		setErrorMessage(JFaceResources.getString("DirectoryFieldEditor.errorMessage"));//$NON-NLS-1$
		setChangeButtonText("Change...");//$NON-NLS-1$
		setValidateStrategy(VALIDATE_ON_FOCUS_LOST);
		this.createControl(parent);
	}

	/*
	 * (non-Javadoc) Method declared on StringButtonFieldEditor. Opens the directory chooser dialog and returns the
	 * selected directory.
	 */
	@Override
	protected String changePressed() {
		String newUri = getLocation();
		if (newUri == null) {
			return null;
		}
		return newUri;
	}

	/*
	 * (non-Javadoc) Method declared on StringFieldEditor. Checks whether the text input field contains a valid
	 * directory.
	 */
	@Override
	protected boolean doCheckState() {
		String uri = getTextControl().getText();
		uri = uri.trim();
		if (uri.length() == 0 && isEmptyStringAllowed()) {
			return true;
		}
		try {
			new URI(uri);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Helper that opens the directory chooser dialog.
	 * 
	 * @param startingDirectory
	 *           The directory the dialog will open in.
	 * @return File File or <code>null</code>.
	 * 
	 */
	private String getLocation() {
		String result = null;
		String uri = this.getStringValue();
		// Open the wizard dialog
		IrodsConnectionDialog dialog = new IrodsConnectionDialog(this.getShell(), uri);
		if (dialog.open() == Dialog.OK) {
			result = dialog.getLocation().toString();
		}
		return result;
	}
}
