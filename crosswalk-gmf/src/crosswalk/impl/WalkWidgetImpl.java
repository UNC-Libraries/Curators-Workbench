/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.WalkWidget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Walk Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.WalkWidgetImpl#getWalk <em>Walk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WalkWidgetImpl extends EObjectImpl implements WalkWidget {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected WalkWidgetImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.WALK_WIDGET;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.WALK_WIDGET__WALK) return null;
                return (CrossWalk)eContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.WALK_WIDGET__WALK, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.WALK_WIDGET__WALK && newWalk != null)) {
                        if (EcoreUtil.isAncestor(this, newWalk))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newWalk != null)
                                msgs = ((InternalEObject)newWalk).eInverseAdd(this, CrosswalkPackage.CROSS_WALK__WIDGETS, CrossWalk.class, msgs);
                        msgs = basicSetWalk(newWalk, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.WALK_WIDGET__WALK, newWalk, newWalk));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.WALK_WIDGET__WALK:
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
                        case CrosswalkPackage.WALK_WIDGET__WALK:
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
                        case CrosswalkPackage.WALK_WIDGET__WALK:
                                return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__WIDGETS, CrossWalk.class, msgs);
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
                        case CrosswalkPackage.WALK_WIDGET__WALK:
                                return getWalk();
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
                        case CrosswalkPackage.WALK_WIDGET__WALK:
                                setWalk((CrossWalk)newValue);
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
                        case CrosswalkPackage.WALK_WIDGET__WALK:
                                setWalk((CrossWalk)null);
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
                        case CrosswalkPackage.WALK_WIDGET__WALK:
                                return getWalk() != null;
                }
                return super.eIsSet(featureID);
        }

} //WalkWidgetImpl
