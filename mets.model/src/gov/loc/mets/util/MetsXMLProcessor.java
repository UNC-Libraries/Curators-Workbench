/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.util;

import gov.loc.mets.MetsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetsXMLProcessor extends XMLProcessor {

        /**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MetsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MetsPackage.eINSTANCE.eClass();
	}
        
        /**
	 * Register for "*" and "xml" file extensions the MetsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MetsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MetsResourceFactoryImpl());
		}
		return registrations;
	}

} //MetsXMLProcessor
