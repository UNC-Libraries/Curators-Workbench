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
package unc.lib.cdr.workbench.accession;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.IDelayedLabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.views.LabelImageFactory;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalsTableLabelProvider implements ITableLabelProvider, IDelayedLabelDecorator {
    private static final Logger log = LoggerFactory.getLogger(OriginalsTableLabelProvider.class);
    public static final String[] headers = { "Name", "Size", "Modified" };
    public static final int[] bounds = { 400, 80, 80 };
    public static final int COL_NAME = 0;
    public static final int COL_MODIFIED = 2;
    public static final int COL_SIZE = 1;
    private static DateFormat shortDate = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
    private DecoratingLabelProvider provider = (DecoratingLabelProvider) WorkbenchLabelProvider
		    .getDecoratingWorkbenchLabelProvider();
    private IDelayedLabelDecorator decorator = (IDelayedLabelDecorator) provider.getLabelDecorator();
    private LabelImageFactory imageFactory = new LabelImageFactory();

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
	if (columnIndex == 0) {
	    result = provider.getImage(element);
	    // result = imageFactory.getImageForObject(element);
	}
	return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang
     * .Object, int)
     */
    @Override
    public String getColumnText(Object element, int columnIndex) {
	String result = null;
	IResource r = null;
	if (element instanceof IResource) {
	    r = (IResource) element;
	}
	try {
	    switch (columnIndex) {
	    case COL_NAME:
		result = provider.getText(element);
		break;
	    case COL_MODIFIED:
		if (element instanceof IFolder || element instanceof IFile) {
		    result = getModified(r);
		}
		break;
	    case COL_SIZE:
		if (element instanceof IFolder || element instanceof IFile) {
		    return getSize(r);
		}
		break;
	    }
	} catch (CoreException e) {
	    log.debug(e.getLocalizedMessage());
	}
	return result;
    }

    /**
     * @param r
     * @return
     * @throws CoreException
     */
    private String getSize(IResource r) throws CoreException {
	return r.getPersistentProperty(IResourceConstants.BYTE_SIZE);
    }

    /**
     * @param r
     * @return
     * @throws CoreException
     */
    private String getModified(IResource r) throws CoreException {
	String result = null;
	String ts = r.getPersistentProperty(IResourceConstants.MODIFIED_TIMESTAMP);
	if (ts != null) {
	    Date modified = new Date(Long.parseLong(ts));
	    result = OriginalsTableLabelProvider.shortDate.format(modified);
	}
	return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.
     * jface.viewers.ILabelProviderListener)
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
     * @see
     * org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang
     * .Object, java.lang.String)
     */
    @Override
    public boolean isLabelProperty(Object element, String property) {
	return this.provider.isLabelProperty(element, property);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
     * .jface.viewers.ILabelProviderListener)
     */
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
    @Override
    public Image decorateImage(Image image, Object element) {
	return decorator.decorateImage(image, element);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.ILabelDecorator#decorateText(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public String decorateText(String text, Object element) {
	return decorator.decorateText(text, element);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.viewers.IDelayedLabelDecorator#prepareDecoration(java
     * .lang.Object, java.lang.String)
     */
    @Override
    public boolean prepareDecoration(Object element, String originalText) {
	return decorator.prepareDecoration(element, originalText);
    }

}
