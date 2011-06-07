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
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import crosswalk.CrossWalk;
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
		if (parent instanceof CrossWalk) {
			CrossWalk cw = (CrossWalk) parent;
			mappedParentType = cw.getOutputType();
		} else if (parent instanceof MappedElement) {
			MappedElement pe = (MappedElement) parent;
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
		result.addAll(mappedParentType.getEAllReferences());
		return result;
	}

	/**
	 * @param el
	 * @return
	 */
	public static List<EStructuralFeature> getAttributes(EObject parent) {
		EClass mappedParentType = null;
		if (parent instanceof CrossWalk) {
			CrossWalk cw = (CrossWalk) parent;
			mappedParentType = cw.getOutputType();
		} else if (parent instanceof MappedElement) {
			MappedElement pe = (MappedElement) parent;
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
		result.addAll(mappedParentType.getEAllAttributes());
		return result;
	}

}
