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
package unc.lib.cdr.workbench.arrange;

import static unc.lib.cdr.workbench.arrange.ArrangementTableLabelProvider.bounds;
import static unc.lib.cdr.workbench.arrange.ArrangementTableLabelProvider.headers;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ResourceTransfer;
import org.eclipse.ui.part.ViewPart;

public class ArrangementTreeViewPart extends ViewPart {

	TreeViewer viewer = null;
	Clipboard clipboard = null;

	@Override
	public void createPartControl(Composite parent) {
		createViewer(parent);
		// clipboard = new Clipboard(getSite().getShell().getDisplay());
		// IActionBars bars = getViewSite().getActionBars();
		// bars.setGlobalActionHandler(ActionFactory.CUT, new
		// CutGadgetAction(viewer, clipboard));
		// bars.setGlobalActionHandler(IWorkbenchActionConstants.COPY, new
		// CopyGadgetAction(viewer, clipboard));
		// bars.setGlobalActionHandler(IWorkbenchActionConstants.PASTE, new
		// PasteTreeGadgetAction(viewer, clipboard));
		viewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
	}

	/**
	 * @param parent
	 */
	private void createViewer(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		createColumns(viewer);
		viewer.setContentProvider(new ArrangementContentProvider());
		viewer.setLabelProvider(new ArrangementTableLabelProvider());
		// viewer.setLabelProvider(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());

		Transfer[] transferTypes = new Transfer[] { ResourceTransfer.getInstance(), LocalSelectionTransfer.getTransfer() };
		ArrangementDropListener lis = new ArrangementDropListener(viewer);
		viewer.addDropSupport(DND.DROP_COPY | DND.DROP_MOVE, transferTypes, lis);

		Transfer[] ttypes = new Transfer[] { LocalSelectionTransfer.getTransfer() };
		viewer.addDragSupport(DND.DROP_MOVE, ttypes, new ArrangementDragSourceListener(viewer));

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
		viewer.getControl().setFocus();
	}

}
