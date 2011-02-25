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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.Abstract;
import crosswalk.AccessCondition;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataField;
import crosswalk.DataSource;
import crosswalk.DateCreated;
import crosswalk.DateGenerator;
import crosswalk.DateInput;
import crosswalk.DateRecognizer;
import crosswalk.DelimitedFile;
import crosswalk.Genre;
import crosswalk.Identifier;
import crosswalk.Input;
import crosswalk.Language;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.Name;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.OutputElement;
import crosswalk.StringGenerator;
import crosswalk.StringInput;
import crosswalk.Subject;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TitleInfo;
import crosswalk.TrimWhitespace;
import crosswalk.TypeOfResource;
import crosswalk.WalkWidget;
import crosswalk.diagram.edit.parts.AbstractEditPart;
import crosswalk.diagram.edit.parts.AbstractOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.AccessConditionEditPart;
import crosswalk.diagram.edit.parts.AccessConditionOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateCreatedEditPart;
import crosswalk.diagram.edit.parts.DateCreatedOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.DateInputEditPart;
import crosswalk.diagram.edit.parts.DateInputInputEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.GenreEditPart;
import crosswalk.diagram.edit.parts.GenreOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.IdentifierEditPart;
import crosswalk.diagram.edit.parts.IdentifierOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.LanguageEditPart;
import crosswalk.diagram.edit.parts.LanguageOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.NameEditPart;
import crosswalk.diagram.edit.parts.NameOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.StringInput10EditPart;
import crosswalk.diagram.edit.parts.StringInput11EditPart;
import crosswalk.diagram.edit.parts.StringInput12EditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput3EditPart;
import crosswalk.diagram.edit.parts.StringInput4EditPart;
import crosswalk.diagram.edit.parts.StringInput5EditPart;
import crosswalk.diagram.edit.parts.StringInput6EditPart;
import crosswalk.diagram.edit.parts.StringInput7EditPart;
import crosswalk.diagram.edit.parts.StringInput8EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
import crosswalk.diagram.edit.parts.SubjectEditPart;
import crosswalk.diagram.edit.parts.SubjectOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TitleInfoEditPart;
import crosswalk.diagram.edit.parts.TitleInfoOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrosswalkDiagramUpdater {

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getSemanticChildren(View view) {
	switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
	case CrossWalkEditPart.VISUAL_ID:
	    return getCrossWalk_1000SemanticChildren(view);
	case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
	    return getDelimitedFileDataFieldCompartment_7001SemanticChildren(view);
	case TitleInfoOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getTitleInfoOutputElementInputsCompartment_7002SemanticChildren(view);
	case AbstractOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getAbstractOutputElementInputsCompartment_7003SemanticChildren(view);
	case GenreOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getGenreOutputElementInputsCompartment_7004SemanticChildren(view);
	case IdentifierOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getIdentifierOutputElementInputsCompartment_7005SemanticChildren(view);
	case LanguageOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getLanguageOutputElementInputsCompartment_7006SemanticChildren(view);
	case NameOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getNameOutputElementInputsCompartment_7007SemanticChildren(view);
	case SubjectOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getSubjectOutputElementInputsCompartment_7008SemanticChildren(view);
	case TypeOfResourceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getTypeOfResourceOutputElementInputsCompartment_7009SemanticChildren(view);
	case OriginalNameRecordMatcherRecordMatcherInputsCompartmentEditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcherRecordMatcherInputsCompartment_7010SemanticChildren(view);
	case DateCreatedOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getDateCreatedOutputElementInputsCompartment_7011SemanticChildren(view);
	case AccessConditionOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getAccessConditionOutputElementInputsCompartment_7012SemanticChildren(view);
	case DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getDateRecognizerOutputElementInputsCompartment_7013SemanticChildren(view);
	case TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID:
	    return getTrimWhitespaceOutputElementInputsCompartment_7014SemanticChildren(view);
	case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
	    return getMappedElementChildElementsCompartment_7015SemanticChildren(view);
	}
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getCrossWalk_1000SemanticChildren(View view) {
	if (!view.isSetElement()) {
	    return Collections.emptyList();
	}
	CrossWalk modelElement = (CrossWalk) view.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	{
	    DataSource childElement = modelElement.getDataSource();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == DelimitedFileEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
	    }
	}
	for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
	    OutputElement childElement = (OutputElement) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == TitleInfoEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == AbstractEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == GenreEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == IdentifierEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == LanguageEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == NameEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == SubjectEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == TypeOfResourceEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == DateCreatedEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == AccessConditionEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == MappedElementEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	for (Iterator<?> it = modelElement.getWidgets().iterator(); it.hasNext();) {
	    WalkWidget childElement = (WalkWidget) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == OriginalNameRecordMatcherEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == DateRecognizerEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == TextEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	    if (visualID == TrimWhitespaceEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getDelimitedFileDataFieldCompartment_7001SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	DelimitedFile modelElement = (DelimitedFile) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
	    DataField childElement = (DataField) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == TabbedDataFieldEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getTitleInfoOutputElementInputsCompartment_7002SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	TitleInfo modelElement = (TitleInfo) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInputEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getAbstractOutputElementInputsCompartment_7003SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	Abstract modelElement = (Abstract) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput2EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getGenreOutputElementInputsCompartment_7004SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	Genre modelElement = (Genre) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput3EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getIdentifierOutputElementInputsCompartment_7005SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	Identifier modelElement = (Identifier) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput4EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getLanguageOutputElementInputsCompartment_7006SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	Language modelElement = (Language) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput5EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getNameOutputElementInputsCompartment_7007SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	Name modelElement = (Name) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput6EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getSubjectOutputElementInputsCompartment_7008SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	Subject modelElement = (Subject) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput7EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getTypeOfResourceOutputElementInputsCompartment_7009SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	TypeOfResource modelElement = (TypeOfResource) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput8EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getOriginalNameRecordMatcherRecordMatcherInputsCompartment_7010SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	{
	    StringInput childElement = modelElement.getInput();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput9EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getDateCreatedOutputElementInputsCompartment_7011SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	DateCreated modelElement = (DateCreated) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == DateInputEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getAccessConditionOutputElementInputsCompartment_7012SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	AccessCondition modelElement = (AccessCondition) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput10EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getDateRecognizerOutputElementInputsCompartment_7013SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	DateRecognizer modelElement = (DateRecognizer) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput11EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getTrimWhitespaceOutputElementInputsCompartment_7014SemanticChildren(
		    View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	TrimWhitespace modelElement = (TrimWhitespace) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
	    Input childElement = (Input) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput12EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkNodeDescriptor> getMappedElementChildElementsCompartment_7015SemanticChildren(View view) {
	if (false == view.eContainer() instanceof View) {
	    return Collections.emptyList();
	}
	View containerView = (View) view.eContainer();
	if (!containerView.isSetElement()) {
	    return Collections.emptyList();
	}
	MappedElement modelElement = (MappedElement) containerView.getElement();
	LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
	for (Iterator<?> it = modelElement.getChildElements().iterator(); it.hasNext();) {
	    MappedElement childElement = (MappedElement) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == MappedElement2EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
	    MappedAttribute childElement = (MappedAttribute) it.next();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == MappedAttributeEditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
		continue;
	    }
	}
	{
	    StringInput childElement = modelElement.getText();
	    int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
	    if (visualID == StringInput13EditPart.VISUAL_ID) {
		result.add(new CrosswalkNodeDescriptor(childElement, visualID));
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getContainedLinks(View view) {
	switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
	case CrossWalkEditPart.VISUAL_ID:
	    return getCrossWalk_1000ContainedLinks(view);
	case DelimitedFileEditPart.VISUAL_ID:
	    return getDelimitedFile_2001ContainedLinks(view);
	case TitleInfoEditPart.VISUAL_ID:
	    return getTitleInfo_2002ContainedLinks(view);
	case AbstractEditPart.VISUAL_ID:
	    return getAbstract_2003ContainedLinks(view);
	case GenreEditPart.VISUAL_ID:
	    return getGenre_2004ContainedLinks(view);
	case IdentifierEditPart.VISUAL_ID:
	    return getIdentifier_2005ContainedLinks(view);
	case LanguageEditPart.VISUAL_ID:
	    return getLanguage_2006ContainedLinks(view);
	case NameEditPart.VISUAL_ID:
	    return getName_2007ContainedLinks(view);
	case SubjectEditPart.VISUAL_ID:
	    return getSubject_2008ContainedLinks(view);
	case TypeOfResourceEditPart.VISUAL_ID:
	    return getTypeOfResource_2009ContainedLinks(view);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcher_2010ContainedLinks(view);
	case DateCreatedEditPart.VISUAL_ID:
	    return getDateCreated_2011ContainedLinks(view);
	case AccessConditionEditPart.VISUAL_ID:
	    return getAccessCondition_2012ContainedLinks(view);
	case DateRecognizerEditPart.VISUAL_ID:
	    return getDateRecognizer_2013ContainedLinks(view);
	case TextEditPart.VISUAL_ID:
	    return getText_2014ContainedLinks(view);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getTrimWhitespace_2015ContainedLinks(view);
	case MappedElementEditPart.VISUAL_ID:
	    return getMappedElement_2016ContainedLinks(view);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getTabbedDataField_3001ContainedLinks(view);
	case StringInputEditPart.VISUAL_ID:
	    return getStringInput_3002ContainedLinks(view);
	case StringInput2EditPart.VISUAL_ID:
	    return getStringInput_3003ContainedLinks(view);
	case StringInput3EditPart.VISUAL_ID:
	    return getStringInput_3004ContainedLinks(view);
	case StringInput4EditPart.VISUAL_ID:
	    return getStringInput_3005ContainedLinks(view);
	case StringInput5EditPart.VISUAL_ID:
	    return getStringInput_3006ContainedLinks(view);
	case StringInput6EditPart.VISUAL_ID:
	    return getStringInput_3007ContainedLinks(view);
	case StringInput7EditPart.VISUAL_ID:
	    return getStringInput_3008ContainedLinks(view);
	case StringInput8EditPart.VISUAL_ID:
	    return getStringInput_3009ContainedLinks(view);
	case StringInput9EditPart.VISUAL_ID:
	    return getStringInput_3010ContainedLinks(view);
	case DateInputEditPart.VISUAL_ID:
	    return getDateInput_3011ContainedLinks(view);
	case StringInput10EditPart.VISUAL_ID:
	    return getStringInput_3012ContainedLinks(view);
	case StringInput11EditPart.VISUAL_ID:
	    return getStringInput_3013ContainedLinks(view);
	case StringInput12EditPart.VISUAL_ID:
	    return getStringInput_3014ContainedLinks(view);
	case MappedElement2EditPart.VISUAL_ID:
	    return getMappedElement_3015ContainedLinks(view);
	case MappedAttributeEditPart.VISUAL_ID:
	    return getMappedAttribute_3016ContainedLinks(view);
	case StringInput13EditPart.VISUAL_ID:
	    return getStringInput_3017ContainedLinks(view);
	}
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getIncomingLinks(View view) {
	switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
	case DelimitedFileEditPart.VISUAL_ID:
	    return getDelimitedFile_2001IncomingLinks(view);
	case TitleInfoEditPart.VISUAL_ID:
	    return getTitleInfo_2002IncomingLinks(view);
	case AbstractEditPart.VISUAL_ID:
	    return getAbstract_2003IncomingLinks(view);
	case GenreEditPart.VISUAL_ID:
	    return getGenre_2004IncomingLinks(view);
	case IdentifierEditPart.VISUAL_ID:
	    return getIdentifier_2005IncomingLinks(view);
	case LanguageEditPart.VISUAL_ID:
	    return getLanguage_2006IncomingLinks(view);
	case NameEditPart.VISUAL_ID:
	    return getName_2007IncomingLinks(view);
	case SubjectEditPart.VISUAL_ID:
	    return getSubject_2008IncomingLinks(view);
	case TypeOfResourceEditPart.VISUAL_ID:
	    return getTypeOfResource_2009IncomingLinks(view);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcher_2010IncomingLinks(view);
	case DateCreatedEditPart.VISUAL_ID:
	    return getDateCreated_2011IncomingLinks(view);
	case AccessConditionEditPart.VISUAL_ID:
	    return getAccessCondition_2012IncomingLinks(view);
	case DateRecognizerEditPart.VISUAL_ID:
	    return getDateRecognizer_2013IncomingLinks(view);
	case TextEditPart.VISUAL_ID:
	    return getText_2014IncomingLinks(view);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getTrimWhitespace_2015IncomingLinks(view);
	case MappedElementEditPart.VISUAL_ID:
	    return getMappedElement_2016IncomingLinks(view);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getTabbedDataField_3001IncomingLinks(view);
	case StringInputEditPart.VISUAL_ID:
	    return getStringInput_3002IncomingLinks(view);
	case StringInput2EditPart.VISUAL_ID:
	    return getStringInput_3003IncomingLinks(view);
	case StringInput3EditPart.VISUAL_ID:
	    return getStringInput_3004IncomingLinks(view);
	case StringInput4EditPart.VISUAL_ID:
	    return getStringInput_3005IncomingLinks(view);
	case StringInput5EditPart.VISUAL_ID:
	    return getStringInput_3006IncomingLinks(view);
	case StringInput6EditPart.VISUAL_ID:
	    return getStringInput_3007IncomingLinks(view);
	case StringInput7EditPart.VISUAL_ID:
	    return getStringInput_3008IncomingLinks(view);
	case StringInput8EditPart.VISUAL_ID:
	    return getStringInput_3009IncomingLinks(view);
	case StringInput9EditPart.VISUAL_ID:
	    return getStringInput_3010IncomingLinks(view);
	case DateInputEditPart.VISUAL_ID:
	    return getDateInput_3011IncomingLinks(view);
	case StringInput10EditPart.VISUAL_ID:
	    return getStringInput_3012IncomingLinks(view);
	case StringInput11EditPart.VISUAL_ID:
	    return getStringInput_3013IncomingLinks(view);
	case StringInput12EditPart.VISUAL_ID:
	    return getStringInput_3014IncomingLinks(view);
	case MappedElement2EditPart.VISUAL_ID:
	    return getMappedElement_3015IncomingLinks(view);
	case MappedAttributeEditPart.VISUAL_ID:
	    return getMappedAttribute_3016IncomingLinks(view);
	case StringInput13EditPart.VISUAL_ID:
	    return getStringInput_3017IncomingLinks(view);
	}
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getOutgoingLinks(View view) {
	switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
	case DelimitedFileEditPart.VISUAL_ID:
	    return getDelimitedFile_2001OutgoingLinks(view);
	case TitleInfoEditPart.VISUAL_ID:
	    return getTitleInfo_2002OutgoingLinks(view);
	case AbstractEditPart.VISUAL_ID:
	    return getAbstract_2003OutgoingLinks(view);
	case GenreEditPart.VISUAL_ID:
	    return getGenre_2004OutgoingLinks(view);
	case IdentifierEditPart.VISUAL_ID:
	    return getIdentifier_2005OutgoingLinks(view);
	case LanguageEditPart.VISUAL_ID:
	    return getLanguage_2006OutgoingLinks(view);
	case NameEditPart.VISUAL_ID:
	    return getName_2007OutgoingLinks(view);
	case SubjectEditPart.VISUAL_ID:
	    return getSubject_2008OutgoingLinks(view);
	case TypeOfResourceEditPart.VISUAL_ID:
	    return getTypeOfResource_2009OutgoingLinks(view);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcher_2010OutgoingLinks(view);
	case DateCreatedEditPart.VISUAL_ID:
	    return getDateCreated_2011OutgoingLinks(view);
	case AccessConditionEditPart.VISUAL_ID:
	    return getAccessCondition_2012OutgoingLinks(view);
	case DateRecognizerEditPart.VISUAL_ID:
	    return getDateRecognizer_2013OutgoingLinks(view);
	case TextEditPart.VISUAL_ID:
	    return getText_2014OutgoingLinks(view);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getTrimWhitespace_2015OutgoingLinks(view);
	case MappedElementEditPart.VISUAL_ID:
	    return getMappedElement_2016OutgoingLinks(view);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getTabbedDataField_3001OutgoingLinks(view);
	case StringInputEditPart.VISUAL_ID:
	    return getStringInput_3002OutgoingLinks(view);
	case StringInput2EditPart.VISUAL_ID:
	    return getStringInput_3003OutgoingLinks(view);
	case StringInput3EditPart.VISUAL_ID:
	    return getStringInput_3004OutgoingLinks(view);
	case StringInput4EditPart.VISUAL_ID:
	    return getStringInput_3005OutgoingLinks(view);
	case StringInput5EditPart.VISUAL_ID:
	    return getStringInput_3006OutgoingLinks(view);
	case StringInput6EditPart.VISUAL_ID:
	    return getStringInput_3007OutgoingLinks(view);
	case StringInput7EditPart.VISUAL_ID:
	    return getStringInput_3008OutgoingLinks(view);
	case StringInput8EditPart.VISUAL_ID:
	    return getStringInput_3009OutgoingLinks(view);
	case StringInput9EditPart.VISUAL_ID:
	    return getStringInput_3010OutgoingLinks(view);
	case DateInputEditPart.VISUAL_ID:
	    return getDateInput_3011OutgoingLinks(view);
	case StringInput10EditPart.VISUAL_ID:
	    return getStringInput_3012OutgoingLinks(view);
	case StringInput11EditPart.VISUAL_ID:
	    return getStringInput_3013OutgoingLinks(view);
	case StringInput12EditPart.VISUAL_ID:
	    return getStringInput_3014OutgoingLinks(view);
	case MappedElement2EditPart.VISUAL_ID:
	    return getMappedElement_3015OutgoingLinks(view);
	case MappedAttributeEditPart.VISUAL_ID:
	    return getMappedAttribute_3016OutgoingLinks(view);
	case StringInput13EditPart.VISUAL_ID:
	    return getStringInput_3017OutgoingLinks(view);
	}
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getCrossWalk_1000ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDelimitedFile_2001ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTitleInfo_2002ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getAbstract_2003ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getGenre_2004ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getIdentifier_2005ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getLanguage_2006ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getName_2007ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getSubject_2008ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTypeOfResource_2009ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_2010ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateCreated_2011ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getAccessCondition_2012ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateRecognizer_2013ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getText_2014ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTrimWhitespace_2015ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedElement_2016ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTabbedDataField_3001ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3002ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3003ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3004ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3005ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3006ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3007ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3008ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3009ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3010ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateInput_3011ContainedLinks(View view) {
	DateInput modelElement = (DateInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_DateInput_Input_4002(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3012ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3013ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3014ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedElement_3015ContainedLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedAttribute_3016ContainedLinks(View view) {
	MappedAttribute modelElement = (MappedAttribute) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3017ContainedLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDelimitedFile_2001IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTitleInfo_2002IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getAbstract_2003IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getGenre_2004IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getIdentifier_2005IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getLanguage_2006IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getName_2007IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getSubject_2008IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTypeOfResource_2009IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_2010IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateCreated_2011IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getAccessCondition_2012IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateRecognizer_2013IncomingLinks(View view) {
	DateRecognizer modelElement = (DateRecognizer) view.getElement();
	Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
			.eResource().getResourceSet().getResources());
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getIncomingFeatureModelFacetLinks_DateInput_Input_4002(modelElement, crossReferences));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getText_2014IncomingLinks(View view) {
	Text modelElement = (Text) view.getElement();
	Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
			.eResource().getResourceSet().getResources());
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getIncomingFeatureModelFacetLinks_StringInput_Input_4001(modelElement, crossReferences));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTrimWhitespace_2015IncomingLinks(View view) {
	TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
	Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
			.eResource().getResourceSet().getResources());
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getIncomingFeatureModelFacetLinks_StringInput_Input_4001(modelElement, crossReferences));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedElement_2016IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTabbedDataField_3001IncomingLinks(View view) {
	TabbedDataField modelElement = (TabbedDataField) view.getElement();
	Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
			.eResource().getResourceSet().getResources());
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getIncomingFeatureModelFacetLinks_StringInput_Input_4001(modelElement, crossReferences));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3002IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3003IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3004IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3005IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3006IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3007IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3008IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3009IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3010IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateInput_3011IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3012IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3013IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3014IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedElement_3015IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedAttribute_3016IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3017IncomingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDelimitedFile_2001OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTitleInfo_2002OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getAbstract_2003OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getGenre_2004OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getIdentifier_2005OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getLanguage_2006OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getName_2007OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getSubject_2008OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTypeOfResource_2009OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_2010OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateCreated_2011OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getAccessCondition_2012OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateRecognizer_2013OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getText_2014OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTrimWhitespace_2015OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedElement_2016OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getTabbedDataField_3001OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3002OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3003OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3004OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3005OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3006OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3007OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3008OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3009OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3010OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getDateInput_3011OutgoingLinks(View view) {
	DateInput modelElement = (DateInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_DateInput_Input_4002(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3012OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3013OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3014OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedElement_3015OutgoingLinks(View view) {
	return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getMappedAttribute_3016OutgoingLinks(View view) {
	MappedAttribute modelElement = (MappedAttribute) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    public static List<CrosswalkLinkDescriptor> getStringInput_3017OutgoingLinks(View view) {
	StringInput modelElement = (StringInput) view.getElement();
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	result.addAll(getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(modelElement));
	return result;
    }

    /**
     * @generated
     */
    private static Collection<CrosswalkLinkDescriptor> getIncomingFeatureModelFacetLinks_StringInput_Input_4001(
		    StringGenerator target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (EStructuralFeature.Setting setting : settings) {
	    if (setting.getEStructuralFeature() == CrosswalkPackage.eINSTANCE.getStringInput_Input()) {
		result.add(new CrosswalkLinkDescriptor(setting.getEObject(), target,
				CrosswalkElementTypes.StringInputInput_4001, StringInputInputEditPart.VISUAL_ID));
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    private static Collection<CrosswalkLinkDescriptor> getIncomingFeatureModelFacetLinks_DateInput_Input_4002(
		    DateGenerator target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (EStructuralFeature.Setting setting : settings) {
	    if (setting.getEStructuralFeature() == CrosswalkPackage.eINSTANCE.getDateInput_Input()) {
		result.add(new CrosswalkLinkDescriptor(setting.getEObject(), target,
				CrosswalkElementTypes.DateInputInput_4002, DateInputInputEditPart.VISUAL_ID));
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    private static Collection<CrosswalkLinkDescriptor> getOutgoingFeatureModelFacetLinks_StringInput_Input_4001(
		    StringInput source) {
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	StringGenerator destination = source.getInput();
	if (destination == null) {
	    return result;
	}
	result.add(new CrosswalkLinkDescriptor(source, destination, CrosswalkElementTypes.StringInputInput_4001,
			StringInputInputEditPart.VISUAL_ID));
	return result;
    }

    /**
     * @generated
     */
    private static Collection<CrosswalkLinkDescriptor> getOutgoingFeatureModelFacetLinks_DateInput_Input_4002(
		    DateInput source) {
	LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
	DateGenerator destination = source.getInput();
	if (destination == null) {
	    return result;
	}
	result.add(new CrosswalkLinkDescriptor(source, destination, CrosswalkElementTypes.DateInputInput_4002,
			DateInputInputEditPart.VISUAL_ID));
	return result;
    }

}
