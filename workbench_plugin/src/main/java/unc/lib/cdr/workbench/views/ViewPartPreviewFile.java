package unc.lib.cdr.workbench.views;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class ViewPartPreviewFile extends ViewPart {

	ImageProvider provider = null;
	ImageViewer viewer = null;
	Image image;

	public ViewPartPreviewFile() {
	}

	ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part, final ISelection selection) {
			part.getSite().getShell().getDisplay().asyncExec(new Runnable() {

				@Override
				public void run() {
					handleSelection(selection);
				}});
		}
	};

	private void handleSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			Object o = sel.getFirstElement();
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
			provider = (ImageProvider) ((IAdaptable) object).getAdapter(ImageProvider.class);
		
		// If we haven't found an adapter yet, try asking the AdapterManager.
		try {
			if (provider == null)
				provider = (ImageProvider) Platform.getAdapterManager().loadAdapter(object, ImageProvider.class.getName());
		} catch(NullPointerException ignored) {}
		return provider;
	}

	@Override
	public void createPartControl(Composite parent) {
		getSelectionService().addPostSelectionListener(selectionListener);
		handleSelection(getSelectionService().getSelection());
		viewer = new ImageViewer(parent, SWT.NONE);
	}

	protected void setImageProvider(final ImageProvider newprovider) {
		if (newprovider == null)
			return;
		Image newimage = newprovider.getImage(viewer.getDisplay());
		if (newimage != null) {
			viewer.setImage(newimage);
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
