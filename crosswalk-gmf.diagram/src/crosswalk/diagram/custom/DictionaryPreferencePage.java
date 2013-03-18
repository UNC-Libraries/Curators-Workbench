/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
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
package crosswalk.diagram.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

/**
 * This class represents a preference page that is contributed to the Preferences dialog. By subclassing
 * <samp>FieldEditorPreferencePage</samp>, we can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the preference store that belongs to the main
 * plug-in class. That way, preferences can be accessed directly via the preference store.
 */

public class DictionaryPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	// RadioGroupFieldEditor radioGroup;
	Table sLocsTable;
	Button deleteButton;
	Button addFileButton;
	Button addButton;

	public DictionaryPreferencePage() {
	}

	public static IInputValidator validator = new IInputValidator() {

		@Override
		public String isValid(String newText) {
			try {
				URI.createURI(newText);
			} catch (IllegalArgumentException e) {
				return e.getLocalizedMessage();
			}
			return null;
		}

	};

	/**
	 * Creates the field editors. Field editors are abstractions of the common GUI blocks needed to manipulate various
	 * types of preferences. Each field editor knows how to save and restore itself.
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite result = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		result.setLayout(layout);
		result.setLayoutData(new GridData(GridData.FILL_BOTH));
		sLocsTable = new Table(result, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 1;
		gd.verticalSpan = 3;
		sLocsTable.setLayoutData(gd);
		sLocsTable.setLinesVisible(true);
		sLocsTable.setHeaderVisible(false);
		TableColumn locCol = new TableColumn(sLocsTable, SWT.NONE);
		locCol.setText("location");
		sLocsTable.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableSelectionChanged();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				tableSelectionChanged();
			}
		});
		addButton = new Button(result, SWT.NONE);
		addButton.setText("Add URL");
		addFileButton = new Button(result, SWT.NONE);
		addFileButton.setText("Add File");
		deleteButton = new Button(result, SWT.NONE);
		deleteButton.setText("Delete");
		for (URI uri : DictionaryPreference.getLocations()) {
			addLocation(uri);
		}
		locCol.pack();
		setTitle("Dictionary Locations");
		setDescription("Set the location of dictionaries used in crosswalks.");
		registerButtons();
		return result;
	}

	/**
     *
     */
	private void registerButtons() {
		addButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				InputDialog d = new InputDialog(event.widget.getDisplay().getActiveShell(), "Dictionary Location (URI)",
						"Add dictionary URI", "http://example.org/my.dictionary", validator);
				if (d.open() == Window.OK) {
					TableItem add = new TableItem(sLocsTable, SWT.NULL);
					add.setText(d.getValue());
				}
			}
		});
		addFileButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				FileDialog d = new FileDialog(event.widget.getDisplay().getActiveShell(), SWT.OPEN);
				d.setFilterExtensions(new String[] { "*.dictionary" });
				String absPath = d.open();
				if (absPath != null && absPath.trim().length() > 0) {
					try {
						String uri = new java.io.File(absPath).toURI().toString();
						TableItem add = new TableItem(sLocsTable, SWT.NULL);
						add.setText(uri);
					} catch (Exception e) {
						setErrorMessage(e.getMessage());
					}
				}
			}
		});
		deleteButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selInd = sLocsTable.getSelectionIndex();
				sLocsTable.remove(selInd);
			}
		});
	}

	public void tableSelectionChanged() {
		if (sLocsTable.getSelectionCount() > 0) {
			deleteButton.setEnabled(true);
		} else {
			deleteButton.setEnabled(false);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(CrosswalkDiagramEditorPlugin.getInstance().getPreferenceStore());
	}

	@Override
	protected void performDefaults() {
		sLocsTable.removeAll();
		for (URI l : DictionaryPreference.getDefaultLocations()) {
			addLocation(l);
		}
	}

	/**
	 * @param string
	 * @param string2
	 */
	private void addLocation(URI uri) {
		TableItem item = new TableItem(sLocsTable, SWT.NONE);
		item.setText(0, uri.toString());
	}

	@Override
	public boolean performOk() {
		List<URI> locs = new ArrayList<URI>();
		for (TableItem i : sLocsTable.getItems()) {
			String u = i.getText(0);
			try {
				URI uri = URI.createURI(u);
				locs.add(uri);
			} catch (IllegalArgumentException e) {
				throw new Error(e);
			}
		}
		DictionaryPreference.setLocations(locs);
		CrosswalkDiagramEditorPlugin.getInstance().loadDictionaries();
		return super.performOk();
	}

}