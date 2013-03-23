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
package crosswalk.diagram.custom;

import gov.loc.mods.mods.DateEncodingAttributeDefinition;
import gov.loc.mods.mods.MODSPackage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.ContextProvider;
import crosswalk.CrosswalkFactory;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MappingContainer;
import crosswalk.OutputElement;
import crosswalk.OutputProfile;
import crosswalk.impl.MappedElementImpl;

/**
 * @author Gregory Jansen
 * 
 */
public class MappedModelUtil {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory
			.getLogger(MappedModelUtil.class);

	/**
	 * For the given mappable parent object, looks up the possible element
	 * children
	 * 
	 * @param parent
	 *            a CrossWalk or MappedElement eObject
	 * @return a list of possible child reference types
	 */
	public static List<EStructuralFeature> getChildElementFeatures(
			EObject parent) {
		LOG.debug("model parent:" + parent);
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		List<EClass> mappedParentTypes = new ArrayList<EClass>();
		List<MappedElement> elementsMappedAlready = new ArrayList<MappedElement>();
		if (parent instanceof MappingContainer) {
			MappingContainer mapContainer = (MappingContainer) parent;
			for (OutputElement e : mapContainer.getElements()) {
				if (e instanceof MappedElement)
					elementsMappedAlready.add((MappedElement) e);
			}
			for (EObject next = parent; next != null; next = next.eContainer()) {
				if (next instanceof ContextProvider) {
					ContextProvider cp = (ContextProvider) next;
					if (!cp.getOutputProfiles().isEmpty()) {
						for (OutputProfile profile : cp.getOutputProfiles()) {
							if (profile.isStartMappingAtChildren()) {
								System.out
										.println("mapping child features from profile: "
												+ profile.getName());
								mappedParentTypes.add(profile
										.getParentMappedElement().eClass());
							} else {
								System.out
										.println("mapping parent feature from profile: "
												+ profile.getName());
								result.add(profile.getParentMappedElement()
										.eContainmentFeature());
							}
						}
						break;
					}
				}
			}
		} else if (parent instanceof MappedElement) {
			MappedElement pe = (MappedElement) parent;
			elementsMappedAlready.addAll(pe.getChildElements());
			if (pe.getMappedFeature() != null) {
				mappedParentTypes
						.add((EClass) pe.getMappedFeature().getEType());
			}
		} else {
			throw new IllegalArgumentException(
					"Expecting a CrossWalk or MappedElement");
		}
		if (mappedParentTypes != null) {
			// FIXME remove the elements that are already full
			for (EClass parentType : mappedParentTypes) {
				if (parentType.eIsProxy()) {
					parentType = (EClass) EcoreUtil.resolve(parentType, parent);
				}
				for (EStructuralFeature a : parentType.getEAllReferences()
						.toArray(new EStructuralFeature[0])) {
					System.err.println(a.getName());
					int count = 0;
					for (MappedElement m : elementsMappedAlready) {
						if (m.getMappedFeature() != null
								&& m.getMappedFeature().equals(a))
							count++;
					}
					if (a.getUpperBound() < 0 || count < a.getUpperBound()) {
						result.add(a);
					}
				}
			}
		}
		return result;
	}

	/**
	 * @param el
	 * @return
	 */
	public static List<EStructuralFeature> getAttributes(EObject parent) {
		// System.out.println("get attributes for: "+parent);
		EClass mappedParentType = null;
		List<MappedAttribute> attsMappedAlready = new ArrayList<MappedAttribute>();
		// if (parent instanceof CrossWalk) {
		// CrossWalk cw = (CrossWalk) parent;
		// mappedParentType = cw.getOutputType();
		// } else if (parent instanceof MappedElement) {
		MappedElement pe = (MappedElement) parent;
		attsMappedAlready.addAll(pe.getAttributes());
		if (pe.getMappedFeature() != null) {
			mappedParentType = (EClass) pe.getMappedFeature().getEType();
		}
		// } else {
		// throw new IllegalArgumentException(
		// "Expecting a CrossWalk or MappedElement");
		// }
		if (mappedParentType == null) {
			throw new Error("No feature was mapped on the given parent");
		}
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();

		// FIXME remove the elements that are already full
		for (EAttribute a : mappedParentType.getEAllAttributes().toArray(
				new EAttribute[0])) {

			// Filter out feature map attributes which are not named "mixed"
			// (for example, the "any" feature map).

			if (EcoreUtil.equals(a.getEAttributeType(),
					EcorePackage.eINSTANCE.getEFeatureMapEntry())
					&& !a.getName().equals("mixed")) {
				continue;
			}

			int count = 0;
			for (MappedAttribute m : attsMappedAlready) {
				if (m.getMappedFeature().equals(a))
					count++;
			}
			if (a.getUpperBound() < 0 || count < a.getUpperBound()) {
				result.add(a);
			}
		}
		return result;
	}

