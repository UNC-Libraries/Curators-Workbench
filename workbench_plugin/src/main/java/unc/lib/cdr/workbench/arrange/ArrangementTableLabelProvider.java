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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelDecorator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.views.LabelImageFactory;

public class ArrangementTableLabelProvider implements ITableLabelProvider {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ArrangementTableLabelProvider.class);
    public static final String[] headers = { "Name", "Status" };
    public static final int[] bounds = { 400, 80 };
    public static final int COL_NAME = 0;
    public static final int COL_STATUS = 1;
    private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
		    .getDecoratingWorkbenchLabelProvider();
    private ILabelDecorator decorator = provider.getLabelDecorator();

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang
     * .Object, int)
     */
    @Override
    public Image getColumnImage(Object element, int columnIndex) {
	Image result = null;
	if (COL_NAME == columnIndex) {
	    // TODO add adapters from DivType to corresponding IResources
	    if (element instanceof DivType) {
		DivType d = (DivType) element;
		Object adapted = Platform.getAdapterManager().getAdapter(d, IResource.class);
		if(adapted != null) {
		    IResource r = (IResource)adapted;
		    result = provider.getImage(r);
		}
	    } else if(element instanceof IProject) {
		return null;
	    }
	    if (result == null) {
		result = LabelImageFactory.getImageForObject(element);
	    }
	    if (decorator != null) {
		if (decorator instanceof LabelDecorator) {
		    LabelDecorator ld2 = (LabelDecorator) decorator;
		    Image decorated = ld2.decorateImage(result, element, provider.getDecorationContext());
		    if (decorated != null) {
			return decorated;
		    }
		} else {
		    Image decorated = decorator.decorateImage(result, element);
		    if (decorated != null) {
			return decorated;
		    }
		}
	    }
	}
	return result;
    }

    @Override
    public String getColumnText(Object element, int columnIndex) {
	if (element instanceof IProject) {
	    IProject p = (IProject) element;
	    switch (columnIndex) {
	    case (COL_NAME):
		return provider.getText(element);
		// return p.getName();
	    case (COL_STATUS):
		if (p.isOpen()) {
		    return "open";
		} else {
		    return "closed";
		}
	    }
	}
	// it is a DivType
	DivType d = (DivType) element;
	switch (columnIndex) {
	case (COL_NAME):
	    // return provider.getText(element);
	    return d.getLabel();
	default:
	    return "n/a";
	}
    }

    @Override
    public void addListener(ILabelProviderListener listener) {
	this.provider.addListener(listener);
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
	return this.provider.isLabelProperty(element, property);
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
	this.provider.removeListener(listener);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.ILabelDecorator#decorateImage(org.eclipse.swt
     * .graphics.Image, java.lang.Object)
     */
    // @Override
    // public Image decorateImage(Image image, Object element) {
    // log.debug("decorating Image for Div");
    // return decorator.decorateImage(image, element);
    // }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.ILabelDecorator#decorateText(java.lang.String,
     * java.lang.Object)
     */
    // @Override
    // public String decorateText(String text, Object element) {
    // return decorator.decorateText(text, element);
    // }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.IDelayedLabelDecorator#prepareDecoration(java
     * .lang.Object, java.lang.String)
     */
    // @Override
    // public boolean prepareDecoration(Object element, String originalText) {
    // return decorator.prepareDecoration(element, originalText);
    // }

}
