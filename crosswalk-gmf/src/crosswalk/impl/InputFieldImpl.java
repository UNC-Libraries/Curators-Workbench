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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.InputField;
import crosswalk.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.InputFieldImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link crosswalk.impl.InputFieldImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.impl.InputFieldImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link crosswalk.impl.InputFieldImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link crosswalk.impl.InputFieldImpl#getEnteredValue <em>Entered Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputFieldImpl<F> extends EObjectImpl implements InputField<F> {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * This is true if the Output reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outputESet;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnteredValue() <em>Entered Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteredValue()
	 * @generated
	 * @ordered
	 */
	protected F enteredValue;

	/**
	 * This is true if the Entered Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enteredValueESet;
	
	private Class<F> persistentClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	protected InputFieldImpl() {
		super();
		Type t = getClass().getGenericSuperclass();
		if(t instanceof ParameterizedType) {
			this.persistentClass = (Class)((ParameterizedType)t).getActualTypeArguments()[0];
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Output)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.INPUT_FIELD__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Output newOutput) {
		Output oldOutput = output;
		output = newOutput;
		boolean oldOutputESet = outputESet;
		outputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.INPUT_FIELD__OUTPUT, oldOutput, output, !oldOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOutput() {
		Output oldOutput = output;
		boolean oldOutputESet = outputESet;
		output = null;
		outputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.INPUT_FIELD__OUTPUT, oldOutput, null, oldOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutput() {
		return outputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.INPUT_FIELD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.INPUT_FIELD__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.INPUT_FIELD__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public F getEnteredValue() {
		return enteredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteredValue(F newEnteredValue) {
		F oldEnteredValue = enteredValue;
		enteredValue = newEnteredValue;
		boolean oldEnteredValueESet = enteredValueESet;
		enteredValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.INPUT_FIELD__ENTERED_VALUE, oldEnteredValue, enteredValue, !oldEnteredValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnteredValue() {
		F oldEnteredValue = enteredValue;
		boolean oldEnteredValueESet = enteredValueESet;
		enteredValue = null;
		enteredValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.INPUT_FIELD__ENTERED_VALUE, oldEnteredValue, null, oldEnteredValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnteredValue() {
		return enteredValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class getInputType() {
		return this.persistentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getResult() throws DataException {
		Object result = null;
		try {
			if(this.getOutput() != null) {
				result = this.getOutput().getResult();
			} else {
				result = this.getEnteredValue();
			}
		} catch(NullPointerException e) {}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class getOutputType() {
		return this.persistentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.INPUT_FIELD__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case CrosswalkPackage.INPUT_FIELD__LABEL:
				return getLabel();
			case CrosswalkPackage.INPUT_FIELD__USAGE:
				return getUsage();
			case CrosswalkPackage.INPUT_FIELD__REQUIRED:
				return isRequired();
			case CrosswalkPackage.INPUT_FIELD__ENTERED_VALUE:
				return getEnteredValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.INPUT_FIELD__OUTPUT:
				setOutput((Output)newValue);
				return;
			case CrosswalkPackage.INPUT_FIELD__LABEL:
				setLabel((String)newValue);
				return;
			case CrosswalkPackage.INPUT_FIELD__USAGE:
				setUsage((String)newValue);
				return;
			case CrosswalkPackage.INPUT_FIELD__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CrosswalkPackage.INPUT_FIELD__ENTERED_VALUE:
				setEnteredValue((F)newValue);
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
			case CrosswalkPackage.INPUT_FIELD__OUTPUT:
				unsetOutput();
				return;
			case CrosswalkPackage.INPUT_FIELD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CrosswalkPackage.INPUT_FIELD__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case CrosswalkPackage.INPUT_FIELD__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CrosswalkPackage.INPUT_FIELD__ENTERED_VALUE:
				unsetEnteredValue();
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
			case CrosswalkPackage.INPUT_FIELD__OUTPUT:
				return isSetOutput();
			case CrosswalkPackage.INPUT_FIELD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CrosswalkPackage.INPUT_FIELD__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case CrosswalkPackage.INPUT_FIELD__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CrosswalkPackage.INPUT_FIELD__ENTERED_VALUE:
				return isSetEnteredValue();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Input.class) {
			switch (derivedFeatureID) {
				case CrosswalkPackage.INPUT_FIELD__OUTPUT: return CrosswalkPackage.INPUT__OUTPUT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Input.class) {
			switch (baseFeatureID) {
				case CrosswalkPackage.INPUT__OUTPUT: return CrosswalkPackage.INPUT_FIELD__OUTPUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", usage: ");
		result.append(usage);
		result.append(", required: ");
		result.append(required);
		result.append(", enteredValue: ");
		if (enteredValueESet) result.append(enteredValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InputFieldImpl
