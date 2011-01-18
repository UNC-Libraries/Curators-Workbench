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
