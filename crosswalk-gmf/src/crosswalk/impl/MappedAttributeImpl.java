/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import crosswalk.ConversionStrategy;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.MappedAttribute;
import crosswalk.Output;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mapped Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.MappedAttributeImpl#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.impl.MappedAttributeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link crosswalk.impl.MappedAttributeImpl#getMappedFeature <em>Mapped Feature</em>}</li>
 *   <li>{@link crosswalk.impl.MappedAttributeImpl#getConversionStrategy <em>Conversion Strategy</em>}</li>
 *   <li>{@link crosswalk.impl.MappedAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedAttributeImpl extends EObjectImpl implements MappedAttribute {
    /**
         * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getOutput()
         * @generated
         * @ordered
         */
    protected Output output;

    /**
         * This is true if the Output reference has been set.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @generated
         * @ordered
         */
    protected boolean outputESet;

    /**
         * The cached value of the '{@link #getMappedFeature() <em>Mapped Feature</em>}' reference.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getMappedFeature()
         * @generated
         * @ordered
         */
    protected EAttribute mappedFeature;

    /**
         * The cached value of the '{@link #getConversionStrategy() <em>Conversion Strategy</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getConversionStrategy()
         * @generated
         * @ordered
         */
        protected ConversionStrategy conversionStrategy;

/**
         * This is true if the Conversion Strategy containment reference has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean conversionStrategyESet;

/**
         * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDefaultValue()
         * @generated
         * @ordered
         */
        protected static final String DEFAULT_VALUE_EDEFAULT = null;

/**
         * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDefaultValue()
         * @generated
         * @ordered
         */
        protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

/**
         * This is true if the Default Value attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean defaultValueESet;

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected MappedAttributeImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.MAPPED_ATTRIBUTE;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__WALK) return null;
                return (CrossWalk)eContainer();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.MAPPED_ATTRIBUTE__WALK, msgs);
                return msgs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__WALK && newWalk != null)) {
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__WALK, newWalk, newWalk));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public Output getOutput() {
                if (output != null && output.eIsProxy()) {
                        InternalEObject oldOutput = (InternalEObject)output;
                        output = (Output)eResolveProxy(oldOutput);
                        if (output != oldOutput) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT, oldOutput, output));
                        }
                }
                return output;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public Output basicGetOutput() {
                return output;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setOutput(Output newOutput) {
                Output oldOutput = output;
                output = newOutput;
                boolean oldOutputESet = outputESet;
                outputESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT, oldOutput, output, !oldOutputESet));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void unsetOutput() {
                Output oldOutput = output;
                boolean oldOutputESet = outputESet;
                output = null;
                outputESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT, oldOutput, null, oldOutputESet));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public boolean isSetOutput() {
                return outputESet;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public EAttribute getMappedFeature() {
                if (mappedFeature != null && mappedFeature.eIsProxy()) {
                        InternalEObject oldMappedFeature = (InternalEObject)mappedFeature;
                        mappedFeature = (EAttribute)eResolveProxy(oldMappedFeature);
                        if (mappedFeature != oldMappedFeature) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE, oldMappedFeature, mappedFeature));
                        }
                }
                return mappedFeature;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public EAttribute basicGetMappedFeature() {
                return mappedFeature;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setMappedFeature(EAttribute newMappedFeature) {
                EAttribute oldMappedFeature = mappedFeature;
                mappedFeature = newMappedFeature;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE, oldMappedFeature, mappedFeature));
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ConversionStrategy getConversionStrategy() {
                return conversionStrategy;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetConversionStrategy(ConversionStrategy newConversionStrategy, NotificationChain msgs) {
                ConversionStrategy oldConversionStrategy = conversionStrategy;
                conversionStrategy = newConversionStrategy;
                boolean oldConversionStrategyESet = conversionStrategyESet;
                conversionStrategyESet = true;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, oldConversionStrategy, newConversionStrategy, !oldConversionStrategyESet);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setConversionStrategy(ConversionStrategy newConversionStrategy) {
                if (newConversionStrategy != conversionStrategy) {
                        NotificationChain msgs = null;
                        if (conversionStrategy != null)
                                msgs = ((InternalEObject)conversionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, null, msgs);
                        if (newConversionStrategy != null)
                                msgs = ((InternalEObject)newConversionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, null, msgs);
                        msgs = basicSetConversionStrategy(newConversionStrategy, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else {
                        boolean oldConversionStrategyESet = conversionStrategyESet;
                        conversionStrategyESet = true;
                        if (eNotificationRequired())
                                eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, newConversionStrategy, newConversionStrategy, !oldConversionStrategyESet));
                }
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicUnsetConversionStrategy(NotificationChain msgs) {
                ConversionStrategy oldConversionStrategy = conversionStrategy;
                conversionStrategy = null;
                boolean oldConversionStrategyESet = conversionStrategyESet;
                conversionStrategyESet = false;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, oldConversionStrategy, null, oldConversionStrategyESet);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetConversionStrategy() {
                if (conversionStrategy != null) {
                        NotificationChain msgs = null;
                        msgs = ((InternalEObject)conversionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, null, msgs);
                        msgs = basicUnsetConversionStrategy(msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else {
                        boolean oldConversionStrategyESet = conversionStrategyESet;
                        conversionStrategyESet = false;
                        if (eNotificationRequired())
                                eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY, null, null, oldConversionStrategyESet));
                }
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetConversionStrategy() {
                return conversionStrategyESet;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getDefaultValue() {
                return defaultValue;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDefaultValue(String newDefaultValue) {
                String oldDefaultValue = defaultValue;
                defaultValue = newDefaultValue;
                boolean oldDefaultValueESet = defaultValueESet;
                defaultValueESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue, !oldDefaultValueESet));
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetDefaultValue() {
                String oldDefaultValue = defaultValue;
                boolean oldDefaultValueESet = defaultValueESet;
                defaultValue = DEFAULT_VALUE_EDEFAULT;
                defaultValueESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet));
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetDefaultValue() {
                return defaultValueESet;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated NOT
         */
    public EDataType getInputEDataType() {
	EDataType result = null; // null doesn't equal anything except null
	if(this.isSetConversionStrategy()) {
	    result = this.getConversionStrategy().getInputDataType();
	} else if(this.getMappedFeature() != null) {
	    result = this.getMappedFeature().getEAttributeType();
	}
	return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void updateRecord(EObject record) {
	EAttribute myAttribute = this.getMappedFeature();
	System.out.println("my type: " + myAttribute.toString());

	Object input = null;
	Output gen = this.getOutput();
	if (gen != null) {
	    try {
		input = gen.getResult();
		if (input != null) {
		    if(this.isSetConversionStrategy()) {
			Object o = this.getConversionStrategy().convert(input);
			record.eSet(myAttribute, o);
		    } else {
			record.eSet(myAttribute, input);
		    }
		}
	    } catch (DataException e) {
		// ignored
	    }
	}
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetWalk((CrossWalk)otherEnd, msgs);
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
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                return basicSetWalk(null, msgs);
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY:
                                return basicUnsetConversionStrategy(msgs);
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
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__ELEMENTS, CrossWalk.class, msgs);
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
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                return getWalk();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT:
                                if (resolve) return getOutput();
                                return basicGetOutput();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
                                if (resolve) return getMappedFeature();
                                return basicGetMappedFeature();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY:
                                return getConversionStrategy();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE:
                                return getDefaultValue();
                }
                return super.eGet(featureID, resolve, coreType);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                setWalk((CrossWalk)newValue);
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT:
                                setOutput((Output)newValue);
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
                                setMappedFeature((EAttribute)newValue);
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY:
                                setConversionStrategy((ConversionStrategy)newValue);
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE:
                                setDefaultValue((String)newValue);
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
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                setWalk((CrossWalk)null);
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT:
                                unsetOutput();
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
                                setMappedFeature((EAttribute)null);
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY:
                                unsetConversionStrategy();
                                return;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE:
                                unsetDefaultValue();
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
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
                                return getWalk() != null;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT:
                                return isSetOutput();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
                                return mappedFeature != null;
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY:
                                return isSetConversionStrategy();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE:
                                return isSetDefaultValue();
                }
                return super.eIsSet(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
                if (baseClass == Input.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT: return CrosswalkPackage.INPUT__OUTPUT;
                                default: return -1;
                        }
                }
                return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
                if (baseClass == Input.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.INPUT__OUTPUT: return CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT;
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
                result.append(" (defaultValue: ");
                if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
                result.append(')');
                return result.toString();
        }

} // MappedAttributeImpl