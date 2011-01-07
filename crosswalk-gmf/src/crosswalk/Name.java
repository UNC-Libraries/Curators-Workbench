/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import gov.loc.mods.mods.NameTypeAttributeDefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Name#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends InputConsumer, OutputElement {

    /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * The literals are from the enumeration {@link gov.loc.mods.mods.NameTypeAttributeDefinition}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see gov.loc.mods.mods.NameTypeAttributeDefinition
         * @see #isSetType()
         * @see #unsetType()
         * @see #setType(NameTypeAttributeDefinition)
         * @see crosswalk.CrosswalkPackage#getName_Type()
         * @model unsettable="true"
         * @generated
         */
        NameTypeAttributeDefinition getType();

        /**
         * Sets the value of the '{@link crosswalk.Name#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see gov.loc.mods.mods.NameTypeAttributeDefinition
         * @see #isSetType()
         * @see #unsetType()
         * @see #getType()
         * @generated
         */
        void setType(NameTypeAttributeDefinition value);

        /**
         * Unsets the value of the '{@link crosswalk.Name#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetType()
         * @see #getType()
         * @see #setType(NameTypeAttributeDefinition)
         * @generated
         */
        void unsetType();

        /**
         * Returns whether the value of the '{@link crosswalk.Name#getType <em>Type</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Type</em>' attribute is set.
         * @see #unsetType()
         * @see #getType()
         * @see #setType(NameTypeAttributeDefinition)
         * @generated
         */
        boolean isSetType();

public static final String[] stringInputNames = { null };
} // Name
