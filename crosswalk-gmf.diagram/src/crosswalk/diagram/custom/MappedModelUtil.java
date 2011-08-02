/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import crosswalk.CrossWalk;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;

/**
 * @author Gregory Jansen
 *
 */
public class MappedModelUtil {

	/**
	 * For the given mappable parent object, looks up the possible element children
	 *
	 * @param parent
	 *           a CrossWalk or MappedElement eObject
	 * @return a list of possible child reference types
	 */
	public static List<EStructuralFeature> getChildElementFeatures(EObject parent) {
		// LOG.debug("model parent:" + parent);
		EClass mappedParentType = null;
		List<MappedElement> elementsMappedAlready = new ArrayList<MappedElement>();
		if (parent instanceof CrossWalk) {
			CrossWalk cw = (CrossWalk) parent;
			elementsMappedAlready.addAll((Collection<? extends MappedElement>) cw.getElements());
			mappedParentType = cw.getOutputType();
		} else if (parent instanceof MappedElement) {
			MappedElement pe = (MappedElement) parent;
			elementsMappedAlready.addAll(pe.getChildElements());
			if (pe.getMappedFeature() != null) {
				mappedParentType = (EClass) pe.getMappedFeature().getEType();
			}
		} else {
			throw new IllegalArgumentException("Expecting a CrossWalk or MappedElement");
		}
		// LOG.debug("mappedParentType:" + mappedParentType);
		if (mappedParentType == null) {
			throw new Error("No feature was mapped on the given parent");
		}
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		//result.addAll(mappedParentType.getEAllReferences());
		// FIXME remove the elements that are already full
		for(EStructuralFeature a : mappedParentType.getEAllReferences().toArray(new EStructuralFeature[0])) {
			int count = 0;
			for(MappedElement m : elementsMappedAlready) {
				if(m.getMappedFeature().equals(a)) count++;
			}
			if(a.getUpperBound() < 0 || count < a.getUpperBound()) {
				result.add(a);
			}
		}
		return result;
	}

	/**
	 * @param el
	 * @return
	 */
	public static List<EStructuralFeature> getAttributes(EObject parent) {
		//System.out.println("get attributes for: "+parent);
		EClass mappedParentType = null;
		List<MappedAttribute> attsMappedAlready = new ArrayList<MappedAttribute>();
		if (parent instanceof CrossWalk) {
			CrossWalk cw = (CrossWalk) parent;
			mappedParentType = cw.getOutputType();
		} else if (parent instanceof MappedElement) {
			MappedElement pe = (MappedElement) parent;
			attsMappedAlready.addAll(pe.getAttributes());
			if (pe.getMappedFeature() != null) {
				mappedParentType = (EClass) pe.getMappedFeature().getEType();
			}
		} else {
			throw new IllegalArgumentException("Expecting a CrossWalk or MappedElement");
		}
		if (mappedParentType == null) {
			throw new Error("No feature was mapped on the given parent");
		}
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		// FIXME remove the elements that are already full
		for(EAttribute a : mappedParentType.getEAllAttributes().toArray(new EAttribute[0])) {
			int count = 0;
			for(MappedAttribute m : attsMappedAlready) {
				if(m.getMappedFeature().equals(a)) count++;
			}
			if(a.getUpperBound() < 0 || count < a.getUpperBound()) {
				result.add(a);
			}
		}
		return result;
	}

}
