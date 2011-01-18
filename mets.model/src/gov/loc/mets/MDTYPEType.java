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
package gov.loc.mets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MDTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getMDTYPEType()
 * @model extendedMetaData="name='MDTYPE_._type'"
 * @generated
 */
public enum MDTYPEType implements Enumerator {
        /**
         * The '<em><b>MARC</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #MARC_VALUE
         * @generated
         * @ordered
         */
        MARC(0, "MARC", "MARC"),

        /**
         * The '<em><b>MODS</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #MODS_VALUE
         * @generated
         * @ordered
         */
        MODS(1, "MODS", "MODS"),

        /**
         * The '<em><b>EAD</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #EAD_VALUE
         * @generated
         * @ordered
         */
        EAD(2, "EAD", "EAD"),

        /**
         * The '<em><b>DC</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #DC_VALUE
         * @generated
         * @ordered
         */
        DC(3, "DC", "DC"),

        /**
         * The '<em><b>NISOIMG</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #NISOIMG_VALUE
         * @generated
         * @ordered
         */
        NISOIMG(4, "NISOIMG", "NISOIMG"),

        /**
         * The '<em><b>LCAV</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #LCAV_VALUE
         * @generated
         * @ordered
         */
        LCAV(5, "LCAV", "LC-AV"),

        /**
         * The '<em><b>VRA</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #VRA_VALUE
         * @generated
         * @ordered
         */
        VRA(6, "VRA", "VRA"),

        /**
         * The '<em><b>TEIHDR</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #TEIHDR_VALUE
         * @generated
         * @ordered
         */
        TEIHDR(7, "TEIHDR", "TEIHDR"),

        /**
         * The '<em><b>DDI</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #DDI_VALUE
         * @generated
         * @ordered
         */
        DDI(8, "DDI", "DDI"),

        /**
         * The '<em><b>FGDC</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #FGDC_VALUE
         * @generated
         * @ordered
         */
        FGDC(9, "FGDC", "FGDC"),

        /**
         * The '<em><b>LOM</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #LOM_VALUE
         * @generated
         * @ordered
         */
        LOM(10, "LOM", "LOM"),

        /**
         * The '<em><b>PREMIS</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PREMIS_VALUE
         * @generated
         * @ordered
         */
        PREMIS(11, "PREMIS", "PREMIS"),

        /**
         * The '<em><b>PREMISOBJECT</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PREMISOBJECT_VALUE
         * @generated
         * @ordered
         */
        PREMISOBJECT(12, "PREMISOBJECT", "PREMIS:OBJECT"),

        /**
         * The '<em><b>PREMISAGENT</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PREMISAGENT_VALUE
         * @generated
         * @ordered
         */
        PREMISAGENT(13, "PREMISAGENT", "PREMIS:AGENT"),

        /**
         * The '<em><b>PREMISRIGHTS</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PREMISRIGHTS_VALUE
         * @generated
         * @ordered
         */
        PREMISRIGHTS(14, "PREMISRIGHTS", "PREMIS:RIGHTS"),

        /**
         * The '<em><b>PREMISEVENT</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PREMISEVENT_VALUE
         * @generated
         * @ordered
         */
        PREMISEVENT(15, "PREMISEVENT", "PREMIS:EVENT"),

        /**
         * The '<em><b>TEXTMD</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #TEXTMD_VALUE
         * @generated
         * @ordered
         */
        TEXTMD(16, "TEXTMD", "TEXTMD"),

        /**
         * The '<em><b>METSRIGHTS</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #METSRIGHTS_VALUE
         * @generated
         * @ordered
         */
        METSRIGHTS(17, "METSRIGHTS", "METSRIGHTS"),

        /**
         * The '<em><b>ISO191152003NAP</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #ISO191152003NAP_VALUE
         * @generated
         * @ordered
         */
        ISO191152003NAP(18, "ISO191152003NAP", "ISO 19115:2003 NAP"),

        /**
         * The '<em><b>OTHER</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OTHER_VALUE
         * @generated
         * @ordered
         */
        OTHER(19, "OTHER", "OTHER");

        /**
         * The '<em><b>MARC</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>MARC</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #MARC
         * @model
         * @generated
         * @ordered
         */
        public static final int MARC_VALUE = 0;

        /**
         * The '<em><b>MODS</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>MODS</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #MODS
         * @model
         * @generated
         * @ordered
         */
        public static final int MODS_VALUE = 1;

        /**
         * The '<em><b>EAD</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>EAD</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #EAD
         * @model
         * @generated
         * @ordered
         */
        public static final int EAD_VALUE = 2;

        /**
         * The '<em><b>DC</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>DC</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #DC
         * @model
         * @generated
         * @ordered
         */
        public static final int DC_VALUE = 3;

        /**
         * The '<em><b>NISOIMG</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>NISOIMG</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #NISOIMG
         * @model
         * @generated
         * @ordered
         */
        public static final int NISOIMG_VALUE = 4;

        /**
         * The '<em><b>LCAV</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>LCAV</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #LCAV
         * @model literal="LC-AV"
         * @generated
         * @ordered
         */
        public static final int LCAV_VALUE = 5;

        /**
         * The '<em><b>VRA</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>VRA</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #VRA
         * @model
         * @generated
         * @ordered
         */
        public static final int VRA_VALUE = 6;

