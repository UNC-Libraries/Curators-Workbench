/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MappedAttribute#getMappedFeature <em>Mapped Feature</em>}</li>
 *   <li>{@link crosswalk.MappedAttribute#getConversionStrategy <em>Conversion Strategy</em>}</li>
 *   <li>{@link crosswalk.MappedAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link crosswalk.MappedAttribute#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappedAttribute()
 * @model
 * @generated
 */
public interface MappedAttribute extends OutputElement, Input {
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

        /**
	 * Returns the value of the '<em><b>Conversion Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Conversion Strategy</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Strategy</em>' containment reference.
	 * @see #isSetConversionStrategy()
	 * @see #unsetConversionStrategy()
	 * @see #setConversionStrategy(ConversionStrategy)
	 * @see crosswalk.CrosswalkPackage#getMappedAttribute_ConversionStrategy()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
        ConversionStrategy getConversionStrategy();

        /**
	 * Sets the value of the '{@link crosswalk.MappedAttribute#getConversionStrategy <em>Conversion Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Strategy</em>' containment reference.
	 * @see #isSetConversionStrategy()
	 * @see #unsetConversionStrategy()
	 * @see #getConversionStrategy()
	 * @generated
	 */
        void setConversionStrategy(ConversionStrategy value);

        /**
	 * Unsets the value of the '{@link crosswalk.MappedAttribute#getConversionStrategy <em>Conversion Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetConversionStrategy()
	 * @see #getConversionStrategy()
	 * @see #setConversionStrategy(ConversionStrategy)
	 * @generated
	 */
        void unsetConversionStrategy();

        /**
	 * Returns whether the value of the '{@link crosswalk.MappedAttribute#getConversionStrategy <em>Conversion Strategy</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conversion Strategy</em>' containment reference is set.
	 * @see #unsetConversionStrategy()
	 * @see #getConversionStrategy()
	 * @see #setConversionStrategy(ConversionStrategy)
	 * @generated
	 */
        boolean isSetConversionStrategy();

        /**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(String)
	 * @see crosswalk.CrosswalkPackage#getMappedAttribute_DefaultValue()
	 * @model unsettable="true"
	 * @generated
	 */
        String getDefaultValue();

        /**
	 * Sets the value of the '{@link crosswalk.MappedAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
        void setDefaultValue(String value);

        /**
	 * Unsets the value of the '{@link crosswalk.MappedAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
        void unsetDefaultValue();

        /**
	 * Returns whether the value of the '{@link crosswalk.MappedAttribute#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
        boolean isSetDefaultValue();

								/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see crosswalk.CrosswalkPackage#getMappedAttribute_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

								/**
	 * Sets the value of the '{@link crosswalk.MappedAttribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // MappedAttribute
