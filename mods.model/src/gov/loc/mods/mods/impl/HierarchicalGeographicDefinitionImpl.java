/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.HierarchicalGeographicDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.XsString;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Geographic Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getExtraterrestrialArea <em>Extraterrestrial Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getContinent <em>Continent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getProvince <em>Province</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getTerritory <em>Territory</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getCounty <em>County</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getCitySection <em>City Section</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getIsland <em>Island</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.HierarchicalGeographicDefinitionImpl#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchicalGeographicDefinitionImpl extends EObjectImpl implements HierarchicalGeographicDefinition {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthority()
     * @generated
     * @ordered
     */
    protected static final String AUTHORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthority()
     * @generated
     * @ordered
     */
    protected String authority = AUTHORITY_EDEFAULT;

    /**
     * The default value of the '{@link #getAuthorityURI() <em>Authority URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthorityURI()
     * @generated
     * @ordered
     */
    protected static final String AUTHORITY_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthorityURI() <em>Authority URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthorityURI()
     * @generated
     * @ordered
     */
    protected String authorityURI = AUTHORITY_URI_EDEFAULT;

    /**
     * The default value of the '{@link #getValueURI() <em>Value URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueURI()
     * @generated
     * @ordered
     */
    protected static final String VALUE_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValueURI() <em>Value URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueURI()
     * @generated
     * @ordered
     */
    protected String valueURI = VALUE_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HierarchicalGeographicDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
	if (group == null) {
	    group = new BasicFeatureMap(this, MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP);
	}
	return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getExtraterrestrialArea() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_ExtraterrestrialArea());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getContinent() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getCountry() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getProvince() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getRegion() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getState() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getTerritory() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getCounty() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getCity() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getCitySection() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getIsland() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getArea() {
	return getGroup().list(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthority() {
	return authority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthority(String newAuthority) {
	String oldAuthority = authority;
	authority = newAuthority;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET,
			    MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY, oldAuthority, authority));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthorityURI() {
	return authorityURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthorityURI(String newAuthorityURI) {
	String oldAuthorityURI = authorityURI;
	authorityURI = newAuthorityURI;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET,
			    MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI, oldAuthorityURI,
			    authorityURI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValueURI() {
	return valueURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueURI(String newValueURI) {
	String oldValueURI = valueURI;
	valueURI = newValueURI;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET,
			    MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI, oldValueURI, valueURI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP:
	    return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__EXTRATERRESTRIAL_AREA:
	    return ((InternalEList<?>) getExtraterrestrialArea()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CONTINENT:
	    return ((InternalEList<?>) getContinent()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTRY:
	    return ((InternalEList<?>) getCountry()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__PROVINCE:
	    return ((InternalEList<?>) getProvince()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__REGION:
	    return ((InternalEList<?>) getRegion()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__STATE:
	    return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__TERRITORY:
	    return ((InternalEList<?>) getTerritory()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTY:
	    return ((InternalEList<?>) getCounty()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY:
	    return ((InternalEList<?>) getCity()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY_SECTION:
	    return ((InternalEList<?>) getCitySection()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__ISLAND:
	    return ((InternalEList<?>) getIsland()).basicRemove(otherEnd, msgs);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AREA:
	    return ((InternalEList<?>) getArea()).basicRemove(otherEnd, msgs);
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
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP:
	    if (coreType)
		return getGroup();
	    return ((FeatureMap.Internal) getGroup()).getWrapper();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__EXTRATERRESTRIAL_AREA:
	    return getExtraterrestrialArea();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CONTINENT:
	    return getContinent();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTRY:
	    return getCountry();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__PROVINCE:
	    return getProvince();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__REGION:
	    return getRegion();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__STATE:
	    return getState();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__TERRITORY:
	    return getTerritory();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTY:
	    return getCounty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY:
	    return getCity();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY_SECTION:
	    return getCitySection();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__ISLAND:
	    return getIsland();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AREA:
	    return getArea();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY:
	    return getAuthority();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI:
	    return getAuthorityURI();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI:
	    return getValueURI();
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
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP:
	    ((FeatureMap.Internal) getGroup()).set(newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__EXTRATERRESTRIAL_AREA:
	    getExtraterrestrialArea().clear();
	    getExtraterrestrialArea().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CONTINENT:
	    getContinent().clear();
	    getContinent().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTRY:
	    getCountry().clear();
	    getCountry().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__PROVINCE:
	    getProvince().clear();
	    getProvince().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__REGION:
	    getRegion().clear();
	    getRegion().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__STATE:
	    getState().clear();
	    getState().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__TERRITORY:
	    getTerritory().clear();
	    getTerritory().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTY:
	    getCounty().clear();
	    getCounty().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY:
	    getCity().clear();
	    getCity().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY_SECTION:
	    getCitySection().clear();
	    getCitySection().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__ISLAND:
	    getIsland().clear();
	    getIsland().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AREA:
	    getArea().clear();
	    getArea().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY:
	    setAuthority((String) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI:
	    setAuthorityURI((String) newValue);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI:
	    setValueURI((String) newValue);
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
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP:
	    getGroup().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__EXTRATERRESTRIAL_AREA:
	    getExtraterrestrialArea().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CONTINENT:
	    getContinent().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTRY:
	    getCountry().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__PROVINCE:
	    getProvince().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__REGION:
	    getRegion().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__STATE:
	    getState().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__TERRITORY:
	    getTerritory().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTY:
	    getCounty().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY:
	    getCity().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY_SECTION:
	    getCitySection().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__ISLAND:
	    getIsland().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AREA:
	    getArea().clear();
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY:
	    setAuthority(AUTHORITY_EDEFAULT);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI:
	    setAuthorityURI(AUTHORITY_URI_EDEFAULT);
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI:
	    setValueURI(VALUE_URI_EDEFAULT);
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
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP:
	    return group != null && !group.isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__EXTRATERRESTRIAL_AREA:
	    return !getExtraterrestrialArea().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CONTINENT:
	    return !getContinent().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTRY:
	    return !getCountry().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__PROVINCE:
	    return !getProvince().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__REGION:
	    return !getRegion().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__STATE:
	    return !getState().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__TERRITORY:
	    return !getTerritory().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__COUNTY:
	    return !getCounty().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY:
	    return !getCity().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__CITY_SECTION:
	    return !getCitySection().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__ISLAND:
	    return !getIsland().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AREA:
	    return !getArea().isEmpty();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY:
	    return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI:
	    return AUTHORITY_URI_EDEFAULT == null ? authorityURI != null : !AUTHORITY_URI_EDEFAULT.equals(authorityURI);
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI:
	    return VALUE_URI_EDEFAULT == null ? valueURI != null : !VALUE_URI_EDEFAULT.equals(valueURI);
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
	if (eIsProxy())
	    return super.toString();

	StringBuffer result = new StringBuffer(super.toString());
	result.append(" (group: ");
	result.append(group);
	result.append(", authority: ");
	result.append(authority);
	result.append(", authorityURI: ");
	result.append(authorityURI);
	result.append(", valueURI: ");
	result.append(valueURI);
	result.append(')');
	return result.toString();
    }

} //HierarchicalGeographicDefinitionImpl
