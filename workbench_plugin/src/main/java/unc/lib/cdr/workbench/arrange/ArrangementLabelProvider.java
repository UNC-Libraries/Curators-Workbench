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

import gov.loc.mets.DivType;
import gov.loc.mets.provider.MetsItemProviderAdapterFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.ICustomEObjectBucket;
import unc.lib.cdr.workbench.views.LabelImageFactory;

public class ArrangementLabelProvider extends AdapterFactoryLabelProvider {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(ArrangementLabelProvider.class);

	private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
			.getDecoratingWorkbenchLabelProvider();
	// private ComposedAdapterFactory metsAdapterFactory = MetsProjectNature.getAdapterFactory();
	// private Set<ILabelProviderListener> listeners = new HashSet<ILabelProviderListener>();

	private static AdapterFactory adapterFactory;

	static {
		adapterFactory = new ComposedAdapterFactory(new AdapterFactory[] { new ResourceItemProviderAdapterFactory(),
				new MetsItemProviderAdapterFactory(), new ReflectiveItemProviderAdapterFactory() });
	}

	/**
     *
     */
	public ArrangementLabelProvider() {
		super(adapterFactory);
		// metsAdapterFactory.addListener(this);
	}

	// @Override
	// public void addListener(ILabelProviderListener listener) {
	// this.listeners.add(listener);
	// this.provider.addListener(listener);
	// }

	// @Override
	// public void dispose() {
	// super.dispose();
	// }

	// @Override
	// public boolean isLabelProperty(Object element, String property) {
	// return super.isLabelProperty(element, property);
	// }

	// @Override
	// public void removeListener(ILabelProviderListener listener) {
	// this.listeners.remove(listener);
	// this.provider.removeListener(listener);
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		Image result = provider.getImage(element);

		if(result == null)
			result = super.getImage(element);
		// if (element instanceof DivType) {
		// DivType d = (DivType) element;
		// Object adapted = Platform.getAdapterManager().getAdapter(d, IResource.class);
		// if (adapted != null) {
		// IResource r = (IResource) adapted;
		// }
		// }
		if (result == null)
			result = LabelImageFactory.getImageForObject(element);
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof ArrangementProjectElement) {
			return ((ArrangementProjectElement) element).getText();
		} else if (element instanceof DivType) {
			return super.getText(element);
		} else if (element instanceof ICustomEObjectBucket) {
			return ((ICustomEObjectBucket) element).getText();
		} else {
			return super.getText(element);
		}
		/*
		 * if (result == null && element instanceof DivType) { DivType d = (DivType) element; result = d.getLABEL1();
		 * //Object adapted = Platform.getAdapterManager().getAdapter(d, IResource.class); //if (adapted != null) {
		 * //IResource r = (IResource) adapted; //} } else
		 */

		// return result;
		// return provider.getLabelDecorator().decorateText(result, element);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.INotifyChangedListener#notifyChanged(org
	 * .eclipse.emf.common.notify.Notification)
	 */
	// @Override
	// public void notifyChanged(Notification notification) {
	// // LOG.debug("notified of model change in "+notification.getNotifier());
	// final LabelProviderChangedEvent e = new LabelProviderChangedEvent(this, notification.getNotifier());
	// Display.getDefault().asyncExec(new Runnable() {
	// public void run() {
	// for (ILabelProviderListener l : listeners) {
	// l.labelProviderChanged(e);
	// }
	// }
	// });
	// }
}
