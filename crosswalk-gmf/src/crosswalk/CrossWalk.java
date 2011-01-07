/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Walk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.CrossWalk#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link crosswalk.CrossWalk#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link crosswalk.CrossWalk#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getCrossWalk()
 * @model
 * @generated
 */
public interface CrossWalk extends EObject {
        /**
         * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link crosswalk.DataSource#getWalk <em>Walk</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Data Source</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Data Source</em>' containment reference.
         * @see #setDataSource(DataSource)
         * @see crosswalk.CrosswalkPackage#getCrossWalk_DataSource()
         * @see crosswalk.DataSource#getWalk
         * @model opposite="Walk" containment="true" required="true"
         * @generated
         */
        DataSource getDataSource();

        /**
         * Sets the value of the '{@link crosswalk.CrossWalk#getDataSource <em>Data Source</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Data Source</em>' containment reference.
         * @see #getDataSource()
         * @generated
         */
        void setDataSource(DataSource value);

        /**
         * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
         * The list contents are of type {@link crosswalk.WalkWidget}.
         * It is bidirectional and its opposite is '{@link crosswalk.WalkWidget#getWalk <em>Walk</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Widgets</em>' containment reference list.
         * @see crosswalk.CrosswalkPackage#getCrossWalk_Widgets()
         * @see crosswalk.WalkWidget#getWalk
         * @model opposite="Walk" containment="true" ordered="false"
         * @generated
         */
        EList<WalkWidget> getWidgets();

        /**
         * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
         * The list contents are of type {@link crosswalk.OutputElement}.
         * It is bidirectional and its opposite is '{@link crosswalk.OutputElement#getWalk <em>Walk</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Elements</em>' containment reference list.
         * @see crosswalk.CrosswalkPackage#getCrossWalk_Elements()
         * @see crosswalk.OutputElement#getWalk
         * @model opposite="Walk" containment="true" required="true"
         * @generated
         */
        EList<OutputElement> getElements();

        /**
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Project</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @model kind="operation" dataType="crosswalk.IProject" required="true" exceptions="crosswalk.DataException"
         * @generated
         */
        IProject getProject() throws DataException;

        String getRecordID(int recordNumber);

        public void setMetsSource(MetsSource metsSource);
        MetsSource getMetsSource();

} // CrossWalk
