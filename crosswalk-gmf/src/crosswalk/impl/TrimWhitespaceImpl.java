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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.Output;
import crosswalk.TrimWhitespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trim Whitespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TrimWhitespaceImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrimWhitespaceImpl extends WalkWidgetImpl implements TrimWhitespace {
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
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TrimWhitespaceImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.TRIM_WHITESPACE;
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
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.TRIM_WHITESPACE__OUTPUT, oldOutput, output));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TRIM_WHITESPACE__OUTPUT, oldOutput, output, !oldOutputESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.TRIM_WHITESPACE__OUTPUT, oldOutput, null, oldOutputESet));
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
            String result = null;
            if(this.getOutput() != null) {
        	Object out = this.getOutput().getResult();
        	if(out != null && out instanceof String) {
        	    result = (String)out;
        	    result = result.trim();
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
            return EcorePackage.eINSTANCE.getEString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.TRIM_WHITESPACE__OUTPUT:
                                if (resolve) return getOutput();
                                return basicGetOutput();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case CrosswalkPackage.TRIM_WHITESPACE__OUTPUT:
                                setOutput((Output)newValue);
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
                        case CrosswalkPackage.TRIM_WHITESPACE__OUTPUT:
                                unsetOutput();
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
                        case CrosswalkPackage.TRIM_WHITESPACE__OUTPUT:
                                return isSetOutput();
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
                                case CrosswalkPackage.TRIM_WHITESPACE__OUTPUT: return CrosswalkPackage.INPUT__OUTPUT;
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
                                case CrosswalkPackage.INPUT__OUTPUT: return CrosswalkPackage.TRIM_WHITESPACE__OUTPUT;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }

} //TrimWhitespaceImpl
