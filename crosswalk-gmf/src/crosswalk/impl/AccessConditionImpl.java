/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.ModsDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import crosswalk.AccessCondition;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.OutputElement;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.AccessConditionImpl#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.impl.AccessConditionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessConditionImpl extends InputConsumerImpl implements AccessCondition {
    private static final String[] inputNames = {"input"};

        /**
         * The default value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected static final String TYPE_EDEFAULT = "access";

        /**
         * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected String type = TYPE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected AccessConditionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.ACCESS_CONDITION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.ACCESS_CONDITION__WALK) return null;
                return (CrossWalk)eContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.ACCESS_CONDITION__WALK, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.ACCESS_CONDITION__WALK && newWalk != null)) {
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.ACCESS_CONDITION__WALK, newWalk, newWalk));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getType() {
                return type;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setType(String newType) {
                String oldType = type;
                type = newType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.ACCESS_CONDITION__TYPE, oldType, type));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public void updateRecord(EObject record) {
            String input = null;
            try {
        	input = ((StringInput)this.getInputs().get(0)).getInput().getResultString();
        	ModsDefinition r = (ModsDefinition) record;
        	AccessConditionDefinition ac = MODSFactory.eINSTANCE.createAccessConditionDefinition();
        	Entry e = FeatureMapUtil.createTextEntry(input);
        	ac.getMixed().add(XMLTypePackage.eINSTANCE.getAnyType_Mixed(), e);
        	if(this.getType() != null) {
        	    ac.setType1(this.getType());
        	}
        	r.getAccessCondition().add(ac);
            } catch(Exception ignored) {
        	ignored.printStackTrace();
            }
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetWalk((CrossWalk)otherEnd, msgs);
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                return basicSetWalk(null, msgs);
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__ELEMENTS, CrossWalk.class, msgs);
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                return getWalk();
                        case CrosswalkPackage.ACCESS_CONDITION__TYPE:
                                return getType();
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                setWalk((CrossWalk)newValue);
                                return;
                        case CrosswalkPackage.ACCESS_CONDITION__TYPE:
                                setType((String)newValue);
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                setWalk((CrossWalk)null);
                                return;
                        case CrosswalkPackage.ACCESS_CONDITION__TYPE:
                                setType(TYPE_EDEFAULT);
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
                        case CrosswalkPackage.ACCESS_CONDITION__WALK:
                                return getWalk() != null;
                        case CrosswalkPackage.ACCESS_CONDITION__TYPE:
                                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
                if (baseClass == OutputElement.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.ACCESS_CONDITION__WALK: return CrosswalkPackage.OUTPUT_ELEMENT__WALK;
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
                if (baseClass == OutputElement.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.OUTPUT_ELEMENT__WALK: return CrosswalkPackage.ACCESS_CONDITION__WALK;
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
                result.append(" (type: ");
                result.append(type);
                result.append(')');
                return result.toString();
        }

	/* (non-Javadoc)
	 * @see crosswalk.impl.InputConsumerImpl#getStringInputNames()
	 */
	@Override
	public String[] getStringInputNames() {
	    return inputNames;
	}

} //AccessConditionImpl
