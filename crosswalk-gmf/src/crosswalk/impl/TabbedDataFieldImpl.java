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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataSource;
import crosswalk.TabSeparatedFile;
import crosswalk.TabbedDataField;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tabbed Data Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TabbedDataFieldImpl#getColumnNumber <em>Column Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabbedDataFieldImpl extends DataFieldImpl implements TabbedDataField {
    /**
         * The default value of the '{@link #getColumnNumber() <em>Column Number</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getColumnNumber()
         * @generated
         * @ordered
         */
    protected static final int COLUMN_NUMBER_EDEFAULT = 1;

    /**
         * The cached value of the '{@link #getColumnNumber() <em>Column Number</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getColumnNumber()
         * @generated
         * @ordered
         */
    protected int columnNumber = COLUMN_NUMBER_EDEFAULT;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected TabbedDataFieldImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.TABBED_DATA_FIELD;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public int getColumnNumber() {
                return columnNumber;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setColumnNumber(int newColumnNumber) {
                int oldColumnNumber = columnNumber;
                columnNumber = newColumnNumber;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TABBED_DATA_FIELD__COLUMN_NUMBER, oldColumnNumber, columnNumber));
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getResultString() throws DataException {
	String result = null;
	DataSource ds = this.getSource();
	TabSeparatedFile tsf = null;
	if(ds instanceof TabSeparatedFile) {
	    tsf = (TabSeparatedFile)ds;
	} else {
	    throw new DataException("Expected a tabbed data source but found "+ds.toString());
	}
	try {
	    result = tsf.getCurrentRowData().get(this.getColumnNumber()-1);
	} catch (IndexOutOfBoundsException e) {
	    // throw new DataException("No such column in this row.", e);
	    // returning null when no such column in the data
	}
	return result;
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.TABBED_DATA_FIELD__COLUMN_NUMBER:
                                return getColumnNumber();
                }
                return super.eGet(featureID, resolve, coreType);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case CrosswalkPackage.TABBED_DATA_FIELD__COLUMN_NUMBER:
                                setColumnNumber((Integer)newValue);
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
                        case CrosswalkPackage.TABBED_DATA_FIELD__COLUMN_NUMBER:
                                setColumnNumber(COLUMN_NUMBER_EDEFAULT);
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
                        case CrosswalkPackage.TABBED_DATA_FIELD__COLUMN_NUMBER:
                                return columnNumber != COLUMN_NUMBER_EDEFAULT;
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
                result.append(" (ColumnNumber: ");
                result.append(columnNumber);
                result.append(')');
                return result.toString();
        }

} // TabbedDataFieldImpl
