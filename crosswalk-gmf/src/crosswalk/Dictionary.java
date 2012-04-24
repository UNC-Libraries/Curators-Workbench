/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Dictionary#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.Dictionary#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link crosswalk.Dictionary#getVocabularies <em>Vocabularies</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends SchemaProvider, Editable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crosswalk.CrosswalkPackage#getDictionary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crosswalk.Dictionary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.MetadataBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getDictionary_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetadataBlock> getBlocks();

	/**
	 * Returns the value of the '<em><b>Vocabularies</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.Vocabulary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabularies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabularies</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getDictionary_Vocabularies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vocabulary> getVocabularies();

} // Dictionary
