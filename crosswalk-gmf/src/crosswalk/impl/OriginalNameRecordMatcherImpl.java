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

import gov.loc.mets.DivType;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataSource;
import crosswalk.Input;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.Output;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Original Name Record Matcher</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.OriginalNameRecordMatcherImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link crosswalk.impl.OriginalNameRecordMatcherImpl#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link crosswalk.impl.OriginalNameRecordMatcherImpl#isIncludeFileExtension <em>Include File Extension</em>}</li>
 *   <li>{@link crosswalk.impl.OriginalNameRecordMatcherImpl#getBaseFolder <em>Base Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OriginalNameRecordMatcherImpl extends WalkWidgetImpl implements OriginalNameRecordMatcher {
    /**
         * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOutput()
         * @generated
         * @ordered
         */
        protected Output output;

        /**
         * This is true if the Output reference has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean outputESet;

/**
         * The default value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #isCaseSensitive()
         * @generated
         * @ordered
         */
    protected static final boolean CASE_SENSITIVE_EDEFAULT = false;

    /**
         * The cached value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #isCaseSensitive()
         * @generated
         * @ordered
         */
    protected boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

    /**
         * The default value of the '{@link #isIncludeFileExtension() <em>Include File Extension</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #isIncludeFileExtension()
         * @generated
         * @ordered
         */
    protected static final boolean INCLUDE_FILE_EXTENSION_EDEFAULT = false;

    /**
         * The cached value of the '{@link #isIncludeFileExtension() <em>Include File Extension</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #isIncludeFileExtension()
         * @generated
         * @ordered
         */
    protected boolean includeFileExtension = INCLUDE_FILE_EXTENSION_EDEFAULT;

    /**
         * The default value of the '{@link #getBaseFolder() <em>Base Folder</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getBaseFolder()
         * @generated
         * @ordered
         */
    protected static final IFolder BASE_FOLDER_EDEFAULT = null;

    /**
         * The cached value of the '{@link #getBaseFolder() <em>Base Folder</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getBaseFolder()
         * @generated
         * @ordered
         */
    protected IFolder baseFolder = BASE_FOLDER_EDEFAULT;

    /**
     * This is true if the Base Folder attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean baseFolderESet;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected OriginalNameRecordMatcherImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    protected EClass eStaticClass() {
                return CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Output getOutput() {
                if (output != null && output.eIsProxy()) {
                        InternalEObject oldOutput = (InternalEObject)output;
                        output = (Output)eResolveProxy(oldOutput);
                        if (output != oldOutput) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT, oldOutput, output));
                        }
                }
                return output;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Output basicGetOutput() {
                return output;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOutput(Output newOutput) {
                Output oldOutput = output;
                output = newOutput;
                boolean oldOutputESet = outputESet;
                outputESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT, oldOutput, output, !oldOutputESet));
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetOutput() {
                Output oldOutput = output;
                boolean oldOutputESet = outputESet;
                output = null;
                outputESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT, oldOutput, null, oldOutputESet));
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetOutput() {
                return outputESet;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public boolean isCaseSensitive() {
                return caseSensitive;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setCaseSensitive(boolean newCaseSensitive) {
                boolean oldCaseSensitive = caseSensitive;
                caseSensitive = newCaseSensitive;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public boolean isIncludeFileExtension() {
                return includeFileExtension;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setIncludeFileExtension(boolean newIncludeFileExtension) {
                boolean oldIncludeFileExtension = includeFileExtension;
                includeFileExtension = newIncludeFileExtension;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION, oldIncludeFileExtension, includeFileExtension));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public IFolder getBaseFolder() {
                return baseFolder;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setBaseFolder(IFolder newBaseFolder) {
                IFolder oldBaseFolder = baseFolder;
                baseFolder = newBaseFolder;
                boolean oldBaseFolderESet = baseFolderESet;
                baseFolderESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER, oldBaseFolder, baseFolder, !oldBaseFolderESet));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void unsetBaseFolder() {
                IFolder oldBaseFolder = baseFolder;
                boolean oldBaseFolderESet = baseFolderESet;
                baseFolder = BASE_FOLDER_EDEFAULT;
                baseFolderESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER, oldBaseFolder, BASE_FOLDER_EDEFAULT, oldBaseFolderESet));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public boolean isSetBaseFolder() {
                return baseFolderESet;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public EDataType getInputEDataType() {
                return EcorePackage.eINSTANCE.getEString();
        }

/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public RecordMatches getMatches() {
	return recordMatches;
    }

    private RecordMatches recordMatches = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void run() throws DataException {
	MetsType mets = this.getWalk().getMetsSource().getMets();

	System.out.println("Running the original name record matcher.");
	Map<DivType, String> matches = new HashMap<DivType, String>();
	Map<String, Set<DivType>> divPatterns = new HashMap<String, Set<DivType>>();
	Map<String, Set<String>> recordPatterns = new HashMap<String, Set<String>>();

	try {
	    DivType bag = METSUtils.findBagDiv(mets);
	    processMembers(bag, divPatterns);
	} catch (CoreException e) {
	    throw new DataException("There was a problem creating crosswalk match patterns for resources", e);
	}

	DataSource ds = this.getWalk().getDataSource();
	ds.Reset();
	try {
	    processRecord(ds, recordPatterns);
	    while (true) {
		ds.NextRecord();
		processRecord(ds, recordPatterns);
	    }
	} catch (RecordOutOfRangeException e) {
	    // expected
	}

	// find and remove resource collisions
	Map<String, Set<DivType>> divCollisions = new HashMap<String, Set<DivType>>();
	for (Entry<String, Set<DivType>> i : divPatterns.entrySet()) {
	    if (i.getValue().size() > 1) {
		divCollisions.put(i.getKey(), i.getValue());
	    }
	}
	for (String k : divCollisions.keySet()) {
	    divPatterns.remove(k);
	}

	// find and remove record collisions
	Map<String, Set<String>> recordCollisions = new HashMap<String, Set<String>>();
	for (Entry<String, Set<String>> i : recordPatterns.entrySet()) {
	    if (i.getValue().size() > 1) {
		recordCollisions.put(i.getKey(), i.getValue());
	    }
	}
	for (String k : recordCollisions.keySet()) {
	    recordPatterns.remove(k);
	}

	// find matches
	for (Entry<String, Set<DivType>> i : divPatterns.entrySet()) {
	    if (recordPatterns.containsKey(i.getKey())) {
		DivType r = i.getValue().iterator().next();
		String recordID = recordPatterns.get(i.getKey()).iterator().next();
		matches.put(r, recordID);
	    }
	}

	// set RecordMatches
	this.recordMatches = new RecordMatches(matches, recordCollisions, divCollisions);
    }

    /**
     * @param ds
     * @param recordPatterns
     */
    private void processRecord(DataSource ds, Map<String, Set<String>> recordPatterns) {
	String pattern = null;
	try {
	    pattern = (String)this.getOutput().getResult();
	} catch (DataException e) {
	    // expected?
	} catch (NullPointerException e) {
	    // expected sometimes
	}
	if (pattern != null) {
	    if (!this.isCaseSensitive()) {
		pattern = pattern.toLowerCase();
	    }
	    if (!this.includeFileExtension) {
		int idx = pattern.lastIndexOf('.');
		if (idx > 0) {
		    pattern = pattern.substring(0, idx);
		}
	    }
	    String recordID = ds.getRecordID();
	    // System.out.println("processMember( pattern:"+pattern+", "+recordID);
	    if (recordPatterns.containsKey(pattern)) {
		recordPatterns.get(pattern).add(recordID);
	    } else {
		HashSet<String> set = new HashSet<String>();
		set.add(recordID);
		recordPatterns.put(pattern, set);
	    }
	}
    }

    /**
     * @param container
     * @param divPatterns
     */
    private void processMembers(DivType container, Map<String, Set<DivType>> divPatterns) throws CoreException {
	for (DivType div : container.getDiv()) {
	    String pattern = getDivPattern(div);
	    // System.out.println("processMember( pattern:"+pattern+", "+r.toString());
	    if (divPatterns.containsKey(pattern)) {
		divPatterns.get(pattern).add(div);
	    } else {
		Set<DivType> set = new HashSet<DivType>();
		set.add(div);
		divPatterns.put(pattern, set);
	    }
	    processMembers(div, divPatterns);
	}
    }

    /**
     * @param div
     * @return
     */
    private String getDivPattern(DivType div) {
	String result = null;
	if(div.getCONTENTIDS() == null || div.getCONTENTIDS().size() < 1) {
	    return result;
	}
	String uriencoded = div.getCONTENTIDS().get(0);
	try {
	    result = URLDecoder.decode(uriencoded, "utf-8");
	} catch (UnsupportedEncodingException e) {
	    throw new Error(e);
	}
	result = result.substring(result.lastIndexOf("/")+1);
	result = result.substring(result.lastIndexOf("\\")+1);
	if (!this.isIncludeFileExtension()) {
	    // trim extension
	    if (result.contains(".") && !(result.startsWith("."))) {
		result = result.substring(0, result.lastIndexOf("."));
	    }
	}
	if (!this.isCaseSensitive()) {
	    result = result.toLowerCase();
	}
	return result;
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT:
                                if (resolve) return getOutput();
                                return basicGetOutput();
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE:
                                return isCaseSensitive();
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION:
                                return isIncludeFileExtension();
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER:
                                return getBaseFolder();
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
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT:
                                setOutput((Output)newValue);
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE:
                                setCaseSensitive((Boolean)newValue);
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION:
                                setIncludeFileExtension((Boolean)newValue);
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER:
                                setBaseFolder((IFolder)newValue);
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
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT:
                                unsetOutput();
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE:
                                setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION:
                                setIncludeFileExtension(INCLUDE_FILE_EXTENSION_EDEFAULT);
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER:
                                unsetBaseFolder();
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
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT:
                                return isSetOutput();
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE:
                                return caseSensitive != CASE_SENSITIVE_EDEFAULT;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION:
                                return includeFileExtension != INCLUDE_FILE_EXTENSION_EDEFAULT;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER:
                                return isSetBaseFolder();
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
                if (baseClass == Input.class) {
                        switch (derivedFeatureID) {
                                case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT: return CrosswalkPackage.INPUT__OUTPUT;
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
                if (baseClass == Input.class) {
                        switch (baseFeatureID) {
                                case CrosswalkPackage.INPUT__OUTPUT: return CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__OUTPUT;
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
                result.append(" (caseSensitive: ");
                result.append(caseSensitive);
                result.append(", includeFileExtension: ");
                result.append(includeFileExtension);
                result.append(", baseFolder: ");
                if (baseFolderESet) result.append(baseFolder); else result.append("<unset>");
                result.append(')');
                return result.toString();
        }

} // OriginalNameRecordMatcherImpl
