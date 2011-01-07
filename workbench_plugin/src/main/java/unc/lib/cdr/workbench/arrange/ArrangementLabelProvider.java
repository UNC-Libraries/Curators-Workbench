package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.views.LabelImageFactory;

public class ArrangementLabelProvider implements ILabelProvider, INotifyChangedListener {

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(ArrangementLabelProvider.class);

    private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
		    .getDecoratingWorkbenchLabelProvider();
    private ComposedAdapterFactory metsAdapterFactory = MetsProjectNature.getAdapterFactory();
    private Set<ILabelProviderListener> listeners = new HashSet<ILabelProviderListener>();

    /**
     *
     */
    public ArrangementLabelProvider() {
	metsAdapterFactory.addListener(this);
    }

    @Override
    public void addListener(ILabelProviderListener listener) {
	this.listeners.add(listener);
	this.provider.addListener(listener);
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
	return true;
	// return this.provider.isLabelProperty(element, property);
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
	this.listeners.remove(listener);
	this.provider.removeListener(listener);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    @Override
    public Image getImage(Object element) {
	Image result = null;
	//if (element instanceof DivType) {
	  //  DivType d = (DivType) element;
	  //  Object adapted = Platform.getAdapterManager().getAdapter(d, IResource.class);
	  //  if (adapted != null) {
	//	IResource r = (IResource) adapted;
		result = provider.getImage(element);
	  //  }
	//}
	if (result == null) {
	    result = LabelImageFactory.getImageForObject(element);
	}
	return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
	String result = null;
	if (element instanceof DivType) {
	    DivType d = (DivType) element;
	    result = d.getLABEL1();
	    //Object adapted = Platform.getAdapterManager().getAdapter(d, IResource.class);
	    //if (adapted != null) {
		//IResource r = (IResource) adapted;
	    //}
	} else if (element instanceof ArrangementProjectElement) {
	    result = ((ArrangementProjectElement) element).getText();
	}
	return result;
	//return provider.getLabelDecorator().decorateText(result, element);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.emf.edit.provider.INotifyChangedListener#notifyChanged(org
     * .eclipse.emf.common.notify.Notification)
     */
    @Override
    public void notifyChanged(Notification notification) {
	// LOG.debug("notified of model change in "+notification.getNotifier());
	final LabelProviderChangedEvent e = new LabelProviderChangedEvent(this, notification.getNotifier());
	Display.getDefault().asyncExec(new Runnable() {
	    public void run() {
		for (ILabelProviderListener l : listeners) {
		    l.labelProviderChanged(e);
		}
	    }
	});
    }
}
