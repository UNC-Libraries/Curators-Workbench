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
 * A representation of the model object '<em><b>Agent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.AgentType#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mets.AgentType#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mets.AgentType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.AgentType#getOTHERROLE <em>OTHERROLE</em>}</li>
 *   <li>{@link gov.loc.mets.AgentType#getOTHERTYPE <em>OTHERTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.AgentType#getROLE <em>ROLE</em>}</li>
 *   <li>{@link gov.loc.mets.AgentType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getAgentType()
 * @model extendedMetaData="name='agent_._type' kind='elementOnly'"
 * @generated
 */
public interface AgentType extends EObject {
        /**
         * Returns the value of the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 											The element &lt;name&gt; can be used to record the full name of the document agent.
         * 											
         * <!-- end-model-doc -->
         * @return the value of the '<em>Name</em>' attribute.
         * @see #setName(String)
         * @see gov.loc.mets.MetsPackage#getAgentType_Name()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link gov.loc.mets.AgentType#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Note</b></em>' attribute list.
         * The list contents are of type {@link java.lang.String}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 											The &lt;note&gt; element can be used to record any additional information regarding the agent's activities with respect to the METS document.
         * 											
         * <!-- end-model-doc -->
         * @return the value of the '<em>Note</em>' attribute list.
         * @see gov.loc.mets.MetsPackage#getAgentType_Note()
         * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
         * @generated
         */
        EList<String> getNote();

        /**
         * Returns the value of the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ID (ID/O): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
         * 										
         * <!-- end-model-doc -->
         * @return the value of the '<em>ID</em>' attribute.
         * @see #setID(String)
         * @see gov.loc.mets.MetsPackage#getAgentType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.AgentType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

        /**
         * Returns the value of the '<em><b>OTHERROLE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * OTHERROLE (string/O): Denotes a role not contained in the allowed values set if OTHER is indicated in the ROLE attribute.
         * 										
         * <!-- end-model-doc -->
         * @return the value of the '<em>OTHERROLE</em>' attribute.
         * @see #setOTHERROLE(String)
         * @see gov.loc.mets.MetsPackage#getAgentType_OTHERROLE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='OTHERROLE'"
         * @generated
         */
        String getOTHERROLE();

        /**
         * Sets the value of the '{@link gov.loc.mets.AgentType#getOTHERROLE <em>OTHERROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>OTHERROLE</em>' attribute.
         * @see #getOTHERROLE()
         * @generated
         */
        void setOTHERROLE(String value);

        /**
         * Returns the value of the '<em><b>OTHERTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * OTHERTYPE (string/O): Specifies the type of agent when the value OTHER is indicated in the TYPE attribute.
         * 										
         * <!-- end-model-doc -->
         * @return the value of the '<em>OTHERTYPE</em>' attribute.
         * @see #setOTHERTYPE(String)
         * @see gov.loc.mets.MetsPackage#getAgentType_OTHERTYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='OTHERTYPE'"
         * @generated
         */
        String getOTHERTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.AgentType#getOTHERTYPE <em>OTHERTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>OTHERTYPE</em>' attribute.
         * @see #getOTHERTYPE()
         * @generated
         */
        void setOTHERTYPE(String value);

        /**
         * Returns the value of the '<em><b>ROLE</b></em>' attribute.
         * The literals are from the enumeration {@link gov.loc.mets.ROLEType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ROLE (string/R): Specifies the function of the agent with respect to the METS record. The allowed values are:
         * CREATOR: The person(s) or institution(s) responsible for the METS document.
         * EDITOR: The person(s) or institution(s) that prepares the metadata for encoding.
         * ARCHIVIST: The person(s) or institution(s) responsible for the document/collection.
         * PRESERVATION: The person(s) or institution(s) responsible for preservation functions.
         * DISSEMINATOR: The person(s) or institution(s) responsible for dissemination functions.
         * CUSTODIAN: The person(s) or institution(s) charged with the oversight of a document/collection.
         * IPOWNER: Intellectual Property Owner: The person(s) or institution holding copyright, trade or service marks or other intellectual property rights for the object.
         * OTHER: Use OTHER if none of the preceding values pertains and clarify the type and location specifier being used in the OTHERROLE attribute (see below).
         * 										
         * <!-- end-model-doc -->
         * @return the value of the '<em>ROLE</em>' attribute.
         * @see gov.loc.mets.ROLEType
         * @see #isSetROLE()
         * @see #unsetROLE()
         * @see #setROLE(ROLEType)
         * @see gov.loc.mets.MetsPackage#getAgentType_ROLE()
         * @model unsettable="true" required="true"
         *        extendedMetaData="kind='attribute' name='ROLE'"
         * @generated
         */
        ROLEType getROLE();

        /**
         * Sets the value of the '{@link gov.loc.mets.AgentType#getROLE <em>ROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ROLE</em>' attribute.
         * @see gov.loc.mets.ROLEType
         * @see #isSetROLE()
         * @see #unsetROLE()
         * @see #getROLE()
         * @generated
         */
        void setROLE(ROLEType value);

        /**
         * Unsets the value of the '{@link gov.loc.mets.AgentType#getROLE <em>ROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetROLE()
         * @see #getROLE()
         * @see #setROLE(ROLEType)
         * @generated
         */
        void unsetROLE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.AgentType#getROLE <em>ROLE</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>ROLE</em>' attribute is set.
         * @see #unsetROLE()
         * @see #getROLE()
         * @see #setROLE(ROLEType)
         * @generated
         */
        boolean isSetROLE();

        /**
         * Returns the value of the '<em><b>TYPE</b></em>' attribute.
         * The literals are from the enumeration {@link gov.loc.mets.TYPEType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * TYPE (string/O): is used to specify the type of AGENT. It must be one of the following values:
         * INDIVIDUAL: Use if an individual has served as the agent.
         * ORGANIZATION: Use if an institution, corporate body, association, non-profit enterprise, government, religious body, etc. has served as the agent.
         * OTHER: Use OTHER if none of the preceding values pertain and clarify the type of agent specifier being used in the OTHERTYPE attribute
         * 										
         * <!-- end-model-doc -->
         * @return the value of the '<em>TYPE</em>' attribute.
         * @see gov.loc.mets.TYPEType
         * @see #isSetTYPE()
         * @see #unsetTYPE()
         * @see #setTYPE(TYPEType)
         * @see gov.loc.mets.MetsPackage#getAgentType_TYPE()
         * @model unsettable="true"
         *        extendedMetaData="kind='attribute' name='TYPE'"
         * @generated
         */
        TYPEType getTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.AgentType#getTYPE <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>TYPE</em>' attribute.
         * @see gov.loc.mets.TYPEType
         * @see #isSetTYPE()
         * @see #unsetTYPE()
         * @see #getTYPE()
         * @generated
         */
        void setTYPE(TYPEType value);

        /**
         * Unsets the value of the '{@link gov.loc.mets.AgentType#getTYPE <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetTYPE()
         * @see #getTYPE()
         * @see #setTYPE(TYPEType)
         * @generated
         */
        void unsetTYPE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.AgentType#getTYPE <em>TYPE</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>TYPE</em>' attribute is set.
         * @see #unsetTYPE()
         * @see #getTYPE()
         * @see #setTYPE(TYPEType)
         * @generated
         */
        boolean isSetTYPE();

} // AgentType
