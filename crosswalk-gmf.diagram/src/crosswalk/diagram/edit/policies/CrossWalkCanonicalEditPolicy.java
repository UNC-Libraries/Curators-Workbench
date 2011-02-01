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
package crosswalk.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrosswalkPackage;
import crosswalk.diagram.edit.parts.AbstractEditPart;
import crosswalk.diagram.edit.parts.AccessConditionEditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateCreatedEditPart;
import crosswalk.diagram.edit.parts.DateInputEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.GenreEditPart;
import crosswalk.diagram.edit.parts.IdentifierEditPart;
import crosswalk.diagram.edit.parts.LanguageEditPart;
import crosswalk.diagram.edit.parts.NameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.StringInput10EditPart;
import crosswalk.diagram.edit.parts.StringInput11EditPart;
import crosswalk.diagram.edit.parts.StringInput12EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput3EditPart;
import crosswalk.diagram.edit.parts.StringInput4EditPart;
import crosswalk.diagram.edit.parts.StringInput5EditPart;
import crosswalk.diagram.edit.parts.StringInput6EditPart;
import crosswalk.diagram.edit.parts.StringInput7EditPart;
import crosswalk.diagram.edit.parts.StringInput8EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.SubjectEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TitleInfoEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceEditPart;
import crosswalk.diagram.part.CrosswalkDiagramUpdater;
import crosswalk.diagram.part.CrosswalkLinkDescriptor;
import crosswalk.diagram.part.CrosswalkNodeDescriptor;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrossWalkCanonicalEditPolicy extends CanonicalEditPolicy {

    /**
     * @generated
     */
    private Set<EStructuralFeature> myFeaturesToSynchronize;

    /**
     * @generated
     */
    @Override
    protected Set getFeaturesToSynchronize() {
	if (myFeaturesToSynchronize == null) {
	    myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
	    myFeaturesToSynchronize.add(CrosswalkPackage.eINSTANCE.getCrossWalk_DataSource());
	    myFeaturesToSynchronize.add(CrosswalkPackage.eINSTANCE.getCrossWalk_Elements());
	    myFeaturesToSynchronize.add(CrosswalkPackage.eINSTANCE.getCrossWalk_Widgets());
	}
	return myFeaturesToSynchronize;
    }

    /**
     * @generated
     */
    @Override
    @SuppressWarnings("rawtypes")
    protected List getSemanticChildrenList() {
	View viewObject = (View) getHost().getModel();
	LinkedList<EObject> result = new LinkedList<EObject>();
	List<CrosswalkNodeDescriptor> childDescriptors = CrosswalkDiagramUpdater
			.getCrossWalk_1000SemanticChildren(viewObject);
	for (CrosswalkNodeDescriptor d : childDescriptors) {
	    result.add(d.getModelElement());
	}
	return result;
    }

    /**
     * @generated
     */
    @Override
    protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
	return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
    }

    /**
     * @generated
     */
    private boolean isMyDiagramElement(View view) {
	int visualID = CrosswalkVisualIDRegistry.getVisualID(view);
	switch (visualID) {
	case DelimitedFileEditPart.VISUAL_ID:
	case TitleInfoEditPart.VISUAL_ID:
	case AbstractEditPart.VISUAL_ID:
	case GenreEditPart.VISUAL_ID:
	case IdentifierEditPart.VISUAL_ID:
	case LanguageEditPart.VISUAL_ID:
	case NameEditPart.VISUAL_ID:
	case SubjectEditPart.VISUAL_ID:
	case TypeOfResourceEditPart.VISUAL_ID:
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	case DateCreatedEditPart.VISUAL_ID:
	case AccessConditionEditPart.VISUAL_ID:
	case DateRecognizerEditPart.VISUAL_ID:
	case TextEditPart.VISUAL_ID:
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return true;
	}
	return false;
    }

    /**
     * @generated
     */
    @Override
    protected void refreshSemantic() {
	if (resolveSemanticElement() == null) {
	    return;
	}
	LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
	List<CrosswalkNodeDescriptor> childDescriptors = CrosswalkDiagramUpdater
			.getCrossWalk_1000SemanticChildren((View) getHost().getModel());
	LinkedList<View> orphaned = new LinkedList<View>();
	// we care to check only views we recognize as ours
	LinkedList<View> knownViewChildren = new LinkedList<View>();
	for (View v : getViewChildren()) {
	    if (isMyDiagramElement(v)) {
		knownViewChildren.add(v);
	    }
	}
	// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
	//
	// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
	// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one
	// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
	for (Iterator<CrosswalkNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator
			.hasNext();) {
	    CrosswalkNodeDescriptor next = descriptorsIterator.next();
	    String hint = CrosswalkVisualIDRegistry.getType(next.getVisualID());
	    LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
	    for (View childView : getViewChildren()) {
		EObject semanticElement = childView.getElement();
		if (next.getModelElement().equals(semanticElement)) {
		    if (hint.equals(childView.getType())) {
			perfectMatch.add(childView);
			// actually, can stop iteration over view children here, but
			// may want to use not the first view but last one as a 'real' match (the way original CEP does
			// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
		    }
		}
	    }
	    if (perfectMatch.size() > 0) {
		descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
		// use only one view (first or last?), keep rest as orphaned for further consideration
		knownViewChildren.remove(perfectMatch.getFirst());
	    }
	}
	// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
	// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
	orphaned.addAll(knownViewChildren);
	//
	ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
			childDescriptors.size());
	for (CrosswalkNodeDescriptor next : childDescriptors) {
	    String hint = CrosswalkVisualIDRegistry.getType(next.getVisualID());
	    IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
	    CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
			    Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
	    viewDescriptors.add(descriptor);
	}

	boolean changed = deleteViews(orphaned.iterator());
	//
	CreateViewRequest request = getCreateViewRequest(viewDescriptors);
	Command cmd = getCreateViewCommand(request);
	if (cmd != null && cmd.canExecute()) {
	    SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
	    executeCommand(cmd);
	    @SuppressWarnings("unchecked")
	    List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
	    createdViews.addAll(nl);
	}
	if (changed || createdViews.size() > 0) {
	    postProcessRefreshSemantic(createdViews);
	}

	Collection<IAdaptable> createdConnectionViews = refreshConnections();

	if (createdViews.size() > 1) {
	    // perform a layout of the container
	    DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
	    executeCommand(new ICommandProxy(layoutCmd));
	}

	createdViews.addAll(createdConnectionViews);

	makeViewsImmutable(createdViews);
    }

    /**
     * @generated
     */
    private Collection<IAdaptable> refreshConnections() {
	Map<EObject, View> domain2NotationMap = new HashMap<EObject, View>();
	Collection<CrosswalkLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
	Collection existingLinks = new LinkedList(getDiagram().getEdges());
	for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
	    Edge nextDiagramLink = (Edge) linksIterator.next();
	    int diagramLinkVisualID = CrosswalkVisualIDRegistry.getVisualID(nextDiagramLink);
	    if (diagramLinkVisualID == -1) {
		if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
		    linksIterator.remove();
		}
		continue;
	    }
	    EObject diagramLinkObject = nextDiagramLink.getElement();
	    EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
	    EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
	    for (Iterator<CrosswalkLinkDescriptor> linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
			    .hasNext();) {
		CrosswalkLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
		if (diagramLinkObject == nextLinkDescriptor.getModelElement()
				&& diagramLinkSrc == nextLinkDescriptor.getSource()
				&& diagramLinkDst == nextLinkDescriptor.getDestination()
				&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
		    linksIterator.remove();
		    linkDescriptorsIterator.remove();
		    break;
		}
	    }
	}
	deleteViews(existingLinks.iterator());
	return createConnections(linkDescriptors, domain2NotationMap);
    }

    /**
     * @generated
     */
    private Collection<CrosswalkLinkDescriptor> collectAllLinks(View view, Map<EObject, View> domain2NotationMap) {
	if (!CrossWalkEditPart.MODEL_ID.equals(CrosswalkVisualIDRegistry.getModelID(view))) {
	    return Collections.emptyList();
	}
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
	case CrossWalkEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getCrossWalk_1000ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case DelimitedFileEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getDelimitedFile_2020ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case TitleInfoEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getTitleInfo_2005ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case AbstractEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getAbstract_2007ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case GenreEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getGenre_2008ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case IdentifierEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getIdentifier_2009ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case LanguageEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getLanguage_2010ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case NameEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getName_2011ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case SubjectEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getSubject_2012ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case TypeOfResourceEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getTypeOfResource_2013ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case OriginalNameRecordMatcherEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getOriginalNameRecordMatcher_2014ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case DateCreatedEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getDateCreated_2015ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case AccessConditionEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getAccessCondition_2016ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case DateRecognizerEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getDateRecognizer_2017ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case TextEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getText_2018ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case TrimWhitespaceEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getTrimWhitespace_2019ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case TabbedDataFieldEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getTabbedDataField_3017ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInputEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3008ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput2EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3010ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput3EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3011ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput4EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3012ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput5EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3013ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput6EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3014ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput7EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3015ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput8EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3016ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput9EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3018ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case DateInputEditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getDateInput_3019ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput10EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3020ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput11EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3021ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	case StringInput12EditPart.VISUAL_ID: {
	    if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(CrosswalkDiagramUpdater.getStringInput_3022ContainedLinks(view));
	    }
	    if (!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
		domain2NotationMap.put(view.getElement(), view);
	    }
	    break;
	}
	}
	for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
	    result.addAll(collectAllLinks((View) children.next(), domain2NotationMap));
	}
	for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
	    result.addAll(collectAllLinks((View) edges.next(), domain2NotationMap));
	}
	return result;
    }

    /**
     * @generated
     */
    private Collection<IAdaptable> createConnections(Collection<CrosswalkLinkDescriptor> linkDescriptors,
		    Map<EObject, View> domain2NotationMap) {
	LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
	for (CrosswalkLinkDescriptor nextLinkDescriptor : linkDescriptors) {
	    EditPart sourceEditPart = getEditPart(nextLinkDescriptor.getSource(), domain2NotationMap);
	    EditPart targetEditPart = getEditPart(nextLinkDescriptor.getDestination(), domain2NotationMap);
	    if (sourceEditPart == null || targetEditPart == null) {
		continue;
	    }
	    CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
			    nextLinkDescriptor.getSemanticAdapter(),
			    CrosswalkVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND,
			    false, ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
	    CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
	    ccr.setType(RequestConstants.REQ_CONNECTION_START);
	    ccr.setSourceEditPart(sourceEditPart);
	    sourceEditPart.getCommand(ccr);
	    ccr.setTargetEditPart(targetEditPart);
	    ccr.setType(RequestConstants.REQ_CONNECTION_END);
	    Command cmd = targetEditPart.getCommand(ccr);
	    if (cmd != null && cmd.canExecute()) {
		executeCommand(cmd);
		IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
		if (viewAdapter != null) {
		    adapters.add(viewAdapter);
		}
	    }
	}
	return adapters;
    }

    /**
     * @generated
     */
    private EditPart getEditPart(EObject domainModelElement, Map<EObject, View> domain2NotationMap) {
	View view = domain2NotationMap.get(domainModelElement);
	if (view != null) {
	    return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
	}
	return null;
    }

    /**
     * @generated
     */
    private Diagram getDiagram() {
	return ((View) getHost().getModel()).getDiagram();
    }
}
