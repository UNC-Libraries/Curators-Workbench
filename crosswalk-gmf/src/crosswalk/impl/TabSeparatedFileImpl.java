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

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.RecordOutOfRangeException;
import crosswalk.TabSeparatedFile;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tab Separated File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TabSeparatedFileImpl#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.impl.TabSeparatedFileImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link crosswalk.impl.TabSeparatedFileImpl#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link crosswalk.impl.TabSeparatedFileImpl#getDataStartingRow <em>Data Starting Row</em>}</li>
 *   <li>{@link crosswalk.impl.TabSeparatedFileImpl#getHeadingRow <em>Heading Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabSeparatedFileImpl extends EObjectImpl implements TabSeparatedFile {
    private boolean reset = false;
    /**
         * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFields()
         * @generated
         * @ordered
         */
    protected EList<DataField> fields;

    /**
         * The default value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getSourceFile()
         * @generated
         * @ordered
         */
    protected static final IFile SOURCE_FILE_EDEFAULT = null;

    /**
         * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getSourceFile()
         * @generated
         * @ordered
         */
    protected IFile sourceFile = SOURCE_FILE_EDEFAULT;

    /**
         * The default value of the '{@link #getDataStartingRow() <em>Data Starting Row</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getDataStartingRow()
         * @generated
         * @ordered
         */
    protected static final int DATA_STARTING_ROW_EDEFAULT = 1;

    /**
         * The cached value of the '{@link #getDataStartingRow() <em>Data Starting Row</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getDataStartingRow()
         * @generated
         * @ordered
         */
    protected int dataStartingRow = DATA_STARTING_ROW_EDEFAULT;

    /**
         * The default value of the '{@link #getHeadingRow() <em>Heading Row</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getHeadingRow()
         * @generated
         * @ordered
         */
    protected static final int HEADING_ROW_EDEFAULT = 0;

    /**
         * The cached value of the '{@link #getHeadingRow() <em>Heading Row</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getHeadingRow()
         * @generated
         * @ordered
         */
    protected int headingRow = HEADING_ROW_EDEFAULT;

    /**
     * This is true if the Heading Row attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean headingRowESet;

    private List<String> lines = new ArrayList<String>();
    private int currentRowNumber = 1;
    private List<String> currentRowData = new ArrayList<String>();

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected TabSeparatedFileImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.TAB_SEPARATED_FILE;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.TAB_SEPARATED_FILE__WALK) return null;
                return (CrossWalk)eContainer();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.TAB_SEPARATED_FILE__WALK, msgs);
                return msgs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.TAB_SEPARATED_FILE__WALK && newWalk != null)) {
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TAB_SEPARATED_FILE__WALK, newWalk, newWalk));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TAB_SEPARATED_FILE__SOURCE_FILE, oldSourceFile, sourceFile));
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public List<String> getCurrentRowData() {
	if (!this.reset) {
	    try {
		this.Reset();
	    } catch (DataException e) {
		e.printStackTrace();
	    }
	}
	return currentRowData;
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public int getDataStartingRow() {
                return dataStartingRow;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setDataStartingRow(int newDataStartingRow) {
                int oldDataStartingRow = dataStartingRow;
                dataStartingRow = newDataStartingRow;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TAB_SEPARATED_FILE__DATA_STARTING_ROW, oldDataStartingRow, dataStartingRow));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public int getHeadingRow() {
                return headingRow;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setHeadingRow(int newHeadingRow) {
                int oldHeadingRow = headingRow;
                headingRow = newHeadingRow;
                boolean oldHeadingRowESet = headingRowESet;
                headingRowESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TAB_SEPARATED_FILE__HEADING_ROW, oldHeadingRow, headingRow, !oldHeadingRowESet));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void unsetHeadingRow() {
                int oldHeadingRow = headingRow;
                boolean oldHeadingRowESet = headingRowESet;
                headingRow = HEADING_ROW_EDEFAULT;
                headingRowESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.TAB_SEPARATED_FILE__HEADING_ROW, oldHeadingRow, HEADING_ROW_EDEFAULT, oldHeadingRowESet));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public boolean isSetHeadingRow() {
                return headingRowESet;
        }

    /**
     *
     */
    // public List<String> getLines() {
    // return lines;
    // }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public EList<DataField> getFields() {
                if (fields == null) {
                        fields = new EObjectContainmentWithInverseEList<DataField>(DataField.class, this, CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS, CrosswalkPackage.DATA_FIELD__SOURCE);
                }
                return fields;
        }

    /**
     * <!-- begin-user-doc --> Advances the current row data to the supplied row
     * number. <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void GoToRecord(int RowNumber) throws DataException, RecordOutOfRangeException {
	try {
	    if (this.lines == null) {
		throw new DataException("The data source is not ready.");
	    }
	    if (RowNumber - 1 < this.lines.size()) {
		this.currentRowNumber = RowNumber;
		String line = this.lines.get(RowNumber - 1);
		this.currentRowData.clear();
		for (String t : line.split("\t")) {
		    this.currentRowData.add(t);
		}
	    } else {
		throw new RecordOutOfRangeException("The record referenced " + RowNumber
				+ " not available.  There are only " + this.lines.size() + " records, starting with 1.");
	    }
	} catch (ArrayIndexOutOfBoundsException e) {
	    throw new RecordOutOfRangeException("The record referenced " + RowNumber
			    + " not available.  There are only " + this.lines.size() + " records, starting with 1.");
	}
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @throws RecordOutOfRangeException
     *
     * @generated NOT
     */
    public void GoToExample() throws DataException, RecordOutOfRangeException {
	this.GoToRecord(this.getDataStartingRow());
    }

    /**
     * <!-- begin-user-doc --> Advances the current row data to the next record.
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void NextRecord() throws DataException, RecordOutOfRangeException {
	// this.setCurrentRowNumber(this.getCurrentRowNumber() + 1);
	this.GoToRecord(this.currentRowNumber + 1);
    }

    /**
     * <!-- begin-user-doc --> Resets the Lines list of Strings with the
     * contents of the source file. Sets the current row to the data starting
     * row. Sets current row data. <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void Reset() throws DataException {
	IFile f = this.getSourceFile();
	if (f.exists()) {
	    BufferedReader reader = null;
	    try {
		List<String> newLines = new ArrayList<String>();
		InputStreamReader r = new InputStreamReader(f.getContents(true), f.getCharset(true));
		reader = new BufferedReader(r);
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
		    newLines.add(line);
		}
		this.lines = newLines;
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
		this.GoToRecord(this.getDataStartingRow());
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
	return String.valueOf(this.currentRowNumber);
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
         * @generated
         */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetWalk((CrossWalk)otherEnd, msgs);
                        case CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS:
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
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
                                return basicSetWalk(null, msgs);
                        case CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS:
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
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
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
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
                                return getWalk();
                        case CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS:
                                return getFields();
                        case CrosswalkPackage.TAB_SEPARATED_FILE__SOURCE_FILE:
                                return getSourceFile();
                        case CrosswalkPackage.TAB_SEPARATED_FILE__DATA_STARTING_ROW:
                                return getDataStartingRow();
                        case CrosswalkPackage.TAB_SEPARATED_FILE__HEADING_ROW:
                                return getHeadingRow();
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
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
                                setWalk((CrossWalk)newValue);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS:
                                getFields().clear();
                                getFields().addAll((Collection<? extends DataField>)newValue);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__SOURCE_FILE:
                                setSourceFile((IFile)newValue);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__DATA_STARTING_ROW:
                                setDataStartingRow((Integer)newValue);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__HEADING_ROW:
                                setHeadingRow((Integer)newValue);
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
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
                                setWalk((CrossWalk)null);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS:
                                getFields().clear();
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__SOURCE_FILE:
                                setSourceFile(SOURCE_FILE_EDEFAULT);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__DATA_STARTING_ROW:
                                setDataStartingRow(DATA_STARTING_ROW_EDEFAULT);
                                return;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__HEADING_ROW:
                                unsetHeadingRow();
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
                        case CrosswalkPackage.TAB_SEPARATED_FILE__WALK:
                                return getWalk() != null;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__FIELDS:
                                return fields != null && !fields.isEmpty();
                        case CrosswalkPackage.TAB_SEPARATED_FILE__SOURCE_FILE:
                                return SOURCE_FILE_EDEFAULT == null ? sourceFile != null : !SOURCE_FILE_EDEFAULT.equals(sourceFile);
                        case CrosswalkPackage.TAB_SEPARATED_FILE__DATA_STARTING_ROW:
                                return dataStartingRow != DATA_STARTING_ROW_EDEFAULT;
                        case CrosswalkPackage.TAB_SEPARATED_FILE__HEADING_ROW:
                                return isSetHeadingRow();
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
                result.append(", DataStartingRow: ");
                result.append(dataStartingRow);
                result.append(", HeadingRow: ");
                if (headingRowESet) result.append(headingRow); else result.append("<unset>");
                result.append(')');
                return result.toString();
        }

} // TabSeparatedFileImpl
