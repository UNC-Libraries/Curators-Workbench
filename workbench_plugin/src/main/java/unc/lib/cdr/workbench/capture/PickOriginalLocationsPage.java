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
package unc.lib.cdr.workbench.capture;

import irods.efs.plugin.IrodsConnectionDialog;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.fieldassist.AutoCompleteField;
import org.eclipse.jface.fieldassist.ComboContentAdapter;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;
import org.osgi.service.prefs.BackingStoreException;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 *
 */
public class PickOriginalLocationsPage extends WizardPage implements Listener {

	// constants
	private static final int SIZING_TEXT_FIELD_WIDTH = 250;
	private static final String PRESTAGE_PREFERENCE_NODE_ID = "prestage_locations";

	IStructuredSelection selection;

	// properties
	private URI location = null;

	// A boolean to indicate if the user has typed anything
	private boolean locationChanged = false;
	private boolean prestagedChanged = false;

	// widgets
	private Combo locationField;
	private Button drivesBrowseButton;
	private Button irodsBrowseButton;
	private Button preStagedButton;
	private Combo preStagedCombo;
	private Label preStageSuffixLabel;
	private Combo projectCombo;
	private CheckboxTreeViewer fileTreeViewer;
	private FileStoreProvider provider = new FileStoreProvider();

	private IProject project;

	private String prestagedLocation;
	private String[] previousPrestages;

