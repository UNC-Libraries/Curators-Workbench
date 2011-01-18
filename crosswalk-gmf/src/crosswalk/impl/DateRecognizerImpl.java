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

import crosswalk.CrossWalk;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DateGenerator;
import crosswalk.DateRecognizer;
import crosswalk.WalkWidget;
import crosswalk.Input;
import crosswalk.StringGenerator;
import crosswalk.StringInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Recognizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.DateRecognizerImpl#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.impl.DateRecognizerImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateRecognizerImpl extends InputConsumerImpl implements DateRecognizer {
    private static final SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat inFormat = null;

    	/**
         * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFormat()
         * @generated
         * @ordered
         */
        protected static final String FORMAT_EDEFAULT = "yy-MM-dd";
        /**
         * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFormat()
         * @generated
         * @ordered
         */
        protected String format = FORMAT_EDEFAULT;
        private static String[] inputNames = {"input"};
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DateRecognizerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.DATE_RECOGNIZER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrossWalk getWalk() {
                if (eContainerFeatureID() != CrosswalkPackage.DATE_RECOGNIZER__WALK) return null;
                return (CrossWalk)eContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetWalk(CrossWalk newWalk, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newWalk, CrosswalkPackage.DATE_RECOGNIZER__WALK, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWalk(CrossWalk newWalk) {
                if (newWalk != eInternalContainer() || (eContainerFeatureID() != CrosswalkPackage.DATE_RECOGNIZER__WALK && newWalk != null)) {
                        if (EcoreUtil.isAncestor(this, newWalk))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newWalk != null)
                                msgs = ((InternalEObject)newWalk).eInverseAdd(this, CrosswalkPackage.CROSS_WALK__WIDGETS, CrossWalk.class, msgs);
                        msgs = basicSetWalk(newWalk, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_RECOGNIZER__WALK, newWalk, newWalk));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getFormat() {
                return format;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public void setFormat(String newFormat) {
                String oldFormat = format;
                format = newFormat;
                initFormat();
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_RECOGNIZER__FORMAT, oldFormat, format));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public String getResultString() throws DataException {
            String result = null;
            String inValue = null;
            if(this.getInputs().size() > 0) {
        	Input in = getInputs().get(0);
        	if(in != null && in instanceof StringInput) {
        	    StringGenerator sg = ((StringInput)in).getInput();
        	    if(sg != null) {
        		inValue = sg.getResultString();
        	    }
        	}
            }
            if(inValue != null) {
        	if(inFormat == null) {
        	    initFormat();
        	}
        	try {
		    Date d = inFormat.parse(inValue);
		    result = isoFormat.format(d);
		} catch (ParseException e) {
		}
            }
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetWalk((CrossWalk)otherEnd, msgs);
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
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
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
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
                                return eInternalContainer().eInverseRemove(this, CrosswalkPackage.CROSS_WALK__WIDGETS, CrossWalk.class, msgs);
                }
                return super.eBasicRemoveFromContainerFeature(msgs);
        }

        private void initFormat() {
            this.inFormat = new SimpleDateFormat(this.getFormat());
        }

	/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
                                return getWalk();
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                return getFormat();
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
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
                                setWalk((CrossWalk)newValue);
                                return;
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                setFormat((String)newValue);
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
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
                                setWalk((CrossWalk)null);
                                return;
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                setFormat(FORMAT_EDEFAULT);
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
                        case CrosswalkPackage.DATE_RECOGNIZER__WALK:
                                return getWalk() != null;
                        case CrosswalkPackage.DATE_RECOGNIZER__FORMAT:
                                return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
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
                if (baseClass == DateGenerator.class) {
                        switch (derivedFeatureID) {
                                default: return -1;
                        }
                }
                if (baseClass == WalkWidget.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.DATE_RECOGNIZER__WALK: return CrosswalkPackage.WALK_WIDGET__WALK;
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
                if (baseClass == DateGenerator.class) {
                        switch (baseFeatureID) {
                                default: return -1;
                        }
                }
                if (baseClass == WalkWidget.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.WALK_WIDGET__WALK: return CrosswalkPackage.DATE_RECOGNIZER__WALK;
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
                result.append(" (Format: ");
                result.append(format);
                result.append(')');
                return result.toString();
        }

        /* (non-Javadoc)
	 * @see crosswalk.impl.InputConsumerImpl#getStringInputNames()
	 */
	@Override
	public String[] getStringInputNames() {
	    return inputNames;
	}

} //DateRecognizerImpl
