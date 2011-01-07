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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.Input;
import crosswalk.InputConsumer;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Input Consumer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.InputConsumerImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InputConsumerImpl extends EObjectImpl implements InputConsumer {
    public abstract String[] getStringInputNames();

    /**
         * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getInputs()
         * @generated
         * @ordered
         */
    protected EList<Input> inputs;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected InputConsumerImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.INPUT_CONSUMER;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public EList<Input> getInputs() {
                if (inputs == null) {
                        inputs = new EObjectContainmentWithInverseEList<Input>(Input.class, this, CrosswalkPackage.INPUT_CONSUMER__INPUTS, CrosswalkPackage.INPUT__CONSUMER);
                }
                return inputs;
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void initInputs() {
	// initialize StringInputs
	String[] stringInputNames = null;
	try {
	    stringInputNames = getStringInputNames();
	    if (stringInputNames != null) {
		for (String name : stringInputNames) {
		    StringInput si = CrosswalkFactory.eINSTANCE.createStringInput();
		    if (name != null) {
			si.setName(name);
		    }
		    this.getInputs().add(si);
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.INPUT_CONSUMER__INPUTS:
                                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
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
                        case CrosswalkPackage.INPUT_CONSUMER__INPUTS:
                                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.INPUT_CONSUMER__INPUTS:
                                return getInputs();
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
                        case CrosswalkPackage.INPUT_CONSUMER__INPUTS:
                                getInputs().clear();
                                getInputs().addAll((Collection<? extends Input>)newValue);
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
                        case CrosswalkPackage.INPUT_CONSUMER__INPUTS:
                                getInputs().clear();
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
                        case CrosswalkPackage.INPUT_CONSUMER__INPUTS:
                                return inputs != null && !inputs.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} // InputConsumerImpl
