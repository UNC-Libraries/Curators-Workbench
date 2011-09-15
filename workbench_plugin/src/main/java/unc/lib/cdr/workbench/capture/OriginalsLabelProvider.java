/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.capture;

import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.views.LabelImageFactory;

/**
 * @author Gregory Jansen
 * 
 */
public class OriginalsLabelProvider implements ILabelProvider/* , IDelayedLabelDecorator */{
	private static final Logger LOG = LoggerFactory.getLogger(OriginalsLabelProvider.class);
	private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
			.getDecoratingWorkbenchLabelProvider();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse. jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		this.provider.addListener(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang .Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return this.provider.isLabelProperty(element, property);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
	 * .jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		this.provider.removeListener(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelDecorator#decorateImage(org.eclipse.swt .graphics.Image, java.lang.Object)
	 */
	// @Override
	// public Image decorateImage(Image image, Object element) {
	// return decorator.decorateImage(image, element);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelDecorator#decorateText(java.lang.String, java.lang.Object)
	 */
	// @Override
	// public String decorateText(String text, Object element) {
	// return decorator.decorateText(text, element);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IDelayedLabelDecorator#prepareDecoration(java .lang.Object, java.lang.String)
	 */
	// @Override
	// public boolean prepareDecoration(Object element, String originalText) {
	// return decorator.prepareDecoration(element, originalText);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		if (element instanceof OriginalFoldersProjectElement) {
			return LabelImageFactory.getImageForObject(element);
		}
		return provider.getImage(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof OriginalFoldersProjectElement) {
			return ((OriginalFoldersProjectElement) element).getText();
		}
		return provider.getText(element);
	}

}