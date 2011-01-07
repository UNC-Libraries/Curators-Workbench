/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import gov.loc.mods.mods.IdentifierDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.ModsDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Identifier;
import crosswalk.Input;
import crosswalk.OutputElement;
import crosswalk.StringGenerator;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Identifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.IdentifierImpl#getWalk <em>Walk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifierImpl extends InputConsumerImpl implements Identifier {
    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected IdentifierImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.IDENTIFIER;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.IDENTIFIER__WALK) return null;
                return (CrossWalk)eContainer();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.IDENTIFIER__WALK, msgs);
                return msgs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.IDENTIFIER__WALK && newWalk != null)) {
                        if (EcoreUtil.isAncestor(this, newWalk))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newWalk != null)
                                msgs = ((InternalEObject)newWalk).eInverseAdd(this, CrosswalkPackage.CROSS_WALK__ELEMENTS, CrossWalk.class, msgs);
                        msgs = basicSetWalk(newWalk, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.IDENTIFIER__WALK, newWalk, newWalk));
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void updateRecord(EObject record) {
	if (record instanceof ModsDefinition) {
	    ModsDefinition r = (ModsDefinition) record;
	    IdentifierDefinition id = MODSFactory.eINSTANCE.createIdentifierDefinition();
	    for (Input i : this.getInputs()) {
		if (i instanceof StringInput) {
		    StringInput si = (StringInput) i;
		    StringGenerator so = si.getInput();
		    if (so != null) {
			try {
			    String str = so.getResultString();
			    id.setValue(str);
			} catch (DataException e) {
			}
		    }
		}

	    }
	    r.getIdentifier().add(id);
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetWalk((CrossWalk)otherEnd, msgs);
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                return basicSetWalk(null, msgs);
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__ELEMENTS, CrossWalk.class, msgs);
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                return getWalk();
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                setWalk((CrossWalk)newValue);
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                setWalk((CrossWalk)null);
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
                        case CrosswalkPackage.IDENTIFIER__WALK:
                                return getWalk() != null;
                }
                return super.eIsSet(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
                if (baseClass == OutputElement.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.IDENTIFIER__WALK: return CrosswalkPackage.OUTPUT_ELEMENT__WALK;
                                default: return -1;
                        }
                }
                return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
                if (baseClass == OutputElement.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.OUTPUT_ELEMENT__WALK: return CrosswalkPackage.IDENTIFIER__WALK;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }

    /*
     * (non-Javadoc)
     *
     * @see crosswalk.impl.InputConsumerImpl#getStringInputNames()
     */
    @Override
    public String[] getStringInputNames() {
	return Identifier.stringInputNames;
    }

} // IdentifierImpl
