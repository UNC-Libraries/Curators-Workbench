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
/**
 */
package crosswalk;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.OutputProfile#getParentMappedFeature <em>Parent Mapped Feature</em>}</li>
 *   <li>{@link crosswalk.OutputProfile#isStartMappingAtChildren <em>Start Mapping At Children</em>}</li>
 *   <li>{@link crosswalk.OutputProfile#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.OutputProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.OutputProfile#getMetadataLabel <em>Metadata Label</em>}</li>
 *   <li>{@link crosswalk.OutputProfile#getMetadataType <em>Metadata Type</em>}</li>
 *   <li>{@link crosswalk.OutputProfile#getMetadataSection <em>Metadata Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getOutputProfile()
 * @model
 * @generated
 */
public interface OutputProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Mapped Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Mapped Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Mapped Feature</em>' reference.
	 * @see #setParentMappedFeature(EReference)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_ParentMappedFeature()
	 * @model required="true"
	 * @generated
	 */
	EReference getParentMappedFeature();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#getParentMappedFeature <em>Parent Mapped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Mapped Feature</em>' reference.
	 * @see #getParentMappedFeature()
	 * @generated
	 */
	void setParentMappedFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Metadata Section</b></em>' attribute.
	 * The literals are from the enumeration {@link crosswalk.OutputMetadataSections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Section</em>' attribute.
	 * @see crosswalk.OutputMetadataSections
	 * @see #setMetadataSection(OutputMetadataSections)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_MetadataSection()
	 * @model required="true"
	 * @generated
	 */
	OutputMetadataSections getMetadataSection();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#getMetadataSection <em>Metadata Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Section</em>' attribute.
	 * @see crosswalk.OutputMetadataSections
	 * @see #getMetadataSection()
	 * @generated
	 */
	void setMetadataSection(OutputMetadataSections value);

	/**
	 * Returns the value of the '<em><b>Start Mapping At Children</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Mapping At Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Mapping At Children</em>' attribute.
	 * @see #setStartMappingAtChildren(boolean)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_StartMappingAtChildren()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isStartMappingAtChildren();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#isStartMappingAtChildren <em>Start Mapping At Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Mapping At Children</em>' attribute.
	 * @see #isStartMappingAtChildren()
	 * @generated
	 */
	void setStartMappingAtChildren(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Profile Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_Name()
	 * @model default="Profile Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Description"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_Description()
	 * @model default="Description" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Metadata Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Label</em>' attribute.
	 * @see #setMetadataLabel(String)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_MetadataLabel()
	 * @model required="true"
	 * @generated
	 */
	String getMetadataLabel();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#getMetadataLabel <em>Metadata Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Label</em>' attribute.
	 * @see #getMetadataLabel()
	 * @generated
	 */
	void setMetadataLabel(String value);

	/**
	 * Returns the value of the '<em><b>Metadata Type</b></em>' attribute.
	 * The default value is <code>"OTHER"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Type</em>' attribute.
	 * @see #setMetadataType(String)
	 * @see crosswalk.CrosswalkPackage#getOutputProfile_MetadataType()
	 * @model default="OTHER" required="true"
	 * @generated
	 */
	String getMetadataType();

	/**
	 * Sets the value of the '{@link crosswalk.OutputProfile#getMetadataType <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Type</em>' attribute.
	 * @see #getMetadataType()
	 * @generated
	 */
	void setMetadataType(String value);

} // OutputProfile
