/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.util;

import gov.loc.mods.mods.MODSPackage;

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
public class MODSXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MODSXMLProcessor() {
	super((EPackage.Registry.INSTANCE));
	MODSPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the MODSResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
	if (registrations == null) {
	    super.getRegistrations();
	    registrations.put(XML_EXTENSION, new MODSResourceFactoryImpl());
	    registrations.put(STAR_EXTENSION, new MODSResourceFactoryImpl());
	}
	return registrations;
    }

} //MODSXMLProcessor