        /**
         * The '<em><b>TEIHDR</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>TEIHDR</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #TEIHDR
         * @model
         * @generated
         * @ordered
         */
        public static final int TEIHDR_VALUE = 7;

        /**
         * The '<em><b>DDI</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>DDI</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #DDI
         * @model
         * @generated
         * @ordered
         */
        public static final int DDI_VALUE = 8;

        /**
         * The '<em><b>FGDC</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>FGDC</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #FGDC
         * @model
         * @generated
         * @ordered
         */
        public static final int FGDC_VALUE = 9;

        /**
         * The '<em><b>LOM</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>LOM</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #LOM
         * @model
         * @generated
         * @ordered
         */
        public static final int LOM_VALUE = 10;

        /**
         * The '<em><b>PREMIS</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PREMIS</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PREMIS
         * @model
         * @generated
         * @ordered
         */
        public static final int PREMIS_VALUE = 11;

        /**
         * The '<em><b>PREMISOBJECT</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PREMISOBJECT</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PREMISOBJECT
         * @model literal="PREMIS:OBJECT"
         * @generated
         * @ordered
         */
        public static final int PREMISOBJECT_VALUE = 12;

        /**
         * The '<em><b>PREMISAGENT</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PREMISAGENT</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PREMISAGENT
         * @model literal="PREMIS:AGENT"
         * @generated
         * @ordered
         */
        public static final int PREMISAGENT_VALUE = 13;

        /**
         * The '<em><b>PREMISRIGHTS</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PREMISRIGHTS</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PREMISRIGHTS
         * @model literal="PREMIS:RIGHTS"
         * @generated
         * @ordered
         */
        public static final int PREMISRIGHTS_VALUE = 14;

        /**
         * The '<em><b>PREMISEVENT</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PREMISEVENT</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PREMISEVENT
         * @model literal="PREMIS:EVENT"
         * @generated
         * @ordered
         */
        public static final int PREMISEVENT_VALUE = 15;

        /**
         * The '<em><b>TEXTMD</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>TEXTMD</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #TEXTMD
         * @model
         * @generated
         * @ordered
         */
        public static final int TEXTMD_VALUE = 16;

        /**
         * The '<em><b>METSRIGHTS</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>METSRIGHTS</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #METSRIGHTS
         * @model
         * @generated
         * @ordered
         */
        public static final int METSRIGHTS_VALUE = 17;

        /**
         * The '<em><b>ISO191152003NAP</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>ISO191152003NAP</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #ISO191152003NAP
         * @model literal="ISO 19115:2003 NAP"
         * @generated
         * @ordered
         */
        public static final int ISO191152003NAP_VALUE = 18;

        /**
         * The '<em><b>OTHER</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #OTHER
         * @model
         * @generated
         * @ordered
         */
        public static final int OTHER_VALUE = 19;

        /**
         * An array of all the '<em><b>MDTYPE Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final MDTYPEType[] VALUES_ARRAY =
                new MDTYPEType[] {
                        MARC,
                        MODS,
                        EAD,
                        DC,
                        NISOIMG,
                        LCAV,
                        VRA,
                        TEIHDR,
                        DDI,
                        FGDC,
                        LOM,
                        PREMIS,
                        PREMISOBJECT,
                        PREMISAGENT,
                        PREMISRIGHTS,
                        PREMISEVENT,
                        TEXTMD,
                        METSRIGHTS,
                        ISO191152003NAP,
                        OTHER,
                };

        /**
         * A public read-only list of all the '<em><b>MDTYPE Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<MDTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>MDTYPE Type</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static MDTYPEType get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        MDTYPEType result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>MDTYPE Type</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static MDTYPEType getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        MDTYPEType result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>MDTYPE Type</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static MDTYPEType get(int value) {
                switch (value) {
                        case MARC_VALUE: return MARC;
                        case MODS_VALUE: return MODS;
                        case EAD_VALUE: return EAD;
                        case DC_VALUE: return DC;
                        case NISOIMG_VALUE: return NISOIMG;
                        case LCAV_VALUE: return LCAV;
                        case VRA_VALUE: return VRA;
                        case TEIHDR_VALUE: return TEIHDR;
                        case DDI_VALUE: return DDI;
                        case FGDC_VALUE: return FGDC;
                        case LOM_VALUE: return LOM;
                        case PREMIS_VALUE: return PREMIS;
                        case PREMISOBJECT_VALUE: return PREMISOBJECT;
                        case PREMISAGENT_VALUE: return PREMISAGENT;
                        case PREMISRIGHTS_VALUE: return PREMISRIGHTS;
                        case PREMISEVENT_VALUE: return PREMISEVENT;
                        case TEXTMD_VALUE: return TEXTMD;
                        case METSRIGHTS_VALUE: return METSRIGHTS;
                        case ISO191152003NAP_VALUE: return ISO191152003NAP;
                        case OTHER_VALUE: return OTHER;
                }
                return null;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private final int value;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private final String name;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private final String literal;

        /**
         * Only this class can construct instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private MDTYPEType(int value, String name, String literal) {
                this.value = value;
                this.name = name;
                this.literal = literal;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getValue() {
          return value;
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
        public String getLiteral() {
          return literal;
        }

        /**
         * Returns the literal value of the enumerator, which is its string representation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                return literal;
        }
        
} //MDTYPEType
