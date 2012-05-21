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
package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.capture.OriginalFolderEditorInput;
import unc.lib.cdr.workbench.capture.OriginalFolderEditorPart;
import unc.lib.cdr.workbench.rcp.Activator;

public class MetsProjectNavigator extends CommonNavigator implements ITabbedPropertySheetPageContributor {

	private static final Logger LOG = LoggerFactory.getLogger(MetsProjectNavigator.class);

	protected TabbedPropertySheetPage page;

	/**
	 * Constructs and returns an instance of {@link CommonViewer}. The ID of the Eclipse view part will be used to create
	 * the viewer.
	 * 
	 * Override this method if you want a subclass of the CommonViewer
	 * 
	 * @param aParent
	 *           A composite parent to contain the CommonViewer
	 * @return An instance of CommonViewer
	 * @since 3.4
	 */
	@Override
	protected CommonViewer createCommonViewerObject(Composite aParent) {
		CommonViewer result = new CommonViewer(getViewSite().getId(), aParent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		return result;
	}

	@Override
	protected Object getInitialInput() {
		return new WorkbenchWorkbenchRoot();
	}

	public String getContributorId() {
		return getSite().getId();
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IPropertySheetPage.class)
			return new TabbedPropertySheetPage(this);
		return super.getAdapter(adapter);
	}

	@Override
	protected void handleDoubleClick(DoubleClickEvent event) {
		IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		if (!selection.isEmpty()) {
			Object object = selection.getFirstElement();
			if (object instanceof IFolder) {
				IFolder f = (IFolder) object;
				OriginalFolderEditorInput editorInput = new OriginalFolderEditorInput(f);
				try {
					getSite().getPage().openEditor(editorInput, OriginalFolderEditorPart.ID, true);
				} catch (PartInitException ex) {
					Activator.getDefault().getLog().log(ex.getStatus());
				}
			} else if (object instanceof IFile) {
				IFile e = (IFile) object;
				FileEditorInput fei = new FileEditorInput(e);
				IEditorDescriptor ed = Workbench.getInstance().getEditorRegistry().getDefaultEditor(e.getName());
				if (ed != null) {
					try {
						getSite().getPage().openEditor(fei, ed.getId(), true);
					} catch (PartInitException ex) {
						Activator.getDefault().getLog().log(ex.getStatus());
					}
				} else {
					super.handleDoubleClick(event);
				}
			} else if (object instanceof DivType) {
				DivType d = (DivType) object;
				boolean hasUserDescription = false;
				for (MdSecType sec : d.getDmdSec()) {
					if (METSConstants.MD_STATUS_USER_EDITED.equals(sec.getSTATUS())) {
						hasUserDescription = true;
						break;
					}
				}
				if (hasUserDescription) {
					IHandlerService hs = (IHandlerService) getSite().getService(IHandlerService.class);
					try {
						hs.executeCommand("cdr-workbench.commandEditDescription", null);
					} catch (Exception e) {
						LOG.error("Problem executing EditDescription command", e);
					}
				} else {
					super.handleDoubleClick(event);
				}
			} else {
				super.handleDoubleClick(event);
			}
		}
	}

}
