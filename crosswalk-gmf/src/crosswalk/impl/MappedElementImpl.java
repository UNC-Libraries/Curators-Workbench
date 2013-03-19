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

import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.impl.AccessConditionDefinitionImpl;
import gov.loc.mods.mods.impl.ExtensionDefinitionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

import crosswalk.CrosswalkPackage;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MappingContainer;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Mapped Element</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link crosswalk.impl.MappedElementImpl#getWalk <em>Walk</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getChildElements <em>Child Elements</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getAttributes <em>Attributes</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getMappedFeature <em>Mapped Feature</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedElementImpl extends EObjectImpl implements MappedElement {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(MappedElementImpl.class);

	/**
	 * The default value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected static final Throwable EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected Throwable exception = EXCEPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildElements() <em>Child Elements</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getChildElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MappedElement> childElements;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MappedAttribute> attributes;

	/**
	 * The cached value of the '{@link #getMappedFeature() <em>Mapped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference mappedFeature;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.MAPPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MappingContainer getWalk() {
		if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__WALK) return null;
		return (MappingContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalk(MappingContainer newWalk, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.MAPPED_ELEMENT__WALK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalk(MappingContainer newWalk) {
		if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__WALK && newWalk != null)) {
			if (EcoreUtil.isAncestor(this, newWalk))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWalk != null)
				msgs = ((InternalEObject)newWalk).eInverseAdd(this, CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS, MappingContainer.class, msgs);
			msgs = basicSetWalk(newWalk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__WALK, newWalk, newWalk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(Throwable newException) {
		Throwable oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__EXCEPTION, oldException, exception));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappedElement> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentWithInverseEList<MappedElement>(MappedElement.class, this, CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS, CrosswalkPackage.MAPPED_ELEMENT__PARENT);
		}
		return childElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappedAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MappedAttribute>(MappedAttribute.class, this, CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedFeature() {
		if (mappedFeature != null && mappedFeature.eIsProxy()) {
			InternalEObject oldMappedFeature = (InternalEObject)mappedFeature;
			mappedFeature = (EReference)eResolveProxy(oldMappedFeature);
			if (mappedFeature != oldMappedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE, oldMappedFeature, mappedFeature));
			}
		}
		return mappedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetMappedFeature() {
		return mappedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedFeature(EReference newMappedFeature) {
		EReference oldMappedFeature = mappedFeature;
		mappedFeature = newMappedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE, oldMappedFeature, mappedFeature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MappedElement getParent() {
		if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__PARENT) return null;
		return (MappedElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(MappedElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, CrosswalkPackage.MAPPED_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(MappedElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS, MappedElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void updateRecord(EObject record) {
		if (this.getMappedFeature() != null && this.getMappedFeature().getEReferenceType() != null) {
			EClass mytype = this.getMappedFeature().getEReferenceType();
			LOG.debug("my type: " + mytype.toString());
			EObject myobject = mytype.getEPackage().getEFactoryInstance().create(mytype);
			LOG.debug("my object: " + myobject.toString());
			
			for (MappedAttribute ma : this.getAttributes()) {
				
				// If the mapped attribute's mapped feature is a feature map entry, don't call updateRecord.
				// Instead, obtain the value that would be set by calling getValue, and add that as text to the
				// "mixed" feature map of the object we're preparing (if it has such a feature).
				
				if (EcoreUtil.equals(ma.getMappedFeature().getEAttributeType(), EcorePackage.eINSTANCE.getEFeatureMapEntry())) {
					
					EStructuralFeature feature = myobject.eClass().getEStructuralFeature("mixed");
					
					if (feature != null) {
						Object mixed = myobject.eGet(feature);
					
						if (mixed instanceof FeatureMap) {
							Object value = ma.getValue();
							
							if (value != null)
								FeatureMapUtil.addText((FeatureMap) mixed, value.toString());
						}
					}
					
				} else {
				
					ma.updateRecord(myobject);
					
				}
				
			}
			
			for (MappedElement me : this.getChildElements()) {
				me.updateRecord(myobject);
			}
			
			
			if (!isEmpty(myobject)) {
				if (getMappedFeature().isMany()) {
					Object listO = record.eGet(getMappedFeature());
					if (listO != null) {
						((EList) listO).add(myobject);
					}
				} else {
					record.eSet(getMappedFeature(), myobject);
				}
			}
			LOG.debug("my modified parent: " + record.toString());
		}
	}

	private boolean isEmpty(EObject myobject) {
		if (myobject.eContents().size() > 0) {
			return false;
		}
		for (EAttribute a : getMappedFeature().getEReferenceType().getEAllAttributes()) {
			if (myobject.eIsSet(a)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWalk((MappingContainer)otherEnd, msgs);
			case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildElements()).basicAdd(otherEnd, msgs);
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((MappedElement)otherEnd, msgs);
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
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				return basicSetWalk(null, msgs);
			case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
				return ((InternalEList<?>)getChildElements()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
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
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				return eInternalContainer().eInverseRemove(this, CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS, MappingContainer.class, msgs);
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS, MappedElement.class, msgs);
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
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				return getWalk();
			case CrosswalkPackage.MAPPED_ELEMENT__EXCEPTION:
				return getException();
			case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
				return getChildElements();
			case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
				return getAttributes();
			case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
				if (resolve) return getMappedFeature();
				return basicGetMappedFeature();
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				return getParent();
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
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				setWalk((MappingContainer)newValue);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__EXCEPTION:
				setException((Throwable)newValue);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends MappedElement>)newValue);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MappedAttribute>)newValue);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
				setMappedFeature((EReference)newValue);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				setParent((MappedElement)newValue);
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
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				setWalk((MappingContainer)null);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__EXCEPTION:
				setException(EXCEPTION_EDEFAULT);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
				setMappedFeature((EReference)null);
				return;
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				setParent((MappedElement)null);
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
			case CrosswalkPackage.MAPPED_ELEMENT__WALK:
				return getWalk() != null;
			case CrosswalkPackage.MAPPED_ELEMENT__EXCEPTION:
				return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
			case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
				return mappedFeature != null;
			case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
				return getParent() != null;
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
		result.append(" (exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

} // MappedElementImpl