	/**
	 * @param pageName
	 */
	public PickOriginalLocationsPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.selection = selection;
		setTitle("Import Originals");
		setDescription("Select original folders or files to include in your project.");
		loadPreviousPrestages();
	}

	/**
	 *
	 */
	private void loadPreviousPrestages() {
		org.osgi.service.prefs.Preferences preferences = new ConfigurationScope().getNode(Activator.PLUGIN_ID).node(PRESTAGE_PREFERENCE_NODE_ID);
		String[] keys = new String[] {};
		try {
			keys = preferences.childrenNames();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		final HashMap<String, Integer> counts = new HashMap<String, Integer>();
		for(String k : keys) {
			int c = preferences.node(k).getInt("count", 0);
			String uri = preferences.node(k).get("uri", "default");
			counts.put(uri, Integer.valueOf(c));
		}
		List<String> list = new ArrayList(counts.keySet());
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return counts.get(arg0) - counts.get(arg1);
			}
		});
		this.previousPrestages = list.toArray(new String[keys.length]);
	}

	private void saveToPreviousPrestages(String uri) {
		String loc = Integer.toString(uri.hashCode());
		org.osgi.service.prefs.Preferences allLocations = new ConfigurationScope().getNode(Activator.PLUGIN_ID).node(PRESTAGE_PREFERENCE_NODE_ID);
		int c = 1;
		try {
			if(allLocations.nodeExists(loc)) {
				c = c+allLocations.node(loc).getInt("count", 1);
			}
		} catch (BackingStoreException e1) {
			e1.printStackTrace();
		}
		allLocations.node(loc).putInt("count", c);
		allLocations.node(loc).put("uri", uri);
		try {
			allLocations.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	private String checkValidLocation() {
		// TODO validate it
		if (this.location != null) {
			return null;
		} else {
			return "You have not selected a valid location";
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		composite.setFont(parent.getFont());

		createRootDirectoryGroup(composite);
		createFileSelectionGroup(composite);
		// createButtonsGroup(composite);

		createDestinationGroup(composite);

		createOptionsGroup(composite);

		// restoreWidgetValues();
		updateWidgets();
		setPageComplete(determinePageCompletion());
		setErrorMessage(null); // should not initially have error message

		composite.pack();
		setControl(composite);
	}

	/**
	 * @param parent
	 */
	private void createFileSelectionGroup(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		composite.setLayout(layout);
		composite.setFont(parent.getFont());
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL
				| GridData.GRAB_VERTICAL));

		// Create the tree viewer to display the file tree
		fileTreeViewer = new CheckboxTreeViewer(composite);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 200;
		fileTreeViewer.getTree().setLayoutData(gd);
		fileTreeViewer.setContentProvider(provider);
		fileTreeViewer.setLabelProvider(provider);
		fileTreeViewer.setAutoExpandLevel(1);
		fileTreeViewer.setInput(FileStoreProvider.EMPTY_ROOT); // pass a non-null that will be ignored

		fileTreeViewer.setComparator(new ViewerComparator() {
			@Override
			public int category(Object element) {
				if (IFileStore.class.isInstance(element)) {
					IFileStore fs = (IFileStore) element;
					if (fs.fetchInfo().isDirectory()) {
						return 0;
					} else {
						return 1;
					}
				}
				return super.category(element);
			}
		});

		// When user checks a checkbox in the tree, check all its children
		fileTreeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				// If the item is checked . . .
				if (event.getChecked()) {
					// uncheck all its parents and all descendants
					IFileStore f = (IFileStore) event.getElement();
					IPath fpath = new Path(f.toURI().getPath());
					for (Object checkedThing : fileTreeViewer.getCheckedElements()) {
						IFileStore thing = (IFileStore) checkedThing;
						IPath path = new Path(thing.toURI().getPath());
						if (fpath.equals(path)) {
							continue;
						} else if (fpath.isPrefixOf(path)) {
							fileTreeViewer.setChecked(checkedThing, false);
						} else if (path.isPrefixOf(fpath)) {
							fileTreeViewer.setChecked(checkedThing, false);
						}
					}
				}
				updateWidgets();
			}
		});
	}

	/**
	 * Creates the import destination specification controls.
	 *
	 * @param parent
	 *           the parent control
	 */
	protected final void createDestinationGroup(Composite parent) {
		// container specification group
		Composite containerGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		containerGroup.setLayout(layout);
		containerGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		containerGroup.setFont(parent.getFont());

		// container label
		Label resourcesLabel = new Label(containerGroup, SWT.NONE);
		resourcesLabel.setText("Into Project");
		resourcesLabel.setFont(parent.getFont());

		// container name entry field
		projectCombo = new Combo(containerGroup, SWT.SINGLE | SWT.BORDER | SWT.READ_ONLY);
		projectCombo.addListener(SWT.Selection, this);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		projectCombo.setLayoutData(data);
		projectCombo.setFont(parent.getFont());
		initialPopulateProjectField();
	}

	/**
	 * @param composite
	 */
	private void createOptionsGroup(Composite composite) {
		// TODO radio group: "link to selected originals"
		// TODO radio group: "link and capture selected originals"

		Group optionsGroup = new Group(composite, SWT.NONE);
		optionsGroup.setText("Pre-Staged Location");
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		optionsGroup.setLayout(layout);
		optionsGroup.setFont(composite.getFont());
		optionsGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

		Label lab = new Label(optionsGroup, SWT.WRAP);
		GridData labdata = new GridData();
		//labdata.verticalSpan = 2;
		labdata.horizontalAlignment = GridData.FILL;
		labdata.horizontalSpan = 3;
		lab.setLayoutData(labdata);
		lab.setText("Use this option to avoid copying files already staged at a known URI.\nChecksums will still be computed locally upon capture.");
		//lab.setBounds(10, 10, 100, 100);

		this.preStagedButton = new Button(optionsGroup, SWT.CHECK);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		data.horizontalSpan = 3;
		this.preStagedButton.setLayoutData(data);
		this.preStagedButton.setText("Top folder in tree is staged under the following URI:");
		this.preStagedButton.addListener(SWT.Selection, this);

		Label label = new Label(optionsGroup, SWT.None);
		label.setText("Base URI");
		this.preStagedCombo = new Combo(optionsGroup, SWT.BORDER | SWT.DROP_DOWN);
		this.preStagedCombo.setEnabled(false);
		GridData data2 = new GridData();
		data2.grabExcessHorizontalSpace = true;
		data2.horizontalAlignment = GridData.FILL;
		System.out.println(previousPrestages.length+" prestaging selections");
		this.preStagedCombo.setItems(previousPrestages);
		this.preStagedCombo.setLayoutData(data2);
		new AutoCompleteField(this.preStagedCombo, new ComboContentAdapter(), this.previousPrestages);


		preStagedCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateFromPrestagedLocation();
			}
		});
		preStagedCombo.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// If there has been a key pressed then mark as dirty
				prestagedChanged = true;
				if (e.character == SWT.CR) {
					prestagedChanged = false;
					updateFromPrestagedLocation();
				}
			}
			public void keyReleased(KeyEvent e) {
			}
		});
		preStagedCombo.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
			}
			public void focusLost(FocusEvent e) {
				// Clear the flag to prevent constant update
				if (prestagedChanged) {
					prestagedChanged = false;
					updateFromPrestagedLocation();
				}
			}
		});

		this.preStageSuffixLabel = new Label(optionsGroup, SWT.None);
		this.preStageSuffixLabel.setText(" ");
		GridData data3 = new GridData();
		data3.horizontalAlignment = GridData.FILL;
		data3.widthHint = 25;
		data3.grabExcessHorizontalSpace = true;
		this.preStageSuffixLabel.setLayoutData(data3);
	}

	/**
	 * Create the group for creating the root directory
	 */
	protected void createRootDirectoryGroup(Composite parent) {
		Composite sourceContainerGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 4;
		sourceContainerGroup.setLayout(layout);
		sourceContainerGroup.setFont(parent.getFont());
		sourceContainerGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

		Label groupLabel = new Label(sourceContainerGroup, SWT.NONE);
		groupLabel.setText("Location");
		groupLabel.setFont(parent.getFont());

		Label spacerLabel = new Label(sourceContainerGroup, SWT.NONE);
		spacerLabel.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL));
		spacerLabel.setText("");

		// source browse button
		drivesBrowseButton = new Button(sourceContainerGroup, SWT.PUSH);
		drivesBrowseButton.setText("Browse Drives..");
		drivesBrowseButton.addListener(SWT.Selection, this);
		drivesBrowseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		drivesBrowseButton.setFont(parent.getFont());

		// source browse button
		irodsBrowseButton = new Button(sourceContainerGroup, SWT.PUSH);
		irodsBrowseButton.setText("Browse iRODS..");
		irodsBrowseButton.addListener(SWT.Selection, this);
		irodsBrowseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		irodsBrowseButton.setFont(parent.getFont());

		setButtonLayoutData(drivesBrowseButton);
		setButtonLayoutData(irodsBrowseButton);

		// source name entry field
		locationField = new Combo(sourceContainerGroup, SWT.BORDER);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		data.horizontalSpan = 4;
		locationField.setLayoutData(data);
		locationField.setFont(parent.getFont());

		locationField.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateFromLocationField();
			}
		});

		locationField.addKeyListener(new KeyListener() {
			/*
			 * @see KeyListener.keyPressed
			 */
			public void keyPressed(KeyEvent e) {
				// If there has been a key pressed then mark as dirty
				locationChanged = true;
				if (e.character == SWT.CR) {
					locationChanged = false;
					updateFromLocationField();
				}
			}

			/*
			 * @see KeyListener.keyReleased
			 */
			public void keyReleased(KeyEvent e) {
			}
		});

		locationField.addFocusListener(new FocusListener() {
			/*
			 * @see FocusListener.focusGained(FocusEvent)
			 */
			public void focusGained(FocusEvent e) {
				// Do nothing when getting focus
			}

			/*
			 * @see FocusListener.focusLost(FocusEvent)
			 */
			public void focusLost(FocusEvent e) {
				// Clear the flag to prevent constant update
				if (locationChanged) {
					locationChanged = false;
					updateFromLocationField();
				}

			}
		});
	}

	/**
	 * @return
	 */
	private boolean determinePageCompletion() {
		String validLocationMessage = checkValidLocation();
		if (validLocationMessage != null) {
			setErrorMessage(validLocationMessage);
			return false;
		}
		if (this.fileTreeViewer.getSelection().isEmpty()) {
			setErrorMessage("Please select originals to link in the folder tree.");
			return false;
		}
		if (this.preStagedButton.getSelection()) {
			if (this.preStagedCombo.getText() != null && this.preStagedCombo.getText().trim().length() > 0) {
				try {
					new URI(this.preStagedCombo.getText());
				} catch (URISyntaxException e) {
					setErrorMessage("Base URI must be blank or a valid URI: " + e.getLocalizedMessage());
					return false;
				}
			}
		}
		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	public URI getSourceLocation() {
		return location;
	}

	/**
   *
   */
	protected void handleDrivesBrowseButtonPressed() {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.SHEET);
		dialog.setMessage("Select the location");
		String locationstr = dialog.open();
		File f = new File(locationstr);
		this.location = f.toURI();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;
		if (source == this.drivesBrowseButton) {
			handleDrivesBrowseButtonPressed();
		} else if (source == this.irodsBrowseButton) {
			handleIrodsBrowseButtonPressed();
		} else if (source == this.preStagedButton) {
			handlePreStagedButtonPressed();
		}
		updateWidgets();
	}

	/**
	 *
	 */
	private void handlePreStagedButtonPressed() {
		this.preStagedCombo.setEnabled(this.preStagedButton.getSelection());
	}

	/**
	 *
	 */
	private IProject getProject() {
		String pname = this.projectCombo.getItems()[this.projectCombo.getSelectionIndex()];
		return ResourcesPlugin.getWorkspace().getRoot().getProject(pname);
	}

	/**
     *
     */
	protected void handleIrodsBrowseButtonPressed() {
		IrodsConnectionDialog dialog = new IrodsConnectionDialog(getShell());
		if (IrodsConnectionDialog.OK == dialog.open()) {
			location = dialog.getLocation();
		}
	}

	/**
	 *
	 */
	private void initialPopulateProjectField() {
		java.util.List<String> openProjects = new ArrayList<String>();
		for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (p.isOpen())
				openProjects.add(p.getName());
		}
		projectCombo.setItems(openProjects.toArray(new String[] {}));

		if (IProject.class.isInstance(selection.getFirstElement())) {
			IProject p = (IProject) selection.getFirstElement();
			if (p.isOpen()) {
				projectCombo.select(openProjects.indexOf(p.getName()));
			}
		} else if (OriginalFoldersProjectElement.class.isInstance(selection.getFirstElement())) {
			OriginalFoldersProjectElement o = (OriginalFoldersProjectElement) selection.getFirstElement();
			if (o.getProject().isOpen()) {
				projectCombo.select(openProjects.indexOf(o.getProject().getName()));
			}
		} else {
			projectCombo.select(0);
		}
	}

	/**
	 * Check if widgets are enabled or disabled by a change in the dialog.
	 */
	protected void updateWidgets() {
		if (location != null) {
			if (URIUtil.isFileURI(this.location)) {
				this.locationField.setText(location.getPath());
			} else {
				this.locationField.setText(location.toString());
			}
		} else {
			this.locationField.setText("");
		}
		if (prestagedLocation != null) {
			this.preStagedCombo.setText(prestagedLocation);
		} else {
			this.preStagedCombo.setText("");
		}
		try {
			updateFileTree();
		} catch (Exception e) {
			e.printStackTrace();
		}

		boolean pageComplete = determinePageCompletion();
		setPageComplete(pageComplete);
		if (pageComplete) {
			setMessage(null);
		}
	}

	private void updateFileTree() throws URISyntaxException, CoreException {
		URI baseURI = null;
		IFileStore base = null;
		if (location == null) {
			this.fileTreeViewer.setInput(FileStoreProvider.EMPTY_ROOT);
		} else {
			baseURI = location;
			base = EFS.getStore(baseURI);
			if (!base.equals(this.fileTreeViewer.getInput())) {
				this.fileTreeViewer.setInput(new FileStoreProvider.Root(base));
				this.preStageSuffixLabel.setText(base.getName());
			}
		}
	}

	private void updateFromLocationField() {
		try {
			URI loc = URIUtil.fromString(locationField.getText());
			if (loc.getScheme() == null) {
				loc = URIUtil.fromString("file:" + locationField.getText());
			}
		} catch (URISyntaxException e) {
			this.location = null;
			setErrorMessage("Cannot parse location: " + e.getLocalizedMessage());
		}
		updateWidgets();
	}

	private void updateFromPrestagedLocation() {
		this.prestagedLocation = this.preStagedCombo.getText();
		updateWidgets();
	}

	/**
	 * @return
	 */
	public boolean finish() {
		List<URI> selected = getSelectedLocations();
		URI prestageBase = null;
		try {
			if (this.prestagedLocation != null) {
				prestageBase = new URI(this.prestagedLocation);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return false;
		}
		Job linkJob = new OriginalsLinkJob(this.location, selected, getProject(), this.preStagedButton.getSelection(), prestageBase);
		// linkJob.addJobChangeListener(this);
		linkJob.schedule();

		if(this.preStagedButton.getSelection()) {
			this.saveToPreviousPrestages(prestageBase.toString());
		}
		// SNAPSHOT MAY NOT BE NEEDED ANY MORE and takes time
		// for (IFolder folder : linkJob.getLinkFolders()) {
		// Job snapshotJob = new OriginalFolderSnapshotJob(folder, false);
		// snapshotJob.schedule(Job.BUILD);
		// }
		return true;
	}

	/**
	 * @return
	 *
	 */
	private List<URI> getSelectedLocations() {
		List<URI> result = new ArrayList<URI>();
		for (Object o : this.fileTreeViewer.getCheckedElements()) {
			result.add(((IFileStore) o).toURI());
		}
		return result;
	}
}
