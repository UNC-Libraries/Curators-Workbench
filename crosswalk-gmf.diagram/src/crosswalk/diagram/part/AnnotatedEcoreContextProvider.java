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
package crosswalk.diagram.part;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.Dictionary;
import crosswalk.Editable;
import crosswalk.EditingContainer;
import crosswalk.Form;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;

public class AnnotatedEcoreContextProvider implements IContextProvider {
	CrosswalkDiagramEditor editor = null;

	public AnnotatedEcoreContextProvider(
			CrosswalkDiagramEditor crosswalkDiagramEditor) {
		editor = crosswalkDiagramEditor;
	}

	@Override
	public int getContextChangeMask() {
		return SELECTION;
	}

	private String getDiagramContextId() {
		Editable ed = getDiagramEditableObject();
		EAnnotation ann = ed.eClass().getEAnnotation(
				CrosswalkPackage.HELP_CONTEXT_ANNOTATION_SOURCE);
		String helpId = null;
		if (ann != null
				&& ann.getDetails() != null
				&& ann.getDetails().get(
						CrosswalkPackage.HELP_CONTEXT_ANNOTATION_DETAILS_KEY) != null) {
			helpId = ann.getDetails().get(
					CrosswalkPackage.HELP_CONTEXT_ANNOTATION_DETAILS_KEY);
		} else {
			helpId = CrosswalkPackage.HELP_CONTEXT_ID_GENERIC;
		}
		return helpId;
	}

	private String getDiagramType() {
		Editable ed = getDiagramEditableObject();
		if (ed instanceof Form) {
			return "Form";
		} else if (ed instanceof CrossWalk) {
			return "Crosswalk";
		} else if (ed instanceof Dictionary) {
			return "Dictionary";
		} else {
			return "Metadata Mapping";
		}
	}

	private Editable getDiagramEditableObject() {
		EObject diagramElement = this.editor.getDiagram().getElement();
		if (diagramElement instanceof EditingContainer) {
			EditingContainer cont = (EditingContainer) diagramElement;
			Editable ed = cont.getModel();
			return ed;
		} else {
			return null;
		}
	}

	@Override
	public IContext getContext(Object target) {
		// get help context from annotation on model
		IContext result = null;
		for (Object opart : editor.getDiagramEditPart().getViewer()
				.getSelectedEditParts()) {
			EditPart part = (EditPart) opart;
			if (part.getModel() != null || part.getModel() instanceof View) {
				View v = (View) part.getModel();
				EObject eobject = v.getElement();
				String helpId = doGetContextId(eobject);
				if (helpId != null)
					result = HelpSystem.getContext(helpId);
				if (result != null)
					break;
			}
		}
		if (result == null) {
			// get some general metadata mapping help context
			result = HelpSystem.getContext("general diagram help context ID");
		}
		return result;
	}

	@Override
	public String getSearchExpression(Object target) {
		StringBuilder result = new StringBuilder();
		for (Object opart : editor.getDiagramEditPart().getViewer()
				.getSelectedEditParts()) {
			EditPart part = (EditPart) opart;
			if (part.getModel() != null || part.getModel() instanceof View) {
				View v = (View) part.getModel();
				EObject eobject = v.getElement();
				for (String keyword : doGetKeywords(eobject)) {
					if (result.length() > 0)
						result.append(" OR ");
					result.append(keyword);
				}
			}
		}
		return (result.length() > 0) ? result.toString() : null;
	}

	private Set<String> doGetKeywords(EObject obj) {
		Set<String> result = new HashSet<String>();
		if (CrosswalkPackage.eINSTANCE.getMappedElement().isInstance(obj)) {
			EReference feature = ((MappedElement) obj).getMappedFeature();
			result.add("MappedElement");
			if (feature != null) {
				result.add(feature.getName());
			}
		} else if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isInstance(
				obj)) {
			EAttribute attr = ((MappedAttribute) obj).getMappedFeature();
			result.add("MappedAttribute");
			if (attr != null) {
				result.add(attr.getName());
			}
		} else {
			result.add(obj.eClass().getName());
		}
		return result;
	}

	private String doGetContextId(EObject obj) {
		String result = null;
		EAnnotation ann = null;
		if (CrosswalkPackage.eINSTANCE.getMappedElement().isInstance(obj)) {
			EReference feature = ((MappedElement) obj).getMappedFeature();
			if (feature != null) {
				ann = feature
						.getEAnnotation(CrosswalkPackage.HELP_CONTEXT_ANNOTATION_SOURCE);
			}
		} else if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isInstance(
				obj)) {
			EAttribute attr = ((MappedAttribute) obj).getMappedFeature();
			if (attr != null) {
				ann = attr
						.getEAnnotation(CrosswalkPackage.HELP_CONTEXT_ANNOTATION_SOURCE);
			}
		} else {
			ann = obj.eClass().getEAnnotation(
					CrosswalkPackage.HELP_CONTEXT_ANNOTATION_SOURCE);
		}
		if (ann != null) {
			result = ann.getDetails().get(
					CrosswalkPackage.HELP_CONTEXT_ANNOTATION_DETAILS_KEY);
		}
		return result;
	}

}
