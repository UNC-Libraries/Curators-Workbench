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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.StringInputName13EditPart;
import crosswalk.diagram.edit.parts.StringInputName2EditPart;
import crosswalk.diagram.edit.parts.StringInputName9EditPart;
import crosswalk.diagram.edit.parts.StringInputNameEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel15EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel16EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 *
 * @generated
 */
public class CrosswalkVisualIDRegistry {

    /**
     * @generated
     */
    private static final String DEBUG_KEY = "crosswalk-gmf.diagram/debug/visualID"; //$NON-NLS-1$

    /**
     * @generated
     */
    public static int getVisualID(View view) {
	if (view instanceof Diagram) {
	    if (CrossWalkEditPart.MODEL_ID.equals(view.getType())) {
		return CrossWalkEditPart.VISUAL_ID;
	    } else {
		return -1;
	    }
	}
	return crosswalk.diagram.part.CrosswalkVisualIDRegistry.getVisualID(view.getType());
    }

    /**
     * @generated
     */
    public static String getModelID(View view) {
	View diagram = view.getDiagram();
	while (view != diagram) {
	    EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	    if (annotation != null) {
		return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
	    }
	    view = (View) view.eContainer();
	}
	return diagram != null ? diagram.getType() : null;
    }

    /**
     * @generated
     */
    public static int getVisualID(String type) {
	try {
	    return Integer.parseInt(type);
	} catch (NumberFormatException e) {
	    if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
		CrosswalkDiagramEditorPlugin.getInstance().logError(
				"Unable to parse view type as a visualID number: " + type);
	    }
	}
	return -1;
    }

    /**
     * @generated
     */
    public static String getType(int visualID) {
	return Integer.toString(visualID);
    }

    /**
     * @generated
     */
    public static int getDiagramVisualID(EObject domainElement) {
	if (domainElement == null) {
	    return -1;
	}
	if (CrosswalkPackage.eINSTANCE.getCrossWalk().isSuperTypeOf(domainElement.eClass())
			&& isDiagram((CrossWalk) domainElement)) {
	    return CrossWalkEditPart.VISUAL_ID;
	}
	return -1;
    }

    /**
     * @generated
     */
    public static int getNodeVisualID(View containerView, EObject domainElement) {
	if (domainElement == null) {
	    return -1;
	}
	String containerModelID = crosswalk.diagram.part.CrosswalkVisualIDRegistry.getModelID(containerView);
	if (!CrossWalkEditPart.MODEL_ID.equals(containerModelID)) {
	    return -1;
	}
	int containerVisualID;
	if (CrossWalkEditPart.MODEL_ID.equals(containerModelID)) {
	    containerVisualID = crosswalk.diagram.part.CrosswalkVisualIDRegistry.getVisualID(containerView);
	} else {
	    if (containerView instanceof Diagram) {
		containerVisualID = CrossWalkEditPart.VISUAL_ID;
	    } else {
		return -1;
	    }
	}
	switch (containerVisualID) {
	case CrossWalkEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getDelimitedFile().isSuperTypeOf(domainElement.eClass())) {
		return DelimitedFileEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher().isSuperTypeOf(domainElement.eClass())) {
		return OriginalNameRecordMatcherEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(domainElement.eClass())) {
		return DateRecognizerEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
		return TextEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(domainElement.eClass())) {
		return TrimWhitespaceEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
		return MappedElementEditPart.VISUAL_ID;
	    }
	    break;
	case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getTabbedDataField().isSuperTypeOf(domainElement.eClass())) {
		return TabbedDataFieldEditPart.VISUAL_ID;
	    }
	    break;
	case OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput9EditPart.VISUAL_ID;
	    }
	    break;
	case DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInputEditPart.VISUAL_ID;
	    }
	    break;
	case TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput2EditPart.VISUAL_ID;
	    }
	    break;
	case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
		return MappedElement2EditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isSuperTypeOf(domainElement.eClass())) {
		return MappedAttributeEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput13EditPart.VISUAL_ID;
	    }
	    break;
	}
	return -1;
    }

    /**
     * @generated
     */
    public static boolean canCreateNode(View containerView, int nodeVisualID) {
	String containerModelID = crosswalk.diagram.part.CrosswalkVisualIDRegistry.getModelID(containerView);
	if (!CrossWalkEditPart.MODEL_ID.equals(containerModelID)) {
	    return false;
	}
	int containerVisualID;
	if (CrossWalkEditPart.MODEL_ID.equals(containerModelID)) {
	    containerVisualID = crosswalk.diagram.part.CrosswalkVisualIDRegistry.getVisualID(containerView);
	} else {
	    if (containerView instanceof Diagram) {
		containerVisualID = CrossWalkEditPart.VISUAL_ID;
	    } else {
		return false;
	    }
	}
	switch (containerVisualID) {
	case CrossWalkEditPart.VISUAL_ID:
	    if (DelimitedFileEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (OriginalNameRecordMatcherEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (DateRecognizerEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TextEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TrimWhitespaceEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (MappedElementEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DelimitedFileEditPart.VISUAL_ID:
	    if (DelimitedFileSourceFileEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateRecognizerEditPart.VISUAL_ID:
	    if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TextEditPart.VISUAL_ID:
	    if (TextValueEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TrimWhitespaceEditPart.VISUAL_ID:
	    if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case MappedElementEditPart.VISUAL_ID:
	    if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (MappedElementChildElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TabbedDataFieldEditPart.VISUAL_ID:
	    if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput9EditPart.VISUAL_ID:
	    if (StringInputName9EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInputEditPart.VISUAL_ID:
	    if (StringInputNameEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput2EditPart.VISUAL_ID:
	    if (StringInputName2EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case MappedElement2EditPart.VISUAL_ID:
	    if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case MappedAttributeEditPart.VISUAL_ID:
	    if (MappedAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput13EditPart.VISUAL_ID:
	    if (StringInputName13EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
	    if (TabbedDataFieldEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput9EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInputEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput2EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
	    if (MappedElement2EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (MappedAttributeEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (StringInput13EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	}
	return false;
    }

    /**
     * @generated
     */
    public static int getLinkWithClassVisualID(EObject domainElement) {
	if (domainElement == null) {
	    return -1;
	}
	return -1;
    }

    /**
     * User can change implementation of this method to handle some specific
     * situations not covered by default logic.
     *
     * @generated
     */
    private static boolean isDiagram(CrossWalk element) {
	return true;
    }

}
