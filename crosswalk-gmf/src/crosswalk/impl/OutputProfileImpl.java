/**
 */
package crosswalk.impl;

import crosswalk.CrosswalkPackage;
import crosswalk.OutputMetadataSections;
import crosswalk.OutputProfile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#getParentMappedFeature <em>Parent Mapped Feature</em>}</li>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#isStartMappingAtChildren <em>Start Mapping At Children</em>}</li>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#getMetadataLabel <em>Metadata Label</em>}</li>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#getMetadataType <em>Metadata Type</em>}</li>
 *   <li>{@link crosswalk.impl.OutputProfileImpl#getMetadataSection <em>Metadata Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputProfileImpl extends EObjectImpl implements OutputProfile {
	/**
	 * The cached value of the '{@link #getParentMappedFeature() <em>Parent Mapped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentMappedFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference parentMappedFeature;

	/**
	 * The default value of the '{@link #isStartMappingAtChildren() <em>Start Mapping At Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartMappingAtChildren()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_MAPPING_AT_CHILDREN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStartMappingAtChildren() <em>Start Mapping At Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartMappingAtChildren()
	 * @generated
	 * @ordered
	 */
	protected boolean startMappingAtChildren = START_MAPPING_AT_CHILDREN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Profile Name";

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "Description";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataLabel() <em>Metadata Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataLabel() <em>Metadata Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataLabel()
	 * @generated
	 * @ordered
	 */
	protected String metadataLabel = METADATA_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataType() <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataType()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA_TYPE_EDEFAULT = "OTHER";

	/**
	 * The cached value of the '{@link #getMetadataType() <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataType()
	 * @generated
	 * @ordered
	 */
	protected String metadataType = METADATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataSection() <em>Metadata Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataSection()
	 * @generated
	 * @ordered
	 */
	protected static final OutputMetadataSections METADATA_SECTION_EDEFAULT = OutputMetadataSections.RIGHTS_MD;

	/**
	 * The cached value of the '{@link #getMetadataSection() <em>Metadata Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataSection()
	 * @generated
	 * @ordered
	 */
	protected OutputMetadataSections metadataSection = METADATA_SECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.OUTPUT_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentMappedFeature() {
		if (parentMappedFeature != null && parentMappedFeature.eIsProxy()) {
			InternalEObject oldParentMappedFeature = (InternalEObject)parentMappedFeature;
			parentMappedFeature = (EReference)eResolveProxy(oldParentMappedFeature);
			if (parentMappedFeature != oldParentMappedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.OUTPUT_PROFILE__PARENT_MAPPED_FEATURE, oldParentMappedFeature, parentMappedFeature));
			}
		}
		return parentMappedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetParentMappedFeature() {
		return parentMappedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMappedFeature(EReference newParentMappedFeature) {
		EReference oldParentMappedFeature = parentMappedFeature;
		parentMappedFeature = newParentMappedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__PARENT_MAPPED_FEATURE, oldParentMappedFeature, parentMappedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMetadataSections getMetadataSection() {
		return metadataSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataSection(OutputMetadataSections newMetadataSection) {
		OutputMetadataSections oldMetadataSection = metadataSection;
		metadataSection = newMetadataSection == null ? METADATA_SECTION_EDEFAULT : newMetadataSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__METADATA_SECTION, oldMetadataSection, metadataSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartMappingAtChildren() {
		return startMappingAtChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMappingAtChildren(boolean newStartMappingAtChildren) {
		boolean oldStartMappingAtChildren = startMappingAtChildren;
		startMappingAtChildren = newStartMappingAtChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__START_MAPPING_AT_CHILDREN, oldStartMappingAtChildren, startMappingAtChildren));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadataLabel() {
		return metadataLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataLabel(String newMetadataLabel) {
		String oldMetadataLabel = metadataLabel;
		metadataLabel = newMetadataLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__METADATA_LABEL, oldMetadataLabel, metadataLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadataType() {
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataType(String newMetadataType) {
		String oldMetadataType = metadataType;
		metadataType = newMetadataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.OUTPUT_PROFILE__METADATA_TYPE, oldMetadataType, metadataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.OUTPUT_PROFILE__PARENT_MAPPED_FEATURE:
				if (resolve) return getParentMappedFeature();
				return basicGetParentMappedFeature();
			case CrosswalkPackage.OUTPUT_PROFILE__START_MAPPING_AT_CHILDREN:
				return isStartMappingAtChildren();
			case CrosswalkPackage.OUTPUT_PROFILE__NAME:
				return getName();
			case CrosswalkPackage.OUTPUT_PROFILE__DESCRIPTION:
				return getDescription();
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_LABEL:
				return getMetadataLabel();
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_TYPE:
				return getMetadataType();
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_SECTION:
				return getMetadataSection();
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
			case CrosswalkPackage.OUTPUT_PROFILE__PARENT_MAPPED_FEATURE:
				setParentMappedFeature((EReference)newValue);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__START_MAPPING_AT_CHILDREN:
				setStartMappingAtChildren((Boolean)newValue);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__NAME:
				setName((String)newValue);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_LABEL:
				setMetadataLabel((String)newValue);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_TYPE:
				setMetadataType((String)newValue);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_SECTION:
				setMetadataSection((OutputMetadataSections)newValue);
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
			case CrosswalkPackage.OUTPUT_PROFILE__PARENT_MAPPED_FEATURE:
				setParentMappedFeature((EReference)null);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__START_MAPPING_AT_CHILDREN:
				setStartMappingAtChildren(START_MAPPING_AT_CHILDREN_EDEFAULT);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_LABEL:
				setMetadataLabel(METADATA_LABEL_EDEFAULT);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_TYPE:
				setMetadataType(METADATA_TYPE_EDEFAULT);
				return;
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_SECTION:
				setMetadataSection(METADATA_SECTION_EDEFAULT);
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
			case CrosswalkPackage.OUTPUT_PROFILE__PARENT_MAPPED_FEATURE:
				return parentMappedFeature != null;
			case CrosswalkPackage.OUTPUT_PROFILE__START_MAPPING_AT_CHILDREN:
				return startMappingAtChildren != START_MAPPING_AT_CHILDREN_EDEFAULT;
			case CrosswalkPackage.OUTPUT_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CrosswalkPackage.OUTPUT_PROFILE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_LABEL:
				return METADATA_LABEL_EDEFAULT == null ? metadataLabel != null : !METADATA_LABEL_EDEFAULT.equals(metadataLabel);
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_TYPE:
				return METADATA_TYPE_EDEFAULT == null ? metadataType != null : !METADATA_TYPE_EDEFAULT.equals(metadataType);
			case CrosswalkPackage.OUTPUT_PROFILE__METADATA_SECTION:
				return metadataSection != METADATA_SECTION_EDEFAULT;
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
		result.append(" (startMappingAtChildren: ");
		result.append(startMappingAtChildren);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", metadataLabel: ");
		result.append(metadataLabel);
		result.append(", metadataType: ");
		result.append(metadataType);
		result.append(", metadataSection: ");
		result.append(metadataSection);
		result.append(')');
		return result.toString();
	}

} //OutputProfileImpl
