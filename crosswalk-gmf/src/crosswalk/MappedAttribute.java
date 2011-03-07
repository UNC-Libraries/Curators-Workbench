/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MappedAttribute#getMappedFeature <em>Mapped Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappedAttribute()
 * @model
 * @generated
 */
public interface MappedAttribute extends OutputElement, StringInput {
        /**
         * Returns the value of the '<em><b>Mapped Feature</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mapped Feature</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mapped Feature</em>' reference.
         * @see #setMappedFeature(EAttribute)
         * @see crosswalk.CrosswalkPackage#getMappedAttribute_MappedFeature()
         * @model required="true"
         * @generated
         */
        EAttribute getMappedFeature();

        /**
         * Sets the value of the '{@link crosswalk.MappedAttribute#getMappedFeature <em>Mapped Feature</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mapped Feature</em>' reference.
         * @see #getMappedFeature()
         * @generated
         */
        void setMappedFeature(EAttribute value);

} // MappedAttribute
