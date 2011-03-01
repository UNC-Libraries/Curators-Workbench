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
import crosswalk.diagram.edit.parts.DateInputInputEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
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
    public static final IElementType CrossWalk_1000 = getElementType("crosswalk-gmf.diagram.CrossWalk_1000"); //$NON-NLS-1$
    /**
     * @generated
     */
    public static final IElementType DelimitedFile_2001 = getElementType("crosswalk-gmf.diagram.DelimitedFile_2001"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType OriginalNameRecordMatcher_2010 = getElementType("crosswalk-gmf.diagram.OriginalNameRecordMatcher_2010"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType DateRecognizer_2013 = getElementType("crosswalk-gmf.diagram.DateRecognizer_2013"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType Text_2014 = getElementType("crosswalk-gmf.diagram.Text_2014"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType TrimWhitespace_2015 = getElementType("crosswalk-gmf.diagram.TrimWhitespace_2015"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType MappedElement_2016 = getElementType("crosswalk-gmf.diagram.MappedElement_2016"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType TabbedDataField_3001 = getElementType("crosswalk-gmf.diagram.TabbedDataField_3001"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType StringInput_3002 = getElementType("crosswalk-gmf.diagram.StringInput_3002"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType StringInput_3003 = getElementType("crosswalk-gmf.diagram.StringInput_3003"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType StringInput_3010 = getElementType("crosswalk-gmf.diagram.StringInput_3010"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType MappedElement_3015 = getElementType("crosswalk-gmf.diagram.MappedElement_3015"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType MappedAttribute_3016 = getElementType("crosswalk-gmf.diagram.MappedAttribute_3016"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType StringInput_3017 = getElementType("crosswalk-gmf.diagram.StringInput_3017"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType StringInputInput_4001 = getElementType("crosswalk-gmf.diagram.StringInputInput_4001"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType DateInputInput_4002 = getElementType("crosswalk-gmf.diagram.DateInputInput_4002"); //$NON-NLS-1$

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

	    elements.put(CrossWalk_1000, CrosswalkPackage.eINSTANCE.getCrossWalk());

	    elements.put(DelimitedFile_2001, CrosswalkPackage.eINSTANCE.getDelimitedFile());

	    elements.put(OriginalNameRecordMatcher_2010, CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher());

	    elements.put(DateRecognizer_2013, CrosswalkPackage.eINSTANCE.getDateRecognizer());

	    elements.put(Text_2014, CrosswalkPackage.eINSTANCE.getText());

	    elements.put(TrimWhitespace_2015, CrosswalkPackage.eINSTANCE.getTrimWhitespace());

	    elements.put(MappedElement_2016, CrosswalkPackage.eINSTANCE.getMappedElement());

	    elements.put(TabbedDataField_3001, CrosswalkPackage.eINSTANCE.getTabbedDataField());

	    elements.put(StringInput_3010, CrosswalkPackage.eINSTANCE.getStringInput());

	    elements.put(StringInput_3002, CrosswalkPackage.eINSTANCE.getStringInput());

	    elements.put(StringInput_3003, CrosswalkPackage.eINSTANCE.getStringInput());

	    elements.put(MappedElement_3015, CrosswalkPackage.eINSTANCE.getMappedElement());

	    elements.put(MappedAttribute_3016, CrosswalkPackage.eINSTANCE.getMappedAttribute());

	    elements.put(StringInput_3017, CrosswalkPackage.eINSTANCE.getStringInput());

	    elements.put(StringInputInput_4001, CrosswalkPackage.eINSTANCE.getStringInput_Input());

	    elements.put(DateInputInput_4002, CrosswalkPackage.eINSTANCE.getDateInput_Input());
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
	    KNOWN_ELEMENT_TYPES.add(CrossWalk_1000);
	    KNOWN_ELEMENT_TYPES.add(DelimitedFile_2001);
	    KNOWN_ELEMENT_TYPES.add(OriginalNameRecordMatcher_2010);
	    KNOWN_ELEMENT_TYPES.add(DateRecognizer_2013);
	    KNOWN_ELEMENT_TYPES.add(Text_2014);
	    KNOWN_ELEMENT_TYPES.add(TrimWhitespace_2015);
	    KNOWN_ELEMENT_TYPES.add(MappedElement_2016);
	    KNOWN_ELEMENT_TYPES.add(TabbedDataField_3001);
	    KNOWN_ELEMENT_TYPES.add(StringInput_3010);
	    KNOWN_ELEMENT_TYPES.add(StringInput_3002);
	    KNOWN_ELEMENT_TYPES.add(StringInput_3003);
	    KNOWN_ELEMENT_TYPES.add(MappedElement_3015);
	    KNOWN_ELEMENT_TYPES.add(MappedAttribute_3016);
	    KNOWN_ELEMENT_TYPES.add(StringInput_3017);
	    KNOWN_ELEMENT_TYPES.add(StringInputInput_4001);
	    KNOWN_ELEMENT_TYPES.add(DateInputInput_4002);
	}
	return KNOWN_ELEMENT_TYPES.contains(elementType);
    }

    /**
     * @generated
     */
    public static IElementType getElementType(int visualID) {
	switch (visualID) {
	case CrossWalkEditPart.VISUAL_ID:
	    return CrossWalk_1000;
	case DelimitedFileEditPart.VISUAL_ID:
	    return DelimitedFile_2001;
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return OriginalNameRecordMatcher_2010;
	case DateRecognizerEditPart.VISUAL_ID:
	    return DateRecognizer_2013;
	case TextEditPart.VISUAL_ID:
	    return Text_2014;
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return TrimWhitespace_2015;
	case MappedElementEditPart.VISUAL_ID:
	    return MappedElement_2016;
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return TabbedDataField_3001;
	case StringInput9EditPart.VISUAL_ID:
	    return StringInput_3010;
	case StringInputEditPart.VISUAL_ID:
	    return StringInput_3002;
	case StringInput2EditPart.VISUAL_ID:
	    return StringInput_3003;
	case MappedElement2EditPart.VISUAL_ID:
	    return MappedElement_3015;
	case MappedAttributeEditPart.VISUAL_ID:
	    return MappedAttribute_3016;
	case StringInput13EditPart.VISUAL_ID:
	    return StringInput_3017;
	case StringInputInputEditPart.VISUAL_ID:
	    return StringInputInput_4001;
	case DateInputInputEditPart.VISUAL_ID:
	    return DateInputInput_4002;
	}
	return null;
    }

}
