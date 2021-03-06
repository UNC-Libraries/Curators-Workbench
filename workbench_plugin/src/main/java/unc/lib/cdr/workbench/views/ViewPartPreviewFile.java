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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class ViewPartPreviewFile extends ViewPart {

	public class PreviewToggleAction extends Action {
		public PreviewToggleAction() {
			super("Disable Preview");
		}

		@Override
		public void run() {
			enabled = !enabled;
			if (enabled) {
				this.setText("Disable Preview");
			} else {
				this.setText("Enable Preview");
			}
		}
	}

	ImageProvider provider = null;
	ImageViewer viewer = null;
	Image image;
	boolean enabled = true;

	public ViewPartPreviewFile() {
	}

	ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part,
				final ISelection selection) {
			Job load = new Job("Loading image preview") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						handleSelection(selection);
					} catch (NullPointerException ignored) {
					}
					return Status.OK_STATUS;
				}
			};
			load.setPriority(Job.DECORATE);
			load.schedule();
		}
	};

	private void handleSelection(ISelection selection) {
		if (!enabled) {
			viewer.setImage(null);
			return;
		}
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			Object o = sel.getFirstElement();
			Image first = LabelImageFactory.getImageForObject(o);
			if (first == null) {
				LabelImageFactory.getImage(LabelImageFactory.Icon.Loading);
			}
			if (viewer != null) {
				viewer.setImage(first);
			}
			setImageProvider(getImageProvider(o));
		}
	}

	private ImageProvider getImageProvider(Object object) {
		// First, if the object is an ImageProvider, use it.
		if (ImageProvider.class.isInstance(object))
			return (ImageProvider) object;
		// Second, if the object is adaptable, ask it to get an adapter.
		ImageProvider provider = null;
		if (object instanceof IAdaptable)
			provider = (ImageProvider) ((IAdaptable) object)
					.getAdapter(ImageProvider.class);

		// If we haven't found an adapter yet, try asking the AdapterManager.
		try {
			if (provider == null)
				provider = (ImageProvider) Platform.getAdapterManager()
						.loadAdapter(object, ImageProvider.class.getName());
		} catch (NullPointerException ignored) {
		}
		return provider;
	}

	@Override
	public void createPartControl(Composite parent) {
		getSelectionService().addPostSelectionListener(selectionListener);
		handleSelection(getSelectionService().getSelection());
		viewer = new ImageViewer(parent, SWT.NONE);
		Action action = new PreviewToggleAction();
		IActionBars actionBars = getViewSite().getActionBars();
		IMenuManager dropDownMenu = actionBars.getMenuManager();
		// IToolBarManager toolBar = actionBars.getToolBarManager();
		dropDownMenu.add(action);
		// toolBar.add(action);
	}

	protected void setImageProvider(final ImageProvider newprovider) {
		if (newprovider == null || viewer == null)
			return;
		Image newimage = newprovider.getImage(viewer.getDisplay());
		if (newimage != null) {
			viewer.setImage(newimage);
		} else {
			viewer.setImage(LabelImageFactory
					.getImage(LabelImageFactory.Icon.NoPreview));
		}
		disposeImage();
		provider = newprovider;
		image = newimage;
	}

	public void dispose() {
		super.dispose();
		getSelectionService().removeSelectionListener(selectionListener);
		disposeImage();
	}

	private void disposeImage() {
		if (provider == null)
			return;
		if (image == null)
			return;
		provider.disposeImage(image);
		provider = null;
		image = null;
	}

	private ISelectionService getSelectionService() {
		return getSite().getWorkbenchWindow().getSelectionService();
	}

	public void setFocus() {
		viewer.setFocus();
	}

}
