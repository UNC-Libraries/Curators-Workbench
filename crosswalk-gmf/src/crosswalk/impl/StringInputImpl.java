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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import crosswalk.CrosswalkPackage;
import crosswalk.InputConsumer;
import crosswalk.StringGenerator;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.StringInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.impl.StringInputImpl#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link crosswalk.impl.StringInputImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringInputImpl extends EObjectImpl implements StringInput {
        /**
         * The default value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected static final String NAME_EDEFAULT = "input";

        /**
         * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected String name = NAME_EDEFAULT;

        /**
         * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getInput()
         * @generated
         * @ordered
         */
        protected StringGenerator input;

        /**
         * This is true if the Input reference has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean inputESet;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected StringInputImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.STRING_INPUT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName() {
                return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setName(String newName) {
                String oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.STRING_INPUT__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public InputConsumer getConsumer() {
                if (eContainerFeatureID() != CrosswalkPackage.STRING_INPUT__CONSUMER) return null;
                return (InputConsumer)eContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetConsumer(InputConsumer newConsumer, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newConsumer, CrosswalkPackage.STRING_INPUT__CONSUMER, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setConsumer(InputConsumer newConsumer) {
                if (newConsumer != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.STRING_INPUT__CONSUMER && newConsumer != null)) {
                        if (EcoreUtil.isAncestor(this, newConsumer))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newConsumer != null)
                                msgs = ((InternalEObject)newConsumer).eInverseAdd(this, CrosswalkPackage.INPUT_CONSUMER__INPUTS, InputConsumer.class, msgs);
                        msgs = basicSetConsumer(newConsumer, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.STRING_INPUT__CONSUMER, newConsumer, newConsumer));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StringGenerator getInput() {
                if (input != null && input.eIsProxy()) {
                        InternalEObject oldInput = (InternalEObject)input;
                        input = (StringGenerator)eResolveProxy(oldInput);
                        if (input != oldInput) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.STRING_INPUT__INPUT, oldInput, input));
                        }
                }
                return input;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StringGenerator basicGetInput() {
                return input;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setInput(StringGenerator newInput) {
                StringGenerator oldInput = input;
                input = newInput;
                boolean oldInputESet = inputESet;
                inputESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.STRING_INPUT__INPUT, oldInput, input, !oldInputESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetInput() {
                StringGenerator oldInput = input;
                boolean oldInputESet = inputESet;
                input = null;
                inputESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.STRING_INPUT__INPUT, oldInput, null, oldInputESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetInput() {
                return inputESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetConsumer((InputConsumer)otherEnd, msgs);
                }
                return super.eInverseAdd(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                return basicSetConsumer(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
                switch (eContainerFeatureID()) {
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                return eInternalContainer().eInverseRemove(this, CrosswalkPackage.INPUT_CONSUMER__INPUTS, InputConsumer.class, msgs);
                }
                return super.eBasicRemoveFromContainerFeature(msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.STRING_INPUT__NAME:
                                return getName();
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                return getConsumer();
                        case CrosswalkPackage.STRING_INPUT__INPUT:
                                if (resolve) return getInput();
                                return basicGetInput();
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
                        case CrosswalkPackage.STRING_INPUT__NAME:
                                setName((String)newValue);
                                return;
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                setConsumer((InputConsumer)newValue);
                                return;
                        case CrosswalkPackage.STRING_INPUT__INPUT:
                                setInput((StringGenerator)newValue);
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
                        case CrosswalkPackage.STRING_INPUT__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                setConsumer((InputConsumer)null);
                                return;
                        case CrosswalkPackage.STRING_INPUT__INPUT:
                                unsetInput();
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
                        case CrosswalkPackage.STRING_INPUT__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case CrosswalkPackage.STRING_INPUT__CONSUMER:
                                return getConsumer() != null;
                        case CrosswalkPackage.STRING_INPUT__INPUT:
                                return isSetInput();
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
                result.append(" (Name: ");
                result.append(name);
                result.append(')');
                return result.toString();
        }

} //StringInputImpl
