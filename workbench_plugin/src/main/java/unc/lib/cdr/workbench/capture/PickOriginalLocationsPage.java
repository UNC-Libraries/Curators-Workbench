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

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;

/**
 * @author Gregory Jansen
 *
 */
public class PickOriginalLocationsPage extends WizardPage implements Listener {

	// constants
	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	IStructuredSelection selection;

	// properties
	private String location = "";

	// A boolean to indicate if the user has typed anything
	private boolean entryChanged = false;

	// widgets
	private Combo locationField;
	private Button drivesBrowseButton;
	private Button irodsBrowseButton;
	private Combo projectCombo;
	private CheckboxTreeViewer fileTreeViewer;
	private FileStoreProvider provider = new FileStoreProvider();

	private IProject project;

	/**
	 * @param pageName
	 */
	public PickOriginalLocationsPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.selection = selection;
		setTitle("Import Originals");
		setDescription("Select original folders or files to include in your project.");
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
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));

		// Create the tree viewer to display the file tree
		fileTreeViewer = new CheckboxTreeViewer(composite);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 200;
		fileTreeViewer.getTree().setLayoutData(gd);
		fileTreeViewer.setContentProvider(provider);
		fileTreeViewer.setLabelProvider(provider);
		fileTreeViewer.setAutoExpandLevel(1);
		fileTreeViewer.setInput(FileStoreProvider.EMPTY_ROOT); // pass a non-null that will be ignored

		fileTreeViewer.setComparator( new ViewerComparator() {
			@Override
			public int category(Object element) {
				if(IFileStore.class.isInstance(element)) {
					IFileStore fs = (IFileStore)element;
					if(fs.fetchInfo().isDirectory()) {
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
					IFileStore f = (IFileStore)event.getElement();
					IPath fpath = new Path(f.toURI().getPath());
					for(Object checkedThing : fileTreeViewer.getCheckedElements()) {
						IFileStore thing = (IFileStore)checkedThing;
						IPath path = new Path(thing.toURI().getPath());
						if(fpath.equals(path)) {
							continue;
						} else if(fpath.isPrefixOf(path)) {
							fileTreeViewer.setChecked(checkedThing, false);
						} else if(path.isPrefixOf(fpath)) {
							fileTreeViewer.setChecked(checkedThing, false);
						}
					}
				}
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
		groupLabel.setText("Base Location");
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
				entryChanged = true;
				if (e.character == SWT.CR) {
					entryChanged = false;
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
				if (entryChanged) {
					entryChanged = false;
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
		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	public String getSourceLocation() {
		return location;
	}

	/**
   *
   */
	protected void handleDrivesBrowseButtonPressed() {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.SHEET);
		dialog.setMessage("Select the location");
		location = dialog.open();
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
		}
		updateWidgets();
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
			location = dialog.getLocation().toString();
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
		} else if(OriginalFoldersProjectElement.class.isInstance(selection.getFirstElement())) {
			OriginalFoldersProjectElement o = (OriginalFoldersProjectElement)selection.getFirstElement();
			if(o.getProject().isOpen()) {
				projectCombo.select(openProjects.indexOf(o));
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
			this.locationField.setText(location);
		} else {
			this.locationField.setText("");
		}

		try {
			updateFileTree();
		} catch (Exception e) {
			// do nothing
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
		if(location == null || location.trim().length() == 0) {
			this.fileTreeViewer.setInput(FileStoreProvider.EMPTY_ROOT);
		} else {
			baseURI = new URI(location);
			if (baseURI.getScheme() == null) {
				baseURI = new URI("file:/" + location);
			}
			base = EFS.getStore(baseURI);
			this.fileTreeViewer.setInput(new FileStoreProvider.Root(base));
		}
	}

	private void updateFromLocationField() {
		this.location = locationField.getText();
		updateWidgets();
	}

	/**
	 * @return
	 */
	public boolean finish() {
		List<URI> selected = getSelectedLocations();
		Job linkJob = new OriginalsLinkJob(selected, getProject());
		//linkJob.addJobChangeListener(this);
		linkJob.schedule();

		// SNAPSHOT MAY NOT BE NEEDED ANY MORE and takes time
		//for (IFolder folder : linkJob.getLinkFolders()) {
//			Job snapshotJob = new OriginalFolderSnapshotJob(folder, false);
			//snapshotJob.schedule(Job.BUILD);
		//}
		return true;
	}

	/**
	 * @return
	 *
	 */
	private List<URI> getSelectedLocations() {
		List<URI> result = new ArrayList<URI>();
		for(Object o : this.fileTreeViewer.getCheckedElements()) {
			result.add(((IFileStore)o).toURI());
		}
		return result;
	}

}
