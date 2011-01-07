/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkPackage
 * @generated
 */
public interface CrosswalkFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        CrosswalkFactory eINSTANCE = crosswalk.impl.CrosswalkFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Tabbed Data Field</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Tabbed Data Field</em>'.
         * @generated
         */
        TabbedDataField createTabbedDataField();

        /**
         * Returns a new object of class '<em>Trim Whitespace</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Trim Whitespace</em>'.
         * @generated
         */
        TrimWhitespace createTrimWhitespace();

        /**
         * Returns a new object of class '<em>Title Info</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Title Info</em>'.
         * @generated
         */
        TitleInfo createTitleInfo();

        /**
         * Returns a new object of class '<em>Cross Walk</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Cross Walk</em>'.
         * @generated
         */
        CrossWalk createCrossWalk();

        /**
         * Returns a new object of class '<em>Tab Separated File</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Tab Separated File</em>'.
         * @generated
         */
        TabSeparatedFile createTabSeparatedFile();

        /**
         * Returns a new object of class '<em>Data Field</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Data Field</em>'.
         * @generated
         */
        DataField createDataField();

        /**
         * Returns a new object of class '<em>String Input</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>String Input</em>'.
         * @generated
         */
        StringInput createStringInput();

        /**
         * Returns a new object of class '<em>Abstract</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Abstract</em>'.
         * @generated
         */
        Abstract createAbstract();

        /**
         * Returns a new object of class '<em>Genre</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Genre</em>'.
         * @generated
         */
        Genre createGenre();

        /**
         * Returns a new object of class '<em>Identifier</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Identifier</em>'.
         * @generated
         */
        Identifier createIdentifier();

        /**
         * Returns a new object of class '<em>Language</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Language</em>'.
         * @generated
         */
        Language createLanguage();

        /**
         * Returns a new object of class '<em>Name</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Name</em>'.
         * @generated
         */
        Name createName();

        /**
         * Returns a new object of class '<em>Subject</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Subject</em>'.
         * @generated
         */
        Subject createSubject();

        /**
         * Returns a new object of class '<em>Type Of Resource</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Type Of Resource</em>'.
         * @generated
         */
        TypeOfResource createTypeOfResource();

        /**
         * Returns a new object of class '<em>Original Name Record Matcher</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Original Name Record Matcher</em>'.
         * @generated
         */
        OriginalNameRecordMatcher createOriginalNameRecordMatcher();

        /**
         * Returns a new object of class '<em>Date Created</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Date Created</em>'.
         * @generated
         */
        DateCreated createDateCreated();

        /**
         * Returns a new object of class '<em>Date Input</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Date Input</em>'.
         * @generated
         */
        DateInput createDateInput();

        /**
         * Returns a new object of class '<em>Date Recognizer</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Date Recognizer</em>'.
         * @generated
         */
        DateRecognizer createDateRecognizer();

        /**
         * Returns a new object of class '<em>Text</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Text</em>'.
         * @generated
         */
        Text createText();

        /**
         * Returns a new object of class '<em>Access Condition</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Access Condition</em>'.
         * @generated
         */
        AccessCondition createAccessCondition();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        CrosswalkPackage getCrosswalkPackage();

} //CrosswalkFactory
