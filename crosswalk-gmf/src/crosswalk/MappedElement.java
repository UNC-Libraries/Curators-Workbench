/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MappedElement#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getMappedFeature <em>Mapped Feature</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getText <em>Text</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappedElement()
 * @model
 * @generated
 */
public interface MappedElement extends OutputElement {
        /**
         * Returns the value of the '<em><b>Child Elements</b></em>' containment reference list.
         * The list contents are of type {@link crosswalk.MappedElement}.
         * It is bidirectional and its opposite is '{@link crosswalk.MappedElement#getParent <em>Parent</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Child Elements</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Child Elements</em>' containment reference list.
         * @see crosswalk.CrosswalkPackage#getMappedElement_ChildElements()
         * @see crosswalk.MappedElement#getParent
         * @model opposite="parent" containment="true"
         * @generated
         */
        EList<MappedElement> getChildElements();

        /**
         * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
         * The list contents are of type {@link crosswalk.MappedAttribute}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Attributes</em>' containment reference list.
         * @see crosswalk.CrosswalkPackage#getMappedElement_Attributes()
         * @model containment="true"
         * @generated
         */
        EList<MappedAttribute> getAttributes();

        /**
         * Returns the value of the '<em><b>Mapped Feature</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mapped Feature</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mapped Feature</em>' reference.
         * @see #setMappedFeature(EReference)
         * @see crosswalk.CrosswalkPackage#getMappedElement_MappedFeature()
         * @model required="true"
         * @generated
         */
        EReference getMappedFeature();

        /**
         * Sets the value of the '{@link crosswalk.MappedElement#getMappedFeature <em>Mapped Feature</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mapped Feature</em>' reference.
         * @see #getMappedFeature()
         * @generated
         */
        void setMappedFeature(EReference value);

        /**
         * Returns the value of the '<em><b>Text</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Text</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Text</em>' containment reference.
         * @see #isSetText()
         * @see #unsetText()
         * @see #setText(StringInput)
         * @see crosswalk.CrosswalkPackage#getMappedElement_Text()
         * @model containment="true" unsettable="true"
         * @generated
         */
        StringInput getText();

        /**
         * Sets the value of the '{@link crosswalk.MappedElement#getText <em>Text</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Text</em>' containment reference.
         * @see #isSetText()
         * @see #unsetText()
         * @see #getText()
         * @generated
         */
        void setText(StringInput value);

        /**
         * Unsets the value of the '{@link crosswalk.MappedElement#getText <em>Text</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetText()
         * @see #getText()
         * @see #setText(StringInput)
         * @generated
         */
        void unsetText();

        /**
         * Returns whether the value of the '{@link crosswalk.MappedElement#getText <em>Text</em>}' containment reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Text</em>' containment reference is set.
         * @see #unsetText()
         * @see #getText()
         * @see #setText(StringInput)
         * @generated
         */
        boolean isSetText();

        /**
         * Returns the value of the '<em><b>Parent</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link crosswalk.MappedElement#getChildElements <em>Child Elements</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Parent</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Parent</em>' container reference.
         * @see #setParent(MappedElement)
         * @see crosswalk.CrosswalkPackage#getMappedElement_Parent()
         * @see crosswalk.MappedElement#getChildElements
         * @model opposite="childElements" transient="false"
         * @generated
         */
        MappedElement getParent();

        /**
         * Sets the value of the '{@link crosswalk.MappedElement#getParent <em>Parent</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Parent</em>' container reference.
         * @see #getParent()
         * @generated
         */
        void setParent(MappedElement value);

} // MappedElement
