/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.CrosswalkPackage;
import crosswalk.FormElement;
import crosswalk.InputField;
import crosswalk.MappedElement;
import crosswalk.MappingContainer;
import crosswalk.MetadataBlock;
import crosswalk.OutputElement;
import crosswalk.SchemaProvider;
import crosswalk.WalkWidget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataBlockImpl extends EObjectImpl implements MetadataBlock {
	/**
	 * The cached value of the '{@link #getWalk() <em>Walk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalk()
	 * @generated
	 * @ordered
	 */
	protected SchemaProvider walk;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<WalkWidget> widgets;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputElement> elements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InputField> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.METADATA_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaProvider getWalk() {
		if (walk != null && walk.eIsProxy()) {
			InternalEObject oldWalk = (InternalEObject)walk;
			walk = (SchemaProvider)eResolveProxy(oldWalk);
			if (walk != oldWalk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.METADATA_BLOCK__WALK, oldWalk, walk));
			}
		}
		return walk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaProvider basicGetWalk() {
		return walk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalk(SchemaProvider newWalk) {
		SchemaProvider oldWalk = walk;
		walk = newWalk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__WALK, oldWalk, walk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<OutputElement>(OutputElement.class, this, CrosswalkPackage.METADATA_BLOCK__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputField> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<InputField>(InputField.class, this, CrosswalkPackage.METADATA_BLOCK__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WalkWidget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<WalkWidget>(WalkWidget.class, this, CrosswalkPackage.METADATA_BLOCK__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateRecord(EObject record) {
		for (OutputElement e : getElements()) {
			e.updateRecord(record);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				if (resolve) return getWalk();
				return basicGetWalk();
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				return getWidgets();
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				return getElements();
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				return getName();
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				return getDescription();
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				return getPorts();
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
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				setWalk((SchemaProvider)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends WalkWidget>)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends OutputElement>)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				setName((String)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends InputField>)newValue);
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
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				setWalk((SchemaProvider)null);
				return;
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				getWidgets().clear();
				return;
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				getElements().clear();
				return;
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				getPorts().clear();
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
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				return walk != null;
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				return ports != null && !ports.isEmpty();
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
		if (baseClass == MappingContainer.class) {
			switch (derivedFeatureID) {
				case CrosswalkPackage.METADATA_BLOCK__WIDGETS: return CrosswalkPackage.MAPPING_CONTAINER__WIDGETS;
				case CrosswalkPackage.METADATA_BLOCK__ELEMENTS: return CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == FormElement.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == MappingContainer.class) {
			switch (baseFeatureID) {
				case CrosswalkPackage.MAPPING_CONTAINER__WIDGETS: return CrosswalkPackage.METADATA_BLOCK__WIDGETS;
				case CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS: return CrosswalkPackage.METADATA_BLOCK__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == FormElement.class) {
			switch (baseFeatureID) {
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MetadataBlockImpl
