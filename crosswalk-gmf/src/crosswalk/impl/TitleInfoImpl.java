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

import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.XsString;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Input;
import crosswalk.OutputElement;
import crosswalk.StringGenerator;
import crosswalk.StringInput;
import crosswalk.TitleInfo;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Title Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TitleInfoImpl#getWalk <em>Walk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TitleInfoImpl extends InputConsumerImpl implements TitleInfo {

    @Override
    public void updateRecord(EObject record) {
	if (record instanceof ModsDefinition) {
	    ModsDefinition r = (ModsDefinition) record;
	    TitleInfoDefinition titleInfo = MODSFactory.eINSTANCE.createTitleInfoDefinition();
	    for (Input i : this.getInputs()) {
		if (i instanceof StringInput) {
		    StringInput si = (StringInput) i;
		    StringGenerator so = si.getInput();
		    if (so != null) {
			try {
			    String str = so.getResultString();
			    XsString s = MODSFactory.eINSTANCE.createXsString();
			    s.setValue(str);
			    if (stringInputNames[INPUT_TITLE].equals(i.getName())) {
				titleInfo.getTitle().add(s);
			    } else if (stringInputNames[INPUT_SUBTITLE].equals(i.getName())) {
				titleInfo.getSubTitle().add(s);
			    } else if (stringInputNames[INPUT_NONSORT].equals(i.getName())) {
				titleInfo.getNonSort().add(s);
			    } else if (stringInputNames[INPUT_PARTNAME].equals(i.getName())) {
				titleInfo.getPartName().add(s);
			    } else if (stringInputNames[INPUT_PARTNUMBER].equals(i.getName())) {
				titleInfo.getPartNumber().add(s);
			    }
			} catch (DataException e) {
			}
		    }
		}

	    }
	    r.getTitleInfo().add(titleInfo);
	}
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected TitleInfoImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.TITLE_INFO;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.TITLE_INFO__WALK) return null;
                return (CrossWalk)eContainer();
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.TITLE_INFO__WALK, msgs);
                return msgs;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.TITLE_INFO__WALK && newWalk != null)) {
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
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TITLE_INFO__WALK, newWalk, newWalk));
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.TITLE_INFO__WALK:
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
                        case CrosswalkPackage.TITLE_INFO__WALK:
                                return basicSetWalk(null, msgs);
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
                        case CrosswalkPackage.TITLE_INFO__WALK:
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
                        case CrosswalkPackage.TITLE_INFO__WALK:
                                return getWalk();
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
                        case CrosswalkPackage.TITLE_INFO__WALK:
                                setWalk((CrossWalk)newValue);
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
                        case CrosswalkPackage.TITLE_INFO__WALK:
                                setWalk((CrossWalk)null);
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
                        case CrosswalkPackage.TITLE_INFO__WALK:
                                return getWalk() != null;
                }
                return super.eIsSet(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
                if (baseClass == OutputElement.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.TITLE_INFO__WALK: return CrosswalkPackage.OUTPUT_ELEMENT__WALK;
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
                if (baseClass == OutputElement.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.OUTPUT_ELEMENT__WALK: return CrosswalkPackage.TITLE_INFO__WALK;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }

    /* (non-Javadoc)
     * @see crosswalk.impl.InputConsumerImpl#getStringInputNames()
     */
    @Override
    public String[] getStringInputNames() {
	return stringInputNames;
    }

} // TitleInfoImpl
