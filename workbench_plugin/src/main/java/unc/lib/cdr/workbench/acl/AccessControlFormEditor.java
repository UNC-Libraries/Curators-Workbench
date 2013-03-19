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
package unc.lib.cdr.workbench.acl;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import edu.unc.lib.schemas.acl.AccessControlType;
import gov.loc.mods.mods.presentation.ModsEditorPlugin;
import gov.loc.mods.mods.presentation.URIFragmentEditorInput;

/**
 * @author Gregory Jansen
 * 
 */
public class AccessControlFormEditor extends FormEditor {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(AccessControlFormEditor.class);

	protected AccessControlType model = null;
	protected AccessControlFormPage page = null;
	protected AdapterFactoryEditingDomain editingDomain;
	protected ComposedAdapterFactory adapterFactory;
	protected AdapterFactoryItemDelegator itemDelegator;
	protected AdapterFactoryLabelProvider labelProvider;
	
	private CommandStackListener commandStackListener = new CommandStackListener() {
		@Override
		public void commandStackChanged(final EventObject event) {
			getContainer().getDisplay().asyncExec(new Runnable() {
				public void run() {
					editorDirtyStateChanged();
				}
			});
		}
	};

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setPartName(input.getName());
		initializeEditingDomainAndModel();
		//ResourcesPlugin.getWorkspace()
		//		.addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	public AccessControlFormEditor() {
	}

	protected void initializeEditingDomainAndModel() {
		IProject project = null;
		if(this.getEditorInput() instanceof URIFragmentEditorInput) {
			URIFragmentEditorInput in = (URIFragmentEditorInput)this.getEditorInput();
			project = ResourcesPlugin.getWorkspace().getRoot().getProject(in.getProjectName());
			this.adapterFactory = MetsProjectNature.getAdapterFactory();
			this.editingDomain = MetsProjectNature.get(project).getEditingDomain();
			EObject eobj = MetsProjectNature.getModel(in);
			this.model = (AccessControlType)eobj;
		} else {
			LOG.warn("editor input unexpected: "+this.getEditorInput());
		}

		// command stack that will notify this editor as commands are executed
		CommandStack commandStack = this.editingDomain.getCommandStack();

		// Add a listener to set the editor dirty of commands have been executed
		commandStack.addCommandStackListener(commandStackListener);
		// These provide access to the model items, their property source and label
		this.itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
		this.labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
	}
	
	@Override
	public void dispose() {
		this.editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);
		super.dispose();
	}

	@Override
	protected FormToolkit createToolkit(Display display) {
		// Create a toolkit that shares colors between editors.
		return new FormToolkit(display);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormEditor#addPages()
	 */
	@Override
	protected void addPages() {
		try {
			this.page = new AccessControlFormPage(this);
			addPage(this.page);
		} catch (PartInitException e) {
		}
	}

	@Override
	public boolean isDirty() {
		return ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		// Do the work within an operation because this is a long running activity that modifies the workbench.
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			//
			@Override
			public void execute(IProgressMonitor monitor) {
				// Save the resources to the file system.
				try {
					MetsProjectNature.getNatureForMetsObject(model).save();
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		};
		try {
			// This runs the options, and shows progress.
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);
			// Refresh the necessary state.
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			ModsEditorPlugin.INSTANCE.log(exception);
		}
	}
	
}
