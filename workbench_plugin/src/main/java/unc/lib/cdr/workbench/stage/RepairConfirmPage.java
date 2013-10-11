package unc.lib.cdr.workbench.stage;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class RepairConfirmPage extends WizardPage {
	private Text text;
	private Table table;

	protected RepairConfirmPage(String pageName, String desc) {
		super(pageName);
		this.setTitle(pageName);
		this.setDescription(desc);
	}

	@Override
	public boolean isPageComplete() {
		return true;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblStagingArea = new Label(container, SWT.NONE);
		lblStagingArea.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblStagingArea.setText("Project Staging");
		
		text = new Text(container, SWT.BORDER);
		text.setEditable(false);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblStagedFileUri = new Label(container, SWT.NONE);
		lblStagedFileUri.setAlignment(SWT.CENTER);
		lblStagedFileUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		lblStagedFileUri.setText("Staged File Manifest Adjustments");
		
		table = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnOldUriPrefix = new TableColumn(table, SWT.NONE);
		tblclmnOldUriPrefix.setWidth(100);
		tblclmnOldUriPrefix.setText("Old URI Prefix");
		
		TableColumn tblclmnNewUriPrefix = new TableColumn(table, SWT.NONE);
		tblclmnNewUriPrefix.setWidth(100);
		tblclmnNewUriPrefix.setText("New URI Prefix");
	}
	
	void onEnterPage(RepairProjectStagingWizard wiz) {
		text.setText(wiz.projectAreaPage.getSelection().getURI().toString());
		TableItem projTableItem = new TableItem(table, SWT.NONE);
		projTableItem.setText(0, wiz.projectReplacePrefixPage.replacedURIPrefix.toString());
		projTableItem.setText(1, wiz.projectAreaPage.getSelection().getURI().toString());
		for(TableColumn c : table.getColumns()) {
			c.pack();
		}
	}
	
}
