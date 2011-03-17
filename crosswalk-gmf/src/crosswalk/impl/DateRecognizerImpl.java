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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DateRecognizer;
import crosswalk.Input;
import crosswalk.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Recognizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.DateRecognizerImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link crosswalk.impl.DateRecognizerImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateRecognizerImpl extends WalkWidgetImpl implements DateRecognizer {
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
private static final SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat inFormat = null;

    	/**
         * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFormat()
         * @generated
         * @ordered
         */
        protected static final String FORMAT_EDEFAULT = "yy-MM-dd";
        /**
         * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFormat()
         * @generated
         * @ordered
         */
        protected String format = FORMAT_EDEFAULT;
        private static String[] inputNames = {"input"};
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DateRecognizerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.DATE_RECOGNIZER;
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
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.DATE_RECOGNIZER__OUTPUT, oldOutput, output));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_RECOGNIZER__OUTPUT, oldOutput, output, !oldOutputESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.DATE_RECOGNIZER__OUTPUT, oldOutput, null, oldOutputESet));
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
        public String getFormat() {
                return format;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public void setFormat(String newFormat) {
                String oldFormat = format;
                format = newFormat;
                initFormat();
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_RECOGNIZER__FORMAT, oldFormat, format));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public EDataType getInputEDataType() {
                return EcorePackage.eINSTANCE.getEString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public Object getResult() throws DataException {
            Date result = null;
            if(this.getFormat() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(this.getFormat());
                if(this.getOutput() != null) {
                    Object o = this.getOutput().getResult();
                    if(o != null && o instanceof String) {
                	try {
			    result = sdf.parse((String)o);
			} catch (ParseException e) {
			}
                    }
                }
            }
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public EDataType getOutputEDataType() {
                return EcorePackage.eINSTANCE.getEDate();
        }

        private void initFormat() {
            this.inFormat = new SimpleDateFormat(this.getFormat());
        }

	/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.DATE_RECOGNIZER__OUTPUT:
                                if (resolve) return getOutput();
                                return basicGetOutput();
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                return getFormat();
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
                        case CrosswalkPackage.DATE_RECOGNIZER__OUTPUT:
                                setOutput((Output)newValue);
                                return;
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                setFormat((String)newValue);
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
                        case CrosswalkPackage.DATE_RECOGNIZER__OUTPUT:
                                unsetOutput();
                                return;
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                setFormat(FORMAT_EDEFAULT);
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
                        case CrosswalkPackage.DATE_RECOGNIZER__OUTPUT:
                                return isSetOutput();
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
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
                if (baseClass == Output.class) {
                        switch (derivedFeatureID) {
                                default: return -1;
                        }
                }
                if (baseClass == Input.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.DATE_RECOGNIZER__OUTPUT: return CrosswalkPackage.INPUT__OUTPUT;
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
                if (baseClass == Output.class) {
                        switch (baseFeatureID) {
                                default: return -1;
                        }
                }
                if (baseClass == Input.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.INPUT__OUTPUT: return CrosswalkPackage.DATE_RECOGNIZER__OUTPUT;
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
                result.append(" (Format: ");
                result.append(format);
                result.append(')');
                return result.toString();
        }

} //DateRecognizerImpl
