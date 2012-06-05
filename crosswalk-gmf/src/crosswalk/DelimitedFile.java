/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delimited File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DelimitedFile#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getFirstDataRow <em>First Data Row</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#isHeaderRow <em>Header Row</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getTextEncoding <em>Text Encoding</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getFieldDelimiter <em>Field Delimiter</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getTextDelimiter <em>Text Delimiter</em>}</li>
 *   <li>{@link crosswalk.DelimitedFile#getLastDataRow <em>Last Data Row</em>}</li>
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
	 * @see #setSourceFile(URI)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_SourceFile()
	 * @model dataType="crosswalk.URI" required="true"
	 * @generated
	 */
        URI getSourceFile();

        /**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getSourceFile <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source File</em>' attribute.
	 * @see #getSourceFile()
	 * @generated
	 */
	void setSourceFile(URI value);

								/**
	 * Returns the value of the '<em><b>First Data Row</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Data Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Data Row</em>' attribute.
	 * @see #setFirstDataRow(int)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_FirstDataRow()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getFirstDataRow();

								/**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getFirstDataRow <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Data Row</em>' attribute.
	 * @see #getFirstDataRow()
	 * @generated
	 */
	void setFirstDataRow(int value);

								/**
	 * Returns the value of the '<em><b>Header Row</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Row</em>' attribute.
	 * @see #isSetHeaderRow()
	 * @see #unsetHeaderRow()
	 * @see #setHeaderRow(boolean)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_HeaderRow()
	 * @model default="true" unsettable="true"
	 * @generated
	 */
	boolean isHeaderRow();

								/**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#isHeaderRow <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Row</em>' attribute.
	 * @see #isSetHeaderRow()
	 * @see #unsetHeaderRow()
	 * @see #isHeaderRow()
	 * @generated
	 */
	void setHeaderRow(boolean value);

								/**
	 * Unsets the value of the '{@link crosswalk.DelimitedFile#isHeaderRow <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetHeaderRow()
	 * @see #isHeaderRow()
	 * @see #setHeaderRow(boolean)
	 * @generated
	 */
        void unsetHeaderRow();

        /**
	 * Returns whether the value of the '{@link crosswalk.DelimitedFile#isHeaderRow <em>Header Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Header Row</em>' attribute is set.
	 * @see #unsetHeaderRow()
	 * @see #isHeaderRow()
	 * @see #setHeaderRow(boolean)
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
	 * Returns the value of the '<em><b>Last Data Row</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Data Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Data Row</em>' attribute.
	 * @see #isSetLastDataRow()
	 * @see #unsetLastDataRow()
	 * @see #setLastDataRow(int)
	 * @see crosswalk.CrosswalkPackage#getDelimitedFile_LastDataRow()
	 * @model default="1" unsettable="true"
	 * @generated
	 */
	int getLastDataRow();

								/**
	 * Sets the value of the '{@link crosswalk.DelimitedFile#getLastDataRow <em>Last Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Data Row</em>' attribute.
	 * @see #isSetLastDataRow()
	 * @see #unsetLastDataRow()
	 * @see #getLastDataRow()
	 * @generated
	 */
	void setLastDataRow(int value);

								/**
	 * Unsets the value of the '{@link crosswalk.DelimitedFile#getLastDataRow <em>Last Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastDataRow()
	 * @see #getLastDataRow()
	 * @see #setLastDataRow(int)
	 * @generated
	 */
	void unsetLastDataRow();

								/**
	 * Returns whether the value of the '{@link crosswalk.DelimitedFile#getLastDataRow <em>Last Data Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Data Row</em>' attribute is set.
	 * @see #unsetLastDataRow()
	 * @see #getLastDataRow()
	 * @see #setLastDataRow(int)
	 * @generated
	 */
	boolean isSetLastDataRow();

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model exceptions="crosswalk.DataException crosswalk.RecordOutOfRangeException" RowNumberRequired="true"
	 * @generated
	 */
        void GoToRecord(int RowNumber) throws DataException, RecordOutOfRangeException;

        public String[] getRawRowData();

} // DelimitedFile
