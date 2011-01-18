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
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MODSPackageImpl extends EPackageImpl implements MODSPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected String packageFilename = "mods.ecore";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessConditionDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cartographicsDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classificationDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass copyInformationDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateBaseDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateOtherDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass detailDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationAndChronologyDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extensionDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extentDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genreDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass geographicCodeDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hierarchicalGeographicDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass holdingSimpleDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifierDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass languageDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass languageTermDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass locationDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modsCollectionDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modsDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameBaseDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namePartDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass noteBaseDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass noteDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass originInfoDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass partDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalDescriptionDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalLocationDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass placeDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass placeTermDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recordIdentifierDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recordInfoDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relatedItemDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleTermDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptTermDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringPlusAuthorityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringPlusAuthorityPlusTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringPlusAuthorityPlusTypePlusDisplayLabelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringPlusSuppliedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subjectDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subjectNameDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subjectTitleInfoDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableOfContentsDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetAudienceDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass temporalDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass titleInfoBaseDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass titleInfoDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeOfResourceDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unstructuredTextDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass urlDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xsStringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum codeOrTextDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dateEncodingAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum datePointAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dateQualifierAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum digitalOriginDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum enumerationAndChronologyUnitTypeAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum issuanceDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum languageAuthorityAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum modsVersionAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum namePartTypeAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum nameTypeAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum noDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum placeAuthorityAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reformattingQualityDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum relatedItemTypeAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum resourceTypeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum titleInfoTypeAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum urlAccessAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum urlUsageAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum usageAttributeDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum yesDefinitionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType codeOrTextDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType dateEncodingAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType datePointAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType dateQualifierAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType digitalOriginDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType enumerationAndChronologyUnitTypeAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType issuanceDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType languageAuthorityAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType modsVersionAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType namePartTypeAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nameTypeAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType noDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType placeAuthorityAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reformattingQualityDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType relatedItemTypeAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType resourceTypeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType titleInfoTypeAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType urlAccessAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType urlUsageAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType usageAttributeDefinitionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType yesDefinitionObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see gov.loc.mods.mods.MODSPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MODSPackageImpl() {
	super(eNS_URI, MODSFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link MODSPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static MODSPackage init() {
	if (isInited)
	    return (MODSPackage) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI);

	// Obtain or create and register package
	MODSPackageImpl theMODSPackage = (MODSPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MODSPackageImpl ? EPackage.Registry.INSTANCE
			.get(eNS_URI) : new MODSPackageImpl());

	isInited = true;

	// Initialize simple dependencies
	XlinkPackage.eINSTANCE.eClass();
	XMLNamespacePackage.eINSTANCE.eClass();
	XMLTypePackage.eINSTANCE.eClass();

	// Load packages
	theMODSPackage.loadPackage();

	// Fix loaded packages
	theMODSPackage.fixPackageContents();

	// Mark meta-data to indicate it can't be changed
	theMODSPackage.freeze();

	// Update the registry and return the package
	EPackage.Registry.INSTANCE.put(MODSPackage.eNS_URI, theMODSPackage);
	return theMODSPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDefinition() {
	if (abstractDefinitionEClass == null) {
	    abstractDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(0);
	}
	return abstractDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractDefinition_AltRepGroup() {
	return (EAttribute) getAbstractDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractDefinition_Shareable() {
	return (EAttribute) getAbstractDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessConditionDefinition() {
	if (accessConditionDefinitionEClass == null) {
	    accessConditionDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(1);
	}
	return accessConditionDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Actuate() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_AltRepGroup() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Arcrole() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Href() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Lang() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Lang1() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Role() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Script() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Show() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Title() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Transliteration() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Type() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessConditionDefinition_Type1() {
	return (EAttribute) getAccessConditionDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCartographicsDefinition() {
	if (cartographicsDefinitionEClass == null) {
	    cartographicsDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(2);
	}
	return cartographicsDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCartographicsDefinition_Scale() {
	return (EReference) getCartographicsDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCartographicsDefinition_Projection() {
	return (EReference) getCartographicsDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCartographicsDefinition_Coordinates() {
	return (EReference) getCartographicsDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCartographicsDefinition_Authority() {
	return (EAttribute) getCartographicsDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCartographicsDefinition_AuthorityURI() {
	return (EAttribute) getCartographicsDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCartographicsDefinition_ValueURI() {
	return (EAttribute) getCartographicsDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassificationDefinition() {
	if (classificationDefinitionEClass == null) {
	    classificationDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(3);
	}
	return classificationDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassificationDefinition_AltRepGroup() {
	return (EAttribute) getClassificationDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassificationDefinition_DisplayLabel() {
	return (EAttribute) getClassificationDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassificationDefinition_Edition() {
	return (EAttribute) getClassificationDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassificationDefinition_Usage() {
	return (EAttribute) getClassificationDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCopyInformationDefinition() {
	if (copyInformationDefinitionEClass == null) {
	    copyInformationDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(6);
	}
	return copyInformationDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCopyInformationDefinition_Form() {
	return (EReference) getCopyInformationDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCopyInformationDefinition_SubLocation() {
	return (EReference) getCopyInformationDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCopyInformationDefinition_ShelfLocator() {
	return (EReference) getCopyInformationDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCopyInformationDefinition_ElectronicLocator() {
	return (EReference) getCopyInformationDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCopyInformationDefinition_Note() {
	return (EReference) getCopyInformationDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCopyInformationDefinition_EnumerationAndChronology() {
	return (EReference) getCopyInformationDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateBaseDefinition() {
	if (dateBaseDefinitionEClass == null) {
	    dateBaseDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(7);
	}
	return dateBaseDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateBaseDefinition_Encoding() {
	return (EAttribute) getDateBaseDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateBaseDefinition_Point() {
	return (EAttribute) getDateBaseDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateBaseDefinition_Qualifier() {
	return (EAttribute) getDateBaseDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateDefinition() {
	if (dateDefinitionEClass == null) {
	    dateDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(8);
	}
	return dateDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateDefinition_KeyDate() {
	return (EAttribute) getDateDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateOtherDefinition() {
	if (dateOtherDefinitionEClass == null) {
	    dateOtherDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(11);
	}
	return dateOtherDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateOtherDefinition_Type() {
	return (EAttribute) getDateOtherDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDetailDefinition() {
	if (detailDefinitionEClass == null) {
	    detailDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(16);
	}
	return detailDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDetailDefinition_Group() {
	return (EAttribute) getDetailDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDetailDefinition_Number() {
	return (EReference) getDetailDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDetailDefinition_Caption() {
	return (EReference) getDetailDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDetailDefinition_Title() {
	return (EReference) getDetailDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDetailDefinition_Level() {
	return (EAttribute) getDetailDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDetailDefinition_Type() {
	return (EAttribute) getDetailDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
	if (documentRootEClass == null) {
	    documentRootEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI).getEClassifiers()
			    .get(19);
	}
	return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
	return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Abstract() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_AccessCondition() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Affiliation() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Area() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Caption() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Cartographics() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_City() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CitySection() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Classification() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Continent() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Coordinates() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CopyInformation() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CopyrightDate() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Country() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_County() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Date() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DateCaptured() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DateCreated() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DateIssued() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DateModified() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DateOther() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DateValid() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Description() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DescriptionStandard() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Detail() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_DigitalOrigin() {
	return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DisplayForm() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Edition() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ElectronicLocator() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_End() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EnumerationAndChronology() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Extension() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Extent() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ExtraterrestrialArea() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Form() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Frequency() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Genre() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Geographic() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GeographicCode() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_HierarchicalGeographic() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_HoldingExternal() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_HoldingSimple() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Identifier() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_InternetMediaType() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Island() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Issuance() {
	return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Language() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LanguageOfCataloging() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(50);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LanguageTerm() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(51);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_List() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(52);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Location() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(53);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Mods() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(54);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ModsCollection() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(55);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Name() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(56);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_NamePart() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(57);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_NonSort() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(58);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Note() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(59);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Number() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(60);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Occupation() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(61);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OriginInfo() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(62);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Part() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(63);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PartName() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(64);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PartNumber() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(65);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PhysicalDescription() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(66);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PhysicalLocation() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(67);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Place() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(68);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PlaceTerm() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(69);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Projection() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(70);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Province() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(71);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Publisher() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(72);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RecordChangeDate() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(73);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RecordContentSource() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(74);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RecordCreationDate() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(75);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RecordIdentifier() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(76);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RecordInfo() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(77);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RecordOrigin() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(78);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_ReformattingQuality() {
	return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(79);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Region() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(80);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RelatedItem() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(81);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Role() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(82);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RoleTerm() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(83);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Scale() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(84);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ScriptTerm() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(85);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ShelfLocator() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(86);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Start() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(87);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_State() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(88);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Subject() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(89);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SubLocation() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(90);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SubTitle() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(91);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TableOfContents() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(92);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TargetAudience() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(93);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Temporal() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(94);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Territory() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(95);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Text() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(96);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Title() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(97);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TitleInfo() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(98);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Topic() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(99);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Total() {
	return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(100);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TypeOfResource() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(101);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Url() {
	return (EReference) getDocumentRoot().getEStructuralFeatures().get(102);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumerationAndChronologyDefinition() {
	if (enumerationAndChronologyDefinitionEClass == null) {
	    enumerationAndChronologyDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(20);
	}
	return enumerationAndChronologyDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumerationAndChronologyDefinition_UnitType() {
	return (EAttribute) getEnumerationAndChronologyDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtensionDefinition() {
	if (extensionDefinitionEClass == null) {
	    extensionDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(23);
	}
	return extensionDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtensionDefinition_Mixed() {
	return (EAttribute) getExtensionDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtensionDefinition_Any() {
	return (EAttribute) getExtensionDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtensionDefinition_DisplayLabel() {
	return (EAttribute) getExtensionDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtentDefinition() {
	if (extentDefinitionEClass == null) {
	    extentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(24);
	}
	return extentDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtentDefinition_Start() {
	return (EReference) getExtentDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtentDefinition_End() {
	return (EReference) getExtentDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtentDefinition_Total() {
	return (EAttribute) getExtentDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtentDefinition_List() {
	return (EReference) getExtentDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtentDefinition_Unit() {
	return (EAttribute) getExtentDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenreDefinition() {
	if (genreDefinitionEClass == null) {
	    genreDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(25);
	}
	return genreDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenreDefinition_AltRepGroup() {
	return (EAttribute) getGenreDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenreDefinition_Usage() {
	return (EAttribute) getGenreDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeographicCodeDefinition() {
	if (geographicCodeDefinitionEClass == null) {
	    geographicCodeDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(26);
	}
	return geographicCodeDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeographicCodeDefinition_Authority() {
	return (EAttribute) getGeographicCodeDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeographicCodeDefinition_AuthorityURI() {
	return (EAttribute) getGeographicCodeDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeographicCodeDefinition_ValueURI() {
	return (EAttribute) getGeographicCodeDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHierarchicalGeographicDefinition() {
	if (hierarchicalGeographicDefinitionEClass == null) {
	    hierarchicalGeographicDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(27);
	}
	return hierarchicalGeographicDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHierarchicalGeographicDefinition_Group() {
	return (EAttribute) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_ExtraterrestrialArea() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Continent() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Country() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Province() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Region() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_State() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Territory() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_County() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_City() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_CitySection() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Island() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHierarchicalGeographicDefinition_Area() {
	return (EReference) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHierarchicalGeographicDefinition_Authority() {
	return (EAttribute) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHierarchicalGeographicDefinition_AuthorityURI() {
	return (EAttribute) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHierarchicalGeographicDefinition_ValueURI() {
	return (EAttribute) getHierarchicalGeographicDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHoldingSimpleDefinition() {
	if (holdingSimpleDefinitionEClass == null) {
	    holdingSimpleDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(28);
	}
	return holdingSimpleDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getHoldingSimpleDefinition_CopyInformation() {
	return (EReference) getHoldingSimpleDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentifierDefinition() {
	if (identifierDefinitionEClass == null) {
	    identifierDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(29);
	}
	return identifierDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifierDefinition_AltRepGroup() {
	return (EAttribute) getIdentifierDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifierDefinition_DisplayLabel() {
	return (EAttribute) getIdentifierDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifierDefinition_Invalid() {
	return (EAttribute) getIdentifierDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifierDefinition_Type() {
	return (EAttribute) getIdentifierDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLanguageDefinition() {
	if (languageDefinitionEClass == null) {
	    languageDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(34);
	}
	return languageDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLanguageDefinition_LanguageTerm() {
	return (EReference) getLanguageDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLanguageDefinition_ScriptTerm() {
	return (EReference) getLanguageDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_AltRepGroup() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_DisplayLabel() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_Lang() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_Lang1() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_ObjectPart() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_Script() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_Transliteration() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageDefinition_Usage() {
	return (EAttribute) getLanguageDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLanguageTermDefinition() {
	if (languageTermDefinitionEClass == null) {
	    languageTermDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(35);
	}
	return languageTermDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageTermDefinition_Authority() {
	return (EAttribute) getLanguageTermDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageTermDefinition_AuthorityURI() {
	return (EAttribute) getLanguageTermDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageTermDefinition_Type() {
	return (EAttribute) getLanguageTermDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLanguageTermDefinition_ValueURI() {
	return (EAttribute) getLanguageTermDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocationDefinition() {
	if (locationDefinitionEClass == null) {
	    locationDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(36);
	}
	return locationDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationDefinition_PhysicalLocation() {
	return (EReference) getLocationDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationDefinition_ShelfLocator() {
	return (EReference) getLocationDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationDefinition_Url() {
	return (EReference) getLocationDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationDefinition_HoldingSimple() {
	return (EReference) getLocationDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationDefinition_HoldingExternal() {
	return (EReference) getLocationDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationDefinition_AltRepGroup() {
	return (EAttribute) getLocationDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationDefinition_DisplayLabel() {
	return (EAttribute) getLocationDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationDefinition_Lang() {
	return (EAttribute) getLocationDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationDefinition_Lang1() {
	return (EAttribute) getLocationDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationDefinition_Script() {
	return (EAttribute) getLocationDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationDefinition_Transliteration() {
	return (EAttribute) getLocationDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModsCollectionDefinition() {
	if (modsCollectionDefinitionEClass == null) {
	    modsCollectionDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(37);
	}
	return modsCollectionDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsCollectionDefinition_Mods() {
	return (EReference) getModsCollectionDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModsDefinition() {
	if (modsDefinitionEClass == null) {
	    modsDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(38);
	}
	return modsDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModsDefinition_ModsGroup() {
	return (EAttribute) getModsDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Abstract() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_AccessCondition() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Classification() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Extension() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Genre() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Identifier() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Language() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Location() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Name() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Note() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_OriginInfo() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Part() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_PhysicalDescription() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_RecordInfo() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_RelatedItem() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_Subject() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_TableOfContents() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_TargetAudience() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_TitleInfo() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModsDefinition_TypeOfResource() {
	return (EReference) getModsDefinition().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModsDefinition_ID() {
	return (EAttribute) getModsDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModsDefinition_Version() {
	return (EAttribute) getModsDefinition().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNameBaseDefinition() {
	if (nameBaseDefinitionEClass == null) {
	    nameBaseDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(41);
	}
	return nameBaseDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Group() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNameBaseDefinition_NamePart() {
	return (EReference) getNameBaseDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNameBaseDefinition_DisplayForm() {
	return (EReference) getNameBaseDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNameBaseDefinition_Affiliation() {
	return (EReference) getNameBaseDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNameBaseDefinition_Role() {
	return (EReference) getNameBaseDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNameBaseDefinition_Description() {
	return (EReference) getNameBaseDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Actuate() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Arcrole() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Authority() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_AuthorityURI() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_DisplayLabel() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Href() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_ID() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Lang() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Lang1() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Role1() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Script() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Show() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Title() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Transliteration() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Type() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_Type1() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameBaseDefinition_ValueURI() {
	return (EAttribute) getNameBaseDefinition().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNameDefinition() {
	if (nameDefinitionEClass == null) {
	    nameDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(42);
	}
	return nameDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameDefinition_AltRepGroup() {
	return (EAttribute) getNameDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameDefinition_NameTitleGroup() {
	return (EAttribute) getNameDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNameDefinition_Usage() {
	return (EAttribute) getNameDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamePartDefinition() {
	if (namePartDefinitionEClass == null) {
	    namePartDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(43);
	}
	return namePartDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamePartDefinition_Type() {
	return (EAttribute) getNamePartDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNoteBaseDefinition() {
	if (noteBaseDefinitionEClass == null) {
	    noteBaseDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(50);
	}
	return noteBaseDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNoteBaseDefinition_ID() {
	return (EAttribute) getNoteBaseDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNoteDefinition() {
	if (noteDefinitionEClass == null) {
	    noteDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(51);
	}
	return noteDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNoteDefinition_AltRepGroup() {
	return (EAttribute) getNoteDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOriginInfoDefinition() {
	if (originInfoDefinitionEClass == null) {
	    originInfoDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(52);
	}
	return originInfoDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_Group() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_Place() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_Publisher() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_DateIssued() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_DateCreated() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_DateCaptured() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_DateValid() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_DateModified() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_CopyrightDate() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_DateOther() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_Edition() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_Issuance() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOriginInfoDefinition_Frequency() {
	return (EReference) getOriginInfoDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_AltRepGroup() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_DisplayLabel() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_Lang() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_Lang1() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_Script() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOriginInfoDefinition_Transliteration() {
	return (EAttribute) getOriginInfoDefinition().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPartDefinition() {
	if (partDefinitionEClass == null) {
	    partDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(53);
	}
	return partDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Group() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPartDefinition_Detail() {
	return (EReference) getPartDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPartDefinition_Extent() {
	return (EReference) getPartDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPartDefinition_Date() {
	return (EReference) getPartDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPartDefinition_Text() {
	return (EReference) getPartDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_AltRepGroup() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_DisplayLabel() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_ID() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Lang() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Lang1() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Order() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Script() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Transliteration() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartDefinition_Type() {
	return (EAttribute) getPartDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalDescriptionDefinition() {
	if (physicalDescriptionDefinitionEClass == null) {
	    physicalDescriptionDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(54);
	}
	return physicalDescriptionDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_Group() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPhysicalDescriptionDefinition_Form() {
	return (EReference) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_ReformattingQuality() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPhysicalDescriptionDefinition_InternetMediaType() {
	return (EReference) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPhysicalDescriptionDefinition_Extent() {
	return (EReference) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_DigitalOrigin() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPhysicalDescriptionDefinition_Note() {
	return (EReference) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_AltRepGroup() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_DisplayLabel() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_Lang() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_Lang1() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_Script() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhysicalDescriptionDefinition_Transliteration() {
	return (EAttribute) getPhysicalDescriptionDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalLocationDefinition() {
	if (physicalLocationDefinitionEClass == null) {
	    physicalLocationDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(55);
	}
	return physicalLocationDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPlaceDefinition() {
	if (placeDefinitionEClass == null) {
	    placeDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(58);
	}
	return placeDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPlaceDefinition_PlaceTerm() {
	return (EReference) getPlaceDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlaceDefinition_Supplied() {
	return (EAttribute) getPlaceDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPlaceTermDefinition() {
	if (placeTermDefinitionEClass == null) {
	    placeTermDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(59);
	}
	return placeTermDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlaceTermDefinition_Authority() {
	return (EAttribute) getPlaceTermDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlaceTermDefinition_AuthorityURI() {
	return (EAttribute) getPlaceTermDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlaceTermDefinition_Type() {
	return (EAttribute) getPlaceTermDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlaceTermDefinition_ValueURI() {
	return (EAttribute) getPlaceTermDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecordIdentifierDefinition() {
	if (recordIdentifierDefinitionEClass == null) {
	    recordIdentifierDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(60);
	}
	return recordIdentifierDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordIdentifierDefinition_Source() {
	return (EAttribute) getRecordIdentifierDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecordInfoDefinition() {
	if (recordInfoDefinitionEClass == null) {
	    recordInfoDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(61);
	}
	return recordInfoDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_Group() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_RecordContentSource() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_RecordCreationDate() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_RecordChangeDate() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_RecordIdentifier() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_LanguageOfCataloging() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_RecordOrigin() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordInfoDefinition_DescriptionStandard() {
	return (EReference) getRecordInfoDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_AltRepGroup() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_DisplayLabel() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_Lang() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_Lang1() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_Script() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordInfoDefinition_Transliteration() {
	return (EAttribute) getRecordInfoDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelatedItemDefinition() {
	if (relatedItemDefinitionEClass == null) {
	    relatedItemDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(64);
	}
	return relatedItemDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_ModsGroup() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Abstract() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_AccessCondition() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Classification() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Extension() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Genre() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Identifier() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Language() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Location() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Name() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Note() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_OriginInfo() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Part() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_PhysicalDescription() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_RecordInfo() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_RelatedItem() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_Subject() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_TableOfContents() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_TargetAudience() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_TitleInfo() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelatedItemDefinition_TypeOfResource() {
	return (EReference) getRelatedItemDefinition().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Actuate() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Arcrole() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_DisplayLabel() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Href() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_ID() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Role() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Show() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Title() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Type() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelatedItemDefinition_Type1() {
	return (EAttribute) getRelatedItemDefinition().getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleDefinition() {
	if (roleDefinitionEClass == null) {
	    roleDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(69);
	}
	return roleDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRoleDefinition_Group() {
	return (EAttribute) getRoleDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleDefinition_RoleTerm() {
	return (EReference) getRoleDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleTermDefinition() {
	if (roleTermDefinitionEClass == null) {
	    roleTermDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(70);
	}
	return roleTermDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRoleTermDefinition_Type() {
	return (EAttribute) getRoleTermDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScriptTermDefinition() {
	if (scriptTermDefinitionEClass == null) {
	    scriptTermDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(71);
	}
	return scriptTermDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScriptTermDefinition_Type() {
	return (EAttribute) getScriptTermDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringPlusAuthority() {
	if (stringPlusAuthorityEClass == null) {
	    stringPlusAuthorityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(72);
	}
	return stringPlusAuthorityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthority_Authority() {
	return (EAttribute) getStringPlusAuthority().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthority_AuthorityURI() {
	return (EAttribute) getStringPlusAuthority().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthority_ValueURI() {
	return (EAttribute) getStringPlusAuthority().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringPlusAuthorityPlusType() {
	if (stringPlusAuthorityPlusTypeEClass == null) {
	    stringPlusAuthorityPlusTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(73);
	}
	return stringPlusAuthorityPlusTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusType_Type() {
	return (EAttribute) getStringPlusAuthorityPlusType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringPlusAuthorityPlusTypePlusDisplayLabel() {
	if (stringPlusAuthorityPlusTypePlusDisplayLabelEClass == null) {
	    stringPlusAuthorityPlusTypePlusDisplayLabelEClass = (EClass) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(74);
	}
	return stringPlusAuthorityPlusTypePlusDisplayLabelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabel_DisplayLabel() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabel().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink() {
	if (stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkEClass == null) {
	    stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkEClass = (EClass) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(75);
	}
	return stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Actuate() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Arcrole() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Href() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Role() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Show() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Title() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Type1() {
	return (EAttribute) getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringPlusSupplied() {
	if (stringPlusSuppliedEClass == null) {
	    stringPlusSuppliedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(76);
	}
	return stringPlusSuppliedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringPlusSupplied_Supplied() {
	return (EAttribute) getStringPlusSupplied().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubjectDefinition() {
	if (subjectDefinitionEClass == null) {
	    subjectDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(77);
	}
	return subjectDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Group() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Topic() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Geographic() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Temporal() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_TitleInfo() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Name() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_GeographicCode() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_HierarchicalGeographic() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Cartographics() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Occupation() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectDefinition_Genre() {
	return (EReference) getSubjectDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Actuate() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_AltRepGroup() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Arcrole() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Authority() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_AuthorityURI() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_DisplayLabel() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Href() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_ID() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Lang() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Lang1() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Role() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Script() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Show() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Title() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Transliteration() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Type() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_Usage() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectDefinition_ValueURI() {
	return (EAttribute) getSubjectDefinition().getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubjectNameDefinition() {
	if (subjectNameDefinitionEClass == null) {
	    subjectNameDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(78);
	}
	return subjectNameDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubjectTitleInfoDefinition() {
	if (subjectTitleInfoDefinitionEClass == null) {
	    subjectTitleInfoDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(79);
	}
	return subjectTitleInfoDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubjectTitleInfoDefinition_Type1() {
	return (EAttribute) getSubjectTitleInfoDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableOfContentsDefinition() {
	if (tableOfContentsDefinitionEClass == null) {
	    tableOfContentsDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(80);
	}
	return tableOfContentsDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTableOfContentsDefinition_AltRepGroup() {
	return (EAttribute) getTableOfContentsDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTableOfContentsDefinition_Shareable() {
	return (EAttribute) getTableOfContentsDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTargetAudienceDefinition() {
	if (targetAudienceDefinitionEClass == null) {
	    targetAudienceDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(81);
	}
	return targetAudienceDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTargetAudienceDefinition_AltRepGroup() {
	return (EAttribute) getTargetAudienceDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTargetAudienceDefinition_DisplayLabel() {
	return (EAttribute) getTargetAudienceDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTemporalDefinition() {
	if (temporalDefinitionEClass == null) {
	    temporalDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(82);
	}
	return temporalDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTemporalDefinition_Authority() {
	return (EAttribute) getTemporalDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTemporalDefinition_AuthorityURI() {
	return (EAttribute) getTemporalDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTemporalDefinition_ValueURI() {
	return (EAttribute) getTemporalDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTitleInfoBaseDefinition() {
	if (titleInfoBaseDefinitionEClass == null) {
	    titleInfoBaseDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(83);
	}
	return titleInfoBaseDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Group() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTitleInfoBaseDefinition_Title() {
	return (EReference) getTitleInfoBaseDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTitleInfoBaseDefinition_SubTitle() {
	return (EReference) getTitleInfoBaseDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTitleInfoBaseDefinition_PartNumber() {
	return (EReference) getTitleInfoBaseDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTitleInfoBaseDefinition_PartName() {
	return (EReference) getTitleInfoBaseDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTitleInfoBaseDefinition_NonSort() {
	return (EReference) getTitleInfoBaseDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Actuate() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Arcrole() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Authority() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_AuthorityURI() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_DisplayLabel() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Href() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_ID() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Lang() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Lang1() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Role() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Script() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Show() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Title1() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Transliteration() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_Type() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoBaseDefinition_ValueURI() {
	return (EAttribute) getTitleInfoBaseDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTitleInfoDefinition() {
	if (titleInfoDefinitionEClass == null) {
	    titleInfoDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(84);
	}
	return titleInfoDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoDefinition_AltRepGroup() {
	return (EAttribute) getTitleInfoDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoDefinition_NameTitleGroup() {
	return (EAttribute) getTitleInfoDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoDefinition_Supplied() {
	return (EAttribute) getTitleInfoDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoDefinition_Type1() {
	return (EAttribute) getTitleInfoDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTitleInfoDefinition_Usage() {
	return (EAttribute) getTitleInfoDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeOfResourceDefinition() {
	if (typeOfResourceDefinitionEClass == null) {
	    typeOfResourceDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(87);
	}
	return typeOfResourceDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeOfResourceDefinition_Value() {
	return (EAttribute) getTypeOfResourceDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeOfResourceDefinition_AltRepGroup() {
	return (EAttribute) getTypeOfResourceDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeOfResourceDefinition_Collection() {
	return (EAttribute) getTypeOfResourceDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeOfResourceDefinition_DisplayLabel() {
	return (EAttribute) getTypeOfResourceDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeOfResourceDefinition_Manuscript() {
	return (EAttribute) getTypeOfResourceDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeOfResourceDefinition_Usage() {
	return (EAttribute) getTypeOfResourceDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnstructuredTextDefinition() {
	if (unstructuredTextDefinitionEClass == null) {
	    unstructuredTextDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(88);
	}
	return unstructuredTextDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Actuate() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Arcrole() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_DisplayLabel() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Href() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Role() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Show() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Title() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Type() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnstructuredTextDefinition_Type1() {
	return (EAttribute) getUnstructuredTextDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUrlDefinition() {
	if (urlDefinitionEClass == null) {
	    urlDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(91);
	}
	return urlDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlDefinition_Value() {
	return (EAttribute) getUrlDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlDefinition_Access() {
	return (EAttribute) getUrlDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlDefinition_DateLastAccessed() {
	return (EAttribute) getUrlDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlDefinition_DisplayLabel() {
	return (EAttribute) getUrlDefinition().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlDefinition_Note() {
	return (EAttribute) getUrlDefinition().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUrlDefinition_Usage() {
	return (EAttribute) getUrlDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXsString() {
	if (xsStringEClass == null) {
	    xsStringEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI).getEClassifiers()
			    .get(96);
	}
	return xsStringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXsString_Value() {
	return (EAttribute) getXsString().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXsString_Lang() {
	return (EAttribute) getXsString().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXsString_Lang1() {
	return (EAttribute) getXsString().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXsString_Script() {
	return (EAttribute) getXsString().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXsString_Transliteration() {
	return (EAttribute) getXsString().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCodeOrTextDefinition() {
	if (codeOrTextDefinitionEEnum == null) {
	    codeOrTextDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(4);
	}
	return codeOrTextDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDateEncodingAttributeDefinition() {
	if (dateEncodingAttributeDefinitionEEnum == null) {
	    dateEncodingAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(9);
	}
	return dateEncodingAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDatePointAttributeDefinition() {
	if (datePointAttributeDefinitionEEnum == null) {
	    datePointAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(12);
	}
	return datePointAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDateQualifierAttributeDefinition() {
	if (dateQualifierAttributeDefinitionEEnum == null) {
	    dateQualifierAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(14);
	}
	return dateQualifierAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDigitalOriginDefinition() {
	if (digitalOriginDefinitionEEnum == null) {
	    digitalOriginDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(17);
	}
	return digitalOriginDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getEnumerationAndChronologyUnitTypeAttributeDefinition() {
	if (enumerationAndChronologyUnitTypeAttributeDefinitionEEnum == null) {
	    enumerationAndChronologyUnitTypeAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(21);
	}
	return enumerationAndChronologyUnitTypeAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIssuanceDefinition() {
	if (issuanceDefinitionEEnum == null) {
	    issuanceDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(30);
	}
	return issuanceDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLanguageAuthorityAttributeDefinition() {
	if (languageAuthorityAttributeDefinitionEEnum == null) {
	    languageAuthorityAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(32);
	}
	return languageAuthorityAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getModsVersionAttributeDefinition() {
	if (modsVersionAttributeDefinitionEEnum == null) {
	    modsVersionAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(39);
	}
	return modsVersionAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNamePartTypeAttributeDefinition() {
	if (namePartTypeAttributeDefinitionEEnum == null) {
	    namePartTypeAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(44);
	}
	return namePartTypeAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNameTypeAttributeDefinition() {
	if (nameTypeAttributeDefinitionEEnum == null) {
	    nameTypeAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(46);
	}
	return nameTypeAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNoDefinition() {
	if (noDefinitionEEnum == null) {
	    noDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI).getEClassifiers()
			    .get(48);
	}
	return noDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPlaceAuthorityAttributeDefinition() {
	if (placeAuthorityAttributeDefinitionEEnum == null) {
	    placeAuthorityAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(56);
	}
	return placeAuthorityAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getReformattingQualityDefinition() {
	if (reformattingQualityDefinitionEEnum == null) {
	    reformattingQualityDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(62);
	}
	return reformattingQualityDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRelatedItemTypeAttributeDefinition() {
	if (relatedItemTypeAttributeDefinitionEEnum == null) {
	    relatedItemTypeAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(65);
	}
	return relatedItemTypeAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getResourceTypeDefinition() {
	if (resourceTypeDefinitionEEnum == null) {
	    resourceTypeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(67);
	}
	return resourceTypeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTitleInfoTypeAttributeDefinition() {
	if (titleInfoTypeAttributeDefinitionEEnum == null) {
	    titleInfoTypeAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(85);
	}
	return titleInfoTypeAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUrlAccessAttributeDefinition() {
	if (urlAccessAttributeDefinitionEEnum == null) {
	    urlAccessAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(89);
	}
	return urlAccessAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUrlUsageAttributeDefinition() {
	if (urlUsageAttributeDefinitionEEnum == null) {
	    urlUsageAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(92);
	}
	return urlUsageAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUsageAttributeDefinition() {
	if (usageAttributeDefinitionEEnum == null) {
	    usageAttributeDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(94);
	}
	return usageAttributeDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getYesDefinition() {
	if (yesDefinitionEEnum == null) {
	    yesDefinitionEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI).getEClassifiers()
			    .get(97);
	}
	return yesDefinitionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getCodeOrTextDefinitionObject() {
	if (codeOrTextDefinitionObjectEDataType == null) {
	    codeOrTextDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(5);
	}
	return codeOrTextDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDateEncodingAttributeDefinitionObject() {
	if (dateEncodingAttributeDefinitionObjectEDataType == null) {
	    dateEncodingAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(10);
	}
	return dateEncodingAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDatePointAttributeDefinitionObject() {
	if (datePointAttributeDefinitionObjectEDataType == null) {
	    datePointAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(13);
	}
	return datePointAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDateQualifierAttributeDefinitionObject() {
	if (dateQualifierAttributeDefinitionObjectEDataType == null) {
	    dateQualifierAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(15);
	}
	return dateQualifierAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDigitalOriginDefinitionObject() {
	if (digitalOriginDefinitionObjectEDataType == null) {
	    digitalOriginDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(18);
	}
	return digitalOriginDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEnumerationAndChronologyUnitTypeAttributeDefinitionObject() {
	if (enumerationAndChronologyUnitTypeAttributeDefinitionObjectEDataType == null) {
	    enumerationAndChronologyUnitTypeAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(22);
	}
	return enumerationAndChronologyUnitTypeAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIssuanceDefinitionObject() {
	if (issuanceDefinitionObjectEDataType == null) {
	    issuanceDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(31);
	}
	return issuanceDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLanguageAuthorityAttributeDefinitionObject() {
	if (languageAuthorityAttributeDefinitionObjectEDataType == null) {
	    languageAuthorityAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(33);
	}
	return languageAuthorityAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getModsVersionAttributeDefinitionObject() {
	if (modsVersionAttributeDefinitionObjectEDataType == null) {
	    modsVersionAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(40);
	}
	return modsVersionAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNamePartTypeAttributeDefinitionObject() {
	if (namePartTypeAttributeDefinitionObjectEDataType == null) {
	    namePartTypeAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(45);
	}
	return namePartTypeAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNameTypeAttributeDefinitionObject() {
	if (nameTypeAttributeDefinitionObjectEDataType == null) {
	    nameTypeAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(47);
	}
	return nameTypeAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNoDefinitionObject() {
	if (noDefinitionObjectEDataType == null) {
	    noDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(49);
	}
	return noDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPlaceAuthorityAttributeDefinitionObject() {
	if (placeAuthorityAttributeDefinitionObjectEDataType == null) {
	    placeAuthorityAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(57);
	}
	return placeAuthorityAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getReformattingQualityDefinitionObject() {
	if (reformattingQualityDefinitionObjectEDataType == null) {
	    reformattingQualityDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(63);
	}
	return reformattingQualityDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRelatedItemTypeAttributeDefinitionObject() {
	if (relatedItemTypeAttributeDefinitionObjectEDataType == null) {
	    relatedItemTypeAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(66);
	}
	return relatedItemTypeAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getResourceTypeDefinitionObject() {
	if (resourceTypeDefinitionObjectEDataType == null) {
	    resourceTypeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(68);
	}
	return resourceTypeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTitleInfoTypeAttributeDefinitionObject() {
	if (titleInfoTypeAttributeDefinitionObjectEDataType == null) {
	    titleInfoTypeAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(86);
	}
	return titleInfoTypeAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUrlAccessAttributeDefinitionObject() {
	if (urlAccessAttributeDefinitionObjectEDataType == null) {
	    urlAccessAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(90);
	}
	return urlAccessAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUrlUsageAttributeDefinitionObject() {
	if (urlUsageAttributeDefinitionObjectEDataType == null) {
	    urlUsageAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(93);
	}
	return urlUsageAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUsageAttributeDefinitionObject() {
	if (usageAttributeDefinitionObjectEDataType == null) {
	    usageAttributeDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
			    .getEPackage(MODSPackage.eNS_URI).getEClassifiers().get(95);
	}
	return usageAttributeDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getYesDefinitionObject() {
	if (yesDefinitionObjectEDataType == null) {
	    yesDefinitionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(MODSPackage.eNS_URI)
			    .getEClassifiers().get(98);
	}
	return yesDefinitionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MODSFactory getMODSFactory() {
	return (MODSFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isLoaded = false;

    /**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void loadPackage() {
	if (isLoaded)
	    return;
	isLoaded = true;

	URL url = getClass().getResource(packageFilename);
	if (url == null) {
	    throw new RuntimeException("Missing serialized package: " + packageFilename);
	}
	URI uri = URI.createURI(url.toString());
	Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
	try {
	    resource.load(null);
	} catch (IOException exception) {
	    throw new WrappedException(exception);
	}
	initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
	createResource(eNS_URI);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
	if (isFixed)
	    return;
	isFixed = true;
	fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass(EClassifier eClassifier) {
	if (eClassifier.getInstanceClassName() == null) {
	    eClassifier.setInstanceClassName("gov.loc.mods.mods." + eClassifier.getName());
	    setGeneratedClassName(eClassifier);
	}
    }

} //MODSPackageImpl
