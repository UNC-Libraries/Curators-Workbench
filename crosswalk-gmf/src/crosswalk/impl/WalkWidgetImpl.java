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
import crosswalk.MappingContainer;
import crosswalk.SchemaProvider;
import crosswalk.WalkWidget;

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
        public MappingContainer getWalk() {
		if (eContainerFeatureID() != CrosswalkPackage.WALK_WIDGET__WALK) return null;
		return (MappingContainer)eContainer();
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalk(MappingContainer newWalk, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.WALK_WIDGET__WALK, msgs);
		return msgs;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalk(MappingContainer newWalk) {
		if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.WALK_WIDGET__WALK && newWalk != null)) {
			if (EcoreUtil.isAncestor(this, newWalk))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWalk != null)
				msgs = ((InternalEObject)newWalk).eInverseAdd(this, CrosswalkPackage.MAPPING_CONTAINER__WIDGETS, MappingContainer.class, msgs);
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
				return basicSetWalk((MappingContainer)otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, CrosswalkPackage.MAPPING_CONTAINER__WIDGETS, MappingContainer.class, msgs);
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
				setWalk((MappingContainer)newValue);
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
				setWalk((MappingContainer)null);
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
