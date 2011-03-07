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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.StringGenerator;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mapped Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link crosswalk.impl.MappedElementImpl#getWalk <em>Walk</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getChildElements <em>Child
 * Elements</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getAttributes <em>Attributes
 * </em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getMappedFeature <em>Mapped
 * Feature</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getText <em>Text</em>}</li>
 * <li>{@link crosswalk.impl.MappedElementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedElementImpl extends EObjectImpl implements MappedElement {

    /**
     * The cached value of the '{@link #getChildElements()
     * <em>Child Elements</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getChildElements()
     * @generated
     * @ordered
     */
    protected EList<MappedElement> childElements;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<MappedAttribute> attributes;

    /**
     * The cached value of the '{@link #getMappedFeature()
     * <em>Mapped Feature</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getMappedFeature()
     * @generated
     * @ordered
     */
    protected EReference mappedFeature;

    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getText()
     * @generated
     * @ordered
     */
    protected StringInput text;

    /**
     * This is true if the Text containment reference has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean textESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MappedElementImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return CrosswalkPackage.Literals.MAPPED_ELEMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CrossWalk getWalk() {
	if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__WALK)
	    return null;
	return (CrossWalk) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
	msgs = eBasicSetContainer((InternalEObject) newWalk, CrosswalkPackage.MAPPED_ELEMENT__WALK, msgs);
	return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setWalk(CrossWalk newWalk) {
	if (newWalk != eInternalContainer()
			|| (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__WALK && newWalk != null)) {
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
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__WALK, newWalk,
			    newWalk));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<MappedElement> getChildElements() {
	if (childElements == null) {
	    childElements = new EObjectContainmentWithInverseEList<MappedElement>(MappedElement.class, this,
			    CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS, CrosswalkPackage.MAPPED_ELEMENT__PARENT);
	}
	return childElements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<MappedAttribute> getAttributes() {
	if (attributes == null) {
	    attributes = new EObjectContainmentEList<MappedAttribute>(MappedAttribute.class, this,
			    CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES);
	}
	return attributes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EReference getMappedFeature() {
	if (mappedFeature != null && mappedFeature.eIsProxy()) {
	    InternalEObject oldMappedFeature = (InternalEObject) mappedFeature;
	    mappedFeature = (EReference) eResolveProxy(oldMappedFeature);
	    if (mappedFeature != oldMappedFeature) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
				    CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE, oldMappedFeature, mappedFeature));
	    }
	}
	return mappedFeature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EReference basicGetMappedFeature() {
	return mappedFeature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void setMappedFeature(EReference newMappedFeature) {
	EReference oldMappedFeature = mappedFeature;
	mappedFeature = newMappedFeature;
	updateText();
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE,
			    oldMappedFeature, mappedFeature));
    }

    /**
 *
 */
    private void updateText() {
	EAttribute txtAtt = this.findTextAttribute();
	if (txtAtt != null) {
	    StringInput txtInput = CrosswalkPackage.eINSTANCE.getCrosswalkFactory().createStringInput();
	    txtInput.setName("Text");
	    this.setText(txtInput);
	}
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StringInput getText() {
	return text;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetText(StringInput newText, NotificationChain msgs) {
	StringInput oldText = text;
	text = newText;
	boolean oldTextESet = textESet;
	textESet = true;
	if (eNotificationRequired()) {
	    ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
			    CrosswalkPackage.MAPPED_ELEMENT__TEXT, oldText, newText, !oldTextESet);
	    if (msgs == null)
		msgs = notification;
	    else
		msgs.add(notification);
	}
	return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setText(StringInput newText) {
	if (newText != text) {
	    NotificationChain msgs = null;
	    if (text != null)
		msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
				- CrosswalkPackage.MAPPED_ELEMENT__TEXT, null, msgs);
	    if (newText != null)
		msgs = ((InternalEObject) newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
				- CrosswalkPackage.MAPPED_ELEMENT__TEXT, null, msgs);
	    msgs = basicSetText(newText, msgs);
	    if (msgs != null)
		msgs.dispatch();
	} else {
	    boolean oldTextESet = textESet;
	    textESet = true;
	    if (eNotificationRequired())
		eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__TEXT, newText,
				newText, !oldTextESet));
	}
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicUnsetText(NotificationChain msgs) {
	StringInput oldText = text;
	text = null;
	boolean oldTextESet = textESet;
	textESet = false;
	if (eNotificationRequired()) {
	    ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
			    CrosswalkPackage.MAPPED_ELEMENT__TEXT, oldText, null, oldTextESet);
	    if (msgs == null)
		msgs = notification;
	    else
		msgs.add(notification);
	}
	return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void unsetText() {
	if (text != null) {
	    NotificationChain msgs = null;
	    msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			    - CrosswalkPackage.MAPPED_ELEMENT__TEXT, null, msgs);
	    msgs = basicUnsetText(msgs);
	    if (msgs != null)
		msgs.dispatch();
	} else {
	    boolean oldTextESet = textESet;
	    textESet = false;
	    if (eNotificationRequired())
		eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.MAPPED_ELEMENT__TEXT, null,
				null, oldTextESet));
	}
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean isSetText() {
	return textESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MappedElement getParent() {
	if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__PARENT)
	    return null;
	return (MappedElement) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetParent(MappedElement newParent, NotificationChain msgs) {
	msgs = eBasicSetContainer((InternalEObject) newParent, CrosswalkPackage.MAPPED_ELEMENT__PARENT, msgs);
	return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setParent(MappedElement newParent) {
	if (newParent != eInternalContainer()
			|| (eContainerFeatureID() != CrosswalkPackage.MAPPED_ELEMENT__PARENT && newParent != null)) {
	    if (EcoreUtil.isAncestor(this, newParent))
		throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
	    NotificationChain msgs = null;
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    if (newParent != null)
		msgs = ((InternalEObject) newParent).eInverseAdd(this, CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS,
				MappedElement.class, msgs);
	    msgs = basicSetParent(newParent, msgs);
	    if (msgs != null)
		msgs.dispatch();
	} else if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ELEMENT__PARENT, newParent,
			    newParent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void updateRecord(EObject record) {
	if (this.getMappedFeature() != null && this.getMappedFeature().getEType() != null) {
	    EClassifier mytype = this.getMappedFeature().getEType();
	    System.out.println("my type: " + mytype.toString());
	    EObject myobject = mytype.getEPackage().getEFactoryInstance().create(mytype.eClass());
	    System.out.println("my object: " + myobject.toString());

	    // set text attribute (text within most XML elements)
	    if (this.isSetText()) {
		EAttribute a = this.findTextAttribute();
		if (a != null) {
		    StringGenerator gen = this.getText().getInput();
		    if (gen != null) {
			try {
			    String text = gen.getResultString();
			    if (text != null) {
				myobject.eSet(a, text);
			    }
			} catch (DataException e) {
			    // ignored
			}
		    }
		}
	    }

	    for (MappedAttribute ma : this.getAttributes()) {
		ma.updateRecord(myobject);
	    }

	    for (MappedElement me : this.getChildElements()) {
		me.updateRecord(myobject);
	    }

	    record.eSet(getMappedFeature(), myobject);
	    System.out.println("my parent: " + record.toString());
	}
    }

    private EAttribute findTextAttribute() {
	EAttribute result = null;
	// find the value attribute of type String with Annotation kind=simple
	for (EAttribute a : getMappedFeature().getEType().eClass().getEAttributes()) {
	    if ("String".equals(a.getEType().getName())) {
		System.out.println("found attribute of type named String:" + a);
		if ("value".equals(a.getName())) {
		    System.out.println("found attribute with name value: " + a);
		    result = a;
		    break;
		}
	    }
	}
	return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    return basicSetWalk((CrossWalk) otherEnd, msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
	    return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildElements()).basicAdd(otherEnd, msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    if (eInternalContainer() != null)
		msgs = eBasicRemoveFromContainer(msgs);
	    return basicSetParent((MappedElement) otherEnd, msgs);
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
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    return basicSetWalk(null, msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
	    return ((InternalEList<?>) getChildElements()).basicRemove(otherEnd, msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
	    return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__TEXT:
	    return basicUnsetText(msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    return basicSetParent(null, msgs);
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
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__ELEMENTS, CrossWalk.class,
			    msgs);
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    return eInternalContainer().eInverseRemove(this, CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS,
			    MappedElement.class, msgs);
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
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    return getWalk();
	case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
	    return getChildElements();
	case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
	    return getAttributes();
	case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
	    if (resolve)
		return getMappedFeature();
	    return basicGetMappedFeature();
	case CrosswalkPackage.MAPPED_ELEMENT__TEXT:
	    return getText();
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    return getParent();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    setWalk((CrossWalk) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
	    getChildElements().clear();
	    getChildElements().addAll((Collection<? extends MappedElement>) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
	    getAttributes().clear();
	    getAttributes().addAll((Collection<? extends MappedAttribute>) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
	    setMappedFeature((EReference) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__TEXT:
	    setText((StringInput) newValue);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    setParent((MappedElement) newValue);
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
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    setWalk((CrossWalk) null);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
	    getChildElements().clear();
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
	    getAttributes().clear();
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
	    setMappedFeature((EReference) null);
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__TEXT:
	    unsetText();
	    return;
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    setParent((MappedElement) null);
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
	case CrosswalkPackage.MAPPED_ELEMENT__WALK:
	    return getWalk() != null;
	case CrosswalkPackage.MAPPED_ELEMENT__CHILD_ELEMENTS:
	    return childElements != null && !childElements.isEmpty();
	case CrosswalkPackage.MAPPED_ELEMENT__ATTRIBUTES:
	    return attributes != null && !attributes.isEmpty();
	case CrosswalkPackage.MAPPED_ELEMENT__MAPPED_FEATURE:
	    return mappedFeature != null;
	case CrosswalkPackage.MAPPED_ELEMENT__TEXT:
	    return isSetText();
	case CrosswalkPackage.MAPPED_ELEMENT__PARENT:
	    return getParent() != null;
	}
	return super.eIsSet(featureID);
    }

} // MappedElementImpl
