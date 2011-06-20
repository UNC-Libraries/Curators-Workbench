/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
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
package crosswalk.diagram.part;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import crosswalk.CrosswalkFactory;
import crosswalk.DataSource;
import crosswalk.DelimitedFile;

/**
 * @author Gregory Jansen
 *
 */
public class DelimitedFileDelimitersWizardPage extends WizardPage implements IWizardPage {

	protected DelimitedFileDataSourceWizardPage filePage;

	Button isHeaderRowButton;
	Combo headerRowCombo;
	Combo dataRowCombo;
	Combo fieldDelimiterCombo;
	Combo textDelimiterCombo;

	Table sampleData;

	/**
	 * @param pageName
	 */
	protected DelimitedFileDelimitersWizardPage(String pageName) {
		super(pageName);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		// top level group
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(new GridLayout(2, false));
		this.setMessage("Select the delimiters and significant rows for your file.", DialogPage.INFORMATION);

		Label fieldL = new Label(top, SWT.None);
		fieldL.setText("Field Delimiter");
		fieldDelimiterCombo = new Combo(top, SWT.DROP_DOWN);
		fieldDelimiterCombo.setItems(new String[] { ",", ";", "TAB", "SPACE" });

		Label textL = new Label(top, SWT.None);
		textL.setText("Text Delimiter");
		textDelimiterCombo = new Combo(top, SWT.DROP_DOWN);
		textDelimiterCombo.setItems(new String[] { "NONE", "\"", "'" });

		isHeaderRowButton = new Button(top, SWT.CHECK);
		isHeaderRowButton.setSelection(false);
		// isHeaderRowButton.setLayoutData(new GridData(2, 1));
		Label isL = new Label(top, SWT.NONE);
		isL.setText("There is a header row");
		Label headerRowL = new Label(top, SWT.None);
		headerRowL.setText("Header Row");
		headerRowCombo = new Combo(top, SWT.DROP_DOWN);
		headerRowCombo.setEnabled(false);

		Label dataRowL = new Label(top, SWT.None);
		dataRowL.setText("Data Start Row");
		dataRowCombo = new Combo(top, SWT.DROP_DOWN);

		for (int i = 0; i < 10; i++) {
			headerRowCombo.add(String.valueOf(i + 1), i);
			dataRowCombo.add(String.valueOf(i + 1), i);
		}

		Label lsample = new Label(top, SWT.None);
		lsample.setText("Data Preview");
		lsample.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		sampleData = new Table(top, SWT.MULTI | SWT.READ_ONLY | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		sampleData.setItemCount(10);
		sampleData.setLinesVisible(true);
		sampleData.setHeaderVisible(true);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		sampleData.setLayoutData(gd);

		ModifyListener sa = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				System.out.println(e);
				update();
			}
		};
		isHeaderRowButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				headerRowCombo.setEnabled(isHeaderRowButton.getSelection());
				update();
			}
		});

		// setup initial selections
		fieldDelimiterCombo.select(0);
		textDelimiterCombo.select(1);
		headerRowCombo.select(0);
		dataRowCombo.select(1);

		headerRowCombo.addModifyListener(sa);
		dataRowCombo.addModifyListener(sa);
		fieldDelimiterCombo.addModifyListener(sa);
		textDelimiterCombo.addModifyListener(sa);

		setControl(top);
	}

	/**
	 * @param e
	 */
	protected void update() {
		CrosswalkCreationWizard wiz = (CrosswalkCreationWizard) this.getWizard();
		if (validForm()) {
			DelimitedFile source = CrosswalkFactory.eINSTANCE.createDelimitedFile();

			// set data row
			{
				String dataRowStr = dataRowCombo.getText();
				if (dataRowStr != null && dataRowStr.length() > 0) {
					source.setDataRow(Integer.parseInt(dataRowStr));
				}
			}

			// set header row
			if (isHeaderRowButton.getSelection()) {
				String headerRowStr = headerRowCombo.getText();
				if (headerRowStr != null && headerRowStr.length() > 0) {
					source.setHeaderRow(Integer.parseInt(headerRowStr));
				}
			}

			// set field delimiter
			{
				String fieldDelStr = fieldDelimiterCombo.getText();
				if ("TAB".equals(fieldDelStr)) {
					fieldDelStr = "\t";
				} else if ("SPACE".equals(fieldDelStr)) {
					fieldDelStr = " ";
				}
				if (fieldDelStr != null && fieldDelStr.length() > 0) {
					source.setFieldDelimiter(fieldDelStr.charAt(0));
				}
			}

			// set text delimiter
			String textDel = textDelimiterCombo.getText();
			if (textDel != null && textDel.length() > 0) {
				if ("NONE".equals(textDel)) {
					source.unsetTextDelimiter();
				} else {
					source.setTextDelimiter(textDelimiterCombo.getText().charAt(0));
				}
			} else {
				source.unsetTextDelimiter();
			}

			// link file to project (a bit early for this.)
			try {
				IPath location = new Path(filePage.filePath);
				IFolder originals = wiz.project.getFolder("originals");
				IFile file = originals.getFile(location.lastSegment());
				if (!file.exists()) {
					System.out.println("Creating link "+ file + " to "+location);
					file.createLink(location, IResource.NONE, null);
				}
				// set file
				source.setSourceFile(file);
			} catch (CoreException e) {
				setMessage(e.getMessage(), DialogPage.ERROR);
			}

			// set charset
			source.setTextEncoding(filePage.charset);

			wiz.dataSource = source;
			System.out.println("set data source: " + source);
			refreshSampleText();
		}
	}

	/**
	 * @return
	 */
	private boolean validForm() {
		if(filePage.filePath != null) {
			File f = new File(filePage.filePath);
			if(!f.exists()) {
				setErrorMessage("File selected on previous page does not exist: "+filePage.filePath);
				return false;
			}
		} else {
			setErrorMessage("No file was selected on previous page.");
			return false;
		}
		if (fieldDelimiterCombo.getSelectionIndex() == -1 && fieldDelimiterCombo.getText().length() == 0) {
			setErrorMessage("A field delimiter must be specified");
			return false;
		}
		return true;
	}

	/**
     *
     */
	protected void refreshSampleText() {
		sampleData.clearAll();
		for (TableColumn c : sampleData.getColumns()) {
			c.dispose();
		}
		DelimitedFile ds = this.getDataSource();
		if (ds != null) {
			try {
				ds.Reset();
				// setup column headers, if available
				if (ds.isSetHeaderRow()) {
					ds.GoToRecord(ds.getHeaderRow());
					String[] row = ds.getRawRowData();
					if (row != null) {
						for (int i = 0; i < row.length; i++) {
							TableColumn col = new TableColumn(sampleData, SWT.NONE, i);
							col.setResizable(true);
							col.setWidth(25);
							col.setText(row[i]);
						}
					}
				} else {
					ds.GoToRecord(ds.getDataRow());
					String[] row = ds.getRawRowData();
					if (row != null) {
						for (int i = 0; i < row.length; i++) {
							TableColumn col = new TableColumn(sampleData, SWT.NONE, i);
							col.setResizable(true);
							col.setWidth(25);
							col.setText(String.valueOf(i + 1));
						}
					}
				}

				// insert items up to table item count
				TableItem[] items = sampleData.getItems();
				for (int i = 0; i < items.length; i++) {
					ds.GoToRecord(ds.getDataRow() + i);
					items[i].setText(ds.getRawRowData());
					// do I need to insert missing columns?
				}

				// pack the columns
				TableColumn[] columns = sampleData.getColumns();
				for (int i = 0; i < columns.length; i++)
					columns[i].pack();
			} catch (Exception e) {
				setMessage(e.getMessage(), DialogPage.ERROR);
			}
		}
	}

	/**
     *
     */
	protected void detectDelimiters() {
		// TODO: use CSV library to set the delimiter combos..
	}

	protected DelimitedFile getDataSource() {
		DelimitedFile result = null;
		try {
			DataSource ds = ((CrosswalkCreationWizard) this.getWizard()).dataSource;
			result = (DelimitedFile) ds;
		} catch (Exception ignored) {
		}
		return result;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if(visible == true) {
			this.update();
		}
	}

}
