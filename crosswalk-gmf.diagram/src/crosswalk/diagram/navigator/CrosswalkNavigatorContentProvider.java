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
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateInputInputEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class CrosswalkNavigatorContentProvider implements ICommonContentProvider {

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
    @SuppressWarnings({ "unchecked", "serial", "rawtypes" })
    public CrosswalkNavigatorContentProvider() {
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
	    ArrayList<CrosswalkNavigatorItem> result = new ArrayList<CrosswalkNavigatorItem>();
	    ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
	    for (EObject o : resource.getContents()) {
		if (o instanceof View) {
		    topViews.add((View) o);
		}
	    }
	    result.addAll(createNavigatorItems(selectViewsByType(topViews, CrossWalkEditPart.MODEL_ID), file, false));
	    return result.toArray();
	}

	if (parentElement instanceof CrosswalkNavigatorGroup) {
	    CrosswalkNavigatorGroup group = (CrosswalkNavigatorGroup) parentElement;
	    return group.getChildren();
	}

	if (parentElement instanceof CrosswalkNavigatorItem) {
	    CrosswalkNavigatorItem navigatorItem = (CrosswalkNavigatorItem) parentElement;
	    if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
		return EMPTY_ARRAY;
	    }
	    return getViewChildren(navigatorItem.getView(), parentElement);
	}

	return EMPTY_ARRAY;
    }

    /**
     * @generated
     */
    private Object[] getViewChildren(View view, Object parentElement) {
	switch (CrosswalkVisualIDRegistry.getVisualID(view)) {

	case MappedAttributeEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup outgoinglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_MappedAttribute_3016_outgoinglinks,
			    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
	    if (!outgoinglinks.isEmpty()) {
		result.add(outgoinglinks);
	    }
	    return result.toArray();
	}

	case TrimWhitespaceEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup incominglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_TrimWhitespace_2015_incominglinks,
			    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry
					    .getType(TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(StringInput2EditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getIncomingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
	    if (!incominglinks.isEmpty()) {
		result.add(incominglinks);
	    }
	    return result.toArray();
	}

	case TabbedDataFieldEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup incominglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_TabbedDataField_3001_incominglinks,
			    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getIncomingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
	    if (!incominglinks.isEmpty()) {
		result.add(incominglinks);
	    }
	    return result.toArray();
	}

	case StringInputEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup outgoinglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_StringInput_3002_outgoinglinks,
			    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
	    if (!outgoinglinks.isEmpty()) {
		result.add(outgoinglinks);
	    }
	    return result.toArray();
	}

	case DelimitedFileEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    Collection<View> connectedViews;
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(TabbedDataFieldEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    return result.toArray();
	}

	case StringInputInputEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Edge sv = (Edge) view;
	    CrosswalkNavigatorGroup target = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_StringInputInput_4001_target,
			    "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    CrosswalkNavigatorGroup source = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_StringInputInput_4001_source,
			    "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getLinksTargetByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(TextEditPart.VISUAL_ID));
	    target.addChildren(createNavigatorItems(connectedViews, target, true));
	    connectedViews = getLinksTargetByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(TrimWhitespaceEditPart.VISUAL_ID));
	    target.addChildren(createNavigatorItems(connectedViews, target, true));
	    connectedViews = getLinksTargetByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(TabbedDataFieldEditPart.VISUAL_ID));
	    target.addChildren(createNavigatorItems(connectedViews, target, true));
	    connectedViews = getLinksSourceByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInput9EditPart.VISUAL_ID));
	    source.addChildren(createNavigatorItems(connectedViews, source, true));
	    connectedViews = getLinksSourceByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputEditPart.VISUAL_ID));
	    source.addChildren(createNavigatorItems(connectedViews, source, true));
	    connectedViews = getLinksSourceByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInput2EditPart.VISUAL_ID));
	    source.addChildren(createNavigatorItems(connectedViews, source, true));
	    connectedViews = getLinksSourceByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(MappedAttributeEditPart.VISUAL_ID));
	    source.addChildren(createNavigatorItems(connectedViews, source, true));
	    connectedViews = getLinksSourceByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInput13EditPart.VISUAL_ID));
	    source.addChildren(createNavigatorItems(connectedViews, source, true));
	    if (!target.isEmpty()) {
		result.add(target);
	    }
	    if (!source.isEmpty()) {
		result.add(source);
	    }
	    return result.toArray();
	}

	case OriginalNameRecordMatcherEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    Collection<View> connectedViews;
	    connectedViews = getChildrenByType(
			    Collections.singleton(sv),
			    CrosswalkVisualIDRegistry
					    .getType(OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(StringInput9EditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    return result.toArray();
	}

	case StringInput2EditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup outgoinglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_StringInput_3003_outgoinglinks,
			    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
	    if (!outgoinglinks.isEmpty()) {
		result.add(outgoinglinks);
	    }
	    return result.toArray();
	}

	case MappedElementEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    Collection<View> connectedViews;
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(MappedElementChildElementsCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(MappedElement2EditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(MappedElementChildElementsCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(MappedAttributeEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(MappedElementChildElementsCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(StringInput13EditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    return result.toArray();
	}

	case DateInputInputEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Edge sv = (Edge) view;
	    CrosswalkNavigatorGroup target = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_DateInputInput_4002_target,
			    "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getLinksTargetByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(DateRecognizerEditPart.VISUAL_ID));
	    target.addChildren(createNavigatorItems(connectedViews, target, true));
	    if (!target.isEmpty()) {
		result.add(target);
	    }
	    return result.toArray();
	}

	case TextEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup incominglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_Text_2014_incominglinks,
			    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getIncomingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
	    if (!incominglinks.isEmpty()) {
		result.add(incominglinks);
	    }
	    return result.toArray();
	}

	case CrossWalkEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Diagram sv = (Diagram) view;
	    CrosswalkNavigatorGroup links = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_CrossWalk_1000_links,
			    "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(DelimitedFileEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(OriginalNameRecordMatcherEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(DateRecognizerEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(TextEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(TrimWhitespaceEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(MappedElementEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getDiagramLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    links.addChildren(createNavigatorItems(connectedViews, links, false));
	    connectedViews = getDiagramLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(DateInputInputEditPart.VISUAL_ID));
	    links.addChildren(createNavigatorItems(connectedViews, links, false));
	    if (!links.isEmpty()) {
		result.add(links);
	    }
	    return result.toArray();
	}

	case StringInput13EditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup outgoinglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_StringInput_3017_outgoinglinks,
			    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
	    if (!outgoinglinks.isEmpty()) {
		result.add(outgoinglinks);
	    }
	    return result.toArray();
	}

	case StringInput9EditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup outgoinglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_StringInput_3010_outgoinglinks,
			    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	    outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
	    if (!outgoinglinks.isEmpty()) {
		result.add(outgoinglinks);
	    }
	    return result.toArray();
	}

	case DateRecognizerEditPart.VISUAL_ID: {
	    LinkedList<CrosswalkAbstractNavigatorItem> result = new LinkedList<CrosswalkAbstractNavigatorItem>();
	    Node sv = (Node) view;
	    CrosswalkNavigatorGroup incominglinks = new CrosswalkNavigatorGroup(
			    Messages.NavigatorGroupName_DateRecognizer_2013_incominglinks,
			    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
	    Collection<View> connectedViews;
	    connectedViews = getChildrenByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry
					    .getType(DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID));
	    connectedViews = getChildrenByType(connectedViews,
			    CrosswalkVisualIDRegistry.getType(StringInputEditPart.VISUAL_ID));
	    result.addAll(createNavigatorItems(connectedViews, parentElement, false));
	    connectedViews = getIncomingLinksByType(Collections.singleton(sv),
			    CrosswalkVisualIDRegistry.getType(DateInputInputEditPart.VISUAL_ID));
	    incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
	    if (!incominglinks.isEmpty()) {
		result.add(incominglinks);
	    }
	    return result.toArray();
	}
	}
	return EMPTY_ARRAY;
    }

    /**
     * @generated
     */
    private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
	LinkedList<View> result = new LinkedList<View>();
	for (Edge nextEdge : edges) {
	    View nextEdgeSource = nextEdge.getSource();
	    if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
		result.add(nextEdgeSource);
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
	LinkedList<View> result = new LinkedList<View>();
	for (Edge nextEdge : edges) {
	    View nextEdgeTarget = nextEdge.getTarget();
	    if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
		result.add(nextEdgeTarget);
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
	LinkedList<View> result = new LinkedList<View>();
	for (View nextNode : nodes) {
	    result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
	}
	return result;
    }

    /**
     * @generated
     */
    private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
	LinkedList<View> result = new LinkedList<View>();
	for (View nextNode : nodes) {
	    result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
	}
	return result;
    }

    /**
     * @generated
     */
    private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
	LinkedList<View> result = new LinkedList<View>();
	for (View nextNode : nodes) {
	    result.addAll(selectViewsByType(nextNode.getChildren(), type));
	}
	return result;
    }

    /**
     * @generated
     */
    private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
	ArrayList<View> result = new ArrayList<View>();
	for (Diagram nextDiagram : diagrams) {
	    result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
	}
	return result;
    }

    // TODO refactor as static method
    /**
     * @generated
     */
    private Collection<View> selectViewsByType(Collection<View> views, String type) {
	ArrayList<View> result = new ArrayList<View>();
	for (View nextView : views) {
	    if (type.equals(nextView.getType()) && isOwnView(nextView)) {
		result.add(nextView);
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    private boolean isOwnView(View view) {
	return CrossWalkEditPart.MODEL_ID.equals(CrosswalkVisualIDRegistry.getModelID(view));
    }

    /**
     * @generated
     */
    private Collection<CrosswalkNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
		    boolean isLeafs) {
	ArrayList<CrosswalkNavigatorItem> result = new ArrayList<CrosswalkNavigatorItem>(views.size());
	for (View nextView : views) {
	    result.add(new CrosswalkNavigatorItem(nextView, parent, isLeafs));
	}
	return result;
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
