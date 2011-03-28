/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl.impl;

import edu.unc.lib.schemas.acl.AccessControlType;
import edu.unc.lib.schemas.acl.AclFactory;
import edu.unc.lib.schemas.acl.AclPackage;
import edu.unc.lib.schemas.acl.DocumentRoot;
import edu.unc.lib.schemas.acl.GrantType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AclPackageImpl extends EPackageImpl implements AclPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass accessControlTypeEClass = null;

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
        private EClass grantTypeEClass = null;

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
         * @see edu.unc.lib.schemas.acl.AclPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private AclPackageImpl() {
                super(eNS_URI, AclFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link AclPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static AclPackage init() {
                if (isInited) return (AclPackage)EPackage.Registry.INSTANCE.getEPackage(AclPackage.eNS_URI);

                // Obtain or create and register package
                AclPackageImpl theAclPackage = (AclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AclPackageImpl());

                isInited = true;

                // Initialize simple dependencies
                XMLTypePackage.eINSTANCE.eClass();

                // Create package meta-data objects
                theAclPackage.createPackageContents();

                // Initialize created meta-data
                theAclPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theAclPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(AclPackage.eNS_URI, theAclPackage);
                return theAclPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAccessControlType() {
                return accessControlTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAccessControlType_Grant() {
                return (EReference)accessControlTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAccessControlType_EmbargoUntil() {
                return (EAttribute)accessControlTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAccessControlType_Inherit() {
                return (EAttribute)accessControlTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDocumentRoot() {
                return documentRootEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDocumentRoot_Mixed() {
                return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDocumentRoot_XMLNSPrefixMap() {
                return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDocumentRoot_XSISchemaLocation() {
                return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDocumentRoot_AccessControl() {
                return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getGrantType() {
                return grantTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getGrantType_Group() {
                return (EAttribute)grantTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getGrantType_Role() {
                return (EAttribute)grantTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AclFactory getAclFactory() {
                return (AclFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                accessControlTypeEClass = createEClass(ACCESS_CONTROL_TYPE);
                createEReference(accessControlTypeEClass, ACCESS_CONTROL_TYPE__GRANT);
                createEAttribute(accessControlTypeEClass, ACCESS_CONTROL_TYPE__EMBARGO_UNTIL);
                createEAttribute(accessControlTypeEClass, ACCESS_CONTROL_TYPE__INHERIT);

                documentRootEClass = createEClass(DOCUMENT_ROOT);
                createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
                createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
                createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
                createEReference(documentRootEClass, DOCUMENT_ROOT__ACCESS_CONTROL);

                grantTypeEClass = createEClass(GRANT_TYPE);
                createEAttribute(grantTypeEClass, GRANT_TYPE__GROUP);
                createEAttribute(grantTypeEClass, GRANT_TYPE__ROLE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Obtain other dependent packages
                XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes

                // Initialize classes and features; add operations and parameters
                initEClass(accessControlTypeEClass, AccessControlType.class, "AccessControlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAccessControlType_Grant(), this.getGrantType(), null, "grant", null, 0, -1, AccessControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAccessControlType_EmbargoUntil(), theXMLTypePackage.getDate(), "embargoUntil", null, 0, 1, AccessControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAccessControlType_Inherit(), theXMLTypePackage.getBoolean(), "inherit", "true", 0, 1, AccessControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDocumentRoot_AccessControl(), this.getAccessControlType(), null, "accessControl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

                initEClass(grantTypeEClass, GrantType.class, "GrantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getGrantType_Group(), theXMLTypePackage.getString(), "group", null, 1, 1, GrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getGrantType_Role(), theXMLTypePackage.getString(), "role", null, 1, 1, GrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);

                // Create annotations
                // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
                createExtendedMetaDataAnnotations();
        }

        /**
         * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void createExtendedMetaDataAnnotations() {
                String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
                addAnnotation
                  (accessControlTypeEClass, 
                   source, 
                   new String[] {
                         "name", "accessControl_._type",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getAccessControlType_Grant(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "grant",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getAccessControlType_EmbargoUntil(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "embargo-until",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getAccessControlType_Inherit(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "inherit",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (documentRootEClass, 
                   source, 
                   new String[] {
                         "name", "",
                         "kind", "mixed"
                   });		
                addAnnotation
                  (getDocumentRoot_Mixed(), 
                   source, 
                   new String[] {
                         "kind", "elementWildcard",
                         "name", ":mixed"
                   });		
                addAnnotation
                  (getDocumentRoot_XMLNSPrefixMap(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "xmlns:prefix"
                   });		
                addAnnotation
                  (getDocumentRoot_XSISchemaLocation(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "xsi:schemaLocation"
                   });		
                addAnnotation
                  (getDocumentRoot_AccessControl(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "accessControl",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (grantTypeEClass, 
                   source, 
                   new String[] {
                         "name", "grant_._type",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getGrantType_Group(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "group",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getGrantType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "##targetNamespace"
                   });
        }

} //AclPackageImpl
