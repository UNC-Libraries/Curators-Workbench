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
package unc.lib.cdr.workbench.accession;

import static unc.lib.cdr.workbench.accession.OriginalsTableLabelProvider.bounds;
import static unc.lib.cdr.workbench.accession.OriginalsTableLabelProvider.headers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.part.EditorPart;

public class OriginalFolderEditorPart extends EditorPart {
	public static final String ID = "cdr-workbench.editorOriginalFolder";

	TreeViewer viewer = null;
	IFolder folder = null;

	public OriginalFolderEditorPart() {
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setInput(input);
		setSite(site);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		createViewer(parent);
		OriginalFolderEditorInput in = (OriginalFolderEditorInput) getEditorInput();
		this.folder = in.getFolder();
		viewer.setInput(folder);
		this.setPartName(this.folder.getName());
		this.setContentDescription("location: " + this.folder.getLocationURI().toString());
	}

	/**
	 * @param parent
	 */
	private void createViewer(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		createColumns(viewer);
		// viewer.setContentProvider(new OriginalsContentProvider());
		viewer.setContentProvider(new WorkbenchContentProvider());
		viewer.setLabelProvider(new OriginalsTableLabelProvider());

		viewer.setFilters(new ViewerFilter[] { new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				boolean result = true;
				if (parentElement instanceof IProject) {
					if (element instanceof IFile) {
						IFile f = (IFile) element;
						if (".project".equals(f.getName())) {
							result = false;
						}
					}
				}
				return result;
			}
		} });

		// TODO add sorting into categories (imported metadata vs. linked file sets) and by size/date

		Transfer[] ttypes = new Transfer[] { LocalSelectionTransfer.getTransfer() };
		viewer.addDragSupport(DND.DROP_COPY | DND.DROP_MOVE, ttypes, new OriginalsDragSourceListener(viewer));
		this.getSite().setSelectionProvider(viewer);
		MenuManager menuMgr = new MenuManager();
		// menuMgr.setRemoveAllWhenShown(true);
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		this.getSite().registerContextMenu(menuMgr, viewer);
	}

	/**
	 * @param viewer2
	 */
	private void createColumns(TreeViewer viewer2) {
		for (int i = 0; i < headers.length; i++) {
			TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.NONE);
			column.getColumn().setText(headers[i]);
			column.getColumn().setWidth(bounds[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
		}
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);
	}

	@Override
	public void setFocus() {
		this.viewer.getControl().setFocus();
	}

}
