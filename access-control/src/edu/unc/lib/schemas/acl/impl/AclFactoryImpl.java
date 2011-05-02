/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl.impl;

import edu.unc.lib.schemas.acl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AclFactoryImpl extends EFactoryImpl implements AclFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static AclFactory init() {
                try {
                        AclFactory theAclFactory = (AclFactory)EPackage.Registry.INSTANCE.getEFactory("http://cdr.unc.edu/definitions/acl#"); 
                        if (theAclFactory != null) {
                                return theAclFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new AclFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AclFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case AclPackage.ACCESS_CONTROL_TYPE: return createAccessControlType();
                        case AclPackage.DOCUMENT_ROOT: return createDocumentRoot();
                        case AclPackage.GRANT_TYPE: return createGrantType();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AccessControlType createAccessControlType() {
                AccessControlTypeImpl accessControlType = new AccessControlTypeImpl();
                return accessControlType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DocumentRoot createDocumentRoot() {
                DocumentRootImpl documentRoot = new DocumentRootImpl();
                return documentRoot;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public GrantType createGrantType() {
                GrantTypeImpl grantType = new GrantTypeImpl();
                return grantType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AclPackage getAclPackage() {
                return (AclPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static AclPackage getPackage() {
                return AclPackage.eINSTANCE;
        }

} //AclFactoryImpl
