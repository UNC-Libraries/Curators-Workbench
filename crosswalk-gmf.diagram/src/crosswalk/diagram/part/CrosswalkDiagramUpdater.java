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

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.CurrentDate;
import crosswalk.CurrentUsername;
import crosswalk.DataField;
import crosswalk.DataSource;
import crosswalk.DateInputField;
import crosswalk.DateRecognizer;
import crosswalk.DelimitedFile;
import crosswalk.Dictionary;
import crosswalk.Editable;
import crosswalk.EditingContainer;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.Input;
import crosswalk.InputField;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MetadataBlock;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.Output;
import crosswalk.OutputElement;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TextInputField;
import crosswalk.TrimWhitespace;
import crosswalk.WalkWidget;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.CurrentDateEditPart;
import crosswalk.diagram.edit.parts.CurrentUsernameEditPart;
import crosswalk.diagram.edit.parts.DateInputFieldEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.DictionaryModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.FileBlockEditPart;
import crosswalk.diagram.edit.parts.FormEditPart;
import crosswalk.diagram.edit.parts.FormModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildAttributesCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildAttributesCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlock3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartmentEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.ParagraphEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
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
		case EditingContainerEditPart.VISUAL_ID:
			return getEditingContainer_1000SemanticChildren(view);
		case CrossWalkEditPart.VISUAL_ID:
			return getCrossWalk_2001SemanticChildren(view);
		case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
			return getCrossWalkModelBoxCompartment_7001SemanticChildren(view);
		case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
			return getDelimitedFileDataFieldCompartment_7002SemanticChildren(view);
		case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
			return getMappedElementChildElementsCompartment_7003SemanticChildren(view);
		case MappedElementChildAttributesCompartmentEditPart.VISUAL_ID:
			return getMappedElementChildAttributesCompartment_7014SemanticChildren(view);
		case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
			return getMappedElementChildElementsCompartment_7004SemanticChildren(view);
		case MappedElementChildAttributesCompartment2EditPart.VISUAL_ID:
			return getMappedElementChildAttributesCompartment_7015SemanticChildren(view);
		case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
			return getMetadataBlockMetadataBlockInputFieldsCompartment_7009SemanticChildren(view);
		case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
			return getMetadataBlockMetadataBlockMappingCompartment_7010SemanticChildren(view);
		case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
			return getDictionaryModelBoxCompartment_7005SemanticChildren(view);
		case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
			return getMetadataBlockMetadataBlockInputFieldsCompartment_7006SemanticChildren(view);
		case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
			return getMetadataBlockMetadataBlockMappingCompartment_7007SemanticChildren(view);
		case FormModelBoxCompartmentEditPart.VISUAL_ID:
			return getFormFlowModelBoxCompartment_7011SemanticChildren(view);
		case MetadataBlockMetadataBlockInputFieldsCompartment3EditPart.VISUAL_ID:
			return getMetadataBlockMetadataBlockInputFieldsCompartment_7012SemanticChildren(view);
		case MetadataBlockMetadataBlockMappingCompartment3EditPart.VISUAL_ID:
			return getMetadataBlockMetadataBlockMappingCompartment_7013SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getEditingContainer_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EditingContainer modelElement = (EditingContainer) view.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		{
			Editable childElement = modelElement.getModel();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CrossWalkEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
			if (visualID == DictionaryEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
			if (visualID == FormEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getCrossWalk_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CrossWalk modelElement = (CrossWalk) view.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it
				.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CurrentDateEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CurrentUsernameEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getCrossWalkModelBoxCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CrossWalk modelElement = (CrossWalk) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		{
			DataSource childElement = modelElement.getDataSource();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DelimitedFileEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it
				.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedElementEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MetadataBlock2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getDelimitedFileDataFieldCompartment_7002SemanticChildren(
			View view) {
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
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrosswalkNodeDescriptor> getMappedElementChildElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildElements().iterator(); it
				.hasNext();) {
			MappedElement childElement = (MappedElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedElement2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMappedElementChildAttributesCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			MappedAttribute childElement = (MappedAttribute) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedAttributeEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMappedElementChildElementsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildElements().iterator(); it
				.hasNext();) {
			MappedElement childElement = (MappedElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedElement2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMappedElementChildAttributesCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			MappedAttribute childElement = (MappedAttribute) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedAttributeEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockInputFieldsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			InputField childElement = (InputField) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextInputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateInputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockMappingCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it
				.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
			if (visualID == CurrentDateEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CurrentUsernameEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedElementEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getDictionaryModelBoxCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dictionary modelElement = (Dictionary) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBlocks().iterator(); it.hasNext();) {
			MetadataBlock childElement = (MetadataBlock) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MetadataBlockEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockInputFieldsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			InputField childElement = (InputField) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextInputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateInputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockMappingCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it
				.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
			if (visualID == CurrentDateEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CurrentUsernameEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedElementEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getFormFlowModelBoxCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Form modelElement = (Form) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			FormElement childElement = (FormElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MetadataBlock3EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParagraphEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FileBlockEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockInputFieldsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			InputField childElement = (InputField) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextInputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateInputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockMappingCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it
				.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
			if (visualID == CurrentDateEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CurrentUsernameEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MappedElementEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getContainedLinks(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
		case EditingContainerEditPart.VISUAL_ID:
			return getEditingContainer_1000ContainedLinks(view);
		case CrossWalkEditPart.VISUAL_ID:
			return getCrossWalk_2001ContainedLinks(view);
		case DictionaryEditPart.VISUAL_ID:
			return getDictionary_2002ContainedLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2003ContainedLinks(view);
		case DelimitedFileEditPart.VISUAL_ID:
			return getDelimitedFile_3001ContainedLinks(view);
		case TabbedDataFieldEditPart.VISUAL_ID:
			return getTabbedDataField_3002ContainedLinks(view);
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
			return getOriginalNameRecordMatcher_3003ContainedLinks(view);
		case DateRecognizerEditPart.VISUAL_ID:
			return getDateRecognizer_3004ContainedLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_3005ContainedLinks(view);
		case TrimWhitespaceEditPart.VISUAL_ID:
			return getTrimWhitespace_3006ContainedLinks(view);
		case MappedElementEditPart.VISUAL_ID:
			return getMappedElement_3007ContainedLinks(view);
		case MappedElement2EditPart.VISUAL_ID:
			return getMappedElement_3008ContainedLinks(view);
		case MappedAttributeEditPart.VISUAL_ID:
			return getMappedAttribute_3009ContainedLinks(view);
		case MetadataBlock2EditPart.VISUAL_ID:
			return getMetadataBlock_3018ContainedLinks(view);
		case TextInputFieldEditPart.VISUAL_ID:
			return getTextInputField_3023ContainedLinks(view);
		case CurrentDateEditPart.VISUAL_ID:
			return getCurrentDate_3021ContainedLinks(view);
		case CurrentUsernameEditPart.VISUAL_ID:
			return getCurrentUsername_3022ContainedLinks(view);
		case DateInputFieldEditPart.VISUAL_ID:
			return getDateInputField_3024ContainedLinks(view);
		case MetadataBlockEditPart.VISUAL_ID:
			return getMetadataBlock_3010ContainedLinks(view);
		case MetadataBlock3EditPart.VISUAL_ID:
			return getMetadataBlock_3019ContainedLinks(view);
		case ParagraphEditPart.VISUAL_ID:
			return getParagraph_3020ContainedLinks(view);
		case FileBlockEditPart.VISUAL_ID:
			return getFileBlock_3025ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getIncomingLinks(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
		case CrossWalkEditPart.VISUAL_ID:
			return getCrossWalk_2001IncomingLinks(view);
		case DictionaryEditPart.VISUAL_ID:
			return getDictionary_2002IncomingLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2003IncomingLinks(view);
		case DelimitedFileEditPart.VISUAL_ID:
			return getDelimitedFile_3001IncomingLinks(view);
		case TabbedDataFieldEditPart.VISUAL_ID:
			return getTabbedDataField_3002IncomingLinks(view);
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
			return getOriginalNameRecordMatcher_3003IncomingLinks(view);
		case DateRecognizerEditPart.VISUAL_ID:
			return getDateRecognizer_3004IncomingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_3005IncomingLinks(view);
		case TrimWhitespaceEditPart.VISUAL_ID:
			return getTrimWhitespace_3006IncomingLinks(view);
		case MappedElementEditPart.VISUAL_ID:
			return getMappedElement_3007IncomingLinks(view);
		case MappedElement2EditPart.VISUAL_ID:
			return getMappedElement_3008IncomingLinks(view);
		case MappedAttributeEditPart.VISUAL_ID:
			return getMappedAttribute_3009IncomingLinks(view);
		case MetadataBlock2EditPart.VISUAL_ID:
			return getMetadataBlock_3018IncomingLinks(view);
		case TextInputFieldEditPart.VISUAL_ID:
			return getTextInputField_3023IncomingLinks(view);
		case CurrentDateEditPart.VISUAL_ID:
			return getCurrentDate_3021IncomingLinks(view);
		case CurrentUsernameEditPart.VISUAL_ID:
			return getCurrentUsername_3022IncomingLinks(view);
		case DateInputFieldEditPart.VISUAL_ID:
			return getDateInputField_3024IncomingLinks(view);
		case MetadataBlockEditPart.VISUAL_ID:
			return getMetadataBlock_3010IncomingLinks(view);
		case MetadataBlock3EditPart.VISUAL_ID:
			return getMetadataBlock_3019IncomingLinks(view);
		case ParagraphEditPart.VISUAL_ID:
			return getParagraph_3020IncomingLinks(view);
		case FileBlockEditPart.VISUAL_ID:
			return getFileBlock_3025IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOutgoingLinks(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
		case CrossWalkEditPart.VISUAL_ID:
			return getCrossWalk_2001OutgoingLinks(view);
		case DictionaryEditPart.VISUAL_ID:
			return getDictionary_2002OutgoingLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_2003OutgoingLinks(view);
		case DelimitedFileEditPart.VISUAL_ID:
			return getDelimitedFile_3001OutgoingLinks(view);
		case TabbedDataFieldEditPart.VISUAL_ID:
			return getTabbedDataField_3002OutgoingLinks(view);
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
			return getOriginalNameRecordMatcher_3003OutgoingLinks(view);
		case DateRecognizerEditPart.VISUAL_ID:
			return getDateRecognizer_3004OutgoingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_3005OutgoingLinks(view);
		case TrimWhitespaceEditPart.VISUAL_ID:
			return getTrimWhitespace_3006OutgoingLinks(view);
		case MappedElementEditPart.VISUAL_ID:
			return getMappedElement_3007OutgoingLinks(view);
		case MappedElement2EditPart.VISUAL_ID:
			return getMappedElement_3008OutgoingLinks(view);
		case MappedAttributeEditPart.VISUAL_ID:
			return getMappedAttribute_3009OutgoingLinks(view);
		case MetadataBlock2EditPart.VISUAL_ID:
			return getMetadataBlock_3018OutgoingLinks(view);
		case TextInputFieldEditPart.VISUAL_ID:
			return getTextInputField_3023OutgoingLinks(view);
		case CurrentDateEditPart.VISUAL_ID:
			return getCurrentDate_3021OutgoingLinks(view);
		case CurrentUsernameEditPart.VISUAL_ID:
			return getCurrentUsername_3022OutgoingLinks(view);
		case DateInputFieldEditPart.VISUAL_ID:
			return getDateInputField_3024OutgoingLinks(view);
		case MetadataBlockEditPart.VISUAL_ID:
			return getMetadataBlock_3010OutgoingLinks(view);
		case MetadataBlock3EditPart.VISUAL_ID:
			return getMetadataBlock_3019OutgoingLinks(view);
		case ParagraphEditPart.VISUAL_ID:
			return getParagraph_3020OutgoingLinks(view);
		case FileBlockEditPart.VISUAL_ID:
			return getFileBlock_3025OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getEditingContainer_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCrossWalk_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDictionary_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getForm_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDelimitedFile_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTabbedDataField_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3003ContainedLinks(
			View view) {
		OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) view
				.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3004ContainedLinks(
			View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3006ContainedLinks(
			View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3009ContainedLinks(
			View view) {
		MappedAttribute modelElement = (MappedAttribute) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTextInputField_3023ContainedLinks(
			View view) {
		TextInputField modelElement = (TextInputField) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getParagraph_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getFileBlock_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCurrentDate_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCurrentUsername_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateInputField_3024ContainedLinks(
			View view) {
		DateInputField modelElement = (DateInputField) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCrossWalk_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDictionary_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getForm_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDelimitedFile_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTabbedDataField_3002IncomingLinks(
			View view) {
		TabbedDataField modelElement = (TabbedDataField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3004IncomingLinks(
			View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3005IncomingLinks(
			View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3006IncomingLinks(
			View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTextInputField_3023IncomingLinks(
			View view) {
		TextInputField modelElement = (TextInputField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getParagraph_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getFileBlock_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCurrentDate_3021IncomingLinks(
			View view) {
		CurrentDate modelElement = (CurrentDate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCurrentUsername_3022IncomingLinks(
			View view) {
		CurrentUsername modelElement = (CurrentUsername) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateInputField_3024IncomingLinks(
			View view) {
		DateInputField modelElement = (DateInputField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCrossWalk_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDictionary_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getForm_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDelimitedFile_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTabbedDataField_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3003OutgoingLinks(
			View view) {
		OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) view
				.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3004OutgoingLinks(
			View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3006OutgoingLinks(
			View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3009OutgoingLinks(
			View view) {
		MappedAttribute modelElement = (MappedAttribute) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTextInputField_3023OutgoingLinks(
			View view) {
		TextInputField modelElement = (TextInputField) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getParagraph_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getFileBlock_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCurrentDate_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCurrentUsername_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateInputField_3024OutgoingLinks(
			View view) {
		DateInputField modelElement = (DateInputField) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrosswalkLinkDescriptor> getIncomingFeatureModelFacetLinks_Input_Output_4001(
			Output target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CrosswalkPackage.eINSTANCE
					.getInput_Output()) {
				result.add(new CrosswalkLinkDescriptor(setting.getEObject(),
						target, CrosswalkElementTypes.InputOutput_4001,
						InputOutputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrosswalkLinkDescriptor> getOutgoingFeatureModelFacetLinks_Input_Output_4001(
			Input source) {
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		Output destination = source.getOutput();
		if (destination == null) {
			return result;
		}
		result.add(new CrosswalkLinkDescriptor(source, destination,
				CrosswalkElementTypes.InputOutput_4001,
				InputOutputEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<CrosswalkNodeDescriptor> getSemanticChildren(View view) {
			return CrosswalkDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CrosswalkLinkDescriptor> getContainedLinks(View view) {
			return CrosswalkDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CrosswalkLinkDescriptor> getIncomingLinks(View view) {
			return CrosswalkDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CrosswalkLinkDescriptor> getOutgoingLinks(View view) {
			return CrosswalkDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
