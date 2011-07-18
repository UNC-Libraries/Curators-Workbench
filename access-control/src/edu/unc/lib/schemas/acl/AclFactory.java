/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.unc.lib.schemas.acl.AclPackage
 * @generated
 */
public interface AclFactory extends EFactory {
        /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        AclFactory eINSTANCE = edu.unc.lib.schemas.acl.impl.AclFactoryImpl.init();

        /**
	 * Returns a new object of class '<em>Access Control Type</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control Type</em>'.
	 * @generated
	 */
        AccessControlType createAccessControlType();

        /**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
        DocumentRoot createDocumentRoot();

        /**
	 * Returns a new object of class '<em>Grant Type</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grant Type</em>'.
	 * @generated
	 */
        GrantType createGrantType();

        /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
        AclPackage getAclPackage();

} //AclFactory
