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
package crosswalk.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import crosswalk.CrosswalkPackage;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.FormEditPart;
import crosswalk.diagram.edit.parts.InputFieldEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlock3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.ParagraphEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

/**
 * @generated
 */
public class CrosswalkElementTypes {

	/**
	 * @generated
	 */
	private CrosswalkElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType EditingContainer_1000 = getElementType("crosswalk-gmf.diagram.EditingContainer_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CrossWalk_2001 = getElementType("crosswalk-gmf.diagram.CrossWalk_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dictionary_2002 = getElementType("crosswalk-gmf.diagram.Dictionary_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Form_2003 = getElementType("crosswalk-gmf.diagram.Form_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DelimitedFile_3001 = getElementType("crosswalk-gmf.diagram.DelimitedFile_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TabbedDataField_3002 = getElementType("crosswalk-gmf.diagram.TabbedDataField_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OriginalNameRecordMatcher_3003 = getElementType("crosswalk-gmf.diagram.OriginalNameRecordMatcher_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateRecognizer_3004 = getElementType("crosswalk-gmf.diagram.DateRecognizer_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Text_3005 = getElementType("crosswalk-gmf.diagram.Text_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TrimWhitespace_3006 = getElementType("crosswalk-gmf.diagram.TrimWhitespace_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MappedElement_3007 = getElementType("crosswalk-gmf.diagram.MappedElement_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MappedElement_3008 = getElementType("crosswalk-gmf.diagram.MappedElement_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MappedAttribute_3009 = getElementType("crosswalk-gmf.diagram.MappedAttribute_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MetadataBlock_3018 = getElementType("crosswalk-gmf.diagram.MetadataBlock_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MetadataBlock_3010 = getElementType("crosswalk-gmf.diagram.MetadataBlock_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MetadataBlock_3019 = getElementType("crosswalk-gmf.diagram.MetadataBlock_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Paragraph_3020 = getElementType("crosswalk-gmf.diagram.Paragraph_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputField_3017 = getElementType("crosswalk-gmf.diagram.InputField_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputOutput_4001 = getElementType("crosswalk-gmf.diagram.InputOutput_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return CrosswalkDiagramEditorPlugin.getInstance().getItemImageDescriptor(
						eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 *
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(EditingContainer_1000, CrosswalkPackage.eINSTANCE.getEditingContainer());

			elements.put(CrossWalk_2001, CrosswalkPackage.eINSTANCE.getCrossWalk());

			elements.put(Dictionary_2002, CrosswalkPackage.eINSTANCE.getDictionary());

			elements.put(Form_2003, CrosswalkPackage.eINSTANCE.getForm());

			elements.put(DelimitedFile_3001, CrosswalkPackage.eINSTANCE.getDelimitedFile());

			elements.put(TabbedDataField_3002, CrosswalkPackage.eINSTANCE.getTabbedDataField());

			elements.put(OriginalNameRecordMatcher_3003, CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher());

			elements.put(DateRecognizer_3004, CrosswalkPackage.eINSTANCE.getDateRecognizer());

			elements.put(Text_3005, CrosswalkPackage.eINSTANCE.getText());

			elements.put(TrimWhitespace_3006, CrosswalkPackage.eINSTANCE.getTrimWhitespace());

			elements.put(MappedElement_3007, CrosswalkPackage.eINSTANCE.getMappedElement());

			elements.put(MappedElement_3008, CrosswalkPackage.eINSTANCE.getMappedElement());

			elements.put(MappedAttribute_3009, CrosswalkPackage.eINSTANCE.getMappedAttribute());

			elements.put(MetadataBlock_3018, CrosswalkPackage.eINSTANCE.getMetadataBlock());

			elements.put(InputField_3017, CrosswalkPackage.eINSTANCE.getInputField());

			elements.put(MetadataBlock_3010, CrosswalkPackage.eINSTANCE.getMetadataBlock());

			elements.put(MetadataBlock_3019, CrosswalkPackage.eINSTANCE.getMetadataBlock());

			elements.put(Paragraph_3020, CrosswalkPackage.eINSTANCE.getParagraph());

			elements.put(InputOutput_4001, CrosswalkPackage.eINSTANCE.getInput_Output());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(EditingContainer_1000);
			KNOWN_ELEMENT_TYPES.add(CrossWalk_2001);
			KNOWN_ELEMENT_TYPES.add(Dictionary_2002);
			KNOWN_ELEMENT_TYPES.add(Form_2003);
			KNOWN_ELEMENT_TYPES.add(DelimitedFile_3001);
			KNOWN_ELEMENT_TYPES.add(TabbedDataField_3002);
			KNOWN_ELEMENT_TYPES.add(OriginalNameRecordMatcher_3003);
			KNOWN_ELEMENT_TYPES.add(DateRecognizer_3004);
			KNOWN_ELEMENT_TYPES.add(Text_3005);
			KNOWN_ELEMENT_TYPES.add(TrimWhitespace_3006);
			KNOWN_ELEMENT_TYPES.add(MappedElement_3007);
			KNOWN_ELEMENT_TYPES.add(MappedElement_3008);
			KNOWN_ELEMENT_TYPES.add(MappedAttribute_3009);
			KNOWN_ELEMENT_TYPES.add(MetadataBlock_3018);
			KNOWN_ELEMENT_TYPES.add(InputField_3017);
			KNOWN_ELEMENT_TYPES.add(MetadataBlock_3010);
			KNOWN_ELEMENT_TYPES.add(MetadataBlock_3019);
			KNOWN_ELEMENT_TYPES.add(Paragraph_3020);
			KNOWN_ELEMENT_TYPES.add(InputOutput_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
			case EditingContainerEditPart.VISUAL_ID:
				return EditingContainer_1000;
			case CrossWalkEditPart.VISUAL_ID:
				return CrossWalk_2001;
			case DictionaryEditPart.VISUAL_ID:
				return Dictionary_2002;
			case FormEditPart.VISUAL_ID:
				return Form_2003;
			case DelimitedFileEditPart.VISUAL_ID:
				return DelimitedFile_3001;
			case TabbedDataFieldEditPart.VISUAL_ID:
				return TabbedDataField_3002;
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return OriginalNameRecordMatcher_3003;
			case DateRecognizerEditPart.VISUAL_ID:
				return DateRecognizer_3004;
			case TextEditPart.VISUAL_ID:
				return Text_3005;
			case TrimWhitespaceEditPart.VISUAL_ID:
				return TrimWhitespace_3006;
			case MappedElementEditPart.VISUAL_ID:
				return MappedElement_3007;
			case MappedElement2EditPart.VISUAL_ID:
				return MappedElement_3008;
			case MappedAttributeEditPart.VISUAL_ID:
				return MappedAttribute_3009;
			case MetadataBlock2EditPart.VISUAL_ID:
				return MetadataBlock_3018;
			case InputFieldEditPart.VISUAL_ID:
				return InputField_3017;
			case MetadataBlockEditPart.VISUAL_ID:
				return MetadataBlock_3010;
			case MetadataBlock3EditPart.VISUAL_ID:
				return MetadataBlock_3019;
			case ParagraphEditPart.VISUAL_ID:
				return Paragraph_3020;
			case InputOutputEditPart.VISUAL_ID:
				return InputOutput_4001;
		}
		return null;
	}

}
