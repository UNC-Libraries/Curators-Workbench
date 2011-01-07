/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Matcher Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getRecordMatcherStrategy()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RecordMatcherStrategy extends WalkWidget {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model kind="operation" dataType="crosswalk.RecordMatches" required="true"
         * @generated
         */
        RecordMatches getMatches();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model exceptions="crosswalk.DataException"
         * @generated
         */
        void run() throws DataException;

} // RecordMatcherStrategy
