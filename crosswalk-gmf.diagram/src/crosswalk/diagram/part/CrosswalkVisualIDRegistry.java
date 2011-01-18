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
import crosswalk.diagram.edit.parts.AbstractEditPart;
import crosswalk.diagram.edit.parts.AbstractOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.AccessConditionEditPart;
import crosswalk.diagram.edit.parts.AccessConditionOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateCreatedEditPart;
import crosswalk.diagram.edit.parts.DateCreatedOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.DateInputEditPart;
import crosswalk.diagram.edit.parts.DateInputNameEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.GenreEditPart;
import crosswalk.diagram.edit.parts.GenreOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.IdentifierEditPart;
import crosswalk.diagram.edit.parts.IdentifierOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.LanguageEditPart;
import crosswalk.diagram.edit.parts.LanguageOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.NameEditPart;
import crosswalk.diagram.edit.parts.NameOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart;
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
import crosswalk.diagram.edit.parts.StringInputName10EditPart;
import crosswalk.diagram.edit.parts.StringInputName11EditPart;
import crosswalk.diagram.edit.parts.StringInputName2EditPart;
import crosswalk.diagram.edit.parts.StringInputName3EditPart;
import crosswalk.diagram.edit.parts.StringInputName4EditPart;
import crosswalk.diagram.edit.parts.StringInputName5EditPart;
import crosswalk.diagram.edit.parts.StringInputName6EditPart;
import crosswalk.diagram.edit.parts.StringInputName7EditPart;
import crosswalk.diagram.edit.parts.StringInputName8EditPart;
import crosswalk.diagram.edit.parts.StringInputName9EditPart;
import crosswalk.diagram.edit.parts.StringInputNameEditPart;
import crosswalk.diagram.edit.parts.SubjectEditPart;
import crosswalk.diagram.edit.parts.SubjectOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TitleInfoEditPart;
import crosswalk.diagram.edit.parts.TitleInfoTitleInfoInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel10EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel11EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel2EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel3EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel4EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel5EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel6EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel7EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel8EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
import crosswalk.diagram.edit.parts.WrappingLabelEditPart;

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
	    if (CrosswalkPackage.eINSTANCE.getTabSeparatedFile().isSuperTypeOf(domainElement.eClass())) {
		return TabSeparatedFileEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getTitleInfo().isSuperTypeOf(domainElement.eClass())) {
		return TitleInfoEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getAbstract().isSuperTypeOf(domainElement.eClass())) {
		return AbstractEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getGenre().isSuperTypeOf(domainElement.eClass())) {
		return GenreEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getIdentifier().isSuperTypeOf(domainElement.eClass())) {
		return IdentifierEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getLanguage().isSuperTypeOf(domainElement.eClass())) {
		return LanguageEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getName_().isSuperTypeOf(domainElement.eClass())) {
		return NameEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getSubject().isSuperTypeOf(domainElement.eClass())) {
		return SubjectEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getTypeOfResource().isSuperTypeOf(domainElement.eClass())) {
		return TypeOfResourceEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher().isSuperTypeOf(domainElement.eClass())) {
		return OriginalNameRecordMatcherEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getDateCreated().isSuperTypeOf(domainElement.eClass())) {
		return DateCreatedEditPart.VISUAL_ID;
	    }
	    if (CrosswalkPackage.eINSTANCE.getAccessCondition().isSuperTypeOf(domainElement.eClass())) {
		return AccessConditionEditPart.VISUAL_ID;
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
	    break;
	case TabSeparatedFileDataFieldCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getTabbedDataField().isSuperTypeOf(domainElement.eClass())) {
		return TabbedDataFieldEditPart.VISUAL_ID;
	    }
	    break;
	case TitleInfoTitleInfoInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInputEditPart.VISUAL_ID;
	    }
	    break;
	case AbstractOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput2EditPart.VISUAL_ID;
	    }
	    break;
	case GenreOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput3EditPart.VISUAL_ID;
	    }
	    break;
	case IdentifierOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput4EditPart.VISUAL_ID;
	    }
	    break;
	case LanguageOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput5EditPart.VISUAL_ID;
	    }
	    break;
	case NameOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput6EditPart.VISUAL_ID;
	    }
	    break;
	case SubjectOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput7EditPart.VISUAL_ID;
	    }
	    break;
	case TypeOfResourceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput8EditPart.VISUAL_ID;
	    }
	    break;
	case OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput9EditPart.VISUAL_ID;
	    }
	    break;
	case DateCreatedOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getDateInput().isSuperTypeOf(domainElement.eClass())) {
		return DateInputEditPart.VISUAL_ID;
	    }
	    break;
	case AccessConditionOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput10EditPart.VISUAL_ID;
	    }
	    break;
	case DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput11EditPart.VISUAL_ID;
	    }
	    break;
	case TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (CrosswalkPackage.eINSTANCE.getStringInput().isSuperTypeOf(domainElement.eClass())) {
		return StringInput12EditPart.VISUAL_ID;
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
	    if (TabSeparatedFileEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TitleInfoEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (AbstractEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (GenreEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (IdentifierEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (LanguageEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (NameEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (SubjectEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TypeOfResourceEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (OriginalNameRecordMatcherEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (DateCreatedEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (AccessConditionEditPart.VISUAL_ID == nodeVisualID) {
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
	    break;
	case TabSeparatedFileEditPart.VISUAL_ID:
	    if (TabSeparatedFileSourceFileEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TabSeparatedFileDataFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TitleInfoEditPart.VISUAL_ID:
	    if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TitleInfoTitleInfoInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case AbstractEditPart.VISUAL_ID:
	    if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (AbstractOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case GenreEditPart.VISUAL_ID:
	    if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (GenreOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case IdentifierEditPart.VISUAL_ID:
	    if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (IdentifierOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case LanguageEditPart.VISUAL_ID:
	    if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (LanguageOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case NameEditPart.VISUAL_ID:
	    if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (NameOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case SubjectEditPart.VISUAL_ID:
	    if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (SubjectOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TypeOfResourceEditPart.VISUAL_ID:
	    if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TypeOfResourceOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateCreatedEditPart.VISUAL_ID:
	    if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (DateCreatedOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case AccessConditionEditPart.VISUAL_ID:
	    if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (AccessConditionOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateRecognizerEditPart.VISUAL_ID:
	    if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
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
	    if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TabbedDataFieldEditPart.VISUAL_ID:
	    if (TabbedDataFieldColumnNumberEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    if (TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInputEditPart.VISUAL_ID:
	    if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput2EditPart.VISUAL_ID:
	    if (StringInputNameEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput3EditPart.VISUAL_ID:
	    if (StringInputName2EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput4EditPart.VISUAL_ID:
	    if (StringInputName3EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput5EditPart.VISUAL_ID:
	    if (StringInputName4EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput6EditPart.VISUAL_ID:
	    if (StringInputName5EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput7EditPart.VISUAL_ID:
	    if (StringInputName6EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput8EditPart.VISUAL_ID:
	    if (StringInputName7EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput9EditPart.VISUAL_ID:
	    if (StringInputName8EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateInputEditPart.VISUAL_ID:
	    if (DateInputNameEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput10EditPart.VISUAL_ID:
	    if (StringInputName9EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput11EditPart.VISUAL_ID:
	    if (StringInputName10EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case StringInput12EditPart.VISUAL_ID:
	    if (StringInputName11EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TabSeparatedFileDataFieldCompartmentEditPart.VISUAL_ID:
	    if (TabbedDataFieldEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TitleInfoTitleInfoInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInputEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case AbstractOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput2EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case GenreOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput3EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case IdentifierOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput4EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case LanguageOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput5EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case NameOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput6EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case SubjectOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput7EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TypeOfResourceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput8EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput9EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateCreatedOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (DateInputEditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case AccessConditionOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput10EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput11EditPart.VISUAL_ID == nodeVisualID) {
		return true;
	    }
	    break;
	case TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    if (StringInput12EditPart.VISUAL_ID == nodeVisualID) {
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
