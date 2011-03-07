/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.InputConsumer;
import crosswalk.MappedAttribute;
import crosswalk.StringGenerator;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mapped Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getWalk <em>Walk</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getName <em>Name</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getConsumer <em>Consumer</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getInput <em>Input</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getMappedFeature <em>Mapped
 * Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedAttributeImpl extends EObjectImpl implements MappedAttribute {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = "input";

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected StringGenerator input;

    /**
     * This is true if the Input reference has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean inputESet;

    /**
     * The cached value of the '{@link #getMappedFeature()
     * <em>Mapped Feature</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getMappedFeature()
     * @generated
     * @ordered
     */
    protected EAttribute mappedFeature;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MappedAttributeImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return CrosswalkPackage.Literals.MAPPED_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CrossWalk getWalk() {
	if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__WALK)
	    return null;
	return (CrossWalk) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
	msgs = eBasicSetContainer((InternalEObject) newWalk, CrosswalkPackage.MAPPED_ATTRIBUTE__WALK, msgs);
	return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setWalk(CrossWalk newWalk) {
	if (newWalk != eInternalContainer()
			|| (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__WALK && newWalk != null)) {
	    if (EcoreUtil.isAncestor(this, newWalk))
		throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
	    NotificationChain msgs = null;
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    if (newWalk != null)
		msgs = ((InternalEObject) newWalk).eInverseAdd(this, CrosswalkPackage.CROSS_WALK__ELEMENTS,
				CrossWalk.class, msgs);
	    msgs = basicSetWalk(newWalk, msgs);
	    if (msgs != null)
		msgs.dispatch();
	} else if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__WALK, newWalk,
			    newWalk));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String getName() {
	return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setName(String newName) {
	String oldName = name;
	name = newName;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__NAME, oldName,
			    name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public InputConsumer getConsumer() {
	if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER)
	    return null;
	return (InputConsumer) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetConsumer(InputConsumer newConsumer, NotificationChain msgs) {
	msgs = eBasicSetContainer((InternalEObject) newConsumer, CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER, msgs);
	return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setConsumer(InputConsumer newConsumer) {
	if (newConsumer != eInternalContainer()
			|| (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER && newConsumer != null)) {
	    if (EcoreUtil.isAncestor(this, newConsumer))
		throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
	    NotificationChain msgs = null;
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    if (newConsumer != null)
		msgs = ((InternalEObject) newConsumer).eInverseAdd(this, CrosswalkPackage.INPUT_CONSUMER__INPUTS,
				InputConsumer.class, msgs);
	    msgs = basicSetConsumer(newConsumer, msgs);
	    if (msgs != null)
		msgs.dispatch();
	} else if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER,
			    newConsumer, newConsumer));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StringGenerator getInput() {
	if (input != null && input.eIsProxy()) {
	    InternalEObject oldInput = (InternalEObject) input;
	    input = (StringGenerator) eResolveProxy(oldInput);
	    if (input != oldInput) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT,
				    oldInput, input));
	    }
	}
	return input;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StringGenerator basicGetInput() {
	return input;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setInput(StringGenerator newInput) {
	StringGenerator oldInput = input;
	input = newInput;
	boolean oldInputESet = inputESet;
	inputESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT, oldInput,
			    input, !oldInputESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void unsetInput() {
	StringGenerator oldInput = input;
	boolean oldInputESet = inputESet;
	input = null;
	inputESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT, oldInput,
			    null, oldInputESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean isSetInput() {
	return inputESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EAttribute getMappedFeature() {
	if (mappedFeature != null && mappedFeature.eIsProxy()) {
	    InternalEObject oldMappedFeature = (InternalEObject) mappedFeature;
	    mappedFeature = (EAttribute) eResolveProxy(oldMappedFeature);
	    if (mappedFeature != oldMappedFeature) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
				    CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE, oldMappedFeature, mappedFeature));
	    }
	}
	return mappedFeature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EAttribute basicGetMappedFeature() {
	return mappedFeature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setMappedFeature(EAttribute newMappedFeature) {
	EAttribute oldMappedFeature = mappedFeature;
	mappedFeature = newMappedFeature;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE,
			    oldMappedFeature, mappedFeature));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void updateRecord(EObject record) {
	EAttribute myAttribute = this.getMappedFeature();
	System.out.println("my type: " + myAttribute.toString());

	String input = null;
	StringGenerator gen = this.getInput();
	if (gen != null) {
	    try {
		input = gen.getResultString();
	    } catch (DataException e) {
		// ignored
	    }
	}
	if (String.class.equals(myAttribute.getEAttributeType().getInstanceClass())) {
	    // the Attribute data type is String, no conversion..
	    if(input != null) {
		record.eSet(myAttribute, input);
	    }
	}
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    return basicSetWalk((CrossWalk) otherEnd, msgs);
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    return basicSetConsumer((InputConsumer) otherEnd, msgs);
	}
	return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    return basicSetWalk(null, msgs);
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    return basicSetConsumer(null, msgs);
	}
	return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
	switch (eContainerFeatureID()) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__ELEMENTS, CrossWalk.class,
			    msgs);
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    return eInternalContainer().eInverseRemove(this, CrosswalkPackage.INPUT_CONSUMER__INPUTS,
			    InputConsumer.class, msgs);
	}
	return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    return getWalk();
	case CrosswalkPackage.MAPPED_ATTRIBUTE__NAME:
	    return getName();
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    return getConsumer();
	case CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT:
	    if (resolve)
		return getInput();
	    return basicGetInput();
	case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
	    if (resolve)
		return getMappedFeature();
	    return basicGetMappedFeature();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    setWalk((CrossWalk) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__NAME:
	    setName((String) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    setConsumer((InputConsumer) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT:
	    setInput((StringGenerator) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
	    setMappedFeature((EAttribute) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    setWalk((CrossWalk) null);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__NAME:
	    setName(NAME_EDEFAULT);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    setConsumer((InputConsumer) null);
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT:
	    unsetInput();
	    return;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
	    setMappedFeature((EAttribute) null);
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
	    return getWalk() != null;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__NAME:
	    return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
	case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
	    return getConsumer() != null;
	case CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT:
	    return isSetInput();
	case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
	    return mappedFeature != null;
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
	if (baseClass == Input.class) {
	    switch (derivedFeatureID) {
	    case CrosswalkPackage.MAPPED_ATTRIBUTE__NAME:
		return CrosswalkPackage.INPUT__NAME;
	    case CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER:
		return CrosswalkPackage.INPUT__CONSUMER;
	    default:
		return -1;
	    }
	}
	if (baseClass == StringInput.class) {
	    switch (derivedFeatureID) {
	    case CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT:
		return CrosswalkPackage.STRING_INPUT__INPUT;
	    default:
		return -1;
	    }
	}
	return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
	if (baseClass == Input.class) {
	    switch (baseFeatureID) {
	    case CrosswalkPackage.INPUT__NAME:
		return CrosswalkPackage.MAPPED_ATTRIBUTE__NAME;
	    case CrosswalkPackage.INPUT__CONSUMER:
		return CrosswalkPackage.MAPPED_ATTRIBUTE__CONSUMER;
	    default:
		return -1;
	    }
	}
	if (baseClass == StringInput.class) {
	    switch (baseFeatureID) {
	    case CrosswalkPackage.STRING_INPUT__INPUT:
		return CrosswalkPackage.MAPPED_ATTRIBUTE__INPUT;
	    default:
		return -1;
	    }
	}
	return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuffer result = new StringBuffer(super.toString());
	result.append(" (Name: ");
	result.append(name);
	result.append(')');
	return result.toString();
    }

} // MappedAttributeImpl
