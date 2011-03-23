/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl.util;

import edu.unc.lib.schemas.acl.AclPackage;

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
public class AclXMLProcessor extends XMLProcessor {

        /**
         * Public constructor to instantiate the helper.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AclXMLProcessor() {
                super((EPackage.Registry.INSTANCE));
                AclPackage.eINSTANCE.eClass();
        }
        
        /**
         * Register for "*" and "xml" file extensions the AclResourceFactoryImpl factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Map<String, Resource.Factory> getRegistrations() {
                if (registrations == null) {
                        super.getRegistrations();
                        registrations.put(XML_EXTENSION, new AclResourceFactoryImpl());
                        registrations.put(STAR_EXTENSION, new AclResourceFactoryImpl());
                }
                return registrations;
        }

} //AclXMLProcessor
