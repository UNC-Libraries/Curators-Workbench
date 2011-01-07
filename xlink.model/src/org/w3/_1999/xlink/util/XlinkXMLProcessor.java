/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3._1999.xlink.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.w3._1999.xlink.XlinkPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XlinkXMLProcessor extends XMLProcessor {

        /**
         * Public constructor to instantiate the helper.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public XlinkXMLProcessor() {
                super((EPackage.Registry.INSTANCE));
                XlinkPackage.eINSTANCE.eClass();
        }
        
        /**
         * Register for "*" and "xml" file extensions the XlinkResourceFactoryImpl factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Map<String, Resource.Factory> getRegistrations() {
                if (registrations == null) {
                        super.getRegistrations();
                        registrations.put(XML_EXTENSION, new XlinkResourceFactoryImpl());
                        registrations.put(STAR_EXTENSION, new XlinkResourceFactoryImpl());
                }
                return registrations;
        }

} //XlinkXMLProcessor
