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

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.accession.OriginalFolderEditorInput;
import unc.lib.cdr.workbench.accession.OriginalFolderEditorPart;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.xwalk.CrosswalkTreeElement;
import crosswalk.diagram.part.CrosswalkDiagramEditor;

public class MetsProjectNavigator extends CommonNavigator implements IDoubleClickListener,
		ITabbedPropertySheetPageContributor {

	private static final Logger LOG = LoggerFactory.getLogger(MetsProjectNavigator.class);

	protected TabbedPropertySheetPage page;

	//
	// protected CommonViewer createCommonViewerObject(Composite aParent) {
	// CommonViewer viewer = super.createCommonViewerObject(aParent);
	// //Transfer[] transferTypes = new Transfer[] {
	// ResourceTransfer.getInstance(), LocalSelectionTransfer.getTransfer() };
	// //ArrangementDropListener lis = new ArrangementDropListener(viewer);
	// //viewer.addDropSupport(DND.DROP_COPY | DND.DROP_MOVE, transferTypes,
	// lis);
	// //this.getNavigatorContentService().getDnDService().
	// return viewer;
	// }

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
		result.addDoubleClickListener(this);
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
	public Object getAdapter(Class adapter) {
		if (adapter == IPropertySheetPage.class)
			return new TabbedPropertySheetPage(this);
		return super.getAdapter(adapter);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.IDoubleClickListener#doubleClick(org.eclipse .jface.viewers.DoubleClickEvent)
	 */
	@Override
	public void doubleClick(DoubleClickEvent event) {
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
			} else if (object instanceof CrosswalkTreeElement) {
				CrosswalkTreeElement e = (CrosswalkTreeElement) object;
				FileEditorInput fei = new FileEditorInput(e.getFile());
				try {
					getSite().getPage().openEditor(fei, CrosswalkDiagramEditor.ID, true);
				} catch (PartInitException ex) {
					Activator.getDefault().getLog().log(ex.getStatus());
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
				}
			}
		}
	}

}
