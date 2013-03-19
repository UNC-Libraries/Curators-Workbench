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
package unc.lib.cdr.workbench.capture;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import unc.lib.cdr.workbench.originals.OriginalFileStore;

public class SelectFileExtensionsDialog extends TitleAreaDialog {
	
	public SelectFileExtensionsDialog(Shell parentShell, List<OriginalFileStore> tocapture) {
		super(parentShell);
		this.tocapture = tocapture;
	}

	@Override
	public void create() {
		super.create();
		// Set the title
		setTitle("Select File Extensions");
		// Set the message
		setMessage("Looking for file extensions..", IMessageProvider.INFORMATION);
	}

	Set<String> fileExtensions = new HashSet<String>();
	Set<String> selectedExtensions = new HashSet<String>();
	List<OriginalFileStore> tocapture = null;
	
	public Set<String> getSelectedFileExtensions() {
		return this.selectedExtensions;
	}
	
	@Override
	protected void okPressed() {
		Object[] checked = this.extCheckBox.getCheckedElements();
		for(Object o : checked) {
			this.selectedExtensions.add((String)o);
		}
		super.okPressed();
	}

	CheckboxTableViewer extCheckBox = null;

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		// layout.horizontalAlignment = GridData.FILL;
		parent.setLayout(layout);

		// The text fields will grow with the size of the dialog
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		Label label1 = new Label(parent, SWT.NONE);
		label1.setText("Select file extensions to capture");

		extCheckBox = CheckboxTableViewer.newCheckList(parent, SWT.BORDER);
		extCheckBox.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		extCheckBox.setContentProvider(new ExtContentProvider());
		extCheckBox.setSorter(new ViewerSorter());
		
		Job findExtensions = new Job("Finding file extensions") {
			IProgressMonitor mon = new NullProgressMonitor();
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				visit(tocapture.toArray(new IFileStore[] {}));
				return Status.OK_STATUS;
			}
			private void visit(IFileStore[] ofs) {
				for(final IFileStore s : ofs) {
					boolean isdir = s.fetchInfo().isDirectory();
					if(isdir) {
						IFileStore[] children = null;
						try {
							children = s.childStores(EFS.NONE, mon);
						} catch(CoreException e) {
						}
						if(children != null && children.length > 0) {
							visit(children);
						}
					} else {
						getShell().getDisplay().asyncExec(new Runnable() {
							@Override
							public void run() {
								String ext = null;
								String[] parts = s.getName().split(Pattern.quote("."));
								if(parts.length > 1) ext = parts[parts.length-1];
								final boolean added = fileExtensions.add(ext);
								if(added) extCheckBox.add(ext);
							}});
					}
				}
			}
		};
		findExtensions.setPriority(Job.INTERACTIVE);
		findExtensions.schedule();
		return parent;
	}
	
	public void addExtensionToTable(String ext) {
		this.extCheckBox.add(ext);
	}
	
	class ExtContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object arg0) {
			return fileExtensions.toArray();
		}
		@Override
		public void dispose() {
		}
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
}
