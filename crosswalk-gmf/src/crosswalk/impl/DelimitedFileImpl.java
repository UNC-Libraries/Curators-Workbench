/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import au.com.bytecode.opencsv.CSVReader;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.DelimitedFile;
import crosswalk.RecordOutOfRangeException;
import crosswalk.TabbedDataField;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Delimited File</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getWalk <em>Walk</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getFields <em>Fields</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getSourceFile <em>Source File</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getDataRow <em>Data Row</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getHeaderRow <em>Header Row</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getTextEncoding <em>Text Encoding</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getFieldDelimiter <em>Field Delimiter</em>}</li>
 * <li>{@link crosswalk.impl.DelimitedFileImpl#getTextDelimiter <em>Text Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelimitedFileImpl extends EObjectImpl implements DelimitedFile {

	private List<String[]> lines = new ArrayList<String[]>();
	private int currentRowNumber = 1;
	private boolean reset = false;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DataField> fields;

	/**
	 * The default value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected static final IFile SOURCE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected IFile sourceFile = SOURCE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataRow() <em>Data Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataRow()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_ROW_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDataRow() <em>Data Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataRow()
	 * @generated
	 * @ordered
	 */
	protected int dataRow = DATA_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderRow() <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHeaderRow()
	 * @generated
	 * @ordered
	 */
	protected static final int HEADER_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeaderRow() <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHeaderRow()
	 * @generated
	 * @ordered
	 */
	protected int headerRow = HEADER_ROW_EDEFAULT;

	/**
	 * This is true if the Header Row attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean headerRowESet;

	/**
	 * The default value of the '{@link #getTextEncoding() <em>Text Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ENCODING_EDEFAULT = "utf-8";

	/**
	 * The cached value of the '{@link #getTextEncoding() <em>Text Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEncoding()
	 * @generated
	 * @ordered
	 */
	protected String textEncoding = TEXT_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldDelimiter() <em>Field Delimiter</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getFieldDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final char FIELD_DELIMITER_EDEFAULT = ',';
	/**
	 * The cached value of the '{@link #getFieldDelimiter() <em>Field Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDelimiter()
	 * @generated
	 * @ordered
	 */
	protected char fieldDelimiter = FIELD_DELIMITER_EDEFAULT;
	/**
	 * The default value of the '{@link #getTextDelimiter() <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final char TEXT_DELIMITER_EDEFAULT = '\"';

	/**
	 * The cached value of the '{@link #getTextDelimiter() <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDelimiter()
	 * @generated
	 * @ordered
	 */
	protected char textDelimiter = TEXT_DELIMITER_EDEFAULT;

	/**
	 * This is true if the Text Delimiter attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textDelimiterESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DelimitedFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.DELIMITED_FILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CrossWalk getWalk() {
		if (eContainerFeatureID() != CrosswalkPackage.DELIMITED_FILE__WALK) return null;
		return (CrossWalk)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.DELIMITED_FILE__WALK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalk(CrossWalk newWalk) {
		if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.DELIMITED_FILE__WALK && newWalk != null)) {
			if (EcoreUtil.isAncestor(this, newWalk))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWalk != null)
				msgs = ((InternalEObject)newWalk).eInverseAdd(this, CrosswalkPackage.CROSS_WALK__DATA_SOURCE, CrossWalk.class, msgs);
			msgs = basicSetWalk(newWalk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__WALK, newWalk, newWalk));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<DataField>(DataField.class, this, CrosswalkPackage.DELIMITED_FILE__FIELDS, CrosswalkPackage.DATA_FIELD__SOURCE);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getSourceFile() {
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFile(IFile newSourceFile) {
		IFile oldSourceFile = sourceFile;
		sourceFile = newSourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE, oldSourceFile, sourceFile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataRow() {
		return dataRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRow(int newDataRow) {
		int oldDataRow = dataRow;
		dataRow = newDataRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__DATA_ROW, oldDataRow, dataRow));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeaderRow() {
		return headerRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderRow(int newHeaderRow) {
		int oldHeaderRow = headerRow;
		headerRow = newHeaderRow;
		boolean oldHeaderRowESet = headerRowESet;
		headerRowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__HEADER_ROW, oldHeaderRow, headerRow, !oldHeaderRowESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeaderRow() {
		int oldHeaderRow = headerRow;
		boolean oldHeaderRowESet = headerRowESet;
		headerRow = HEADER_ROW_EDEFAULT;
		headerRowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.DELIMITED_FILE__HEADER_ROW, oldHeaderRow, HEADER_ROW_EDEFAULT, oldHeaderRowESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeaderRow() {
		return headerRowESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextEncoding() {
		return textEncoding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEncoding(String newTextEncoding) {
		String oldTextEncoding = textEncoding;
		textEncoding = newTextEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING, oldTextEncoding, textEncoding));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public char getTextDelimiter() {
		return textDelimiter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDelimiter(char newTextDelimiter) {
		char oldTextDelimiter = textDelimiter;
		textDelimiter = newTextDelimiter;
		boolean oldTextDelimiterESet = textDelimiterESet;
		textDelimiterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER, oldTextDelimiter, textDelimiter, !oldTextDelimiterESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextDelimiter() {
		char oldTextDelimiter = textDelimiter;
		boolean oldTextDelimiterESet = textDelimiterESet;
		textDelimiter = TEXT_DELIMITER_EDEFAULT;
		textDelimiterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER, oldTextDelimiter, TEXT_DELIMITER_EDEFAULT, oldTextDelimiterESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextDelimiter() {
		return textDelimiterESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void GoToRecord(int RowNumber) throws DataException, RecordOutOfRangeException {
		if (this.lines == null) {
			throw new DataException("The data source is not ready.");
		}
		if (RowNumber - 1 < this.lines.size()) {
			this.currentRowNumber = RowNumber;
		} else {
			throw new RecordOutOfRangeException("The record referenced " + RowNumber + " not available.  There are only "
					+ this.lines.size() + " records, starting with 1.");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void GoToExample() throws DataException, RecordOutOfRangeException {
		this.GoToRecord(this.getDataRow());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void NextRecord() throws DataException, RecordOutOfRangeException {
		this.GoToRecord(this.currentRowNumber + 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void Reset() throws DataException {
		IFile f = this.getSourceFile();
		if (f.exists()) {
			CSVReader reader = null;
			try {
				// TODO use this for wiz default: f.getCharset(true)
				BufferedReader br = new BufferedReader(new InputStreamReader(f.getContents(true), this.getTextEncoding()));

				if(this.isSetTextDelimiter()) {
					reader = new CSVReader(br, this.getFieldDelimiter(), this.getTextDelimiter());
				} else {
					reader = new CSVReader(br, this.getFieldDelimiter());
				}
				this.lines = reader.readAll();
			} catch (IOException e) {
				throw new DataException(e);
			} catch (CoreException e) {
				throw new DataException(e);
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException ignored) {
					}
				}
			}
			this.reset = true;
			try {
				this.GoToRecord(this.getDataRow());
			} catch (RecordOutOfRangeException e) {
				throw new DataException("The data starting row is beyond the range of records.");
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public String getRecordID() {
		int zeroDigits = String.valueOf(this.lines.size()).length() - String.valueOf(this.currentRowNumber).length();
		StringBuilder result = new StringBuilder();
		for(;zeroDigits > 0; zeroDigits--) {
			result.append("0");
		}
		result.append(this.currentRowNumber);
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public String getName() {
		return this.getSourceFile().getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public String getFieldValue(DataField field) {
		if (!this.reset) {
			try {
				this.Reset();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			TabbedDataField tdf = (TabbedDataField) field;
			int index = tdf.getColumnNumber() - 1;
			return this.lines.get(currentRowNumber - 1)[index];
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String[] getRawRowData() {
		if (!this.reset) {
			try {
				this.Reset();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			return this.lines.get(currentRowNumber - 1);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void initializeDataFields() throws DataException {
		try {
			this.getFields().clear();
			this.Reset();
			if (this.isSetHeaderRow()) {
				this.GoToRecord(this.getHeaderRow());
				String[] headerRow = this.getRawRowData();
				for (int i = 0; i < headerRow.length; i++) {
					TabbedDataField missingField = CrosswalkFactory.eINSTANCE.createTabbedDataField();
					missingField.setColumnNumber(i + 1);
					missingField.setLabel(headerRow[i]);
					this.getFields().add(missingField);
				}
			} else {
				this.GoToRecord(this.getDataRow());
				String[] headerRow = this.getRawRowData();
				for (int i = 0; i < headerRow.length; i++) {
					TabbedDataField missingField = CrosswalkFactory.eINSTANCE.createTabbedDataField();
					missingField.setColumnNumber(i + 1);
					missingField.setLabel("Column " + (i + 1));
					this.getFields().add(missingField);
				}
			}
		} catch (RecordOutOfRangeException e) {
			e.printStackTrace();
		}
		this.Reset();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWalk((CrossWalk)otherEnd, msgs);
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				return basicSetWalk(null, msgs);
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__DATA_SOURCE, CrossWalk.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				return getWalk();
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
				return getFields();
			case CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE:
				return getSourceFile();
			case CrosswalkPackage.DELIMITED_FILE__DATA_ROW:
				return getDataRow();
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				return getHeaderRow();
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
				return getTextEncoding();
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
				return getFieldDelimiter();
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				return getTextDelimiter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				setWalk((CrossWalk)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends DataField>)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE:
				setSourceFile((IFile)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__DATA_ROW:
				setDataRow((Integer)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				setHeaderRow((Integer)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
				setTextEncoding((String)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
				setFieldDelimiter((Character)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				setTextDelimiter((Character)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				setWalk((CrossWalk)null);
				return;
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
				getFields().clear();
				return;
			case CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE:
				setSourceFile(SOURCE_FILE_EDEFAULT);
				return;
			case CrosswalkPackage.DELIMITED_FILE__DATA_ROW:
				setDataRow(DATA_ROW_EDEFAULT);
				return;
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				unsetHeaderRow();
				return;
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
				setTextEncoding(TEXT_ENCODING_EDEFAULT);
				return;
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
				setFieldDelimiter(FIELD_DELIMITER_EDEFAULT);
				return;
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				unsetTextDelimiter();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.DELIMITED_FILE__WALK:
				return getWalk() != null;
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
				return fields != null && !fields.isEmpty();
			case CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE:
				return SOURCE_FILE_EDEFAULT == null ? sourceFile != null : !SOURCE_FILE_EDEFAULT.equals(sourceFile);
			case CrosswalkPackage.DELIMITED_FILE__DATA_ROW:
				return dataRow != DATA_ROW_EDEFAULT;
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				return isSetHeaderRow();
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
				return TEXT_ENCODING_EDEFAULT == null ? textEncoding != null : !TEXT_ENCODING_EDEFAULT.equals(textEncoding);
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
				return fieldDelimiter != FIELD_DELIMITER_EDEFAULT;
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				return isSetTextDelimiter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (SourceFile: ");
		result.append(sourceFile);
		result.append(", dataRow: ");
		result.append(dataRow);
		result.append(", headerRow: ");
		if (headerRowESet) result.append(headerRow); else result.append("<unset>");
		result.append(", textEncoding: ");
		result.append(textEncoding);
		result.append(", fieldDelimiter: ");
		result.append(fieldDelimiter);
		result.append(", textDelimiter: ");
		if (textDelimiterESet) result.append(textDelimiter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public char getFieldDelimiter() {
		return fieldDelimiter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldDelimiter(char newFieldDelimiter) {
		char oldFieldDelimiter = fieldDelimiter;
		fieldDelimiter = newFieldDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER, oldFieldDelimiter, fieldDelimiter));
	}

} // DelimitedFileImpl
