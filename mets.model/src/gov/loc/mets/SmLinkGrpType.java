/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sm Link Grp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getSmLocatorLink <em>Sm Locator Link</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getSmArcLink <em>Sm Arc Link</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getARCLINKORDER <em>ARCLINKORDER</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkGrpType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getSmLinkGrpType()
 * @model extendedMetaData="name='smLinkGrp_._type' kind='elementOnly'"
 * @generated
 */
public interface SmLinkGrpType extends EObject {
        /**
         * Returns the value of the '<em><b>Sm Locator Link</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.SmLocatorLinkType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 									The structMap locator link element &lt;smLocatorLink&gt; is of xlink:type "locator".  It provides a means of identifying a &lt;div&gt; element that will participate in one or more of the links specified by means of &lt;smArcLink&gt; elements within the same &lt;smLinkGrp&gt;. The participating &lt;div&gt; element that is represented by the &lt;smLocatorLink&gt; is identified by means of a URI in the associate xlink:href attribute.  The lowest level of this xlink:href URI value should be a fragment identifier that references the ID value that identifies the relevant &lt;div&gt; element.  For example, "xlink:href='#div20'" where "div20" is the ID value that identifies the pertinent &lt;div&gt; in the current METS document. Although not required by the xlink specification, an &lt;smLocatorLink&gt; element will typically include an xlink:label attribute in this context, as the &lt;smArcLink&gt; elements will reference these labels to establish the from and to sides of each arc link.
         * 								
         * <!-- end-model-doc -->
         * @return the value of the '<em>Sm Locator Link</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_SmLocatorLink()
         * @model containment="true" lower="2"
         *        extendedMetaData="kind='element' name='smLocatorLink' namespace='##targetNamespace'"
         * @generated
         */
        EList<SmLocatorLinkType> getSmLocatorLink();

        /**
         * Returns the value of the '<em><b>Sm Arc Link</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.SmArcLinkType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Sm Arc Link</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Sm Arc Link</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_SmArcLink()
         * @model containment="true" required="true"
         *        extendedMetaData="kind='element' name='smArcLink' namespace='##targetNamespace'"
         * @generated
         */
        EList<SmArcLinkType> getSmArcLink();

        /**
         * Returns the value of the '<em><b>ARCLINKORDER</b></em>' attribute.
         * The default value is <code>"unordered"</code>.
         * The literals are from the enumeration {@link gov.loc.mets.ARCLINKORDERType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ARCLINKORDER (enumerated string/O): ARCLINKORDER is used to indicate whether the order of the smArcLink elements aggregated by the smLinkGrp element is significant. If the order is significant, then a value of "ordered" should be supplied.  Value defaults to "unordered" Note that the ARLINKORDER attribute has no xlink specified meaning.
         * <!-- end-model-doc -->
         * @return the value of the '<em>ARCLINKORDER</em>' attribute.
         * @see gov.loc.mets.ARCLINKORDERType
         * @see #isSetARCLINKORDER()
         * @see #unsetARCLINKORDER()
         * @see #setARCLINKORDER(ARCLINKORDERType)
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_ARCLINKORDER()
         * @model default="unordered" unsettable="true"
         *        extendedMetaData="kind='attribute' name='ARCLINKORDER'"
         * @generated
         */
        ARCLINKORDERType getARCLINKORDER();

        /**
         * Sets the value of the '{@link gov.loc.mets.SmLinkGrpType#getARCLINKORDER <em>ARCLINKORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ARCLINKORDER</em>' attribute.
         * @see gov.loc.mets.ARCLINKORDERType
         * @see #isSetARCLINKORDER()
         * @see #unsetARCLINKORDER()
         * @see #getARCLINKORDER()
         * @generated
         */
        void setARCLINKORDER(ARCLINKORDERType value);

        /**
         * Unsets the value of the '{@link gov.loc.mets.SmLinkGrpType#getARCLINKORDER <em>ARCLINKORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetARCLINKORDER()
         * @see #getARCLINKORDER()
         * @see #setARCLINKORDER(ARCLINKORDERType)
         * @generated
         */
        void unsetARCLINKORDER();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.SmLinkGrpType#getARCLINKORDER <em>ARCLINKORDER</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>ARCLINKORDER</em>' attribute is set.
         * @see #unsetARCLINKORDER()
         * @see #getARCLINKORDER()
         * @see #setARCLINKORDER(ARCLINKORDERType)
         * @generated
         */
        boolean isSetARCLINKORDER();

        /**
         * Returns the value of the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>ID</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>ID</em>' attribute.
         * @see #setID(String)
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.SmLinkGrpType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

        /**
         * Returns the value of the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Role</em>' attribute.
         * @see #setRole(String)
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_Role()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
         * @generated
         */
        String getRole();

        /**
         * Sets the value of the '{@link gov.loc.mets.SmLinkGrpType#getRole <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Role</em>' attribute.
         * @see #getRole()
         * @generated
         */
        void setRole(String value);

        /**
         * Returns the value of the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Title</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Title</em>' attribute.
         * @see #setTitle(String)
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_Title()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
         * @generated
         */
        String getTitle();

        /**
         * Sets the value of the '{@link gov.loc.mets.SmLinkGrpType#getTitle <em>Title</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Title</em>' attribute.
         * @see #getTitle()
         * @generated
         */
        void setTitle(String value);

        /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * The default value is <code>"extended"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see #isSetType()
         * @see #unsetType()
         * @see #setType(String)
         * @see gov.loc.mets.MetsPackage#getSmLinkGrpType_Type()
         * @model default="extended" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
         * @generated
         */
        String getType();

        /**
         * Sets the value of the '{@link gov.loc.mets.SmLinkGrpType#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see #isSetType()
         * @see #unsetType()
         * @see #getType()
         * @generated
         */
        void setType(String value);

        /**
         * Unsets the value of the '{@link gov.loc.mets.SmLinkGrpType#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetType()
         * @see #getType()
         * @see #setType(String)
         * @generated
         */
        void unsetType();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.SmLinkGrpType#getType <em>Type</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Type</em>' attribute is set.
         * @see #unsetType()
         * @see #getType()
         * @see #setType(String)
         * @generated
         */
        boolean isSetType();

} // SmLinkGrpType
