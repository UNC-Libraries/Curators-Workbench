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
package org.w3._1999.xlink;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getRole <em>Role</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getShow <em>Show</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xlink.DocumentRoot#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
        /**
         * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
         * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mixed</em>' attribute list.
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Mixed()
         * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
         *        extendedMetaData="kind='elementWildcard' name=':mixed'"
         * @generated
         */
        FeatureMap getMixed();

        /**
         * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
         * The key is of type {@link java.lang.String},
         * and the value is of type {@link java.lang.String},
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>XMLNS Prefix Map</em>' map.
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_XMLNSPrefixMap()
         * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
         *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
         * @generated
         */
        EMap<String, String> getXMLNSPrefixMap();

        /**
         * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
         * The key is of type {@link java.lang.String},
         * and the value is of type {@link java.lang.String},
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>XSI Schema Location</em>' map.
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_XSISchemaLocation()
         * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
         *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
         * @generated
         */
        EMap<String, String> getXSISchemaLocation();

        /**
         * Returns the value of the '<em><b>Actuate</b></em>' attribute.
         * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Actuate</em>' attribute.
         * @see org.w3._1999.xlink.ActuateType
         * @see #isSetActuate()
         * @see #unsetActuate()
         * @see #setActuate(ActuateType)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Actuate()
         * @model unsettable="true"
         *        extendedMetaData="kind='attribute' name='actuate' namespace='##targetNamespace'"
         * @generated
         */
        ActuateType getActuate();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getActuate <em>Actuate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Actuate</em>' attribute.
         * @see org.w3._1999.xlink.ActuateType
         * @see #isSetActuate()
         * @see #unsetActuate()
         * @see #getActuate()
         * @generated
         */
        void setActuate(ActuateType value);

        /**
         * Unsets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getActuate <em>Actuate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetActuate()
         * @see #getActuate()
         * @see #setActuate(ActuateType)
         * @generated
         */
        void unsetActuate();

        /**
         * Returns whether the value of the '{@link org.w3._1999.xlink.DocumentRoot#getActuate <em>Actuate</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Actuate</em>' attribute is set.
         * @see #unsetActuate()
         * @see #getActuate()
         * @see #setActuate(ActuateType)
         * @generated
         */
        boolean isSetActuate();

        /**
         * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Arcrole</em>' attribute.
         * @see #setArcrole(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Arcrole()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='arcrole' namespace='##targetNamespace'"
         * @generated
         */
        String getArcrole();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getArcrole <em>Arcrole</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Arcrole</em>' attribute.
         * @see #getArcrole()
         * @generated
         */
        void setArcrole(String value);

        /**
         * Returns the value of the '<em><b>From</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>From</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>From</em>' attribute.
         * @see #setFrom(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_From()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='from' namespace='##targetNamespace'"
         * @generated
         */
        String getFrom();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getFrom <em>From</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>From</em>' attribute.
         * @see #getFrom()
         * @generated
         */
        void setFrom(String value);

        /**
         * Returns the value of the '<em><b>Href</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Href</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Href</em>' attribute.
         * @see #setHref(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Href()
         * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
         *        extendedMetaData="kind='attribute' name='href' namespace='##targetNamespace'"
         * @generated
         */
        String getHref();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getHref <em>Href</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Href</em>' attribute.
         * @see #getHref()
         * @generated
         */
        void setHref(String value);

        /**
         * Returns the value of the '<em><b>Label</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Label</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Label</em>' attribute.
         * @see #setLabel(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Label()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
         * @generated
         */
        String getLabel();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getLabel <em>Label</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Label</em>' attribute.
         * @see #getLabel()
         * @generated
         */
        void setLabel(String value);

        /**
         * Returns the value of the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Role</em>' attribute.
         * @see #setRole(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Role()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='role' namespace='##targetNamespace'"
         * @generated
         */
        String getRole();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getRole <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Role</em>' attribute.
         * @see #getRole()
         * @generated
         */
        void setRole(String value);

        /**
         * Returns the value of the '<em><b>Show</b></em>' attribute.
         * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Show</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Show</em>' attribute.
         * @see org.w3._1999.xlink.ShowType
         * @see #isSetShow()
         * @see #unsetShow()
         * @see #setShow(ShowType)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Show()
         * @model unsettable="true"
         *        extendedMetaData="kind='attribute' name='show' namespace='##targetNamespace'"
         * @generated
         */
        ShowType getShow();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getShow <em>Show</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Show</em>' attribute.
         * @see org.w3._1999.xlink.ShowType
         * @see #isSetShow()
         * @see #unsetShow()
         * @see #getShow()
         * @generated
         */
        void setShow(ShowType value);

        /**
         * Unsets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getShow <em>Show</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetShow()
         * @see #getShow()
         * @see #setShow(ShowType)
         * @generated
         */
        void unsetShow();

        /**
         * Returns whether the value of the '{@link org.w3._1999.xlink.DocumentRoot#getShow <em>Show</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Show</em>' attribute is set.
         * @see #unsetShow()
         * @see #getShow()
         * @see #setShow(ShowType)
         * @generated
         */
        boolean isSetShow();

        /**
         * Returns the value of the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Title</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Title</em>' attribute.
         * @see #setTitle(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_Title()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
         * @generated
         */
        String getTitle();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getTitle <em>Title</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Title</em>' attribute.
         * @see #getTitle()
         * @generated
         */
        void setTitle(String value);

        /**
         * Returns the value of the '<em><b>To</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>To</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>To</em>' attribute.
         * @see #setTo(String)
         * @see org.w3._1999.xlink.XlinkPackage#getDocumentRoot_To()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='to' namespace='##targetNamespace'"
         * @generated
         */
        String getTo();

        /**
         * Sets the value of the '{@link org.w3._1999.xlink.DocumentRoot#getTo <em>To</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>To</em>' attribute.
         * @see #getTo()
         * @generated
         */
        void setTo(String value);

} // DocumentRoot
