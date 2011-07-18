/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delimited File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DelimitedFile#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getDataRow <em>Data Row</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getHeaderRow <em>Header Row</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getTextEncoding <em>Text Encoding</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getFieldDelimiter <em>Field Delimiter</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getTextDelimiter <em>Text Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDelimitedFile()
 * @model
 * @generated
 */
public interface DelimitedFile extends DataSource {
        /**
	 * Returns the value of the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Source File</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File</em>' attribute.
	 * @see #setSourceFile(IFile)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_SourceFile()
	 * @model dataType="crosswalk.IFile" required="true"
	 * @generated
	 */
        IFile getSourceFile();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getSourceFile <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source File</em>' attribute.
	 * @see #getSourceFile()
	 * @generated
	 */
        void setSourceFile(IFile value);

        /**
	 * Returns the value of the '<em><b>Data Row</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Data Row</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Row</em>' attribute.
	 * @see #setDataRow(int)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_DataRow()
	 * @model default="1" required="true"
	 * @generated
	 */
        int getDataRow();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getDataRow <em>Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Row</em>' attribute.
	 * @see #getDataRow()
	 * @generated
	 */
        void setDataRow(int value);

        /**
	 * Returns the value of the '<em><b>Header Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Header Row</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Row</em>' attribute.
	 * @see #isSetHeaderRow()
	 * @see #unsetHeaderRow()
	 * @see #setHeaderRow(int)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_HeaderRow()
	 * @model unsettable="true"
	 * @generated
	 */
        int getHeaderRow();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getHeaderRow <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Row</em>' attribute.
	 * @see #isSetHeaderRow()
	 * @see #unsetHeaderRow()
	 * @see #getHeaderRow()
	 * @generated
	 */
        void setHeaderRow(int value);

        /**
	 * Unsets the value of the '{@link crosswalk.DelimitedFile#getHeaderRow <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetHeaderRow()
	 * @see #getHeaderRow()
	 * @see #setHeaderRow(int)
	 * @generated
	 */
        void unsetHeaderRow();

        /**
	 * Returns whether the value of the '{@link crosswalk.DelimitedFile#getHeaderRow <em>Header Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Header Row</em>' attribute is set.
	 * @see #unsetHeaderRow()
	 * @see #getHeaderRow()
	 * @see #setHeaderRow(int)
	 * @generated
	 */
        boolean isSetHeaderRow();

        /**
	 * Returns the value of the '<em><b>Text Encoding</b></em>' attribute.
	 * The default value is <code>"utf-8"</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Text Encoding</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Encoding</em>' attribute.
	 * @see #setTextEncoding(String)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_TextEncoding()
	 * @model default="utf-8" required="true"
	 * @generated
	 */
        String getTextEncoding();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getTextEncoding <em>Text Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Encoding</em>' attribute.
	 * @see #getTextEncoding()
	 * @generated
	 */
        void setTextEncoding(String value);

        /**
	 * Returns the value of the '<em><b>Field Delimiter</b></em>' attribute.
	 * The default value is <code>","</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Field Delimiter</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Delimiter</em>' attribute.
	 * @see #setFieldDelimiter(char)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_FieldDelimiter()
	 * @model default="," required="true"
	 * @generated
	 */
        char getFieldDelimiter();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getFieldDelimiter <em>Field Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Delimiter</em>' attribute.
	 * @see #getFieldDelimiter()
	 * @generated
	 */
        void setFieldDelimiter(char value);

        /**
	 * Returns the value of the '<em><b>Text Delimiter</b></em>' attribute.
	 * The default value is <code>"\""</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Text Delimiter</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Delimiter</em>' attribute.
	 * @see #isSetTextDelimiter()
	 * @see #unsetTextDelimiter()
	 * @see #setTextDelimiter(char)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_TextDelimiter()
	 * @model default="\"" unsettable="true"
	 * @generated
	 */
        char getTextDelimiter();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getTextDelimiter <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Delimiter</em>' attribute.
	 * @see #isSetTextDelimiter()
	 * @see #unsetTextDelimiter()
	 * @see #getTextDelimiter()
	 * @generated
	 */
        void setTextDelimiter(char value);

        /**
	 * Unsets the value of the '{@link crosswalk.DelimitedFile#getTextDelimiter <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetTextDelimiter()
	 * @see #getTextDelimiter()
	 * @see #setTextDelimiter(char)
	 * @generated
	 */
        void unsetTextDelimiter();

        /**
	 * Returns whether the value of the '{@link crosswalk.DelimitedFile#getTextDelimiter <em>Text Delimiter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Delimiter</em>' attribute is set.
	 * @see #unsetTextDelimiter()
	 * @see #getTextDelimiter()
	 * @see #setTextDelimiter(char)
	 * @generated
	 */
        boolean isSetTextDelimiter();

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model exceptions="crosswalk.DataException crosswalk.RecordOutOfRangeException" RowNumberRequired="true"
	 * @generated
	 */
        void GoToRecord(int RowNumber) throws DataException, RecordOutOfRangeException;

        public String[] getRawRowData();

} // DelimitedFile
