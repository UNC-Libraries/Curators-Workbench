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
package crosswalk.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

/**
 * @generated
 */
public class CrosswalkDomainNavigatorContentProvider implements ICommonContentProvider {

    /**
     * @generated
     */
    private AdapterFactoryContentProvider myAdapterFctoryContentProvier;

    /**
     * @generated
     */
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /**
     * @generated
     */
    private Viewer myViewer;

    /**
     * @generated
     */
    private AdapterFactoryEditingDomain myEditingDomain;

    /**
     * @generated
     */
    private WorkspaceSynchronizer myWorkspaceSynchronizer;

    /**
     * @generated
     */
    private Runnable myViewerRefreshRunnable;

    /**
     * @generated
     */
    public CrosswalkDomainNavigatorContentProvider() {
	myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(CrosswalkDiagramEditorPlugin.getInstance()
			.getItemProvidersAdapterFactory());
	TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
	myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
	    public Object get(Object key) {
		if (!containsKey(key)) {
		    put(key, Boolean.TRUE);
		}
		return super.get(key);
	    }
	});
	myViewerRefreshRunnable = new Runnable() {
	    public void run() {
		if (myViewer != null) {
		    myViewer.refresh();
		}
	    }
	};
	myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
	    public void dispose() {
	    }

	    public boolean handleResourceChanged(final Resource resource) {
		unloadAllResources();
		asyncRefresh();
		return true;
	    }

	    public boolean handleResourceDeleted(Resource resource) {
		unloadAllResources();
		asyncRefresh();
		return true;
	    }

	    public boolean handleResourceMoved(Resource resource, final URI newURI) {
		unloadAllResources();
		asyncRefresh();
		return true;
	    }
	});
    }

    /**
     * @generated
     */
    public void dispose() {
	myWorkspaceSynchronizer.dispose();
	myWorkspaceSynchronizer = null;
	myViewerRefreshRunnable = null;
	myViewer = null;
	unloadAllResources();
	((TransactionalEditingDomain) myEditingDomain).dispose();
	myEditingDomain = null;
    }

    /**
     * @generated
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	myViewer = viewer;
    }

    /**
     * @generated
     */
    void unloadAllResources() {
	for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
	    nextResource.unload();
	}
    }

    /**
     * @generated
     */
    void asyncRefresh() {
	if (myViewer != null && !myViewer.getControl().isDisposed()) {
	    myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
	}
    }

    /**
     * @generated
     */
    public Object[] getElements(Object inputElement) {
	return getChildren(inputElement);
    }

    /**
     * @generated
     */
    public void restoreState(IMemento aMemento) {
    }

    /**
     * @generated
     */
    public void saveState(IMemento aMemento) {
    }

    /**
     * @generated
     */
    public void init(ICommonContentExtensionSite aConfig) {
    }

    /**
     * @generated
     */
    public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof IFile) {
	    IFile file = (IFile) parentElement;
	    URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	    Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
	    return wrapEObjects(myAdapterFctoryContentProvier.getChildren(resource), parentElement);
	}

	if (parentElement instanceof CrosswalkDomainNavigatorItem) {
	    return wrapEObjects(
			    myAdapterFctoryContentProvier.getChildren(((CrosswalkDomainNavigatorItem) parentElement)
					    .getEObject()), parentElement);
	}
	return EMPTY_ARRAY;
    }

    /**
     * @generated
     */
    public Object[] wrapEObjects(Object[] objects, Object parentElement) {
	Collection result = new ArrayList();
	for (int i = 0; i < objects.length; i++) {
	    if (objects[i] instanceof EObject) {
		result.add(new CrosswalkDomainNavigatorItem((EObject) objects[i], parentElement,
				myAdapterFctoryContentProvier));
	    }
	}
	return result.toArray();
    }

    /**
     * @generated
     */
    public Object getParent(Object element) {
	if (element instanceof CrosswalkAbstractNavigatorItem) {
	    CrosswalkAbstractNavigatorItem abstractNavigatorItem = (CrosswalkAbstractNavigatorItem) element;
	    return abstractNavigatorItem.getParent();
	}
	return null;
    }

    /**
     * @generated
     */
    public boolean hasChildren(Object element) {
	return element instanceof IFile || getChildren(element).length > 0;
    }

}
