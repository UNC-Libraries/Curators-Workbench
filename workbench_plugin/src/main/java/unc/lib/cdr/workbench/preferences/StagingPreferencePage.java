package unc.lib.cdr.workbench.preferences;

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class StagingPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
    // RadioGroupFieldEditor radioGroup;
    Table sLocsTable;
    Button deleteButton;
    Button editButton;
    Button addButton;

    public StagingPreferencePage() {
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    @Override
    public Control createContents(Composite parent) {
	Composite result = new Composite(parent, SWT.NONE);
	GridLayout layout = new GridLayout(3, false);
	result.setLayout(layout);
	result.setLayoutData(new GridData(GridData.FILL_BOTH));
	sLocsTable = new Table(result, SWT.BORDER | SWT.SINGLE);
	GridData gd = new GridData(GridData.FILL_BOTH);
	gd.horizontalSpan = 3;
	sLocsTable.setLayoutData(gd);
	sLocsTable.setLinesVisible(true);
	sLocsTable.setHeaderVisible(true);
	TableColumn nameCol = new TableColumn(sLocsTable, SWT.NONE);
	nameCol.setText("name");
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
	addButton.setText("Add New");
	editButton = new Button(result, SWT.NONE);
	editButton.setText("Modify");
	deleteButton = new Button(result, SWT.NONE);
	deleteButton.setText("Delete");
	List<String[]> stages = Activator.getDefault().getStagingLocationsPreference();
	if (stages.size() > 0) {
	    for (String[] l : stages) {
		addLocation(l[0], l[1]);
	    }
	} else {
	    performDefaults();
	}
	sLocsTable.getColumn(0).pack();
	sLocsTable.getColumn(1).pack();
	setTitle("Staging Locations");
	setDescription("Set the staging locations available to new projects.");
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
		StagingLocationDialog d = new StagingLocationDialog(event.widget.getDisplay().getActiveShell(),
				"Add Project Staging Location");
		if (d.open() == Window.OK) {
		    TableItem add = new TableItem(sLocsTable, SWT.NULL);
		    add.setText(new String[] { d.getName(), d.getUri() });
		}
	    }
	});
	editButton.addListener(SWT.Selection, new Listener() {
	    @Override
	    public void handleEvent(Event event) {
		StagingLocationDialog d = new StagingLocationDialog(event.widget.getDisplay().getActiveShell(),
				"Modify Project Staging Location");
		TableItem sel = sLocsTable.getSelection()[0];
		d.setName(sel.getText(0));
		d.setUri(sel.getText(1));
		if (d.open() == Window.OK) {
		    sel.setText(0, d.getName());
		    sel.setText(1, d.getUri());
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
	    editButton.setEnabled(true);
	    deleteButton.setEnabled(true);
	} else {
	    editButton.setEnabled(false);
	    deleteButton.setEnabled(false);
	}
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
	setPreferenceStore(Activator.getDefault().getPreferenceStore());
    }

    @Override
    protected void performDefaults() {
	sLocsTable.removeAll();
	List<String[]> locs = Activator.getDefault().getDefaultStagingLocationsPreference();
	for (String[] l : locs) {
	    addLocation(l[0], l[1]);
	}
    }

    /**
     * @param string
     * @param string2
     */
    private void addLocation(String name, String uri) {
	TableItem item = new TableItem(sLocsTable, SWT.NONE);
	item.setText(0, name);
	item.setText(1, uri);
    }

    @Override
    public boolean performOk() {
	List<String[]> locs = new ArrayList<String[]>();
	for (TableItem i : sLocsTable.getItems()) {
	    String name = i.getText(0);
	    String uri = i.getText(1);
	    locs.add(new String[] { name, uri });
	}
	Activator.getDefault().setStagingLocationsPreference(locs);
	return super.performOk();
    }

}