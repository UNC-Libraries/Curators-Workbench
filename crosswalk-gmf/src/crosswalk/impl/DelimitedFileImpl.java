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
package crosswalk.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
	protected static final URI SOURCE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected URI sourceFile = SOURCE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstDataRow() <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDataRow()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_DATA_ROW_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getFirstDataRow() <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDataRow()
	 * @generated
	 * @ordered
	 */
	protected int firstDataRow = FIRST_DATA_ROW_EDEFAULT;
	/**
	 * The default value of the '{@link #isHeaderRow() <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isHeaderRow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADER_ROW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHeaderRow() <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isHeaderRow()
	 * @generated
	 * @ordered
	 */
	protected boolean headerRow = HEADER_ROW_EDEFAULT;

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
	 * The default value of the '{@link #getLastDataRow() <em>Last Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDataRow()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_DATA_ROW_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getLastDataRow() <em>Last Data Row</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLastDataRow()
	 * @generated
	 * @ordered
	 */
	protected int lastDataRow = LAST_DATA_ROW_EDEFAULT;

	/**
	 * This is true if the Last Data Row attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastDataRowESet;

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
	public URI getSourceFile() {
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFile(URI newSourceFile) {
		URI oldSourceFile = sourceFile;
		sourceFile = newSourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE, oldSourceFile, sourceFile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstDataRow() {
		return firstDataRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstDataRow(int newFirstDataRow) {
		int oldFirstDataRow = firstDataRow;
		firstDataRow = newFirstDataRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__FIRST_DATA_ROW, oldFirstDataRow, firstDataRow));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeaderRow() {
		return headerRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderRow(boolean newHeaderRow) {
		boolean oldHeaderRow = headerRow;
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
		boolean oldHeaderRow = headerRow;
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
	 * @generated
	 */
	public int getLastDataRow() {
		return lastDataRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDataRow(int newLastDataRow) {
		int oldLastDataRow = lastDataRow;
		lastDataRow = newLastDataRow;
		boolean oldLastDataRowESet = lastDataRowESet;
		lastDataRowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DELIMITED_FILE__LAST_DATA_ROW, oldLastDataRow, lastDataRow, !oldLastDataRowESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastDataRow() {
		int oldLastDataRow = lastDataRow;
		boolean oldLastDataRowESet = lastDataRowESet;
		lastDataRow = LAST_DATA_ROW_EDEFAULT;
		lastDataRowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.DELIMITED_FILE__LAST_DATA_ROW, oldLastDataRow, LAST_DATA_ROW_EDEFAULT, oldLastDataRowESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastDataRow() {
		return lastDataRowESet;
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
		if (RowNumber < this.getFirstDataRow()) {
			throw new RecordOutOfRangeException("The record referenced " + RowNumber
					+ " comes before the first data row.  There are only " + this.lines.size() + " records, starting with "
					+ this.getFirstDataRow());
		}
		if (this.isSetLastDataRow() && RowNumber > this.getLastDataRow()) {
				throw new RecordOutOfRangeException("The record referenced " + RowNumber
						+ " comes after the last data row.  The last data row is " + this.getLastDataRow());
		}
		if(RowNumber > getFirstDataRow()-1+this.lines.size()) {
			throw new RecordOutOfRangeException("The record referenced " + RowNumber
					+ " comes after the last data row.  The last data row is " + (getFirstDataRow()-1+this.lines.size()));
		}
		this.currentRowNumber = RowNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void GoToExample() throws DataException, RecordOutOfRangeException {
		this.GoToRecord(this.getFirstDataRow());
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
		URI uri = this.getSourceFile();
		File f = new File(uri);
		if (f.exists()) {
			this.lines.clear();
			CSVReader reader = null;
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(new FileInputStream(f), this.getTextEncoding()));
				reader = new CSVReader(br, this.getFieldDelimiter(), this.getTextDelimiter());
				// TODO deal with non-set last data row
				// read up to first data row
				for(int i = 0; i < this.getFirstDataRow()-1; i++) {
					reader.readNext();
				}
				for(int i = 0; !isSetLastDataRow() || i+getFirstDataRow() <= getLastDataRow(); i++) {
					String[] next = reader.readNext();
					if(next == null) break;
					this.lines.add(next);
				}
				//if (isSetLastDataRow()) {
				//	for (int i = getFirstDataRow(); i <= getLastDataRow(); i++) {
				//		this.lines.add(reader.readNext());
				//	}
				//} else {
				//	this.lines = reader.readAll();
				//}
			} catch (IOException e) {
				e.printStackTrace();
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
				this.GoToRecord(this.getFirstDataRow());
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
		int zeroDigits = String.valueOf(getFirstDataRow() + this.lines.size()).length()
				- String.valueOf(this.currentRowNumber).length();
		StringBuilder result = new StringBuilder();
		for (; zeroDigits > 0; zeroDigits--) {
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
		return new File(this.getSourceFile()).getName();
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
			String[] row = this.lines.get(currentRowNumber - this.getFirstDataRow());
			if(row != null && index < row.length) {
				return row[index];
			} else {
				return null;
			}
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
			return this.lines.get(currentRowNumber - this.getFirstDataRow());
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
		this.getFields().clear();
		String[] firstRow = null;
		URI uri = this.getSourceFile();
		File f = new File(uri);
		if (f.exists()) {
			CSVReader reader = null;
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(new FileInputStream(f), this.getTextEncoding()));
				reader = new CSVReader(br, this.getFieldDelimiter(), this.getTextDelimiter());
				firstRow = reader.readNext();
			} catch (IOException e) {
				throw new DataException(e);
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException ignored) {
					}
				}
			}
			for (int i = 0; i < firstRow.length; i++) {
				TabbedDataField missingField = CrosswalkFactory.eINSTANCE.createTabbedDataField();
				missingField.setColumnNumber(i + 1);
				if (this.isHeaderRow()) {
					missingField.setLabel(firstRow[i]);
				} else {
					missingField.setLabel("Column " + (i + 1));
				}

				this.getFields().add(missingField);
			}
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
			case CrosswalkPackage.DELIMITED_FILE__FIRST_DATA_ROW:
				return getFirstDataRow();
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				return isHeaderRow();
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
				return getTextEncoding();
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
				return getFieldDelimiter();
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				return getTextDelimiter();
			case CrosswalkPackage.DELIMITED_FILE__LAST_DATA_ROW:
				return getLastDataRow();
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
				setSourceFile((URI)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__FIRST_DATA_ROW:
				setFirstDataRow((Integer)newValue);
				return;
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				setHeaderRow((Boolean)newValue);
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
			case CrosswalkPackage.DELIMITED_FILE__LAST_DATA_ROW:
				setLastDataRow((Integer)newValue);
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
			case CrosswalkPackage.DELIMITED_FILE__FIRST_DATA_ROW:
				setFirstDataRow(FIRST_DATA_ROW_EDEFAULT);
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
			case CrosswalkPackage.DELIMITED_FILE__LAST_DATA_ROW:
				unsetLastDataRow();
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
			case CrosswalkPackage.DELIMITED_FILE__FIRST_DATA_ROW:
				return firstDataRow != FIRST_DATA_ROW_EDEFAULT;
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
				return isSetHeaderRow();
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
				return TEXT_ENCODING_EDEFAULT == null ? textEncoding != null : !TEXT_ENCODING_EDEFAULT.equals(textEncoding);
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
				return fieldDelimiter != FIELD_DELIMITER_EDEFAULT;
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				return isSetTextDelimiter();
			case CrosswalkPackage.DELIMITED_FILE__LAST_DATA_ROW:
				return isSetLastDataRow();
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
		result.append(", firstDataRow: ");
		result.append(firstDataRow);
		result.append(", headerRow: ");
		if (headerRowESet) result.append(headerRow); else result.append("<unset>");
		result.append(", textEncoding: ");
		result.append(textEncoding);
		result.append(", fieldDelimiter: ");
		result.append(fieldDelimiter);
		result.append(", textDelimiter: ");
		if (textDelimiterESet) result.append(textDelimiter); else result.append("<unset>");
		result.append(", lastDataRow: ");
		if (lastDataRowESet) result.append(lastDataRow); else result.append("<unset>");
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
