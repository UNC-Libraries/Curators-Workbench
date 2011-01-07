/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Walk Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.WalkWidget#getWalk <em>Walk</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getWalkWidget()
 * @model abstract="true"
 * @generated
 */
public interface WalkWidget extends EObject {
        /**
         * Returns the value of the '<em><b>Walk</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link crosswalk.CrossWalk#getWidgets <em>Widgets</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Walk</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Walk</em>' container reference.
         * @see #setWalk(CrossWalk)
         * @see crosswalk.CrosswalkPackage#getWalkWidget_Walk()
         * @see crosswalk.CrossWalk#getWidgets
         * @model opposite="Widgets" required="true" transient="false"
         * @generated
         */
        CrossWalk getWalk();

        /**
         * Sets the value of the '{@link crosswalk.WalkWidget#getWalk <em>Walk</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Walk</em>' container reference.
         * @see #getWalk()
         * @generated
         */
        void setWalk(CrossWalk value);

} // WalkWidget
