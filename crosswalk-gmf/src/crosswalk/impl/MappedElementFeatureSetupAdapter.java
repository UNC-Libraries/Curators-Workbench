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
package crosswalk.impl;

import gov.loc.mods.mods.MODSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.MappedAttribute;

/**
 * @author Gregory Jansen
 *
 */
public class MappedElementFeatureSetupAdapter extends AdapterImpl {

    @Override
    public boolean isAdapterForType(Object type) {
	return type == MappedElementFeatureSetupAdapter.class;
    }

    @Override
    public void notifyChanged(Notification msg) {
	System.out.println("Setup adapter notified by: " + msg.getNotifier());
	if (CrosswalkPackage.eINSTANCE.getMappedElement_MappedFeature() == msg.getFeature()) {
	    // change to the mapped feature, adjust mapped children as necessary
	    System.out.println("Changed the mapped feature to this: " + msg.getNewValue());
	    MappedElementImpl me = (MappedElementImpl) msg.getNotifier();
	    if (me.getMappedFeature() != null) {
		EClass type = me.getMappedFeature().getEReferenceType();
		if(MODSPackage.eINSTANCE.getDateBaseDefinition().isSuperTypeOf(type)) {
		    // this is a date!
		    EAttribute textAttr = me.getXMLTextAttributeInReferenceType();
		    mapEDateToStringAttribute(me, textAttr);
		} else { // detect a text value attribute
		    EAttribute textValue = me.getXMLTextAttributeInReferenceType();
		    if (textValue != null) {
			mapTextAttribute(me, textValue);
		    } else {
			System.out.println("No element value text attribute found.");
		    }
		}
	    }
	}
    }

    /**
     * @param me
     * @param textAttr
     */
    private void mapEDateToStringAttribute(MappedElementImpl me, EAttribute textAttr) {
	MappedAttribute mappedTextAttribute = me.getXMLTextMappedAttribute();
	if (mappedTextAttribute == null) {
	    mappedTextAttribute = CrosswalkFactory.eINSTANCE.createMappedAttribute();
	    mappedTextAttribute.setMappedFeature(textAttr);
	    me.getAttributes().add(mappedTextAttribute);
	}
	mappedTextAttribute.setConversionStrategy(CrosswalkFactory.eINSTANCE.createDateToISO8601StringConversion());
    }

    /**
     * @param me
     */
    private void mapTextAttribute(MappedElementImpl me, EAttribute textValue) {
	System.out.println("Adding the element text StringInput");
	MappedAttribute mappedTextAttribute = me.getXMLTextMappedAttribute();
	if (mappedTextAttribute == null) {
	    mappedTextAttribute = CrosswalkFactory.eINSTANCE.createMappedAttribute();
	    mappedTextAttribute.setMappedFeature(textValue);
	    me.getAttributes().add(mappedTextAttribute);
	}
	mappedTextAttribute.unsetConversionStrategy();
    }

}