	/**
	 * @param me
	 */
	public static void setMODSDateEncodingAttribute(MappedElementImpl me) {
		MappedAttribute encodingAttr = null;
		for (MappedAttribute ma : me.getAttributes()) {
			if (MODSPackage.eINSTANCE.getDateBaseDefinition_Encoding().equals(
					ma.getMappedFeature())) {
				encodingAttr = ma;
				break;
			}
		}
		if (encodingAttr == null) {
			encodingAttr = CrosswalkFactory.eINSTANCE.createMappedAttribute();
			encodingAttr.setMappedFeature(MODSPackage.eINSTANCE
					.getDateBaseDefinition_Encoding());
			me.getAttributes().add(encodingAttr);
		}
		encodingAttr.setDefaultValue(DateEncodingAttributeDefinition.ISO8601
				.getLiteral());
	}

	/**
	 * @param me
	 * @param textAttr
	 */
	public static void setEDateToStringConversionStrategyAttribute(
			MappedElementImpl me, EAttribute textAttr) {
		MappedAttribute mappedTextAttribute = getXMLTextMappedAttribute(me);
		if (mappedTextAttribute == null) {
			mappedTextAttribute = CrosswalkFactory.eINSTANCE
					.createMappedAttribute();
			mappedTextAttribute.setMappedFeature(textAttr);
			me.getAttributes().add(mappedTextAttribute);
		}
		mappedTextAttribute.setConversionStrategy(CrosswalkFactory.eINSTANCE
				.createDateToISO8601StringConversion());
	}

	public static EAttribute getXMLTextAttributeInReferenceType(MappedElement me) {
		EAttribute result = null;
		// TODO check for annotation <eAnnotations
		// source="http:///org/eclipse/emf/ecore/util/ExtendedMetaData">
		// <details key="name" value=":0"/>
		// find the value attribute of type String with Annotation kind=simple
		for (EAttribute a : me.getMappedFeature().getEReferenceType()
				.getEAllAttributes()) {
			if (MappedModelUtil.isXMLTextValueEAttribute(a)) {
				return a;
			}
		}
		return result;
	}

	/**
	 * @param me
	 */
	public static void setTextAttribute(MappedElementImpl me,
			EAttribute textValue) {
		MappedAttribute mappedTextAttribute = getXMLTextMappedAttribute(me);
		if (mappedTextAttribute == null) {
			mappedTextAttribute = CrosswalkFactory.eINSTANCE
					.createMappedAttribute();
			mappedTextAttribute.setMappedFeature(textValue);
			me.getAttributes().add(mappedTextAttribute);
		}
		mappedTextAttribute.unsetConversionStrategy();
	}

	public static boolean isXMLTextValueEAttribute(EAttribute att) {
		boolean result = false;
		if (att != null) {
			if ("value".equals(att.getName())) {
				System.out.println("found an attribute named value: " + att);
				EAnnotation note = att
						.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
				if (note != null && note.getDetails() != null) {
					System.out.println("found value attribute details: "
							+ note.getDetails());
					if (note.getDetails().get("name") != null
							&& ":0".equals(note.getDetails().get("name"))) {
						System.out.println("attribute name details match");
						if (note.getDetails().get("kind") != null
								&& "simple".equals(note.getDetails()
										.get("kind"))) {
							System.out.println("attribute kind details match");
							return true;
						}
					}
				}
			}
		}
		return result;
	}

	public static MappedAttribute getXMLTextMappedAttribute(MappedElement me) {
		MappedAttribute result = null;
		for (MappedAttribute ma : me.getAttributes()) {
			if (isXMLTextValueEAttribute(ma.getMappedFeature())) {
				return ma;
			}
		}
		return result;
	}

}
