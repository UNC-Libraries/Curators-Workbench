/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DateInputField;
import crosswalk.DatePrecision;
import crosswalk.util.ImpreciseDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.DateInputFieldImpl#getDatePrecision <em>Date Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateInputFieldImpl extends InputFieldImpl<Date> implements DateInputField {
	/**
	 * The default value of the '{@link #getDatePrecision() <em>Date Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecision()
	 * @generated
	 * @ordered
	 */
	protected static final DatePrecision DATE_PRECISION_EDEFAULT = DatePrecision.YEAR;
	/**
	 * The cached value of the '{@link #getDatePrecision() <em>Date Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecision()
	 * @generated
	 * @ordered
	 */
	protected DatePrecision datePrecision = DATE_PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateInputFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.DATE_INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePrecision getDatePrecision() {
		return datePrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrecision(DatePrecision newDatePrecision) {
		DatePrecision oldDatePrecision = datePrecision;
		datePrecision = newDatePrecision == null ? DATE_PRECISION_EDEFAULT : newDatePrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION, oldDatePrecision, datePrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				return getDatePrecision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				setDatePrecision((DatePrecision)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				setDatePrecision(DATE_PRECISION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				return datePrecision != DATE_PRECISION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (datePrecision: ");
		result.append(datePrecision);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object getResult() throws DataException {
		Date date = (Date)super.getResult();
		ImpreciseDate impdate = new ImpreciseDate(date);
		impdate.setPrecision(getDatePrecision());
		return impdate;
	}

} //DateInputFieldImpl
