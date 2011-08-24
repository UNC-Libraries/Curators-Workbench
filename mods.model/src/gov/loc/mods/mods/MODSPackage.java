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
package gov.loc.mods.mods;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     id   (as an attribute name): denotes an attribute whose value
 *          should be interpreted as if declared to be of type ID.
 *          The xml:id specification is not yet a W3C Recommendation,
 *          but this attribute is included here to facilitate experimentation
 *          with the mechanisms it proposes.  Note that it is _not_ included
 *          in the specialAttrs attribute group.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang, xml:space or xml:id
 *         attributes on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         &lt;schema . . .&gt;
 *          . . .
 *          &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         &lt;type . . .&gt;
 *          . . .
 *          &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2005/08/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself, or with the XML namespace itself.  In other words, if the XML
 *    Schema or XML namespaces change, the version of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2005/08/xml.xsd will not change.
 *   
 * <!-- end-model-doc -->
 * @see gov.loc.mods.mods.MODSFactory
 * @model kind="package"
 * @generated
 */
public interface MODSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mods";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.loc.gov/mods/v3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mods";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MODSPackage eINSTANCE = gov.loc.mods.mods.impl.MODSPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.XsStringImpl <em>Xs String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.XsStringImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getXsString()
	 * @generated
	 */
	int XS_STRING = 56;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XS_STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XS_STRING__LANG = 1;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XS_STRING__LANG1 = 2;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XS_STRING__SCRIPT = 3;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XS_STRING__TRANSLITERATION = 4;

	/**
	 * The number of structural features of the '<em>Xs String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XS_STRING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl <em>Unstructured Text Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUnstructuredTextDefinition()
	 * @generated
	 */
	int UNSTRUCTURED_TEXT_DEFINITION = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__ACTUATE = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__ARCROLE = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__HREF = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__ROLE = XS_STRING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__SHOW = XS_STRING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__TITLE = XS_STRING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__TYPE = XS_STRING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION__TYPE1 = XS_STRING_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Unstructured Text Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.AbstractDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getAbstractDefinition()
	 * @generated
	 */
	int ABSTRACT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__VALUE = UNSTRUCTURED_TEXT_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__LANG = UNSTRUCTURED_TEXT_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__LANG1 = UNSTRUCTURED_TEXT_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__SCRIPT = UNSTRUCTURED_TEXT_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__TRANSLITERATION = UNSTRUCTURED_TEXT_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__ACTUATE = UNSTRUCTURED_TEXT_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__ARCROLE = UNSTRUCTURED_TEXT_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__DISPLAY_LABEL = UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__HREF = UNSTRUCTURED_TEXT_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__ROLE = UNSTRUCTURED_TEXT_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__SHOW = UNSTRUCTURED_TEXT_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__TITLE = UNSTRUCTURED_TEXT_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__TYPE = UNSTRUCTURED_TEXT_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__TYPE1 = UNSTRUCTURED_TEXT_DEFINITION__TYPE1;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__ALT_REP_GROUP = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION__SHAREABLE = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEFINITION_FEATURE_COUNT = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.ExtensionDefinitionImpl <em>Extension Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.ExtensionDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getExtensionDefinition()
	 * @generated
	 */
	int EXTENSION_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__DISPLAY_LABEL = 2;

	/**
	 * The number of structural features of the '<em>Extension Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl <em>Access Condition Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.AccessConditionDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getAccessConditionDefinition()
	 * @generated
	 */
	int ACCESS_CONDITION_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__MIXED = EXTENSION_DEFINITION__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__ANY = EXTENSION_DEFINITION__ANY;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__DISPLAY_LABEL = EXTENSION_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__ACTUATE = EXTENSION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP = EXTENSION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__ARCROLE = EXTENSION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__HREF = EXTENSION_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__LANG = EXTENSION_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__LANG1 = EXTENSION_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__ROLE = EXTENSION_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__SCRIPT = EXTENSION_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__SHOW = EXTENSION_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__TITLE = EXTENSION_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__TRANSLITERATION = EXTENSION_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__TYPE = EXTENSION_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION__TYPE1 = EXTENSION_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Access Condition Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_DEFINITION_FEATURE_COUNT = EXTENSION_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl <em>Cartographics Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.CartographicsDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getCartographicsDefinition()
	 * @generated
	 */
	int CARTOGRAPHICS_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION__SCALE = 0;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION__PROJECTION = 1;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION__COORDINATES = 2;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION__AUTHORITY = 3;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION__AUTHORITY_URI = 4;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION__VALUE_URI = 5;

	/**
	 * The number of structural features of the '<em>Cartographics Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHICS_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.StringPlusAuthorityImpl <em>String Plus Authority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.StringPlusAuthorityImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getStringPlusAuthority()
	 * @generated
	 */
	int STRING_PLUS_AUTHORITY = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__AUTHORITY = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__AUTHORITY_URI = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY__VALUE_URI = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Plus Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.ClassificationDefinitionImpl <em>Classification Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.ClassificationDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getClassificationDefinition()
	 * @generated
	 */
	int CLASSIFICATION_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__VALUE = STRING_PLUS_AUTHORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__LANG = STRING_PLUS_AUTHORITY__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__LANG1 = STRING_PLUS_AUTHORITY__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__SCRIPT = STRING_PLUS_AUTHORITY__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__TRANSLITERATION = STRING_PLUS_AUTHORITY__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__AUTHORITY = STRING_PLUS_AUTHORITY__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__AUTHORITY_URI = STRING_PLUS_AUTHORITY__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__VALUE_URI = STRING_PLUS_AUTHORITY__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__ALT_REP_GROUP = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__DISPLAY_LABEL = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__EDITION = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION__USAGE = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_DEFINITION_FEATURE_COUNT = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl <em>Copy Information Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.CopyInformationDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getCopyInformationDefinition()
	 * @generated
	 */
	int COPY_INFORMATION_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION__FORM = 0;

	/**
	 * The feature id for the '<em><b>Sub Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION__SUB_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Shelf Locator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION__SHELF_LOCATOR = 2;

	/**
	 * The feature id for the '<em><b>Electronic Locator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION__NOTE = 4;

	/**
	 * The feature id for the '<em><b>Enumeration And Chronology</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY = 5;

	/**
	 * The number of structural features of the '<em>Copy Information Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INFORMATION_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.DateBaseDefinitionImpl <em>Date Base Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.DateBaseDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateBaseDefinition()
	 * @generated
	 */
	int DATE_BASE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__ENCODING = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__POINT = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION__QUALIFIER = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Date Base Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.DateDefinitionImpl <em>Date Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.DateDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateDefinition()
	 * @generated
	 */
	int DATE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__VALUE = DATE_BASE_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__LANG = DATE_BASE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__LANG1 = DATE_BASE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__SCRIPT = DATE_BASE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__TRANSLITERATION = DATE_BASE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__ENCODING = DATE_BASE_DEFINITION__ENCODING;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__POINT = DATE_BASE_DEFINITION__POINT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__QUALIFIER = DATE_BASE_DEFINITION__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Key Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION__KEY_DATE = DATE_BASE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DEFINITION_FEATURE_COUNT = DATE_BASE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.DateOtherDefinitionImpl <em>Date Other Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.DateOtherDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateOtherDefinition()
	 * @generated
	 */
	int DATE_OTHER_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__VALUE = DATE_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__LANG = DATE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__LANG1 = DATE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__SCRIPT = DATE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__TRANSLITERATION = DATE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__ENCODING = DATE_DEFINITION__ENCODING;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__POINT = DATE_DEFINITION__POINT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__QUALIFIER = DATE_DEFINITION__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Key Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__KEY_DATE = DATE_DEFINITION__KEY_DATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION__TYPE = DATE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Other Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OTHER_DEFINITION_FEATURE_COUNT = DATE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.DetailDefinitionImpl <em>Detail Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.DetailDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDetailDefinition()
	 * @generated
	 */
	int DETAIL_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION__CAPTION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION__LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Detail Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.DocumentRootImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESS_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AFFILIATION = 5;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AREA = 6;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION = 7;

	/**
	 * The feature id for the '<em><b>Cartographics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CARTOGRAPHICS = 8;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY = 9;

	/**
	 * The feature id for the '<em><b>City Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Continent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTINENT = 12;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COORDINATES = 13;

	/**
	 * The feature id for the '<em><b>Copy Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPY_INFORMATION = 14;

	/**
	 * The feature id for the '<em><b>Copyright Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COPYRIGHT_DATE = 15;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 16;

	/**
	 * The feature id for the '<em><b>County</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTY = 17;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE = 18;

	/**
	 * The feature id for the '<em><b>Date Captured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_CAPTURED = 19;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_CREATED = 20;

	/**
	 * The feature id for the '<em><b>Date Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_ISSUED = 21;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_MODIFIED = 22;

	/**
	 * The feature id for the '<em><b>Date Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_OTHER = 23;

	/**
	 * The feature id for the '<em><b>Date Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_VALID = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 25;

	/**
	 * The feature id for the '<em><b>Description Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION_STANDARD = 26;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETAIL = 27;

	/**
	 * The feature id for the '<em><b>Digital Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIGITAL_ORIGIN = 28;

	/**
	 * The feature id for the '<em><b>Display Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_FORM = 29;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDITION = 30;

	/**
	 * The feature id for the '<em><b>Electronic Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELECTRONIC_LOCATOR = 31;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 32;

	/**
	 * The feature id for the '<em><b>Enumeration And Chronology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENUMERATION_AND_CHRONOLOGY = 33;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION = 34;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENT = 35;

	/**
	 * The feature id for the '<em><b>Extraterrestrial Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRATERRESTRIAL_AREA = 36;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORM = 37;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FREQUENCY = 38;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENRE = 39;

	/**
	 * The feature id for the '<em><b>Geographic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GEOGRAPHIC = 40;

	/**
	 * The feature id for the '<em><b>Geographic Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GEOGRAPHIC_CODE = 41;

	/**
	 * The feature id for the '<em><b>Hierarchical Geographic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIERARCHICAL_GEOGRAPHIC = 42;

	/**
	 * The feature id for the '<em><b>Holding External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOLDING_EXTERNAL = 43;

	/**
	 * The feature id for the '<em><b>Holding Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOLDING_SIMPLE = 44;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 45;

	/**
	 * The feature id for the '<em><b>Internet Media Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERNET_MEDIA_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Island</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISLAND = 47;

	/**
	 * The feature id for the '<em><b>Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSUANCE = 48;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 49;

	/**
	 * The feature id for the '<em><b>Language Of Cataloging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE_OF_CATALOGING = 50;

	/**
	 * The feature id for the '<em><b>Language Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE_TERM = 51;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST = 52;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 53;

	/**
	 * The feature id for the '<em><b>Mods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODS = 54;

	/**
	 * The feature id for the '<em><b>Mods Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODS_COLLECTION = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 56;

	/**
	 * The feature id for the '<em><b>Name Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME_PART = 57;

	/**
	 * The feature id for the '<em><b>Non Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NON_SORT = 58;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTE = 59;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER = 60;

	/**
	 * The feature id for the '<em><b>Occupation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OCCUPATION = 61;

	/**
	 * The feature id for the '<em><b>Origin Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGIN_INFO = 62;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PART = 63;

	/**
	 * The feature id for the '<em><b>Part Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PART_NAME = 64;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PART_NUMBER = 65;

	/**
	 * The feature id for the '<em><b>Physical Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHYSICAL_DESCRIPTION = 66;

	/**
	 * The feature id for the '<em><b>Physical Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHYSICAL_LOCATION = 67;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACE = 68;

	/**
	 * The feature id for the '<em><b>Place Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACE_TERM = 69;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECTION = 70;

	/**
	 * The feature id for the '<em><b>Province</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROVINCE = 71;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER = 72;

	/**
	 * The feature id for the '<em><b>Record Change Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_CHANGE_DATE = 73;

	/**
	 * The feature id for the '<em><b>Record Content Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_CONTENT_SOURCE = 74;

	/**
	 * The feature id for the '<em><b>Record Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_CREATION_DATE = 75;

	/**
	 * The feature id for the '<em><b>Record Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_IDENTIFIER = 76;

	/**
	 * The feature id for the '<em><b>Record Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_INFO = 77;

	/**
	 * The feature id for the '<em><b>Record Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_ORIGIN = 78;

	/**
	 * The feature id for the '<em><b>Reformatting Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFORMATTING_QUALITY = 79;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION = 80;

	/**
	 * The feature id for the '<em><b>Related Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATED_ITEM = 81;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE = 82;

	/**
	 * The feature id for the '<em><b>Role Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_TERM = 83;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE = 84;

	/**
	 * The feature id for the '<em><b>Script Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT_TERM = 85;

	/**
	 * The feature id for the '<em><b>Shelf Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHELF_LOCATOR = 86;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START = 87;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATE = 88;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBJECT = 89;

	/**
	 * The feature id for the '<em><b>Sub Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_LOCATION = 90;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_TITLE = 91;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_OF_CONTENTS = 92;

	/**
	 * The feature id for the '<em><b>Target Audience</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_AUDIENCE = 93;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL = 94;

	/**
	 * The feature id for the '<em><b>Territory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TERRITORY = 95;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = 96;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 97;

	/**
	 * The feature id for the '<em><b>Title Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE_INFO = 98;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOPIC = 99;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL = 100;

	/**
	 * The feature id for the '<em><b>Type Of Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_OF_RESOURCE = 101;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URL = 102;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 103;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.EnumerationAndChronologyDefinitionImpl <em>Enumeration And Chronology Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.EnumerationAndChronologyDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getEnumerationAndChronologyDefinition()
	 * @generated
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration And Chronology Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_AND_CHRONOLOGY_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.ExtentDefinitionImpl <em>Extent Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.ExtentDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getExtentDefinition()
	 * @generated
	 */
	int EXTENT_DEFINITION = 12;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_DEFINITION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_DEFINITION__END = 1;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_DEFINITION__TOTAL = 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_DEFINITION__LIST = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_DEFINITION__UNIT = 4;

	/**
	 * The number of structural features of the '<em>Extent Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypeImpl <em>String Plus Authority Plus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypeImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getStringPlusAuthorityPlusType()
	 * @generated
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__VALUE = STRING_PLUS_AUTHORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__LANG = STRING_PLUS_AUTHORITY__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__LANG1 = STRING_PLUS_AUTHORITY__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__SCRIPT = STRING_PLUS_AUTHORITY__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__TRANSLITERATION = STRING_PLUS_AUTHORITY__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__AUTHORITY = STRING_PLUS_AUTHORITY__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__AUTHORITY_URI = STRING_PLUS_AUTHORITY__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__VALUE_URI = STRING_PLUS_AUTHORITY__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE__TYPE = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Plus Authority Plus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_FEATURE_COUNT = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypePlusDisplayLabelImpl <em>String Plus Authority Plus Type Plus Display Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypePlusDisplayLabelImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getStringPlusAuthorityPlusTypePlusDisplayLabel()
	 * @generated
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__VALUE = STRING_PLUS_AUTHORITY_PLUS_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__LANG = STRING_PLUS_AUTHORITY_PLUS_TYPE__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__LANG1 = STRING_PLUS_AUTHORITY_PLUS_TYPE__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__SCRIPT = STRING_PLUS_AUTHORITY_PLUS_TYPE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__TRANSLITERATION = STRING_PLUS_AUTHORITY_PLUS_TYPE__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__AUTHORITY = STRING_PLUS_AUTHORITY_PLUS_TYPE__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__AUTHORITY_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__VALUE_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__TYPE = STRING_PLUS_AUTHORITY_PLUS_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL = STRING_PLUS_AUTHORITY_PLUS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Plus Authority Plus Type Plus Display Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT = STRING_PLUS_AUTHORITY_PLUS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.GenreDefinitionImpl <em>Genre Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.GenreDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getGenreDefinition()
	 * @generated
	 */
	int GENRE_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__VALUE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__LANG = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__LANG1 = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__SCRIPT = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__TRANSLITERATION = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__AUTHORITY = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__AUTHORITY_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__VALUE_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__TYPE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__TYPE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__DISPLAY_LABEL = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__ALT_REP_GROUP = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION__USAGE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Genre Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_DEFINITION_FEATURE_COUNT = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.GeographicCodeDefinitionImpl <em>Geographic Code Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.GeographicCodeDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getGeographicCodeDefinition()
	 * @generated
	 */
	int GEOGRAPHIC_CODE_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__AUTHORITY = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__AUTHORITY_URI = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION__VALUE_URI = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Geographic Code Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_CODE_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl <em>Hierarchical Geographic Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getHierarchicalGeographicDefinition()
	 * @generated
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Extraterrestrial Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__EXTRATERRESTRIAL_AREA = 1;

	/**
	 * The feature id for the '<em><b>Continent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__CONTINENT = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Province</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__PROVINCE = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__REGION = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__STATE = 6;

	/**
	 * The feature id for the '<em><b>Territory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__TERRITORY = 7;

	/**
	 * The feature id for the '<em><b>County</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTY = 8;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY = 9;

	/**
	 * The feature id for the '<em><b>City Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Island</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__ISLAND = 11;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__AREA = 12;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY = 13;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI = 14;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI = 15;

	/**
	 * The number of structural features of the '<em>Hierarchical Geographic Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GEOGRAPHIC_DEFINITION_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.HoldingSimpleDefinitionImpl <em>Holding Simple Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.HoldingSimpleDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getHoldingSimpleDefinition()
	 * @generated
	 */
	int HOLDING_SIMPLE_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Copy Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Holding Simple Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDING_SIMPLE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.IdentifierDefinitionImpl <em>Identifier Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.IdentifierDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getIdentifierDefinition()
	 * @generated
	 */
	int IDENTIFIER_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__ALT_REP_GROUP = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__DISPLAY_LABEL = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__INVALID = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION__TYPE = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Identifier Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl <em>Language Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.LanguageDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getLanguageDefinition()
	 * @generated
	 */
	int LANGUAGE_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Language Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__LANGUAGE_TERM = 0;

	/**
	 * The feature id for the '<em><b>Script Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__SCRIPT_TERM = 1;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__ALT_REP_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__DISPLAY_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__LANG = 4;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__LANG1 = 5;

	/**
	 * The feature id for the '<em><b>Object Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__OBJECT_PART = 6;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__SCRIPT = 7;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__TRANSLITERATION = 8;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION__USAGE = 9;

	/**
	 * The number of structural features of the '<em>Language Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_DEFINITION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.LanguageTermDefinitionImpl <em>Language Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.LanguageTermDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getLanguageTermDefinition()
	 * @generated
	 */
	int LANGUAGE_TERM_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__AUTHORITY = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__AUTHORITY_URI = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__TYPE = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION__VALUE_URI = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Language Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TERM_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.LocationDefinitionImpl <em>Location Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.LocationDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getLocationDefinition()
	 * @generated
	 */
	int LOCATION_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Physical Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__PHYSICAL_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Shelf Locator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__SHELF_LOCATOR = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__URL = 2;

	/**
	 * The feature id for the '<em><b>Holding Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__HOLDING_SIMPLE = 3;

	/**
	 * The feature id for the '<em><b>Holding External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__HOLDING_EXTERNAL = 4;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__ALT_REP_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__DISPLAY_LABEL = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__LANG = 7;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__LANG1 = 8;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__SCRIPT = 9;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__TRANSLITERATION = 10;

	/**
	 * The number of structural features of the '<em>Location Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.ModsCollectionDefinitionImpl <em>Mods Collection Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.ModsCollectionDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getModsCollectionDefinition()
	 * @generated
	 */
	int MODS_COLLECTION_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Mods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_COLLECTION_DEFINITION__MODS = 0;

	/**
	 * The number of structural features of the '<em>Mods Collection Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_COLLECTION_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.ModsDefinitionImpl <em>Mods Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.ModsDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getModsDefinition()
	 * @generated
	 */
	int MODS_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Mods Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__MODS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__ACCESS_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__GENRE = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__NAME = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__NOTE = 10;

	/**
	 * The feature id for the '<em><b>Origin Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__ORIGIN_INFO = 11;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__PART = 12;

	/**
	 * The feature id for the '<em><b>Physical Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__PHYSICAL_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Record Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__RECORD_INFO = 14;

	/**
	 * The feature id for the '<em><b>Related Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__RELATED_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__SUBJECT = 16;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__TABLE_OF_CONTENTS = 17;

	/**
	 * The feature id for the '<em><b>Target Audience</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__TARGET_AUDIENCE = 18;

	/**
	 * The feature id for the '<em><b>Title Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__TITLE_INFO = 19;

	/**
	 * The feature id for the '<em><b>Type Of Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__TYPE_OF_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__ID = 21;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION__VERSION = 22;

	/**
	 * The number of structural features of the '<em>Mods Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODS_DEFINITION_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.NameBaseDefinitionImpl <em>Name Base Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.NameBaseDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNameBaseDefinition()
	 * @generated
	 */
	int NAME_BASE_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__NAME_PART = 1;

	/**
	 * The feature id for the '<em><b>Display Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__DISPLAY_FORM = 2;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__AFFILIATION = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__ACTUATE = 6;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__ARCROLE = 7;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__AUTHORITY = 8;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__AUTHORITY_URI = 9;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__DISPLAY_LABEL = 10;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__HREF = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__ID = 12;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__LANG = 13;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__LANG1 = 14;

	/**
	 * The feature id for the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__ROLE1 = 15;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__SCRIPT = 16;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__SHOW = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__TITLE = 18;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__TRANSLITERATION = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__TYPE = 20;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__TYPE1 = 21;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION__VALUE_URI = 22;

	/**
	 * The number of structural features of the '<em>Name Base Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_DEFINITION_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.NameDefinitionImpl <em>Name Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.NameDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNameDefinition()
	 * @generated
	 */
	int NAME_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__GROUP = NAME_BASE_DEFINITION__GROUP;

	/**
	 * The feature id for the '<em><b>Name Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__NAME_PART = NAME_BASE_DEFINITION__NAME_PART;

	/**
	 * The feature id for the '<em><b>Display Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__DISPLAY_FORM = NAME_BASE_DEFINITION__DISPLAY_FORM;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__AFFILIATION = NAME_BASE_DEFINITION__AFFILIATION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__ROLE = NAME_BASE_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__DESCRIPTION = NAME_BASE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__ACTUATE = NAME_BASE_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__ARCROLE = NAME_BASE_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__AUTHORITY = NAME_BASE_DEFINITION__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__AUTHORITY_URI = NAME_BASE_DEFINITION__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__DISPLAY_LABEL = NAME_BASE_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__HREF = NAME_BASE_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__ID = NAME_BASE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__LANG = NAME_BASE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__LANG1 = NAME_BASE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__ROLE1 = NAME_BASE_DEFINITION__ROLE1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__SCRIPT = NAME_BASE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__SHOW = NAME_BASE_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__TITLE = NAME_BASE_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__TRANSLITERATION = NAME_BASE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__TYPE = NAME_BASE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__TYPE1 = NAME_BASE_DEFINITION__TYPE1;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__VALUE_URI = NAME_BASE_DEFINITION__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__ALT_REP_GROUP = NAME_BASE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Title Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__NAME_TITLE_GROUP = NAME_BASE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION__USAGE = NAME_BASE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DEFINITION_FEATURE_COUNT = NAME_BASE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.NamePartDefinitionImpl <em>Name Part Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.NamePartDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNamePartDefinition()
	 * @generated
	 */
	int NAME_PART_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION__TYPE = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Part Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PART_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.NoteBaseDefinitionImpl <em>Note Base Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.NoteBaseDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNoteBaseDefinition()
	 * @generated
	 */
	int NOTE_BASE_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__VALUE = UNSTRUCTURED_TEXT_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__LANG = UNSTRUCTURED_TEXT_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__LANG1 = UNSTRUCTURED_TEXT_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__SCRIPT = UNSTRUCTURED_TEXT_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__TRANSLITERATION = UNSTRUCTURED_TEXT_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__ACTUATE = UNSTRUCTURED_TEXT_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__ARCROLE = UNSTRUCTURED_TEXT_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__DISPLAY_LABEL = UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__HREF = UNSTRUCTURED_TEXT_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__ROLE = UNSTRUCTURED_TEXT_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__SHOW = UNSTRUCTURED_TEXT_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__TITLE = UNSTRUCTURED_TEXT_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__TYPE = UNSTRUCTURED_TEXT_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__TYPE1 = UNSTRUCTURED_TEXT_DEFINITION__TYPE1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION__ID = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note Base Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_BASE_DEFINITION_FEATURE_COUNT = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.NoteDefinitionImpl <em>Note Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.NoteDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNoteDefinition()
	 * @generated
	 */
	int NOTE_DEFINITION = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__VALUE = NOTE_BASE_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__LANG = NOTE_BASE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__LANG1 = NOTE_BASE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__SCRIPT = NOTE_BASE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__TRANSLITERATION = NOTE_BASE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__ACTUATE = NOTE_BASE_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__ARCROLE = NOTE_BASE_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__DISPLAY_LABEL = NOTE_BASE_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__HREF = NOTE_BASE_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__ROLE = NOTE_BASE_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__SHOW = NOTE_BASE_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__TITLE = NOTE_BASE_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__TYPE = NOTE_BASE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__TYPE1 = NOTE_BASE_DEFINITION__TYPE1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__ID = NOTE_BASE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION__ALT_REP_GROUP = NOTE_BASE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DEFINITION_FEATURE_COUNT = NOTE_BASE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl <em>Origin Info Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.OriginInfoDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getOriginInfoDefinition()
	 * @generated
	 */
	int ORIGIN_INFO_DEFINITION = 28;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__PLACE = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Date Issued</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DATE_ISSUED = 3;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DATE_CREATED = 4;

	/**
	 * The feature id for the '<em><b>Date Captured</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DATE_CAPTURED = 5;

	/**
	 * The feature id for the '<em><b>Date Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DATE_VALID = 6;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DATE_MODIFIED = 7;

	/**
	 * The feature id for the '<em><b>Copyright Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__COPYRIGHT_DATE = 8;

	/**
	 * The feature id for the '<em><b>Date Other</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DATE_OTHER = 9;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__EDITION = 10;

	/**
	 * The feature id for the '<em><b>Issuance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__ISSUANCE = 11;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__FREQUENCY = 12;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__ALT_REP_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__DISPLAY_LABEL = 14;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__LANG = 15;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__LANG1 = 16;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__SCRIPT = 17;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION__TRANSLITERATION = 18;

	/**
	 * The number of structural features of the '<em>Origin Info Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_INFO_DEFINITION_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.PartDefinitionImpl <em>Part Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.PartDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPartDefinition()
	 * @generated
	 */
	int PART_DEFINITION = 29;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__EXTENT = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__DATE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__ALT_REP_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__DISPLAY_LABEL = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__ID = 7;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__LANG = 8;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__LANG1 = 9;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__ORDER = 10;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__SCRIPT = 11;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__TRANSLITERATION = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION__TYPE = 13;

	/**
	 * The number of structural features of the '<em>Part Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DEFINITION_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl <em>Physical Description Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPhysicalDescriptionDefinition()
	 * @generated
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION = 30;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__FORM = 1;

	/**
	 * The feature id for the '<em><b>Reformatting Quality</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__REFORMATTING_QUALITY = 2;

	/**
	 * The feature id for the '<em><b>Internet Media Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__INTERNET_MEDIA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__EXTENT = 4;

	/**
	 * The feature id for the '<em><b>Digital Origin</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__DIGITAL_ORIGIN = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__NOTE = 6;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__LANG = 9;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__LANG1 = 10;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT = 11;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION = 12;

	/**
	 * The number of structural features of the '<em>Physical Description Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DESCRIPTION_DEFINITION_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkImpl <em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__VALUE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__LANG = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__LANG1 = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__SCRIPT = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TRANSLITERATION = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__AUTHORITY = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__AUTHORITY_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__VALUE_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TYPE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__TYPE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__DISPLAY_LABEL = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ACTUATE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ARCROLE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__HREF = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ROLE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__SHOW = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TITLE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TYPE1 = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK_FEATURE_COUNT = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.PhysicalLocationDefinitionImpl <em>Physical Location Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.PhysicalLocationDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPhysicalLocationDefinition()
	 * @generated
	 */
	int PHYSICAL_LOCATION_DEFINITION = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__VALUE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__LANG = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__LANG1 = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__SCRIPT = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__TRANSLITERATION = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__AUTHORITY = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__AUTHORITY_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__VALUE_URI = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__TYPE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TYPE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__DISPLAY_LABEL = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__ACTUATE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__ARCROLE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__HREF = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__HREF;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__ROLE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__SHOW = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__TITLE = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TITLE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION__TYPE1 = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TYPE1;

	/**
	 * The number of structural features of the '<em>Physical Location Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_DEFINITION_FEATURE_COUNT = STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.PlaceDefinitionImpl <em>Place Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.PlaceDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPlaceDefinition()
	 * @generated
	 */
	int PLACE_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Place Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_DEFINITION__PLACE_TERM = 0;

	/**
	 * The feature id for the '<em><b>Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_DEFINITION__SUPPLIED = 1;

	/**
	 * The number of structural features of the '<em>Place Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.PlaceTermDefinitionImpl <em>Place Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.PlaceTermDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPlaceTermDefinition()
	 * @generated
	 */
	int PLACE_TERM_DEFINITION = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__AUTHORITY = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__AUTHORITY_URI = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__TYPE = XS_STRING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION__VALUE_URI = XS_STRING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Place Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TERM_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.RecordIdentifierDefinitionImpl <em>Record Identifier Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.RecordIdentifierDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRecordIdentifierDefinition()
	 * @generated
	 */
	int RECORD_IDENTIFIER_DEFINITION = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION__SOURCE = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Identifier Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_IDENTIFIER_DEFINITION_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl <em>Record Info Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.RecordInfoDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRecordInfoDefinition()
	 * @generated
	 */
	int RECORD_INFO_DEFINITION = 35;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Record Content Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__RECORD_CONTENT_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Record Creation Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__RECORD_CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Record Change Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__RECORD_CHANGE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Record Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__RECORD_IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Language Of Cataloging</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__LANGUAGE_OF_CATALOGING = 5;

	/**
	 * The feature id for the '<em><b>Record Origin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__RECORD_ORIGIN = 6;

	/**
	 * The feature id for the '<em><b>Description Standard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__DESCRIPTION_STANDARD = 7;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__ALT_REP_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__DISPLAY_LABEL = 9;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__LANG = 10;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__LANG1 = 11;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__SCRIPT = 12;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION__TRANSLITERATION = 13;

	/**
	 * The number of structural features of the '<em>Record Info Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INFO_DEFINITION_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl <em>Related Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.RelatedItemDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRelatedItemDefinition()
	 * @generated
	 */
	int RELATED_ITEM_DEFINITION = 36;

	/**
	 * The feature id for the '<em><b>Mods Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__MODS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ACCESS_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__GENRE = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__NAME = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__NOTE = 10;

	/**
	 * The feature id for the '<em><b>Origin Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ORIGIN_INFO = 11;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__PART = 12;

	/**
	 * The feature id for the '<em><b>Physical Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__PHYSICAL_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Record Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__RECORD_INFO = 14;

	/**
	 * The feature id for the '<em><b>Related Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__RELATED_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__SUBJECT = 16;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TABLE_OF_CONTENTS = 17;

	/**
	 * The feature id for the '<em><b>Target Audience</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TARGET_AUDIENCE = 18;

	/**
	 * The feature id for the '<em><b>Title Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TITLE_INFO = 19;

	/**
	 * The feature id for the '<em><b>Type Of Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TYPE_OF_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ACTUATE = 21;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ARCROLE = 22;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__DISPLAY_LABEL = 23;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__HREF = 24;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ID = 25;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__ROLE = 26;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__SHOW = 27;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TITLE = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TYPE = 29;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION__TYPE1 = 30;

	/**
	 * The number of structural features of the '<em>Related Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_DEFINITION_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.RoleDefinitionImpl <em>Role Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.RoleDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRoleDefinition()
	 * @generated
	 */
	int ROLE_DEFINITION = 37;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Role Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION__ROLE_TERM = 1;

	/**
	 * The number of structural features of the '<em>Role Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.RoleTermDefinitionImpl <em>Role Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.RoleTermDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRoleTermDefinition()
	 * @generated
	 */
	int ROLE_TERM_DEFINITION = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__VALUE = STRING_PLUS_AUTHORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__LANG = STRING_PLUS_AUTHORITY__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__LANG1 = STRING_PLUS_AUTHORITY__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__SCRIPT = STRING_PLUS_AUTHORITY__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__TRANSLITERATION = STRING_PLUS_AUTHORITY__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__AUTHORITY = STRING_PLUS_AUTHORITY__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__AUTHORITY_URI = STRING_PLUS_AUTHORITY__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__VALUE_URI = STRING_PLUS_AUTHORITY__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION__TYPE = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TERM_DEFINITION_FEATURE_COUNT = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.ScriptTermDefinitionImpl <em>Script Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.ScriptTermDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getScriptTermDefinition()
	 * @generated
	 */
	int SCRIPT_TERM_DEFINITION = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__VALUE = STRING_PLUS_AUTHORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__LANG = STRING_PLUS_AUTHORITY__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__LANG1 = STRING_PLUS_AUTHORITY__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__SCRIPT = STRING_PLUS_AUTHORITY__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__TRANSLITERATION = STRING_PLUS_AUTHORITY__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__AUTHORITY = STRING_PLUS_AUTHORITY__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__AUTHORITY_URI = STRING_PLUS_AUTHORITY__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__VALUE_URI = STRING_PLUS_AUTHORITY__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION__TYPE = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TERM_DEFINITION_FEATURE_COUNT = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.StringPlusSuppliedImpl <em>String Plus Supplied</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.StringPlusSuppliedImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getStringPlusSupplied()
	 * @generated
	 */
	int STRING_PLUS_SUPPLIED = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED__VALUE = XS_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED__LANG = XS_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED__LANG1 = XS_STRING__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED__SCRIPT = XS_STRING__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED__TRANSLITERATION = XS_STRING__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED__SUPPLIED = XS_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Plus Supplied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PLUS_SUPPLIED_FEATURE_COUNT = XS_STRING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl <em>Subject Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.SubjectDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getSubjectDefinition()
	 * @generated
	 */
	int SUBJECT_DEFINITION = 45;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Geographic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__GEOGRAPHIC = 2;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__TEMPORAL = 3;

	/**
	 * The feature id for the '<em><b>Title Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__TITLE_INFO = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Geographic Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__GEOGRAPHIC_CODE = 6;

	/**
	 * The feature id for the '<em><b>Hierarchical Geographic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__HIERARCHICAL_GEOGRAPHIC = 7;

	/**
	 * The feature id for the '<em><b>Cartographics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__CARTOGRAPHICS = 8;

	/**
	 * The feature id for the '<em><b>Occupation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__OCCUPATION = 9;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__GENRE = 10;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__ACTUATE = 11;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__ALT_REP_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__ARCROLE = 13;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__AUTHORITY = 14;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__AUTHORITY_URI = 15;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__DISPLAY_LABEL = 16;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__HREF = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__ID = 18;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__LANG = 19;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__LANG1 = 20;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__ROLE = 21;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__SCRIPT = 22;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__SHOW = 23;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__TITLE = 24;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__TRANSLITERATION = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__TYPE = 26;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__USAGE = 27;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION__VALUE_URI = 28;

	/**
	 * The number of structural features of the '<em>Subject Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DEFINITION_FEATURE_COUNT = 29;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.SubjectNameDefinitionImpl <em>Subject Name Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.SubjectNameDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getSubjectNameDefinition()
	 * @generated
	 */
	int SUBJECT_NAME_DEFINITION = 46;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__GROUP = NAME_BASE_DEFINITION__GROUP;

	/**
	 * The feature id for the '<em><b>Name Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__NAME_PART = NAME_BASE_DEFINITION__NAME_PART;

	/**
	 * The feature id for the '<em><b>Display Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__DISPLAY_FORM = NAME_BASE_DEFINITION__DISPLAY_FORM;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__AFFILIATION = NAME_BASE_DEFINITION__AFFILIATION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__ROLE = NAME_BASE_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__DESCRIPTION = NAME_BASE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__ACTUATE = NAME_BASE_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__ARCROLE = NAME_BASE_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__AUTHORITY = NAME_BASE_DEFINITION__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__AUTHORITY_URI = NAME_BASE_DEFINITION__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__DISPLAY_LABEL = NAME_BASE_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__HREF = NAME_BASE_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__ID = NAME_BASE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__LANG = NAME_BASE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__LANG1 = NAME_BASE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__ROLE1 = NAME_BASE_DEFINITION__ROLE1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__SCRIPT = NAME_BASE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__SHOW = NAME_BASE_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__TITLE = NAME_BASE_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__TRANSLITERATION = NAME_BASE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__TYPE = NAME_BASE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__TYPE1 = NAME_BASE_DEFINITION__TYPE1;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION__VALUE_URI = NAME_BASE_DEFINITION__VALUE_URI;

	/**
	 * The number of structural features of the '<em>Subject Name Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_NAME_DEFINITION_FEATURE_COUNT = NAME_BASE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl <em>Title Info Base Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTitleInfoBaseDefinition()
	 * @generated
	 */
	int TITLE_INFO_BASE_DEFINITION = 51;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__SUB_TITLE = 2;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__PART_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Part Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__PART_NAME = 4;

	/**
	 * The feature id for the '<em><b>Non Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__NON_SORT = 5;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__ACTUATE = 6;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__ARCROLE = 7;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__AUTHORITY = 8;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI = 9;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL = 10;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__HREF = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__ID = 12;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__LANG = 13;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__LANG1 = 14;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__ROLE = 15;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__SCRIPT = 16;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__SHOW = 17;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__TITLE1 = 18;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__TRANSLITERATION = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__TYPE = 20;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION__VALUE_URI = 21;

	/**
	 * The number of structural features of the '<em>Title Info Base Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.SubjectTitleInfoDefinitionImpl <em>Subject Title Info Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.SubjectTitleInfoDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getSubjectTitleInfoDefinition()
	 * @generated
	 */
	int SUBJECT_TITLE_INFO_DEFINITION = 47;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__GROUP = TITLE_INFO_BASE_DEFINITION__GROUP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__TITLE = TITLE_INFO_BASE_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__SUB_TITLE = TITLE_INFO_BASE_DEFINITION__SUB_TITLE;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__PART_NUMBER = TITLE_INFO_BASE_DEFINITION__PART_NUMBER;

	/**
	 * The feature id for the '<em><b>Part Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__PART_NAME = TITLE_INFO_BASE_DEFINITION__PART_NAME;

	/**
	 * The feature id for the '<em><b>Non Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__NON_SORT = TITLE_INFO_BASE_DEFINITION__NON_SORT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__ACTUATE = TITLE_INFO_BASE_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__ARCROLE = TITLE_INFO_BASE_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__AUTHORITY = TITLE_INFO_BASE_DEFINITION__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__AUTHORITY_URI = TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__DISPLAY_LABEL = TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__HREF = TITLE_INFO_BASE_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__ID = TITLE_INFO_BASE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__LANG = TITLE_INFO_BASE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__LANG1 = TITLE_INFO_BASE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__ROLE = TITLE_INFO_BASE_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__SCRIPT = TITLE_INFO_BASE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__SHOW = TITLE_INFO_BASE_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__TITLE1 = TITLE_INFO_BASE_DEFINITION__TITLE1;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__TRANSLITERATION = TITLE_INFO_BASE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__TYPE = TITLE_INFO_BASE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__VALUE_URI = TITLE_INFO_BASE_DEFINITION__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION__TYPE1 = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subject Title Info Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TITLE_INFO_DEFINITION_FEATURE_COUNT = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.TableOfContentsDefinitionImpl <em>Table Of Contents Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.TableOfContentsDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTableOfContentsDefinition()
	 * @generated
	 */
	int TABLE_OF_CONTENTS_DEFINITION = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__VALUE = UNSTRUCTURED_TEXT_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__LANG = UNSTRUCTURED_TEXT_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__LANG1 = UNSTRUCTURED_TEXT_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__SCRIPT = UNSTRUCTURED_TEXT_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__TRANSLITERATION = UNSTRUCTURED_TEXT_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__ACTUATE = UNSTRUCTURED_TEXT_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__ARCROLE = UNSTRUCTURED_TEXT_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__DISPLAY_LABEL = UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__HREF = UNSTRUCTURED_TEXT_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__ROLE = UNSTRUCTURED_TEXT_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__SHOW = UNSTRUCTURED_TEXT_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__TITLE = UNSTRUCTURED_TEXT_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__TYPE = UNSTRUCTURED_TEXT_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__TYPE1 = UNSTRUCTURED_TEXT_DEFINITION__TYPE1;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__ALT_REP_GROUP = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION__SHAREABLE = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Of Contents Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_DEFINITION_FEATURE_COUNT = UNSTRUCTURED_TEXT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.TargetAudienceDefinitionImpl <em>Target Audience Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.TargetAudienceDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTargetAudienceDefinition()
	 * @generated
	 */
	int TARGET_AUDIENCE_DEFINITION = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__VALUE = STRING_PLUS_AUTHORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__LANG = STRING_PLUS_AUTHORITY__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__LANG1 = STRING_PLUS_AUTHORITY__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__SCRIPT = STRING_PLUS_AUTHORITY__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__TRANSLITERATION = STRING_PLUS_AUTHORITY__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__AUTHORITY = STRING_PLUS_AUTHORITY__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__AUTHORITY_URI = STRING_PLUS_AUTHORITY__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__VALUE_URI = STRING_PLUS_AUTHORITY__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__ALT_REP_GROUP = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION__DISPLAY_LABEL = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Audience Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AUDIENCE_DEFINITION_FEATURE_COUNT = STRING_PLUS_AUTHORITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.TemporalDefinitionImpl <em>Temporal Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.TemporalDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTemporalDefinition()
	 * @generated
	 */
	int TEMPORAL_DEFINITION = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__VALUE = DATE_DEFINITION__VALUE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__LANG = DATE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__LANG1 = DATE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__SCRIPT = DATE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__TRANSLITERATION = DATE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__ENCODING = DATE_DEFINITION__ENCODING;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__POINT = DATE_DEFINITION__POINT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__QUALIFIER = DATE_DEFINITION__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Key Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__KEY_DATE = DATE_DEFINITION__KEY_DATE;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__AUTHORITY = DATE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__AUTHORITY_URI = DATE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION__VALUE_URI = DATE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DEFINITION_FEATURE_COUNT = DATE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.TitleInfoDefinitionImpl <em>Title Info Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.TitleInfoDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTitleInfoDefinition()
	 * @generated
	 */
	int TITLE_INFO_DEFINITION = 52;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__GROUP = TITLE_INFO_BASE_DEFINITION__GROUP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__TITLE = TITLE_INFO_BASE_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__SUB_TITLE = TITLE_INFO_BASE_DEFINITION__SUB_TITLE;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__PART_NUMBER = TITLE_INFO_BASE_DEFINITION__PART_NUMBER;

	/**
	 * The feature id for the '<em><b>Part Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__PART_NAME = TITLE_INFO_BASE_DEFINITION__PART_NAME;

	/**
	 * The feature id for the '<em><b>Non Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__NON_SORT = TITLE_INFO_BASE_DEFINITION__NON_SORT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__ACTUATE = TITLE_INFO_BASE_DEFINITION__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__ARCROLE = TITLE_INFO_BASE_DEFINITION__ARCROLE;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__AUTHORITY = TITLE_INFO_BASE_DEFINITION__AUTHORITY;

	/**
	 * The feature id for the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__AUTHORITY_URI = TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__DISPLAY_LABEL = TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__HREF = TITLE_INFO_BASE_DEFINITION__HREF;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__ID = TITLE_INFO_BASE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__LANG = TITLE_INFO_BASE_DEFINITION__LANG;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__LANG1 = TITLE_INFO_BASE_DEFINITION__LANG1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__ROLE = TITLE_INFO_BASE_DEFINITION__ROLE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__SCRIPT = TITLE_INFO_BASE_DEFINITION__SCRIPT;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__SHOW = TITLE_INFO_BASE_DEFINITION__SHOW;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__TITLE1 = TITLE_INFO_BASE_DEFINITION__TITLE1;

	/**
	 * The feature id for the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__TRANSLITERATION = TITLE_INFO_BASE_DEFINITION__TRANSLITERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__TYPE = TITLE_INFO_BASE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__VALUE_URI = TITLE_INFO_BASE_DEFINITION__VALUE_URI;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__ALT_REP_GROUP = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Title Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__NAME_TITLE_GROUP = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__SUPPLIED = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__TYPE1 = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION__USAGE = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Title Info Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_INFO_DEFINITION_FEATURE_COUNT = TITLE_INFO_BASE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl <em>Type Of Resource Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTypeOfResourceDefinition()
	 * @generated
	 */
	int TYPE_OF_RESOURCE_DEFINITION = 53;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION__ALT_REP_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION__COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION__DISPLAY_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Manuscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT = 4;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION__USAGE = 5;

	/**
	 * The number of structural features of the '<em>Type Of Resource Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_RESOURCE_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.impl.UrlDefinitionImpl <em>Url Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.impl.UrlDefinitionImpl
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUrlDefinition()
	 * @generated
	 */
	int URL_DEFINITION = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Date Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION__DATE_LAST_ACCESSED = 2;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION__DISPLAY_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION__NOTE = 4;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION__USAGE = 5;

	/**
	 * The number of structural features of the '<em>Url Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.CodeOrTextDefinition <em>Code Or Text Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.CodeOrTextDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getCodeOrTextDefinition()
	 * @generated
	 */
	int CODE_OR_TEXT_DEFINITION = 57;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.DateEncodingAttributeDefinition <em>Date Encoding Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DateEncodingAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateEncodingAttributeDefinition()
	 * @generated
	 */
	int DATE_ENCODING_ATTRIBUTE_DEFINITION = 58;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.DatePointAttributeDefinition <em>Date Point Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DatePointAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDatePointAttributeDefinition()
	 * @generated
	 */
	int DATE_POINT_ATTRIBUTE_DEFINITION = 59;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.DateQualifierAttributeDefinition <em>Date Qualifier Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DateQualifierAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateQualifierAttributeDefinition()
	 * @generated
	 */
	int DATE_QUALIFIER_ATTRIBUTE_DEFINITION = 60;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.DigitalOriginDefinition <em>Digital Origin Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DigitalOriginDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDigitalOriginDefinition()
	 * @generated
	 */
	int DIGITAL_ORIGIN_DEFINITION = 61;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition <em>Enumeration And Chronology Unit Type Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getEnumerationAndChronologyUnitTypeAttributeDefinition()
	 * @generated
	 */
	int ENUMERATION_AND_CHRONOLOGY_UNIT_TYPE_ATTRIBUTE_DEFINITION = 62;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.IssuanceDefinition <em>Issuance Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.IssuanceDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getIssuanceDefinition()
	 * @generated
	 */
	int ISSUANCE_DEFINITION = 63;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.LanguageAuthorityAttributeDefinition <em>Language Authority Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.LanguageAuthorityAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getLanguageAuthorityAttributeDefinition()
	 * @generated
	 */
	int LANGUAGE_AUTHORITY_ATTRIBUTE_DEFINITION = 64;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.ModsVersionAttributeDefinition <em>Mods Version Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.ModsVersionAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getModsVersionAttributeDefinition()
	 * @generated
	 */
	int MODS_VERSION_ATTRIBUTE_DEFINITION = 65;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.NamePartTypeAttributeDefinition <em>Name Part Type Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.NamePartTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNamePartTypeAttributeDefinition()
	 * @generated
	 */
	int NAME_PART_TYPE_ATTRIBUTE_DEFINITION = 66;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.NameTypeAttributeDefinition <em>Name Type Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.NameTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNameTypeAttributeDefinition()
	 * @generated
	 */
	int NAME_TYPE_ATTRIBUTE_DEFINITION = 67;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.NoDefinition <em>No Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.NoDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNoDefinition()
	 * @generated
	 */
	int NO_DEFINITION = 68;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.PlaceAuthorityAttributeDefinition <em>Place Authority Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPlaceAuthorityAttributeDefinition()
	 * @generated
	 */
	int PLACE_AUTHORITY_ATTRIBUTE_DEFINITION = 69;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.ReformattingQualityDefinition <em>Reformatting Quality Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.ReformattingQualityDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getReformattingQualityDefinition()
	 * @generated
	 */
	int REFORMATTING_QUALITY_DEFINITION = 70;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.RelatedItemTypeAttributeDefinition <em>Related Item Type Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.RelatedItemTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRelatedItemTypeAttributeDefinition()
	 * @generated
	 */
	int RELATED_ITEM_TYPE_ATTRIBUTE_DEFINITION = 71;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.ResourceTypeDefinition <em>Resource Type Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.ResourceTypeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getResourceTypeDefinition()
	 * @generated
	 */
	int RESOURCE_TYPE_DEFINITION = 72;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.TitleInfoTypeAttributeDefinition <em>Title Info Type Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTitleInfoTypeAttributeDefinition()
	 * @generated
	 */
	int TITLE_INFO_TYPE_ATTRIBUTE_DEFINITION = 73;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.UrlAccessAttributeDefinition <em>Url Access Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.UrlAccessAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUrlAccessAttributeDefinition()
	 * @generated
	 */
	int URL_ACCESS_ATTRIBUTE_DEFINITION = 74;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.UrlUsageAttributeDefinition <em>Url Usage Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.UrlUsageAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUrlUsageAttributeDefinition()
	 * @generated
	 */
	int URL_USAGE_ATTRIBUTE_DEFINITION = 75;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.UsageAttributeDefinition <em>Usage Attribute Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.UsageAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUsageAttributeDefinition()
	 * @generated
	 */
	int USAGE_ATTRIBUTE_DEFINITION = 76;

	/**
	 * The meta object id for the '{@link gov.loc.mods.mods.YesDefinition <em>Yes Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getYesDefinition()
	 * @generated
	 */
	int YES_DEFINITION = 77;

	/**
	 * The meta object id for the '<em>Code Or Text Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.CodeOrTextDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getCodeOrTextDefinitionObject()
	 * @generated
	 */
	int CODE_OR_TEXT_DEFINITION_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Date Encoding Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DateEncodingAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateEncodingAttributeDefinitionObject()
	 * @generated
	 */
	int DATE_ENCODING_ATTRIBUTE_DEFINITION_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Date Point Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DatePointAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDatePointAttributeDefinitionObject()
	 * @generated
	 */
	int DATE_POINT_ATTRIBUTE_DEFINITION_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Date Qualifier Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DateQualifierAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDateQualifierAttributeDefinitionObject()
	 * @generated
	 */
	int DATE_QUALIFIER_ATTRIBUTE_DEFINITION_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Digital Origin Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.DigitalOriginDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getDigitalOriginDefinitionObject()
	 * @generated
	 */
	int DIGITAL_ORIGIN_DEFINITION_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Enumeration And Chronology Unit Type Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getEnumerationAndChronologyUnitTypeAttributeDefinitionObject()
	 * @generated
	 */
	int ENUMERATION_AND_CHRONOLOGY_UNIT_TYPE_ATTRIBUTE_DEFINITION_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Issuance Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.IssuanceDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getIssuanceDefinitionObject()
	 * @generated
	 */
	int ISSUANCE_DEFINITION_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Language Authority Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.LanguageAuthorityAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getLanguageAuthorityAttributeDefinitionObject()
	 * @generated
	 */
	int LANGUAGE_AUTHORITY_ATTRIBUTE_DEFINITION_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Mods Version Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.ModsVersionAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getModsVersionAttributeDefinitionObject()
	 * @generated
	 */
	int MODS_VERSION_ATTRIBUTE_DEFINITION_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Name Part Type Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.NamePartTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNamePartTypeAttributeDefinitionObject()
	 * @generated
	 */
	int NAME_PART_TYPE_ATTRIBUTE_DEFINITION_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Name Type Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.NameTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNameTypeAttributeDefinitionObject()
	 * @generated
	 */
	int NAME_TYPE_ATTRIBUTE_DEFINITION_OBJECT = 88;

	/**
	 * The meta object id for the '<em>No Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.NoDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getNoDefinitionObject()
	 * @generated
	 */
	int NO_DEFINITION_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Place Authority Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getPlaceAuthorityAttributeDefinitionObject()
	 * @generated
	 */
	int PLACE_AUTHORITY_ATTRIBUTE_DEFINITION_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Reformatting Quality Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.ReformattingQualityDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getReformattingQualityDefinitionObject()
	 * @generated
	 */
	int REFORMATTING_QUALITY_DEFINITION_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Related Item Type Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.RelatedItemTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getRelatedItemTypeAttributeDefinitionObject()
	 * @generated
	 */
	int RELATED_ITEM_TYPE_ATTRIBUTE_DEFINITION_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Resource Type Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.ResourceTypeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getResourceTypeDefinitionObject()
	 * @generated
	 */
	int RESOURCE_TYPE_DEFINITION_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Title Info Type Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getTitleInfoTypeAttributeDefinitionObject()
	 * @generated
	 */
	int TITLE_INFO_TYPE_ATTRIBUTE_DEFINITION_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Url Access Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.UrlAccessAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUrlAccessAttributeDefinitionObject()
	 * @generated
	 */
	int URL_ACCESS_ATTRIBUTE_DEFINITION_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Url Usage Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.UrlUsageAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUrlUsageAttributeDefinitionObject()
	 * @generated
	 */
	int URL_USAGE_ATTRIBUTE_DEFINITION_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Usage Attribute Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.UsageAttributeDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getUsageAttributeDefinitionObject()
	 * @generated
	 */
	int USAGE_ATTRIBUTE_DEFINITION_OBJECT = 97;

	/**
	 * The meta object id for the '<em>Yes Definition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see gov.loc.mods.mods.impl.MODSPackageImpl#getYesDefinitionObject()
	 * @generated
	 */
	int YES_DEFINITION_OBJECT = 98;

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.AbstractDefinition <em>Abstract Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Definition</em>'.
	 * @see gov.loc.mods.mods.AbstractDefinition
	 * @generated
	 */
	EClass getAbstractDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AbstractDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.AbstractDefinition#getAltRepGroup()
	 * @see #getAbstractDefinition()
	 * @generated
	 */
	EAttribute getAbstractDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AbstractDefinition#getShareable <em>Shareable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shareable</em>'.
	 * @see gov.loc.mods.mods.AbstractDefinition#getShareable()
	 * @see #getAbstractDefinition()
	 * @generated
	 */
	EAttribute getAbstractDefinition_Shareable();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.AccessConditionDefinition <em>Access Condition Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Condition Definition</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition
	 * @generated
	 */
	EClass getAccessConditionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getActuate()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getAltRepGroup()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getArcrole()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getHref()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getLang()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getLang1()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getRole()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Role();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getScript()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getShow()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getTitle()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getTransliteration()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Transliteration();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getType()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.AccessConditionDefinition#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.AccessConditionDefinition#getType1()
	 * @see #getAccessConditionDefinition()
	 * @generated
	 */
	EAttribute getAccessConditionDefinition_Type1();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.CartographicsDefinition <em>Cartographics Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartographics Definition</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition
	 * @generated
	 */
	EClass getCartographicsDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.CartographicsDefinition#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition#getScale()
	 * @see #getCartographicsDefinition()
	 * @generated
	 */
	EReference getCartographicsDefinition_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.CartographicsDefinition#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projection</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition#getProjection()
	 * @see #getCartographicsDefinition()
	 * @generated
	 */
	EReference getCartographicsDefinition_Projection();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.CartographicsDefinition#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition#getCoordinates()
	 * @see #getCartographicsDefinition()
	 * @generated
	 */
	EReference getCartographicsDefinition_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.CartographicsDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition#getAuthority()
	 * @see #getCartographicsDefinition()
	 * @generated
	 */
	EAttribute getCartographicsDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.CartographicsDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition#getAuthorityURI()
	 * @see #getCartographicsDefinition()
	 * @generated
	 */
	EAttribute getCartographicsDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.CartographicsDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.CartographicsDefinition#getValueURI()
	 * @see #getCartographicsDefinition()
	 * @generated
	 */
	EAttribute getCartographicsDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.ClassificationDefinition <em>Classification Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Definition</em>'.
	 * @see gov.loc.mods.mods.ClassificationDefinition
	 * @generated
	 */
	EClass getClassificationDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ClassificationDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.ClassificationDefinition#getAltRepGroup()
	 * @see #getClassificationDefinition()
	 * @generated
	 */
	EAttribute getClassificationDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ClassificationDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.ClassificationDefinition#getDisplayLabel()
	 * @see #getClassificationDefinition()
	 * @generated
	 */
	EAttribute getClassificationDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ClassificationDefinition#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition</em>'.
	 * @see gov.loc.mods.mods.ClassificationDefinition#getEdition()
	 * @see #getClassificationDefinition()
	 * @generated
	 */
	EAttribute getClassificationDefinition_Edition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ClassificationDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.ClassificationDefinition#getUsage()
	 * @see #getClassificationDefinition()
	 * @generated
	 */
	EAttribute getClassificationDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.CopyInformationDefinition <em>Copy Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Information Definition</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition
	 * @generated
	 */
	EClass getCopyInformationDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.CopyInformationDefinition#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition#getForm()
	 * @see #getCopyInformationDefinition()
	 * @generated
	 */
	EReference getCopyInformationDefinition_Form();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.CopyInformationDefinition#getSubLocation <em>Sub Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Location</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition#getSubLocation()
	 * @see #getCopyInformationDefinition()
	 * @generated
	 */
	EReference getCopyInformationDefinition_SubLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.CopyInformationDefinition#getShelfLocator <em>Shelf Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shelf Locator</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition#getShelfLocator()
	 * @see #getCopyInformationDefinition()
	 * @generated
	 */
	EReference getCopyInformationDefinition_ShelfLocator();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.CopyInformationDefinition#getElectronicLocator <em>Electronic Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electronic Locator</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition#getElectronicLocator()
	 * @see #getCopyInformationDefinition()
	 * @generated
	 */
	EReference getCopyInformationDefinition_ElectronicLocator();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.CopyInformationDefinition#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition#getNote()
	 * @see #getCopyInformationDefinition()
	 * @generated
	 */
	EReference getCopyInformationDefinition_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.CopyInformationDefinition#getEnumerationAndChronology <em>Enumeration And Chronology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration And Chronology</em>'.
	 * @see gov.loc.mods.mods.CopyInformationDefinition#getEnumerationAndChronology()
	 * @see #getCopyInformationDefinition()
	 * @generated
	 */
	EReference getCopyInformationDefinition_EnumerationAndChronology();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.DateBaseDefinition <em>Date Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Base Definition</em>'.
	 * @see gov.loc.mods.mods.DateBaseDefinition
	 * @generated
	 */
	EClass getDateBaseDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DateBaseDefinition#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see gov.loc.mods.mods.DateBaseDefinition#getEncoding()
	 * @see #getDateBaseDefinition()
	 * @generated
	 */
	EAttribute getDateBaseDefinition_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DateBaseDefinition#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point</em>'.
	 * @see gov.loc.mods.mods.DateBaseDefinition#getPoint()
	 * @see #getDateBaseDefinition()
	 * @generated
	 */
	EAttribute getDateBaseDefinition_Point();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DateBaseDefinition#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see gov.loc.mods.mods.DateBaseDefinition#getQualifier()
	 * @see #getDateBaseDefinition()
	 * @generated
	 */
	EAttribute getDateBaseDefinition_Qualifier();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.DateDefinition <em>Date Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Definition</em>'.
	 * @see gov.loc.mods.mods.DateDefinition
	 * @generated
	 */
	EClass getDateDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Date</em>'.
	 * @see gov.loc.mods.mods.DateDefinition#getKeyDate()
	 * @see #getDateDefinition()
	 * @generated
	 */
	EAttribute getDateDefinition_KeyDate();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.DateOtherDefinition <em>Date Other Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Other Definition</em>'.
	 * @see gov.loc.mods.mods.DateOtherDefinition
	 * @generated
	 */
	EClass getDateOtherDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DateOtherDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.DateOtherDefinition#getType()
	 * @see #getDateOtherDefinition()
	 * @generated
	 */
	EAttribute getDateOtherDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.DetailDefinition <em>Detail Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail Definition</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition
	 * @generated
	 */
	EClass getDetailDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.DetailDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition#getGroup()
	 * @see #getDetailDefinition()
	 * @generated
	 */
	EAttribute getDetailDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.DetailDefinition#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition#getNumber()
	 * @see #getDetailDefinition()
	 * @generated
	 */
	EReference getDetailDefinition_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.DetailDefinition#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caption</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition#getCaption()
	 * @see #getDetailDefinition()
	 * @generated
	 */
	EReference getDetailDefinition_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.DetailDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition#getTitle()
	 * @see #getDetailDefinition()
	 * @generated
	 */
	EReference getDetailDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DetailDefinition#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition#getLevel()
	 * @see #getDetailDefinition()
	 * @generated
	 */
	EAttribute getDetailDefinition_Level();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DetailDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.DetailDefinition#getType()
	 * @see #getDetailDefinition()
	 * @generated
	 */
	EAttribute getDetailDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.loc.mods.mods.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.loc.mods.mods.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Condition</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getAccessCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AccessCondition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affiliation</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getAffiliation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Affiliation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Area();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCaption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Caption();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCartographics <em>Cartographics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cartographics</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCartographics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cartographics();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_City();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCitySection <em>City Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Section</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCitySection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CitySection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getClassification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getContinent <em>Continent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Continent</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getContinent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Continent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCoordinates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Coordinates();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCopyInformation <em>Copy Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy Information</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCopyInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CopyInformation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCopyrightDate <em>Copyright Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright Date</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCopyrightDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CopyrightDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Country();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getCounty <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>County</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getCounty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_County();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Date();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDateCaptured <em>Date Captured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Captured</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDateCaptured()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateCaptured();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Created</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDateCreated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateCreated();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDateIssued <em>Date Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Issued</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDateIssued()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateIssued();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDateModified <em>Date Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Modified</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDateModified()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateModified();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDateOther <em>Date Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Other</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDateOther()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateOther();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDateValid <em>Date Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Valid</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDateValid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateValid();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDescriptionStandard <em>Description Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Standard</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDescriptionStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescriptionStandard();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detail</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDetail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Detail();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DocumentRoot#getDigitalOrigin <em>Digital Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digital Origin</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDigitalOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DigitalOrigin();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getDisplayForm <em>Display Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Form</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getDisplayForm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DisplayForm();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edition</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getEdition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Edition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getElectronicLocator <em>Electronic Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Locator</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getElectronicLocator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElectronicLocator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_End();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getEnumerationAndChronology <em>Enumeration And Chronology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration And Chronology</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getEnumerationAndChronology()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnumerationAndChronology();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extent</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getExtraterrestrialArea <em>Extraterrestrial Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extraterrestrial Area</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getExtraterrestrialArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtraterrestrialArea();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getForm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Form();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getFrequency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Frequency();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Genre</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getGenre()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Genre();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getGeographic <em>Geographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geographic</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getGeographic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Geographic();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getGeographicCode <em>Geographic Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geographic Code</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getGeographicCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeographicCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getHierarchicalGeographic <em>Hierarchical Geographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hierarchical Geographic</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getHierarchicalGeographic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HierarchicalGeographic();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getHoldingExternal <em>Holding External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holding External</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getHoldingExternal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HoldingExternal();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getHoldingSimple <em>Holding Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holding Simple</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getHoldingSimple()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HoldingSimple();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getInternetMediaType <em>Internet Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internet Media Type</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getInternetMediaType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InternetMediaType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getIsland <em>Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Island</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getIsland()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Island();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DocumentRoot#getIssuance <em>Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuance</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getIssuance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Issuance();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Language();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getLanguageOfCataloging <em>Language Of Cataloging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Of Cataloging</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getLanguageOfCataloging()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LanguageOfCataloging();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getLanguageTerm <em>Language Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Term</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getLanguageTerm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LanguageTerm();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_List();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getMods <em>Mods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mods</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getMods()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mods();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getModsCollection <em>Mods Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mods Collection</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getModsCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModsCollection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getNamePart <em>Name Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Part</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getNamePart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamePart();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getNonSort <em>Non Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Sort</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getNonSort()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NonSort();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getNote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Note();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Number();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getOccupation <em>Occupation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Occupation</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getOccupation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Occupation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getOriginInfo <em>Origin Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin Info</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getOriginInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginInfo();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Part</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Part();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPartName <em>Part Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Part Name</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPartName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Part Number</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPartNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartNumber();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPhysicalDescription <em>Physical Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Description</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPhysicalDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PhysicalDescription();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPhysicalLocation <em>Physical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Location</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPhysicalLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PhysicalLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPlace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Place();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPlaceTerm <em>Place Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place Term</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPlaceTerm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlaceTerm();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projection</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getProjection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Projection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getProvince <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Province</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getProvince()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Province();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRecordChangeDate <em>Record Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Change Date</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRecordChangeDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordChangeDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRecordContentSource <em>Record Content Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Content Source</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRecordContentSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordContentSource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRecordCreationDate <em>Record Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Creation Date</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRecordCreationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordCreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRecordIdentifier <em>Record Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Identifier</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRecordIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRecordInfo <em>Record Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Info</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRecordInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordInfo();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRecordOrigin <em>Record Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Origin</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRecordOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordOrigin();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DocumentRoot#getReformattingQuality <em>Reformatting Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reformatting Quality</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getReformattingQuality()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ReformattingQuality();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Region();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRelatedItem <em>Related Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Item</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRelatedItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelatedItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Role();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getRoleTerm <em>Role Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Term</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getRoleTerm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleTerm();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getScriptTerm <em>Script Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Term</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getScriptTerm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScriptTerm();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getShelfLocator <em>Shelf Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shelf Locator</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getShelfLocator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShelfLocator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Start();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_State();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getSubject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getSubLocation <em>Sub Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Location</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getSubLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getSubTitle <em>Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Title</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getSubTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubTitle();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Of Contents</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTableOfContents()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableOfContents();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTargetAudience <em>Target Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Audience</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTargetAudience()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TargetAudience();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTemporal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTerritory <em>Territory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Territory</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTerritory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Territory();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Text();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTitleInfo <em>Title Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title Info</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTitleInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TitleInfo();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topic</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTopic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Topic();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.DocumentRoot#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Total();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getTypeOfResource <em>Type Of Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Of Resource</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getTypeOfResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeOfResource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.DocumentRoot#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see gov.loc.mods.mods.DocumentRoot#getUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Url();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition <em>Enumeration And Chronology Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration And Chronology Definition</em>'.
	 * @see gov.loc.mods.mods.EnumerationAndChronologyDefinition
	 * @generated
	 */
	EClass getEnumerationAndChronologyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see gov.loc.mods.mods.EnumerationAndChronologyDefinition#getUnitType()
	 * @see #getEnumerationAndChronologyDefinition()
	 * @generated
	 */
	EAttribute getEnumerationAndChronologyDefinition_UnitType();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Definition</em>'.
	 * @see gov.loc.mods.mods.ExtensionDefinition
	 * @generated
	 */
	EClass getExtensionDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.ExtensionDefinition#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.loc.mods.mods.ExtensionDefinition#getMixed()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EAttribute getExtensionDefinition_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.ExtensionDefinition#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see gov.loc.mods.mods.ExtensionDefinition#getAny()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EAttribute getExtensionDefinition_Any();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ExtensionDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.ExtensionDefinition#getDisplayLabel()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EAttribute getExtensionDefinition_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.ExtentDefinition <em>Extent Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent Definition</em>'.
	 * @see gov.loc.mods.mods.ExtentDefinition
	 * @generated
	 */
	EClass getExtentDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.ExtentDefinition#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see gov.loc.mods.mods.ExtentDefinition#getStart()
	 * @see #getExtentDefinition()
	 * @generated
	 */
	EReference getExtentDefinition_Start();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.ExtentDefinition#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see gov.loc.mods.mods.ExtentDefinition#getEnd()
	 * @see #getExtentDefinition()
	 * @generated
	 */
	EReference getExtentDefinition_End();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ExtentDefinition#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see gov.loc.mods.mods.ExtentDefinition#getTotal()
	 * @see #getExtentDefinition()
	 * @generated
	 */
	EAttribute getExtentDefinition_Total();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.ExtentDefinition#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see gov.loc.mods.mods.ExtentDefinition#getList()
	 * @see #getExtentDefinition()
	 * @generated
	 */
	EReference getExtentDefinition_List();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ExtentDefinition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see gov.loc.mods.mods.ExtentDefinition#getUnit()
	 * @see #getExtentDefinition()
	 * @generated
	 */
	EAttribute getExtentDefinition_Unit();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.GenreDefinition <em>Genre Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genre Definition</em>'.
	 * @see gov.loc.mods.mods.GenreDefinition
	 * @generated
	 */
	EClass getGenreDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.GenreDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.GenreDefinition#getAltRepGroup()
	 * @see #getGenreDefinition()
	 * @generated
	 */
	EAttribute getGenreDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.GenreDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.GenreDefinition#getUsage()
	 * @see #getGenreDefinition()
	 * @generated
	 */
	EAttribute getGenreDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.GeographicCodeDefinition <em>Geographic Code Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographic Code Definition</em>'.
	 * @see gov.loc.mods.mods.GeographicCodeDefinition
	 * @generated
	 */
	EClass getGeographicCodeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.GeographicCodeDefinition#getAuthority()
	 * @see #getGeographicCodeDefinition()
	 * @generated
	 */
	EAttribute getGeographicCodeDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.GeographicCodeDefinition#getAuthorityURI()
	 * @see #getGeographicCodeDefinition()
	 * @generated
	 */
	EAttribute getGeographicCodeDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.GeographicCodeDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.GeographicCodeDefinition#getValueURI()
	 * @see #getGeographicCodeDefinition()
	 * @generated
	 */
	EAttribute getGeographicCodeDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition <em>Hierarchical Geographic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical Geographic Definition</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition
	 * @generated
	 */
	EClass getHierarchicalGeographicDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getGroup()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EAttribute getHierarchicalGeographicDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getExtraterrestrialArea <em>Extraterrestrial Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extraterrestrial Area</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getExtraterrestrialArea()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_ExtraterrestrialArea();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getContinent <em>Continent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Continent</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getContinent()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Continent();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getCountry()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getProvince <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Province</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getProvince()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Province();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getRegion()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getState()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_State();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getTerritory <em>Territory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Territory</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getTerritory()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Territory();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCounty <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>County</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getCounty()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_County();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>City</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getCity()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_City();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCitySection <em>City Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>City Section</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getCitySection()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_CitySection();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getIsland <em>Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Island</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getIsland()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Island();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getArea()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EReference getHierarchicalGeographicDefinition_Area();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthority()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EAttribute getHierarchicalGeographicDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthorityURI()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EAttribute getHierarchicalGeographicDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition#getValueURI()
	 * @see #getHierarchicalGeographicDefinition()
	 * @generated
	 */
	EAttribute getHierarchicalGeographicDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.HoldingSimpleDefinition <em>Holding Simple Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Holding Simple Definition</em>'.
	 * @see gov.loc.mods.mods.HoldingSimpleDefinition
	 * @generated
	 */
	EClass getHoldingSimpleDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.HoldingSimpleDefinition#getCopyInformation <em>Copy Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copy Information</em>'.
	 * @see gov.loc.mods.mods.HoldingSimpleDefinition#getCopyInformation()
	 * @see #getHoldingSimpleDefinition()
	 * @generated
	 */
	EReference getHoldingSimpleDefinition_CopyInformation();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.IdentifierDefinition <em>Identifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Definition</em>'.
	 * @see gov.loc.mods.mods.IdentifierDefinition
	 * @generated
	 */
	EClass getIdentifierDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.IdentifierDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.IdentifierDefinition#getAltRepGroup()
	 * @see #getIdentifierDefinition()
	 * @generated
	 */
	EAttribute getIdentifierDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.IdentifierDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.IdentifierDefinition#getDisplayLabel()
	 * @see #getIdentifierDefinition()
	 * @generated
	 */
	EAttribute getIdentifierDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.IdentifierDefinition#getInvalid <em>Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid</em>'.
	 * @see gov.loc.mods.mods.IdentifierDefinition#getInvalid()
	 * @see #getIdentifierDefinition()
	 * @generated
	 */
	EAttribute getIdentifierDefinition_Invalid();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.IdentifierDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.IdentifierDefinition#getType()
	 * @see #getIdentifierDefinition()
	 * @generated
	 */
	EAttribute getIdentifierDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.LanguageDefinition <em>Language Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Definition</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition
	 * @generated
	 */
	EClass getLanguageDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.LanguageDefinition#getLanguageTerm <em>Language Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language Term</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getLanguageTerm()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EReference getLanguageDefinition_LanguageTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.LanguageDefinition#getScriptTerm <em>Script Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script Term</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getScriptTerm()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EReference getLanguageDefinition_ScriptTerm();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getAltRepGroup()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getDisplayLabel()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getLang()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getLang1()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getObjectPart <em>Object Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Part</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getObjectPart()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_ObjectPart();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getScript()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getTransliteration()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_Transliteration();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.LanguageDefinition#getUsage()
	 * @see #getLanguageDefinition()
	 * @generated
	 */
	EAttribute getLanguageDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.LanguageTermDefinition <em>Language Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Term Definition</em>'.
	 * @see gov.loc.mods.mods.LanguageTermDefinition
	 * @generated
	 */
	EClass getLanguageTermDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageTermDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.LanguageTermDefinition#getAuthority()
	 * @see #getLanguageTermDefinition()
	 * @generated
	 */
	EAttribute getLanguageTermDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageTermDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.LanguageTermDefinition#getAuthorityURI()
	 * @see #getLanguageTermDefinition()
	 * @generated
	 */
	EAttribute getLanguageTermDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageTermDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.LanguageTermDefinition#getType()
	 * @see #getLanguageTermDefinition()
	 * @generated
	 */
	EAttribute getLanguageTermDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LanguageTermDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.LanguageTermDefinition#getValueURI()
	 * @see #getLanguageTermDefinition()
	 * @generated
	 */
	EAttribute getLanguageTermDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.LocationDefinition <em>Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Definition</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition
	 * @generated
	 */
	EClass getLocationDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.LocationDefinition#getPhysicalLocation <em>Physical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Location</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getPhysicalLocation()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EReference getLocationDefinition_PhysicalLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.LocationDefinition#getShelfLocator <em>Shelf Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shelf Locator</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getShelfLocator()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EReference getLocationDefinition_ShelfLocator();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.LocationDefinition#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getUrl()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EReference getLocationDefinition_Url();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.LocationDefinition#getHoldingSimple <em>Holding Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holding Simple</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getHoldingSimple()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EReference getLocationDefinition_HoldingSimple();

	/**
	 * Returns the meta object for the containment reference '{@link gov.loc.mods.mods.LocationDefinition#getHoldingExternal <em>Holding External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holding External</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getHoldingExternal()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EReference getLocationDefinition_HoldingExternal();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LocationDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getAltRepGroup()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LocationDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getDisplayLabel()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LocationDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getLang()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LocationDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getLang1()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LocationDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getScript()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.LocationDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.LocationDefinition#getTransliteration()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_Transliteration();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.ModsCollectionDefinition <em>Mods Collection Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mods Collection Definition</em>'.
	 * @see gov.loc.mods.mods.ModsCollectionDefinition
	 * @generated
	 */
	EClass getModsCollectionDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsCollectionDefinition#getMods <em>Mods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mods</em>'.
	 * @see gov.loc.mods.mods.ModsCollectionDefinition#getMods()
	 * @see #getModsCollectionDefinition()
	 * @generated
	 */
	EReference getModsCollectionDefinition_Mods();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.ModsDefinition <em>Mods Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mods Definition</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition
	 * @generated
	 */
	EClass getModsDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.ModsDefinition#getModsGroup <em>Mods Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mods Group</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getModsGroup()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EAttribute getModsDefinition_ModsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getAbstract()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Condition</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getAccessCondition()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_AccessCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getClassification()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getExtension()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genre</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getGenre()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Genre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getIdentifier()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getLanguage()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getLocation()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getName()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getNote()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getOriginInfo <em>Origin Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin Info</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getOriginInfo()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_OriginInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getPart()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getPhysicalDescription <em>Physical Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Description</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getPhysicalDescription()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_PhysicalDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getRecordInfo <em>Record Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Info</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getRecordInfo()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_RecordInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getRelatedItem <em>Related Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Item</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getRelatedItem()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_RelatedItem();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getSubject()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getTableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Of Contents</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getTableOfContents()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_TableOfContents();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getTargetAudience <em>Target Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Audience</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getTargetAudience()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_TargetAudience();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getTitleInfo <em>Title Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title Info</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getTitleInfo()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_TitleInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.ModsDefinition#getTypeOfResource <em>Type Of Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Of Resource</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getTypeOfResource()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EReference getModsDefinition_TypeOfResource();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ModsDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getID()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EAttribute getModsDefinition_ID();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ModsDefinition#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gov.loc.mods.mods.ModsDefinition#getVersion()
	 * @see #getModsDefinition()
	 * @generated
	 */
	EAttribute getModsDefinition_Version();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.NameBaseDefinition <em>Name Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Base Definition</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition
	 * @generated
	 */
	EClass getNameBaseDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.NameBaseDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getGroup()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.NameBaseDefinition#getNamePart <em>Name Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Part</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getNamePart()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EReference getNameBaseDefinition_NamePart();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.NameBaseDefinition#getDisplayForm <em>Display Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Form</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getDisplayForm()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EReference getNameBaseDefinition_DisplayForm();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.NameBaseDefinition#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affiliation</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getAffiliation()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EReference getNameBaseDefinition_Affiliation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.NameBaseDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getRole()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EReference getNameBaseDefinition_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.NameBaseDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getDescription()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EReference getNameBaseDefinition_Description();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getActuate()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getArcrole()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getAuthority()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getAuthorityURI()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getDisplayLabel()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getHref()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getID()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_ID();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getLang()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getLang1()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getRole1 <em>Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role1</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getRole1()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Role1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getScript()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getShow()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getTitle()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getTransliteration()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Transliteration();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getType()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getType1()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_Type1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameBaseDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.NameBaseDefinition#getValueURI()
	 * @see #getNameBaseDefinition()
	 * @generated
	 */
	EAttribute getNameBaseDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.NameDefinition <em>Name Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Definition</em>'.
	 * @see gov.loc.mods.mods.NameDefinition
	 * @generated
	 */
	EClass getNameDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.NameDefinition#getAltRepGroup()
	 * @see #getNameDefinition()
	 * @generated
	 */
	EAttribute getNameDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameDefinition#getNameTitleGroup <em>Name Title Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Title Group</em>'.
	 * @see gov.loc.mods.mods.NameDefinition#getNameTitleGroup()
	 * @see #getNameDefinition()
	 * @generated
	 */
	EAttribute getNameDefinition_NameTitleGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NameDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.NameDefinition#getUsage()
	 * @see #getNameDefinition()
	 * @generated
	 */
	EAttribute getNameDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.NamePartDefinition <em>Name Part Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Part Definition</em>'.
	 * @see gov.loc.mods.mods.NamePartDefinition
	 * @generated
	 */
	EClass getNamePartDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NamePartDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.NamePartDefinition#getType()
	 * @see #getNamePartDefinition()
	 * @generated
	 */
	EAttribute getNamePartDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.NoteBaseDefinition <em>Note Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Base Definition</em>'.
	 * @see gov.loc.mods.mods.NoteBaseDefinition
	 * @generated
	 */
	EClass getNoteBaseDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NoteBaseDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.NoteBaseDefinition#getID()
	 * @see #getNoteBaseDefinition()
	 * @generated
	 */
	EAttribute getNoteBaseDefinition_ID();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.NoteDefinition <em>Note Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Definition</em>'.
	 * @see gov.loc.mods.mods.NoteDefinition
	 * @generated
	 */
	EClass getNoteDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.NoteDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.NoteDefinition#getAltRepGroup()
	 * @see #getNoteDefinition()
	 * @generated
	 */
	EAttribute getNoteDefinition_AltRepGroup();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.OriginInfoDefinition <em>Origin Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin Info Definition</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition
	 * @generated
	 */
	EClass getOriginInfoDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.OriginInfoDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getGroup()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getPlace()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getPublisher()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getDateIssued <em>Date Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Issued</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDateIssued()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_DateIssued();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Created</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDateCreated()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_DateCreated();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getDateCaptured <em>Date Captured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Captured</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDateCaptured()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_DateCaptured();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getDateValid <em>Date Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Valid</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDateValid()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_DateValid();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getDateModified <em>Date Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Modified</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDateModified()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_DateModified();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getCopyrightDate <em>Copyright Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copyright Date</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getCopyrightDate()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_CopyrightDate();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getDateOther <em>Date Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Other</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDateOther()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_DateOther();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edition</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getEdition()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_Edition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.OriginInfoDefinition#getIssuance <em>Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Issuance</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getIssuance()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_Issuance();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.OriginInfoDefinition#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frequency</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getFrequency()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EReference getOriginInfoDefinition_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.OriginInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getAltRepGroup()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.OriginInfoDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getDisplayLabel()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.OriginInfoDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getLang()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.OriginInfoDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getLang1()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.OriginInfoDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getScript()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.OriginInfoDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.OriginInfoDefinition#getTransliteration()
	 * @see #getOriginInfoDefinition()
	 * @generated
	 */
	EAttribute getOriginInfoDefinition_Transliteration();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.PartDefinition <em>Part Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Definition</em>'.
	 * @see gov.loc.mods.mods.PartDefinition
	 * @generated
	 */
	EClass getPartDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.PartDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getGroup()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PartDefinition#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detail</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getDetail()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EReference getPartDefinition_Detail();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PartDefinition#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extent</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getExtent()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EReference getPartDefinition_Extent();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PartDefinition#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getDate()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EReference getPartDefinition_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PartDefinition#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getText()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EReference getPartDefinition_Text();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getAltRepGroup()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getDisplayLabel()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getID()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_ID();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getLang()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getLang1()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getOrder()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Order();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getScript()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getTransliteration()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Transliteration();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PartDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.PartDefinition#getType()
	 * @see #getPartDefinition()
	 * @generated
	 */
	EAttribute getPartDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition <em>Physical Description Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Description Definition</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition
	 * @generated
	 */
	EClass getPhysicalDescriptionDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getGroup()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getForm()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EReference getPhysicalDescriptionDefinition_Form();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getReformattingQuality <em>Reformatting Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reformatting Quality</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getReformattingQuality()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_ReformattingQuality();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getInternetMediaType <em>Internet Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internet Media Type</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getInternetMediaType()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EReference getPhysicalDescriptionDefinition_InternetMediaType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extent</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getExtent()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EReference getPhysicalDescriptionDefinition_Extent();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getDigitalOrigin <em>Digital Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Digital Origin</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getDigitalOrigin()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_DigitalOrigin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getNote()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EReference getPhysicalDescriptionDefinition_Note();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getAltRepGroup()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getDisplayLabel()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang1()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getScript()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition#getTransliteration()
	 * @see #getPhysicalDescriptionDefinition()
	 * @generated
	 */
	EAttribute getPhysicalDescriptionDefinition_Transliteration();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.PhysicalLocationDefinition <em>Physical Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Location Definition</em>'.
	 * @see gov.loc.mods.mods.PhysicalLocationDefinition
	 * @generated
	 */
	EClass getPhysicalLocationDefinition();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.PlaceDefinition <em>Place Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Definition</em>'.
	 * @see gov.loc.mods.mods.PlaceDefinition
	 * @generated
	 */
	EClass getPlaceDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.PlaceDefinition#getPlaceTerm <em>Place Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place Term</em>'.
	 * @see gov.loc.mods.mods.PlaceDefinition#getPlaceTerm()
	 * @see #getPlaceDefinition()
	 * @generated
	 */
	EReference getPlaceDefinition_PlaceTerm();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PlaceDefinition#getSupplied <em>Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplied</em>'.
	 * @see gov.loc.mods.mods.PlaceDefinition#getSupplied()
	 * @see #getPlaceDefinition()
	 * @generated
	 */
	EAttribute getPlaceDefinition_Supplied();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.PlaceTermDefinition <em>Place Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Term Definition</em>'.
	 * @see gov.loc.mods.mods.PlaceTermDefinition
	 * @generated
	 */
	EClass getPlaceTermDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.PlaceTermDefinition#getAuthority()
	 * @see #getPlaceTermDefinition()
	 * @generated
	 */
	EAttribute getPlaceTermDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.PlaceTermDefinition#getAuthorityURI()
	 * @see #getPlaceTermDefinition()
	 * @generated
	 */
	EAttribute getPlaceTermDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PlaceTermDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.PlaceTermDefinition#getType()
	 * @see #getPlaceTermDefinition()
	 * @generated
	 */
	EAttribute getPlaceTermDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.PlaceTermDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.PlaceTermDefinition#getValueURI()
	 * @see #getPlaceTermDefinition()
	 * @generated
	 */
	EAttribute getPlaceTermDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.RecordIdentifierDefinition <em>Record Identifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Identifier Definition</em>'.
	 * @see gov.loc.mods.mods.RecordIdentifierDefinition
	 * @generated
	 */
	EClass getRecordIdentifierDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordIdentifierDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.loc.mods.mods.RecordIdentifierDefinition#getSource()
	 * @see #getRecordIdentifierDefinition()
	 * @generated
	 */
	EAttribute getRecordIdentifierDefinition_Source();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.RecordInfoDefinition <em>Record Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Info Definition</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition
	 * @generated
	 */
	EClass getRecordInfoDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.RecordInfoDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getGroup()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordContentSource <em>Record Content Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Content Source</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getRecordContentSource()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_RecordContentSource();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordCreationDate <em>Record Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Creation Date</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getRecordCreationDate()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_RecordCreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordChangeDate <em>Record Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Change Date</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getRecordChangeDate()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_RecordChangeDate();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordIdentifier <em>Record Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Identifier</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getRecordIdentifier()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_RecordIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getLanguageOfCataloging <em>Language Of Cataloging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language Of Cataloging</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getLanguageOfCataloging()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_LanguageOfCataloging();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordOrigin <em>Record Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Origin</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getRecordOrigin()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_RecordOrigin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RecordInfoDefinition#getDescriptionStandard <em>Description Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Standard</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getDescriptionStandard()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EReference getRecordInfoDefinition_DescriptionStandard();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getAltRepGroup()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordInfoDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getDisplayLabel()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordInfoDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getLang()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordInfoDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getLang1()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordInfoDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getScript()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RecordInfoDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.RecordInfoDefinition#getTransliteration()
	 * @see #getRecordInfoDefinition()
	 * @generated
	 */
	EAttribute getRecordInfoDefinition_Transliteration();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.RelatedItemDefinition <em>Related Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Item Definition</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition
	 * @generated
	 */
	EClass getRelatedItemDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.RelatedItemDefinition#getModsGroup <em>Mods Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mods Group</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getModsGroup()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_ModsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getAbstract()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Condition</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getAccessCondition()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_AccessCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getClassification()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getExtension()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genre</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getGenre()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Genre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getIdentifier()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getLanguage()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getLocation()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getName()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getNote()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getOriginInfo <em>Origin Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin Info</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getOriginInfo()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_OriginInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getPart()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getPhysicalDescription <em>Physical Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Description</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getPhysicalDescription()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_PhysicalDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getRecordInfo <em>Record Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Info</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getRecordInfo()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_RecordInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getRelatedItem <em>Related Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Item</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getRelatedItem()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_RelatedItem();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getSubject()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getTableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Of Contents</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getTableOfContents()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_TableOfContents();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getTargetAudience <em>Target Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Audience</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getTargetAudience()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_TargetAudience();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getTitleInfo <em>Title Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title Info</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getTitleInfo()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_TitleInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RelatedItemDefinition#getTypeOfResource <em>Type Of Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Of Resource</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getTypeOfResource()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EReference getRelatedItemDefinition_TypeOfResource();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getActuate()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getArcrole()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getDisplayLabel()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getHref()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getID()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_ID();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getRole()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Role();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getShow()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getTitle()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getType()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RelatedItemDefinition#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.RelatedItemDefinition#getType1()
	 * @see #getRelatedItemDefinition()
	 * @generated
	 */
	EAttribute getRelatedItemDefinition_Type1();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.RoleDefinition <em>Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Definition</em>'.
	 * @see gov.loc.mods.mods.RoleDefinition
	 * @generated
	 */
	EClass getRoleDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.RoleDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.RoleDefinition#getGroup()
	 * @see #getRoleDefinition()
	 * @generated
	 */
	EAttribute getRoleDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.RoleDefinition#getRoleTerm <em>Role Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Term</em>'.
	 * @see gov.loc.mods.mods.RoleDefinition#getRoleTerm()
	 * @see #getRoleDefinition()
	 * @generated
	 */
	EReference getRoleDefinition_RoleTerm();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.RoleTermDefinition <em>Role Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Term Definition</em>'.
	 * @see gov.loc.mods.mods.RoleTermDefinition
	 * @generated
	 */
	EClass getRoleTermDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.RoleTermDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.RoleTermDefinition#getType()
	 * @see #getRoleTermDefinition()
	 * @generated
	 */
	EAttribute getRoleTermDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.ScriptTermDefinition <em>Script Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Term Definition</em>'.
	 * @see gov.loc.mods.mods.ScriptTermDefinition
	 * @generated
	 */
	EClass getScriptTermDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.ScriptTermDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.ScriptTermDefinition#getType()
	 * @see #getScriptTermDefinition()
	 * @generated
	 */
	EAttribute getScriptTermDefinition_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.StringPlusAuthority <em>String Plus Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Plus Authority</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthority
	 * @generated
	 */
	EClass getStringPlusAuthority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthority#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthority#getAuthority()
	 * @see #getStringPlusAuthority()
	 * @generated
	 */
	EAttribute getStringPlusAuthority_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthority#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthority#getAuthorityURI()
	 * @see #getStringPlusAuthority()
	 * @generated
	 */
	EAttribute getStringPlusAuthority_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthority#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthority#getValueURI()
	 * @see #getStringPlusAuthority()
	 * @generated
	 */
	EAttribute getStringPlusAuthority_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.StringPlusAuthorityPlusType <em>String Plus Authority Plus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Plus Authority Plus Type</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusType
	 * @generated
	 */
	EClass getStringPlusAuthorityPlusType();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusType#getType()
	 * @see #getStringPlusAuthorityPlusType()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusType_Type();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel <em>String Plus Authority Plus Type Plus Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Plus Authority Plus Type Plus Display Label</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel
	 * @generated
	 */
	EClass getStringPlusAuthorityPlusTypePlusDisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel#getDisplayLabel()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabel()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabel_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink <em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink
	 * @generated
	 */
	EClass getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getActuate()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getArcrole()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getHref()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getRole()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Role();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getShow()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getTitle()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink#getType1()
	 * @see #getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()
	 * @generated
	 */
	EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Type1();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.StringPlusSupplied <em>String Plus Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Plus Supplied</em>'.
	 * @see gov.loc.mods.mods.StringPlusSupplied
	 * @generated
	 */
	EClass getStringPlusSupplied();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.StringPlusSupplied#getSupplied <em>Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplied</em>'.
	 * @see gov.loc.mods.mods.StringPlusSupplied#getSupplied()
	 * @see #getStringPlusSupplied()
	 * @generated
	 */
	EAttribute getStringPlusSupplied_Supplied();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.SubjectDefinition <em>Subject Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Definition</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition
	 * @generated
	 */
	EClass getSubjectDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.SubjectDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getGroup()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getTopic()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Topic();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getGeographic <em>Geographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geographic</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getGeographic()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Geographic();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getTemporal()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Temporal();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getTitleInfo <em>Title Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title Info</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getTitleInfo()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_TitleInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getName()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getGeographicCode <em>Geographic Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geographic Code</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getGeographicCode()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_GeographicCode();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getHierarchicalGeographic <em>Hierarchical Geographic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchical Geographic</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getHierarchicalGeographic()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_HierarchicalGeographic();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getCartographics <em>Cartographics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cartographics</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getCartographics()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Cartographics();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getOccupation <em>Occupation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occupation</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getOccupation()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Occupation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.SubjectDefinition#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genre</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getGenre()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EReference getSubjectDefinition_Genre();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getActuate()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getAltRepGroup()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getArcrole()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getAuthority()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getAuthorityURI()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getDisplayLabel()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getHref()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getID()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_ID();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getLang()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getLang1()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getRole()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Role();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getScript()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getShow()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getTitle()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getTransliteration()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Transliteration();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getType()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getUsage()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_Usage();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.SubjectDefinition#getValueURI()
	 * @see #getSubjectDefinition()
	 * @generated
	 */
	EAttribute getSubjectDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.SubjectNameDefinition <em>Subject Name Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Name Definition</em>'.
	 * @see gov.loc.mods.mods.SubjectNameDefinition
	 * @generated
	 */
	EClass getSubjectNameDefinition();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.SubjectTitleInfoDefinition <em>Subject Title Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Title Info Definition</em>'.
	 * @see gov.loc.mods.mods.SubjectTitleInfoDefinition
	 * @generated
	 */
	EClass getSubjectTitleInfoDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.SubjectTitleInfoDefinition#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.SubjectTitleInfoDefinition#getType1()
	 * @see #getSubjectTitleInfoDefinition()
	 * @generated
	 */
	EAttribute getSubjectTitleInfoDefinition_Type1();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.TableOfContentsDefinition <em>Table Of Contents Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Of Contents Definition</em>'.
	 * @see gov.loc.mods.mods.TableOfContentsDefinition
	 * @generated
	 */
	EClass getTableOfContentsDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TableOfContentsDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.TableOfContentsDefinition#getAltRepGroup()
	 * @see #getTableOfContentsDefinition()
	 * @generated
	 */
	EAttribute getTableOfContentsDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TableOfContentsDefinition#getShareable <em>Shareable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shareable</em>'.
	 * @see gov.loc.mods.mods.TableOfContentsDefinition#getShareable()
	 * @see #getTableOfContentsDefinition()
	 * @generated
	 */
	EAttribute getTableOfContentsDefinition_Shareable();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.TargetAudienceDefinition <em>Target Audience Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Audience Definition</em>'.
	 * @see gov.loc.mods.mods.TargetAudienceDefinition
	 * @generated
	 */
	EClass getTargetAudienceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TargetAudienceDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.TargetAudienceDefinition#getAltRepGroup()
	 * @see #getTargetAudienceDefinition()
	 * @generated
	 */
	EAttribute getTargetAudienceDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TargetAudienceDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.TargetAudienceDefinition#getDisplayLabel()
	 * @see #getTargetAudienceDefinition()
	 * @generated
	 */
	EAttribute getTargetAudienceDefinition_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.TemporalDefinition <em>Temporal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Definition</em>'.
	 * @see gov.loc.mods.mods.TemporalDefinition
	 * @generated
	 */
	EClass getTemporalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TemporalDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.TemporalDefinition#getAuthority()
	 * @see #getTemporalDefinition()
	 * @generated
	 */
	EAttribute getTemporalDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TemporalDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.TemporalDefinition#getAuthorityURI()
	 * @see #getTemporalDefinition()
	 * @generated
	 */
	EAttribute getTemporalDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TemporalDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.TemporalDefinition#getValueURI()
	 * @see #getTemporalDefinition()
	 * @generated
	 */
	EAttribute getTemporalDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.TitleInfoBaseDefinition <em>Title Info Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Info Base Definition</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition
	 * @generated
	 */
	EClass getTitleInfoBaseDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getGroup()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getTitle()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EReference getTitleInfoBaseDefinition_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getSubTitle <em>Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Title</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getSubTitle()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EReference getTitleInfoBaseDefinition_SubTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Number</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getPartNumber()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EReference getTitleInfoBaseDefinition_PartNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getPartName <em>Part Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Name</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getPartName()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EReference getTitleInfoBaseDefinition_PartName();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getNonSort <em>Non Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Sort</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getNonSort()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EReference getTitleInfoBaseDefinition_NonSort();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getActuate()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getArcrole()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getAuthority()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Authority();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getAuthorityURI <em>Authority URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority URI</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getAuthorityURI()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_AuthorityURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getDisplayLabel()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getHref()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getID()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_ID();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getLang()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getLang1()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getRole()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Role();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getScript()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getShow()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getTitle1 <em>Title1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title1</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getTitle1()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Title1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getTransliteration()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Transliteration();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getType()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoBaseDefinition#getValueURI <em>Value URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value URI</em>'.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition#getValueURI()
	 * @see #getTitleInfoBaseDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoBaseDefinition_ValueURI();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.TitleInfoDefinition <em>Title Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Info Definition</em>'.
	 * @see gov.loc.mods.mods.TitleInfoDefinition
	 * @generated
	 */
	EClass getTitleInfoDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.TitleInfoDefinition#getAltRepGroup()
	 * @see #getTitleInfoDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoDefinition#getNameTitleGroup <em>Name Title Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Title Group</em>'.
	 * @see gov.loc.mods.mods.TitleInfoDefinition#getNameTitleGroup()
	 * @see #getTitleInfoDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoDefinition_NameTitleGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoDefinition#getSupplied <em>Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplied</em>'.
	 * @see gov.loc.mods.mods.TitleInfoDefinition#getSupplied()
	 * @see #getTitleInfoDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoDefinition_Supplied();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoDefinition#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.TitleInfoDefinition#getType1()
	 * @see #getTitleInfoDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoDefinition_Type1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TitleInfoDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.TitleInfoDefinition#getUsage()
	 * @see #getTitleInfoDefinition()
	 * @generated
	 */
	EAttribute getTitleInfoDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.TypeOfResourceDefinition <em>Type Of Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Of Resource Definition</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition
	 * @generated
	 */
	EClass getTypeOfResourceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition#getValue()
	 * @see #getTypeOfResourceDefinition()
	 * @generated
	 */
	EAttribute getTypeOfResourceDefinition_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getAltRepGroup <em>Alt Rep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Rep Group</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition#getAltRepGroup()
	 * @see #getTypeOfResourceDefinition()
	 * @generated
	 */
	EAttribute getTypeOfResourceDefinition_AltRepGroup();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition#getCollection()
	 * @see #getTypeOfResourceDefinition()
	 * @generated
	 */
	EAttribute getTypeOfResourceDefinition_Collection();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition#getDisplayLabel()
	 * @see #getTypeOfResourceDefinition()
	 * @generated
	 */
	EAttribute getTypeOfResourceDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getManuscript <em>Manuscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manuscript</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition#getManuscript()
	 * @see #getTypeOfResourceDefinition()
	 * @generated
	 */
	EAttribute getTypeOfResourceDefinition_Manuscript();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition#getUsage()
	 * @see #getTypeOfResourceDefinition()
	 * @generated
	 */
	EAttribute getTypeOfResourceDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.UnstructuredTextDefinition <em>Unstructured Text Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Text Definition</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition
	 * @generated
	 */
	EClass getUnstructuredTextDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getActuate()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getArcrole()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getDisplayLabel()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getHref()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getRole()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Role();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getShow()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Show();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getTitle()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getType()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition#getType1()
	 * @see #getUnstructuredTextDefinition()
	 * @generated
	 */
	EAttribute getUnstructuredTextDefinition_Type1();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.UrlDefinition <em>Url Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Definition</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition
	 * @generated
	 */
	EClass getUrlDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UrlDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition#getValue()
	 * @see #getUrlDefinition()
	 * @generated
	 */
	EAttribute getUrlDefinition_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UrlDefinition#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition#getAccess()
	 * @see #getUrlDefinition()
	 * @generated
	 */
	EAttribute getUrlDefinition_Access();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UrlDefinition#getDateLastAccessed <em>Date Last Accessed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Accessed</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition#getDateLastAccessed()
	 * @see #getUrlDefinition()
	 * @generated
	 */
	EAttribute getUrlDefinition_DateLastAccessed();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UrlDefinition#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition#getDisplayLabel()
	 * @see #getUrlDefinition()
	 * @generated
	 */
	EAttribute getUrlDefinition_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UrlDefinition#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition#getNote()
	 * @see #getUrlDefinition()
	 * @generated
	 */
	EAttribute getUrlDefinition_Note();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.UrlDefinition#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see gov.loc.mods.mods.UrlDefinition#getUsage()
	 * @see #getUrlDefinition()
	 * @generated
	 */
	EAttribute getUrlDefinition_Usage();

	/**
	 * Returns the meta object for class '{@link gov.loc.mods.mods.XsString <em>Xs String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xs String</em>'.
	 * @see gov.loc.mods.mods.XsString
	 * @generated
	 */
	EClass getXsString();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.XsString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.loc.mods.mods.XsString#getValue()
	 * @see #getXsString()
	 * @generated
	 */
	EAttribute getXsString_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.XsString#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see gov.loc.mods.mods.XsString#getLang()
	 * @see #getXsString()
	 * @generated
	 */
	EAttribute getXsString_Lang();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.XsString#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see gov.loc.mods.mods.XsString#getLang1()
	 * @see #getXsString()
	 * @generated
	 */
	EAttribute getXsString_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.XsString#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gov.loc.mods.mods.XsString#getScript()
	 * @see #getXsString()
	 * @generated
	 */
	EAttribute getXsString_Script();

	/**
	 * Returns the meta object for the attribute '{@link gov.loc.mods.mods.XsString#getTransliteration <em>Transliteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transliteration</em>'.
	 * @see gov.loc.mods.mods.XsString#getTransliteration()
	 * @see #getXsString()
	 * @generated
	 */
	EAttribute getXsString_Transliteration();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.CodeOrTextDefinition <em>Code Or Text Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Code Or Text Definition</em>'.
	 * @see gov.loc.mods.mods.CodeOrTextDefinition
	 * @generated
	 */
	EEnum getCodeOrTextDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.DateEncodingAttributeDefinition <em>Date Encoding Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Encoding Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.DateEncodingAttributeDefinition
	 * @generated
	 */
	EEnum getDateEncodingAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.DatePointAttributeDefinition <em>Date Point Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Point Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.DatePointAttributeDefinition
	 * @generated
	 */
	EEnum getDatePointAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.DateQualifierAttributeDefinition <em>Date Qualifier Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Qualifier Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.DateQualifierAttributeDefinition
	 * @generated
	 */
	EEnum getDateQualifierAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.DigitalOriginDefinition <em>Digital Origin Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digital Origin Definition</em>'.
	 * @see gov.loc.mods.mods.DigitalOriginDefinition
	 * @generated
	 */
	EEnum getDigitalOriginDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition <em>Enumeration And Chronology Unit Type Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enumeration And Chronology Unit Type Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition
	 * @generated
	 */
	EEnum getEnumerationAndChronologyUnitTypeAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.IssuanceDefinition <em>Issuance Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issuance Definition</em>'.
	 * @see gov.loc.mods.mods.IssuanceDefinition
	 * @generated
	 */
	EEnum getIssuanceDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.LanguageAuthorityAttributeDefinition <em>Language Authority Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Authority Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.LanguageAuthorityAttributeDefinition
	 * @generated
	 */
	EEnum getLanguageAuthorityAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.ModsVersionAttributeDefinition <em>Mods Version Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mods Version Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.ModsVersionAttributeDefinition
	 * @generated
	 */
	EEnum getModsVersionAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.NamePartTypeAttributeDefinition <em>Name Part Type Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Part Type Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.NamePartTypeAttributeDefinition
	 * @generated
	 */
	EEnum getNamePartTypeAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.NameTypeAttributeDefinition <em>Name Type Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Type Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.NameTypeAttributeDefinition
	 * @generated
	 */
	EEnum getNameTypeAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.NoDefinition <em>No Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>No Definition</em>'.
	 * @see gov.loc.mods.mods.NoDefinition
	 * @generated
	 */
	EEnum getNoDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.PlaceAuthorityAttributeDefinition <em>Place Authority Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Place Authority Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
	 * @generated
	 */
	EEnum getPlaceAuthorityAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.ReformattingQualityDefinition <em>Reformatting Quality Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reformatting Quality Definition</em>'.
	 * @see gov.loc.mods.mods.ReformattingQualityDefinition
	 * @generated
	 */
	EEnum getReformattingQualityDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.RelatedItemTypeAttributeDefinition <em>Related Item Type Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Related Item Type Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.RelatedItemTypeAttributeDefinition
	 * @generated
	 */
	EEnum getRelatedItemTypeAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.ResourceTypeDefinition <em>Resource Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type Definition</em>'.
	 * @see gov.loc.mods.mods.ResourceTypeDefinition
	 * @generated
	 */
	EEnum getResourceTypeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.TitleInfoTypeAttributeDefinition <em>Title Info Type Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title Info Type Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
	 * @generated
	 */
	EEnum getTitleInfoTypeAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.UrlAccessAttributeDefinition <em>Url Access Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Url Access Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.UrlAccessAttributeDefinition
	 * @generated
	 */
	EEnum getUrlAccessAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.UrlUsageAttributeDefinition <em>Url Usage Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Url Usage Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.UrlUsageAttributeDefinition
	 * @generated
	 */
	EEnum getUrlUsageAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.UsageAttributeDefinition <em>Usage Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Attribute Definition</em>'.
	 * @see gov.loc.mods.mods.UsageAttributeDefinition
	 * @generated
	 */
	EEnum getUsageAttributeDefinition();

	/**
	 * Returns the meta object for enum '{@link gov.loc.mods.mods.YesDefinition <em>Yes Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Yes Definition</em>'.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @generated
	 */
	EEnum getYesDefinition();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.CodeOrTextDefinition <em>Code Or Text Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code Or Text Definition Object</em>'.
	 * @see gov.loc.mods.mods.CodeOrTextDefinition
	 * @model instanceClass="gov.loc.mods.mods.CodeOrTextDefinition"
	 *        extendedMetaData="name='codeOrTextDefinition:Object' baseType='codeOrTextDefinition'"
	 * @generated
	 */
	EDataType getCodeOrTextDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.DateEncodingAttributeDefinition <em>Date Encoding Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Encoding Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.DateEncodingAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.DateEncodingAttributeDefinition"
	 *        extendedMetaData="name='dateEncodingAttributeDefinition:Object' baseType='dateEncodingAttributeDefinition'"
	 * @generated
	 */
	EDataType getDateEncodingAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.DatePointAttributeDefinition <em>Date Point Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Point Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.DatePointAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.DatePointAttributeDefinition"
	 *        extendedMetaData="name='datePointAttributeDefinition:Object' baseType='datePointAttributeDefinition'"
	 * @generated
	 */
	EDataType getDatePointAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.DateQualifierAttributeDefinition <em>Date Qualifier Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Qualifier Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.DateQualifierAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.DateQualifierAttributeDefinition"
	 *        extendedMetaData="name='dateQualifierAttributeDefinition:Object' baseType='dateQualifierAttributeDefinition'"
	 * @generated
	 */
	EDataType getDateQualifierAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.DigitalOriginDefinition <em>Digital Origin Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Digital Origin Definition Object</em>'.
	 * @see gov.loc.mods.mods.DigitalOriginDefinition
	 * @model instanceClass="gov.loc.mods.mods.DigitalOriginDefinition"
	 *        extendedMetaData="name='digitalOriginDefinition:Object' baseType='digitalOriginDefinition'"
	 * @generated
	 */
	EDataType getDigitalOriginDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition <em>Enumeration And Chronology Unit Type Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enumeration And Chronology Unit Type Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition"
	 *        extendedMetaData="name='enumerationAndChronologyUnitTypeAttributeDefinition:Object' baseType='enumerationAndChronologyUnitTypeAttributeDefinition'"
	 * @generated
	 */
	EDataType getEnumerationAndChronologyUnitTypeAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.IssuanceDefinition <em>Issuance Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Issuance Definition Object</em>'.
	 * @see gov.loc.mods.mods.IssuanceDefinition
	 * @model instanceClass="gov.loc.mods.mods.IssuanceDefinition"
	 *        extendedMetaData="name='issuanceDefinition:Object' baseType='issuanceDefinition'"
	 * @generated
	 */
	EDataType getIssuanceDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.LanguageAuthorityAttributeDefinition <em>Language Authority Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Authority Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.LanguageAuthorityAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.LanguageAuthorityAttributeDefinition"
	 *        extendedMetaData="name='languageAuthorityAttributeDefinition:Object' baseType='languageAuthorityAttributeDefinition'"
	 * @generated
	 */
	EDataType getLanguageAuthorityAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.ModsVersionAttributeDefinition <em>Mods Version Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mods Version Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.ModsVersionAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.ModsVersionAttributeDefinition"
	 *        extendedMetaData="name='modsVersionAttributeDefinition:Object' baseType='modsVersionAttributeDefinition'"
	 * @generated
	 */
	EDataType getModsVersionAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.NamePartTypeAttributeDefinition <em>Name Part Type Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Part Type Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.NamePartTypeAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.NamePartTypeAttributeDefinition"
	 *        extendedMetaData="name='namePartTypeAttributeDefinition:Object' baseType='namePartTypeAttributeDefinition'"
	 * @generated
	 */
	EDataType getNamePartTypeAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.NameTypeAttributeDefinition <em>Name Type Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.NameTypeAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.NameTypeAttributeDefinition"
	 *        extendedMetaData="name='nameTypeAttributeDefinition:Object' baseType='nameTypeAttributeDefinition'"
	 * @generated
	 */
	EDataType getNameTypeAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.NoDefinition <em>No Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>No Definition Object</em>'.
	 * @see gov.loc.mods.mods.NoDefinition
	 * @model instanceClass="gov.loc.mods.mods.NoDefinition"
	 *        extendedMetaData="name='noDefinition:Object' baseType='noDefinition'"
	 * @generated
	 */
	EDataType getNoDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.PlaceAuthorityAttributeDefinition <em>Place Authority Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Place Authority Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.PlaceAuthorityAttributeDefinition"
	 *        extendedMetaData="name='placeAuthorityAttributeDefinition:Object' baseType='placeAuthorityAttributeDefinition'"
	 * @generated
	 */
	EDataType getPlaceAuthorityAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.ReformattingQualityDefinition <em>Reformatting Quality Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reformatting Quality Definition Object</em>'.
	 * @see gov.loc.mods.mods.ReformattingQualityDefinition
	 * @model instanceClass="gov.loc.mods.mods.ReformattingQualityDefinition"
	 *        extendedMetaData="name='reformattingQualityDefinition:Object' baseType='reformattingQualityDefinition'"
	 * @generated
	 */
	EDataType getReformattingQualityDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.RelatedItemTypeAttributeDefinition <em>Related Item Type Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Related Item Type Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.RelatedItemTypeAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.RelatedItemTypeAttributeDefinition"
	 *        extendedMetaData="name='relatedItemTypeAttributeDefinition:Object' baseType='relatedItemTypeAttributeDefinition'"
	 * @generated
	 */
	EDataType getRelatedItemTypeAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.ResourceTypeDefinition <em>Resource Type Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource Type Definition Object</em>'.
	 * @see gov.loc.mods.mods.ResourceTypeDefinition
	 * @model instanceClass="gov.loc.mods.mods.ResourceTypeDefinition"
	 *        extendedMetaData="name='resourceTypeDefinition:Object' baseType='resourceTypeDefinition'"
	 * @generated
	 */
	EDataType getResourceTypeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.TitleInfoTypeAttributeDefinition <em>Title Info Type Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Title Info Type Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.TitleInfoTypeAttributeDefinition"
	 *        extendedMetaData="name='titleInfoTypeAttributeDefinition:Object' baseType='titleInfoTypeAttributeDefinition'"
	 * @generated
	 */
	EDataType getTitleInfoTypeAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.UrlAccessAttributeDefinition <em>Url Access Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Access Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.UrlAccessAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.UrlAccessAttributeDefinition"
	 *        extendedMetaData="name='urlAccessAttributeDefinition:Object' baseType='urlAccessAttributeDefinition'"
	 * @generated
	 */
	EDataType getUrlAccessAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.UrlUsageAttributeDefinition <em>Url Usage Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Usage Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.UrlUsageAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.UrlUsageAttributeDefinition"
	 *        extendedMetaData="name='urlUsageAttributeDefinition:Object' baseType='urlUsageAttributeDefinition'"
	 * @generated
	 */
	EDataType getUrlUsageAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.UsageAttributeDefinition <em>Usage Attribute Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Usage Attribute Definition Object</em>'.
	 * @see gov.loc.mods.mods.UsageAttributeDefinition
	 * @model instanceClass="gov.loc.mods.mods.UsageAttributeDefinition"
	 *        extendedMetaData="name='usageAttributeDefinition:Object' baseType='usageAttributeDefinition'"
	 * @generated
	 */
	EDataType getUsageAttributeDefinitionObject();

	/**
	 * Returns the meta object for data type '{@link gov.loc.mods.mods.YesDefinition <em>Yes Definition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Yes Definition Object</em>'.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @model instanceClass="gov.loc.mods.mods.YesDefinition"
	 *        extendedMetaData="name='yesDefinition:Object' baseType='yesDefinition'"
	 * @generated
	 */
	EDataType getYesDefinitionObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MODSFactory getMODSFactory();

} //MODSPackage
