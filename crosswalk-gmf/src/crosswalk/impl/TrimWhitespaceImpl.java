/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.InputConsumer;
import crosswalk.StringGenerator;
import crosswalk.StringInput;
import crosswalk.TrimWhitespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trim Whitespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TrimWhitespaceImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrimWhitespaceImpl extends WalkWidgetImpl implements TrimWhitespace {
        /**
         * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getInputs()
         * @generated
         * @ordered
         */
        protected EList<Input> inputs;

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
        public String getResultString() throws DataException {
                // TODO: implement this method
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.TRIM_WHITESPACE__INPUTS:
                                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
                }
                return super.eInverseAdd(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Input> getInputs() {
                if (inputs == null) {
                        inputs = new EObjectContainmentWithInverseEList<Input>(Input.class, this, CrosswalkPackage.TRIM_WHITESPACE__INPUTS, CrosswalkPackage.INPUT__CONSUMER);
                }
                return inputs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public void initInputs() {
            StringInput si = CrosswalkFactory.eINSTANCE.createStringInput();
            this.getInputs().add(si);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.TRIM_WHITESPACE__INPUTS:
                                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.TRIM_WHITESPACE__INPUTS:
                                return getInputs();
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
                        case CrosswalkPackage.TRIM_WHITESPACE__INPUTS:
                                getInputs().clear();
                                getInputs().addAll((Collection<? extends Input>)newValue);
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
                        case CrosswalkPackage.TRIM_WHITESPACE__INPUTS:
                                getInputs().clear();
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
                        case CrosswalkPackage.TRIM_WHITESPACE__INPUTS:
                                return inputs != null && !inputs.isEmpty();
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
                if (baseClass == StringGenerator.class) {
                        switch (derivedFeatureID) {
                                default: return -1;
                        }
                }
                if (baseClass == InputConsumer.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.TRIM_WHITESPACE__INPUTS: return CrosswalkPackage.INPUT_CONSUMER__INPUTS;
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
                if (baseClass == StringGenerator.class) {
                        switch (baseFeatureID) {
                                default: return -1;
                        }
                }
                if (baseClass == InputConsumer.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.INPUT_CONSUMER__INPUTS: return CrosswalkPackage.TRIM_WHITESPACE__INPUTS;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }

} //TrimWhitespaceImpl
