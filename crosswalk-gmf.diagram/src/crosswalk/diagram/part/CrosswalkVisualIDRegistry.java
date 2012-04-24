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

import crosswalk.CrosswalkPackage;
import crosswalk.EditingContainer;
import crosswalk.diagram.edit.parts.CrossWalk2EditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.DateRecognizer2EditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.DictionaryModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.InputFieldEditPart;
import crosswalk.diagram.edit.parts.InputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.MappedAttribute2EditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElement3EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment3EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartmentEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockNameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcher2EditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.Text2EditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValue2EditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespace2EditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel10EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel11EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel15EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel16EditPart;
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
			if (EditingContainerEditPart.MODEL_ID.equals(view.getType())) {
				return EditingContainerEditPart.VISUAL_ID;
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
		if (CrosswalkPackage.eINSTANCE.getEditingContainer().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((EditingContainer) domainElement)) {
			return EditingContainerEditPart.VISUAL_ID;
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
		if (!EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crosswalk.diagram.part.CrosswalkVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EditingContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
			case EditingContainerEditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getCrossWalk().isSuperTypeOf(domainElement.eClass())) {
					return CrossWalkEditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getDictionary().isSuperTypeOf(domainElement.eClass())) {
					return DictionaryEditPart.VISUAL_ID;
				}
				break;
			case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
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
				if (CrosswalkPackage.eINSTANCE.getMetadataBlock().isSuperTypeOf(domainElement.eClass())) {
					return MetadataBlock2EditPart.VISUAL_ID;
				}
				break;
			case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getTabbedDataField().isSuperTypeOf(domainElement.eClass())) {
					return TabbedDataFieldEditPart.VISUAL_ID;
				}
				break;
			case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
					return MappedElement2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isSuperTypeOf(domainElement.eClass())) {
					return MappedAttributeEditPart.VISUAL_ID;
				}
				break;
			case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
					return MappedElement2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isSuperTypeOf(domainElement.eClass())) {
					return MappedAttributeEditPart.VISUAL_ID;
				}
				break;
			case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getInputField().isSuperTypeOf(domainElement.eClass())) {
					return InputFieldEditPart.VISUAL_ID;
				}
				break;
			case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher().isSuperTypeOf(domainElement.eClass())) {
					return OriginalNameRecordMatcher2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(domainElement.eClass())) {
					return DateRecognizer2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
					return Text2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(domainElement.eClass())) {
					return TrimWhitespace2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
					return MappedElement3EditPart.VISUAL_ID;
				}
				break;
			case MappedElementChildElementsCompartment3EditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
					return MappedElement2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isSuperTypeOf(domainElement.eClass())) {
					return MappedAttribute2EditPart.VISUAL_ID;
				}
				break;
			case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getMetadataBlock().isSuperTypeOf(domainElement.eClass())) {
					return MetadataBlockEditPart.VISUAL_ID;
				}
				break;
			case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getInputField().isSuperTypeOf(domainElement.eClass())) {
					return InputFieldEditPart.VISUAL_ID;
				}
				break;
			case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
				if (CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher().isSuperTypeOf(domainElement.eClass())) {
					return OriginalNameRecordMatcher2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(domainElement.eClass())) {
					return DateRecognizer2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
					return Text2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(domainElement.eClass())) {
					return TrimWhitespace2EditPart.VISUAL_ID;
				}
				if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(domainElement.eClass())) {
					return MappedElement3EditPart.VISUAL_ID;
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
		if (!EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crosswalk.diagram.part.CrosswalkVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EditingContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
			case EditingContainerEditPart.VISUAL_ID:
				if (CrossWalkEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (DictionaryEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case CrossWalkEditPart.VISUAL_ID:
				if (CrossWalkModelBoxCompartmentEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case DictionaryEditPart.VISUAL_ID:
				if (DictionaryModelBoxCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
			case TabbedDataFieldEditPart.VISUAL_ID:
				if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case DateRecognizerEditPart.VISUAL_ID:
				if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case TextEditPart.VISUAL_ID:
				if (TextValueEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case TrimWhitespaceEditPart.VISUAL_ID:
				if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MappedElementEditPart.VISUAL_ID:
				if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedElementChildElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MappedElement2EditPart.VISUAL_ID:
				if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedElementChildElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MappedAttributeEditPart.VISUAL_ID:
				if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MetadataBlock2EditPart.VISUAL_ID:
				if (MetadataBlockName2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case OriginalNameRecordMatcher2EditPart.VISUAL_ID:
				if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case DateRecognizer2EditPart.VISUAL_ID:
				if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case Text2EditPart.VISUAL_ID:
				if (TextValue2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case TrimWhitespace2EditPart.VISUAL_ID:
				if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MappedElement3EditPart.VISUAL_ID:
				if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedElementChildElementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MappedAttribute2EditPart.VISUAL_ID:
				if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case InputFieldEditPart.VISUAL_ID:
				if (InputFieldLabelEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MetadataBlockEditPart.VISUAL_ID:
				if (MetadataBlockNameEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
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
				if (MetadataBlock2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
				if (TabbedDataFieldEditPart.VISUAL_ID == nodeVisualID) {
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
				break;
			case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
				if (MappedElement2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedAttributeEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
				if (InputFieldEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
				if (OriginalNameRecordMatcher2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (DateRecognizer2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (Text2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (TrimWhitespace2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedElement3EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MappedElementChildElementsCompartment3EditPart.VISUAL_ID:
				if (MappedElement2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedAttribute2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
				if (MetadataBlockEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
				if (InputFieldEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
				if (OriginalNameRecordMatcher2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (DateRecognizer2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (Text2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (TrimWhitespace2EditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (MappedElement3EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(EditingContainer element) {
		return true;
	}

}
