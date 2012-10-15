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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.ContextProvider;
import crosswalk.CrosswalkPackage;
import crosswalk.FormElement;
import crosswalk.InputField;
import crosswalk.MappingContainer;
import crosswalk.MetadataBlock;
import crosswalk.OutputElement;
import crosswalk.WalkWidget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getException <em>Exception</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link crosswalk.impl.MetadataBlockImpl#getMaxRepeat <em>Max Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataBlockImpl extends EObjectImpl implements MetadataBlock {
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
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected EClass outputType;

	/**
	 * The default value of the '{@link #getCurrentUser() <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentUser()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentUser() <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentUser()
	 * @generated
	 * @ordered
	 */
	protected String currentUser = CURRENT_USER_EDEFAULT;

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
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Throwable> exceptions;

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
	protected EList<InputField<?>> ports;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRepeat() <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REPEAT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxRepeat() <em>Max Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRepeat()
	 * @generated
	 * @ordered
	 */
	protected int maxRepeat = MAX_REPEAT_EDEFAULT;

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
	public MappingContainer getWalk() {
		if (eContainerFeatureID() != CrosswalkPackage.METADATA_BLOCK__WALK) return null;
		return (MappingContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalk(MappingContainer newWalk, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.METADATA_BLOCK__WALK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalk(MappingContainer newWalk) {
		if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.METADATA_BLOCK__WALK && newWalk != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__WALK, newWalk, newWalk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__EXCEPTION, oldException, exception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputType() {
		if (outputType != null && outputType.eIsProxy()) {
			InternalEObject oldOutputType = (InternalEObject)outputType;
			outputType = (EClass)eResolveProxy(oldOutputType);
			if (outputType != oldOutputType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE, oldOutputType, outputType));
			}
		}
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(EClass newOutputType) {
		EClass oldOutputType = outputType;
		outputType = newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE, oldOutputType, outputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentUser() {
		return currentUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUser(String newCurrentUser) {
		String oldCurrentUser = currentUser;
		currentUser = newCurrentUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__CURRENT_USER, oldCurrentUser, currentUser));
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
			elements = new EObjectContainmentWithInverseEList<OutputElement>(OutputElement.class, this, CrosswalkPackage.METADATA_BLOCK__ELEMENTS, CrosswalkPackage.OUTPUT_ELEMENT__WALK);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Throwable> getExceptions() {
		if (exceptions == null) {
			exceptions = new EDataTypeUniqueEList<Throwable>(Throwable.class, this, CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputField<?>> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<InputField<?>>(InputField.class, this, CrosswalkPackage.METADATA_BLOCK__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRepeat() {
		return maxRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRepeat(int newMaxRepeat) {
		int oldMaxRepeat = maxRepeat;
		maxRepeat = newMaxRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.METADATA_BLOCK__MAX_REPEAT, oldMaxRepeat, maxRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WalkWidget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentWithInverseEList<WalkWidget>(WalkWidget.class, this, CrosswalkPackage.METADATA_BLOCK__WIDGETS, CrosswalkPackage.WALK_WIDGET__WALK);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWalk((MappingContainer)otherEnd, msgs);
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWidgets()).basicAdd(otherEnd, msgs);
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				return basicSetWalk(null, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				return eInternalContainer().eInverseRemove(this, CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS, MappingContainer.class, msgs);
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
			case CrosswalkPackage.METADATA_BLOCK__WALK:
				return getWalk();
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTION:
				return getException();
			case CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE:
				if (resolve) return getOutputType();
				return basicGetOutputType();
			case CrosswalkPackage.METADATA_BLOCK__CURRENT_USER:
				return getCurrentUser();
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				return getWidgets();
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				return getElements();
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS:
				return getExceptions();
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				return getName();
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				return getDescription();
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				return getPorts();
			case CrosswalkPackage.METADATA_BLOCK__REQUIRED:
				return isRequired();
			case CrosswalkPackage.METADATA_BLOCK__MAX_REPEAT:
				return getMaxRepeat();
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
				setWalk((MappingContainer)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTION:
				setException((Throwable)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE:
				setOutputType((EClass)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__CURRENT_USER:
				setCurrentUser((String)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends WalkWidget>)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends OutputElement>)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends Throwable>)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				setName((String)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends InputField<?>>)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CrosswalkPackage.METADATA_BLOCK__MAX_REPEAT:
				setMaxRepeat((Integer)newValue);
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
				setWalk((MappingContainer)null);
				return;
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTION:
				setException(EXCEPTION_EDEFAULT);
				return;
			case CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE:
				setOutputType((EClass)null);
				return;
			case CrosswalkPackage.METADATA_BLOCK__CURRENT_USER:
				setCurrentUser(CURRENT_USER_EDEFAULT);
				return;
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				getWidgets().clear();
				return;
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				getElements().clear();
				return;
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS:
				getExceptions().clear();
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
			case CrosswalkPackage.METADATA_BLOCK__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CrosswalkPackage.METADATA_BLOCK__MAX_REPEAT:
				setMaxRepeat(MAX_REPEAT_EDEFAULT);
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
				return getWalk() != null;
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTION:
				return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
			case CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE:
				return outputType != null;
			case CrosswalkPackage.METADATA_BLOCK__CURRENT_USER:
				return CURRENT_USER_EDEFAULT == null ? currentUser != null : !CURRENT_USER_EDEFAULT.equals(currentUser);
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case CrosswalkPackage.METADATA_BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
				return ports != null && !ports.isEmpty();
			case CrosswalkPackage.METADATA_BLOCK__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CrosswalkPackage.METADATA_BLOCK__MAX_REPEAT:
				return maxRepeat != MAX_REPEAT_EDEFAULT;
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
		if (baseClass == ContextProvider.class) {
			switch (derivedFeatureID) {
				case CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE: return CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_TYPE;
				case CrosswalkPackage.METADATA_BLOCK__CURRENT_USER: return CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER;
				default: return -1;
			}
		}
		if (baseClass == MappingContainer.class) {
			switch (derivedFeatureID) {
				case CrosswalkPackage.METADATA_BLOCK__WIDGETS: return CrosswalkPackage.MAPPING_CONTAINER__WIDGETS;
				case CrosswalkPackage.METADATA_BLOCK__ELEMENTS: return CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS;
				case CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS: return CrosswalkPackage.MAPPING_CONTAINER__EXCEPTIONS;
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
		if (baseClass == ContextProvider.class) {
			switch (baseFeatureID) {
				case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_TYPE: return CrosswalkPackage.METADATA_BLOCK__OUTPUT_TYPE;
				case CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER: return CrosswalkPackage.METADATA_BLOCK__CURRENT_USER;
				default: return -1;
			}
		}
		if (baseClass == MappingContainer.class) {
			switch (baseFeatureID) {
				case CrosswalkPackage.MAPPING_CONTAINER__WIDGETS: return CrosswalkPackage.METADATA_BLOCK__WIDGETS;
				case CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS: return CrosswalkPackage.METADATA_BLOCK__ELEMENTS;
				case CrosswalkPackage.MAPPING_CONTAINER__EXCEPTIONS: return CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS;
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
		result.append(" (exception: ");
		result.append(exception);
		result.append(", currentUser: ");
		result.append(currentUser);
		result.append(", exceptions: ");
		result.append(exceptions);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", required: ");
		result.append(required);
		result.append(", maxRepeat: ");
		result.append(maxRepeat);
		result.append(')');
		return result.toString();
	}

} //MetadataBlockImpl
