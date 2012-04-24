/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getVocabulary()
 * @model
 * @generated
 */
public interface Vocabulary extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Map<?, ?> getTerms(String broaderTerm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model prefixRequired="true"
	 * @generated
	 */
	Map<?, ?> getCompletions(String prefix);

} // Vocabulary
