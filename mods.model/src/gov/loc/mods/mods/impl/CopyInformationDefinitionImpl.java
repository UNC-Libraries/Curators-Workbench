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
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.CopyInformationDefinition;
import gov.loc.mods.mods.EnumerationAndChronologyDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.NoteBaseDefinition;
import gov.loc.mods.mods.StringPlusAuthorityPlusType;
import gov.loc.mods.mods.XsString;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Information Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl#getForm <em>Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl#getSubLocation <em>Sub Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl#getShelfLocator <em>Shelf Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl#getElectronicLocator <em>Electronic Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CopyInformationDefinitionImpl#getEnumerationAndChronology <em>Enumeration And Chronology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyInformationDefinitionImpl extends EObjectImpl implements
		CopyInformationDefinition {
	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected StringPlusAuthorityPlusType form;

	/**
	 * The cached value of the '{@link #getSubLocation() <em>Sub Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<XsString> subLocation;

	/**
	 * The cached value of the '{@link #getShelfLocator() <em>Shelf Locator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLocator()
	 * @generated
	 * @ordered
	 */
	protected EList<XsString> shelfLocator;

	/**
	 * The cached value of the '{@link #getElectronicLocator() <em>Electronic Locator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicLocator()
	 * @generated
	 * @ordered
	 */
	protected EList<XsString> electronicLocator;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<NoteBaseDefinition> note;

	/**
	 * The cached value of the '{@link #getEnumerationAndChronology() <em>Enumeration And Chronology</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationAndChronology()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationAndChronologyDefinition> enumerationAndChronology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyInformationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getCopyInformationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthorityPlusType getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(StringPlusAuthorityPlusType newForm,
			NotificationChain msgs) {
		StringPlusAuthorityPlusType oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MODSPackage.COPY_INFORMATION_DEFINITION__FORM, oldForm,
					newForm);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(StringPlusAuthorityPlusType newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject) form)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MODSPackage.COPY_INFORMATION_DEFINITION__FORM,
								null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject) newForm)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MODSPackage.COPY_INFORMATION_DEFINITION__FORM,
								null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.COPY_INFORMATION_DEFINITION__FORM, newForm,
					newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getSubLocation() {
		if (subLocation == null) {
			subLocation = new EObjectContainmentEList<XsString>(XsString.class,
					this, MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION);
		}
		return subLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getShelfLocator() {
		if (shelfLocator == null) {
			shelfLocator = new EObjectContainmentEList<XsString>(
					XsString.class, this,
					MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR);
		}
		return shelfLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getElectronicLocator() {
		if (electronicLocator == null) {
			electronicLocator = new EObjectContainmentEList<XsString>(
					XsString.class, this,
					MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR);
		}
		return electronicLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteBaseDefinition> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<NoteBaseDefinition>(
					NoteBaseDefinition.class, this,
					MODSPackage.COPY_INFORMATION_DEFINITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationAndChronologyDefinition> getEnumerationAndChronology() {
		if (enumerationAndChronology == null) {
			enumerationAndChronology = new EObjectContainmentEList<EnumerationAndChronologyDefinition>(
					EnumerationAndChronologyDefinition.class,
					this,
					MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY);
		}
		return enumerationAndChronology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MODSPackage.COPY_INFORMATION_DEFINITION__FORM:
			return basicSetForm(null, msgs);
		case MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION:
			return ((InternalEList<?>) getSubLocation()).basicRemove(otherEnd,
					msgs);
		case MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR:
			return ((InternalEList<?>) getShelfLocator()).basicRemove(otherEnd,
					msgs);
		case MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR:
			return ((InternalEList<?>) getElectronicLocator()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.COPY_INFORMATION_DEFINITION__NOTE:
			return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
		case MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY:
			return ((InternalEList<?>) getEnumerationAndChronology())
					.basicRemove(otherEnd, msgs);
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
		case MODSPackage.COPY_INFORMATION_DEFINITION__FORM:
			return getForm();
		case MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION:
			return getSubLocation();
		case MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR:
			return getShelfLocator();
		case MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR:
			return getElectronicLocator();
		case MODSPackage.COPY_INFORMATION_DEFINITION__NOTE:
			return getNote();
		case MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY:
			return getEnumerationAndChronology();
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
		case MODSPackage.COPY_INFORMATION_DEFINITION__FORM:
			setForm((StringPlusAuthorityPlusType) newValue);
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION:
			getSubLocation().clear();
			getSubLocation().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR:
			getShelfLocator().clear();
			getShelfLocator().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR:
			getElectronicLocator().clear();
			getElectronicLocator().addAll(
					(Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__NOTE:
			getNote().clear();
			getNote().addAll(
					(Collection<? extends NoteBaseDefinition>) newValue);
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY:
			getEnumerationAndChronology().clear();
			getEnumerationAndChronology()
					.addAll((Collection<? extends EnumerationAndChronologyDefinition>) newValue);
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
		case MODSPackage.COPY_INFORMATION_DEFINITION__FORM:
			setForm((StringPlusAuthorityPlusType) null);
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION:
			getSubLocation().clear();
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR:
			getShelfLocator().clear();
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR:
			getElectronicLocator().clear();
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__NOTE:
			getNote().clear();
			return;
		case MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY:
			getEnumerationAndChronology().clear();
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
		case MODSPackage.COPY_INFORMATION_DEFINITION__FORM:
			return form != null;
		case MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION:
			return subLocation != null && !subLocation.isEmpty();
		case MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR:
			return shelfLocator != null && !shelfLocator.isEmpty();
		case MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR:
			return electronicLocator != null && !electronicLocator.isEmpty();
		case MODSPackage.COPY_INFORMATION_DEFINITION__NOTE:
			return note != null && !note.isEmpty();
		case MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY:
			return enumerationAndChronology != null
					&& !enumerationAndChronology.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CopyInformationDefinitionImpl
