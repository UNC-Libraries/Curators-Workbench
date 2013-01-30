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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.ConversionStrategy;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.MappedAttribute;
import crosswalk.MappingContainer;
import crosswalk.Output;
import crosswalk.util.MappingException;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Mapped Attribute</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getWalk <em>Walk</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getOutput <em>Output</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getMappedFeature <em>Mapped Feature</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getConversionStrategy <em>Conversion Strategy</em>}</li>
 * <li>{@link crosswalk.impl.MappedAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedAttributeImpl extends EObjectImpl implements MappedAttribute {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(MappedAttributeImpl.class);
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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * This is true if the Output reference has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outputESet;

	/**
	 * The cached value of the '{@link #getMappedFeature() <em>Mapped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedFeature()
	 * @generated
	 * @ordered
	 */
	protected EAttribute mappedFeature;

	/**
	 * The cached value of the '{@link #getConversionStrategy() <em>Conversion Strategy</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConversionStrategy()
	 * @generated
	 * @ordered
	 */
	protected ConversionStrategy conversionStrategy;

	/**
	 * This is true if the Conversion Strategy containment reference has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueESet;

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
	 * The default value of the '{@link #isOmittedWhenBlank() <em>Omitted When Blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmittedWhenBlank()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMITTED_WHEN_BLANK_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isOmittedWhenBlank() <em>Omitted When Blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmittedWhenBlank()
	 * @generated
	 * @ordered
	 */
	protected boolean omittedWhenBlank = OMITTED_WHEN_BLANK_EDEFAULT;
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
	public MappingContainer getWalk() {
		if (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__WALK) return null;
		return (MappingContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalk(MappingContainer newWalk, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.MAPPED_ATTRIBUTE__WALK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalk(MappingContainer newWalk) {
		if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.MAPPED_ATTRIBUTE__WALK && newWalk != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__WALK, newWalk, newWalk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__EXCEPTION, oldException, exception));
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionStrategy getConversionStrategy() {
		return conversionStrategy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConversionStrategy() {
		return conversionStrategyESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValue() {
		return defaultValueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmittedWhenBlank() {
		return omittedWhenBlank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmittedWhenBlank(boolean newOmittedWhenBlank) {
		boolean oldOmittedWhenBlank = omittedWhenBlank;
		omittedWhenBlank = newOmittedWhenBlank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAPPED_ATTRIBUTE__OMITTED_WHEN_BLANK, oldOmittedWhenBlank, omittedWhenBlank));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public Class getInputType() {
		Class result = null; // null doesn't equal anything except null
		if (this.isSetConversionStrategy()) {
			result = this.getConversionStrategy().getInputType();
		} else if (this.getMappedFeature() != null) {
			//result = this.getMappedFeature().getEAttributeType().getInstanceClass();
			result = java.lang.String.class;
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
		LOG.debug("my type: " + myAttribute.toString());

		// the value to set
		Object setting = null;
		
		// get default
		if (isSetDefaultValue()) {
			setting = EcoreUtil.createFromString(this.getMappedFeature().getEAttributeType(), getDefaultValue());
		}

		Object input = null;
		Output gen = this.getOutput();
		if (gen != null) {
			try {
				input = gen.getResult();
				if (input != null) {
					if (this.isSetConversionStrategy()) {
						setting = this.getConversionStrategy().convert(input);
					} else if(input instanceof String){
						setting = EcoreUtil.createFromString(this.getMappedFeature().getEAttributeType(), (String)input);
					} else {
						setting = EcoreUtil.createFromString(this.getMappedFeature().getEAttributeType(), input.toString());
					}
					if(setting == null) {
						Throwable e = new MappingException("Cannot convert input to required data type "+this.getMappedFeature().getEAttributeType().getName()+". Input was \""+input+"\"");
						this.getWalk().getExceptions().add(e);
					}
				} else {
					// TODO warning this.getWalk().getExceptions().add(new MappingException("Input was null."));
				}
			} catch (DataException e) {
				// TODO warning here
			}
		}

		// If the value to be set is a blank string, use the default value instead.
		// If there is no default value, use null.
		
		if (setting != null && setting instanceof String && this.isOmittedWhenBlank()) {
			if (((String) setting).length() == 0) {
				if (isSetDefaultValue())
					setting = EcoreUtil.createFromString(this.getMappedFeature().getEAttributeType(), getDefaultValue());
				else
					setting = null;
			}
		}
		
		if (setting != null) {
			record.eSet(myAttribute, setting);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWalk((MappingContainer)otherEnd, msgs);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CrosswalkPackage.MAPPED_ATTRIBUTE__WALK:
				return eInternalContainer().eInverseRemove(this, CrosswalkPackage.MAPPING_CONTAINER__ELEMENTS, MappingContainer.class, msgs);
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
			case CrosswalkPackage.MAPPED_ATTRIBUTE__EXCEPTION:
				return getException();
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
			case CrosswalkPackage.MAPPED_ATTRIBUTE__REQUIRED:
				return isRequired();
			case CrosswalkPackage.MAPPED_ATTRIBUTE__OMITTED_WHEN_BLANK:
				return isOmittedWhenBlank();
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
				setWalk((MappingContainer)newValue);
				return;
			case CrosswalkPackage.MAPPED_ATTRIBUTE__EXCEPTION:
				setException((Throwable)newValue);
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
			case CrosswalkPackage.MAPPED_ATTRIBUTE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CrosswalkPackage.MAPPED_ATTRIBUTE__OMITTED_WHEN_BLANK:
				setOmittedWhenBlank((Boolean)newValue);
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
				setWalk((MappingContainer)null);
				return;
			case CrosswalkPackage.MAPPED_ATTRIBUTE__EXCEPTION:
				setException(EXCEPTION_EDEFAULT);
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
			case CrosswalkPackage.MAPPED_ATTRIBUTE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CrosswalkPackage.MAPPED_ATTRIBUTE__OMITTED_WHEN_BLANK:
				setOmittedWhenBlank(OMITTED_WHEN_BLANK_EDEFAULT);
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
			case CrosswalkPackage.MAPPED_ATTRIBUTE__EXCEPTION:
				return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
			case CrosswalkPackage.MAPPED_ATTRIBUTE__OUTPUT:
				return isSetOutput();
			case CrosswalkPackage.MAPPED_ATTRIBUTE__MAPPED_FEATURE:
				return mappedFeature != null;
			case CrosswalkPackage.MAPPED_ATTRIBUTE__CONVERSION_STRATEGY:
				return isSetConversionStrategy();
			case CrosswalkPackage.MAPPED_ATTRIBUTE__DEFAULT_VALUE:
				return isSetDefaultValue();
			case CrosswalkPackage.MAPPED_ATTRIBUTE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CrosswalkPackage.MAPPED_ATTRIBUTE__OMITTED_WHEN_BLANK:
				return omittedWhenBlank != OMITTED_WHEN_BLANK_EDEFAULT;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exception: ");
		result.append(exception);
		result.append(", defaultValue: ");
		if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
		result.append(", required: ");
		result.append(required);
		result.append(", omittedWhenBlank: ");
		result.append(omittedWhenBlank);
		result.append(')');
		return result.toString();
	}

} // MappedAttributeImpl
